/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>proinso</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProinsoTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ProinsoTests("proinso Tests");
		suite.addTestSuite(ActividadTest.class);
		suite.addTestSuite(ActividadAbstractaTest.class);
		suite.addTestSuite(ActividadInterfazTest.class);
		suite.addTestSuite(CargoTest.class);
		suite.addTestSuite(ComiteTest.class);
		suite.addTestSuite(DocumentacionTest.class);
		suite.addTestSuite(EntradaTest.class);
		suite.addTestSuite(InterfacesTest.class);
		suite.addTestSuite(InterfazTest.class);
		suite.addTestSuite(MetodologiaTest.class);
		suite.addTestSuite(ParrafoTest.class);
		suite.addTestSuite(ParticipacionTest.class);
		suite.addTestSuite(PerfilesParticipantesTest.class);
		suite.addTestSuite(PerfilParticipanteTest.class);
		suite.addTestSuite(PracticaTest.class);
		suite.addTestSuite(PracticasTest.class);
		suite.addTestSuite(ProcesoTest.class);
		suite.addTestSuite(ProcesoInterfazTest.class);
		suite.addTestSuite(ProcesosTest.class);
		suite.addTestSuite(ProductoTest.class);
		suite.addTestSuite(ProductosTest.class);
		suite.addTestSuite(ReferenceRunTest.class);
		suite.addTestSuite(RepositorioTest.class);
		suite.addTestSuite(SalidaTest.class);
		suite.addTestSuite(SeccionTest.class);
		suite.addTestSuite(TareaTest.class);
		suite.addTestSuite(TecnicaTest.class);
		suite.addTestSuite(TecnicasTest.class);
		suite.addTestSuite(TextRunTest.class);
		suite.addTestSuite(UsoPracticaTest.class);
		suite.addTestSuite(UsoTecnicaTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoTests(String name) {
		super(name);
	}

} //ProinsoTests
