/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.util;

import es.gva.cit.simapa.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage
 * @generated
 */
public class SimapaSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimapaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaSwitch() {
		if (modelPackage == null) {
			modelPackage = SimapaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimapaPackage.APLICACION: {
				Aplicacion aplicacion = (Aplicacion)theEObject;
				Object result = caseAplicacion(aplicacion);
				if (result == null) result = caseSimapaObject(aplicacion);
				if (result == null) result = caseConModelClass(aplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.APLICACIONES: {
				Aplicaciones aplicaciones = (Aplicaciones)theEObject;
				Object result = caseAplicaciones(aplicaciones);
				if (result == null) result = caseSimapaCollection(aplicaciones);
				if (result == null) result = caseSimapaObject(aplicaciones);
				if (result == null) result = caseConModelClass(aplicaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CLASE_DOCUMENTO: {
				ClaseDocumento claseDocumento = (ClaseDocumento)theEObject;
				Object result = caseClaseDocumento(claseDocumento);
				if (result == null) result = caseSimapaObject(claseDocumento);
				if (result == null) result = caseConModelClass(claseDocumento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CLASES_DOCUMENTO: {
				ClasesDocumento clasesDocumento = (ClasesDocumento)theEObject;
				Object result = caseClasesDocumento(clasesDocumento);
				if (result == null) result = caseSimapaCollection(clasesDocumento);
				if (result == null) result = caseSimapaObject(clasesDocumento);
				if (result == null) result = caseConModelClass(clasesDocumento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CON_MODEL_CLASS: {
				ConModelClass conModelClass = (ConModelClass)theEObject;
				Object result = caseConModelClass(conModelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL: {
				ContenedorEstructuraFuncional contenedorEstructuraFuncional = (ContenedorEstructuraFuncional)theEObject;
				Object result = caseContenedorEstructuraFuncional(contenedorEstructuraFuncional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA: {
				ContenedorUnidadExterna contenedorUnidadExterna = (ContenedorUnidadExterna)theEObject;
				Object result = caseContenedorUnidadExterna(contenedorUnidadExterna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CONTENEDOR_UNIDAD_ORGANICA: {
				ContenedorUnidadOrganica contenedorUnidadOrganica = (ContenedorUnidadOrganica)theEObject;
				Object result = caseContenedorUnidadOrganica(contenedorUnidadOrganica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CONTROL_PROCEDIMIENTO: {
				ControlProcedimiento controlProcedimiento = (ControlProcedimiento)theEObject;
				Object result = caseControlProcedimiento(controlProcedimiento);
				if (result == null) result = caseSimapaObject(controlProcedimiento);
				if (result == null) result = caseConModelClass(controlProcedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.CONVOCATORIA: {
				Convocatoria convocatoria = (Convocatoria)theEObject;
				Object result = caseConvocatoria(convocatoria);
				if (result == null) result = caseSimapaObject(convocatoria);
				if (result == null) result = caseConModelClass(convocatoria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				Object result = caseDecision(decision);
				if (result == null) result = caseOperacion(decision);
				if (result == null) result = caseSimapaObject(decision);
				if (result == null) result = caseConModelClass(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.DOCUMENTO: {
				Documento documento = (Documento)theEObject;
				Object result = caseDocumento(documento);
				if (result == null) result = caseSimapaObject(documento);
				if (result == null) result = caseConModelClass(documento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.DOCUMENTOS: {
				Documentos documentos = (Documentos)theEObject;
				Object result = caseDocumentos(documentos);
				if (result == null) result = caseSimapaCollection(documentos);
				if (result == null) result = caseSimapaObject(documentos);
				if (result == null) result = caseConModelClass(documentos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.DOCUMENTO_FINAL: {
				DocumentoFinal documentoFinal = (DocumentoFinal)theEObject;
				Object result = caseDocumentoFinal(documentoFinal);
				if (result == null) result = caseOperacion(documentoFinal);
				if (result == null) result = caseSimapaObject(documentoFinal);
				if (result == null) result = caseConModelClass(documentoFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.DOCUMENTO_FINAL_INTERNO: {
				DocumentoFinalInterno documentoFinalInterno = (DocumentoFinalInterno)theEObject;
				Object result = caseDocumentoFinalInterno(documentoFinalInterno);
				if (result == null) result = caseDocumentoFinal(documentoFinalInterno);
				if (result == null) result = caseOperacion(documentoFinalInterno);
				if (result == null) result = caseSimapaObject(documentoFinalInterno);
				if (result == null) result = caseConModelClass(documentoFinalInterno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.ENTRADA_DOCUMENTO_FINAL: {
				EntradaDocumentoFinal entradaDocumentoFinal = (EntradaDocumentoFinal)theEObject;
				Object result = caseEntradaDocumentoFinal(entradaDocumentoFinal);
				if (result == null) result = caseDocumentoFinal(entradaDocumentoFinal);
				if (result == null) result = caseOperacion(entradaDocumentoFinal);
				if (result == null) result = caseSimapaObject(entradaDocumentoFinal);
				if (result == null) result = caseConModelClass(entradaDocumentoFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.ESTRUCTURA_FUNCIONAL: {
				EstructuraFuncional estructuraFuncional = (EstructuraFuncional)theEObject;
				Object result = caseEstructuraFuncional(estructuraFuncional);
				if (result == null) result = caseSimapaObject(estructuraFuncional);
				if (result == null) result = caseContenedorEstructuraFuncional(estructuraFuncional);
				if (result == null) result = caseConModelClass(estructuraFuncional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES: {
				EstructurasFuncionales estructurasFuncionales = (EstructurasFuncionales)theEObject;
				Object result = caseEstructurasFuncionales(estructurasFuncionales);
				if (result == null) result = caseSimapaCollection(estructurasFuncionales);
				if (result == null) result = caseContenedorEstructuraFuncional(estructurasFuncionales);
				if (result == null) result = caseSimapaObject(estructurasFuncionales);
				if (result == null) result = caseConModelClass(estructurasFuncionales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.FICHA_ARCHIVISTICA: {
				FichaArchivistica fichaArchivistica = (FichaArchivistica)theEObject;
				Object result = caseFichaArchivistica(fichaArchivistica);
				if (result == null) result = caseSimapaObject(fichaArchivistica);
				if (result == null) result = caseConModelClass(fichaArchivistica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.FIN_PROCESO: {
				FinProceso finProceso = (FinProceso)theEObject;
				Object result = caseFinProceso(finProceso);
				if (result == null) result = caseOperacion(finProceso);
				if (result == null) result = caseSimapaObject(finProceso);
				if (result == null) result = caseConModelClass(finProceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.FLUJO: {
				Flujo flujo = (Flujo)theEObject;
				Object result = caseFlujo(flujo);
				if (result == null) result = caseSimapaObject(flujo);
				if (result == null) result = caseConModelClass(flujo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.GLOSARIO: {
				Glosario glosario = (Glosario)theEObject;
				Object result = caseGlosario(glosario);
				if (result == null) result = caseSimapaObject(glosario);
				if (result == null) result = caseConModelClass(glosario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES: {
				NormativasYLegislaciones normativasYLegislaciones = (NormativasYLegislaciones)theEObject;
				Object result = caseNormativasYLegislaciones(normativasYLegislaciones);
				if (result == null) result = caseSimapaCollection(normativasYLegislaciones);
				if (result == null) result = caseSimapaObject(normativasYLegislaciones);
				if (result == null) result = caseConModelClass(normativasYLegislaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.NORMATIVA_YLEGISLACION: {
				NormativaYLegislacion normativaYLegislacion = (NormativaYLegislacion)theEObject;
				Object result = caseNormativaYLegislacion(normativaYLegislacion);
				if (result == null) result = caseSimapaObject(normativaYLegislacion);
				if (result == null) result = caseConModelClass(normativaYLegislacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.OPERACION: {
				Operacion operacion = (Operacion)theEObject;
				Object result = caseOperacion(operacion);
				if (result == null) result = caseSimapaObject(operacion);
				if (result == null) result = caseConModelClass(operacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.OPERACIONES: {
				Operaciones operaciones = (Operaciones)theEObject;
				Object result = caseOperaciones(operaciones);
				if (result == null) result = caseSimapaCollection(operaciones);
				if (result == null) result = caseSimapaObject(operaciones);
				if (result == null) result = caseConModelClass(operaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.PROCEDIMIENTO: {
				Procedimiento procedimiento = (Procedimiento)theEObject;
				Object result = caseProcedimiento(procedimiento);
				if (result == null) result = caseSimapaObject(procedimiento);
				if (result == null) result = caseConModelClass(procedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.PROCEDIMIENTOS: {
				Procedimientos procedimientos = (Procedimientos)theEObject;
				Object result = caseProcedimientos(procedimientos);
				if (result == null) result = caseSimapaCollection(procedimientos);
				if (result == null) result = caseSimapaObject(procedimientos);
				if (result == null) result = caseConModelClass(procedimientos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.REPOSITORIO: {
				Repositorio repositorio = (Repositorio)theEObject;
				Object result = caseRepositorio(repositorio);
				if (result == null) result = caseSimapaObject(repositorio);
				if (result == null) result = caseConModelClass(repositorio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.SALIDA_DOCUMENTO_FINAL: {
				SalidaDocumentoFinal salidaDocumentoFinal = (SalidaDocumentoFinal)theEObject;
				Object result = caseSalidaDocumentoFinal(salidaDocumentoFinal);
				if (result == null) result = caseDocumentoFinal(salidaDocumentoFinal);
				if (result == null) result = caseOperacion(salidaDocumentoFinal);
				if (result == null) result = caseSimapaObject(salidaDocumentoFinal);
				if (result == null) result = caseConModelClass(salidaDocumentoFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.SIMAPA_COLLECTION: {
				SimapaCollection simapaCollection = (SimapaCollection)theEObject;
				Object result = caseSimapaCollection(simapaCollection);
				if (result == null) result = caseSimapaObject(simapaCollection);
				if (result == null) result = caseConModelClass(simapaCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.SIMAPA_OBJECT: {
				SimapaObject simapaObject = (SimapaObject)theEObject;
				Object result = caseSimapaObject(simapaObject);
				if (result == null) result = caseConModelClass(simapaObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.SUBPROCEDIMIENTO: {
				Subprocedimiento subprocedimiento = (Subprocedimiento)theEObject;
				Object result = caseSubprocedimiento(subprocedimiento);
				if (result == null) result = caseOperacion(subprocedimiento);
				if (result == null) result = caseSimapaObject(subprocedimiento);
				if (result == null) result = caseConModelClass(subprocedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.TERMINO_GLOSARIO: {
				TerminoGlosario terminoGlosario = (TerminoGlosario)theEObject;
				Object result = caseTerminoGlosario(terminoGlosario);
				if (result == null) result = caseSimapaObject(terminoGlosario);
				if (result == null) result = caseConModelClass(terminoGlosario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO: {
				TramitacionProcedimiento tramitacionProcedimiento = (TramitacionProcedimiento)theEObject;
				Object result = caseTramitacionProcedimiento(tramitacionProcedimiento);
				if (result == null) result = caseSimapaObject(tramitacionProcedimiento);
				if (result == null) result = caseConModelClass(tramitacionProcedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.UNIDAD: {
				Unidad unidad = (Unidad)theEObject;
				Object result = caseUnidad(unidad);
				if (result == null) result = caseSimapaObject(unidad);
				if (result == null) result = caseConModelClass(unidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.UNIDADES_ORGANICAS: {
				UnidadesOrganicas unidadesOrganicas = (UnidadesOrganicas)theEObject;
				Object result = caseUnidadesOrganicas(unidadesOrganicas);
				if (result == null) result = caseContenedorUnidadOrganica(unidadesOrganicas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.UNIDAD_ORGANICA: {
				UnidadOrganica unidadOrganica = (UnidadOrganica)theEObject;
				Object result = caseUnidadOrganica(unidadOrganica);
				if (result == null) result = caseUnidad(unidadOrganica);
				if (result == null) result = caseContenedorUnidadOrganica(unidadOrganica);
				if (result == null) result = caseSimapaObject(unidadOrganica);
				if (result == null) result = caseConModelClass(unidadOrganica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.UNIDADES_EXTERNAS: {
				UnidadesExternas unidadesExternas = (UnidadesExternas)theEObject;
				Object result = caseUnidadesExternas(unidadesExternas);
				if (result == null) result = caseContenedorUnidadExterna(unidadesExternas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimapaPackage.UNIDAD_EXTERNA: {
				UnidadExterna unidadExterna = (UnidadExterna)theEObject;
				Object result = caseUnidadExterna(unidadExterna);
				if (result == null) result = caseUnidad(unidadExterna);
				if (result == null) result = caseContenedorUnidadExterna(unidadExterna);
				if (result == null) result = caseSimapaObject(unidadExterna);
				if (result == null) result = caseConModelClass(unidadExterna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repositorio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repositorio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepositorio(Repositorio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Normativas YLegislaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Normativas YLegislaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNormativasYLegislaciones(NormativasYLegislaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Normativa YLegislacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Normativa YLegislacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNormativaYLegislacion(NormativaYLegislacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnidad(Unidad object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Unidad Organica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Unidad Organica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorUnidadOrganica(ContenedorUnidadOrganica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unidades Organicas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unidades Organicas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnidadesOrganicas(UnidadesOrganicas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unidad Organica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unidad Organica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnidadOrganica(UnidadOrganica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Unidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Unidad Externa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorUnidadExterna(ContenedorUnidadExterna object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unidades Externas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unidades Externas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnidadesExternas(UnidadesExternas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unidad Externa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnidadExterna(UnidadExterna object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Estructura Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Estructura Funcional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorEstructuraFuncional(ContenedorEstructuraFuncional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Estructuras Funcionales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Estructuras Funcionales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEstructurasFuncionales(EstructurasFuncionales object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Estructura Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Estructura Funcional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEstructuraFuncional(EstructuraFuncional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clases Documento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clases Documento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClasesDocumento(ClasesDocumento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConModelClass(ConModelClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clase Documento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clase Documento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClaseDocumento(ClaseDocumento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documentos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documentos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentos(Documentos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumento(Documento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Aplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Aplicaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAplicaciones(Aplicaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Aplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAplicacion(Aplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Glosario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGlosario(Glosario object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Termino Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Termino Glosario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTerminoGlosario(TerminoGlosario object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Procedimientos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Procedimientos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcedimientos(Procedimientos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcedimiento(Procedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ficha Archivistica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ficha Archivistica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFichaArchivistica(FichaArchivistica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Convocatoria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Convocatoria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConvocatoria(Convocatoria object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Control Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Control Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlProcedimiento(ControlProcedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tramitacion Procedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tramitacion Procedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTramitacionProcedimiento(TramitacionProcedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperaciones(Operaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperacion(Operacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Subprocedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Subprocedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubprocedimiento(Subprocedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documento Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documento Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentoFinal(DocumentoFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documento Final Interno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documento Final Interno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentoFinalInterno(DocumentoFinalInterno object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada Documento Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada Documento Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntradaDocumentoFinal(EntradaDocumentoFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida Documento Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida Documento Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalidaDocumentoFinal(SalidaDocumentoFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimapaCollection(SimapaCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimapaObject(SimapaObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Fin Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Fin Proceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFinProceso(FinProceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Flujo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Flujo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlujo(Flujo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SimapaSwitch
