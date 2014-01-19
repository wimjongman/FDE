/**
 */
package com.remainsoftware.fde.model.provider;


import java.util.Collection;
import java.util.List;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.ModelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.remainsoftware.fde.model.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider
	extends ManifestItemProvider
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
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addFeatureDescriptionPropertyDescriptor(object);
			addCopyrightNoticePropertyDescriptor(object);
			addLicenseAgreementPropertyDescriptor(object);
			addSitesToVisitPropertyDescriptor(object);
			addIncludedBundlesAndFragmentsPropertyDescriptor(object);
			addIncludedFeaturesPropertyDescriptor(object);
			addRequiredFeaturesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_featureDescription_feature"),
				 getString("_UI_Feature_featureDescription_description"),
				 ModelPackage.Literals.FEATURE__FEATURE_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright Notice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightNoticePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_copyrightNotice_feature"),
				 getString("_UI_Feature_copyrightNotice_description"),
				 ModelPackage.Literals.FEATURE__COPYRIGHT_NOTICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License Agreement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicenseAgreementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_licenseAgreement_feature"),
				 getString("_UI_Feature_licenseAgreement_description"),
				 ModelPackage.Literals.FEATURE__LICENSE_AGREEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sites To Visit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSitesToVisitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_sitesToVisit_feature"),
				 getString("_UI_Feature_sitesToVisit_description"),
				 ModelPackage.Literals.FEATURE__SITES_TO_VISIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Included Bundles And Fragments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludedBundlesAndFragmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_includedBundlesAndFragments_feature"),
				 getString("_UI_Feature_includedBundlesAndFragments_description"),
				 ModelPackage.Literals.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Included Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludedFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_includedFeatures_feature"),
				 getString("_UI_Feature_includedFeatures_description"),
				 ModelPackage.Literals.FEATURE__INCLUDED_FEATURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_requiredFeatures_feature"),
				 getString("_UI_Feature_requiredFeatures_description"),
				 ModelPackage.Literals.FEATURE__REQUIRED_FEATURES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ModelPackage.Literals.FEATURE__FEATURE_DESCRIPTION);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__COPYRIGHT_NOTICE);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__LICENSE_AGREEMENT);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__SITES_TO_VISIT);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__INCLUDED_FEATURES);
			childrenFeatures.add(ModelPackage.Literals.FEATURE__REQUIRED_FEATURES);
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
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
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

		switch (notification.getFeatureID(Feature.class)) {
			case ModelPackage.FEATURE__FEATURE_DESCRIPTION:
			case ModelPackage.FEATURE__COPYRIGHT_NOTICE:
			case ModelPackage.FEATURE__LICENSE_AGREEMENT:
			case ModelPackage.FEATURE__SITES_TO_VISIT:
			case ModelPackage.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS:
			case ModelPackage.FEATURE__INCLUDED_FEATURES:
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
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
				(ModelPackage.Literals.FEATURE__FEATURE_DESCRIPTION,
				 ModelFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__FEATURE_DESCRIPTION,
				 ModelFactory.eINSTANCE.createLicenseAgreement()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__COPYRIGHT_NOTICE,
				 ModelFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__COPYRIGHT_NOTICE,
				 ModelFactory.eINSTANCE.createLicenseAgreement()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__LICENSE_AGREEMENT,
				 ModelFactory.eINSTANCE.createLicenseAgreement()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__SITES_TO_VISIT,
				 ModelFactory.eINSTANCE.createSiteToVisit()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS,
				 ModelFactory.eINSTANCE.createIncludedBundleOrFragment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__INCLUDED_FEATURES,
				 ModelFactory.eINSTANCE.createIncludedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FEATURE__REQUIRED_FEATURES,
				 ModelFactory.eINSTANCE.createRequired()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModelPackage.Literals.FEATURE__FEATURE_DESCRIPTION ||
			childFeature == ModelPackage.Literals.FEATURE__COPYRIGHT_NOTICE ||
			childFeature == ModelPackage.Literals.FEATURE__LICENSE_AGREEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
