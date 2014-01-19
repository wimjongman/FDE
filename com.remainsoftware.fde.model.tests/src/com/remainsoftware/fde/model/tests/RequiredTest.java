/**
 */
package com.remainsoftware.fde.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.Required;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredTest extends TestCase {

	/**
	 * The fixture for this Required test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Required fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredTest.class);
	}

	/**
	 * Constructs a new Required test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Required test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Required fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Required test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Required getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRequired());
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

} //RequiredTest
