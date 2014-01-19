package com.remainsoftware.fde.internal.ui.parts;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.ModelPackage;

class FeatureModelContentProvider implements ITreeContentProvider {

	private Resource resource;

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		ModelPackage modelPackage = ModelFactory.eINSTANCE.getModelPackage();
		ResourceSetImpl resourceSetI = new ResourceSetImpl();
		resourceSetI.getPackageRegistry().put(modelPackage.getNsURI(),
				modelPackage);
		XMIResourceFactoryImpl c = new XMIResourceFactoryImpl();
		resource = c.createResource(URI.createURI(newInput.toString()));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dispose() {
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public Object[] getChildren(Object parentElement) {
		return new Object[] { "item_0", "item_1", "item_2" };
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
}