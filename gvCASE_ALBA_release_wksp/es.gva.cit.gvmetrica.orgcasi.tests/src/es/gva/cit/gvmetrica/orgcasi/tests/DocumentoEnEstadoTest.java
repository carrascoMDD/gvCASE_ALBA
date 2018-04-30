/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.tests;

import es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Documento En Estado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentoEnEstadoTest extends ADocumentoTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentoEnEstadoTest.class);
	}

	/**
	 * Constructs a new Documento En Estado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoEnEstadoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Documento En Estado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DocumentoEnEstado getFixture() {
		return (DocumentoEnEstado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrgcasiFactory.eINSTANCE.createDocumentoEnEstado());
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

} //DocumentoEnEstadoTest