/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.SalidaDocumentoFinal;
import es.gva.cit.simapa.SimapaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Salida Documento Final</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalidaDocumentoFinalTest extends DocumentoFinalTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SalidaDocumentoFinalTest.class);
	}

	/**
	 * Constructs a new Salida Documento Final test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalidaDocumentoFinalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Salida Documento Final test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SalidaDocumentoFinal getFixture() {
		return (SalidaDocumentoFinal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createSalidaDocumentoFinal());
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

} //SalidaDocumentoFinalTest
