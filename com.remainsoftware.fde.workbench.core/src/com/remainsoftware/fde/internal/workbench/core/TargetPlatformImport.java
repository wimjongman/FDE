package com.remainsoftware.fde.internal.workbench.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.target.ITargetDefinition;
import org.eclipse.pde.core.target.ITargetPlatformService;
import org.eclipse.pde.core.target.TargetFeature;
import org.eclipse.pde.internal.core.target.TargetPlatformService;

import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.Version;
import com.remainsoftware.fde.model.impl.ImportServiceImpl;

public class TargetPlatformImport extends ImportServiceImpl {

	@Override
	public void doImport(Version version) {
		version.getFeatures().clear();

		try {
			ITargetPlatformService service = TargetPlatformService.getDefault();
			ITargetDefinition targetDefinition = service.getWorkspaceTargetDefinition();
			TargetFeature[] allFeatures = targetDefinition.getAllFeatures();
			for (TargetFeature targetFeature : allFeatures) {
				Feature feature = ModelFactory.eINSTANCE.createFeature();
				feature.setId(targetFeature.getId());
				version.getFeatures().add(feature);
				System.out.println(feature.getId());
			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "Target Platform Import";
	}
}
