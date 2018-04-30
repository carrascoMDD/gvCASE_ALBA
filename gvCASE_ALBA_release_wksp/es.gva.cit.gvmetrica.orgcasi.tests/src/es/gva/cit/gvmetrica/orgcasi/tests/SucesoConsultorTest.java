/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.SucesoConsultor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suceso Consultor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SucesoConsultorTest extends SucesoTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SucesoConsultorTest.class);
	}

	/**
	 * Constructs a new Suceso Consultor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SucesoConsultorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Suceso Consultor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SucesoConsultor getFixture() {
		return (SucesoConsultor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createSucesoConsultor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SucesoConsultorTest
