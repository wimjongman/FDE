/**
 */
package com.remainsoftware.fde.model.provider;


import java.util.Collection;
import java.util.List;

import com.remainsoftware.fde.model.IncludedBundleOrFragment;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.remainsoftware.fde.model.IncludedBundleOrFragment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludedBundleOrFragmentItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedBundleOrFragmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
			addDownloadSizePropertyDescriptor(object);
			addInstallationSizePropertyDescriptor(object);
			addUnpackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedBundleOrFragment_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedBundleOrFragment_version_feature", "_UI_IncludedBundleOrFragment_type"),
				 ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Download Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDownloadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedBundleOrFragment_downloadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedBundleOrFragment_downloadSize_feature", "_UI_IncludedBundleOrFragment_type"),
				 ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Installation Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstallationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedBundleOrFragment_installationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedBundleOrFragment_installationSize_feature", "_UI_IncludedBundleOrFragment_type"),
				 ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unpack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnpackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedBundleOrFragment_unpack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedBundleOrFragment_unpack_feature", "_UI_IncludedBundleOrFragment_type"),
				 ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED);
			childrenFeatures.add(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__BREE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IncludedBundleOrFragment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IncludedBundleOrFragment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IncludedBundleOrFragment)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_IncludedBundleOrFragment_type") :
			getString("_UI_IncludedBundleOrFragment_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IncludedBundleOrFragment.class)) {
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__VERSION:
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE:
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE:
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED:
			case ModelPackage.INCLUDED_BUNDLE_OR_FRAGMENT__BREE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED,
				 ModelFactory.eINSTANCE.createManifest()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED,
				 ModelFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED,
				 ModelFactory.eINSTANCE.createBundle()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__INCLUDED,
				 ModelFactory.eINSTANCE.createFragment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.INCLUDED_BUNDLE_OR_FRAGMENT__BREE,
				 ModelFactory.eINSTANCE.createBREE()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FdeEditPlugin.INSTANCE;
	}

}
