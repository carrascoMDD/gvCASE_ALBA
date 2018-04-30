/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.UnidadesOrganicas;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unidades Organicas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnidadesOrganicasTest extends ContenedorUnidadOrganicaTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnidadesOrganicasTest.class);
	}

	/**
	 * Constructs a new Unidades Organicas test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesOrganicasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unidades Organicas test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnidadesOrganicas getFixture() {
		return (UnidadesOrganicas)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createUnidadesOrganicas());
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

} //UnidadesOrganicasTest
