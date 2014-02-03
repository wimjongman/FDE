package com.remainsoftware.fde.internal.ui.parts;

import java.util.Collection;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.jface.viewers.Viewer;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import com.remainsoftware.fde.model.ImportService;
import com.remainsoftware.fde.model.Version;

public class RunImportHandler {

	@Execute
	public void execute(MDirectMenuItem item, Version version, Viewer viewer)
			throws InvalidSyntaxException {
		System.out.println(viewer.getSelection());
		BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
		Collection<ServiceReference<ImportService>> references = bc.getServiceReferences(
				ImportService.class, null);
		for (ServiceReference<ImportService> ref : references) {
			ImportService service = bc.getService(ref);
			if (service.getClass().getName().equals(item.getPersistedState().get("service"))) {
				service.doImport(version);
				viewer.refresh();
				break;
			}
		}
	}
}
