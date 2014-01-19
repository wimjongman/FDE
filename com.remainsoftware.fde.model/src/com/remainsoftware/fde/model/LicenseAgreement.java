/**
 */
package com.remainsoftware.fde.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.LicenseAgreement#isLocalLicense <em>Local License</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.LicenseAgreement#isSharedLicense <em>Shared License</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getLicenseAgreement()
 * @model
 * @generated
 */
public interface LicenseAgreement extends Description {
	/**
	 * Returns the value of the '<em><b>Local License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local License</em>' attribute.
	 * @see #setLocalLicense(boolean)
	 * @see com.remainsoftware.fde.model.ModelPackage#getLicenseAgreement_LocalLicense()
	 * @model
	 * @generated
	 */
	boolean isLocalLicense();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.LicenseAgreement#isLocalLicense <em>Local License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local License</em>' attribute.
	 * @see #isLocalLicense()
	 * @generated
	 */
	void setLocalLicense(boolean value);

	/**
	 * Returns the value of the '<em><b>Shared License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared License</em>' attribute.
	 * @see #setSharedLicense(boolean)
	 * @see com.remainsoftware.fde.model.ModelPackage#getLicenseAgreement_SharedLicense()
	 * @model
	 * @generated
	 */
	boolean isSharedLicense();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.LicenseAgreement#isSharedLicense <em>Shared License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared License</em>' attribute.
	 * @see #isSharedLicense()
	 * @generated
	 */
	void setSharedLicense(boolean value);

} // LicenseAgreement
