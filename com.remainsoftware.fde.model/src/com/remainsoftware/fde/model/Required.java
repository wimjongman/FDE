/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.Required#getRequired <em>Required</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Required#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Required#getMatchRule <em>Match Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getRequired()
 * @model
 * @generated
 */
public interface Required extends EObject {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(Manifest)
	 * @see com.remainsoftware.fde.model.ModelPackage#getRequired_Required()
	 * @model required="true"
	 * @generated
	 */
	Manifest getRequired();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Required#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Manifest value);

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
	 * @see com.remainsoftware.fde.model.ModelPackage#getRequired_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Required#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Match Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link com.remainsoftware.fde.model.MATCH_RULE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Rule</em>' attribute.
	 * @see com.remainsoftware.fde.model.MATCH_RULE
	 * @see #setMatchRule(MATCH_RULE)
	 * @see com.remainsoftware.fde.model.ModelPackage#getRequired_MatchRule()
	 * @model
	 * @generated
	 */
	MATCH_RULE getMatchRule();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Required#getMatchRule <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Rule</em>' attribute.
	 * @see com.remainsoftware.fde.model.MATCH_RULE
	 * @see #getMatchRule()
	 * @generated
	 */
	void setMatchRule(MATCH_RULE value);

} // Required
