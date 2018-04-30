/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.*;

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
public class OrgcasiFactoryImpl extends EFactoryImpl implements OrgcasiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrgcasiFactory init() {
		try {
			OrgcasiFactory theOrgcasiFactory = (OrgcasiFactory)EPackage.Registry.INSTANCE.getEFactory("http:///es/gva/cit/gvmetrica/orgcasi.ecore"); 
			if (theOrgcasiFactory != null) {
				return theOrgcasiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrgcasiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrgcasiPackage.AAPLICACION: return createAAplicacion();
			case OrgcasiPackage.ACCION: return createAccion();
			case OrgcasiPackage.ACTOR: return createActor();
			case OrgcasiPackage.ACTOR_FUNCIONAL: return createActorFuncional();
			case OrgcasiPackage.ADOCUMENTO: return createADocumento();
			case OrgcasiPackage.ADOCUMENTO_FINAL: return createADocumentoFinal();
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL: return createAEstructuraFuncional();
			case OrgcasiPackage.AFLUJO: return createAFlujo();
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION: return createANormativaYLegislacion();
			case OrgcasiPackage.AOPERACION: return createAOperacion();
			case OrgcasiPackage.APROCEDIMIENTO: return createAProcedimiento();
			case OrgcasiPackage.AREPOSITORIO: return createARepositorio();
			case OrgcasiPackage.ASUBPROCEDIMIENTO: return createASubprocedimiento();
			case OrgcasiPackage.ATERMINO_GLOSARIO: return createATerminoGlosario();
			case OrgcasiPackage.AUNIDAD_EXTERNA: return createAUnidadExterna();
			case OrgcasiPackage.AUNIDAD_ORGANICA: return createAUnidadOrganica();
			case OrgcasiPackage.CACCIONES_SUCESO: return createCAccionesSuceso();
			case OrgcasiPackage.CACTORES: return createCActores();
			case OrgcasiPackage.CACTORES_SUCESO: return createCActoresSuceso();
			case OrgcasiPackage.CAMPO_DATOS: return createCampoDatos();
			case OrgcasiPackage.CAPLICACIONES: return createCAplicaciones();
			case OrgcasiPackage.CCAMPOS_DATOS: return createCCamposDatos();
			case OrgcasiPackage.CDOCUMENTOS: return createCDocumentos();
			case OrgcasiPackage.CENTRADAS_ACCION: return createCEntradasAccion();
			case OrgcasiPackage.CENTRADAS_SUCESO: return createCEntradasSuceso();
			case OrgcasiPackage.CESTRUCTURAS_DATOS: return createCEstructurasDatos();
			case OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO: return createCEstructurasDatosSuceso();
			case OrgcasiPackage.CFLUJOS: return createCFlujos();
			case OrgcasiPackage.CFLUJOS_SUCESO: return createCFlujosSuceso();
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES: return createCEstructurasFuncionales();
			case OrgcasiPackage.CIMPORTACIONES_POR: return createCImportacionesPor();
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS: return createCImportacionesServicios();
			case OrgcasiPackage.CINTERFACES: return createCInterfaces();
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS: return createCLibreriasServicios();
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES: return createCNormativasYLegislaciones();
			case OrgcasiPackage.CONTENEDOR_DATOS: return createContenedorDatos();
			case OrgcasiPackage.COPERACIONES: return createCOperaciones();
			case OrgcasiPackage.CPROCEDIMIENTOS: return createCProcedimientos();
			case OrgcasiPackage.CRELACIONES_DATOS: return createCRelacionesDatos();
			case OrgcasiPackage.CSALIDAS_ACCION: return createCSalidasAccion();
			case OrgcasiPackage.CSALIDAS_SUCESO: return createCSalidasSuceso();
			case OrgcasiPackage.CSERVICIOS: return createCServicios();
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS: return createCServicioUsadoPorSucesos();
			case OrgcasiPackage.CSISTEMAS: return createCSistemas();
			case OrgcasiPackage.CSUBSISTEMAS: return createCSubsistemas();
			case OrgcasiPackage.CSUCESOS: return createCSucesos();
			case OrgcasiPackage.CTERMINOS_GLOSARIO: return createCTerminosGlosario();
			case OrgcasiPackage.CUNIDADES: return createCUnidades();
			case OrgcasiPackage.CUNIDADES_EXTERNAS: return createCUnidadesExternas();
			case OrgcasiPackage.CUNIDADES_ORGANICAS: return createCUnidadesOrganicas();
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS: return createCUsadoPorSubsistemas();
			case OrgcasiPackage.CUSADO_POR_SUCESOS: return createCUsadoPorSucesos();
			case OrgcasiPackage.CUSOS_SUBSISTEMAS: return createCUsosSubsistemas();
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO: return createDocumentoEnEstado();
			case OrgcasiPackage.ENTRADA: return createEntrada();
			case OrgcasiPackage.ENTRADA_ACCION: return createEntradaAccion();
			case OrgcasiPackage.ENTRADA_SERVICIO: return createEntradaServicio();
			case OrgcasiPackage.ENTRADA_SUCESO: return createEntradaSuceso();
			case OrgcasiPackage.ESTRUCTURA_DATOS: return createEstructuraDatos();
			case OrgcasiPackage.IMPORTACION_SERVICIOS: return createImportacionServicios();
			case OrgcasiPackage.INTERFAZ: return createInterfaz();
			case OrgcasiPackage.LIBRERIA_SERVICIOS: return createLibreriaServicios();
			case OrgcasiPackage.MIEMBRO_RELACION: return createMiembroRelacion();
			case OrgcasiPackage.ORGCASI_OBJECT: return createOrgcasiObject();
			case OrgcasiPackage.RELACION_DATOS: return createRelacionDatos();
			case OrgcasiPackage.ROL_SOLICITANTE: return createRolSolicitante();
			case OrgcasiPackage.ROL_SOLICITADO: return createRolSolicitado();
			case OrgcasiPackage.SALIDA: return createSalida();
			case OrgcasiPackage.SALIDA_ACCION: return createSalidaAccion();
			case OrgcasiPackage.SALIDA_SERVICIO: return createSalidaServicio();
			case OrgcasiPackage.SALIDA_SUCESO: return createSalidaSuceso();
			case OrgcasiPackage.SERVICIO: return createServicio();
			case OrgcasiPackage.SISTEMA: return createSistema();
			case OrgcasiPackage.SUBSISTEMA: return createSubsistema();
			case OrgcasiPackage.SUCESO_CONSTRUCTOR: return createSucesoConstructor();
			case OrgcasiPackage.SUCESO_CONSULTOR: return createSucesoConsultor();
			case OrgcasiPackage.USO_SERVICIO: return createUsoServicio();
			case OrgcasiPackage.USO_SUBSISTEMA: return createUsoSubsistema();
			case OrgcasiPackage.USO_SUCESO: return createUsoSuceso();
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
			case OrgcasiPackage.TIPO_USO_DOCUMENTO:
				return createTipoUsoDocumentoFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_PRIORIDAD:
				return createTipoPrioridadFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_UNIDAD:
				return createTipoUnidadFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_SUBSISTEMA:
				return createTipoSubsistemaFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_RELACION:
				return createTipoRelacionFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_AGRUPACION_PREDEFINIDA:
				return createTipoAgrupacionPredefinidaFromString(eDataType, initialValue);
			case OrgcasiPackage.TIPO_PROPIEDAD_CLASE_AGRUPACION:
				return createTipoPropiedadClaseAgrupacionFromString(eDataType, initialValue);
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
			case OrgcasiPackage.TIPO_USO_DOCUMENTO:
				return convertTipoUsoDocumentoToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_PRIORIDAD:
				return convertTipoPrioridadToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_UNIDAD:
				return convertTipoUnidadToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_SUBSISTEMA:
				return convertTipoSubsistemaToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_RELACION:
				return convertTipoRelacionToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_AGRUPACION_PREDEFINIDA:
				return convertTipoAgrupacionPredefinidaToString(eDataType, instanceValue);
			case OrgcasiPackage.TIPO_PROPIEDAD_CLASE_AGRUPACION:
				return convertTipoPropiedadClaseAgrupacionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampoDatos createCampoDatos() {
		CampoDatosImpl campoDatos = new CampoDatosImpl();
		return campoDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraDatos createEstructuraDatos() {
		EstructuraDatosImpl estructuraDatos = new EstructuraDatosImpl();
		return estructuraDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AProcedimiento createAProcedimiento() {
		AProcedimientoImpl aProcedimiento = new AProcedimientoImpl();
		
		return aProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOperacion createAOperacion() {
		AOperacionImpl aOperacion = new AOperacionImpl();
		return aOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SucesoConsultor createSucesoConsultor() {
		SucesoConsultorImpl sucesoConsultor = new SucesoConsultorImpl();
		return sucesoConsultor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SucesoConstructor createSucesoConstructor() {
		SucesoConstructorImpl sucesoConstructor = new SucesoConstructorImpl();
		return sucesoConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsistema createSubsistema() {
		SubsistemaImpl subsistema = new SubsistemaImpl();
		return subsistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sistema createSistema() {
		SistemaImpl sistema = new SistemaImpl();
		return sistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUnidadOrganica createAUnidadOrganica() {
		AUnidadOrganicaImpl aUnidadOrganica = new AUnidadOrganicaImpl();
		return aUnidadOrganica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CProcedimientos createCProcedimientos() {
		CProcedimientosImpl cProcedimientos = new CProcedimientosImpl();
		return cProcedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLibreriasServicios createCLibreriasServicios() {
		CLibreriasServiciosImpl cLibreriasServicios = new CLibreriasServiciosImpl();
		return cLibreriasServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADocumentoFinal createADocumentoFinal() {
		ADocumentoFinalImpl aDocumentoFinal = new ADocumentoFinalImpl();
		return aDocumentoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAccionesSuceso createCAccionesSuceso() {
		CAccionesSucesoImpl cAccionesSuceso = new CAccionesSucesoImpl();
		return cAccionesSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CActoresSuceso createCActoresSuceso() {
		CActoresSucesoImpl cActoresSuceso = new CActoresSucesoImpl();
		return cActoresSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatosSuceso createCEstructurasDatosSuceso() {
		CEstructurasDatosSucesoImpl cEstructurasDatosSuceso = new CEstructurasDatosSucesoImpl();
		return cEstructurasDatosSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ARepositorio createARepositorio() {
		ARepositorioImpl aRepositorio = new ARepositorioImpl();
		
		return aRepositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEstructuraFuncional createAEstructuraFuncional() {
		AEstructuraFuncionalImpl aEstructuraFuncional = new AEstructuraFuncionalImpl();
		return aEstructuraFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANormativaYLegislacion createANormativaYLegislacion() {
		ANormativaYLegislacionImpl aNormativaYLegislacion = new ANormativaYLegislacionImpl();
		return aNormativaYLegislacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerminoGlosario createATerminoGlosario() {
		ATerminoGlosarioImpl aTerminoGlosario = new ATerminoGlosarioImpl();
		return aTerminoGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFlujo createAFlujo() {
		AFlujoImpl aFlujo = new AFlujoImpl();
		return aFlujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesOrganicas createCUnidadesOrganicas() {
		CUnidadesOrganicasImpl cUnidadesOrganicas = new CUnidadesOrganicasImpl();
		return cUnidadesOrganicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlujos createCFlujos() {
		CFlujosImpl cFlujos = new CFlujosImpl();
		return cFlujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDocumentos createCDocumentos() {
		CDocumentosImpl cDocumentos = new CDocumentosImpl();
		return cDocumentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminosGlosario createCTerminosGlosario() {
		CTerminosGlosarioImpl cTerminosGlosario = new CTerminosGlosarioImpl();
		return cTerminosGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasFuncionales createCEstructurasFuncionales() {
		CEstructurasFuncionalesImpl cEstructurasFuncionales = new CEstructurasFuncionalesImpl();
		return cEstructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNormativasYLegislaciones createCNormativasYLegislaciones() {
		CNormativasYLegislacionesImpl cNormativasYLegislaciones = new CNormativasYLegislacionesImpl();
		return cNormativasYLegislaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatos createContenedorDatos() {
		ContenedorDatosImpl contenedorDatos = new ContenedorDatosImpl();
		return contenedorDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COperaciones createCOperaciones() {
		COperacionesImpl cOperaciones = new COperacionesImpl();
		return cOperaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAplicacion createAAplicacion() {
		AAplicacionImpl aAplicacion = new AAplicacionImpl();
		return aAplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAplicaciones createCAplicaciones() {
		CAplicacionesImpl cAplicaciones = new CAplicacionesImpl();
		return cAplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASubprocedimiento createASubprocedimiento() {
		ASubprocedimientoImpl aSubprocedimiento = new ASubprocedimientoImpl();
		return aSubprocedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUnidadExterna createAUnidadExterna() {
		AUnidadExternaImpl aUnidadExterna = new AUnidadExternaImpl();
		return aUnidadExterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesExternas createCUnidadesExternas() {
		CUnidadesExternasImpl cUnidadesExternas = new CUnidadesExternasImpl();
		return cUnidadesExternas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCamposDatos createCCamposDatos() {
		CCamposDatosImpl cCamposDatos = new CCamposDatosImpl();
		return cCamposDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatos createCEstructurasDatos() {
		CEstructurasDatosImpl cEstructurasDatos = new CEstructurasDatosImpl();
		return cEstructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidades createCUnidades() {
		CUnidadesImpl cUnidades = new CUnidadesImpl();
		return cUnidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlujosSuceso createCFlujosSuceso() {
		CFlujosSucesoImpl cFlujosSuceso = new CFlujosSucesoImpl();
		return cFlujosSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesPor createCImportacionesPor() {
		CImportacionesPorImpl cImportacionesPor = new CImportacionesPorImpl();
		return cImportacionesPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSucesos createCUsadoPorSucesos() {
		CUsadoPorSucesosImpl cUsadoPorSucesos = new CUsadoPorSucesosImpl();
		return cUsadoPorSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEntradasSuceso createCEntradasSuceso() {
		CEntradasSucesoImpl cEntradasSuceso = new CEntradasSucesoImpl();
		return cEntradasSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSalidasSuceso createCSalidasSuceso() {
		CSalidasSucesoImpl cSalidasSuceso = new CSalidasSucesoImpl();
		return cSalidasSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaSuceso createEntradaSuceso() {
		EntradaSucesoImpl entradaSuceso = new EntradaSucesoImpl();
		return entradaSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalidaSuceso createSalidaSuceso() {
		SalidaSucesoImpl salidaSuceso = new SalidaSucesoImpl();
		return salidaSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEntradasAccion createCEntradasAccion() {
		CEntradasAccionImpl cEntradasAccion = new CEntradasAccionImpl();
		return cEntradasAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSalidasAccion createCSalidasAccion() {
		CSalidasAccionImpl cSalidasAccion = new CSalidasAccionImpl();
		return cSalidasAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaz createInterfaz() {
		InterfazImpl interfaz = new InterfazImpl();
		return interfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibreriaServicios createLibreriaServicios() {
		LibreriaServiciosImpl libreriaServicios = new LibreriaServiciosImpl();
		return libreriaServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolSolicitante createRolSolicitante() {
		RolSolicitanteImpl rolSolicitante = new RolSolicitanteImpl();
		return rolSolicitante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolSolicitado createRolSolicitado() {
		RolSolicitadoImpl rolSolicitado = new RolSolicitadoImpl();
		return rolSolicitado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicio createServicio() {
		ServicioImpl servicio = new ServicioImpl();
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaServicio createEntradaServicio() {
		EntradaServicioImpl entradaServicio = new EntradaServicioImpl();
		return entradaServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalidaServicio createSalidaServicio() {
		SalidaServicioImpl salidaServicio = new SalidaServicioImpl();
		return salidaServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportacionServicios createImportacionServicios() {
		ImportacionServiciosImpl importacionServicios = new ImportacionServiciosImpl();
		return importacionServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesServicios createCImportacionesServicios() {
		CImportacionesServiciosImpl cImportacionesServicios = new CImportacionesServiciosImpl();
		return cImportacionesServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsosSubsistemas createCUsosSubsistemas() {
		CUsosSubsistemasImpl cUsosSubsistemas = new CUsosSubsistemasImpl();
		return cUsosSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoEnEstado createDocumentoEnEstado() {
		DocumentoEnEstadoImpl documentoEnEstado = new DocumentoEnEstadoImpl();
		return documentoEnEstado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSubsistemas createCUsadoPorSubsistemas() {
		CUsadoPorSubsistemasImpl cUsadoPorSubsistemas = new CUsadoPorSubsistemasImpl();
		return cUsadoPorSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CInterfaces createCInterfaces() {
		CInterfacesImpl cInterfaces = new CInterfacesImpl();
		return cInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicios createCServicios() {
		CServiciosImpl cServicios = new CServiciosImpl();
		return cServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicioUsadoPorSucesos createCServicioUsadoPorSucesos() {
		CServicioUsadoPorSucesosImpl cServicioUsadoPorSucesos = new CServicioUsadoPorSucesosImpl();
		return cServicioUsadoPorSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiObject createOrgcasiObject() {
		OrgcasiObjectImpl orgcasiObject = new OrgcasiObjectImpl();
		return orgcasiObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoSubsistema createUsoSubsistema() {
		UsoSubsistemaImpl usoSubsistema = new UsoSubsistemaImpl();
		return usoSubsistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntradaAccion createEntradaAccion() {
		EntradaAccionImpl entradaAccion = new EntradaAccionImpl();
		return entradaAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalidaAccion createSalidaAccion() {
		SalidaAccionImpl salidaAccion = new SalidaAccionImpl();
		return salidaAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accion createAccion() {
		AccionImpl accion = new AccionImpl();
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionDatos createRelacionDatos() {
		RelacionDatosImpl relacionDatos = new RelacionDatosImpl();
		return relacionDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelacionesDatos createCRelacionesDatos() {
		CRelacionesDatosImpl cRelacionesDatos = new CRelacionesDatosImpl();
		return cRelacionesDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiembroRelacion createMiembroRelacion() {
		MiembroRelacionImpl miembroRelacion = new MiembroRelacionImpl();
		return miembroRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CActores createCActores() {
		CActoresImpl cActores = new CActoresImpl();
		return cActores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorFuncional createActorFuncional() {
		ActorFuncionalImpl actorFuncional = new ActorFuncionalImpl();
		return actorFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADocumento createADocumento() {
		ADocumentoImpl aDocumento = new ADocumentoImpl();
		return aDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entrada createEntrada() {
		EntradaImpl entrada = new EntradaImpl();
		return entrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salida createSalida() {
		SalidaImpl salida = new SalidaImpl();
		return salida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoSuceso createUsoSuceso() {
		UsoSucesoImpl usoSuceso = new UsoSucesoImpl();
		return usoSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoServicio createUsoServicio() {
		UsoServicioImpl usoServicio = new UsoServicioImpl();
		return usoServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubsistemas createCSubsistemas() {
		CSubsistemasImpl cSubsistemas = new CSubsistemasImpl();
		return cSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSistemas createCSistemas() {
		CSistemasImpl cSistemas = new CSistemasImpl();
		return cSistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSucesos createCSucesos() {
		CSucesosImpl cSucesos = new CSucesosImpl();
		return cSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPrioridad createTipoPrioridadFromString(EDataType eDataType, String initialValue) {
		TipoPrioridad result = TipoPrioridad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPrioridadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoUsoDocumento createTipoUsoDocumentoFromString(EDataType eDataType, String initialValue) {
		TipoUsoDocumento result = TipoUsoDocumento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoUsoDocumentoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoUnidad createTipoUnidadFromString(EDataType eDataType, String initialValue) {
		TipoUnidad result = TipoUnidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoUnidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSubsistema createTipoSubsistemaFromString(EDataType eDataType, String initialValue) {
		TipoSubsistema result = TipoSubsistema.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoSubsistemaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAgrupacionPredefinida createTipoAgrupacionPredefinidaFromString(EDataType eDataType, String initialValue) {
		TipoAgrupacionPredefinida result = TipoAgrupacionPredefinida.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAgrupacionPredefinidaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPropiedadClaseAgrupacion createTipoPropiedadClaseAgrupacionFromString(EDataType eDataType, String initialValue) {
		TipoPropiedadClaseAgrupacion result = TipoPropiedadClaseAgrupacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPropiedadClaseAgrupacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRelacion createTipoRelacionFromString(EDataType eDataType, String initialValue) {
		TipoRelacion result = TipoRelacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRelacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiPackage getOrgcasiPackage() {
		return (OrgcasiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static OrgcasiPackage getPackage() {
		return OrgcasiPackage.eINSTANCE;
	}

} //OrgcasiFactoryImpl
