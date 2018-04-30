/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repositorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getModelPackage() <em>Model Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RepositorioTest extends SimapaObjectTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepositorioTest.class);
	}

	/**
	 * Constructs a new Repositorio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositorioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Repositorio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Repositorio getFixture() {
		return (Repositorio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createRepositorio());
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
	 * Tests the '{@link es.gva.cit.simapa.Repositorio#getModelPackage() <em>Model Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.Repositorio#getModelPackage()
	 * @generated
	 */
	public void testGetModelPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RepositorioTest
