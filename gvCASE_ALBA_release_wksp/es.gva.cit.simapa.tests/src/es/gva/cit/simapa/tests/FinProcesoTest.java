/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.FinProceso;
import es.gva.cit.simapa.SimapaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fin Proceso</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinProcesoTest extends OperacionTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinProcesoTest.class);
	}

	/**
	 * Constructs a new Fin Proceso test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinProcesoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fin Proceso test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FinProceso getFixture() {
		return (FinProceso)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createFinProceso());
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

} //FinProcesoTest
