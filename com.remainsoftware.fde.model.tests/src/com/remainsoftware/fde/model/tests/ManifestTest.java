/**
 */
package com.remainsoftware.fde.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.Manifest;
import com.remainsoftware.fde.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManifestTest extends TestCase {

	/**
	 * The fixture for this Manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifest fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManifestTest.class);
	}

	/**
	 * Constructs a new Manifest test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Manifest fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifest getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createManifest());
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

} //ManifestTest
