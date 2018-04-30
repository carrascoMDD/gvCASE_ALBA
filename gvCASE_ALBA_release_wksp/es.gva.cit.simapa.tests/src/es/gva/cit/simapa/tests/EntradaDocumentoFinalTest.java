/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import es.gva.cit.simapa.EntradaDocumentoFinal;
import es.gva.cit.simapa.SimapaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entrada Documento Final</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntradaDocumentoFinalTest extends DocumentoFinalTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntradaDocumentoFinalTest.class);
	}

	/**
	 * Constructs a new Entrada Documento Final test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaDocumentoFinalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entrada Documento Final test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EntradaDocumentoFinal getFixture() {
		return (EntradaDocumentoFinal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SimapaFactory.eINSTANCE.createEntradaDocumentoFinal());
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

} //EntradaDocumentoFinalTest
