/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CEstructuras Datos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CEstructurasDatosTest extends OrgcasiCollectionTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CEstructurasDatosTest.class);
	}

	/**
	 * Constructs a new CEstructuras Datos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatosTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CEstructuras Datos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CEstructurasDatos getFixture() {
		return (CEstructurasDatos)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createCEstructurasDatos());
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

} //CEstructurasDatosTest
