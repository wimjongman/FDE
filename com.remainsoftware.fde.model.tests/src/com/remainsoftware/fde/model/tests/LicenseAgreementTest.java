/**
 */
package com.remainsoftware.fde.model.tests;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.LicenseAgreement;
import com.remainsoftware.fde.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>License Agreement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LicenseAgreementTest extends DescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LicenseAgreementTest.class);
	}

	/**
	 * Constructs a new License Agreement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseAgreementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this License Agreement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LicenseAgreement getFixture() {
		return (LicenseAgreement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createLicenseAgreement());
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

} //LicenseAgreementTest
