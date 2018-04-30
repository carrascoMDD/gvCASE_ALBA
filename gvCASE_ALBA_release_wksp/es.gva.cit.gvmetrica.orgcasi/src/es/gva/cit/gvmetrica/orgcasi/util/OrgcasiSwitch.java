/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.util;

import es.gva.cit.gvmetrica.orgcasi.*;

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
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage
 * @generated
 */
public class OrgcasiSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrgcasiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiSwitch() {
		if (modelPackage == null) {
			modelPackage = OrgcasiPackage.eINSTANCE;
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
			case OrgcasiPackage.AAPLICACION: {
				AAplicacion aAplicacion = (AAplicacion)theEObject;
				Object result = caseAAplicacion(aAplicacion);
				if (result == null) result = caseAnotacion(aAplicacion);
				if (result == null) result = caseOrgcasiObject(aAplicacion);
				if (result == null) result = caseConModelClass(aAplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ACCION: {
				Accion accion = (Accion)theEObject;
				Object result = caseAccion(accion);
				if (result == null) result = caseOrgcasiObject(accion);
				if (result == null) result = caseConModelClass(accion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				Object result = caseActor(actor);
				if (result == null) result = caseOrgcasiObject(actor);
				if (result == null) result = caseConModelClass(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ACTOR_FUNCIONAL: {
				ActorFuncional actorFuncional = (ActorFuncional)theEObject;
				Object result = caseActorFuncional(actorFuncional);
				if (result == null) result = caseActor(actorFuncional);
				if (result == null) result = caseOrgcasiObject(actorFuncional);
				if (result == null) result = caseConModelClass(actorFuncional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ADOCUMENTO: {
				ADocumento aDocumento = (ADocumento)theEObject;
				Object result = caseADocumento(aDocumento);
				if (result == null) result = caseAnotacion(aDocumento);
				if (result == null) result = caseOrgcasiObject(aDocumento);
				if (result == null) result = caseConModelClass(aDocumento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ADOCUMENTO_FINAL: {
				ADocumentoFinal aDocumentoFinal = (ADocumentoFinal)theEObject;
				Object result = caseADocumentoFinal(aDocumentoFinal);
				if (result == null) result = caseAOperacion(aDocumentoFinal);
				if (result == null) result = caseAnotacion(aDocumentoFinal);
				if (result == null) result = caseOrgcasiObject(aDocumentoFinal);
				if (result == null) result = caseConModelClass(aDocumentoFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL: {
				AEstructuraFuncional aEstructuraFuncional = (AEstructuraFuncional)theEObject;
				Object result = caseAEstructuraFuncional(aEstructuraFuncional);
				if (result == null) result = caseAnotacion(aEstructuraFuncional);
				if (result == null) result = caseOrgcasiObject(aEstructuraFuncional);
				if (result == null) result = caseConModelClass(aEstructuraFuncional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AFLUJO: {
				AFlujo aFlujo = (AFlujo)theEObject;
				Object result = caseAFlujo(aFlujo);
				if (result == null) result = caseAnotacion(aFlujo);
				if (result == null) result = caseOrgcasiObject(aFlujo);
				if (result == null) result = caseConModelClass(aFlujo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AGRUPACION: {
				Agrupacion agrupacion = (Agrupacion)theEObject;
				Object result = caseAgrupacion(agrupacion);
				if (result == null) result = caseOrgcasiObject(agrupacion);
				if (result == null) result = caseConModelClass(agrupacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION: {
				ANormativaYLegislacion aNormativaYLegislacion = (ANormativaYLegislacion)theEObject;
				Object result = caseANormativaYLegislacion(aNormativaYLegislacion);
				if (result == null) result = caseAnotacion(aNormativaYLegislacion);
				if (result == null) result = caseOrgcasiObject(aNormativaYLegislacion);
				if (result == null) result = caseConModelClass(aNormativaYLegislacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ANOTACION: {
				Anotacion anotacion = (Anotacion)theEObject;
				Object result = caseAnotacion(anotacion);
				if (result == null) result = caseOrgcasiObject(anotacion);
				if (result == null) result = caseConModelClass(anotacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AOPERACION: {
				AOperacion aOperacion = (AOperacion)theEObject;
				Object result = caseAOperacion(aOperacion);
				if (result == null) result = caseAnotacion(aOperacion);
				if (result == null) result = caseOrgcasiObject(aOperacion);
				if (result == null) result = caseConModelClass(aOperacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.APROCEDIMIENTO: {
				AProcedimiento aProcedimiento = (AProcedimiento)theEObject;
				Object result = caseAProcedimiento(aProcedimiento);
				if (result == null) result = caseAnotacion(aProcedimiento);
				if (result == null) result = caseContenedorSubsistemas(aProcedimiento);
				if (result == null) result = caseContenedorSucesos(aProcedimiento);
				if (result == null) result = caseContenedorDocumentos(aProcedimiento);
				if (result == null) result = caseContenedorDatos(aProcedimiento);
				if (result == null) result = caseImportadorServicios(aProcedimiento);
				if (result == null) result = caseOrgcasiObject(aProcedimiento);
				if (result == null) result = caseConModelClass(aProcedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AREPOSITORIO: {
				ARepositorio aRepositorio = (ARepositorio)theEObject;
				Object result = caseARepositorio(aRepositorio);
				if (result == null) result = caseAnotacion(aRepositorio);
				if (result == null) result = caseOrgcasiObject(aRepositorio);
				if (result == null) result = caseConModelClass(aRepositorio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ASUBPROCEDIMIENTO: {
				ASubprocedimiento aSubprocedimiento = (ASubprocedimiento)theEObject;
				Object result = caseASubprocedimiento(aSubprocedimiento);
				if (result == null) result = caseAOperacion(aSubprocedimiento);
				if (result == null) result = caseAnotacion(aSubprocedimiento);
				if (result == null) result = caseOrgcasiObject(aSubprocedimiento);
				if (result == null) result = caseConModelClass(aSubprocedimiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ATERMINO_GLOSARIO: {
				ATerminoGlosario aTerminoGlosario = (ATerminoGlosario)theEObject;
				Object result = caseATerminoGlosario(aTerminoGlosario);
				if (result == null) result = caseAnotacion(aTerminoGlosario);
				if (result == null) result = caseOrgcasiObject(aTerminoGlosario);
				if (result == null) result = caseConModelClass(aTerminoGlosario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AUNIDAD: {
				AUnidad aUnidad = (AUnidad)theEObject;
				Object result = caseAUnidad(aUnidad);
				if (result == null) result = caseAnotacion(aUnidad);
				if (result == null) result = caseOrgcasiObject(aUnidad);
				if (result == null) result = caseConModelClass(aUnidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AUNIDAD_EXTERNA: {
				AUnidadExterna aUnidadExterna = (AUnidadExterna)theEObject;
				Object result = caseAUnidadExterna(aUnidadExterna);
				if (result == null) result = caseAUnidad(aUnidadExterna);
				if (result == null) result = caseAnotacion(aUnidadExterna);
				if (result == null) result = caseOrgcasiObject(aUnidadExterna);
				if (result == null) result = caseConModelClass(aUnidadExterna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.AUNIDAD_ORGANICA: {
				AUnidadOrganica aUnidadOrganica = (AUnidadOrganica)theEObject;
				Object result = caseAUnidadOrganica(aUnidadOrganica);
				if (result == null) result = caseAUnidad(aUnidadOrganica);
				if (result == null) result = caseAnotacion(aUnidadOrganica);
				if (result == null) result = caseOrgcasiObject(aUnidadOrganica);
				if (result == null) result = caseConModelClass(aUnidadOrganica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CACCIONES_SUCESO: {
				CAccionesSuceso cAccionesSuceso = (CAccionesSuceso)theEObject;
				Object result = caseCAccionesSuceso(cAccionesSuceso);
				if (result == null) result = caseOrgcasiCollection(cAccionesSuceso);
				if (result == null) result = caseOrgcasiObject(cAccionesSuceso);
				if (result == null) result = caseConModelClass(cAccionesSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CACTORES: {
				CActores cActores = (CActores)theEObject;
				Object result = caseCActores(cActores);
				if (result == null) result = caseOrgcasiCollection(cActores);
				if (result == null) result = caseOrgcasiObject(cActores);
				if (result == null) result = caseConModelClass(cActores);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CACTORES_SUCESO: {
				CActoresSuceso cActoresSuceso = (CActoresSuceso)theEObject;
				Object result = caseCActoresSuceso(cActoresSuceso);
				if (result == null) result = caseOrgcasiCollection(cActoresSuceso);
				if (result == null) result = caseOrgcasiObject(cActoresSuceso);
				if (result == null) result = caseConModelClass(cActoresSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CAMPO_DATOS: {
				CampoDatos campoDatos = (CampoDatos)theEObject;
				Object result = caseCampoDatos(campoDatos);
				if (result == null) result = caseOrgcasiObject(campoDatos);
				if (result == null) result = caseConModelClass(campoDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CAPLICACIONES: {
				CAplicaciones cAplicaciones = (CAplicaciones)theEObject;
				Object result = caseCAplicaciones(cAplicaciones);
				if (result == null) result = caseOrgcasiCollection(cAplicaciones);
				if (result == null) result = caseOrgcasiObject(cAplicaciones);
				if (result == null) result = caseConModelClass(cAplicaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CCAMPOS_DATOS: {
				CCamposDatos cCamposDatos = (CCamposDatos)theEObject;
				Object result = caseCCamposDatos(cCamposDatos);
				if (result == null) result = caseOrgcasiCollection(cCamposDatos);
				if (result == null) result = caseOrgcasiObject(cCamposDatos);
				if (result == null) result = caseConModelClass(cCamposDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CDOCUMENTOS: {
				CDocumentos cDocumentos = (CDocumentos)theEObject;
				Object result = caseCDocumentos(cDocumentos);
				if (result == null) result = caseOrgcasiCollection(cDocumentos);
				if (result == null) result = caseOrgcasiObject(cDocumentos);
				if (result == null) result = caseConModelClass(cDocumentos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CENTRADAS_ACCION: {
				CEntradasAccion cEntradasAccion = (CEntradasAccion)theEObject;
				Object result = caseCEntradasAccion(cEntradasAccion);
				if (result == null) result = caseOrgcasiCollection(cEntradasAccion);
				if (result == null) result = caseOrgcasiObject(cEntradasAccion);
				if (result == null) result = caseConModelClass(cEntradasAccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CENTRADAS_SUCESO: {
				CEntradasSuceso cEntradasSuceso = (CEntradasSuceso)theEObject;
				Object result = caseCEntradasSuceso(cEntradasSuceso);
				if (result == null) result = caseOrgcasiCollection(cEntradasSuceso);
				if (result == null) result = caseOrgcasiObject(cEntradasSuceso);
				if (result == null) result = caseConModelClass(cEntradasSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CESTRUCTURAS_DATOS: {
				CEstructurasDatos cEstructurasDatos = (CEstructurasDatos)theEObject;
				Object result = caseCEstructurasDatos(cEstructurasDatos);
				if (result == null) result = caseOrgcasiCollection(cEstructurasDatos);
				if (result == null) result = caseOrgcasiObject(cEstructurasDatos);
				if (result == null) result = caseConModelClass(cEstructurasDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO: {
				CEstructurasDatosSuceso cEstructurasDatosSuceso = (CEstructurasDatosSuceso)theEObject;
				Object result = caseCEstructurasDatosSuceso(cEstructurasDatosSuceso);
				if (result == null) result = caseOrgcasiCollection(cEstructurasDatosSuceso);
				if (result == null) result = caseOrgcasiObject(cEstructurasDatosSuceso);
				if (result == null) result = caseConModelClass(cEstructurasDatosSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CFLUJOS: {
				CFlujos cFlujos = (CFlujos)theEObject;
				Object result = caseCFlujos(cFlujos);
				if (result == null) result = caseOrgcasiCollection(cFlujos);
				if (result == null) result = caseOrgcasiObject(cFlujos);
				if (result == null) result = caseConModelClass(cFlujos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CFLUJOS_SUCESO: {
				CFlujosSuceso cFlujosSuceso = (CFlujosSuceso)theEObject;
				Object result = caseCFlujosSuceso(cFlujosSuceso);
				if (result == null) result = caseOrgcasiCollection(cFlujosSuceso);
				if (result == null) result = caseOrgcasiObject(cFlujosSuceso);
				if (result == null) result = caseConModelClass(cFlujosSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES: {
				CEstructurasFuncionales cEstructurasFuncionales = (CEstructurasFuncionales)theEObject;
				Object result = caseCEstructurasFuncionales(cEstructurasFuncionales);
				if (result == null) result = caseOrgcasiCollection(cEstructurasFuncionales);
				if (result == null) result = caseOrgcasiObject(cEstructurasFuncionales);
				if (result == null) result = caseConModelClass(cEstructurasFuncionales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CIMPORTACIONES_POR: {
				CImportacionesPor cImportacionesPor = (CImportacionesPor)theEObject;
				Object result = caseCImportacionesPor(cImportacionesPor);
				if (result == null) result = caseOrgcasiCollection(cImportacionesPor);
				if (result == null) result = caseOrgcasiObject(cImportacionesPor);
				if (result == null) result = caseConModelClass(cImportacionesPor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS: {
				CImportacionesServicios cImportacionesServicios = (CImportacionesServicios)theEObject;
				Object result = caseCImportacionesServicios(cImportacionesServicios);
				if (result == null) result = caseOrgcasiCollection(cImportacionesServicios);
				if (result == null) result = caseOrgcasiObject(cImportacionesServicios);
				if (result == null) result = caseConModelClass(cImportacionesServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CINTERFACES: {
				CInterfaces cInterfaces = (CInterfaces)theEObject;
				Object result = caseCInterfaces(cInterfaces);
				if (result == null) result = caseOrgcasiCollection(cInterfaces);
				if (result == null) result = caseOrgcasiObject(cInterfaces);
				if (result == null) result = caseConModelClass(cInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS: {
				CLibreriasServicios cLibreriasServicios = (CLibreriasServicios)theEObject;
				Object result = caseCLibreriasServicios(cLibreriasServicios);
				if (result == null) result = caseOrgcasiCollection(cLibreriasServicios);
				if (result == null) result = caseOrgcasiObject(cLibreriasServicios);
				if (result == null) result = caseConModelClass(cLibreriasServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES: {
				CNormativasYLegislaciones cNormativasYLegislaciones = (CNormativasYLegislaciones)theEObject;
				Object result = caseCNormativasYLegislaciones(cNormativasYLegislaciones);
				if (result == null) result = caseOrgcasiCollection(cNormativasYLegislaciones);
				if (result == null) result = caseOrgcasiObject(cNormativasYLegislaciones);
				if (result == null) result = caseConModelClass(cNormativasYLegislaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CON_MODEL_CLASS: {
				ConModelClass conModelClass = (ConModelClass)theEObject;
				Object result = caseConModelClass(conModelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CONTENEDOR_DATOS: {
				ContenedorDatos contenedorDatos = (ContenedorDatos)theEObject;
				Object result = caseContenedorDatos(contenedorDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS: {
				ContenedorDocumentos contenedorDocumentos = (ContenedorDocumentos)theEObject;
				Object result = caseContenedorDocumentos(contenedorDocumentos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CONTENEDOR_SUCESOS: {
				ContenedorSucesos contenedorSucesos = (ContenedorSucesos)theEObject;
				Object result = caseContenedorSucesos(contenedorSucesos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS: {
				ContenedorSubsistemas contenedorSubsistemas = (ContenedorSubsistemas)theEObject;
				Object result = caseContenedorSubsistemas(contenedorSubsistemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.COPERACIONES: {
				COperaciones cOperaciones = (COperaciones)theEObject;
				Object result = caseCOperaciones(cOperaciones);
				if (result == null) result = caseOrgcasiCollection(cOperaciones);
				if (result == null) result = caseOrgcasiObject(cOperaciones);
				if (result == null) result = caseConModelClass(cOperaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CPROCEDIMIENTOS: {
				CProcedimientos cProcedimientos = (CProcedimientos)theEObject;
				Object result = caseCProcedimientos(cProcedimientos);
				if (result == null) result = caseOrgcasiCollection(cProcedimientos);
				if (result == null) result = caseOrgcasiObject(cProcedimientos);
				if (result == null) result = caseConModelClass(cProcedimientos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CRELACIONES_DATOS: {
				CRelacionesDatos cRelacionesDatos = (CRelacionesDatos)theEObject;
				Object result = caseCRelacionesDatos(cRelacionesDatos);
				if (result == null) result = caseOrgcasiCollection(cRelacionesDatos);
				if (result == null) result = caseOrgcasiObject(cRelacionesDatos);
				if (result == null) result = caseConModelClass(cRelacionesDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSALIDAS_ACCION: {
				CSalidasAccion cSalidasAccion = (CSalidasAccion)theEObject;
				Object result = caseCSalidasAccion(cSalidasAccion);
				if (result == null) result = caseOrgcasiCollection(cSalidasAccion);
				if (result == null) result = caseOrgcasiObject(cSalidasAccion);
				if (result == null) result = caseConModelClass(cSalidasAccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSALIDAS_SUCESO: {
				CSalidasSuceso cSalidasSuceso = (CSalidasSuceso)theEObject;
				Object result = caseCSalidasSuceso(cSalidasSuceso);
				if (result == null) result = caseOrgcasiCollection(cSalidasSuceso);
				if (result == null) result = caseOrgcasiObject(cSalidasSuceso);
				if (result == null) result = caseConModelClass(cSalidasSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSERVICIOS: {
				CServicios cServicios = (CServicios)theEObject;
				Object result = caseCServicios(cServicios);
				if (result == null) result = caseOrgcasiCollection(cServicios);
				if (result == null) result = caseOrgcasiObject(cServicios);
				if (result == null) result = caseConModelClass(cServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS: {
				CServicioUsadoPorSucesos cServicioUsadoPorSucesos = (CServicioUsadoPorSucesos)theEObject;
				Object result = caseCServicioUsadoPorSucesos(cServicioUsadoPorSucesos);
				if (result == null) result = caseOrgcasiCollection(cServicioUsadoPorSucesos);
				if (result == null) result = caseOrgcasiObject(cServicioUsadoPorSucesos);
				if (result == null) result = caseConModelClass(cServicioUsadoPorSucesos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSISTEMAS: {
				CSistemas cSistemas = (CSistemas)theEObject;
				Object result = caseCSistemas(cSistemas);
				if (result == null) result = caseOrgcasiCollection(cSistemas);
				if (result == null) result = caseOrgcasiObject(cSistemas);
				if (result == null) result = caseConModelClass(cSistemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSUBSISTEMAS: {
				CSubsistemas cSubsistemas = (CSubsistemas)theEObject;
				Object result = caseCSubsistemas(cSubsistemas);
				if (result == null) result = caseOrgcasiCollection(cSubsistemas);
				if (result == null) result = caseOrgcasiObject(cSubsistemas);
				if (result == null) result = caseConModelClass(cSubsistemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CSUCESOS: {
				CSucesos cSucesos = (CSucesos)theEObject;
				Object result = caseCSucesos(cSucesos);
				if (result == null) result = caseOrgcasiCollection(cSucesos);
				if (result == null) result = caseOrgcasiObject(cSucesos);
				if (result == null) result = caseConModelClass(cSucesos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CTERMINOS_GLOSARIO: {
				CTerminosGlosario cTerminosGlosario = (CTerminosGlosario)theEObject;
				Object result = caseCTerminosGlosario(cTerminosGlosario);
				if (result == null) result = caseOrgcasiCollection(cTerminosGlosario);
				if (result == null) result = caseOrgcasiObject(cTerminosGlosario);
				if (result == null) result = caseConModelClass(cTerminosGlosario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUNIDADES: {
				CUnidades cUnidades = (CUnidades)theEObject;
				Object result = caseCUnidades(cUnidades);
				if (result == null) result = caseOrgcasiCollection(cUnidades);
				if (result == null) result = caseOrgcasiObject(cUnidades);
				if (result == null) result = caseConModelClass(cUnidades);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUNIDADES_EXTERNAS: {
				CUnidadesExternas cUnidadesExternas = (CUnidadesExternas)theEObject;
				Object result = caseCUnidadesExternas(cUnidadesExternas);
				if (result == null) result = caseOrgcasiCollection(cUnidadesExternas);
				if (result == null) result = caseOrgcasiObject(cUnidadesExternas);
				if (result == null) result = caseConModelClass(cUnidadesExternas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUNIDADES_ORGANICAS: {
				CUnidadesOrganicas cUnidadesOrganicas = (CUnidadesOrganicas)theEObject;
				Object result = caseCUnidadesOrganicas(cUnidadesOrganicas);
				if (result == null) result = caseOrgcasiCollection(cUnidadesOrganicas);
				if (result == null) result = caseOrgcasiObject(cUnidadesOrganicas);
				if (result == null) result = caseConModelClass(cUnidadesOrganicas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS: {
				CUsadoPorSubsistemas cUsadoPorSubsistemas = (CUsadoPorSubsistemas)theEObject;
				Object result = caseCUsadoPorSubsistemas(cUsadoPorSubsistemas);
				if (result == null) result = caseOrgcasiCollection(cUsadoPorSubsistemas);
				if (result == null) result = caseOrgcasiObject(cUsadoPorSubsistemas);
				if (result == null) result = caseConModelClass(cUsadoPorSubsistemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUSADO_POR_SUCESOS: {
				CUsadoPorSucesos cUsadoPorSucesos = (CUsadoPorSucesos)theEObject;
				Object result = caseCUsadoPorSucesos(cUsadoPorSucesos);
				if (result == null) result = caseOrgcasiCollection(cUsadoPorSucesos);
				if (result == null) result = caseOrgcasiObject(cUsadoPorSucesos);
				if (result == null) result = caseConModelClass(cUsadoPorSucesos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.CUSOS_SUBSISTEMAS: {
				CUsosSubsistemas cUsosSubsistemas = (CUsosSubsistemas)theEObject;
				Object result = caseCUsosSubsistemas(cUsosSubsistemas);
				if (result == null) result = caseOrgcasiCollection(cUsosSubsistemas);
				if (result == null) result = caseOrgcasiObject(cUsosSubsistemas);
				if (result == null) result = caseConModelClass(cUsosSubsistemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO: {
				DocumentoEnEstado documentoEnEstado = (DocumentoEnEstado)theEObject;
				Object result = caseDocumentoEnEstado(documentoEnEstado);
				if (result == null) result = caseADocumento(documentoEnEstado);
				if (result == null) result = caseAnotacion(documentoEnEstado);
				if (result == null) result = caseOrgcasiObject(documentoEnEstado);
				if (result == null) result = caseConModelClass(documentoEnEstado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ENTRADA: {
				Entrada entrada = (Entrada)theEObject;
				Object result = caseEntrada(entrada);
				if (result == null) result = caseEntradaOSalida(entrada);
				if (result == null) result = caseOrgcasiObject(entrada);
				if (result == null) result = caseConModelClass(entrada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ENTRADA_ACCION: {
				EntradaAccion entradaAccion = (EntradaAccion)theEObject;
				Object result = caseEntradaAccion(entradaAccion);
				if (result == null) result = caseEntrada(entradaAccion);
				if (result == null) result = caseEntradaOSalida(entradaAccion);
				if (result == null) result = caseOrgcasiObject(entradaAccion);
				if (result == null) result = caseConModelClass(entradaAccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ENTRADA_OSALIDA: {
				EntradaOSalida entradaOSalida = (EntradaOSalida)theEObject;
				Object result = caseEntradaOSalida(entradaOSalida);
				if (result == null) result = caseOrgcasiObject(entradaOSalida);
				if (result == null) result = caseConModelClass(entradaOSalida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ENTRADA_SERVICIO: {
				EntradaServicio entradaServicio = (EntradaServicio)theEObject;
				Object result = caseEntradaServicio(entradaServicio);
				if (result == null) result = caseEntrada(entradaServicio);
				if (result == null) result = caseEntradaOSalida(entradaServicio);
				if (result == null) result = caseOrgcasiObject(entradaServicio);
				if (result == null) result = caseConModelClass(entradaServicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ENTRADA_SUCESO: {
				EntradaSuceso entradaSuceso = (EntradaSuceso)theEObject;
				Object result = caseEntradaSuceso(entradaSuceso);
				if (result == null) result = caseEntrada(entradaSuceso);
				if (result == null) result = caseEntradaOSalida(entradaSuceso);
				if (result == null) result = caseOrgcasiObject(entradaSuceso);
				if (result == null) result = caseConModelClass(entradaSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ESTRUCTURA_DATOS: {
				EstructuraDatos estructuraDatos = (EstructuraDatos)theEObject;
				Object result = caseEstructuraDatos(estructuraDatos);
				if (result == null) result = caseOrgcasiObject(estructuraDatos);
				if (result == null) result = caseConModelClass(estructuraDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.IMPORTACION_SERVICIOS: {
				ImportacionServicios importacionServicios = (ImportacionServicios)theEObject;
				Object result = caseImportacionServicios(importacionServicios);
				if (result == null) result = caseOrgcasiObject(importacionServicios);
				if (result == null) result = caseConModelClass(importacionServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.IMPORTADOR_SERVICIOS: {
				ImportadorServicios importadorServicios = (ImportadorServicios)theEObject;
				Object result = caseImportadorServicios(importadorServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.INTERFAZ: {
				Interfaz interfaz = (Interfaz)theEObject;
				Object result = caseInterfaz(interfaz);
				if (result == null) result = caseAgrupacion(interfaz);
				if (result == null) result = caseConModelClass(interfaz);
				if (result == null) result = caseOrgcasiObject(interfaz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.LIBRERIA_SERVICIOS: {
				LibreriaServicios libreriaServicios = (LibreriaServicios)theEObject;
				Object result = caseLibreriaServicios(libreriaServicios);
				if (result == null) result = caseAgrupacion(libreriaServicios);
				if (result == null) result = caseContenedorDocumentos(libreriaServicios);
				if (result == null) result = caseContenedorDatos(libreriaServicios);
				if (result == null) result = caseImportadorServicios(libreriaServicios);
				if (result == null) result = caseOrgcasiObject(libreriaServicios);
				if (result == null) result = caseConModelClass(libreriaServicios);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.MIEMBRO_RELACION: {
				MiembroRelacion miembroRelacion = (MiembroRelacion)theEObject;
				Object result = caseMiembroRelacion(miembroRelacion);
				if (result == null) result = caseOrgcasiObject(miembroRelacion);
				if (result == null) result = caseConModelClass(miembroRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ORGCASI_COLLECTION: {
				OrgcasiCollection orgcasiCollection = (OrgcasiCollection)theEObject;
				Object result = caseOrgcasiCollection(orgcasiCollection);
				if (result == null) result = caseOrgcasiObject(orgcasiCollection);
				if (result == null) result = caseConModelClass(orgcasiCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ORGCASI_OBJECT: {
				OrgcasiObject orgcasiObject = (OrgcasiObject)theEObject;
				Object result = caseOrgcasiObject(orgcasiObject);
				if (result == null) result = caseConModelClass(orgcasiObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.RELACION_DATOS: {
				RelacionDatos relacionDatos = (RelacionDatos)theEObject;
				Object result = caseRelacionDatos(relacionDatos);
				if (result == null) result = caseOrgcasiObject(relacionDatos);
				if (result == null) result = caseConModelClass(relacionDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ROL: {
				Rol rol = (Rol)theEObject;
				Object result = caseRol(rol);
				if (result == null) result = caseOrgcasiObject(rol);
				if (result == null) result = caseConModelClass(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ROL_SOLICITANTE: {
				RolSolicitante rolSolicitante = (RolSolicitante)theEObject;
				Object result = caseRolSolicitante(rolSolicitante);
				if (result == null) result = caseRol(rolSolicitante);
				if (result == null) result = caseOrgcasiObject(rolSolicitante);
				if (result == null) result = caseConModelClass(rolSolicitante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.ROL_SOLICITADO: {
				RolSolicitado rolSolicitado = (RolSolicitado)theEObject;
				Object result = caseRolSolicitado(rolSolicitado);
				if (result == null) result = caseRol(rolSolicitado);
				if (result == null) result = caseOrgcasiObject(rolSolicitado);
				if (result == null) result = caseConModelClass(rolSolicitado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SALIDA: {
				Salida salida = (Salida)theEObject;
				Object result = caseSalida(salida);
				if (result == null) result = caseEntradaOSalida(salida);
				if (result == null) result = caseOrgcasiObject(salida);
				if (result == null) result = caseConModelClass(salida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SALIDA_ACCION: {
				SalidaAccion salidaAccion = (SalidaAccion)theEObject;
				Object result = caseSalidaAccion(salidaAccion);
				if (result == null) result = caseSalida(salidaAccion);
				if (result == null) result = caseEntradaOSalida(salidaAccion);
				if (result == null) result = caseOrgcasiObject(salidaAccion);
				if (result == null) result = caseConModelClass(salidaAccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SALIDA_SERVICIO: {
				SalidaServicio salidaServicio = (SalidaServicio)theEObject;
				Object result = caseSalidaServicio(salidaServicio);
				if (result == null) result = caseSalida(salidaServicio);
				if (result == null) result = caseEntradaOSalida(salidaServicio);
				if (result == null) result = caseOrgcasiObject(salidaServicio);
				if (result == null) result = caseConModelClass(salidaServicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SALIDA_SUCESO: {
				SalidaSuceso salidaSuceso = (SalidaSuceso)theEObject;
				Object result = caseSalidaSuceso(salidaSuceso);
				if (result == null) result = caseSalida(salidaSuceso);
				if (result == null) result = caseEntradaOSalida(salidaSuceso);
				if (result == null) result = caseOrgcasiObject(salidaSuceso);
				if (result == null) result = caseConModelClass(salidaSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SERVICIO: {
				Servicio servicio = (Servicio)theEObject;
				Object result = caseServicio(servicio);
				if (result == null) result = caseAgrupacion(servicio);
				if (result == null) result = caseOrgcasiObject(servicio);
				if (result == null) result = caseConModelClass(servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SISTEMA: {
				Sistema sistema = (Sistema)theEObject;
				Object result = caseSistema(sistema);
				if (result == null) result = caseAgrupacion(sistema);
				if (result == null) result = caseContenedorSubsistemas(sistema);
				if (result == null) result = caseContenedorSucesos(sistema);
				if (result == null) result = caseOrgcasiObject(sistema);
				if (result == null) result = caseConModelClass(sistema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SUBSISTEMA: {
				Subsistema subsistema = (Subsistema)theEObject;
				Object result = caseSubsistema(subsistema);
				if (result == null) result = caseAgrupacion(subsistema);
				if (result == null) result = caseContenedorSucesos(subsistema);
				if (result == null) result = caseOrgcasiObject(subsistema);
				if (result == null) result = caseConModelClass(subsistema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SUCESO: {
				Suceso suceso = (Suceso)theEObject;
				Object result = caseSuceso(suceso);
				if (result == null) result = caseAgrupacion(suceso);
				if (result == null) result = caseOrgcasiObject(suceso);
				if (result == null) result = caseConModelClass(suceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SUCESO_CONSTRUCTOR: {
				SucesoConstructor sucesoConstructor = (SucesoConstructor)theEObject;
				Object result = caseSucesoConstructor(sucesoConstructor);
				if (result == null) result = caseSuceso(sucesoConstructor);
				if (result == null) result = caseAgrupacion(sucesoConstructor);
				if (result == null) result = caseOrgcasiObject(sucesoConstructor);
				if (result == null) result = caseConModelClass(sucesoConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.SUCESO_CONSULTOR: {
				SucesoConsultor sucesoConsultor = (SucesoConsultor)theEObject;
				Object result = caseSucesoConsultor(sucesoConsultor);
				if (result == null) result = caseSuceso(sucesoConsultor);
				if (result == null) result = caseAgrupacion(sucesoConsultor);
				if (result == null) result = caseOrgcasiObject(sucesoConsultor);
				if (result == null) result = caseConModelClass(sucesoConsultor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.USO_SERVICIO: {
				UsoServicio usoServicio = (UsoServicio)theEObject;
				Object result = caseUsoServicio(usoServicio);
				if (result == null) result = caseAccion(usoServicio);
				if (result == null) result = caseOrgcasiObject(usoServicio);
				if (result == null) result = caseConModelClass(usoServicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.USO_SUBSISTEMA: {
				UsoSubsistema usoSubsistema = (UsoSubsistema)theEObject;
				Object result = caseUsoSubsistema(usoSubsistema);
				if (result == null) result = caseOrgcasiObject(usoSubsistema);
				if (result == null) result = caseConModelClass(usoSubsistema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrgcasiPackage.USO_SUCESO: {
				UsoSuceso usoSuceso = (UsoSuceso)theEObject;
				Object result = caseUsoSuceso(usoSuceso);
				if (result == null) result = caseAccion(usoSuceso);
				if (result == null) result = caseOrgcasiObject(usoSuceso);
				if (result == null) result = caseConModelClass(usoSuceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada OSalida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada OSalida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntradaOSalida(EntradaOSalida object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntrada(Entrada object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalida(Salida object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Campo Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Campo Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCampoDatos(CampoDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Estructura Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Estructura Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEstructuraDatos(EstructuraDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Agrupacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Agrupacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgrupacion(Agrupacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AProcedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AProcedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAProcedimiento(AProcedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AOperacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AOperacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAOperacion(AOperacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSuceso(Suceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Suceso Consultor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Suceso Consultor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSucesoConsultor(SucesoConsultor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Suceso Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Suceso Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSucesoConstructor(SucesoConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Subsistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Subsistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubsistema(Subsistema object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Sistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSistema(Sistema object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AUnidad Organica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AUnidad Organica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAUnidadOrganica(AUnidadOrganica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CProcedimientos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CProcedimientos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCProcedimientos(CProcedimientos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CLibrerias Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CLibrerias Servicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCLibreriasServicios(CLibreriasServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ADocumento Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ADocumento Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseADocumentoFinal(ADocumentoFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CAcciones Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CAcciones Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCAccionesSuceso(CAccionesSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CActores Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CActores Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCActoresSuceso(CActoresSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CEstructuras Datos Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CEstructuras Datos Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCEstructurasDatosSuceso(CEstructurasDatosSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ARepositorio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ARepositorio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseARepositorio(ARepositorio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AEstructura Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AEstructura Funcional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAEstructuraFuncional(AEstructuraFuncional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ANormativa YLegislacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ANormativa YLegislacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseANormativaYLegislacion(ANormativaYLegislacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ATermino Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ATermino Glosario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseATerminoGlosario(ATerminoGlosario object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AFlujo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AFlujo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAFlujo(AFlujo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUnidades Organicas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUnidades Organicas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUnidadesOrganicas(CUnidadesOrganicas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CFlujos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CFlujos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCFlujos(CFlujos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CDocumentos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CDocumentos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCDocumentos(CDocumentos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CTerminos Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CTerminos Glosario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCTerminosGlosario(CTerminosGlosario object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CEstructuras Funcionales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CEstructuras Funcionales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCEstructurasFuncionales(CEstructurasFuncionales object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CNormativas YLegislaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CNormativas YLegislaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCNormativasYLegislaciones(CNormativasYLegislaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>COperaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>COperaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCOperaciones(COperaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AAplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AAplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAAplicacion(AAplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CAplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CAplicaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCAplicaciones(CAplicaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ASubprocedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ASubprocedimiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseASubprocedimiento(ASubprocedimiento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AUnidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AUnidad Externa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAUnidadExterna(AUnidadExterna object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUnidades Externas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUnidades Externas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUnidadesExternas(CUnidadesExternas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CCampos Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CCampos Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCCamposDatos(CCamposDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CEstructuras Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CEstructuras Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCEstructurasDatos(CEstructurasDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AUnidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AUnidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAUnidad(AUnidad object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUnidades</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUnidades</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUnidades(CUnidades object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CFlujos Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CFlujos Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCFlujosSuceso(CFlujosSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CImportaciones Por</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CImportaciones Por</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCImportacionesPor(CImportacionesPor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUsado Por Sucesos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUsado Por Sucesos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUsadoPorSucesos(CUsadoPorSucesos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CEntradas Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CEntradas Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCEntradasSuceso(CEntradasSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSalidas Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSalidas Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSalidasSuceso(CSalidasSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntradaSuceso(EntradaSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalidaSuceso(SalidaSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CEntradas Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CEntradas Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCEntradasAccion(CEntradasAccion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSalidas Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSalidas Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSalidasAccion(CSalidasAccion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterfaz(Interfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Libreria Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Libreria Servicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibreriaServicios(LibreriaServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rol Solicitante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rol Solicitante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRolSolicitante(RolSolicitante object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rol Solicitado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rol Solicitado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRolSolicitado(RolSolicitado object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServicio(Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntradaServicio(EntradaServicio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalidaServicio(SalidaServicio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Importacion Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Importacion Servicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImportacionServicios(ImportacionServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CImportaciones Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CImportaciones Servicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCImportacionesServicios(CImportacionesServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUsos Subsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUsos Subsistemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUsosSubsistemas(CUsosSubsistemas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documento En Estado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documento En Estado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentoEnEstado(DocumentoEnEstado object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CUsado Por Subsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CUsado Por Subsistemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCUsadoPorSubsistemas(CUsadoPorSubsistemas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CInterfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CInterfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCInterfaces(CInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CServicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CServicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCServicios(CServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CServicio Usado Por Sucesos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CServicio Usado Por Sucesos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCServicioUsadoPorSucesos(CServicioUsadoPorSucesos object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorDatos(ContenedorDatos object) {
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
	public Object caseOrgcasiObject(OrgcasiObject object) {
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
	public Object caseOrgcasiCollection(OrgcasiCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Subsistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Subsistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoSubsistema(UsoSubsistema object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Documentos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Documentos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorDocumentos(ContenedorDocumentos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntradaAccion(EntradaAccion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalidaAccion(SalidaAccion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccion(Accion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Anotacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Anotacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnotacion(Anotacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Relacion Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Relacion Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelacionDatos(RelacionDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CRelaciones Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CRelaciones Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCRelacionesDatos(CRelacionesDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Miembro Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Miembro Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMiembroRelacion(MiembroRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CActores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CActores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCActores(CActores object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actor Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actor Funcional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActorFuncional(ActorFuncional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ADocumento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ADocumento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseADocumento(ADocumento object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Suceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoSuceso(UsoSuceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Importador Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Importador Servicios</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImportadorServicios(ImportadorServicios object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoServicio(UsoServicio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Sucesos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Sucesos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorSucesos(ContenedorSucesos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contenedor Subsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contenedor Subsistemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContenedorSubsistemas(ContenedorSubsistemas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSubsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSubsistemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSubsistemas(CSubsistemas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSistemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSistemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSistemas(CSistemas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CSucesos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CSucesos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSucesos(CSucesos object) {
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

} //OrgcasiSwitch
