/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.IncludedFeature#getIncluded <em>Included</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.IncludedFeature#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.IncludedFeature#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.IncludedFeature#getBree <em>Bree</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getIncludedFeature()
 * @model
 * @generated
 */
public interface IncludedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Included</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' reference.
	 * @see #setIncluded(Feature)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncludedFeature_Included()
	 * @model required="true"
	 * @generated
	 */
	Feature getIncluded();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.IncludedFeature#getIncluded <em>Included</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included</em>' reference.
	 * @see #getIncluded()
	 * @generated
	 */
	void setIncluded(Feature value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncludedFeature_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.IncludedFeature#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

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
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncludedFeature_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.IncludedFeature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see com.remainsoftware.fde.model.ModelPackage#getIncludedFeature_Bree()
	 * @model containment="true"
	 * @generated
	 */
	BREE getBree();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.IncludedFeature#getBree <em>Bree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bree</em>' containment reference.
	 * @see #getBree()
	 * @generated
	 */
	void setBree(BREE value);

} // IncludedFeature
