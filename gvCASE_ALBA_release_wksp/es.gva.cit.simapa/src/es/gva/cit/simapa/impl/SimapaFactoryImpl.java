/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimapaFactoryImpl extends EFactoryImpl implements SimapaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimapaFactory init() {
		try {
			SimapaFactory theSimapaFactory = (SimapaFactory)EPackage.Registry.INSTANCE.getEFactory("http:///es/gva/cit/simapa.ecore"); 
			if (theSimapaFactory != null) {
				return theSimapaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimapaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimapaPackage.APLICACION: return createAplicacion();
			case SimapaPackage.APLICACIONES: return createAplicaciones();
			case SimapaPackage.CLASE_DOCUMENTO: return createClaseDocumento();
			case SimapaPackage.CLASES_DOCUMENTO: return createClasesDocumento();
			case SimapaPackage.CONTROL_PROCEDIMIENTO: return createControlProcedimiento();
			case SimapaPackage.CONVOCATORIA: return createConvocatoria();
			case SimapaPackage.DECISION: return createDecision();
			case SimapaPackage.DOCUMENTO: return createDocumento();
			case SimapaPackage.DOCUMENTOS: return createDocumentos();
			case SimapaPackage.DOCUMENTO_FINAL_INTERNO: return createDocumentoFinalInterno();
			case SimapaPackage.ENTRADA_DOCUMENTO_FINAL: return createEntradaDocumentoFinal();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL: return createEstructuraFuncional();
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES: return createEstructurasFuncionales();
			case SimapaPackage.FICHA_ARCHIVISTICA: return createFichaArchivistica();
			case SimapaPackage.FIN_PROCESO: return createFinProceso();
			case SimapaPackage.FLUJO: return createFlujo();
			case SimapaPackage.GLOSARIO: return createGlosario();
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES: return createNormativasYLegislaciones();
			case SimapaPackage.NORMATIVA_YLEGISLACION: return createNormativaYLegislacion();
			case SimapaPackage.OPERACION: return createOperacion();
			case SimapaPackage.OPERACIONES: return createOperaciones();
			case SimapaPackage.PROCEDIMIENTO: return createProcedimiento();
			case SimapaPackage.PROCEDIMIENTOS: return createProcedimientos();
			case SimapaPackage.REPOSITORIO: return createRepositorio();
			case SimapaPackage.SALIDA_DOCUMENTO_FINAL: return createSalidaDocumentoFinal();
			case SimapaPackage.SIMAPA_COLLECTION: return createSimapaCollection();
			case SimapaPackage.SUBPROCEDIMIENTO: return createSubprocedimiento();
			case SimapaPackage.TERMINO_GLOSARIO: return createTerminoGlosario();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO: return createTramitacionProcedimiento();
			case SimapaPackage.UNIDADES_ORGANICAS: return createUnidadesOrganicas();
			case SimapaPackage.UNIDAD_ORGANICA: return createUnidadOrganica();
			case SimapaPackage.UNIDADES_EXTERNAS: return createUnidadesExternas();
			case SimapaPackage.UNIDAD_EXTERNA: return createUnidadExterna();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimapaPackage.TIPO_MEDIO_DOCUMENTO:
				return createTipoMedioDocumentoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_SILENCIO_ADMINISTRATIVO:
				return createTipoSilencioAdministrativoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_SITUACION_PROCEDIMIENTO:
				return createTipoSituacionProcedimientoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_ACCESO_ARCHIVO:
				return createTipoAccesoArchivoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_AMBITO_DOCUMENTO:
				return createTipoAmbitoDocumentoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_ALMACENAMIENTO_DOCUMENTO:
				return createTipoAlmacenamientoDocumentoFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_DESARROLLO:
				return createTipoDesarrolloFromString(eDataType, initialValue);
			case SimapaPackage.TIPO_APLICACION:
				return createTipoAplicacionFromString(eDataType, initialValue);
			case SimapaPackage.RANGO1_10:
				return createRango1_10FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimapaPackage.TIPO_MEDIO_DOCUMENTO:
				return convertTipoMedioDocumentoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_SILENCIO_ADMINISTRATIVO:
				return convertTipoSilencioAdministrativoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_SITUACION_PROCEDIMIENTO:
				return convertTipoSituacionProcedimientoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_ACCESO_ARCHIVO:
				return convertTipoAccesoArchivoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_AMBITO_DOCUMENTO:
				return convertTipoAmbitoDocumentoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_ALMACENAMIENTO_DOCUMENTO:
				return convertTipoAlmacenamientoDocumentoToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_DESARROLLO:
				return convertTipoDesarrolloToString(eDataType, instanceValue);
			case SimapaPackage.TIPO_APLICACION:
				return convertTipoAplicacionToString(eDataType, instanceValue);
			case SimapaPackage.RANGO1_10:
				return convertRango1_10ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio createRepositorio() {
		RepositorioImpl repositorio = new RepositorioImpl();
		return repositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativasYLegislaciones createNormativasYLegislaciones() {
		NormativasYLegislacionesImpl normativasYLegislaciones = new NormativasYLegislacionesImpl();
		return normativasYLegislaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativaYLegislacion createNormativaYLegislacion() {
		NormativaYLegislacionImpl normativaYLegislacion = new NormativaYLegislacionImpl();
		return normativaYLegislacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesOrganicas createUnidadesOrganicas() {
		UnidadesOrganicasImpl unidadesOrganicas = new UnidadesOrganicasImpl();
		return unidadesOrganicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganica createUnidadOrganica() {
		UnidadOrganicaImpl unidadOrganica = new UnidadOrganicaImpl();
		return unidadOrganica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesExternas createUnidadesExternas() {
		UnidadesExternasImpl unidadesExternas = new UnidadesExternasImpl();
		return unidadesExternas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadExterna createUnidadExterna() {
		UnidadExternaImpl unidadExterna = new UnidadExternaImpl();
		return unidadExterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructurasFuncionales createEstructurasFuncionales() {
		EstructurasFuncionalesImpl estructurasFuncionales = new EstructurasFuncionalesImpl();
		return estructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraFuncional createEstructuraFuncional() {
		EstructuraFuncionalImpl estructuraFuncional = new EstructuraFuncionalImpl();
		return estructuraFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasesDocumento createClasesDocumento() {
		ClasesDocumentoImpl clasesDocumento = new ClasesDocumentoImpl();
		return clasesDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseDocumento createClaseDocumento() {
		ClaseDocumentoImpl claseDocumento = new ClaseDocumentoImpl();
		return claseDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentos createDocumentos() {
		DocumentosImpl documentos = new DocumentosImpl();
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento createDocumento() {
		DocumentoImpl documento = new DocumentoImpl();
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicaciones createAplicaciones() {
		AplicacionesImpl aplicaciones = new AplicacionesImpl();
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion createAplicacion() {
		AplicacionImpl aplicacion = new AplicacionImpl();
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glosario createGlosario() {
		GlosarioImpl glosario = new GlosarioImpl();
		return glosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminoGlosario createTerminoGlosario() {
		TerminoGlosarioImpl terminoGlosario = new TerminoGlosarioImpl();
		return terminoGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimientos createProcedimientos() {
		ProcedimientosImpl procedimientos = new ProcedimientosImpl();
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento createProcedimiento() {
		ProcedimientoImpl procedimiento = new ProcedimientoImpl();
		return procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichaArchivistica createFichaArchivistica() {
		FichaArchivisticaImpl fichaArchivistica = new FichaArchivisticaImpl();
		return fichaArchivistica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convocatoria createConvocatoria() {
		ConvocatoriaImpl convocatoria = new ConvocatoriaImpl();
		return convocatoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlProcedimiento createControlProcedimiento() {
		ControlProcedimientoImpl controlProcedimiento = new ControlProcedimientoImpl();
		return controlProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramitacionProcedimiento createTramitacionProcedimiento() {
		TramitacionProcedimientoImpl tramitacionProcedimiento = new TramitacionProcedimientoImpl();
		return tramitacionProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operaciones createOperaciones() {
		OperacionesImpl operaciones = new OperacionesImpl();
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subprocedimiento createSubprocedimiento() {
		SubprocedimientoImpl subprocedimiento = new SubprocedimientoImpl();
		return subprocedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoFinalInterno createDocumentoFinalInterno() {
		DocumentoFinalInternoImpl documentoFinalInterno = new DocumentoFinalInternoImpl();
		return documentoFinalInterno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaDocumentoFinal createEntradaDocumentoFinal() {
		EntradaDocumentoFinalImpl entradaDocumentoFinal = new EntradaDocumentoFinalImpl();
		return entradaDocumentoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalidaDocumentoFinal createSalidaDocumentoFinal() {
		SalidaDocumentoFinalImpl salidaDocumentoFinal = new SalidaDocumentoFinalImpl();
		return salidaDocumentoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaCollection createSimapaCollection() {
		SimapaCollectionImpl simapaCollection = new SimapaCollectionImpl();
		return simapaCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinProceso createFinProceso() {
		FinProcesoImpl finProceso = new FinProcesoImpl();
		return finProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flujo createFlujo() {
		FlujoImpl flujo = new FlujoImpl();
		return flujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMedioDocumento createTipoMedioDocumentoFromString(EDataType eDataType, String initialValue) {
		TipoMedioDocumento result = TipoMedioDocumento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoMedioDocumentoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSilencioAdministrativo createTipoSilencioAdministrativoFromString(EDataType eDataType, String initialValue) {
		TipoSilencioAdministrativo result = TipoSilencioAdministrativo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoSilencioAdministrativoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSituacionProcedimiento createTipoSituacionProcedimientoFromString(EDataType eDataType, String initialValue) {
		TipoSituacionProcedimiento result = TipoSituacionProcedimiento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoSituacionProcedimientoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAccesoArchivo createTipoAccesoArchivoFromString(EDataType eDataType, String initialValue) {
		TipoAccesoArchivo result = TipoAccesoArchivo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAccesoArchivoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAmbitoDocumento createTipoAmbitoDocumentoFromString(EDataType eDataType, String initialValue) {
		TipoAmbitoDocumento result = TipoAmbitoDocumento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAmbitoDocumentoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAlmacenamientoDocumento createTipoAlmacenamientoDocumentoFromString(EDataType eDataType, String initialValue) {
		TipoAlmacenamientoDocumento result = TipoAlmacenamientoDocumento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAlmacenamientoDocumentoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDesarrollo createTipoDesarrolloFromString(EDataType eDataType, String initialValue) {
		TipoDesarrollo result = TipoDesarrollo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDesarrolloToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAplicacion createTipoAplicacionFromString(EDataType eDataType, String initialValue) {
		TipoAplicacion result = TipoAplicacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAplicacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rango1_10 createRango1_10FromString(EDataType eDataType, String initialValue) {
		Rango1_10 result = Rango1_10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRango1_10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaPackage getSimapaPackage() {
		return (SimapaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SimapaPackage getPackage() {
		return SimapaPackage.eINSTANCE;
	}

} //SimapaFactoryImpl
