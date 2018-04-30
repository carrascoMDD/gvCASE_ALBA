/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AAplicacion;
import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal;
import es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional;
import es.gva.cit.gvmetrica.orgcasi.AFlujo;
import es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion;
import es.gva.cit.gvmetrica.orgcasi.AOperacion;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento;
import es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario;
import es.gva.cit.gvmetrica.orgcasi.AUnidad;
import es.gva.cit.gvmetrica.orgcasi.AUnidadExterna;
import es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica;
import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.Actor;
import es.gva.cit.gvmetrica.orgcasi.ActorFuncional;
import es.gva.cit.gvmetrica.orgcasi.Agrupacion;
import es.gva.cit.gvmetrica.orgcasi.Anotacion;
import es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso;
import es.gva.cit.gvmetrica.orgcasi.CActores;
import es.gva.cit.gvmetrica.orgcasi.CActoresSuceso;
import es.gva.cit.gvmetrica.orgcasi.CAplicaciones;
import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.CEntradasAccion;
import es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales;
import es.gva.cit.gvmetrica.orgcasi.CFlujos;
import es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesPor;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.CInterfaces;
import es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios;
import es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones;
import es.gva.cit.gvmetrica.orgcasi.COperaciones;
import es.gva.cit.gvmetrica.orgcasi.CProcedimientos;
import es.gva.cit.gvmetrica.orgcasi.CProveedoresServicios;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.CSalidasAccion;
import es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.CServicios;
import es.gva.cit.gvmetrica.orgcasi.CSistemas;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario;
import es.gva.cit.gvmetrica.orgcasi.CUnidades;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas;
import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CampoDatos;
import es.gva.cit.gvmetrica.orgcasi.ConModelClass;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado;
import es.gva.cit.gvmetrica.orgcasi.Entrada;
import es.gva.cit.gvmetrica.orgcasi.EntradaAccion;
import es.gva.cit.gvmetrica.orgcasi.EntradaOSalida;
import es.gva.cit.gvmetrica.orgcasi.EntradaServicio;
import es.gva.cit.gvmetrica.orgcasi.EntradaSuceso;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.ImportacionServicios;
import es.gva.cit.gvmetrica.orgcasi.ImportadorServicios;
import es.gva.cit.gvmetrica.orgcasi.Interfaz;
import es.gva.cit.gvmetrica.orgcasi.LibreriaServicios;
import es.gva.cit.gvmetrica.orgcasi.MiembroRelacion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiCollection;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiObject;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.RelacionDatos;
import es.gva.cit.gvmetrica.orgcasi.Rol;
import es.gva.cit.gvmetrica.orgcasi.RolSolicitado;
import es.gva.cit.gvmetrica.orgcasi.RolSolicitante;
import es.gva.cit.gvmetrica.orgcasi.Salida;
import es.gva.cit.gvmetrica.orgcasi.SalidaAccion;
import es.gva.cit.gvmetrica.orgcasi.SalidaServicio;
import es.gva.cit.gvmetrica.orgcasi.SalidaSuceso;
import es.gva.cit.gvmetrica.orgcasi.Servicio;
import es.gva.cit.gvmetrica.orgcasi.Sistema;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
import es.gva.cit.gvmetrica.orgcasi.SucesoConstructor;
import es.gva.cit.gvmetrica.orgcasi.SucesoConsultor;
import es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida;
import es.gva.cit.gvmetrica.orgcasi.TipoPrioridad;
import es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion;
import es.gva.cit.gvmetrica.orgcasi.TipoRelacion;
import es.gva.cit.gvmetrica.orgcasi.TipoSubsistema;
import es.gva.cit.gvmetrica.orgcasi.TipoUnidad;
import es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento;
import es.gva.cit.gvmetrica.orgcasi.UsoServicio;
import es.gva.cit.gvmetrica.orgcasi.UsoSubsistema;
import es.gva.cit.gvmetrica.orgcasi.UsoSuceso;


import es.gva.cit.simapa.SimapaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgcasiPackageImpl extends EPackageImpl implements OrgcasiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRepositorioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aProcedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aUnidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aUnidadOrganicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aUnidadExternaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEstructuraFuncionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTerminoGlosarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNormativaYLegislacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aOperacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSubprocedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDocumentoFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFlujoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estructuraDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miembroRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agrupacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sucesoConsultorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sucesoConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorFuncionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDocumentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaOSalidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaAccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaAccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anotacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importadorServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoServicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorSucesosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorSubsistemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSistemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSubsistemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSucesosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cAccionesSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cActoresSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEstructurasDatosSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFlujosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cDocumentosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cNormativasYLegislacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cOperacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cCamposDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEstructurasDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFlujosSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cImportacionesPorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUsadoPorSucesosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEntradasSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSalidasSucesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cRelacionesDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cActoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cProcedimientosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cLibreriasServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cAplicacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUnidadesOrganicasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUnidadesExternasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUnidadesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEstructurasFuncionalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTerminosGlosarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEntradasAccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSalidasAccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfazEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libreriaServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolSolicitanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolSolicitadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaServicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaServicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importacionServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cImportacionesServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUsosSubsistemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentoEnEstadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cUsadoPorSubsistemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cServiciosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cServicioUsadoPorSucesosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conModelClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgcasiObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgcasiCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoSubsistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDocumentosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoUsoDocumentoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPrioridadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoUnidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoSubsistemaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRelacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAgrupacionPredefinidaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPropiedadClaseAgrupacionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrgcasiPackageImpl() {
		super(eNS_URI, OrgcasiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrgcasiPackage init() {
		if (isInited) return (OrgcasiPackage)EPackage.Registry.INSTANCE.getEPackage(OrgcasiPackage.eNS_URI);

		// Obtain or create and register package
		OrgcasiPackageImpl theOrgcasiPackage = (OrgcasiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OrgcasiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OrgcasiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		SimapaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOrgcasiPackage.createPackageContents();

		// Initialize created meta-data
		theOrgcasiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrgcasiPackage.freeze();

		return theOrgcasiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARepositorio() {
		return aRepositorioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARepositorio_AnotacionesProcedimiento() {
		return (EReference)aRepositorioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARepositorio_Repositorio() {
		return (EReference)aRepositorioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARepositorio_ModelPackage() {
		return (EReference)aRepositorioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARepositorio_LibreriasServicios() {
		return (EReference)aRepositorioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAProcedimiento() {
		return aProcedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAProcedimiento_Etiqueta() {
		return (EAttribute)aProcedimientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Procedimiento() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Normativas() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_TerminosGlosario() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_UnidadesOrganicas() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_UnidadesExternas() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Unidades() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_EstructurasFuncionales() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Aplicaciones() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Operaciones() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Flujos() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Actores() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Sistemas() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Procedimientos() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_TodosSucesos() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_TodosSubsistemas() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_TodasEstructurasDatos() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_TodosDocumentos() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAProcedimiento_Repositorio() {
		return (EReference)aProcedimientoEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAplicacion() {
		return aAplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAplicacion_Etiqueta() {
		return (EAttribute)aAplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAplicacion_Aplicacion() {
		return (EReference)aAplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAplicacion_Aplicaciones() {
		return (EReference)aAplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAUnidad() {
		return aUnidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAUnidad_Etiqueta() {
		return (EAttribute)aUnidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUnidad_ActoresSucesos() {
		return (EReference)aUnidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAUnidadOrganica() {
		return aUnidadOrganicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAUnidadOrganica_TipoUnidad() {
		return (EAttribute)aUnidadOrganicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUnidadOrganica_Unidad() {
		return (EReference)aUnidadOrganicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUnidadOrganica_Unidades() {
		return (EReference)aUnidadOrganicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAUnidadExterna() {
		return aUnidadExternaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUnidadExterna_Unidad() {
		return (EReference)aUnidadExternaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUnidadExterna_Unidades() {
		return (EReference)aUnidadExternaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEstructuraFuncional() {
		return aEstructuraFuncionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEstructuraFuncional_Etiqueta() {
		return (EAttribute)aEstructuraFuncionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEstructuraFuncional_EstructuraFuncional() {
		return (EReference)aEstructuraFuncionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEstructuraFuncional_EstructurasFuncionales() {
		return (EReference)aEstructuraFuncionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATerminoGlosario() {
		return aTerminoGlosarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATerminoGlosario_Etiqueta() {
		return (EAttribute)aTerminoGlosarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATerminoGlosario_TerminoGlosario() {
		return (EReference)aTerminoGlosarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATerminoGlosario_TerminosGlosario() {
		return (EReference)aTerminoGlosarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANormativaYLegislacion() {
		return aNormativaYLegislacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANormativaYLegislacion_Etiqueta() {
		return (EAttribute)aNormativaYLegislacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANormativaYLegislacion_Normativa() {
		return (EReference)aNormativaYLegislacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANormativaYLegislacion_Normativas() {
		return (EReference)aNormativaYLegislacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOperacion() {
		return aOperacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAOperacion_Etiqueta() {
		return (EAttribute)aOperacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOperacion_Operacion() {
		return (EReference)aOperacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOperacion_AccionesSuceso() {
		return (EReference)aOperacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOperacion_Operaciones() {
		return (EReference)aOperacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASubprocedimiento() {
		return aSubprocedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADocumentoFinal() {
		return aDocumentoFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFlujo() {
		return aFlujoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFlujo_Etiqueta() {
		return (EAttribute)aFlujoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFlujo_Flujo() {
		return (EReference)aFlujoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFlujo_FlujoDeSucesos() {
		return (EReference)aFlujoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFlujo_Flujos() {
		return (EReference)aFlujoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampoDatos() {
		return campoDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Etiqueta() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Nombre() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Descripcion() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Tipo() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Formato() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Ejemplo() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Requerido() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_ValorPorDefecto() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Rango() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_RangoRazonable() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_FuenteDatos() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Observaciones() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampoDatos_Comentario() {
		return (EAttribute)campoDatosEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoDatos_EstructurasDatos() {
		return (EReference)campoDatosEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampoDatos_Campos() {
		return (EReference)campoDatosEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstructuraDatos() {
		return estructuraDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraDatos_Etiqueta() {
		return (EAttribute)estructuraDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraDatos_Nombre() {
		return (EAttribute)estructuraDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraDatos_Comentario() {
		return (EAttribute)estructuraDatosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_Campos() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_Documentos() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_MiembroRelaciones() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_EntradasOSalidas() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_EstructuraDatosDeSuceso() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_ColeccionEstructuraDatosDeSuceso() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraDatos_EstructurasDatos() {
		return (EReference)estructuraDatosEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacionDatos() {
		return relacionDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionDatos_Etiqueta() {
		return (EAttribute)relacionDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionDatos_Nombre() {
		return (EAttribute)relacionDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionDatos_Comentario() {
		return (EAttribute)relacionDatosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacionDatos_Miembros() {
		return (EReference)relacionDatosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacionDatos_RelacionesDatos() {
		return (EReference)relacionDatosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiembroRelacion() {
		return miembroRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_Etiqueta() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_Nombre() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_Comentario() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_TipoRelacion() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_MultiplicidadMinima() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiembroRelacion_MultiplicidadMaxima() {
		return (EAttribute)miembroRelacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiembroRelacion_EstructuraDatos() {
		return (EReference)miembroRelacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiembroRelacion_Relacion() {
		return (EReference)miembroRelacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgrupacion() {
		return agrupacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgrupacion_Etiqueta() {
		return (EAttribute)agrupacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgrupacion_Nombre() {
		return (EAttribute)agrupacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgrupacion_Codigo() {
		return (EAttribute)agrupacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgrupacion_Descripcion() {
		return (EAttribute)agrupacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgrupacion_Comentario() {
		return (EAttribute)agrupacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuceso() {
		return sucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_Prioridad() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_Tipo() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_Rendimiento() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_Disparo() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_Distribucion() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_PreCondicion() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_PostCondicion() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuceso_EsColaborativo() {
		return (EAttribute)sucesoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Acciones() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Actores() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_EstructurasDatos() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Flujos() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Entradas() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Salidas() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_UsadoPorSucesos() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Procedimiento() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuceso_Sucesos() {
		return (EReference)sucesoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSucesoConsultor() {
		return sucesoConsultorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSucesoConstructor() {
		return sucesoConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistema() {
		return sistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistema_Procedimiento() {
		return (EReference)sistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistema_TodosSucesos() {
		return (EReference)sistemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistema_TodosSubsistemas() {
		return (EReference)sistemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistema_Sistemas() {
		return (EReference)sistemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsistema() {
		return subsistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsistema_TipoSubsistema() {
		return (EAttribute)subsistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsistema_Procedimiento() {
		return (EReference)subsistemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsistema_TodosSucesos() {
		return (EReference)subsistemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsistema_UsosSubsistemas() {
		return (EReference)subsistemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsistema_UsadoPorSubsistemas() {
		return (EReference)subsistemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsistema_Subsistemas() {
		return (EReference)subsistemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Etiqueta() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Nombre() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Comentario() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Unidades() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ActorDeSucesos() {
		return (EReference)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Acciones() {
		return (EReference)actorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Actores() {
		return (EReference)actorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorFuncional() {
		return actorFuncionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorFuncional_NombreFuncional() {
		return (EAttribute)actorFuncionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADocumento() {
		return aDocumentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADocumento_Etiqueta() {
		return (EAttribute)aDocumentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_Documento() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADocumento_Nombre() {
		return (EAttribute)aDocumentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADocumento_Descripcion() {
		return (EAttribute)aDocumentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_EstructurasDatos() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_EntradasOSalidas() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_Estados() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_Documentos() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADocumento_TodosDocumentos() {
		return (EReference)aDocumentoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntradaOSalida() {
		return entradaOSalidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaOSalida_Nombre() {
		return (EAttribute)entradaOSalidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaOSalida_EsDocumentoPapel() {
		return (EAttribute)entradaOSalidaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaOSalida_Descripcion() {
		return (EAttribute)entradaOSalidaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaOSalida_Comentario() {
		return (EAttribute)entradaOSalidaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntradaOSalida_EstructurasDatos() {
		return (EReference)entradaOSalidaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntradaOSalida_Documentos() {
		return (EReference)entradaOSalidaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntrada() {
		return entradaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntrada_Fuentes() {
		return (EReference)entradaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalida() {
		return salidaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalida_Destinos() {
		return (EReference)salidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntradaSuceso() {
		return entradaSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaSuceso_Etiqueta() {
		return (EAttribute)entradaSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaSuceso_EsInformacionPrevia() {
		return (EAttribute)entradaSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntradaSuceso_Entradas() {
		return (EReference)entradaSucesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaSuceso_EtiquetaSimple() {
		return (EAttribute)entradaSucesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalidaSuceso() {
		return salidaSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaSuceso_Etiqueta() {
		return (EAttribute)salidaSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaSuceso_EsDistribucion() {
		return (EAttribute)salidaSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalidaSuceso_Salidas() {
		return (EReference)salidaSucesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaSuceso_EtiquetaSimple() {
		return (EAttribute)salidaSucesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccion() {
		return accionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccion_Etiqueta() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccion_Comentario() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccion_EsColaborativa() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Operaciones() {
		return (EReference)accionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Actores() {
		return (EReference)accionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Entradas() {
		return (EReference)accionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Salidas() {
		return (EReference)accionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Acciones() {
		return (EReference)accionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccion_EtiquetaSimple() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntradaAccion() {
		return entradaAccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaAccion_Etiqueta() {
		return (EAttribute)entradaAccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaAccion_EtiquetaSimple() {
		return (EAttribute)entradaAccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntradaAccion_Entradas() {
		return (EReference)entradaAccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalidaAccion() {
		return salidaAccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaAccion_Etiqueta() {
		return (EAttribute)salidaAccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaAccion_EtiquetaSimple() {
		return (EAttribute)salidaAccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalidaAccion_Salidas() {
		return (EReference)salidaAccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnotacion() {
		return anotacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_Comentario() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_IdAnotada() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_VersionAnotada() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_FechaAnotacion() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_RealizadorAnotacion() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotacion_ResponsableAnotacion() {
		return (EAttribute)anotacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoSuceso() {
		return usoSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoSuceso_SucesoUsado() {
		return (EReference)usoSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportadorServicios() {
		return importadorServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportadorServicios_ImportacionesServicios() {
		return (EReference)importadorServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoServicio() {
		return usoServicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoServicio_Servicio() {
		return (EReference)usoServicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorSucesos() {
		return contenedorSucesosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSucesos_Sucesos() {
		return (EReference)contenedorSucesosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorSubsistemas() {
		return contenedorSubsistemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSubsistemas_Subsistemas() {
		return (EReference)contenedorSubsistemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSistemas() {
		return cSistemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSistemas_Sistemas() {
		return (EReference)cSistemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSistemas_Procedimiento() {
		return (EReference)cSistemasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSubsistemas() {
		return cSubsistemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubsistemas_Subsistemas() {
		return (EReference)cSubsistemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubsistemas_Contenedor() {
		return (EReference)cSubsistemasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubsistemas_Procedimiento() {
		return (EReference)cSubsistemasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSucesos() {
		return cSucesosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSucesos_Sucesos() {
		return (EReference)cSucesosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSucesos_Contenedor() {
		return (EReference)cSucesosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSucesos_Procedimiento() {
		return (EReference)cSucesosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAccionesSuceso() {
		return cAccionesSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAccionesSuceso_Acciones() {
		return (EReference)cAccionesSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAccionesSuceso_Suceso() {
		return (EReference)cAccionesSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCActoresSuceso() {
		return cActoresSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCActoresSuceso_Etiqueta() {
		return (EAttribute)cActoresSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCActoresSuceso_Actores() {
		return (EReference)cActoresSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCActoresSuceso_Suceso() {
		return (EReference)cActoresSucesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEstructurasDatosSuceso() {
		return cEstructurasDatosSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEstructurasDatosSuceso_Etiqueta() {
		return (EAttribute)cEstructurasDatosSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasDatosSuceso_EstructurasDatos() {
		return (EReference)cEstructurasDatosSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasDatosSuceso_Suceso() {
		return (EReference)cEstructurasDatosSucesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFlujos() {
		return cFlujosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFlujos_Flujos() {
		return (EReference)cFlujosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFlujos_Procedimiento() {
		return (EReference)cFlujosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDocumentos() {
		return cDocumentosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDocumentos_Documentos() {
		return (EReference)cDocumentosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDocumentos_Contenedor() {
		return (EReference)cDocumentosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCNormativasYLegislaciones() {
		return cNormativasYLegislacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNormativasYLegislaciones_Normativas() {
		return (EReference)cNormativasYLegislacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNormativasYLegislaciones_Procedimiento() {
		return (EReference)cNormativasYLegislacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOperaciones() {
		return cOperacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOperaciones_Procedimiento() {
		return (EReference)cOperacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOperaciones_Operaciones() {
		return (EReference)cOperacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCCamposDatos() {
		return cCamposDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCCamposDatos_Campos() {
		return (EReference)cCamposDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCCamposDatos_Contenedor() {
		return (EReference)cCamposDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEstructurasDatos() {
		return cEstructurasDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasDatos_EstructurasDatos() {
		return (EReference)cEstructurasDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasDatos_Contenedor() {
		return (EReference)cEstructurasDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFlujosSuceso() {
		return cFlujosSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFlujosSuceso_Flujos() {
		return (EReference)cFlujosSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFlujosSuceso_Suceso() {
		return (EReference)cFlujosSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCImportacionesPor() {
		return cImportacionesPorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCImportacionesPor_Etiqueta() {
		return (EAttribute)cImportacionesPorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCImportacionesPor_LibreriaServicios() {
		return (EReference)cImportacionesPorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCImportacionesPor_ImportadoPor() {
		return (EReference)cImportacionesPorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUsadoPorSucesos() {
		return cUsadoPorSucesosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUsadoPorSucesos_Etiqueta() {
		return (EAttribute)cUsadoPorSucesosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsadoPorSucesos_Suceso() {
		return (EReference)cUsadoPorSucesosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsadoPorSucesos_UsosSuceso() {
		return (EReference)cUsadoPorSucesosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEntradasSuceso() {
		return cEntradasSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEntradasSuceso_Entradas() {
		return (EReference)cEntradasSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEntradasSuceso_Suceso() {
		return (EReference)cEntradasSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSalidasSuceso() {
		return cSalidasSucesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSalidasSuceso_Salidas() {
		return (EReference)cSalidasSucesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSalidasSuceso_Suceso() {
		return (EReference)cSalidasSucesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRelacionesDatos() {
		return cRelacionesDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRelacionesDatos_RelacionesDatos() {
		return (EReference)cRelacionesDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRelacionesDatos_Contenedor() {
		return (EReference)cRelacionesDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCActores() {
		return cActoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCActores_Actores() {
		return (EReference)cActoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCActores_Procedimiento() {
		return (EReference)cActoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCProcedimientos() {
		return cProcedimientosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCProcedimientos_Procedimientos() {
		return (EReference)cProcedimientosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCProcedimientos_Repositorio() {
		return (EReference)cProcedimientosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLibreriasServicios() {
		return cLibreriasServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLibreriasServicios_LibreriasServicios() {
		return (EReference)cLibreriasServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLibreriasServicios_Repositorio() {
		return (EReference)cLibreriasServiciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAplicaciones() {
		return cAplicacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAplicaciones_Aplicaciones() {
		return (EReference)cAplicacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAplicaciones_Procedimiento() {
		return (EReference)cAplicacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUnidadesOrganicas() {
		return cUnidadesOrganicasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidadesOrganicas_Unidades() {
		return (EReference)cUnidadesOrganicasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidadesOrganicas_Procedimiento() {
		return (EReference)cUnidadesOrganicasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUnidadesExternas() {
		return cUnidadesExternasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidadesExternas_Unidades() {
		return (EReference)cUnidadesExternasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidadesExternas_Procedimiento() {
		return (EReference)cUnidadesExternasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUnidades() {
		return cUnidadesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidades_Unidades() {
		return (EReference)cUnidadesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUnidades_Procedimiento() {
		return (EReference)cUnidadesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEstructurasFuncionales() {
		return cEstructurasFuncionalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasFuncionales_EstructurasFuncionales() {
		return (EReference)cEstructurasFuncionalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEstructurasFuncionales_Procedimiento() {
		return (EReference)cEstructurasFuncionalesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTerminosGlosario() {
		return cTerminosGlosarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTerminosGlosario_TerminosGlosario() {
		return (EReference)cTerminosGlosarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTerminosGlosario_Procedimiento() {
		return (EReference)cTerminosGlosarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEntradasAccion() {
		return cEntradasAccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEntradasAccion_Entradas() {
		return (EReference)cEntradasAccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEntradasAccion_Accion() {
		return (EReference)cEntradasAccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSalidasAccion() {
		return cSalidasAccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSalidasAccion_Salidas() {
		return (EReference)cSalidasAccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSalidasAccion_Accion() {
		return (EReference)cSalidasAccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaz() {
		return interfazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_Servicios() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_Interfaces() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_RolSolicitante() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_RolSolicitado() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibreriaServicios() {
		return libreriaServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_ImportadoPor() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_LibreriasServicios() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_Interfaces() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_TodosDocumentos() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_TodasEstructurasDatos() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibreriaServicios_Repositorio() {
		return (EReference)libreriaServiciosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_Etiqueta() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_Nombre() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_Comentario() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolSolicitante() {
		return rolSolicitanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolSolicitante_Interfaz() {
		return (EReference)rolSolicitanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolSolicitado() {
		return rolSolicitadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolSolicitado_Interfaz() {
		return (EReference)rolSolicitadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicio() {
		return servicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicio_UsadoPorSucesos() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicio_Servicios() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicio_Entradas() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicio_Salidas() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntradaServicio() {
		return entradaServicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaServicio_Etiqueta() {
		return (EAttribute)entradaServicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntradaServicio_Servicio() {
		return (EReference)entradaServicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntradaServicio_EtiquetaSimple() {
		return (EAttribute)entradaServicioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalidaServicio() {
		return salidaServicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaServicio_Etiqueta() {
		return (EAttribute)salidaServicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalidaServicio_Servicio() {
		return (EReference)salidaServicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalidaServicio_EtiquetaSimple() {
		return (EAttribute)salidaServicioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportacionServicios() {
		return importacionServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportacionServicios_Etiqueta() {
		return (EAttribute)importacionServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportacionServicios_ImportacionesServicios() {
		return (EReference)importacionServiciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportacionServicios_LibreriaServicios() {
		return (EReference)importacionServiciosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCImportacionesServicios() {
		return cImportacionesServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCImportacionesServicios_Importador() {
		return (EReference)cImportacionesServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCImportacionesServicios_ImportacionesServicios() {
		return (EReference)cImportacionesServiciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUsosSubsistemas() {
		return cUsosSubsistemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsosSubsistemas_UsosSubsistemas() {
		return (EReference)cUsosSubsistemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsosSubsistemas_Subsistema() {
		return (EReference)cUsosSubsistemasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentoEnEstado() {
		return documentoEnEstadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentoEnEstado_CondicionesEstado() {
		return (EAttribute)documentoEnEstadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoEnEstado_DocumentoBase() {
		return (EReference)documentoEnEstadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCUsadoPorSubsistemas() {
		return cUsadoPorSubsistemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCUsadoPorSubsistemas_Etiqueta() {
		return (EAttribute)cUsadoPorSubsistemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsadoPorSubsistemas_UsadoPorSubsistemas() {
		return (EReference)cUsadoPorSubsistemasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCUsadoPorSubsistemas_Subsistema() {
		return (EReference)cUsadoPorSubsistemasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCInterfaces() {
		return cInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCInterfaces_Interfaces() {
		return (EReference)cInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCInterfaces_LibreriaServicios() {
		return (EReference)cInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCServicios() {
		return cServiciosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCServicios_Interfaz() {
		return (EReference)cServiciosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCServicios_Servicios() {
		return (EReference)cServiciosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCServicioUsadoPorSucesos() {
		return cServicioUsadoPorSucesosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCServicioUsadoPorSucesos_Etiqueta() {
		return (EAttribute)cServicioUsadoPorSucesosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCServicioUsadoPorSucesos_Servicio() {
		return (EReference)cServicioUsadoPorSucesosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCServicioUsadoPorSucesos_UsosServicio() {
		return (EReference)cServicioUsadoPorSucesosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConModelClass() {
		return conModelClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConModelClass_ModelClass() {
		return (EReference)conModelClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDatos() {
		return contenedorDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatos_EstructurasDatos() {
		return (EReference)contenedorDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatos_Campos() {
		return (EReference)contenedorDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatos_RelacionesDatos() {
		return (EReference)contenedorDatosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrgcasiObject() {
		return orgcasiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrgcasiCollection() {
		return orgcasiCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoSubsistema() {
		return usoSubsistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoSubsistema_Etiqueta() {
		return (EAttribute)usoSubsistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoSubsistema_UsosSubsistemas() {
		return (EReference)usoSubsistemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDocumentos() {
		return contenedorDocumentosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDocumentos_Documentos() {
		return (EReference)contenedorDocumentosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoSubsistema_SubsistemaUsado() {
		return (EReference)usoSubsistemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoUsoDocumento() {
		return tipoUsoDocumentoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPrioridad() {
		return tipoPrioridadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoUnidad() {
		return tipoUnidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoSubsistema() {
		return tipoSubsistemaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoRelacion() {
		return tipoRelacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAgrupacionPredefinida() {
		return tipoAgrupacionPredefinidaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPropiedadClaseAgrupacion() {
		return tipoPropiedadClaseAgrupacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiFactory getOrgcasiFactory() {
		return (OrgcasiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aAplicacionEClass = createEClass(AAPLICACION);
		createEAttribute(aAplicacionEClass, AAPLICACION__ETIQUETA);
		createEReference(aAplicacionEClass, AAPLICACION__APLICACION);
		createEReference(aAplicacionEClass, AAPLICACION__APLICACIONES);

		accionEClass = createEClass(ACCION);
		createEAttribute(accionEClass, ACCION__ETIQUETA);
		createEAttribute(accionEClass, ACCION__COMENTARIO);
		createEAttribute(accionEClass, ACCION__ES_COLABORATIVA);
		createEReference(accionEClass, ACCION__OPERACIONES);
		createEReference(accionEClass, ACCION__ACTORES);
		createEReference(accionEClass, ACCION__ENTRADAS);
		createEReference(accionEClass, ACCION__SALIDAS);
		createEReference(accionEClass, ACCION__ACCIONES);
		createEAttribute(accionEClass, ACCION__ETIQUETA_SIMPLE);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ETIQUETA);
		createEAttribute(actorEClass, ACTOR__NOMBRE);
		createEAttribute(actorEClass, ACTOR__COMENTARIO);
		createEReference(actorEClass, ACTOR__UNIDADES);
		createEReference(actorEClass, ACTOR__ACTOR_DE_SUCESOS);
		createEReference(actorEClass, ACTOR__ACCIONES);
		createEReference(actorEClass, ACTOR__ACTORES);

		actorFuncionalEClass = createEClass(ACTOR_FUNCIONAL);
		createEAttribute(actorFuncionalEClass, ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL);

		aDocumentoEClass = createEClass(ADOCUMENTO);
		createEAttribute(aDocumentoEClass, ADOCUMENTO__ETIQUETA);
		createEAttribute(aDocumentoEClass, ADOCUMENTO__NOMBRE);
		createEAttribute(aDocumentoEClass, ADOCUMENTO__DESCRIPCION);
		createEReference(aDocumentoEClass, ADOCUMENTO__DOCUMENTO);
		createEReference(aDocumentoEClass, ADOCUMENTO__ESTRUCTURAS_DATOS);
		createEReference(aDocumentoEClass, ADOCUMENTO__ENTRADAS_OSALIDAS);
		createEReference(aDocumentoEClass, ADOCUMENTO__ESTADOS);
		createEReference(aDocumentoEClass, ADOCUMENTO__DOCUMENTOS);
		createEReference(aDocumentoEClass, ADOCUMENTO__TODOS_DOCUMENTOS);

		aDocumentoFinalEClass = createEClass(ADOCUMENTO_FINAL);

		aEstructuraFuncionalEClass = createEClass(AESTRUCTURA_FUNCIONAL);
		createEAttribute(aEstructuraFuncionalEClass, AESTRUCTURA_FUNCIONAL__ETIQUETA);
		createEReference(aEstructuraFuncionalEClass, AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL);
		createEReference(aEstructuraFuncionalEClass, AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES);

		aFlujoEClass = createEClass(AFLUJO);
		createEAttribute(aFlujoEClass, AFLUJO__ETIQUETA);
		createEReference(aFlujoEClass, AFLUJO__FLUJO);
		createEReference(aFlujoEClass, AFLUJO__FLUJO_DE_SUCESOS);
		createEReference(aFlujoEClass, AFLUJO__FLUJOS);

		agrupacionEClass = createEClass(AGRUPACION);
		createEAttribute(agrupacionEClass, AGRUPACION__ETIQUETA);
		createEAttribute(agrupacionEClass, AGRUPACION__NOMBRE);
		createEAttribute(agrupacionEClass, AGRUPACION__CODIGO);
		createEAttribute(agrupacionEClass, AGRUPACION__DESCRIPCION);
		createEAttribute(agrupacionEClass, AGRUPACION__COMENTARIO);

		aNormativaYLegislacionEClass = createEClass(ANORMATIVA_YLEGISLACION);
		createEAttribute(aNormativaYLegislacionEClass, ANORMATIVA_YLEGISLACION__ETIQUETA);
		createEReference(aNormativaYLegislacionEClass, ANORMATIVA_YLEGISLACION__NORMATIVA);
		createEReference(aNormativaYLegislacionEClass, ANORMATIVA_YLEGISLACION__NORMATIVAS);

		anotacionEClass = createEClass(ANOTACION);
		createEAttribute(anotacionEClass, ANOTACION__COMENTARIO);
		createEAttribute(anotacionEClass, ANOTACION__ID_ANOTADA);
		createEAttribute(anotacionEClass, ANOTACION__VERSION_ANOTADA);
		createEAttribute(anotacionEClass, ANOTACION__FECHA_ANOTACION);
		createEAttribute(anotacionEClass, ANOTACION__REALIZADOR_ANOTACION);
		createEAttribute(anotacionEClass, ANOTACION__RESPONSABLE_ANOTACION);

		aOperacionEClass = createEClass(AOPERACION);
		createEAttribute(aOperacionEClass, AOPERACION__ETIQUETA);
		createEReference(aOperacionEClass, AOPERACION__OPERACION);
		createEReference(aOperacionEClass, AOPERACION__ACCIONES_SUCESO);
		createEReference(aOperacionEClass, AOPERACION__OPERACIONES);

		aProcedimientoEClass = createEClass(APROCEDIMIENTO);
		createEAttribute(aProcedimientoEClass, APROCEDIMIENTO__ETIQUETA);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__PROCEDIMIENTO);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__NORMATIVAS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__TERMINOS_GLOSARIO);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__UNIDADES_ORGANICAS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__UNIDADES_EXTERNAS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__UNIDADES);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__APLICACIONES);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__OPERACIONES);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__FLUJOS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__ACTORES);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__SISTEMAS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__PROCEDIMIENTOS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__TODOS_SUCESOS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__TODOS_SUBSISTEMAS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__TODOS_DOCUMENTOS);
		createEReference(aProcedimientoEClass, APROCEDIMIENTO__REPOSITORIO);

		aRepositorioEClass = createEClass(AREPOSITORIO);
		createEReference(aRepositorioEClass, AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO);
		createEReference(aRepositorioEClass, AREPOSITORIO__REPOSITORIO);
		createEReference(aRepositorioEClass, AREPOSITORIO__MODEL_PACKAGE);
		createEReference(aRepositorioEClass, AREPOSITORIO__LIBRERIAS_SERVICIOS);

		aSubprocedimientoEClass = createEClass(ASUBPROCEDIMIENTO);

		aTerminoGlosarioEClass = createEClass(ATERMINO_GLOSARIO);
		createEAttribute(aTerminoGlosarioEClass, ATERMINO_GLOSARIO__ETIQUETA);
		createEReference(aTerminoGlosarioEClass, ATERMINO_GLOSARIO__TERMINO_GLOSARIO);
		createEReference(aTerminoGlosarioEClass, ATERMINO_GLOSARIO__TERMINOS_GLOSARIO);

		aUnidadEClass = createEClass(AUNIDAD);
		createEAttribute(aUnidadEClass, AUNIDAD__ETIQUETA);
		createEReference(aUnidadEClass, AUNIDAD__ACTORES_SUCESOS);

		aUnidadExternaEClass = createEClass(AUNIDAD_EXTERNA);
		createEReference(aUnidadExternaEClass, AUNIDAD_EXTERNA__UNIDAD);
		createEReference(aUnidadExternaEClass, AUNIDAD_EXTERNA__UNIDADES);

		aUnidadOrganicaEClass = createEClass(AUNIDAD_ORGANICA);
		createEAttribute(aUnidadOrganicaEClass, AUNIDAD_ORGANICA__TIPO_UNIDAD);
		createEReference(aUnidadOrganicaEClass, AUNIDAD_ORGANICA__UNIDAD);
		createEReference(aUnidadOrganicaEClass, AUNIDAD_ORGANICA__UNIDADES);

		cAccionesSucesoEClass = createEClass(CACCIONES_SUCESO);
		createEReference(cAccionesSucesoEClass, CACCIONES_SUCESO__ACCIONES);
		createEReference(cAccionesSucesoEClass, CACCIONES_SUCESO__SUCESO);

		cActoresEClass = createEClass(CACTORES);
		createEReference(cActoresEClass, CACTORES__ACTORES);
		createEReference(cActoresEClass, CACTORES__PROCEDIMIENTO);

		cActoresSucesoEClass = createEClass(CACTORES_SUCESO);
		createEAttribute(cActoresSucesoEClass, CACTORES_SUCESO__ETIQUETA);
		createEReference(cActoresSucesoEClass, CACTORES_SUCESO__ACTORES);
		createEReference(cActoresSucesoEClass, CACTORES_SUCESO__SUCESO);

		campoDatosEClass = createEClass(CAMPO_DATOS);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__ETIQUETA);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__NOMBRE);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__DESCRIPCION);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__TIPO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__FORMATO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__EJEMPLO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__REQUERIDO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__VALOR_POR_DEFECTO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__RANGO);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__RANGO_RAZONABLE);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__FUENTE_DATOS);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__OBSERVACIONES);
		createEAttribute(campoDatosEClass, CAMPO_DATOS__COMENTARIO);
		createEReference(campoDatosEClass, CAMPO_DATOS__ESTRUCTURAS_DATOS);
		createEReference(campoDatosEClass, CAMPO_DATOS__CAMPOS);

		cAplicacionesEClass = createEClass(CAPLICACIONES);
		createEReference(cAplicacionesEClass, CAPLICACIONES__APLICACIONES);
		createEReference(cAplicacionesEClass, CAPLICACIONES__PROCEDIMIENTO);

		cCamposDatosEClass = createEClass(CCAMPOS_DATOS);
		createEReference(cCamposDatosEClass, CCAMPOS_DATOS__CAMPOS);
		createEReference(cCamposDatosEClass, CCAMPOS_DATOS__CONTENEDOR);

		cDocumentosEClass = createEClass(CDOCUMENTOS);
		createEReference(cDocumentosEClass, CDOCUMENTOS__DOCUMENTOS);
		createEReference(cDocumentosEClass, CDOCUMENTOS__CONTENEDOR);

		cEntradasAccionEClass = createEClass(CENTRADAS_ACCION);
		createEReference(cEntradasAccionEClass, CENTRADAS_ACCION__ENTRADAS);
		createEReference(cEntradasAccionEClass, CENTRADAS_ACCION__ACCION);

		cEntradasSucesoEClass = createEClass(CENTRADAS_SUCESO);
		createEReference(cEntradasSucesoEClass, CENTRADAS_SUCESO__ENTRADAS);
		createEReference(cEntradasSucesoEClass, CENTRADAS_SUCESO__SUCESO);

		cEstructurasDatosEClass = createEClass(CESTRUCTURAS_DATOS);
		createEReference(cEstructurasDatosEClass, CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS);
		createEReference(cEstructurasDatosEClass, CESTRUCTURAS_DATOS__CONTENEDOR);

		cEstructurasDatosSucesoEClass = createEClass(CESTRUCTURAS_DATOS_SUCESO);
		createEAttribute(cEstructurasDatosSucesoEClass, CESTRUCTURAS_DATOS_SUCESO__ETIQUETA);
		createEReference(cEstructurasDatosSucesoEClass, CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS);
		createEReference(cEstructurasDatosSucesoEClass, CESTRUCTURAS_DATOS_SUCESO__SUCESO);

		cFlujosEClass = createEClass(CFLUJOS);
		createEReference(cFlujosEClass, CFLUJOS__FLUJOS);
		createEReference(cFlujosEClass, CFLUJOS__PROCEDIMIENTO);

		cFlujosSucesoEClass = createEClass(CFLUJOS_SUCESO);
		createEReference(cFlujosSucesoEClass, CFLUJOS_SUCESO__FLUJOS);
		createEReference(cFlujosSucesoEClass, CFLUJOS_SUCESO__SUCESO);

		cEstructurasFuncionalesEClass = createEClass(CESTRUCTURAS_FUNCIONALES);
		createEReference(cEstructurasFuncionalesEClass, CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES);
		createEReference(cEstructurasFuncionalesEClass, CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO);

		cImportacionesPorEClass = createEClass(CIMPORTACIONES_POR);
		createEAttribute(cImportacionesPorEClass, CIMPORTACIONES_POR__ETIQUETA);
		createEReference(cImportacionesPorEClass, CIMPORTACIONES_POR__LIBRERIA_SERVICIOS);
		createEReference(cImportacionesPorEClass, CIMPORTACIONES_POR__IMPORTADO_POR);

		cImportacionesServiciosEClass = createEClass(CIMPORTACIONES_SERVICIOS);
		createEReference(cImportacionesServiciosEClass, CIMPORTACIONES_SERVICIOS__IMPORTADOR);
		createEReference(cImportacionesServiciosEClass, CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS);

		cInterfacesEClass = createEClass(CINTERFACES);
		createEReference(cInterfacesEClass, CINTERFACES__INTERFACES);
		createEReference(cInterfacesEClass, CINTERFACES__LIBRERIA_SERVICIOS);

		cLibreriasServiciosEClass = createEClass(CLIBRERIAS_SERVICIOS);
		createEReference(cLibreriasServiciosEClass, CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS);
		createEReference(cLibreriasServiciosEClass, CLIBRERIAS_SERVICIOS__REPOSITORIO);

		cNormativasYLegislacionesEClass = createEClass(CNORMATIVAS_YLEGISLACIONES);
		createEReference(cNormativasYLegislacionesEClass, CNORMATIVAS_YLEGISLACIONES__NORMATIVAS);
		createEReference(cNormativasYLegislacionesEClass, CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO);

		conModelClassEClass = createEClass(CON_MODEL_CLASS);
		createEReference(conModelClassEClass, CON_MODEL_CLASS__MODEL_CLASS);

		contenedorDatosEClass = createEClass(CONTENEDOR_DATOS);
		createEReference(contenedorDatosEClass, CONTENEDOR_DATOS__ESTRUCTURAS_DATOS);
		createEReference(contenedorDatosEClass, CONTENEDOR_DATOS__CAMPOS);
		createEReference(contenedorDatosEClass, CONTENEDOR_DATOS__RELACIONES_DATOS);

		contenedorDocumentosEClass = createEClass(CONTENEDOR_DOCUMENTOS);
		createEReference(contenedorDocumentosEClass, CONTENEDOR_DOCUMENTOS__DOCUMENTOS);

		contenedorSucesosEClass = createEClass(CONTENEDOR_SUCESOS);
		createEReference(contenedorSucesosEClass, CONTENEDOR_SUCESOS__SUCESOS);

		contenedorSubsistemasEClass = createEClass(CONTENEDOR_SUBSISTEMAS);
		createEReference(contenedorSubsistemasEClass, CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS);

		cOperacionesEClass = createEClass(COPERACIONES);
		createEReference(cOperacionesEClass, COPERACIONES__PROCEDIMIENTO);
		createEReference(cOperacionesEClass, COPERACIONES__OPERACIONES);

		cProcedimientosEClass = createEClass(CPROCEDIMIENTOS);
		createEReference(cProcedimientosEClass, CPROCEDIMIENTOS__PROCEDIMIENTOS);
		createEReference(cProcedimientosEClass, CPROCEDIMIENTOS__REPOSITORIO);

		cRelacionesDatosEClass = createEClass(CRELACIONES_DATOS);
		createEReference(cRelacionesDatosEClass, CRELACIONES_DATOS__RELACIONES_DATOS);
		createEReference(cRelacionesDatosEClass, CRELACIONES_DATOS__CONTENEDOR);

		cSalidasAccionEClass = createEClass(CSALIDAS_ACCION);
		createEReference(cSalidasAccionEClass, CSALIDAS_ACCION__SALIDAS);
		createEReference(cSalidasAccionEClass, CSALIDAS_ACCION__ACCION);

		cSalidasSucesoEClass = createEClass(CSALIDAS_SUCESO);
		createEReference(cSalidasSucesoEClass, CSALIDAS_SUCESO__SALIDAS);
		createEReference(cSalidasSucesoEClass, CSALIDAS_SUCESO__SUCESO);

		cServiciosEClass = createEClass(CSERVICIOS);
		createEReference(cServiciosEClass, CSERVICIOS__INTERFAZ);
		createEReference(cServiciosEClass, CSERVICIOS__SERVICIOS);

		cServicioUsadoPorSucesosEClass = createEClass(CSERVICIO_USADO_POR_SUCESOS);
		createEAttribute(cServicioUsadoPorSucesosEClass, CSERVICIO_USADO_POR_SUCESOS__ETIQUETA);
		createEReference(cServicioUsadoPorSucesosEClass, CSERVICIO_USADO_POR_SUCESOS__SERVICIO);
		createEReference(cServicioUsadoPorSucesosEClass, CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO);

		cSistemasEClass = createEClass(CSISTEMAS);
		createEReference(cSistemasEClass, CSISTEMAS__SISTEMAS);
		createEReference(cSistemasEClass, CSISTEMAS__PROCEDIMIENTO);

		cSubsistemasEClass = createEClass(CSUBSISTEMAS);
		createEReference(cSubsistemasEClass, CSUBSISTEMAS__SUBSISTEMAS);
		createEReference(cSubsistemasEClass, CSUBSISTEMAS__CONTENEDOR);
		createEReference(cSubsistemasEClass, CSUBSISTEMAS__PROCEDIMIENTO);

		cSucesosEClass = createEClass(CSUCESOS);
		createEReference(cSucesosEClass, CSUCESOS__SUCESOS);
		createEReference(cSucesosEClass, CSUCESOS__CONTENEDOR);
		createEReference(cSucesosEClass, CSUCESOS__PROCEDIMIENTO);

		cTerminosGlosarioEClass = createEClass(CTERMINOS_GLOSARIO);
		createEReference(cTerminosGlosarioEClass, CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO);
		createEReference(cTerminosGlosarioEClass, CTERMINOS_GLOSARIO__PROCEDIMIENTO);

		cUnidadesEClass = createEClass(CUNIDADES);
		createEReference(cUnidadesEClass, CUNIDADES__UNIDADES);
		createEReference(cUnidadesEClass, CUNIDADES__PROCEDIMIENTO);

		cUnidadesExternasEClass = createEClass(CUNIDADES_EXTERNAS);
		createEReference(cUnidadesExternasEClass, CUNIDADES_EXTERNAS__UNIDADES);
		createEReference(cUnidadesExternasEClass, CUNIDADES_EXTERNAS__PROCEDIMIENTO);

		cUnidadesOrganicasEClass = createEClass(CUNIDADES_ORGANICAS);
		createEReference(cUnidadesOrganicasEClass, CUNIDADES_ORGANICAS__UNIDADES);
		createEReference(cUnidadesOrganicasEClass, CUNIDADES_ORGANICAS__PROCEDIMIENTO);

		cUsadoPorSubsistemasEClass = createEClass(CUSADO_POR_SUBSISTEMAS);
		createEAttribute(cUsadoPorSubsistemasEClass, CUSADO_POR_SUBSISTEMAS__ETIQUETA);
		createEReference(cUsadoPorSubsistemasEClass, CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS);
		createEReference(cUsadoPorSubsistemasEClass, CUSADO_POR_SUBSISTEMAS__SUBSISTEMA);

		cUsadoPorSucesosEClass = createEClass(CUSADO_POR_SUCESOS);
		createEAttribute(cUsadoPorSucesosEClass, CUSADO_POR_SUCESOS__ETIQUETA);
		createEReference(cUsadoPorSucesosEClass, CUSADO_POR_SUCESOS__SUCESO);
		createEReference(cUsadoPorSucesosEClass, CUSADO_POR_SUCESOS__USOS_SUCESO);

		cUsosSubsistemasEClass = createEClass(CUSOS_SUBSISTEMAS);
		createEReference(cUsosSubsistemasEClass, CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS);
		createEReference(cUsosSubsistemasEClass, CUSOS_SUBSISTEMAS__SUBSISTEMA);

		documentoEnEstadoEClass = createEClass(DOCUMENTO_EN_ESTADO);
		createEAttribute(documentoEnEstadoEClass, DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO);
		createEReference(documentoEnEstadoEClass, DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE);

		entradaEClass = createEClass(ENTRADA);
		createEReference(entradaEClass, ENTRADA__FUENTES);

		entradaAccionEClass = createEClass(ENTRADA_ACCION);
		createEAttribute(entradaAccionEClass, ENTRADA_ACCION__ETIQUETA);
		createEAttribute(entradaAccionEClass, ENTRADA_ACCION__ETIQUETA_SIMPLE);
		createEReference(entradaAccionEClass, ENTRADA_ACCION__ENTRADAS);

		entradaOSalidaEClass = createEClass(ENTRADA_OSALIDA);
		createEAttribute(entradaOSalidaEClass, ENTRADA_OSALIDA__NOMBRE);
		createEAttribute(entradaOSalidaEClass, ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL);
		createEAttribute(entradaOSalidaEClass, ENTRADA_OSALIDA__DESCRIPCION);
		createEAttribute(entradaOSalidaEClass, ENTRADA_OSALIDA__COMENTARIO);
		createEReference(entradaOSalidaEClass, ENTRADA_OSALIDA__ESTRUCTURAS_DATOS);
		createEReference(entradaOSalidaEClass, ENTRADA_OSALIDA__DOCUMENTOS);

		entradaServicioEClass = createEClass(ENTRADA_SERVICIO);
		createEAttribute(entradaServicioEClass, ENTRADA_SERVICIO__ETIQUETA);
		createEReference(entradaServicioEClass, ENTRADA_SERVICIO__SERVICIO);
		createEAttribute(entradaServicioEClass, ENTRADA_SERVICIO__ETIQUETA_SIMPLE);

		entradaSucesoEClass = createEClass(ENTRADA_SUCESO);
		createEAttribute(entradaSucesoEClass, ENTRADA_SUCESO__ETIQUETA);
		createEAttribute(entradaSucesoEClass, ENTRADA_SUCESO__ES_INFORMACION_PREVIA);
		createEReference(entradaSucesoEClass, ENTRADA_SUCESO__ENTRADAS);
		createEAttribute(entradaSucesoEClass, ENTRADA_SUCESO__ETIQUETA_SIMPLE);

		estructuraDatosEClass = createEClass(ESTRUCTURA_DATOS);
		createEAttribute(estructuraDatosEClass, ESTRUCTURA_DATOS__ETIQUETA);
		createEAttribute(estructuraDatosEClass, ESTRUCTURA_DATOS__NOMBRE);
		createEAttribute(estructuraDatosEClass, ESTRUCTURA_DATOS__COMENTARIO);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__CAMPOS);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__DOCUMENTOS);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__MIEMBRO_RELACIONES);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO);
		createEReference(estructuraDatosEClass, ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS);

		importacionServiciosEClass = createEClass(IMPORTACION_SERVICIOS);
		createEAttribute(importacionServiciosEClass, IMPORTACION_SERVICIOS__ETIQUETA);
		createEReference(importacionServiciosEClass, IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS);
		createEReference(importacionServiciosEClass, IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS);

		importadorServiciosEClass = createEClass(IMPORTADOR_SERVICIOS);
		createEReference(importadorServiciosEClass, IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS);

		interfazEClass = createEClass(INTERFAZ);
		createEReference(interfazEClass, INTERFAZ__SERVICIOS);
		createEReference(interfazEClass, INTERFAZ__INTERFACES);
		createEReference(interfazEClass, INTERFAZ__ROL_SOLICITANTE);
		createEReference(interfazEClass, INTERFAZ__ROL_SOLICITADO);

		libreriaServiciosEClass = createEClass(LIBRERIA_SERVICIOS);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__IMPORTADO_POR);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__INTERFACES);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__TODOS_DOCUMENTOS);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__TODAS_ESTRUCTURAS_DATOS);
		createEReference(libreriaServiciosEClass, LIBRERIA_SERVICIOS__REPOSITORIO);

		miembroRelacionEClass = createEClass(MIEMBRO_RELACION);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__ETIQUETA);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__NOMBRE);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__COMENTARIO);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__TIPO_RELACION);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA);
		createEAttribute(miembroRelacionEClass, MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA);
		createEReference(miembroRelacionEClass, MIEMBRO_RELACION__ESTRUCTURA_DATOS);
		createEReference(miembroRelacionEClass, MIEMBRO_RELACION__RELACION);

		orgcasiCollectionEClass = createEClass(ORGCASI_COLLECTION);

		orgcasiObjectEClass = createEClass(ORGCASI_OBJECT);

		relacionDatosEClass = createEClass(RELACION_DATOS);
		createEAttribute(relacionDatosEClass, RELACION_DATOS__ETIQUETA);
		createEAttribute(relacionDatosEClass, RELACION_DATOS__NOMBRE);
		createEAttribute(relacionDatosEClass, RELACION_DATOS__COMENTARIO);
		createEReference(relacionDatosEClass, RELACION_DATOS__MIEMBROS);
		createEReference(relacionDatosEClass, RELACION_DATOS__RELACIONES_DATOS);

		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__ETIQUETA);
		createEAttribute(rolEClass, ROL__NOMBRE);
		createEAttribute(rolEClass, ROL__COMENTARIO);

		rolSolicitanteEClass = createEClass(ROL_SOLICITANTE);
		createEReference(rolSolicitanteEClass, ROL_SOLICITANTE__INTERFAZ);

		rolSolicitadoEClass = createEClass(ROL_SOLICITADO);
		createEReference(rolSolicitadoEClass, ROL_SOLICITADO__INTERFAZ);

		salidaEClass = createEClass(SALIDA);
		createEReference(salidaEClass, SALIDA__DESTINOS);

		salidaAccionEClass = createEClass(SALIDA_ACCION);
		createEAttribute(salidaAccionEClass, SALIDA_ACCION__ETIQUETA);
		createEAttribute(salidaAccionEClass, SALIDA_ACCION__ETIQUETA_SIMPLE);
		createEReference(salidaAccionEClass, SALIDA_ACCION__SALIDAS);

		salidaServicioEClass = createEClass(SALIDA_SERVICIO);
		createEAttribute(salidaServicioEClass, SALIDA_SERVICIO__ETIQUETA);
		createEReference(salidaServicioEClass, SALIDA_SERVICIO__SERVICIO);
		createEAttribute(salidaServicioEClass, SALIDA_SERVICIO__ETIQUETA_SIMPLE);

		salidaSucesoEClass = createEClass(SALIDA_SUCESO);
		createEAttribute(salidaSucesoEClass, SALIDA_SUCESO__ETIQUETA);
		createEAttribute(salidaSucesoEClass, SALIDA_SUCESO__ES_DISTRIBUCION);
		createEReference(salidaSucesoEClass, SALIDA_SUCESO__SALIDAS);
		createEAttribute(salidaSucesoEClass, SALIDA_SUCESO__ETIQUETA_SIMPLE);

		servicioEClass = createEClass(SERVICIO);
		createEReference(servicioEClass, SERVICIO__USADO_POR_SUCESOS);
		createEReference(servicioEClass, SERVICIO__SERVICIOS);
		createEReference(servicioEClass, SERVICIO__ENTRADAS);
		createEReference(servicioEClass, SERVICIO__SALIDAS);

		sistemaEClass = createEClass(SISTEMA);
		createEReference(sistemaEClass, SISTEMA__PROCEDIMIENTO);
		createEReference(sistemaEClass, SISTEMA__TODOS_SUCESOS);
		createEReference(sistemaEClass, SISTEMA__TODOS_SUBSISTEMAS);
		createEReference(sistemaEClass, SISTEMA__SISTEMAS);

		subsistemaEClass = createEClass(SUBSISTEMA);
		createEAttribute(subsistemaEClass, SUBSISTEMA__TIPO_SUBSISTEMA);
		createEReference(subsistemaEClass, SUBSISTEMA__PROCEDIMIENTO);
		createEReference(subsistemaEClass, SUBSISTEMA__TODOS_SUCESOS);
		createEReference(subsistemaEClass, SUBSISTEMA__USOS_SUBSISTEMAS);
		createEReference(subsistemaEClass, SUBSISTEMA__USADO_POR_SUBSISTEMAS);
		createEReference(subsistemaEClass, SUBSISTEMA__SUBSISTEMAS);

		sucesoEClass = createEClass(SUCESO);
		createEAttribute(sucesoEClass, SUCESO__PRIORIDAD);
		createEAttribute(sucesoEClass, SUCESO__TIPO);
		createEAttribute(sucesoEClass, SUCESO__RENDIMIENTO);
		createEAttribute(sucesoEClass, SUCESO__DISPARO);
		createEAttribute(sucesoEClass, SUCESO__DISTRIBUCION);
		createEAttribute(sucesoEClass, SUCESO__PRE_CONDICION);
		createEAttribute(sucesoEClass, SUCESO__POST_CONDICION);
		createEAttribute(sucesoEClass, SUCESO__ES_COLABORATIVO);
		createEReference(sucesoEClass, SUCESO__ACCIONES);
		createEReference(sucesoEClass, SUCESO__ACTORES);
		createEReference(sucesoEClass, SUCESO__ESTRUCTURAS_DATOS);
		createEReference(sucesoEClass, SUCESO__FLUJOS);
		createEReference(sucesoEClass, SUCESO__ENTRADAS);
		createEReference(sucesoEClass, SUCESO__SALIDAS);
		createEReference(sucesoEClass, SUCESO__USADO_POR_SUCESOS);
		createEReference(sucesoEClass, SUCESO__PROCEDIMIENTO);
		createEReference(sucesoEClass, SUCESO__SUCESOS);

		sucesoConstructorEClass = createEClass(SUCESO_CONSTRUCTOR);

		sucesoConsultorEClass = createEClass(SUCESO_CONSULTOR);

		usoServicioEClass = createEClass(USO_SERVICIO);
		createEReference(usoServicioEClass, USO_SERVICIO__SERVICIO);

		usoSubsistemaEClass = createEClass(USO_SUBSISTEMA);
		createEAttribute(usoSubsistemaEClass, USO_SUBSISTEMA__ETIQUETA);
		createEReference(usoSubsistemaEClass, USO_SUBSISTEMA__SUBSISTEMA_USADO);
		createEReference(usoSubsistemaEClass, USO_SUBSISTEMA__USOS_SUBSISTEMAS);

		usoSucesoEClass = createEClass(USO_SUCESO);
		createEReference(usoSucesoEClass, USO_SUCESO__SUCESO_USADO);

		// Create enums
		tipoUsoDocumentoEEnum = createEEnum(TIPO_USO_DOCUMENTO);
		tipoPrioridadEEnum = createEEnum(TIPO_PRIORIDAD);
		tipoUnidadEEnum = createEEnum(TIPO_UNIDAD);
		tipoSubsistemaEEnum = createEEnum(TIPO_SUBSISTEMA);
		tipoRelacionEEnum = createEEnum(TIPO_RELACION);
		tipoAgrupacionPredefinidaEEnum = createEEnum(TIPO_AGRUPACION_PREDEFINIDA);
		tipoPropiedadClaseAgrupacionEEnum = createEEnum(TIPO_PROPIEDAD_CLASE_AGRUPACION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SimapaPackage theSimapaPackage = (SimapaPackage)EPackage.Registry.INSTANCE.getEPackage(SimapaPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		aAplicacionEClass.getESuperTypes().add(this.getAnotacion());
		accionEClass.getESuperTypes().add(this.getOrgcasiObject());
		actorEClass.getESuperTypes().add(this.getOrgcasiObject());
		actorFuncionalEClass.getESuperTypes().add(this.getActor());
		aDocumentoEClass.getESuperTypes().add(this.getAnotacion());
		aDocumentoFinalEClass.getESuperTypes().add(this.getAOperacion());
		aEstructuraFuncionalEClass.getESuperTypes().add(this.getAnotacion());
		aFlujoEClass.getESuperTypes().add(this.getAnotacion());
		agrupacionEClass.getESuperTypes().add(this.getOrgcasiObject());
		aNormativaYLegislacionEClass.getESuperTypes().add(this.getAnotacion());
		anotacionEClass.getESuperTypes().add(this.getOrgcasiObject());
		aOperacionEClass.getESuperTypes().add(this.getAnotacion());
		aProcedimientoEClass.getESuperTypes().add(this.getAnotacion());
		aProcedimientoEClass.getESuperTypes().add(this.getContenedorSubsistemas());
		aProcedimientoEClass.getESuperTypes().add(this.getContenedorSucesos());
		aProcedimientoEClass.getESuperTypes().add(this.getContenedorDocumentos());
		aProcedimientoEClass.getESuperTypes().add(this.getContenedorDatos());
		aProcedimientoEClass.getESuperTypes().add(this.getImportadorServicios());
		aRepositorioEClass.getESuperTypes().add(this.getAnotacion());
		aSubprocedimientoEClass.getESuperTypes().add(this.getAOperacion());
		aTerminoGlosarioEClass.getESuperTypes().add(this.getAnotacion());
		aUnidadEClass.getESuperTypes().add(this.getAnotacion());
		aUnidadExternaEClass.getESuperTypes().add(this.getAUnidad());
		aUnidadOrganicaEClass.getESuperTypes().add(this.getAUnidad());
		cAccionesSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cActoresEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cActoresSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		campoDatosEClass.getESuperTypes().add(this.getOrgcasiObject());
		cAplicacionesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cCamposDatosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cDocumentosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cEntradasAccionEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cEntradasSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cEstructurasDatosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cEstructurasDatosSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cFlujosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cFlujosSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cEstructurasFuncionalesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cImportacionesPorEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cImportacionesServiciosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cInterfacesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cLibreriasServiciosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cNormativasYLegislacionesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cOperacionesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cProcedimientosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cRelacionesDatosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cSalidasAccionEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cSalidasSucesoEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cServiciosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cServicioUsadoPorSucesosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cSistemasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cSubsistemasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cSucesosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cTerminosGlosarioEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUnidadesEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUnidadesExternasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUnidadesOrganicasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUsadoPorSubsistemasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUsadoPorSucesosEClass.getESuperTypes().add(this.getOrgcasiCollection());
		cUsosSubsistemasEClass.getESuperTypes().add(this.getOrgcasiCollection());
		documentoEnEstadoEClass.getESuperTypes().add(this.getADocumento());
		entradaEClass.getESuperTypes().add(this.getEntradaOSalida());
		entradaAccionEClass.getESuperTypes().add(this.getEntrada());
		entradaOSalidaEClass.getESuperTypes().add(this.getOrgcasiObject());
		entradaServicioEClass.getESuperTypes().add(this.getEntrada());
		entradaSucesoEClass.getESuperTypes().add(this.getEntrada());
		estructuraDatosEClass.getESuperTypes().add(this.getOrgcasiObject());
		importacionServiciosEClass.getESuperTypes().add(this.getOrgcasiObject());
		interfazEClass.getESuperTypes().add(this.getAgrupacion());
		interfazEClass.getESuperTypes().add(this.getConModelClass());
		libreriaServiciosEClass.getESuperTypes().add(this.getAgrupacion());
		libreriaServiciosEClass.getESuperTypes().add(this.getContenedorDocumentos());
		libreriaServiciosEClass.getESuperTypes().add(this.getContenedorDatos());
		libreriaServiciosEClass.getESuperTypes().add(this.getImportadorServicios());
		miembroRelacionEClass.getESuperTypes().add(this.getOrgcasiObject());
		orgcasiCollectionEClass.getESuperTypes().add(this.getOrgcasiObject());
		orgcasiObjectEClass.getESuperTypes().add(this.getConModelClass());
		relacionDatosEClass.getESuperTypes().add(this.getOrgcasiObject());
		rolEClass.getESuperTypes().add(this.getOrgcasiObject());
		rolSolicitanteEClass.getESuperTypes().add(this.getRol());
		rolSolicitadoEClass.getESuperTypes().add(this.getRol());
		salidaEClass.getESuperTypes().add(this.getEntradaOSalida());
		salidaAccionEClass.getESuperTypes().add(this.getSalida());
		salidaServicioEClass.getESuperTypes().add(this.getSalida());
		salidaSucesoEClass.getESuperTypes().add(this.getSalida());
		servicioEClass.getESuperTypes().add(this.getAgrupacion());
		sistemaEClass.getESuperTypes().add(this.getAgrupacion());
		sistemaEClass.getESuperTypes().add(this.getContenedorSubsistemas());
		sistemaEClass.getESuperTypes().add(this.getContenedorSucesos());
		subsistemaEClass.getESuperTypes().add(this.getAgrupacion());
		subsistemaEClass.getESuperTypes().add(this.getContenedorSucesos());
		sucesoEClass.getESuperTypes().add(this.getAgrupacion());
		sucesoConstructorEClass.getESuperTypes().add(this.getSuceso());
		sucesoConsultorEClass.getESuperTypes().add(this.getSuceso());
		usoServicioEClass.getESuperTypes().add(this.getAccion());
		usoSubsistemaEClass.getESuperTypes().add(this.getOrgcasiObject());
		usoSucesoEClass.getESuperTypes().add(this.getAccion());

		// Initialize classes and features; add operations and parameters
		initEClass(aAplicacionEClass, AAplicacion.class, "AAplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAAplicacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AAplicacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAAplicacion_Aplicacion(), theSimapaPackage.getAplicacion(), null, "aplicacion", null, 1, 1, AAplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAAplicacion_Aplicaciones(), this.getCAplicaciones(), this.getCAplicaciones_Aplicaciones(), "aplicaciones", null, 1, 1, AAplicacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionEClass, Accion.class, "Accion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Accion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccion_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccion_EsColaborativa(), theEcorePackage.getEBoolean(), "esColaborativa", "false", 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Operaciones(), this.getAOperacion(), this.getAOperacion_AccionesSuceso(), "operaciones", null, 0, -1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Actores(), this.getActor(), this.getActor_Acciones(), "actores", null, 0, -1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Entradas(), this.getCEntradasAccion(), this.getCEntradasAccion_Accion(), "entradas", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Salidas(), this.getCSalidasAccion(), this.getCSalidasAccion_Accion(), "salidas", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Acciones(), this.getCAccionesSuceso(), this.getCAccionesSuceso_Acciones(), "acciones", null, 1, 1, Accion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccion_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, Accion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Nombre(), ecorePackage.getEString(), "nombre", "", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Unidades(), this.getAUnidad(), this.getAUnidad_ActoresSucesos(), "unidades", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ActorDeSucesos(), this.getCActoresSuceso(), this.getCActoresSuceso_Actores(), "actorDeSucesos", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Acciones(), this.getAccion(), this.getAccion_Actores(), "acciones", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Actores(), this.getCActores(), this.getCActores_Actores(), "actores", null, 1, 1, Actor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorFuncionalEClass, ActorFuncional.class, "ActorFuncional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActorFuncional_NombreFuncional(), ecorePackage.getEString(), "nombreFuncional", null, 0, 1, ActorFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aDocumentoEClass, ADocumento.class, "ADocumento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADocumento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ADocumento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getADocumento_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADocumento_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_Documento(), theSimapaPackage.getDocumento(), null, "documento", null, 1, 1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_EstructurasDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_Documentos(), "estructurasDatos", null, 0, -1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_EntradasOSalidas(), this.getEntradaOSalida(), this.getEntradaOSalida_Documentos(), "entradasOSalidas", null, 0, -1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_Estados(), this.getDocumentoEnEstado(), this.getDocumentoEnEstado_DocumentoBase(), "estados", null, 0, -1, ADocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_Documentos(), this.getCDocumentos(), this.getCDocumentos_Documentos(), "documentos", null, 1, 1, ADocumento.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADocumento_TodosDocumentos(), this.getADocumento(), null, "todosDocumentos", null, 0, -1, ADocumento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(aDocumentoFinalEClass, ADocumentoFinal.class, "ADocumentoFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEstructuraFuncionalEClass, AEstructuraFuncional.class, "AEstructuraFuncional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAEstructuraFuncional_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AEstructuraFuncional.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAEstructuraFuncional_EstructuraFuncional(), theSimapaPackage.getEstructuraFuncional(), null, "estructuraFuncional", null, 1, 1, AEstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEstructuraFuncional_EstructurasFuncionales(), this.getCEstructurasFuncionales(), this.getCEstructurasFuncionales_EstructurasFuncionales(), "estructurasFuncionales", null, 1, 1, AEstructuraFuncional.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFlujoEClass, AFlujo.class, "AFlujo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAFlujo_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AFlujo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAFlujo_Flujo(), theSimapaPackage.getFlujo(), null, "flujo", null, 1, 1, AFlujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAFlujo_FlujoDeSucesos(), this.getCFlujosSuceso(), this.getCFlujosSuceso_Flujos(), "flujoDeSucesos", null, 0, -1, AFlujo.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAFlujo_Flujos(), this.getCFlujos(), this.getCFlujos_Flujos(), "flujos", null, 1, 1, AFlujo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agrupacionEClass, Agrupacion.class, "Agrupacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgrupacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Agrupacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgrupacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Agrupacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgrupacion_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Agrupacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgrupacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Agrupacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgrupacion_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Agrupacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aNormativaYLegislacionEClass, ANormativaYLegislacion.class, "ANormativaYLegislacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANormativaYLegislacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ANormativaYLegislacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getANormativaYLegislacion_Normativa(), theSimapaPackage.getNormativaYLegislacion(), null, "normativa", null, 1, 1, ANormativaYLegislacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getANormativaYLegislacion_Normativas(), this.getCNormativasYLegislaciones(), this.getCNormativasYLegislaciones_Normativas(), "normativas", null, 1, 1, ANormativaYLegislacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anotacionEClass, Anotacion.class, "Anotacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnotacion_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotacion_IdAnotada(), ecorePackage.getEString(), "idAnotada", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotacion_VersionAnotada(), ecorePackage.getEString(), "versionAnotada", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotacion_FechaAnotacion(), ecorePackage.getEString(), "fechaAnotacion", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotacion_RealizadorAnotacion(), ecorePackage.getEString(), "realizadorAnotacion", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotacion_ResponsableAnotacion(), ecorePackage.getEString(), "responsableAnotacion", null, 0, 1, Anotacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aOperacionEClass, AOperacion.class, "AOperacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAOperacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AOperacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAOperacion_Operacion(), theSimapaPackage.getOperacion(), null, "operacion", null, 1, 1, AOperacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAOperacion_AccionesSuceso(), this.getAccion(), this.getAccion_Operaciones(), "accionesSuceso", null, 0, -1, AOperacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAOperacion_Operaciones(), this.getCOperaciones(), this.getCOperaciones_Operaciones(), "operaciones", null, 1, 1, AOperacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aProcedimientoEClass, AProcedimiento.class, "AProcedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAProcedimiento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Procedimiento(), theSimapaPackage.getProcedimiento(), null, "procedimiento", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Normativas(), this.getCNormativasYLegislaciones(), this.getCNormativasYLegislaciones_Procedimiento(), "normativas", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_TerminosGlosario(), this.getCTerminosGlosario(), this.getCTerminosGlosario_Procedimiento(), "terminosGlosario", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_UnidadesOrganicas(), this.getCUnidadesOrganicas(), this.getCUnidadesOrganicas_Procedimiento(), "unidadesOrganicas", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_UnidadesExternas(), this.getCUnidadesExternas(), this.getCUnidadesExternas_Procedimiento(), "unidadesExternas", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Unidades(), this.getCUnidades(), this.getCUnidades_Procedimiento(), "unidades", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_EstructurasFuncionales(), this.getCEstructurasFuncionales(), this.getCEstructurasFuncionales_Procedimiento(), "estructurasFuncionales", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Aplicaciones(), this.getCAplicaciones(), this.getCAplicaciones_Procedimiento(), "aplicaciones", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Operaciones(), this.getCOperaciones(), this.getCOperaciones_Procedimiento(), "operaciones", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Flujos(), this.getCFlujos(), this.getCFlujos_Procedimiento(), "flujos", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Actores(), this.getCActores(), this.getCActores_Procedimiento(), "actores", null, 1, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Sistemas(), this.getCSistemas(), this.getCSistemas_Procedimiento(), "sistemas", null, 0, 1, AProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Procedimientos(), this.getCProcedimientos(), this.getCProcedimientos_Procedimientos(), "procedimientos", null, 1, 1, AProcedimiento.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_TodosSucesos(), this.getSuceso(), null, "todosSucesos", null, 0, -1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_TodosSubsistemas(), this.getSubsistema(), null, "todosSubsistemas", null, 0, -1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_TodasEstructurasDatos(), this.getEstructuraDatos(), null, "todasEstructurasDatos", null, 0, -1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_TodosDocumentos(), this.getADocumento(), null, "todosDocumentos", null, 0, -1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAProcedimiento_Repositorio(), this.getARepositorio(), null, "repositorio", null, 0, 1, AProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(aProcedimientoEClass, ecorePackage.getEInt(), "crearAnotaciones", 0, 1);

		initEClass(aRepositorioEClass, ARepositorio.class, "ARepositorio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARepositorio_AnotacionesProcedimiento(), this.getCProcedimientos(), this.getCProcedimientos_Repositorio(), "anotacionesProcedimiento", null, 1, 1, ARepositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARepositorio_Repositorio(), theSimapaPackage.getRepositorio(), null, "repositorio", null, 1, 1, ARepositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARepositorio_ModelPackage(), theEcorePackage.getEPackage(), null, "modelPackage", "", 0, 1, ARepositorio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getARepositorio_LibreriasServicios(), this.getCLibreriasServicios(), this.getCLibreriasServicios_Repositorio(), "libreriasServicios", null, 1, 1, ARepositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aSubprocedimientoEClass, ASubprocedimiento.class, "ASubprocedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aTerminoGlosarioEClass, ATerminoGlosario.class, "ATerminoGlosario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATerminoGlosario_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ATerminoGlosario.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATerminoGlosario_TerminoGlosario(), theSimapaPackage.getTerminoGlosario(), null, "terminoGlosario", null, 1, 1, ATerminoGlosario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATerminoGlosario_TerminosGlosario(), this.getCTerminosGlosario(), this.getCTerminosGlosario_TerminosGlosario(), "terminosGlosario", null, 1, 1, ATerminoGlosario.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aUnidadEClass, AUnidad.class, "AUnidad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAUnidad_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, AUnidad.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAUnidad_ActoresSucesos(), this.getActor(), this.getActor_Unidades(), "actoresSucesos", null, 0, -1, AUnidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aUnidadExternaEClass, AUnidadExterna.class, "AUnidadExterna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAUnidadExterna_Unidad(), theSimapaPackage.getUnidadExterna(), null, "unidad", null, 1, 1, AUnidadExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAUnidadExterna_Unidades(), this.getCUnidadesExternas(), this.getCUnidadesExternas_Unidades(), "unidades", null, 1, 1, AUnidadExterna.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aUnidadOrganicaEClass, AUnidadOrganica.class, "AUnidadOrganica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAUnidadOrganica_TipoUnidad(), this.getTipoUnidad(), "tipoUnidad", null, 0, 1, AUnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAUnidadOrganica_Unidad(), theSimapaPackage.getUnidadOrganica(), null, "unidad", null, 1, 1, AUnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAUnidadOrganica_Unidades(), this.getCUnidadesOrganicas(), this.getCUnidadesOrganicas_Unidades(), "unidades", null, 1, 1, AUnidadOrganica.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cAccionesSucesoEClass, CAccionesSuceso.class, "CAccionesSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCAccionesSuceso_Acciones(), this.getAccion(), this.getAccion_Acciones(), "acciones", null, 0, -1, CAccionesSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAccionesSuceso_Suceso(), this.getSuceso(), this.getSuceso_Acciones(), "suceso", null, 1, 1, CAccionesSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cActoresEClass, CActores.class, "CActores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCActores_Actores(), this.getActor(), this.getActor_Actores(), "actores", null, 0, -1, CActores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCActores_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Actores(), "procedimiento", null, 1, 1, CActores.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cActoresSucesoEClass, CActoresSuceso.class, "CActoresSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCActoresSuceso_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CActoresSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCActoresSuceso_Actores(), this.getActor(), this.getActor_ActorDeSucesos(), "actores", null, 0, -1, CActoresSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCActoresSuceso_Suceso(), this.getSuceso(), this.getSuceso_Actores(), "suceso", null, 1, 1, CActoresSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoDatosEClass, CampoDatos.class, "CampoDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampoDatos_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CampoDatos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Formato(), ecorePackage.getEString(), "formato", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Ejemplo(), ecorePackage.getEString(), "ejemplo", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Requerido(), ecorePackage.getEString(), "requerido", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_ValorPorDefecto(), ecorePackage.getEString(), "valorPorDefecto", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Rango(), ecorePackage.getEString(), "rango", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_RangoRazonable(), ecorePackage.getEString(), "rangoRazonable", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_FuenteDatos(), ecorePackage.getEString(), "fuenteDatos", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampoDatos_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoDatos_EstructurasDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_Campos(), "estructurasDatos", null, 0, -1, CampoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampoDatos_Campos(), this.getCCamposDatos(), this.getCCamposDatos_Campos(), "campos", null, 1, 1, CampoDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cAplicacionesEClass, CAplicaciones.class, "CAplicaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCAplicaciones_Aplicaciones(), this.getAAplicacion(), this.getAAplicacion_Aplicaciones(), "aplicaciones", null, 0, -1, CAplicaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAplicaciones_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Aplicaciones(), "procedimiento", null, 1, 1, CAplicaciones.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cCamposDatosEClass, CCamposDatos.class, "CCamposDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCCamposDatos_Campos(), this.getCampoDatos(), this.getCampoDatos_Campos(), "campos", null, 0, -1, CCamposDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCCamposDatos_Contenedor(), this.getContenedorDatos(), this.getContenedorDatos_Campos(), "contenedor", null, 1, 1, CCamposDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cDocumentosEClass, CDocumentos.class, "CDocumentos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDocumentos_Documentos(), this.getADocumento(), this.getADocumento_Documentos(), "documentos", null, 0, -1, CDocumentos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDocumentos_Contenedor(), this.getContenedorDocumentos(), this.getContenedorDocumentos_Documentos(), "contenedor", null, 1, 1, CDocumentos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEntradasAccionEClass, CEntradasAccion.class, "CEntradasAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEntradasAccion_Entradas(), this.getEntradaAccion(), this.getEntradaAccion_Entradas(), "entradas", null, 0, -1, CEntradasAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEntradasAccion_Accion(), this.getAccion(), this.getAccion_Entradas(), "accion", null, 1, 1, CEntradasAccion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEntradasSucesoEClass, CEntradasSuceso.class, "CEntradasSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEntradasSuceso_Entradas(), this.getEntradaSuceso(), this.getEntradaSuceso_Entradas(), "entradas", null, 0, -1, CEntradasSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEntradasSuceso_Suceso(), this.getSuceso(), this.getSuceso_Entradas(), "suceso", null, 1, 1, CEntradasSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEstructurasDatosEClass, CEstructurasDatos.class, "CEstructurasDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEstructurasDatos_EstructurasDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_EstructurasDatos(), "estructurasDatos", null, 0, -1, CEstructurasDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEstructurasDatos_Contenedor(), this.getContenedorDatos(), this.getContenedorDatos_EstructurasDatos(), "contenedor", null, 1, 1, CEstructurasDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEstructurasDatosSucesoEClass, CEstructurasDatosSuceso.class, "CEstructurasDatosSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEstructurasDatosSuceso_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CEstructurasDatosSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCEstructurasDatosSuceso_EstructurasDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_ColeccionEstructuraDatosDeSuceso(), "estructurasDatos", null, 0, -1, CEstructurasDatosSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEstructurasDatosSuceso_Suceso(), this.getSuceso(), this.getSuceso_EstructurasDatos(), "suceso", null, 1, 1, CEstructurasDatosSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cFlujosEClass, CFlujos.class, "CFlujos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFlujos_Flujos(), this.getAFlujo(), this.getAFlujo_Flujos(), "flujos", null, 0, -1, CFlujos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFlujos_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Flujos(), "procedimiento", null, 1, 1, CFlujos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cFlujosSucesoEClass, CFlujosSuceso.class, "CFlujosSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFlujosSuceso_Flujos(), this.getAFlujo(), this.getAFlujo_FlujoDeSucesos(), "flujos", null, 0, -1, CFlujosSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFlujosSuceso_Suceso(), this.getSuceso(), this.getSuceso_Flujos(), "suceso", null, 1, 1, CFlujosSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEstructurasFuncionalesEClass, CEstructurasFuncionales.class, "CEstructurasFuncionales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEstructurasFuncionales_EstructurasFuncionales(), this.getAEstructuraFuncional(), this.getAEstructuraFuncional_EstructurasFuncionales(), "estructurasFuncionales", null, 0, -1, CEstructurasFuncionales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEstructurasFuncionales_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_EstructurasFuncionales(), "procedimiento", null, 1, 1, CEstructurasFuncionales.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cImportacionesPorEClass, CImportacionesPor.class, "CImportacionesPor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCImportacionesPor_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CImportacionesPor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCImportacionesPor_LibreriaServicios(), this.getLibreriaServicios(), this.getLibreriaServicios_ImportadoPor(), "libreriaServicios", null, 1, 1, CImportacionesPor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCImportacionesPor_ImportadoPor(), this.getImportacionServicios(), this.getImportacionServicios_LibreriaServicios(), "importadoPor", null, 0, -1, CImportacionesPor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cImportacionesServiciosEClass, CImportacionesServicios.class, "CImportacionesServicios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCImportacionesServicios_Importador(), this.getImportadorServicios(), this.getImportadorServicios_ImportacionesServicios(), "importador", null, 1, 1, CImportacionesServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCImportacionesServicios_ImportacionesServicios(), this.getImportacionServicios(), this.getImportacionServicios_ImportacionesServicios(), "importacionesServicios", null, 0, -1, CImportacionesServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cInterfacesEClass, CInterfaces.class, "CInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCInterfaces_Interfaces(), this.getInterfaz(), this.getInterfaz_Interfaces(), "interfaces", null, 0, -1, CInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCInterfaces_LibreriaServicios(), this.getLibreriaServicios(), this.getLibreriaServicios_Interfaces(), "libreriaServicios", null, 1, 1, CInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cLibreriasServiciosEClass, CLibreriasServicios.class, "CLibreriasServicios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCLibreriasServicios_LibreriasServicios(), this.getLibreriaServicios(), this.getLibreriaServicios_LibreriasServicios(), "libreriasServicios", null, 0, -1, CLibreriasServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLibreriasServicios_Repositorio(), this.getARepositorio(), this.getARepositorio_LibreriasServicios(), "repositorio", null, 1, 1, CLibreriasServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cNormativasYLegislacionesEClass, CNormativasYLegislaciones.class, "CNormativasYLegislaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCNormativasYLegislaciones_Normativas(), this.getANormativaYLegislacion(), this.getANormativaYLegislacion_Normativas(), "normativas", null, 0, -1, CNormativasYLegislaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCNormativasYLegislaciones_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Normativas(), "procedimiento", null, 1, 1, CNormativasYLegislaciones.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conModelClassEClass, ConModelClass.class, "ConModelClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConModelClass_ModelClass(), theEcorePackage.getEClass(), null, "modelClass", "", 1, 1, ConModelClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(contenedorDatosEClass, ContenedorDatos.class, "ContenedorDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorDatos_EstructurasDatos(), this.getCEstructurasDatos(), this.getCEstructurasDatos_Contenedor(), "estructurasDatos", null, 1, 1, ContenedorDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDatos_Campos(), this.getCCamposDatos(), this.getCCamposDatos_Contenedor(), "campos", null, 1, 1, ContenedorDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDatos_RelacionesDatos(), this.getCRelacionesDatos(), this.getCRelacionesDatos_Contenedor(), "relacionesDatos", null, 1, 1, ContenedorDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorDocumentosEClass, ContenedorDocumentos.class, "ContenedorDocumentos", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorDocumentos_Documentos(), this.getCDocumentos(), this.getCDocumentos_Contenedor(), "documentos", null, 1, 1, ContenedorDocumentos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorSucesosEClass, ContenedorSucesos.class, "ContenedorSucesos", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorSucesos_Sucesos(), this.getCSucesos(), this.getCSucesos_Contenedor(), "sucesos", null, 0, 1, ContenedorSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorSubsistemasEClass, ContenedorSubsistemas.class, "ContenedorSubsistemas", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorSubsistemas_Subsistemas(), this.getCSubsistemas(), this.getCSubsistemas_Contenedor(), "subsistemas", null, 0, 1, ContenedorSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cOperacionesEClass, COperaciones.class, "COperaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOperaciones_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Operaciones(), "procedimiento", null, 1, 1, COperaciones.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOperaciones_Operaciones(), this.getAOperacion(), this.getAOperacion_Operaciones(), "operaciones", null, 0, -1, COperaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cProcedimientosEClass, CProcedimientos.class, "CProcedimientos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCProcedimientos_Procedimientos(), this.getAProcedimiento(), this.getAProcedimiento_Procedimientos(), "procedimientos", null, 0, -1, CProcedimientos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCProcedimientos_Repositorio(), this.getARepositorio(), this.getARepositorio_AnotacionesProcedimiento(), "repositorio", null, 1, 1, CProcedimientos.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cRelacionesDatosEClass, CRelacionesDatos.class, "CRelacionesDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRelacionesDatos_RelacionesDatos(), this.getRelacionDatos(), this.getRelacionDatos_RelacionesDatos(), "relacionesDatos", null, 0, -1, CRelacionesDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRelacionesDatos_Contenedor(), this.getContenedorDatos(), this.getContenedorDatos_RelacionesDatos(), "contenedor", null, 1, 1, CRelacionesDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSalidasAccionEClass, CSalidasAccion.class, "CSalidasAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSalidasAccion_Salidas(), this.getSalidaAccion(), this.getSalidaAccion_Salidas(), "salidas", null, 0, -1, CSalidasAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSalidasAccion_Accion(), this.getAccion(), this.getAccion_Salidas(), "accion", null, 1, 1, CSalidasAccion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSalidasSucesoEClass, CSalidasSuceso.class, "CSalidasSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSalidasSuceso_Salidas(), this.getSalidaSuceso(), this.getSalidaSuceso_Salidas(), "salidas", null, 0, -1, CSalidasSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSalidasSuceso_Suceso(), this.getSuceso(), this.getSuceso_Salidas(), "suceso", null, 1, 1, CSalidasSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cServiciosEClass, CServicios.class, "CServicios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCServicios_Interfaz(), this.getInterfaz(), this.getInterfaz_Servicios(), "interfaz", null, 1, 1, CServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCServicios_Servicios(), this.getServicio(), this.getServicio_Servicios(), "servicios", null, 0, -1, CServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cServicioUsadoPorSucesosEClass, CServicioUsadoPorSucesos.class, "CServicioUsadoPorSucesos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCServicioUsadoPorSucesos_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CServicioUsadoPorSucesos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCServicioUsadoPorSucesos_Servicio(), this.getServicio(), this.getServicio_UsadoPorSucesos(), "servicio", null, 1, 1, CServicioUsadoPorSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCServicioUsadoPorSucesos_UsosServicio(), this.getUsoServicio(), this.getUsoServicio_Servicio(), "usosServicio", null, 0, -1, CServicioUsadoPorSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSistemasEClass, CSistemas.class, "CSistemas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSistemas_Sistemas(), this.getSistema(), this.getSistema_Sistemas(), "sistemas", null, 0, -1, CSistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSistemas_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Sistemas(), "procedimiento", null, 1, 1, CSistemas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSubsistemasEClass, CSubsistemas.class, "CSubsistemas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSubsistemas_Subsistemas(), this.getSubsistema(), this.getSubsistema_Subsistemas(), "subsistemas", null, 0, -1, CSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSubsistemas_Contenedor(), this.getContenedorSubsistemas(), this.getContenedorSubsistemas_Subsistemas(), "contenedor", null, 1, 1, CSubsistemas.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSubsistemas_Procedimiento(), this.getAProcedimiento(), null, "procedimiento", null, 1, 1, CSubsistemas.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cSucesosEClass, CSucesos.class, "CSucesos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSucesos_Sucesos(), this.getSuceso(), this.getSuceso_Sucesos(), "sucesos", null, 0, -1, CSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSucesos_Contenedor(), this.getContenedorSucesos(), this.getContenedorSucesos_Sucesos(), "contenedor", null, 1, 1, CSucesos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSucesos_Procedimiento(), this.getAProcedimiento(), null, "procedimiento", null, 1, 1, CSucesos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cTerminosGlosarioEClass, CTerminosGlosario.class, "CTerminosGlosario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCTerminosGlosario_TerminosGlosario(), this.getATerminoGlosario(), this.getATerminoGlosario_TerminosGlosario(), "terminosGlosario", null, 0, -1, CTerminosGlosario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTerminosGlosario_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_TerminosGlosario(), "procedimiento", null, 1, 1, CTerminosGlosario.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUnidadesEClass, CUnidades.class, "CUnidades", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCUnidades_Unidades(), this.getAUnidad(), null, "unidades", null, 0, -1, CUnidades.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCUnidades_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_Unidades(), "procedimiento", null, 1, 1, CUnidades.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUnidadesExternasEClass, CUnidadesExternas.class, "CUnidadesExternas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCUnidadesExternas_Unidades(), this.getAUnidadExterna(), this.getAUnidadExterna_Unidades(), "unidades", null, 0, -1, CUnidadesExternas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCUnidadesExternas_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_UnidadesExternas(), "procedimiento", null, 1, 1, CUnidadesExternas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUnidadesOrganicasEClass, CUnidadesOrganicas.class, "CUnidadesOrganicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCUnidadesOrganicas_Unidades(), this.getAUnidadOrganica(), this.getAUnidadOrganica_Unidades(), "unidades", null, 0, -1, CUnidadesOrganicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCUnidadesOrganicas_Procedimiento(), this.getAProcedimiento(), this.getAProcedimiento_UnidadesOrganicas(), "procedimiento", null, 1, 1, CUnidadesOrganicas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUsadoPorSubsistemasEClass, CUsadoPorSubsistemas.class, "CUsadoPorSubsistemas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCUsadoPorSubsistemas_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CUsadoPorSubsistemas.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCUsadoPorSubsistemas_UsadoPorSubsistemas(), this.getUsoSubsistema(), this.getUsoSubsistema_SubsistemaUsado(), "usadoPorSubsistemas", null, 0, -1, CUsadoPorSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCUsadoPorSubsistemas_Subsistema(), this.getSubsistema(), this.getSubsistema_UsadoPorSubsistemas(), "subsistema", null, 1, 1, CUsadoPorSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUsadoPorSucesosEClass, CUsadoPorSucesos.class, "CUsadoPorSucesos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCUsadoPorSucesos_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, CUsadoPorSucesos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCUsadoPorSucesos_Suceso(), this.getSuceso(), this.getSuceso_UsadoPorSucesos(), "suceso", null, 1, 1, CUsadoPorSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCUsadoPorSucesos_UsosSuceso(), this.getUsoSuceso(), this.getUsoSuceso_SucesoUsado(), "usosSuceso", null, 0, -1, CUsadoPorSucesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cUsosSubsistemasEClass, CUsosSubsistemas.class, "CUsosSubsistemas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCUsosSubsistemas_UsosSubsistemas(), this.getUsoSubsistema(), this.getUsoSubsistema_UsosSubsistemas(), "usosSubsistemas", null, 0, -1, CUsosSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCUsosSubsistemas_Subsistema(), this.getSubsistema(), this.getSubsistema_UsosSubsistemas(), "subsistema", null, 1, 1, CUsosSubsistemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentoEnEstadoEClass, DocumentoEnEstado.class, "DocumentoEnEstado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentoEnEstado_CondicionesEstado(), ecorePackage.getEString(), "condicionesEstado", null, 0, 1, DocumentoEnEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentoEnEstado_DocumentoBase(), this.getADocumento(), this.getADocumento_Estados(), "documentoBase", null, 1, 1, DocumentoEnEstado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaEClass, Entrada.class, "Entrada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntrada_Fuentes(), this.getSalida(), this.getSalida_Destinos(), "fuentes", null, 0, -1, Entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaAccionEClass, EntradaAccion.class, "EntradaAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntradaAccion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, EntradaAccion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaAccion_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, EntradaAccion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntradaAccion_Entradas(), this.getCEntradasAccion(), this.getCEntradasAccion_Entradas(), "entradas", null, 1, 1, EntradaAccion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaOSalidaEClass, EntradaOSalida.class, "EntradaOSalida", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntradaOSalida_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaOSalida_EsDocumentoPapel(), theEcorePackage.getEBoolean(), "esDocumentoPapel", "false", 0, 1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaOSalida_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaOSalida_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntradaOSalida_EstructurasDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_EntradasOSalidas(), "estructurasDatos", null, 0, -1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntradaOSalida_Documentos(), this.getADocumento(), this.getADocumento_EntradasOSalidas(), "documentos", null, 0, -1, EntradaOSalida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaServicioEClass, EntradaServicio.class, "EntradaServicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntradaServicio_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, EntradaServicio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntradaServicio_Servicio(), this.getServicio(), this.getServicio_Entradas(), "servicio", null, 1, 1, EntradaServicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaServicio_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, EntradaServicio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entradaSucesoEClass, EntradaSuceso.class, "EntradaSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntradaSuceso_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, EntradaSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaSuceso_EsInformacionPrevia(), theEcorePackage.getEBoolean(), "esInformacionPrevia", "true", 0, 1, EntradaSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntradaSuceso_Entradas(), this.getCEntradasSuceso(), this.getCEntradasSuceso_Entradas(), "entradas", null, 1, 1, EntradaSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntradaSuceso_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, EntradaSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(estructuraDatosEClass, EstructuraDatos.class, "EstructuraDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstructuraDatos_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, EstructuraDatos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstructuraDatos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstructuraDatos_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_Campos(), this.getCampoDatos(), this.getCampoDatos_EstructurasDatos(), "campos", null, 0, -1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_Documentos(), this.getADocumento(), this.getADocumento_EstructurasDatos(), "documentos", null, 0, -1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_MiembroRelaciones(), this.getMiembroRelacion(), this.getMiembroRelacion_EstructuraDatos(), "miembroRelaciones", "", 0, -1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_EntradasOSalidas(), this.getEntradaOSalida(), this.getEntradaOSalida_EstructurasDatos(), "entradasOSalidas", null, 0, -1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_EstructuraDatosDeSuceso(), this.getSuceso(), null, "estructuraDatosDeSuceso", null, 0, -1, EstructuraDatos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_ColeccionEstructuraDatosDeSuceso(), this.getCEstructurasDatosSuceso(), this.getCEstructurasDatosSuceso_EstructurasDatos(), "coleccionEstructuraDatosDeSuceso", null, 0, -1, EstructuraDatos.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraDatos_EstructurasDatos(), this.getCEstructurasDatos(), this.getCEstructurasDatos_EstructurasDatos(), "estructurasDatos", null, 1, 1, EstructuraDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importacionServiciosEClass, ImportacionServicios.class, "ImportacionServicios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportacionServicios_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ImportacionServicios.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImportacionServicios_ImportacionesServicios(), this.getCImportacionesServicios(), this.getCImportacionesServicios_ImportacionesServicios(), "importacionesServicios", null, 1, 1, ImportacionServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportacionServicios_LibreriaServicios(), this.getCImportacionesPor(), this.getCImportacionesPor_ImportadoPor(), "libreriaServicios", null, 0, 1, ImportacionServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importadorServiciosEClass, ImportadorServicios.class, "ImportadorServicios", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportadorServicios_ImportacionesServicios(), this.getCImportacionesServicios(), this.getCImportacionesServicios_Importador(), "importacionesServicios", null, 1, 1, ImportadorServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfazEClass, Interfaz.class, "Interfaz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaz_Servicios(), this.getCServicios(), this.getCServicios_Interfaz(), "servicios", null, 1, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaz_Interfaces(), this.getCInterfaces(), this.getCInterfaces_Interfaces(), "interfaces", null, 1, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaz_RolSolicitante(), this.getRolSolicitante(), this.getRolSolicitante_Interfaz(), "rolSolicitante", null, 1, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaz_RolSolicitado(), this.getRolSolicitado(), this.getRolSolicitado_Interfaz(), "rolSolicitado", null, 1, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libreriaServiciosEClass, LibreriaServicios.class, "LibreriaServicios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibreriaServicios_ImportadoPor(), this.getCImportacionesPor(), this.getCImportacionesPor_LibreriaServicios(), "importadoPor", null, 1, 1, LibreriaServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibreriaServicios_LibreriasServicios(), this.getCLibreriasServicios(), this.getCLibreriasServicios_LibreriasServicios(), "libreriasServicios", null, 1, 1, LibreriaServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibreriaServicios_Interfaces(), this.getCInterfaces(), this.getCInterfaces_LibreriaServicios(), "interfaces", null, 1, 1, LibreriaServicios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibreriaServicios_TodosDocumentos(), this.getADocumento(), null, "todosDocumentos", null, 0, -1, LibreriaServicios.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLibreriaServicios_TodasEstructurasDatos(), this.getEstructuraDatos(), null, "todasEstructurasDatos", null, 0, -1, LibreriaServicios.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLibreriaServicios_Repositorio(), this.getARepositorio(), null, "repositorio", null, 0, 1, LibreriaServicios.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(miembroRelacionEClass, MiembroRelacion.class, "MiembroRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiembroRelacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, MiembroRelacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiembroRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiembroRelacion_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiembroRelacion_TipoRelacion(), this.getTipoRelacion(), "tipoRelacion", null, 0, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiembroRelacion_MultiplicidadMinima(), ecorePackage.getEIntegerObject(), "multiplicidadMinima", "0", 0, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiembroRelacion_MultiplicidadMaxima(), ecorePackage.getEIntegerObject(), "multiplicidadMaxima", "-1", 0, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiembroRelacion_EstructuraDatos(), this.getEstructuraDatos(), this.getEstructuraDatos_MiembroRelaciones(), "estructuraDatos", null, 1, 1, MiembroRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiembroRelacion_Relacion(), this.getRelacionDatos(), this.getRelacionDatos_Miembros(), "relacion", null, 1, 1, MiembroRelacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orgcasiCollectionEClass, OrgcasiCollection.class, "OrgcasiCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orgcasiObjectEClass, OrgcasiObject.class, "OrgcasiObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionDatosEClass, RelacionDatos.class, "RelacionDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacionDatos_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, RelacionDatos.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionDatos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, RelacionDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionDatos_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, RelacionDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacionDatos_Miembros(), this.getMiembroRelacion(), this.getMiembroRelacion_Relacion(), "miembros", null, 2, -1, RelacionDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacionDatos_RelacionesDatos(), this.getCRelacionesDatos(), this.getCRelacionesDatos_RelacionesDatos(), "relacionesDatos", null, 1, 1, RelacionDatos.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolSolicitanteEClass, RolSolicitante.class, "RolSolicitante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolSolicitante_Interfaz(), this.getInterfaz(), this.getInterfaz_RolSolicitante(), "interfaz", null, 1, 1, RolSolicitante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolSolicitadoEClass, RolSolicitado.class, "RolSolicitado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolSolicitado_Interfaz(), this.getInterfaz(), this.getInterfaz_RolSolicitado(), "interfaz", null, 1, 1, RolSolicitado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaEClass, Salida.class, "Salida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalida_Destinos(), this.getEntrada(), this.getEntrada_Fuentes(), "destinos", null, 0, -1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaAccionEClass, SalidaAccion.class, "SalidaAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalidaAccion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, SalidaAccion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalidaAccion_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, SalidaAccion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalidaAccion_Salidas(), this.getCSalidasAccion(), this.getCSalidasAccion_Salidas(), "salidas", null, 1, 1, SalidaAccion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaServicioEClass, SalidaServicio.class, "SalidaServicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalidaServicio_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, SalidaServicio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSalidaServicio_Servicio(), this.getServicio(), this.getServicio_Salidas(), "servicio", null, 1, 1, SalidaServicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalidaServicio_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, SalidaServicio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(salidaSucesoEClass, SalidaSuceso.class, "SalidaSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalidaSuceso_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, SalidaSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalidaSuceso_EsDistribucion(), theEcorePackage.getEBoolean(), "esDistribucion", "false", 0, 1, SalidaSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalidaSuceso_Salidas(), this.getCSalidasSuceso(), this.getCSalidasSuceso_Salidas(), "salidas", null, 1, 1, SalidaSuceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalidaSuceso_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, SalidaSuceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(servicioEClass, Servicio.class, "Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicio_UsadoPorSucesos(), this.getCServicioUsadoPorSucesos(), this.getCServicioUsadoPorSucesos_Servicio(), "usadoPorSucesos", null, 1, 1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicio_Servicios(), this.getCServicios(), this.getCServicios_Servicios(), "servicios", null, 1, 1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicio_Entradas(), this.getEntradaServicio(), this.getEntradaServicio_Servicio(), "entradas", null, 0, -1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicio_Salidas(), this.getSalidaServicio(), this.getSalidaServicio_Servicio(), "salidas", null, 0, -1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sistemaEClass, Sistema.class, "Sistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSistema_Procedimiento(), this.getAProcedimiento(), null, "procedimiento", null, 1, 1, Sistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSistema_TodosSucesos(), this.getSuceso(), null, "todosSucesos", null, 0, -1, Sistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSistema_TodosSubsistemas(), this.getSubsistema(), null, "todosSubsistemas", null, 0, -1, Sistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSistema_Sistemas(), this.getCSistemas(), this.getCSistemas_Sistemas(), "sistemas", null, 1, 1, Sistema.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subsistemaEClass, Subsistema.class, "Subsistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubsistema_TipoSubsistema(), this.getTipoSubsistema(), "tipoSubsistema", null, 0, 1, Subsistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsistema_Procedimiento(), this.getAProcedimiento(), null, "procedimiento", null, 1, 1, Subsistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubsistema_TodosSucesos(), this.getSuceso(), null, "todosSucesos", null, 0, -1, Subsistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubsistema_UsosSubsistemas(), this.getCUsosSubsistemas(), this.getCUsosSubsistemas_Subsistema(), "usosSubsistemas", null, 1, 1, Subsistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsistema_UsadoPorSubsistemas(), this.getCUsadoPorSubsistemas(), this.getCUsadoPorSubsistemas_Subsistema(), "usadoPorSubsistemas", null, 1, 1, Subsistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsistema_Subsistemas(), this.getCSubsistemas(), this.getCSubsistemas_Subsistemas(), "subsistemas", null, 1, 1, Subsistema.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sucesoEClass, Suceso.class, "Suceso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuceso_Prioridad(), this.getTipoPrioridad(), "prioridad", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_Rendimiento(), ecorePackage.getEString(), "rendimiento", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_Disparo(), ecorePackage.getEString(), "disparo", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_Distribucion(), ecorePackage.getEString(), "distribucion", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_PreCondicion(), ecorePackage.getEString(), "preCondicion", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_PostCondicion(), ecorePackage.getEString(), "postCondicion", null, 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuceso_EsColaborativo(), theEcorePackage.getEBoolean(), "esColaborativo", "false", 0, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Acciones(), this.getCAccionesSuceso(), this.getCAccionesSuceso_Suceso(), "acciones", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Actores(), this.getCActoresSuceso(), this.getCActoresSuceso_Suceso(), "actores", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_EstructurasDatos(), this.getCEstructurasDatosSuceso(), this.getCEstructurasDatosSuceso_Suceso(), "estructurasDatos", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Flujos(), this.getCFlujosSuceso(), this.getCFlujosSuceso_Suceso(), "flujos", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Entradas(), this.getCEntradasSuceso(), this.getCEntradasSuceso_Suceso(), "entradas", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Salidas(), this.getCSalidasSuceso(), this.getCSalidasSuceso_Suceso(), "salidas", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_UsadoPorSucesos(), this.getCUsadoPorSucesos(), this.getCUsadoPorSucesos_Suceso(), "usadoPorSucesos", null, 1, 1, Suceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Procedimiento(), this.getAProcedimiento(), null, "procedimiento", null, 1, 1, Suceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSuceso_Sucesos(), this.getCSucesos(), this.getCSucesos_Sucesos(), "sucesos", null, 1, 1, Suceso.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sucesoConstructorEClass, SucesoConstructor.class, "SucesoConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sucesoConsultorEClass, SucesoConsultor.class, "SucesoConsultor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usoServicioEClass, UsoServicio.class, "UsoServicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsoServicio_Servicio(), this.getCServicioUsadoPorSucesos(), this.getCServicioUsadoPorSucesos_UsosServicio(), "servicio", null, 1, 1, UsoServicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usoSubsistemaEClass, UsoSubsistema.class, "UsoSubsistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsoSubsistema_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, UsoSubsistema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsoSubsistema_SubsistemaUsado(), this.getCUsadoPorSubsistemas(), this.getCUsadoPorSubsistemas_UsadoPorSubsistemas(), "subsistemaUsado", null, 1, 1, UsoSubsistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoSubsistema_UsosSubsistemas(), this.getCUsosSubsistemas(), this.getCUsosSubsistemas_UsosSubsistemas(), "usosSubsistemas", null, 1, 1, UsoSubsistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usoSucesoEClass, UsoSuceso.class, "UsoSuceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsoSuceso_SucesoUsado(), this.getCUsadoPorSucesos(), this.getCUsadoPorSucesos_UsosSuceso(), "sucesoUsado", null, 1, 1, UsoSuceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoUsoDocumentoEEnum, TipoUsoDocumento.class, "TipoUsoDocumento");
		addEEnumLiteral(tipoUsoDocumentoEEnum, TipoUsoDocumento.ENTRADA_LITERAL);
		addEEnumLiteral(tipoUsoDocumentoEEnum, TipoUsoDocumento.SALIDA_LITERAL);

		initEEnum(tipoPrioridadEEnum, TipoPrioridad.class, "TipoPrioridad");
		addEEnumLiteral(tipoPrioridadEEnum, TipoPrioridad.ALTA_LITERAL);
		addEEnumLiteral(tipoPrioridadEEnum, TipoPrioridad.MEDIA_LITERAL);
		addEEnumLiteral(tipoPrioridadEEnum, TipoPrioridad.BAJA_LITERAL);

		initEEnum(tipoUnidadEEnum, TipoUnidad.class, "TipoUnidad");
		addEEnumLiteral(tipoUnidadEEnum, TipoUnidad.A_LITERAL);
		addEEnumLiteral(tipoUnidadEEnum, TipoUnidad.B_LITERAL);
		addEEnumLiteral(tipoUnidadEEnum, TipoUnidad.MAS_LITERAL);

		initEEnum(tipoSubsistemaEEnum, TipoSubsistema.class, "TipoSubsistema");
		addEEnumLiteral(tipoSubsistemaEEnum, TipoSubsistema.I_LITERAL);
		addEEnumLiteral(tipoSubsistemaEEnum, TipoSubsistema.EC_LITERAL);
		addEEnumLiteral(tipoSubsistemaEEnum, TipoSubsistema.EX_LITERAL);

		initEEnum(tipoRelacionEEnum, TipoRelacion.class, "TipoRelacion");
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.REFERENCIA_LITERAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.AGREGACION_LITERAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.AGREGADO_LITERAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.COMPOSICION_LITERAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.COMPONENTE_LITERAL);

		initEEnum(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.class, "TipoAgrupacionPredefinida");
		addEEnumLiteral(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.SISTEMA_LITERAL);
		addEEnumLiteral(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.SUBSISTEMA_LITERAL);
		addEEnumLiteral(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.SUCESO_LITERAL);
		addEEnumLiteral(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.COREOGRAFIA_LITERAL);
		addEEnumLiteral(tipoAgrupacionPredefinidaEEnum, TipoAgrupacionPredefinida.MODELO_INFORMACION_LITERAL);

		initEEnum(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.class, "TipoPropiedadClaseAgrupacion");
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.NUMERO_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.ENTERO_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.DECIMAL_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.FRACCION_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.PORCENTAJE_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.ALFANUMERICO_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.FECHA_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.HORA_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.FECHA_HORA_LITERAL);
		addEEnumLiteral(tipoPropiedadClaseAgrupacionEEnum, TipoPropiedadClaseAgrupacion.ENUMERACION_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/examples/ocl
		createOclAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/examples/ocl</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOclAnnotations() {
		String source = "http://www.eclipse.org/OCL/examples/ocl";		
		addAnnotation
		  (getAAplicacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if aplicacion->isEmpty() then \'?\' else aplicacion.etiqueta endif"
		   });		
		addAnnotation
		  (getAAplicacion_Aplicacion(), 
		   source, 
		   new String[] {
			 "candidates", "aplicaciones.procedimiento.procedimiento.aplicaciones"
		   });		
		addAnnotation
		  (getAccion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsTypeOf(UsoSuceso) \r\nthen \r\n  (if self.oclAsType(UsoSuceso).sucesoUsado->isEmpty() then \'?\' else self.oclAsType(UsoSuceso).sucesoUsado.etiqueta endif).concat( \' por Suceso  \').concat(\r\n   acciones.suceso.etiqueta\r\n  )\r\nelse\r\nif self.oclIsTypeOf(UsoServicio) \r\nthen \r\n  (if self.oclAsType(UsoServicio).servicio->isEmpty() then \'?\' else self.oclAsType(UsoServicio).servicio.etiqueta endif).concat( \' por Suceso  \').concat(\r\n   acciones.suceso.etiqueta\r\n  )\r\nelse\r\n(if operaciones->isEmpty() then \'?\' else operaciones->first().etiqueta endif).concat(\r\nif operaciones->size() > 1 then \' ...\' else \'\' endif\r\n)\r\nendif\r\nendif\r\n\r\n"
		   });		
		addAnnotation
		  (getAccion_Operaciones(), 
		   source, 
		   new String[] {
			 "candidates", "acciones.suceso.procedimiento.operaciones.operaciones"
		   });		
		addAnnotation
		  (getAccion_Actores(), 
		   source, 
		   new String[] {
			 "candidates", "acciones.suceso.actores.actores"
		   });		
		addAnnotation
		  (getAccion_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsTypeOf(UsoSuceso) \r\nthen \r\n    acciones.suceso.etiqueta\r\n\r\nelse\r\nif self.oclIsTypeOf(UsoServicio) \r\nthen \r\n   acciones.suceso.etiqueta\r\n\r\nelse\r\n(if operaciones->isEmpty() then \'?\' else operaciones->first().etiqueta endif).concat(\r\nif operaciones->size() > 1 then \' ...\' else \'\' endif\r\n)\r\nendif\r\nendif\r\n\r\n"
		   });		
		addAnnotation
		  (getActor_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \r\nif unidades->isEmpty() then \'\' else \' \'.concat( unidades->first().etiqueta) endif\r\n).concat(\r\nif unidades->size() > 1 then \'...\' else \'\' endif\r\n)"
		   });		
		addAnnotation
		  (getActor_Unidades(), 
		   source, 
		   new String[] {
			 "candidates", "actores.procedimiento.unidadesOrganicas.unidades->collect( aU | aU.oclAsType(AUnidad))->union(actores.procedimiento.unidadesExternas.unidades->collect( aU | aU.oclAsType(AUnidad)))"
		   });		
		addAnnotation
		  (getADocumento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else nombre endif).concat(\r\n  if self.oclIsTypeOf( DocumentoEnEstado) \r\n  then \' de \'.concat( self.oclAsType( DocumentoEnEstado).documentoBase.etiqueta)\r\n  else \'\'\r\n  endif\r\n).concat(\r\nif documento->isEmpty() then \'\' else  \' anotando \'.concat( documento.etiqueta) endif \r\n)"
		   });		
		addAnnotation
		  (getADocumento_Documento(), 
		   source, 
		   new String[] {
			 "candidates", "if( documentos.contenedor.oclIsTypeOf( AProcedimiento))\r\nthen documentos.contenedor.oclAsType( AProcedimiento).procedimiento.documentos\r\nelse documentos.contenedor.oclAsType( LibreriaServicios).libreriasServicios.repositorio.repositorio.documentos.documentos\r\r\nendif\r\n"
		   });		
		addAnnotation
		  (getADocumento_TodosDocumentos(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf( DocumentoEnEstado)\r\nthen self->asOrderedSet()\r\nelse self->asOrderedSet()->union(estados)\r\nendif\r\n"
		   });		
		addAnnotation
		  (getAEstructuraFuncional_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if estructuraFuncional->isEmpty() then \'?\' else estructuraFuncional.etiqueta endif"
		   });		
		addAnnotation
		  (getAEstructuraFuncional_EstructuraFuncional(), 
		   source, 
		   new String[] {
			 "candidates", "estructurasFuncionales.procedimiento.procedimiento.estructurasFuncionales->closure( descomposicion)"
		   });		
		addAnnotation
		  (getAFlujo_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if flujo->isEmpty() then \'?\' else  flujo.etiqueta endif"
		   });		
		addAnnotation
		  (getAFlujo_Flujo(), 
		   source, 
		   new String[] {
			 "candidates", "documentos.procedimiento.procedimiento.operaciones.operaciones.flujosSalientes"
		   });		
		addAnnotation
		  (getAgrupacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif"
		   });		
		addAnnotation
		  (getANormativaYLegislacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if normativa->isEmpty() then \'?\' else normativa.etiqueta endif"
		   });		
		addAnnotation
		  (getANormativaYLegislacion_Normativa(), 
		   source, 
		   new String[] {
			 "candidates", "normativas.procedimiento.procedimiento.normativas"
		   });		
		addAnnotation
		  (getAOperacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if operacion->isEmpty() then \'?\' else operacion.etiqueta endif"
		   });		
		addAnnotation
		  (getAOperacion_Operacion(), 
		   source, 
		   new String[] {
			 "candidates", "operaciones.procedimiento.procedimiento.operaciones.operaciones"
		   });		
		addAnnotation
		  (getAProcedimiento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif"
		   });		
		addAnnotation
		  (getAProcedimiento_Procedimiento(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.repositorio.procedimientos.procedimientos"
		   });		
		addAnnotation
		  (getAProcedimiento_TodosSucesos(), 
		   source, 
		   new String[] {
			 "derive", "sucesos.sucesos->asOrderedSet()->union( subsistemas.subsistemas.todosSucesos->asOrderedSet())->union(sistemas.sistemas.todosSucesos->asOrderedSet())\r\n\r\n\r\n"
		   });		
		addAnnotation
		  (getAProcedimiento_TodosSubsistemas(), 
		   source, 
		   new String[] {
			 "derive", "if subsistemas->isEmpty() or subsistemas.subsistemas->isEmpty() then\r\n  sistemas.sistemas.todosSubsistemas\r\nelse\r\nif sistemas->isEmpty() or sistemas.sistemas->isEmpty() then\r\n  subsistemas.subsistemas\r\nelse\r\n  subsistemas.subsistemas->asOrderedSet()->union(sistemas.sistemas.todosSubsistemas->asOrderedSet())\r\nendif\r\nendif\r\n\r\n"
		   });		
		addAnnotation
		  (getAProcedimiento_TodasEstructurasDatos(), 
		   source, 
		   new String[] {
			 "derive", "if  importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen estructurasDatos.estructurasDatos->asOrderedSet()\r\nelse\r\n  estructurasDatos.estructurasDatos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todasEstructurasDatos->asOrderedSet()\r\n  )\r\nendif\r\n"
		   });		
		addAnnotation
		  (getAProcedimiento_TodosDocumentos(), 
		   source, 
		   new String[] {
			 "derive", "if importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen documentos.documentos.todosDocumentos->asOrderedSet()\r\nelse\r\n  documentos.documentos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todosDocumentos.todosDocumentos->asOrderedSet()\r\n  )\r\nendif\r\n"
		   });		
		addAnnotation
		  (getAProcedimiento_Repositorio(), 
		   source, 
		   new String[] {
			 "derive", "procedimientos.repositorio"
		   });		
		addAnnotation
		  (getATerminoGlosario_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if terminoGlosario->isEmpty() then \'?\' else terminoGlosario.etiqueta endif"
		   });		
		addAnnotation
		  (getATerminoGlosario_TerminoGlosario(), 
		   source, 
		   new String[] {
			 "candidates", "terminosGlosario.procedimiento.procedimiento.terminos"
		   });		
		addAnnotation
		  (getAUnidad_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if unidad->isEmpty() then \'?\' else unidad.etiqueta endif"
		   });		
		addAnnotation
		  (getAUnidadOrganica_Unidad(), 
		   source, 
		   new String[] {
			 "candidates", "unidades.procedimiento.procedimiento.unidades->closure( descomposicion)"
		   });		
		addAnnotation
		  (getCActoresSuceso_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\' de \'.concat(suceso.etiqueta)"
		   });		
		addAnnotation
		  (getCampoDatos_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif"
		   });		
		addAnnotation
		  (getCEstructurasDatosSuceso_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\' de \'.concat(suceso.etiqueta)"
		   });		
		addAnnotation
		  (getCEstructurasDatosSuceso_EstructurasDatos(), 
		   source, 
		   new String[] {
			 "candidates", "suceso.sucesos.procedimiento.todasEstructurasDatos"
		   });		
		addAnnotation
		  (getCImportacionesPor_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\'de LibreriaServicios \'.concat(\r\n  if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n)"
		   });		
		addAnnotation
		  (getCServicioUsadoPorSucesos_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\'Servicio \'.concat(   if servicio->isEmpty()  then \'?\' else  servicio.etiqueta endif).concat(\r\n \' Usado por sucesos \').concat(\r\nif usosServicio->isEmpty() then \'\' else usosServicio->first().etiquetaSimple endif\r\n)"
		   });		
		addAnnotation
		  (getCSubsistemas_Procedimiento(), 
		   source, 
		   new String[] {
			 "derive", "if contenedor.oclIsTypeOf(AProcedimiento) then contenedor.oclAsType(AProcedimiento) else \r\n contenedor.oclAsType(Sistema).procedimiento endif"
		   });		
		addAnnotation
		  (getCSucesos_Procedimiento(), 
		   source, 
		   new String[] {
			 "derive", "if contenedor.oclIsTypeOf(AProcedimiento) then contenedor.oclAsType(AProcedimiento) \r\nelse (\r\n   if contenedor.oclIsTypeOf(Sistema) then contenedor.oclAsType(Sistema).procedimiento \r\n   else contenedor.oclAsType(Subsistema).procedimiento endif\r\n) endif"
		   });		
		addAnnotation
		  (getCUnidades_Unidades(), 
		   source, 
		   new String[] {
			 "derive", "procedimiento.unidadesOrganicas.unidades->collect( aU | aU.oclAsType(AUnidad))->union(procedimiento.unidadesExternas.unidades->collect( aU | aU.oclAsType(AUnidad)))"
		   });		
		addAnnotation
		  (getCUsadoPorSubsistemas_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if subsistema->isEmpty()  then \'?\' else  subsistema.etiqueta endif"
		   });		
		addAnnotation
		  (getCUsadoPorSucesos_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if suceso->isEmpty()  then \'?\' else  suceso.etiqueta endif"
		   });		
		addAnnotation
		  (getEntrada_Fuentes(), 
		   source, 
		   new String[] {
			 "candidates", "if self.oclIsTypeOf( EntradaSuceso)\r\nthen self.oclAsType( EntradaSuceso).entradas.suceso.procedimiento.todosSucesos.salidas.salidas \r\nelse\r\nif self.oclIsTypeOf( EntradaAccion)\r\nthen  self.oclAsType( EntradaAccion).entradas.accion.acciones.suceso.acciones.acciones.salidas.salidas \r\nelse\r\n  self.oclAsType( EntradaServicio).servicio.salidas\r\nendif\r\nendif\r\n"
		   });		
		addAnnotation
		  (getEntradaAccion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nentradas.accion.etiqueta).concat(\r\nif fuentes->isEmpty() then \'?\' else \'desde \'.concat( fuentes->first().oclAsType(SalidaAccion).etiquetaSimple) endif).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructursaDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getEntradaAccion_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nentradas.accion.etiqueta)"
		   });		
		addAnnotation
		  (getEntradaOSalida_EstructurasDatos(), 
		   source, 
		   new String[] {
			 "candidates", "if self.oclIsTypeOf(EntradaSuceso) \r\nthen self.oclAsType(EntradaSuceso).entradas.suceso.procedimiento.todasEstructurasDatos \r\nelse  (\r\n  if self.oclIsTypeOf(SalidaSuceso) \r\n  then self.oclAsType(SalidaSuceso).salidas.suceso.procedimiento.todasEstructurasDatos \r\n  else (\r\n    if self.oclIsTypeOf(EntradaAccion) \r\n    then self.oclAsType(EntradaAccion).entradas.accion.acciones.suceso.procedimiento.todasEstructurasDatos\r\n    else (\r\n      if self.oclIsTypeOf(SalidaAccion) \r\n      then self.oclAsType(SalidaAccion).salidas.accion.acciones.suceso.procedimiento.todasEstructurasDatos\r\n      else (\r\n      if self.oclIsTypeOf(EntradaServicio) \r\n      then self.oclAsType(EntradaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todasEstructurasDatos\r\n      else (\r\n        self.oclAsType(SalidaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todasEstructurasDatos\r\n      )\r\n      endif\r\n      )\r\n      endif\r\n      )\r\n    endif\r\n  )\r\n endif\r\n)\r\nendif\r\n"
		   });		
		addAnnotation
		  (getEntradaOSalida_Documentos(), 
		   source, 
		   new String[] {
			 "candidates", "if self.oclIsTypeOf(EntradaSuceso) \r\nthen self.oclAsType(EntradaSuceso).entradas.suceso.procedimiento.todosDocumentos\r\nelse  (\r\n  if self.oclIsTypeOf(SalidaSuceso) \r\n  then self.oclAsType(SalidaSuceso).salidas.suceso.procedimiento.todosDocumentos \r\n  else (\r\n    if self.oclIsTypeOf(EntradaAccion) \r\n    then self.oclAsType(EntradaAccion).entradas.accion.acciones.suceso.procedimiento.todosDocumentos\r\n    else (\r\n      if self.oclIsTypeOf(SalidaAccion) \r\n      then self.oclAsType(SalidaAccion).salidas.accion.acciones.suceso.procedimiento.todosDocumentos\r\n      else (\r\n      if self.oclIsTypeOf(EntradaServicio) \r\n      then self.oclAsType(EntradaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todosDocumentos\r\n      else (\r\n        self.oclAsType(SalidaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todosDocumentos\r\n      )\r\n      endif\r\n      )\r\n      endif\r\n      )\r\n    endif\r\n  )\r\n endif\r\n)\r\nendif\r\n"
		   });		
		addAnnotation
		  (getEntradaServicio_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n\' desde \'.concat( if fuentes->isEmpty() then \'?\' else fuentes->first().oclAsType( SalidaServicio).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getEntradaServicio_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getEntradaSuceso_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nentradas.suceso.etiqueta).concat(\r\n\' desde \'.concat( if fuentes->isEmpty() then \'?\' else fuentes->first().oclAsType( SalidaSuceso).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documento \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getEntradaSuceso_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nentradas.suceso.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getEstructuraDatos_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif"
		   });		
		addAnnotation
		  (getEstructuraDatos_Campos(), 
		   source, 
		   new String[] {
			 "candidates", "estructurasDatos.procedimiento.campos.campos"
		   });		
		addAnnotation
		  (getEstructuraDatos_Documentos(), 
		   source, 
		   new String[] {
			 "candidates", "estructurasDatos.procedimiento.documentos.documentos"
		   });		
		addAnnotation
		  (getEstructuraDatos_EstructuraDatosDeSuceso(), 
		   source, 
		   new String[] {
			 "derive", "coleccionEstructuraDatosDeSuceso.suceso"
		   });		
		addAnnotation
		  (getImportacionServicios_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if importacionesServicios.importador.oclIsTypeOf( AProcedimiento) \r\nthen\r\n  \' por Procedimiento \'.concat(\r\n    importacionesServicios.importador.oclAsType( AProcedimiento).etiqueta.concat(\' de LibreriaServicios \').concat(\r\n      if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n    )\r\n  )\r\nelse\r\n  \' por LibreriaServicios \'.concat(\r\n    importacionesServicios.importador.oclAsType( LibreriaServicios).etiqueta.concat(\' de LibreriaServicios \').concat(\r\n      if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n    )\r\n  )\r\nendif\r\n"
		   });		
		addAnnotation
		  (getImportacionServicios_LibreriaServicios(), 
		   source, 
		   new String[] {
			 "candidates", "if importacionesServicios.importador.oclIsTypeOf( AProcedimiento) \r\nthen\r\n  importacionesServicios.importador.oclAsType( AProcedimiento).repositorio.libreriasServicios.libreriasServicios.importadoPor\r\nelse\r\n  importacionesServicios.importador.oclAsType( LibreriaServicios).repositorio.libreriasServicios.libreriasServicios.importadoPor\r\nendif"
		   });		
		addAnnotation
		  (getLibreriaServicios_TodosDocumentos(), 
		   source, 
		   new String[] {
			 "derive", "if importacionesServicios.importacionesServicios->isEmpty() or importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen documentos.documentos.todosDocumentos->asOrderedSet()\r\nelse\r\n  documentos.documentos.todosDocumentos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todosDocumentos.todosDocumentos->asOrderedSet()\r\n  )\r\nendif\r\n"
		   });		
		addAnnotation
		  (getLibreriaServicios_TodasEstructurasDatos(), 
		   source, 
		   new String[] {
			 "derive", "if  importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen estructurasDatos.estructurasDatos->asOrderedSet()\r\nelse\r\n  estructurasDatos.estructurasDatos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todasEstructurasDatos->asOrderedSet()\r\n  )\r\nendif\r\n"
		   });		
		addAnnotation
		  (getLibreriaServicios_Repositorio(), 
		   source, 
		   new String[] {
			 "derive", "libreriasServicios.repositorio"
		   });		
		addAnnotation
		  (getMiembroRelacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat(\' \').concat(\r\nif estructuraDatos->isEmpty() then \'?\' else estructuraDatos.etiqueta endif)\r\n\r\n"
		   });		
		addAnnotation
		  (getMiembroRelacion_EstructuraDatos(), 
		   source, 
		   new String[] {
			 "candidates", "relacion.relacionesDatos.procedimiento.estructurasDatos.estructurasDatos"
		   });		
		addAnnotation
		  (getRelacionDatos_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif"
		   });		
		addAnnotation
		  (getRol_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif"
		   });		
		addAnnotation
		  (getSalida_Destinos(), 
		   source, 
		   new String[] {
			 "candidates", "if self.oclIsTypeOf( SalidaSuceso)\r\nthen self.oclAsType( SalidaSuceso).salidas.suceso.procedimiento.todosSucesos.entradas.entradas \r\nelse\r\nif self.oclIsTypeOf( SalidaAccion)\r\nthen  self.oclAsType( SalidaAccion).salidas.accion.acciones.suceso.acciones.acciones.entradas.entradas \r\nelse\r\n  self.oclAsType(SalidaServicio).servicio.entradas\r\nendif\r\nendif\r\n"
		   });		
		addAnnotation
		  (getSalidaAccion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nsalidas.accion.etiqueta).concat(\r\nif destinos->isEmpty() then \'?\' else \'hacia \'.concat( destinos->first().oclAsType(EntradaAccion).etiquetaSimple) endif).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documento \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getSalidaAccion_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nsalidas.accion.etiqueta)"
		   });		
		addAnnotation
		  (getSalidaServicio_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n\' hacia \'.concat( if destinos->isEmpty() then \'?\' else destinos->first().oclAsType( EntradaServicio).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getSalidaServicio_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n)"
		   });		
		addAnnotation
		  (getSalidaSuceso_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nsalidas.suceso.etiqueta).concat(\r\n\' hacia \'.concat( if destinos->isEmpty() then \'?\' else destinos->first().oclAsType( EntradaSuceso).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)"
		   });		
		addAnnotation
		  (getSalidaSuceso_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nsalidas.suceso.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n)"
		   });		
		addAnnotation
		  (getSistema_Procedimiento(), 
		   source, 
		   new String[] {
			 "derive", "sistemas.procedimiento"
		   });		
		addAnnotation
		  (getSistema_TodosSucesos(), 
		   source, 
		   new String[] {
			 "derive", "sucesos.sucesos->union(subsistemas.subsistemas.todosSucesos)"
		   });		
		addAnnotation
		  (getSistema_TodosSubsistemas(), 
		   source, 
		   new String[] {
			 "derive", "subsistemas.subsistemas"
		   });		
		addAnnotation
		  (getSubsistema_Procedimiento(), 
		   source, 
		   new String[] {
			 "derive", "subsistemas.procedimiento"
		   });		
		addAnnotation
		  (getSubsistema_TodosSucesos(), 
		   source, 
		   new String[] {
			 "derive", "sucesos.sucesos"
		   });		
		addAnnotation
		  (getSubsistema_UsosSubsistemas(), 
		   source, 
		   new String[] {
			 "candidates", "subsistemas.procedimiento.todosSubsistemas"
		   });		
		addAnnotation
		  (getSuceso_Procedimiento(), 
		   source, 
		   new String[] {
			 "derive", "sucesos.procedimiento"
		   });		
		addAnnotation
		  (getUsoServicio_Servicio(), 
		   source, 
		   new String[] {
			 "candidates", "acciones.suceso.procedimiento.importacionesServicios.importacionesServicios.libreriaServicios.libreriaServicios.interfaces.interfaces.servicios.servicios.usadoPorSucesos"
		   });		
		addAnnotation
		  (getUsoSubsistema_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\' de \'.concat(\r\n  if subsistemaUsado->isEmpty()  then \'?\' else  subsistemaUsado.etiqueta endif\r\n).concat( \' por \').concat(\r\n usosSubsistemas.subsistema.etiqueta \r\n)"
		   });		
		addAnnotation
		  (getUsoSubsistema_SubsistemaUsado(), 
		   source, 
		   new String[] {
			 "candidates", "usosSubsistemas.subsistema.procedimiento.todosSubsistemas.usadoPorSubsistemas"
		   });		
		addAnnotation
		  (getUsoSuceso_SucesoUsado(), 
		   source, 
		   new String[] {
			 "candidates", "acciones.suceso.sucesos.procedimiento.todosSucesos.usadoPorSucesos"
		   });
	}

} //OrgcasiPackageImpl
