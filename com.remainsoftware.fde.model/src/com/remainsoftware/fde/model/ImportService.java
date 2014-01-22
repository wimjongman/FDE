/**
 */
package com.remainsoftware.fde.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.remainsoftware.fde.model.ModelPackage#getImportService()
 * @model abstract="true"
 * @generated
 */
public interface ImportService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doImport(Version version);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

} // ImportService
