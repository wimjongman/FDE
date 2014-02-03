package com.remainsoftware.fde.internal.ui.parts;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;

import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.Version;

public class FeatureModelView {
	private Combo text;
	private TreeViewer treeViewer;

	@Inject
	Shell shell;
	@Inject
	IEclipseContext context;
	private Resource resource;

	@Inject
	public FeatureModelView() {
		ModelPackage modelPackage = ModelFactory.eINSTANCE.getModelPackage();
		ResourceSetImpl resourceSetI = new ResourceSetImpl();
		resourceSetI.getPackageRegistry().put(modelPackage.getNsURI(), modelPackage);
	}

	@PostConstruct
	public void postConstruct(Composite parent, EMenuService menuService) {
		parent.setLayout(new GridLayout(2, false));

		text = new Combo(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.add("http://dl.dropboxusercontent.com/u/5004102/My.model");
		text.add("file://C:/Users/jongw/Dropbox/Public/My.model");

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setInput(e);
			}
		});
		btnNewButton.setText("Load Model");

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		composite.setLayout(new TreeColumnLayout());

		treeViewer = new TreeViewer(composite, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLinesVisible(true);

		ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				composedAdapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				composedAdapterFactory);

		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setContentProvider(contentProvider);

		menuService.registerContextMenu(treeViewer.getControl(),
				"com.remainsoftware.fde.application.part.0.popupmenu.0");

		context.modify(Viewer.class, treeViewer);

	}

	protected void setInput(SelectionEvent event) {
		try {
			if (resource != null && resource.isLoaded())
				resource.unload();

			URI uri = URI.createURI(text.getText());
			XMIResourceFactoryImpl c = new XMIResourceFactoryImpl();
			resource = c.createResource(URI.createURI(uri.toString()));
			try {
				resource.load(null);
				Version version = (Version) resource.getAllContents().next();
				context.modify(Version.class, version);
				treeViewer.setInput(version);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			MessageDialog.openError(shell, "Invalid URI",
					"Please provide a valid URI\n\n (" + e.getMessage() + ")");
		}
	}

	@Persist
	public void save() {
	}

}
