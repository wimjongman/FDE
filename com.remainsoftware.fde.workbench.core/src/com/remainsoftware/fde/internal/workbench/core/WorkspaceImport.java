package com.remainsoftware.fde.internal.workbench.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ifeature.IFeature;
import org.eclipse.pde.internal.core.ifeature.IFeatureModel;
import org.eclipse.pde.internal.core.ifeature.IFeaturePlugin;

import com.remainsoftware.fde.model.ARCH;
import com.remainsoftware.fde.model.BREE;
import com.remainsoftware.fde.model.Bundle;
import com.remainsoftware.fde.model.Description;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.Fragment;
import com.remainsoftware.fde.model.IncludedBundleOrFragment;
import com.remainsoftware.fde.model.LicenseAgreement;
import com.remainsoftware.fde.model.Manifest;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.OS;
import com.remainsoftware.fde.model.Version;
import com.remainsoftware.fde.model.WS;
import com.remainsoftware.fde.model.impl.ImportServiceImpl;

public class WorkspaceImport extends ImportServiceImpl {

	@Override
	public void doImport(Version version) {

		version.getBundles().clear();
		version.getFeatures().clear();
		version.getFragments().clear();

		version.getFeatures().clear();
		IProject[] projects = PDECore.getWorkspace().getRoot().getProjects();

		IFeatureModel[] featureModels = PDECore.getDefault().getFeatureModelManager()
				.getWorkspaceModels();
		for (IFeatureModel featureModel : featureModels) {
			loadFeature(version, featureModel.getFeature());

		}

		IPluginModelBase[] workspaceModels = PDECore.getDefault().getModelManager()
				.getWorkspaceModels();
		for (IPluginModelBase model : workspaceModels) {
			loadBundle(version, model.getPluginBase());
		}
	}

	private void loadBundle(Version version, IPluginBase pluginBase) {
		Bundle bundle = addBundle(version, pluginBase.getId());
	}

	private void loadFeature(Version version, IFeature PDEfeature) {
		Feature feature = ModelFactory.eINSTANCE.createFeature();
		feature.setId(PDEfeature.getId());
		feature.setName(PDEfeature.getTranslatableLabel());
		feature.setVendor(PDEfeature.getProviderName());
		feature.setFeatureDescription(getDescription(PDEfeature, feature, IFeature.INFO_DESCRIPTION));
		feature.setCopyrightNotice(getDescription(PDEfeature, feature, IFeature.INFO_COPYRIGHT));
		feature.setLicenseAgreement(getLicenseAgreement(PDEfeature, feature, IFeature.INFO_LICENSE));
		version.getFeatures().add(feature);
		addFeaturePlugins(version, feature, PDEfeature.getPlugins());
	}

	private void addFeaturePlugins(Version version, Feature feature, IFeaturePlugin[] plugins) {
		for (IFeaturePlugin plugin : plugins) {

			IncludedBundleOrFragment includedBundleOrFragment = ModelFactory.eINSTANCE
					.createIncludedBundleOrFragment();

			Bundle theBundle = null;
			if (plugin.isFragment())
				theBundle = addFragment(version, plugin.getId());
			else
				theBundle = addBundle(version, plugin.getId());

			includedBundleOrFragment.setBundleOrFragment(theBundle);
			includedBundleOrFragment.setDownloadSize((int) plugin.getDownloadSize());
			includedBundleOrFragment.setVersion(plugin.getVersion());
			includedBundleOrFragment.setUnpack(false);
			BREE bree = ModelFactory.eINSTANCE.createBREE();
			if (plugin.getArch() != null) {
				String[] archs = plugin.getArch().split(",");
				for (String arch : archs) {
					bree.getArchitecture().add(ARCH.getByName(arch));
				}
			}
			if (plugin.getWS() != null) {
				String[] wss = plugin.getWS().split(",");
				for (String ws : wss) {
					bree.getWindowingSystem().add(WS.getByName(ws));
				}
			}
			if (plugin.getOS() != null) {
				String[] oss = plugin.getOS().split(",");
				for (String os : oss) {
					bree.getOperatingSystem().add(OS.getByName(os));
				}
			}
			includedBundleOrFragment.setBree(bree);

			feature.getIncludedBundlesAndFragments().add(includedBundleOrFragment);
		}

	}

	private Bundle addBundle(Version version, String id) {
		Manifest manifest = version.findManifest(id);
		if (manifest != null) {
			if (manifest instanceof Bundle)
				return (Bundle) manifest;
			else
				return null;
		}
		Bundle bundle = ModelFactory.eINSTANCE.createBundle();
		IPluginModelBase entry = PDECore.getDefault().getModelManager().findModel(id);
		BundleDescription bundleDescription = entry.getBundleDescription();
		bundle.setId(id);
		bundle.setName(bundleDescription.getName());
		bundle.setVendor(bundleDescription.getSupplier().getName());
		bundle.setVersion(bundleDescription.getVersion().toString());
		version.getBundles().add(bundle);
		return bundle;
	}

	private Fragment addFragment(Version version, String Id) {
		Manifest manifest = version.findManifest(Id);
		if (manifest != null) {
			if (manifest instanceof Fragment)
				return (Fragment) manifest;
			else
				return null;
		}
		IPluginModelBase entry = PDECore.getDefault().getModelManager().findModel(Id);

		BundleDescription bundleDescription = entry.getBundleDescription().getHost().getBundle();
		Bundle bundle = addBundle(version, bundleDescription.getSymbolicName());

		Fragment fragment = ModelFactory.eINSTANCE.createFragment();
		fragment.setId(bundleDescription.getSymbolicName());
		fragment.setName(bundleDescription.getName());
		fragment.setParentBundle(bundle);
		fragment.setVendor(bundleDescription.getSupplier().getName());
		fragment.setVersion(bundleDescription.getVersion().toString());
		version.getFragments().add(fragment);
		return fragment;
	}

	private Description getDescription(IFeature PDEfeature, Feature feature, int info) {
		Description description = ModelFactory.eINSTANCE.createDescription();
		description.setDescription(PDEfeature.getFeatureInfo(info).getDescription());
		description.setUrl(PDEfeature.getFeatureInfo(info).getURL());
		return description;
	}

	private LicenseAgreement getLicenseAgreement(IFeature PDEfeature, Feature feature, int info) {
		LicenseAgreement agreement = ModelFactory.eINSTANCE.createLicenseAgreement();
		agreement.setDescription(PDEfeature.getFeatureInfo(info).getDescription());
		agreement.setUrl(PDEfeature.getFeatureInfo(info).getURL());
		return agreement;
	}

	@Override
	public String getName() {
		return "Workspace Import";
	}
}
