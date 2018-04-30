/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage
 * @generated
 */
public interface SimapaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimapaFactory eINSTANCE = es.gva.cit.simapa.impl.SimapaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repositorio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repositorio</em>'.
	 * @generated
	 */
	Repositorio createRepositorio();

	/**
	 * Returns a new object of class '<em>Normativas YLegislaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normativas YLegislaciones</em>'.
	 * @generated
	 */
	NormativasYLegislaciones createNormativasYLegislaciones();

	/**
	 * Returns a new object of class '<em>Normativa YLegislacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normativa YLegislacion</em>'.
	 * @generated
	 */
	NormativaYLegislacion createNormativaYLegislacion();

	/**
	 * Returns a new object of class '<em>Unidades Organicas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unidades Organicas</em>'.
	 * @generated
	 */
	UnidadesOrganicas createUnidadesOrganicas();

	/**
	 * Returns a new object of class '<em>Unidad Organica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unidad Organica</em>'.
	 * @generated
	 */
	UnidadOrganica createUnidadOrganica();

	/**
	 * Returns a new object of class '<em>Unidades Externas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unidades Externas</em>'.
	 * @generated
	 */
	UnidadesExternas createUnidadesExternas();

	/**
	 * Returns a new object of class '<em>Unidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unidad Externa</em>'.
	 * @generated
	 */
	UnidadExterna createUnidadExterna();

	/**
	 * Returns a new object of class '<em>Estructuras Funcionales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estructuras Funcionales</em>'.
	 * @generated
	 */
	EstructurasFuncionales createEstructurasFuncionales();

	/**
	 * Returns a new object of class '<em>Estructura Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estructura Funcional</em>'.
	 * @generated
	 */
	EstructuraFuncional createEstructuraFuncional();

	/**
	 * Returns a new object of class '<em>Clases Documento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clases Documento</em>'.
	 * @generated
	 */
	ClasesDocumento createClasesDocumento();

	/**
	 * Returns a new object of class '<em>Clase Documento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clase Documento</em>'.
	 * @generated
	 */
	ClaseDocumento createClaseDocumento();

	/**
	 * Returns a new object of class '<em>Documentos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentos</em>'.
	 * @generated
	 */
	Documentos createDocumentos();

	/**
	 * Returns a new object of class '<em>Documento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documento</em>'.
	 * @generated
	 */
	Documento createDocumento();

	/**
	 * Returns a new object of class '<em>Aplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicaciones</em>'.
	 * @generated
	 */
	Aplicaciones createAplicaciones();

	/**
	 * Returns a new object of class '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacion</em>'.
	 * @generated
	 */
	Aplicacion createAplicacion();

	/**
	 * Returns a new object of class '<em>Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glosario</em>'.
	 * @generated
	 */
	Glosario createGlosario();

	/**
	 * Returns a new object of class '<em>Termino Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termino Glosario</em>'.
	 * @generated
	 */
	TerminoGlosario createTerminoGlosario();

	/**
	 * Returns a new object of class '<em>Procedimientos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedimientos</em>'.
	 * @generated
	 */
	Procedimientos createProcedimientos();

	/**
	 * Returns a new object of class '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedimiento</em>'.
	 * @generated
	 */
	Procedimiento createProcedimiento();

	/**
	 * Returns a new object of class '<em>Ficha Archivistica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ficha Archivistica</em>'.
	 * @generated
	 */
	FichaArchivistica createFichaArchivistica();

	/**
	 * Returns a new object of class '<em>Convocatoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convocatoria</em>'.
	 * @generated
	 */
	Convocatoria createConvocatoria();

	/**
	 * Returns a new object of class '<em>Control Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Procedimiento</em>'.
	 * @generated
	 */
	ControlProcedimiento createControlProcedimiento();

	/**
	 * Returns a new object of class '<em>Tramitacion Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tramitacion Procedimiento</em>'.
	 * @generated
	 */
	TramitacionProcedimiento createTramitacionProcedimiento();

	/**
	 * Returns a new object of class '<em>Operaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operaciones</em>'.
	 * @generated
	 */
	Operaciones createOperaciones();

	/**
	 * Returns a new object of class '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacion</em>'.
	 * @generated
	 */
	Operacion createOperacion();

	/**
	 * Returns a new object of class '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision</em>'.
	 * @generated
	 */
	Decision createDecision();

	/**
	 * Returns a new object of class '<em>Subprocedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprocedimiento</em>'.
	 * @generated
	 */
	Subprocedimiento createSubprocedimiento();

	/**
	 * Returns a new object of class '<em>Documento Final Interno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documento Final Interno</em>'.
	 * @generated
	 */
	DocumentoFinalInterno createDocumentoFinalInterno();

	/**
	 * Returns a new object of class '<em>Entrada Documento Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada Documento Final</em>'.
	 * @generated
	 */
	EntradaDocumentoFinal createEntradaDocumentoFinal();

	/**
	 * Returns a new object of class '<em>Salida Documento Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida Documento Final</em>'.
	 * @generated
	 */
	SalidaDocumentoFinal createSalidaDocumentoFinal();

	/**
	 * Returns a new object of class '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection</em>'.
	 * @generated
	 */
	SimapaCollection createSimapaCollection();

	/**
	 * Returns a new object of class '<em>Fin Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin Proceso</em>'.
	 * @generated
	 */
	FinProceso createFinProceso();

	/**
	 * Returns a new object of class '<em>Flujo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flujo</em>'.
	 * @generated
	 */
	Flujo createFlujo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimapaPackage getSimapaPackage();

} //SimapaFactory
