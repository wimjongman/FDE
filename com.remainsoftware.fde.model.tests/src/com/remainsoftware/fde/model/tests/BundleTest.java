/**
 */
package com.remainsoftware.fde.model.tests;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.Bundle;
import com.remainsoftware.fde.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleTest extends ManifestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleTest.class);
	}

	/**
	 * Constructs a new Bundle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bundle getFixture() {
		return (Bundle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createBundle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BundleTest
