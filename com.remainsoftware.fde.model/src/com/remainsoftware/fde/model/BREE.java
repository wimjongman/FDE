/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BREE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.BREE#getWindowingSystem <em>Windowing System</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.BREE#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.BREE#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.BREE#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getBREE()
 * @model
 * @generated
 */
public interface BREE extends EObject {
	/**
	 * Returns the value of the '<em><b>Windowing System</b></em>' attribute list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.WS}.
	 * The literals are from the enumeration {@link com.remainsoftware.fde.model.WS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windowing System</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windowing System</em>' attribute list.
	 * @see com.remainsoftware.fde.model.WS
	 * @see com.remainsoftware.fde.model.ModelPackage#getBREE_WindowingSystem()
	 * @model
	 * @generated
	 */
	EList<WS> getWindowingSystem();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.ARCH}.
	 * The literals are from the enumeration {@link com.remainsoftware.fde.model.ARCH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute list.
	 * @see com.remainsoftware.fde.model.ARCH
	 * @see com.remainsoftware.fde.model.ModelPackage#getBREE_Architecture()
	 * @model
	 * @generated
	 */
	EList<ARCH> getArchitecture();

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.OS}.
	 * The literals are from the enumeration {@link com.remainsoftware.fde.model.OS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute list.
	 * @see com.remainsoftware.fde.model.OS
	 * @see com.remainsoftware.fde.model.ModelPackage#getBREE_OperatingSystem()
	 * @model
	 * @generated
	 */
	EList<OS> getOperatingSystem();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getBREE_Language()
	 * @model
	 * @generated
	 */
	EList<String> getLanguage();

} // BREE
