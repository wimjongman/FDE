/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.remainsoftware.fde.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/e4/fde/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.remainsoftware.fde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.remainsoftware.fde.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.VersionImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__BUNDLES = 2;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__FRAGMENTS = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.ManifestImpl <em>Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.ManifestImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getManifest()
	 * @generated
	 */
	int MANIFEST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__VENDOR = 3;

	/**
	 * The number of structural features of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.FeatureImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = MANIFEST__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = MANIFEST__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MANIFEST__NAME;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VENDOR = MANIFEST__VENDOR;

	/**
	 * The feature id for the '<em><b>Feature Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_DESCRIPTION = MANIFEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copyright Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COPYRIGHT_NOTICE = MANIFEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LICENSE_AGREEMENT = MANIFEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sites To Visit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SITES_TO_VISIT = MANIFEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Included Bundles And Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS = MANIFEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Included Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCLUDED_FEATURES = MANIFEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_FEATURES = MANIFEST_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MANIFEST_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = MANIFEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.BundleImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = MANIFEST__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = MANIFEST__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = MANIFEST__NAME;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VENDOR = MANIFEST__VENDOR;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = MANIFEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = MANIFEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.FragmentImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__ID = BUNDLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__VERSION = BUNDLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NAME = BUNDLE__NAME;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__VENDOR = BUNDLE__VENDOR;

	/**
	 * The feature id for the '<em><b>Parent Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PARENT_BUNDLE = BUNDLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = BUNDLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = BUNDLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.DescriptionImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__URL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.SiteToVisitImpl <em>Site To Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.SiteToVisitImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getSiteToVisit()
	 * @generated
	 */
	int SITE_TO_VISIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TO_VISIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TO_VISIT__URL = 1;

	/**
	 * The number of structural features of the '<em>Site To Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TO_VISIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site To Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TO_VISIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.LicenseAgreementImpl <em>License Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.LicenseAgreementImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getLicenseAgreement()
	 * @generated
	 */
	int LICENSE_AGREEMENT = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT__URL = DESCRIPTION__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT__DESCRIPTION = DESCRIPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Local License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT__LOCAL_LICENSE = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT__SHARED_LICENSE = DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>License Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>License Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_AGREEMENT_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl <em>Included Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.IncludedFeatureImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getIncludedFeature()
	 * @generated
	 */
	int INCLUDED_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Included</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__INCLUDED = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__FEATURE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Bree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__BREE = 3;

	/**
	 * The number of structural features of the '<em>Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.RequiredImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 9;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__MATCH_RULE = 2;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl <em>Included Bundle Or Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getIncludedBundleOrFragment()
	 * @generated
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT = 10;

	/**
	 * The feature id for the '<em><b>Bundle Or Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__BUNDLE_OR_FRAGMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Download Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Installation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Unpack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK = 4;

	/**
	 * The feature id for the '<em><b>Bree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT__BREE = 5;

	/**
	 * The number of structural features of the '<em>Included Bundle Or Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Included Bundle Or Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_BUNDLE_OR_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.BREEImpl <em>BREE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.BREEImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getBREE()
	 * @generated
	 */
	int BREE = 11;

	/**
	 * The feature id for the '<em><b>Windowing System</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE__WINDOWING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE__ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE__OPERATING_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE__LANGUAGE = 3;

	/**
	 * The number of structural features of the '<em>BREE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BREE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.impl.ImportServiceImpl <em>Import Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.impl.ImportServiceImpl
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getImportService()
	 * @generated
	 */
	int IMPORT_SERVICE = 12;

	/**
	 * The number of structural features of the '<em>Import Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Do Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE___DO_IMPORT__VERSION = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE___GET_NAME = 1;

	/**
	 * The number of operations of the '<em>Import Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.OS <em>OS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.OS
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getOS()
	 * @generated
	 */
	int OS = 13;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.ARCH <em>ARCH</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.ARCH
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getARCH()
	 * @generated
	 */
	int ARCH = 14;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.WS <em>WS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.WS
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getWS()
	 * @generated
	 */
	int WS = 15;

	/**
	 * The meta object id for the '{@link com.remainsoftware.fde.model.MATCH_RULE <em>MATCH RULE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.remainsoftware.fde.model.MATCH_RULE
	 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getMATCH_RULE()
	 * @generated
	 */
	int MATCH_RULE = 16;


	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Version#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.Version#getVersion()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Version#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.remainsoftware.fde.model.Version#getFeatures()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Version#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see com.remainsoftware.fde.model.Version#getBundles()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Bundles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Version#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see com.remainsoftware.fde.model.Version#getFragments()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Fragments();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest</em>'.
	 * @see com.remainsoftware.fde.model.Manifest
	 * @generated
	 */
	EClass getManifest();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Manifest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.remainsoftware.fde.model.Manifest#getId()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Manifest#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.Manifest#getVersion()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Manifest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.remainsoftware.fde.model.Manifest#getName()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Manifest#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see com.remainsoftware.fde.model.Manifest#getVendor()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Vendor();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.remainsoftware.fde.model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.Feature#getFeatureDescription <em>Feature Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Description</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getFeatureDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.Feature#getCopyrightNotice <em>Copyright Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright Notice</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getCopyrightNotice()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_CopyrightNotice();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.Feature#getLicenseAgreement <em>License Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Agreement</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getLicenseAgreement()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_LicenseAgreement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Feature#getSitesToVisit <em>Sites To Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sites To Visit</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getSitesToVisit()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SitesToVisit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Feature#getIncludedBundlesAndFragments <em>Included Bundles And Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Bundles And Fragments</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getIncludedBundlesAndFragments()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncludedBundlesAndFragments();

	/**
	 * Returns the meta object for the containment reference list '{@link com.remainsoftware.fde.model.Feature#getIncludedFeatures <em>Included Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Features</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getIncludedFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncludedFeatures();

	/**
	 * Returns the meta object for the reference list '{@link com.remainsoftware.fde.model.Feature#getRequiredFeatures <em>Required Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Features</em>'.
	 * @see com.remainsoftware.fde.model.Feature#getRequiredFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredFeatures();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see com.remainsoftware.fde.model.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see com.remainsoftware.fde.model.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.Fragment#getParentBundle <em>Parent Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Bundle</em>'.
	 * @see com.remainsoftware.fde.model.Fragment#getParentBundle()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_ParentBundle();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see com.remainsoftware.fde.model.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Description#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see com.remainsoftware.fde.model.Description#getUrl()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Url();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Description#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.remainsoftware.fde.model.Description#getDescription()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Description();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.SiteToVisit <em>Site To Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site To Visit</em>'.
	 * @see com.remainsoftware.fde.model.SiteToVisit
	 * @generated
	 */
	EClass getSiteToVisit();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.SiteToVisit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.remainsoftware.fde.model.SiteToVisit#getName()
	 * @see #getSiteToVisit()
	 * @generated
	 */
	EAttribute getSiteToVisit_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.SiteToVisit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see com.remainsoftware.fde.model.SiteToVisit#getUrl()
	 * @see #getSiteToVisit()
	 * @generated
	 */
	EAttribute getSiteToVisit_Url();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.LicenseAgreement <em>License Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Agreement</em>'.
	 * @see com.remainsoftware.fde.model.LicenseAgreement
	 * @generated
	 */
	EClass getLicenseAgreement();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.LicenseAgreement#isLocalLicense <em>Local License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local License</em>'.
	 * @see com.remainsoftware.fde.model.LicenseAgreement#isLocalLicense()
	 * @see #getLicenseAgreement()
	 * @generated
	 */
	EAttribute getLicenseAgreement_LocalLicense();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.LicenseAgreement#isSharedLicense <em>Shared License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared License</em>'.
	 * @see com.remainsoftware.fde.model.LicenseAgreement#isSharedLicense()
	 * @see #getLicenseAgreement()
	 * @generated
	 */
	EAttribute getLicenseAgreement_SharedLicense();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Feature</em>'.
	 * @see com.remainsoftware.fde.model.IncludedFeature
	 * @generated
	 */
	EClass getIncludedFeature();

	/**
	 * Returns the meta object for the reference '{@link com.remainsoftware.fde.model.IncludedFeature#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Included</em>'.
	 * @see com.remainsoftware.fde.model.IncludedFeature#getIncluded()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EReference getIncludedFeature_Included();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see com.remainsoftware.fde.model.IncludedFeature#getFeatureName()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedFeature#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.IncludedFeature#getVersion()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_Version();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.IncludedFeature#getBree <em>Bree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bree</em>'.
	 * @see com.remainsoftware.fde.model.IncludedFeature#getBree()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EReference getIncludedFeature_Bree();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see com.remainsoftware.fde.model.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for the reference '{@link com.remainsoftware.fde.model.Required#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required</em>'.
	 * @see com.remainsoftware.fde.model.Required#getRequired()
	 * @see #getRequired()
	 * @generated
	 */
	EReference getRequired_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Required#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.Required#getVersion()
	 * @see #getRequired()
	 * @generated
	 */
	EAttribute getRequired_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.Required#getMatchRule <em>Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Rule</em>'.
	 * @see com.remainsoftware.fde.model.Required#getMatchRule()
	 * @see #getRequired()
	 * @generated
	 */
	EAttribute getRequired_MatchRule();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment <em>Included Bundle Or Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Bundle Or Fragment</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment
	 * @generated
	 */
	EClass getIncludedBundleOrFragment();

	/**
	 * Returns the meta object for the reference '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#getBundleOrFragment <em>Bundle Or Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Or Fragment</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#getBundleOrFragment()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EReference getIncludedBundleOrFragment_BundleOrFragment();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#getVersion()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EAttribute getIncludedBundleOrFragment_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#getDownloadSize <em>Download Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Size</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#getDownloadSize()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EAttribute getIncludedBundleOrFragment_DownloadSize();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#getInstallationSize <em>Installation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Size</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#getInstallationSize()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EAttribute getIncludedBundleOrFragment_InstallationSize();

	/**
	 * Returns the meta object for the attribute '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#isUnpack <em>Unpack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unpack</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#isUnpack()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EAttribute getIncludedBundleOrFragment_Unpack();

	/**
	 * Returns the meta object for the containment reference '{@link com.remainsoftware.fde.model.IncludedBundleOrFragment#getBree <em>Bree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bree</em>'.
	 * @see com.remainsoftware.fde.model.IncludedBundleOrFragment#getBree()
	 * @see #getIncludedBundleOrFragment()
	 * @generated
	 */
	EReference getIncludedBundleOrFragment_Bree();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.BREE <em>BREE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BREE</em>'.
	 * @see com.remainsoftware.fde.model.BREE
	 * @generated
	 */
	EClass getBREE();

	/**
	 * Returns the meta object for the attribute list '{@link com.remainsoftware.fde.model.BREE#getWindowingSystem <em>Windowing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Windowing System</em>'.
	 * @see com.remainsoftware.fde.model.BREE#getWindowingSystem()
	 * @see #getBREE()
	 * @generated
	 */
	EAttribute getBREE_WindowingSystem();

	/**
	 * Returns the meta object for the attribute list '{@link com.remainsoftware.fde.model.BREE#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Architecture</em>'.
	 * @see com.remainsoftware.fde.model.BREE#getArchitecture()
	 * @see #getBREE()
	 * @generated
	 */
	EAttribute getBREE_Architecture();

	/**
	 * Returns the meta object for the attribute list '{@link com.remainsoftware.fde.model.BREE#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operating System</em>'.
	 * @see com.remainsoftware.fde.model.BREE#getOperatingSystem()
	 * @see #getBREE()
	 * @generated
	 */
	EAttribute getBREE_OperatingSystem();

	/**
	 * Returns the meta object for the attribute list '{@link com.remainsoftware.fde.model.BREE#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see com.remainsoftware.fde.model.BREE#getLanguage()
	 * @see #getBREE()
	 * @generated
	 */
	EAttribute getBREE_Language();

	/**
	 * Returns the meta object for class '{@link com.remainsoftware.fde.model.ImportService <em>Import Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Service</em>'.
	 * @see com.remainsoftware.fde.model.ImportService
	 * @generated
	 */
	EClass getImportService();

	/**
	 * Returns the meta object for the '{@link com.remainsoftware.fde.model.ImportService#doImport(com.remainsoftware.fde.model.Version) <em>Do Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Import</em>' operation.
	 * @see com.remainsoftware.fde.model.ImportService#doImport(com.remainsoftware.fde.model.Version)
	 * @generated
	 */
	EOperation getImportService__DoImport__Version();

	/**
	 * Returns the meta object for the '{@link com.remainsoftware.fde.model.ImportService#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see com.remainsoftware.fde.model.ImportService#getName()
	 * @generated
	 */
	EOperation getImportService__GetName();

	/**
	 * Returns the meta object for enum '{@link com.remainsoftware.fde.model.OS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS</em>'.
	 * @see com.remainsoftware.fde.model.OS
	 * @generated
	 */
	EEnum getOS();

	/**
	 * Returns the meta object for enum '{@link com.remainsoftware.fde.model.ARCH <em>ARCH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARCH</em>'.
	 * @see com.remainsoftware.fde.model.ARCH
	 * @generated
	 */
	EEnum getARCH();

	/**
	 * Returns the meta object for enum '{@link com.remainsoftware.fde.model.WS <em>WS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WS</em>'.
	 * @see com.remainsoftware.fde.model.WS
	 * @generated
	 */
	EEnum getWS();

	/**
	 * Returns the meta object for enum '{@link com.remainsoftware.fde.model.MATCH_RULE <em>MATCH RULE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MATCH RULE</em>'.
	 * @see com.remainsoftware.fde.model.MATCH_RULE
	 * @generated
	 */
	EEnum getMATCH_RULE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.VersionImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION = eINSTANCE.getVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__FEATURES = eINSTANCE.getVersion_Features();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__BUNDLES = eINSTANCE.getVersion_Bundles();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__FRAGMENTS = eINSTANCE.getVersion_Fragments();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.ManifestImpl <em>Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.ManifestImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getManifest()
		 * @generated
		 */
		EClass MANIFEST = eINSTANCE.getManifest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__ID = eINSTANCE.getManifest_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__VERSION = eINSTANCE.getManifest_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__NAME = eINSTANCE.getManifest_Name();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__VENDOR = eINSTANCE.getManifest_Vendor();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.FeatureImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_DESCRIPTION = eINSTANCE.getFeature_FeatureDescription();

		/**
		 * The meta object literal for the '<em><b>Copyright Notice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__COPYRIGHT_NOTICE = eINSTANCE.getFeature_CopyrightNotice();

		/**
		 * The meta object literal for the '<em><b>License Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__LICENSE_AGREEMENT = eINSTANCE.getFeature_LicenseAgreement();

		/**
		 * The meta object literal for the '<em><b>Sites To Visit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SITES_TO_VISIT = eINSTANCE.getFeature_SitesToVisit();

		/**
		 * The meta object literal for the '<em><b>Included Bundles And Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCLUDED_BUNDLES_AND_FRAGMENTS = eINSTANCE.getFeature_IncludedBundlesAndFragments();

		/**
		 * The meta object literal for the '<em><b>Included Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCLUDED_FEATURES = eINSTANCE.getFeature_IncludedFeatures();

		/**
		 * The meta object literal for the '<em><b>Required Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRED_FEATURES = eINSTANCE.getFeature_RequiredFeatures();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.BundleImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.FragmentImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Parent Bundle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__PARENT_BUNDLE = eINSTANCE.getFragment_ParentBundle();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.DescriptionImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__URL = eINSTANCE.getDescription_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.SiteToVisitImpl <em>Site To Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.SiteToVisitImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getSiteToVisit()
		 * @generated
		 */
		EClass SITE_TO_VISIT = eINSTANCE.getSiteToVisit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_TO_VISIT__NAME = eINSTANCE.getSiteToVisit_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_TO_VISIT__URL = eINSTANCE.getSiteToVisit_Url();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.LicenseAgreementImpl <em>License Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.LicenseAgreementImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getLicenseAgreement()
		 * @generated
		 */
		EClass LICENSE_AGREEMENT = eINSTANCE.getLicenseAgreement();

		/**
		 * The meta object literal for the '<em><b>Local License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_AGREEMENT__LOCAL_LICENSE = eINSTANCE.getLicenseAgreement_LocalLicense();

		/**
		 * The meta object literal for the '<em><b>Shared License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_AGREEMENT__SHARED_LICENSE = eINSTANCE.getLicenseAgreement_SharedLicense();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.IncludedFeatureImpl <em>Included Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.IncludedFeatureImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getIncludedFeature()
		 * @generated
		 */
		EClass INCLUDED_FEATURE = eINSTANCE.getIncludedFeature();

		/**
		 * The meta object literal for the '<em><b>Included</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_FEATURE__INCLUDED = eINSTANCE.getIncludedFeature_Included();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__FEATURE_NAME = eINSTANCE.getIncludedFeature_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__VERSION = eINSTANCE.getIncludedFeature_Version();

		/**
		 * The meta object literal for the '<em><b>Bree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_FEATURE__BREE = eINSTANCE.getIncludedFeature_Bree();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.RequiredImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED__REQUIRED = eINSTANCE.getRequired_Required();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED__VERSION = eINSTANCE.getRequired_Version();

		/**
		 * The meta object literal for the '<em><b>Match Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED__MATCH_RULE = eINSTANCE.getRequired_MatchRule();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl <em>Included Bundle Or Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.IncludedBundleOrFragmentImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getIncludedBundleOrFragment()
		 * @generated
		 */
		EClass INCLUDED_BUNDLE_OR_FRAGMENT = eINSTANCE.getIncludedBundleOrFragment();

		/**
		 * The meta object literal for the '<em><b>Bundle Or Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_BUNDLE_OR_FRAGMENT__BUNDLE_OR_FRAGMENT = eINSTANCE.getIncludedBundleOrFragment_BundleOrFragment();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_BUNDLE_OR_FRAGMENT__VERSION = eINSTANCE.getIncludedBundleOrFragment_Version();

		/**
		 * The meta object literal for the '<em><b>Download Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_BUNDLE_OR_FRAGMENT__DOWNLOAD_SIZE = eINSTANCE.getIncludedBundleOrFragment_DownloadSize();

		/**
		 * The meta object literal for the '<em><b>Installation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_BUNDLE_OR_FRAGMENT__INSTALLATION_SIZE = eINSTANCE.getIncludedBundleOrFragment_InstallationSize();

		/**
		 * The meta object literal for the '<em><b>Unpack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_BUNDLE_OR_FRAGMENT__UNPACK = eINSTANCE.getIncludedBundleOrFragment_Unpack();

		/**
		 * The meta object literal for the '<em><b>Bree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_BUNDLE_OR_FRAGMENT__BREE = eINSTANCE.getIncludedBundleOrFragment_Bree();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.BREEImpl <em>BREE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.BREEImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getBREE()
		 * @generated
		 */
		EClass BREE = eINSTANCE.getBREE();

		/**
		 * The meta object literal for the '<em><b>Windowing System</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREE__WINDOWING_SYSTEM = eINSTANCE.getBREE_WindowingSystem();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREE__ARCHITECTURE = eINSTANCE.getBREE_Architecture();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREE__OPERATING_SYSTEM = eINSTANCE.getBREE_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREE__LANGUAGE = eINSTANCE.getBREE_Language();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.impl.ImportServiceImpl <em>Import Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.impl.ImportServiceImpl
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getImportService()
		 * @generated
		 */
		EClass IMPORT_SERVICE = eINSTANCE.getImportService();

		/**
		 * The meta object literal for the '<em><b>Do Import</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT_SERVICE___DO_IMPORT__VERSION = eINSTANCE.getImportService__DoImport__Version();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT_SERVICE___GET_NAME = eINSTANCE.getImportService__GetName();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.OS <em>OS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.OS
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getOS()
		 * @generated
		 */
		EEnum OS = eINSTANCE.getOS();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.ARCH <em>ARCH</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.ARCH
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getARCH()
		 * @generated
		 */
		EEnum ARCH = eINSTANCE.getARCH();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.WS <em>WS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.WS
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getWS()
		 * @generated
		 */
		EEnum WS = eINSTANCE.getWS();

		/**
		 * The meta object literal for the '{@link com.remainsoftware.fde.model.MATCH_RULE <em>MATCH RULE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.remainsoftware.fde.model.MATCH_RULE
		 * @see com.remainsoftware.fde.model.impl.ModelPackageImpl#getMATCH_RULE()
		 * @generated
		 */
		EEnum MATCH_RULE = eINSTANCE.getMATCH_RULE();

	}

} //ModelPackage
