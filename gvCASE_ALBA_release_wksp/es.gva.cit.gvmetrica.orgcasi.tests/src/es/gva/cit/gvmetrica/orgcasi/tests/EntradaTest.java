/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.Entrada;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entrada</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntradaTest extends EntradaOSalidaTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntradaTest.class);
	}

	/**
	 * Constructs a new Entrada test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entrada test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Entrada getFixture() {
		return (Entrada)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createEntrada());
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

} //EntradaTest
