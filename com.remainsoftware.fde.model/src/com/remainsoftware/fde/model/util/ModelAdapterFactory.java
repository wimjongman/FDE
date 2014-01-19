/**
 */
package com.remainsoftware.fde.model.util;

import com.remainsoftware.fde.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseManifest(Manifest object) {
				return createManifestAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseFragment(Fragment object) {
				return createFragmentAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseSiteToVisit(SiteToVisit object) {
				return createSiteToVisitAdapter();
			}
			@Override
			public Adapter caseLicenseAgreement(LicenseAgreement object) {
				return createLicenseAgreementAdapter();
			}
			@Override
			public Adapter caseIncludedFeature(IncludedFeature object) {
				return createIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseRequired(Required object) {
				return createRequiredAdapter();
			}
			@Override
			public Adapter caseIncludedBundleOrFragment(IncludedBundleOrFragment object) {
				return createIncludedBundleOrFragmentAdapter();
			}
			@Override
			public Adapter caseBREE(BREE object) {
				return createBREEAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Manifest
	 * @generated
	 */
	public Adapter createManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Fragment
	 * @generated
	 */
	public Adapter createFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.SiteToVisit <em>Site To Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.SiteToVisit
	 * @generated
	 */
	public Adapter createSiteToVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.LicenseAgreement <em>License Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.LicenseAgreement
	 * @generated
	 */
	public Adapter createLicenseAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.IncludedFeature
	 * @generated
	 */
	public Adapter createIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.Required
	 * @generated
	 */
	public Adapter createRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment <em>Included Bundle Or Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment
	 * @generated
	 */
	public Adapter createIncludedBundleOrFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.remainsoftware.fde.model.BREE <em>BREE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.remainsoftware.fde.model.BREE
	 * @generated
	 */
	public Adapter createBREEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
