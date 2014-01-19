/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.Included#getIncluded <em>Included</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Included#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Included#getDownloadSize <em>Download Size</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Included#getInstallationSize <em>Installation Size</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Included#isUnpack <em>Unpack</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Included#getBree <em>Bree</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded()
 * @model
 * @generated
 */
public interface Included extends EObject {
	/**
	 * Returns the value of the '<em><b>Included</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' containment reference.
	 * @see #setIncluded(Manifest)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_Included()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Manifest getIncluded();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#getIncluded <em>Included</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included</em>' containment reference.
	 * @see #getIncluded()
	 * @generated
	 */
	void setIncluded(Manifest value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Download Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Size</em>' attribute.
	 * @see #setDownloadSize(int)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_DownloadSize()
	 * @model
	 * @generated
	 */
	int getDownloadSize();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#getDownloadSize <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Size</em>' attribute.
	 * @see #getDownloadSize()
	 * @generated
	 */
	void setDownloadSize(int value);

	/**
	 * Returns the value of the '<em><b>Installation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Size</em>' attribute.
	 * @see #setInstallationSize(int)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_InstallationSize()
	 * @model
	 * @generated
	 */
	int getInstallationSize();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#getInstallationSize <em>Installation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Size</em>' attribute.
	 * @see #getInstallationSize()
	 * @generated
	 */
	void setInstallationSize(int value);

	/**
	 * Returns the value of the '<em><b>Unpack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unpack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unpack</em>' attribute.
	 * @see #setUnpack(boolean)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_Unpack()
	 * @model
	 * @generated
	 */
	boolean isUnpack();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#isUnpack <em>Unpack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unpack</em>' attribute.
	 * @see #isUnpack()
	 * @generated
	 */
	void setUnpack(boolean value);

	/**
	 * Returns the value of the '<em><b>Bree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bree</em>' containment reference.
	 * @see #setBree(BREE)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncluded_Bree()
	 * @model containment="true"
	 * @generated
	 */
	BREE getBree();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Included#getBree <em>Bree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bree</em>' containment reference.
	 * @see #getBree()
	 * @generated
	 */
	void setBree(BREE value);

} // Included
