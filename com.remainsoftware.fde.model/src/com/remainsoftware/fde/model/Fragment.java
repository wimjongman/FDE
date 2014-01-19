/**
 */
package com.remainsoftware.fde.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.Fragment#getParentBundle <em>Parent Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getFragment()
 * @model
 * @generated
 */
public interface Fragment extends Manifest {
	/**
	 * Returns the value of the '<em><b>Parent Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Bundle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Bundle</em>' containment reference.
	 * @see #setParentBundle(Bundle)
	 * @see com.remainsoftware.fde.model.ModelPackage#getFragment_ParentBundle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bundle getParentBundle();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Fragment#getParentBundle <em>Parent Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Bundle</em>' containment reference.
	 * @see #getParentBundle()
	 * @generated
	 */
	void setParentBundle(Bundle value);

} // Fragment
