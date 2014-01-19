/**
 */
package com.remainsoftware.fde.model.impl;

import com.remainsoftware.fde.model.Bundle;
import com.remainsoftware.fde.model.Description;
import com.remainsoftware.fde.model.Feature;
import com.remainsoftware.fde.model.Fragment;
import com.remainsoftware.fde.model.IncludedBundleOrFragment;
import com.remainsoftware.fde.model.IncludedFeature;
import com.remainsoftware.fde.model.LicenseAgreement;
import com.remainsoftware.fde.model.Manifest;
import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.ModelPackage;
import com.remainsoftware.fde.model.Required;
import com.remainsoftware.fde.model.SiteToVisit;
import com.remainsoftware.fde.model.Version;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteToVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedBundleOrFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum archEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matcH_RULEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.remainsoftware.fde.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Version() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Features() {
		return (EReference)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Bundles() {
		return (EReference)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Fragments() {
		return (EReference)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifest() {
		return manifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_Id() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_Version() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_Name() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_Vendor() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureDescription() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_CopyrightNotice() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_LicenseAgreement() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_SitesToVisit() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_IncludedBundlesAndFragments() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_IncludedFeatures() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RequiredFeatures() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_ParentBundle() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Url() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Description() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteToVisit() {
		return siteToVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiteToVisit_Name() {
		return (EAttribute)siteToVisitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiteToVisit_Url() {
		return (EAttribute)siteToVisitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicenseAgreement() {
		return licenseAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseAgreement_LocalLicense() {
		return (EAttribute)licenseAgreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseAgreement_SharedLicense() {
		return (EAttribute)licenseAgreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedFeature() {
		return includedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedFeature_Included() {
		return (EReference)includedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFeature_FeatureName() {
		return (EAttribute)includedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFeature_Version() {
		return (EAttribute)includedFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedFeature_Bree() {
		return (EReference)includedFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequired() {
		return requiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequired_Required() {
		return (EReference)requiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequired_Version() {
		return (EAttribute)requiredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequired_MatchRule() {
		return (EAttribute)requiredEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedBundleOrFragment() {
		return includedBundleOrFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedBundleOrFragment_BundleOrFragment() {
		return (EReference)includedBundleOrFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedBundleOrFragment_Version() {
		return (EAttribute)includedBundleOrFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedBundleOrFragment_DownloadSize() {
		return (EAttribute)includedBundleOrFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedBundleOrFragment_InstallationSize() {
		return (EAttribute)includedBundleOrFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedBundleOrFragment_Unpack() {
		return (EAttribute)includedBundleOrFragmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedBundleOrFragment_Bree() {
		return (EReference)includedBundleOrFragmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBREE() {
		return breeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBREE_WindowingSystem() {
		return (EAttribute)breeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBREE_Architecture() {
		return (EAttribute)breeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBREE_OperatingSystem() {
		return (EAttribute)breeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBREE_Language() {
		return (EAttribute)breeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOS() {
		return osEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARCH() {
		return archEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWS() {
		return wsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMATCH_RULE() {
		return matcH_RULEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VERSION);
		createEReference(versionEClass, VERSION__FEATURES);
		createEReference(versionEClass, VERSION__BUNDLES);
		createEReference(versionEClass, VERSION__FRAGMENTS);

		manifestEClass = createEClass(MANIFEST);
		createEAttribute(manifestEClass, MANIFEST__ID);
		createEAttribute(manifestEClass, MANIFEST__VERSION);
		createEAttribute(manifestEClass, MANIFEST__NAME);
		createEAttribute(manifestEClass, MANIFEST__VENDOR);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATURE_DESCRIPTION);
		createEReference(featureEClass, FEATURE__COPYRIGHT_NOTICE);
		createEReference(featureEClass, FEATURE__LICENSE_AGREEMENT);
		createEReference(featureEClass, FEATURE__SITES_TO_VISIT);
		createEReference(featureEClass, FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS);
		createEReference(featureEClass, FEATURE__INCLUDED_FEATURES);
		createEReference(featureEClass, FEATURE__REQUIRED_FEATURES);

		bundleEClass = createEClass(BUNDLE);

		fragmentEClass = createEClass(FRAGMENT);
		createEReference(fragmentEClass, FRAGMENT__PARENT_BUNDLE);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__URL);
		createEAttribute(descriptionEClass, DESCRIPTION__DESCRIPTION);

		siteToVisitEClass = createEClass(SITE_TO_VISIT);
		createEAttribute(siteToVisitEClass, SITE_TO_VISIT__NAME);
		createEAttribute(siteToVisitEClass, SITE_TO_VISIT__URL);

		licenseAgreementEClass = createEClass(LICENSE_AGREEMENT);
		createEAttribute(licenseAgreementEClass, LICENSE_AGREEMENT__LOCAL_LICENSE);
		createEAttribute(licenseAgreementEClass, LICENSE_AGREEMENT__SHARED_LICENSE);

		includedFeatureEClass = createEClass(INCLUDED_FEATURE);
		createEReference(includedFeatureEClass, INCLUDED_FEATURE__INCLUDED);
		createEAttribute(includedFeatureEClass, INCLUDED_FEATURE__FEATURE_NAME);
		createEAttribute(includedFeatureEClass, INCLUDED_FEATURE__VERSION);
		createEReference(includedFeatureEClass, INCLUDED_FEATURE__BREE);

		requiredEClass = createEClass(REQUIRED);
		createEReference(requiredEClass, REQUIRED__REQUIRED);
		createEAttribute(requiredEClass, REQUIRED__VERSION);
		createEAttribute(requiredEClass, REQUIRED__MATCH_RULE);

		includedBundleOrFragmentEClass = createEClass(INCLUDED_BUNDLE_OR_FRAGMENT);
		createEReference(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__BUNDLE_OR_FRAGMENT);
		createEAttribute(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__VERSION);
		createEAttribute(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE);
		createEAttribute(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE);
		createEAttribute(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK);
		createEReference(includedBundleOrFragmentEClass, INCLUDED_BUNDLE_OR_FRAGMENT__BREE);

		breeEClass = createEClass(BREE);
		createEAttribute(breeEClass, BREE__WINDOWING_SYSTEM);
		createEAttribute(breeEClass, BREE__ARCHITECTURE);
		createEAttribute(breeEClass, BREE__OPERATING_SYSTEM);
		createEAttribute(breeEClass, BREE__LANGUAGE);

		// Create enums
		osEEnum = createEEnum(OS);
		archEEnum = createEEnum(ARCH);
		wsEEnum = createEEnum(WS);
		matcH_RULEEEnum = createEEnum(MATCH_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureEClass.getESuperTypes().add(this.getManifest());
		bundleEClass.getESuperTypes().add(this.getManifest());
		fragmentEClass.getESuperTypes().add(this.getBundle());
		licenseAgreementEClass.getESuperTypes().add(this.getDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Features(), this.getFeature(), null, "features", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Bundles(), this.getBundle(), null, "bundles", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Fragments(), this.getFragment(), null, "fragments", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifest_Id(), ecorePackage.getEString(), "id", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifest_Version(), ecorePackage.getEString(), "version", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifest_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_FeatureDescription(), this.getDescription(), null, "featureDescription", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_CopyrightNotice(), this.getDescription(), null, "copyrightNotice", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_LicenseAgreement(), this.getLicenseAgreement(), null, "licenseAgreement", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_SitesToVisit(), this.getSiteToVisit(), null, "sitesToVisit", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_IncludedBundlesAndFragments(), this.getIncludedBundleOrFragment(), null, "includedBundlesAndFragments", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_IncludedFeatures(), this.getIncludedFeature(), null, "includedFeatures", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_RequiredFeatures(), this.getRequired(), null, "requiredFeatures", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragment_ParentBundle(), this.getBundle(), null, "parentBundle", null, 1, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Url(), ecorePackage.getEString(), "url", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Description(), ecorePackage.getEString(), "description", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteToVisitEClass, SiteToVisit.class, "SiteToVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSiteToVisit_Name(), ecorePackage.getEString(), "name", null, 0, 1, SiteToVisit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiteToVisit_Url(), ecorePackage.getEString(), "url", null, 0, 1, SiteToVisit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseAgreementEClass, LicenseAgreement.class, "LicenseAgreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicenseAgreement_LocalLicense(), ecorePackage.getEBoolean(), "localLicense", null, 0, 1, LicenseAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseAgreement_SharedLicense(), ecorePackage.getEBoolean(), "sharedLicense", null, 0, 1, LicenseAgreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedFeatureEClass, IncludedFeature.class, "IncludedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludedFeature_Included(), this.getFeature(), null, "included", null, 1, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedFeature_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedFeature_Version(), ecorePackage.getEString(), "version", null, 0, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludedFeature_Bree(), this.getBREE(), null, "bree", null, 0, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequired_Required(), this.getManifest(), null, "required", null, 1, 1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequired_Version(), ecorePackage.getEString(), "version", null, 0, 1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequired_MatchRule(), this.getMATCH_RULE(), "matchRule", null, 0, 1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedBundleOrFragmentEClass, IncludedBundleOrFragment.class, "IncludedBundleOrFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludedBundleOrFragment_BundleOrFragment(), this.getBundle(), null, "bundleOrFragment", null, 1, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIncludedBundleOrFragment_BundleOrFragment().getEKeys().add(this.getManifest_Id());
		initEAttribute(getIncludedBundleOrFragment_Version(), ecorePackage.getEString(), "version", null, 0, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedBundleOrFragment_DownloadSize(), ecorePackage.getEInt(), "downloadSize", null, 0, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedBundleOrFragment_InstallationSize(), ecorePackage.getEInt(), "installationSize", null, 0, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedBundleOrFragment_Unpack(), ecorePackage.getEBoolean(), "unpack", null, 0, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludedBundleOrFragment_Bree(), this.getBREE(), null, "bree", null, 0, 1, IncludedBundleOrFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breeEClass, com.remainsoftware.fde.model.BREE.class, "BREE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBREE_WindowingSystem(), this.getWS(), "windowingSystem", null, 0, -1, com.remainsoftware.fde.model.BREE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBREE_Architecture(), this.getARCH(), "architecture", null, 0, -1, com.remainsoftware.fde.model.BREE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBREE_OperatingSystem(), this.getOS(), "operatingSystem", null, 0, -1, com.remainsoftware.fde.model.BREE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBREE_Language(), ecorePackage.getEString(), "language", null, 0, -1, com.remainsoftware.fde.model.BREE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(osEEnum, com.remainsoftware.fde.model.OS.class, "OS");
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.AIX);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.HPUX);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.LINUX);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.MACOSX);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.QNX);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.SOLARIS);
		addEEnumLiteral(osEEnum, com.remainsoftware.fde.model.OS.WIN32);

		initEEnum(archEEnum, com.remainsoftware.fde.model.ARCH.class, "ARCH");
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.IA64);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.IA64_32);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.PA_RISC);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.PPC);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.SPARC);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.X86);
		addEEnumLiteral(archEEnum, com.remainsoftware.fde.model.ARCH.X86_64);

		initEEnum(wsEEnum, com.remainsoftware.fde.model.WS.class, "WS");
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.CARBON);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.COCOA);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.GTK);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.MOTIF);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.PHOTON);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.WIN32);
		addEEnumLiteral(wsEEnum, com.remainsoftware.fde.model.WS.WPF);

		initEEnum(matcH_RULEEEnum, com.remainsoftware.fde.model.MATCH_RULE.class, "MATCH_RULE");
		addEEnumLiteral(matcH_RULEEEnum, com.remainsoftware.fde.model.MATCH_RULE.EQUIVALENT);
		addEEnumLiteral(matcH_RULEEEnum, com.remainsoftware.fde.model.MATCH_RULE.COMPATIBLE);
		addEEnumLiteral(matcH_RULEEEnum, com.remainsoftware.fde.model.MATCH_RULE.PERFECT);
		addEEnumLiteral(matcH_RULEEEnum, com.remainsoftware.fde.model.MATCH_RULE.GREATEROR_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
