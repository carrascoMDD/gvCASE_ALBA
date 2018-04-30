/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.UsoServicio;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uso Servicio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsoServicioTest extends AccionTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsoServicioTest.class);
	}

	/**
	 * Constructs a new Uso Servicio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoServicioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uso Servicio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UsoServicio getFixture() {
		return (UsoServicio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createUsoServicio());
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

} //UsoServicioTest
