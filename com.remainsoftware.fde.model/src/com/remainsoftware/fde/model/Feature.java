/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getFeatureDescription <em>Feature Description</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getCopyrightNotice <em>Copyright Notice</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getLicenseAgreement <em>License Agreement</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getSitesToVisit <em>Sites To Visit</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getIncludedBundlesAndFragments <em>Included Bundles And Fragments</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getIncludedFeatures <em>Included Features</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Feature#getRequiredFeatures <em>Required Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Manifest {
	/**
	 * Returns the value of the '<em><b>Feature Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Description</em>' containment reference.
	 * @see #setFeatureDescription(Description)
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_FeatureDescription()
	 * @model containment="true"
	 * @generated
	 */
	Description getFeatureDescription();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Feature#getFeatureDescription <em>Feature Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Description</em>' containment reference.
	 * @see #getFeatureDescription()
	 * @generated
	 */
	void setFeatureDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Copyright Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Notice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Notice</em>' containment reference.
	 * @see #setCopyrightNotice(Description)
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_CopyrightNotice()
	 * @model containment="true"
	 * @generated
	 */
	Description getCopyrightNotice();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Feature#getCopyrightNotice <em>Copyright Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Notice</em>' containment reference.
	 * @see #getCopyrightNotice()
	 * @generated
	 */
	void setCopyrightNotice(Description value);

	/**
	 * Returns the value of the '<em><b>License Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Agreement</em>' containment reference.
	 * @see #setLicenseAgreement(LicenseAgreement)
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_LicenseAgreement()
	 * @model containment="true"
	 * @generated
	 */
	LicenseAgreement getLicenseAgreement();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Feature#getLicenseAgreement <em>License Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Agreement</em>' containment reference.
	 * @see #getLicenseAgreement()
	 * @generated
	 */
	void setLicenseAgreement(LicenseAgreement value);

	/**
	 * Returns the value of the '<em><b>Sites To Visit</b></em>' containment reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.SiteToVisit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sites To Visit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites To Visit</em>' containment reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_SitesToVisit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiteToVisit> getSitesToVisit();

	/**
	 * Returns the value of the '<em><b>Included Bundles And Fragments</b></em>' reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.IncludedBundleOrFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Bundles And Fragments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Bundles And Fragments</em>' reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_IncludedBundlesAndFragments()
	 * @model
	 * @generated
	 */
	EList<IncludedBundleOrFragment> getIncludedBundlesAndFragments();

	/**
	 * Returns the value of the '<em><b>Included Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.IncludedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Features</em>' containment reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_IncludedFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludedFeature> getIncludedFeatures();

	/**
	 * Returns the value of the '<em><b>Required Features</b></em>' reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.Required}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Features</em>' reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getFeature_RequiredFeatures()
	 * @model
	 * @generated
	 */
	EList<Required> getRequiredFeatures();

} // Feature
