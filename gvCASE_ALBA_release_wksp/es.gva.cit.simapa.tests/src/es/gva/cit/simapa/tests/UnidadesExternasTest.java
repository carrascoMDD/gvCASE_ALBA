/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.UnidadesExternas;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unidades Externas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnidadesExternasTest extends ContenedorUnidadExternaTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnidadesExternasTest.class);
	}

	/**
	 * Constructs a new Unidades Externas test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesExternasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unidades Externas test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnidadesExternas getFixture() {
		return (UnidadesExternas)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createUnidadesExternas());
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

} //UnidadesExternasTest
