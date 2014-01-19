/**
 */
package com.remainsoftware.fde.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import com.remainsoftware.fde.model.ModelFactory;
import com.remainsoftware.fde.model.SiteToVisit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Site To Visit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteToVisitTest extends TestCase {

	/**
	 * The fixture for this Site To Visit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteToVisit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SiteToVisitTest.class);
	}

	/**
	 * Constructs a new Site To Visit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteToVisitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Site To Visit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SiteToVisit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Site To Visit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteToVisit getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createSiteToVisit());
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

} //SiteToVisitTest
