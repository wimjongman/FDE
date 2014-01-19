/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.remainsoftware.fde.model.Version#getVersion <em>Version</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Version#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Version#getBundles <em>Bundles</em>}</li>
 *   <li>{@link com.remainsoftware.fde.model.Version#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
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
	 * @see com.remainsoftware.fde.model.ModelPackage#getVersion_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.remainsoftware.fde.model.Version#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getVersion_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getVersion_Bundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link com.remainsoftware.fde.model.Fragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see com.remainsoftware.fde.model.ModelPackage#getVersion_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fragment> getFragments();

} // Version
