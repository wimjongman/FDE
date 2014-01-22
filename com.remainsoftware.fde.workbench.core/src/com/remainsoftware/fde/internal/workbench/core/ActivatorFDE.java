package com.remainsoftware.fde.internal.workbench.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class ActivatorFDE implements BundleActivator {

	ExecutorService threadPool = Executors.newFixedThreadPool(10);

	@Override
	public void start(final BundleContext context) throws Exception {
		threadPool.execute(new Runnable() {

			@Override
			public void run() {

				IExtensionRegistry registry = getService(context, IExtensionRegistry.class);

				ServiceReference<?>[] allServiceReferences;
				try {
					allServiceReferences = context.getAllServiceReferences(null, null);
					for (ServiceReference<?> serviceReference : allServiceReferences) {

						String[] classes = ((String[]) serviceReference.getProperty("objectClass"));
						for (String string : classes) {
							if (string.contains("e4"))
								System.out.println(string);
						}
					}
				} catch (InvalidSyntaxException e) {
				}

				IConfigurationElement[] elements = registry.getConfigurationElementsFor(context
						.getBundle().getSymbolicName() + ".modelimport");
				for (IConfigurationElement element : elements) {
					System.out.println(element.getAttribute("modelURI"));
					System.out.println(element.getAttribute("modelId"));
					System.out.println(element.getAttribute("reparentId"));
					MUIElement muiElement = ApplicationModelUtil.loadModel(
							element.getAttribute("modelURI"), element.getAttribute("modelId"),
							registry);
					IWorkbench model = getService(context, IWorkbench.class);
					EModelService modelService = model.getApplication().getContext()
							.get(EModelService.class);
					MUIElement parentElement = modelService.find(
							element.getAttribute("reparentId"), model.getApplication());
					if (parentElement instanceof MElementContainer) {
						MElementContainer cont = (MElementContainer) parentElement;
						cont.getChildren().add(muiElement);
					}
				}
			}
		});
	}

	public <T> T getService(BundleContext context, Class<T> clazz) {
		ServiceReference<T> serviceReference = context.getServiceReference(clazz);
		return context.getService(serviceReference);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
