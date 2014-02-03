package com.remainsoftware.fde.internal.workbench.core;

import org.eclipse.core.runtime.IBundleGroup;
import org.eclipse.core.runtime.IBundleGroupProvider;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import com.remainsoftware.fde.model.Description;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.Version;
import com.remainsoftware.fde.model.impl.ImportServiceImpl;

public class RunningEclipseImport extends ImportServiceImpl {

	@Override
	public void doImport(Version version) {

		version.getFeatures().clear();
		version.getBundles().clear();
		IBundleGroupProvider[] features = Platform.getBundleGroupProviders();
		for (IBundleGroupProvider bgProvider : features) {
			loadFeatures(version, bgProvider.getBundleGroups());
		}
	}

	private void loadFeatures(Version version, IBundleGroup[] bundleGroups) {
		for (IBundleGroup bundlegroup : bundleGroups) {
			Feature feature = ModelFactory.eINSTANCE.createFeature();
			feature.setId(bundlegroup.getIdentifier());
			feature.setName(bundlegroup.getName());
			feature.setVendor(bundlegroup.getProviderName());
			Description description = ModelFactory.eINSTANCE.createDescription();
			description.setDescription(bundlegroup.getDescription());
			feature.setFeatureDescription(description);
			version.getFeatures().add(feature);
			loadBundles(bundlegroup, feature, version, bundlegroup.getBundles());
		}

	}

	private void loadBundles(IBundleGroup bundlegroup, Feature feature, Version version,
			Bundle[] bundles) {

		for (Bundle bundle : bundles) {
			com.remainsoftware.fde.model.Bundle fbundle = ModelFactory.eINSTANCE.createBundle();
			fbundle.setId(bundle.getSymbolicName());
			fbundle.setName(bundle.getHeaders().get("Bundle-Name"));
			fbundle.setVersion(bundle.getHeaders().get("Bundle-Version"));
			fbundle.setVendor(bundle.getHeaders().get("Bundle-Vendor"));
			version.getBundles().add(fbundle);
		}
	}

	@Override
	public String getName() {
		return "Import from running Eclipse";
	}
}
