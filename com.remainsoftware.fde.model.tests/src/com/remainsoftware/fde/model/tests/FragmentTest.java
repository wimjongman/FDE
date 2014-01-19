/**
 */
package com.remainsoftware.fde.model.tests;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.Fragment;
import com.remainsoftware.fde.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentTest extends ManifestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FragmentTest.class);
	}

	/**
	 * Constructs a new Fragment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fragment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fragment getFixture() {
		return (Fragment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createFragment());
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

} //FragmentTest
