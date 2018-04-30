/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.SimapaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getEtiqueta() <em>Etiqueta</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AplicacionTest extends SimapaObjectTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AplicacionTest.class);
	}

	/**
	 * Constructs a new Aplicacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AplicacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aplicacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Aplicacion getFixture() {
		return (Aplicacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createAplicacion());
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

	/**
	 * Tests the '{@link es.gva.cit.simapa.Aplicacion#getEtiqueta() <em>Etiqueta</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.Aplicacion#getEtiqueta()
	 * @generated
	 */
	public void testGetEtiqueta() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AplicacionTest
