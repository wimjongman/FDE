package com.remainsoftware.fde.internal.ui.parts;

import java.util.Collection;
import java.util.List;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import com.remainsoftware.fde.model.ImportService;

public class DynamicImportMenu {

	@AboutToShow
	public void aboutToShow(Shell shell, List<MMenuElement> items, IEclipseContext context) {

		try {
			BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
			Collection<ServiceReference<ImportService>> serviceReferences = bc
					.getServiceReferences(ImportService.class, null);
			for (ServiceReference<ImportService> ref : serviceReferences) {
				MDirectMenuItem dynamicItem = MMenuFactory.INSTANCE.createDirectMenuItem();
				ImportService importService = bc.getService(ref);
				dynamicItem.setLabel(importService.getName());
				dynamicItem.setContributorURI("platform:/plugin/"
						+ ref.getBundle().getSymbolicName());
				dynamicItem.setContributionURI("bundleclass://" + bc.getBundle().getSymbolicName()
						+ "/" + RunImportHandler.class.getName());
				dynamicItem.getPersistedState().put("service", importService.getClass().getName());
				items.add(dynamicItem);
			}

		} catch (InvalidSyntaxException e) {
			MessageDialog.openWarning(shell, "Warning", e.getMessage());
		}
	}

}
