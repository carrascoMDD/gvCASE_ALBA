/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CRelaciones Datos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CRelacionesDatosTest extends OrgcasiCollectionTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CRelacionesDatosTest.class);
	}

	/**
	 * Constructs a new CRelaciones Datos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelacionesDatosTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CRelaciones Datos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CRelacionesDatos getFixture() {
		return (CRelacionesDatos)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createCRelacionesDatos());
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

} //CRelacionesDatosTest
