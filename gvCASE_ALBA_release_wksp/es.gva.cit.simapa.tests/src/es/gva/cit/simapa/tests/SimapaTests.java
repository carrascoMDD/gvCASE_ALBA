/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>simapa</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimapaTests extends TestSuite {
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
		TestSuite suite = new SimapaTests("simapa Tests");
		suite.addTestSuite(AplicacionTest.class);
		suite.addTestSuite(AplicacionesTest.class);
		suite.addTestSuite(ClaseDocumentoTest.class);
		suite.addTestSuite(ClasesDocumentoTest.class);
		suite.addTestSuite(ControlProcedimientoTest.class);
		suite.addTestSuite(ConvocatoriaTest.class);
		suite.addTestSuite(DecisionTest.class);
		suite.addTestSuite(DocumentoTest.class);
		suite.addTestSuite(DocumentosTest.class);
		suite.addTestSuite(DocumentoFinalInternoTest.class);
		suite.addTestSuite(EntradaDocumentoFinalTest.class);
		suite.addTestSuite(EstructuraFuncionalTest.class);
		suite.addTestSuite(EstructurasFuncionalesTest.class);
		suite.addTestSuite(FichaArchivisticaTest.class);
		suite.addTestSuite(FinProcesoTest.class);
		suite.addTestSuite(FlujoTest.class);
		suite.addTestSuite(GlosarioTest.class);
		suite.addTestSuite(NormativasYLegislacionesTest.class);
		suite.addTestSuite(NormativaYLegislacionTest.class);
		suite.addTestSuite(OperacionTest.class);
		suite.addTestSuite(OperacionesTest.class);
		suite.addTestSuite(ProcedimientoTest.class);
		suite.addTestSuite(ProcedimientosTest.class);
		suite.addTestSuite(RepositorioTest.class);
		suite.addTestSuite(SalidaDocumentoFinalTest.class);
		suite.addTestSuite(SimapaCollectionTest.class);
		suite.addTestSuite(SubprocedimientoTest.class);
		suite.addTestSuite(TerminoGlosarioTest.class);
		suite.addTestSuite(TramitacionProcedimientoTest.class);
		suite.addTestSuite(UnidadOrganicaTest.class);
		suite.addTestSuite(UnidadExternaTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaTests(String name) {
		super(name);
	}

} //SimapaTests
