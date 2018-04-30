/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.Aplicaciones;
import es.gva.cit.simapa.ClaseDocumento;
import es.gva.cit.simapa.ClasesDocumento;
import es.gva.cit.simapa.ConModelClass;
import es.gva.cit.simapa.ContenedorEstructuraFuncional;
import es.gva.cit.simapa.ContenedorUnidadExterna;
import es.gva.cit.simapa.ContenedorUnidadOrganica;
import es.gva.cit.simapa.ControlProcedimiento;
import es.gva.cit.simapa.Convocatoria;
import es.gva.cit.simapa.Decision;
import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.DocumentoFinal;
import es.gva.cit.simapa.DocumentoFinalInterno;
import es.gva.cit.simapa.Documentos;
import es.gva.cit.simapa.EntradaDocumentoFinal;
import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.EstructurasFuncionales;
import es.gva.cit.simapa.FichaArchivistica;
import es.gva.cit.simapa.FinProceso;
import es.gva.cit.simapa.Flujo;
import es.gva.cit.simapa.Glosario;
import es.gva.cit.simapa.NormativaYLegislacion;
import es.gva.cit.simapa.NormativasYLegislaciones;
import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.Procedimientos;
import es.gva.cit.simapa.Rango1_10;
import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SalidaDocumentoFinal;
import es.gva.cit.simapa.SimapaCollection;
import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.SimapaObject;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.Subprocedimiento;
import es.gva.cit.simapa.TerminoGlosario;
import es.gva.cit.simapa.TipoAccesoArchivo;
import es.gva.cit.simapa.TipoAlmacenamientoDocumento;
import es.gva.cit.simapa.TipoAmbitoDocumento;
import es.gva.cit.simapa.TipoAplicacion;
import es.gva.cit.simapa.TipoDesarrollo;
import es.gva.cit.simapa.TipoMedioDocumento;
import es.gva.cit.simapa.TipoSilencioAdministrativo;
import es.gva.cit.simapa.TipoSituacionProcedimiento;
import es.gva.cit.simapa.TramitacionProcedimiento;
import es.gva.cit.simapa.Unidad;
import es.gva.cit.simapa.UnidadExterna;
import es.gva.cit.simapa.UnidadOrganica;
import es.gva.cit.simapa.UnidadesExternas;
import es.gva.cit.simapa.UnidadesOrganicas;

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
public class SimapaPackageImpl extends EPackageImpl implements SimapaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositorioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normativasYLegislacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normativaYLegislacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorUnidadOrganicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadesOrganicasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadOrganicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorUnidadExternaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadesExternasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidadExternaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorEstructuraFuncionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estructurasFuncionalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estructuraFuncionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasesDocumentoEClass = null;

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
	private EClass claseDocumentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glosarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminoGlosarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedimientosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichaArchivisticaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convocatoriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlProcedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramitacionProcedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprocedimientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentoFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentoFinalInternoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entradaDocumentoFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salidaDocumentoFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simapaCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simapaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finProcesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flujoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoMedioDocumentoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoSilencioAdministrativoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoSituacionProcedimientoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAccesoArchivoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAmbitoDocumentoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAlmacenamientoDocumentoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDesarrolloEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAplicacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rango1_10EEnum = null;

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
	 * @see es.gva.cit.simapa.SimapaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimapaPackageImpl() {
		super(eNS_URI, SimapaFactory.eINSTANCE);
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
	public static SimapaPackage init() {
		if (isInited) return (SimapaPackage)EPackage.Registry.INSTANCE.getEPackage(SimapaPackage.eNS_URI);

		// Obtain or create and register package
		SimapaPackageImpl theSimapaPackage = (SimapaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimapaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimapaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimapaPackage.createPackageContents();

		// Initialize created meta-data
		theSimapaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimapaPackage.freeze();

		return theSimapaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositorio() {
		return repositorioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_Procedimientos() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_Documentos() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_EstructurasFuncionales() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_Glosario() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_Normativas() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_UnidadesOrganicas() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_UnidadesExternas() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_ClasesDocumento() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_Aplicaciones() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_ModelPackage() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormativasYLegislaciones() {
		return normativasYLegislacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormativasYLegislaciones_Repositorio() {
		return (EReference)normativasYLegislacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormativasYLegislaciones_Normativas() {
		return (EReference)normativasYLegislacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormativaYLegislacion() {
		return normativaYLegislacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormativaYLegislacion_Etiqueta() {
		return (EAttribute)normativaYLegislacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormativaYLegislacion_Nombre() {
		return (EAttribute)normativaYLegislacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormativaYLegislacion_Descripcion() {
		return (EAttribute)normativaYLegislacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormativaYLegislacion_Codigo() {
		return (EAttribute)normativaYLegislacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormativaYLegislacion_Normativas() {
		return (EReference)normativaYLegislacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormativaYLegislacion_Procedimientos() {
		return (EReference)normativaYLegislacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidad() {
		return unidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Etiqueta() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Nombre() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Persona() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Telefono() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Fax() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Direccion() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Notas() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidad_Observaciones() {
		return (EAttribute)unidadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidad_Operaciones() {
		return (EReference)unidadEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorUnidadOrganica() {
		return contenedorUnidadOrganicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorUnidadOrganica_Descomposicion() {
		return (EReference)contenedorUnidadOrganicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidadesOrganicas() {
		return unidadesOrganicasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadesOrganicas_Repositorio() {
		return (EReference)unidadesOrganicasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidadOrganica() {
		return unidadOrganicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidadOrganica_Codigo() {
		return (EAttribute)unidadOrganicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidadOrganica_Descripcion() {
		return (EAttribute)unidadOrganicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidadOrganica_TipoUnidad() {
		return (EAttribute)unidadOrganicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidadOrganica_CodigoOrganico() {
		return (EAttribute)unidadOrganicaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganica_UnidadDeProcedimientos() {
		return (EReference)unidadOrganicaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganica_Descompone() {
		return (EReference)unidadOrganicaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganica_EstructurasFuncionales() {
		return (EReference)unidadOrganicaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadOrganica_ResponsableDeProcedimientos() {
		return (EReference)unidadOrganicaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorUnidadExterna() {
		return contenedorUnidadExternaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorUnidadExterna_Descomposicion() {
		return (EReference)contenedorUnidadExternaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidadesExternas() {
		return unidadesExternasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadesExternas_Repositorio() {
		return (EReference)unidadesExternasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnidadExterna() {
		return unidadExternaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnidadExterna_TipoEntidad() {
		return (EAttribute)unidadExternaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnidadExterna_Descompone() {
		return (EReference)unidadExternaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorEstructuraFuncional() {
		return contenedorEstructuraFuncionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorEstructuraFuncional_Descomposicion() {
		return (EReference)contenedorEstructuraFuncionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstructurasFuncionales() {
		return estructurasFuncionalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructurasFuncionales_Repositorio() {
		return (EReference)estructurasFuncionalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstructuraFuncional() {
		return estructuraFuncionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraFuncional_Etiqueta() {
		return (EAttribute)estructuraFuncionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraFuncional_Nombre() {
		return (EAttribute)estructuraFuncionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraFuncional_Codigo() {
		return (EAttribute)estructuraFuncionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstructuraFuncional_Descripcion() {
		return (EAttribute)estructuraFuncionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraFuncional_Descompone() {
		return (EReference)estructuraFuncionalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraFuncional_UnidadesOrganicas() {
		return (EReference)estructuraFuncionalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstructuraFuncional_Procedimientos() {
		return (EReference)estructuraFuncionalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasesDocumento() {
		return clasesDocumentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClasesDocumento_ClasesDocumento() {
		return (EReference)clasesDocumentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClasesDocumento_Repositorio() {
		return (EReference)clasesDocumentoEClass.getEStructuralFeatures().get(1);
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
	public EClass getClaseDocumento() {
		return claseDocumentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseDocumento_Etiqueta() {
		return (EAttribute)claseDocumentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseDocumento_Codigo() {
		return (EAttribute)claseDocumentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseDocumento_Nombre() {
		return (EAttribute)claseDocumentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseDocumento_Observaciones() {
		return (EAttribute)claseDocumentoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseDocumento_ClasesDocumento() {
		return (EReference)claseDocumentoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseDocumento_Documentos() {
		return (EReference)claseDocumentoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentos() {
		return documentosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentos_Documentos() {
		return (EReference)documentosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentos_Repositorio() {
		return (EReference)documentosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumento() {
		return documentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_Etiqueta() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_Titulo() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_Codigo() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_FicheroModeloFomulario() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_Observaciones() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_TipoAlmacenamiento() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_TipoMedio() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumento_TipoAmbito() {
		return (EAttribute)documentoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumento_ClaseDocumento() {
		return (EReference)documentoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumento_Procedimientos() {
		return (EReference)documentoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumento_DocumentosFinales() {
		return (EReference)documentoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumento_Flujos() {
		return (EReference)documentoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumento_Documentos() {
		return (EReference)documentoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicaciones() {
		return aplicacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicaciones_Aplicaciones() {
		return (EReference)aplicacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicaciones_Repositorio() {
		return (EReference)aplicacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacion() {
		return aplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Etiqueta() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Nombre() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Descripcion() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Codigo() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Herramienta() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_BaseDeDatos() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_NumeroUsuarios() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_EstadoAplicacion() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_NivelSeguridad() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Desarrollador() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_TipoDesarrollo() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_TipoAplicacion() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Complejidad() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Importancia() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Operaciones() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Aplicaciones() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Procedimientos() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlosario() {
		return glosarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosario_Terminos() {
		return (EReference)glosarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlosario_Repositorio() {
		return (EReference)glosarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminoGlosario() {
		return terminoGlosarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminoGlosario_Etiqueta() {
		return (EAttribute)terminoGlosarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminoGlosario_Nombre() {
		return (EAttribute)terminoGlosarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminoGlosario_Descripcion() {
		return (EAttribute)terminoGlosarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminoGlosario_Procedimientos() {
		return (EReference)terminoGlosarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminoGlosario_Glosario() {
		return (EReference)terminoGlosarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedimientos() {
		return procedimientosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimientos_Repositorio() {
		return (EReference)procedimientosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimientos_Procedimientos() {
		return (EReference)procedimientosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedimiento() {
		return procedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Etiqueta() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Codigo() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Version() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_CodigoCompleto() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Prop() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Titulo() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Objeto() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Observaciones() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Persona() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_TipoProcedimiento() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Notas() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_Periodicidad() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedimiento_TituloUltimaConvocatoria() {
		return (EAttribute)procedimientoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Operaciones() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Documentos() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Terminos() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_FichaArchivistica() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Unidades() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Procedimientos() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_TramitacionProcedimiento() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_UsosComoSubProcedimientos() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Convocatorias() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Responsable() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_ControlProcedimiento() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Normativas() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Servicio() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedimiento_Aplicaciones() {
		return (EReference)procedimientoEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichaArchivistica() {
		return fichaArchivisticaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_Etiqueta() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_TieneValorLegal() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_TieneValorAdministrativo() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_TieneValorInformativoHistorico() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_TipoAcceso() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_ReglasEliminacion() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_ReglasConservacion() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichaArchivistica_Observaciones() {
		return (EAttribute)fichaArchivisticaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFichaArchivistica_Procedimiento() {
		return (EReference)fichaArchivisticaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvocatoria() {
		return convocatoriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvocatoria_Etiqueta() {
		return (EAttribute)convocatoriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvocatoria_Nombre() {
		return (EAttribute)convocatoriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvocatoria_Descripcion() {
		return (EAttribute)convocatoriaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvocatoria_Codigo() {
		return (EAttribute)convocatoriaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvocatoria_Procedimiento() {
		return (EReference)convocatoriaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlProcedimiento() {
		return controlProcedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_Etiqueta() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_Usuario() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_Situacion() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaHoraModificacion() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaInicioVigencia() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaFinVigencia() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_ComentarioVersion() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaElaborado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_NombrePersonaElaborado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_PuestoPersonaElaborado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaRevisado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_NombrePersonaRevisado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_PuestoPersonaRevisado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_FechaAprobado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_NombrePersonaAprobado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlProcedimiento_PuestoPersonaAprobado() {
		return (EAttribute)controlProcedimientoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlProcedimiento_Procedimiento() {
		return (EReference)controlProcedimientoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTramitacionProcedimiento() {
		return tramitacionProcedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_Etiqueta() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_InicioInstanciaDeParte() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_InicioDeOficio() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_VolumenExpedientesEjercicio() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_PresupuestoAnualAproximado() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_PlazoSolicitud() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_PlazoResolucion() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_SilencioAdministrativo() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_Recurso() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTramitacionProcedimiento_EsWorkflow() {
		return (EAttribute)tramitacionProcedimientoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTramitacionProcedimiento_Procedimiento() {
		return (EReference)tramitacionProcedimientoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperaciones() {
		return operacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperaciones_Procedimiento() {
		return (EReference)operacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperaciones_Operaciones() {
		return (EReference)operacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Etiqueta() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Titulo() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Descripcion() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_PlazoEjecucion() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_EsWorkflow() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_NumeroPagina() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_NumeroOrden() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Operaciones() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Aplicaciones() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_FlujosEntrantes() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_FlujosSalientes() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Unidad() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprocedimiento() {
		return subprocedimientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprocedimiento_SubProcedimiento() {
		return (EReference)subprocedimientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentoFinal() {
		return documentoFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentoFinal_Documento() {
		return (EReference)documentoFinalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentoFinalInterno() {
		return documentoFinalInternoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntradaDocumentoFinal() {
		return entradaDocumentoFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalidaDocumentoFinal() {
		return salidaDocumentoFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimapaCollection() {
		return simapaCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimapaObject() {
		return simapaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinProceso() {
		return finProcesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlujo() {
		return flujoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlujo_Etiqueta() {
		return (EAttribute)flujoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlujo_Texto() {
		return (EAttribute)flujoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlujo_EsConector() {
		return (EAttribute)flujoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlujo_Guarda() {
		return (EAttribute)flujoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlujo_Origen() {
		return (EReference)flujoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlujo_Destino() {
		return (EReference)flujoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlujo_Documentos() {
		return (EReference)flujoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoMedioDocumento() {
		return tipoMedioDocumentoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoSilencioAdministrativo() {
		return tipoSilencioAdministrativoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoSituacionProcedimiento() {
		return tipoSituacionProcedimientoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAccesoArchivo() {
		return tipoAccesoArchivoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAmbitoDocumento() {
		return tipoAmbitoDocumentoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAlmacenamientoDocumento() {
		return tipoAlmacenamientoDocumentoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDesarrollo() {
		return tipoDesarrolloEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAplicacion() {
		return tipoAplicacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRango1_10() {
		return rango1_10EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaFactory getSimapaFactory() {
		return (SimapaFactory)getEFactoryInstance();
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
		aplicacionEClass = createEClass(APLICACION);
		createEAttribute(aplicacionEClass, APLICACION__ETIQUETA);
		createEAttribute(aplicacionEClass, APLICACION__NOMBRE);
		createEAttribute(aplicacionEClass, APLICACION__DESCRIPCION);
		createEAttribute(aplicacionEClass, APLICACION__CODIGO);
		createEAttribute(aplicacionEClass, APLICACION__HERRAMIENTA);
		createEAttribute(aplicacionEClass, APLICACION__BASE_DE_DATOS);
		createEAttribute(aplicacionEClass, APLICACION__NUMERO_USUARIOS);
		createEAttribute(aplicacionEClass, APLICACION__ESTADO_APLICACION);
		createEAttribute(aplicacionEClass, APLICACION__NIVEL_SEGURIDAD);
		createEAttribute(aplicacionEClass, APLICACION__DESARROLLADOR);
		createEAttribute(aplicacionEClass, APLICACION__TIPO_DESARROLLO);
		createEAttribute(aplicacionEClass, APLICACION__TIPO_APLICACION);
		createEAttribute(aplicacionEClass, APLICACION__COMPLEJIDAD);
		createEAttribute(aplicacionEClass, APLICACION__IMPORTANCIA);
		createEReference(aplicacionEClass, APLICACION__OPERACIONES);
		createEReference(aplicacionEClass, APLICACION__APLICACIONES);
		createEReference(aplicacionEClass, APLICACION__PROCEDIMIENTOS);

		aplicacionesEClass = createEClass(APLICACIONES);
		createEReference(aplicacionesEClass, APLICACIONES__APLICACIONES);
		createEReference(aplicacionesEClass, APLICACIONES__REPOSITORIO);

		claseDocumentoEClass = createEClass(CLASE_DOCUMENTO);
		createEAttribute(claseDocumentoEClass, CLASE_DOCUMENTO__ETIQUETA);
		createEAttribute(claseDocumentoEClass, CLASE_DOCUMENTO__CODIGO);
		createEAttribute(claseDocumentoEClass, CLASE_DOCUMENTO__NOMBRE);
		createEAttribute(claseDocumentoEClass, CLASE_DOCUMENTO__OBSERVACIONES);
		createEReference(claseDocumentoEClass, CLASE_DOCUMENTO__CLASES_DOCUMENTO);
		createEReference(claseDocumentoEClass, CLASE_DOCUMENTO__DOCUMENTOS);

		clasesDocumentoEClass = createEClass(CLASES_DOCUMENTO);
		createEReference(clasesDocumentoEClass, CLASES_DOCUMENTO__CLASES_DOCUMENTO);
		createEReference(clasesDocumentoEClass, CLASES_DOCUMENTO__REPOSITORIO);

		conModelClassEClass = createEClass(CON_MODEL_CLASS);
		createEReference(conModelClassEClass, CON_MODEL_CLASS__MODEL_CLASS);

		contenedorEstructuraFuncionalEClass = createEClass(CONTENEDOR_ESTRUCTURA_FUNCIONAL);
		createEReference(contenedorEstructuraFuncionalEClass, CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION);

		contenedorUnidadExternaEClass = createEClass(CONTENEDOR_UNIDAD_EXTERNA);
		createEReference(contenedorUnidadExternaEClass, CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION);

		contenedorUnidadOrganicaEClass = createEClass(CONTENEDOR_UNIDAD_ORGANICA);
		createEReference(contenedorUnidadOrganicaEClass, CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION);

		controlProcedimientoEClass = createEClass(CONTROL_PROCEDIMIENTO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__ETIQUETA);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__USUARIO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__SITUACION);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_ELABORADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_REVISADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__FECHA_APROBADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO);
		createEAttribute(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO);
		createEReference(controlProcedimientoEClass, CONTROL_PROCEDIMIENTO__PROCEDIMIENTO);

		convocatoriaEClass = createEClass(CONVOCATORIA);
		createEAttribute(convocatoriaEClass, CONVOCATORIA__ETIQUETA);
		createEAttribute(convocatoriaEClass, CONVOCATORIA__NOMBRE);
		createEAttribute(convocatoriaEClass, CONVOCATORIA__DESCRIPCION);
		createEAttribute(convocatoriaEClass, CONVOCATORIA__CODIGO);
		createEReference(convocatoriaEClass, CONVOCATORIA__PROCEDIMIENTO);

		decisionEClass = createEClass(DECISION);

		documentoEClass = createEClass(DOCUMENTO);
		createEAttribute(documentoEClass, DOCUMENTO__ETIQUETA);
		createEAttribute(documentoEClass, DOCUMENTO__TITULO);
		createEAttribute(documentoEClass, DOCUMENTO__CODIGO);
		createEAttribute(documentoEClass, DOCUMENTO__FICHERO_MODELO_FOMULARIO);
		createEAttribute(documentoEClass, DOCUMENTO__OBSERVACIONES);
		createEAttribute(documentoEClass, DOCUMENTO__TIPO_ALMACENAMIENTO);
		createEAttribute(documentoEClass, DOCUMENTO__TIPO_MEDIO);
		createEAttribute(documentoEClass, DOCUMENTO__TIPO_AMBITO);
		createEReference(documentoEClass, DOCUMENTO__CLASE_DOCUMENTO);
		createEReference(documentoEClass, DOCUMENTO__PROCEDIMIENTOS);
		createEReference(documentoEClass, DOCUMENTO__DOCUMENTOS_FINALES);
		createEReference(documentoEClass, DOCUMENTO__FLUJOS);
		createEReference(documentoEClass, DOCUMENTO__DOCUMENTOS);

		documentosEClass = createEClass(DOCUMENTOS);
		createEReference(documentosEClass, DOCUMENTOS__DOCUMENTOS);
		createEReference(documentosEClass, DOCUMENTOS__REPOSITORIO);

		documentoFinalEClass = createEClass(DOCUMENTO_FINAL);
		createEReference(documentoFinalEClass, DOCUMENTO_FINAL__DOCUMENTO);

		documentoFinalInternoEClass = createEClass(DOCUMENTO_FINAL_INTERNO);

		entradaDocumentoFinalEClass = createEClass(ENTRADA_DOCUMENTO_FINAL);

		estructuraFuncionalEClass = createEClass(ESTRUCTURA_FUNCIONAL);
		createEAttribute(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__ETIQUETA);
		createEAttribute(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__NOMBRE);
		createEAttribute(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__CODIGO);
		createEAttribute(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__DESCRIPCION);
		createEReference(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__DESCOMPONE);
		createEReference(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS);
		createEReference(estructuraFuncionalEClass, ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS);

		estructurasFuncionalesEClass = createEClass(ESTRUCTURAS_FUNCIONALES);
		createEReference(estructurasFuncionalesEClass, ESTRUCTURAS_FUNCIONALES__REPOSITORIO);

		fichaArchivisticaEClass = createEClass(FICHA_ARCHIVISTICA);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__ETIQUETA);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__TIPO_ACCESO);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__REGLAS_ELIMINACION);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__REGLAS_CONSERVACION);
		createEAttribute(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__OBSERVACIONES);
		createEReference(fichaArchivisticaEClass, FICHA_ARCHIVISTICA__PROCEDIMIENTO);

		finProcesoEClass = createEClass(FIN_PROCESO);

		flujoEClass = createEClass(FLUJO);
		createEAttribute(flujoEClass, FLUJO__ETIQUETA);
		createEAttribute(flujoEClass, FLUJO__TEXTO);
		createEAttribute(flujoEClass, FLUJO__ES_CONECTOR);
		createEAttribute(flujoEClass, FLUJO__GUARDA);
		createEReference(flujoEClass, FLUJO__ORIGEN);
		createEReference(flujoEClass, FLUJO__DESTINO);
		createEReference(flujoEClass, FLUJO__DOCUMENTOS);

		glosarioEClass = createEClass(GLOSARIO);
		createEReference(glosarioEClass, GLOSARIO__TERMINOS);
		createEReference(glosarioEClass, GLOSARIO__REPOSITORIO);

		normativasYLegislacionesEClass = createEClass(NORMATIVAS_YLEGISLACIONES);
		createEReference(normativasYLegislacionesEClass, NORMATIVAS_YLEGISLACIONES__REPOSITORIO);
		createEReference(normativasYLegislacionesEClass, NORMATIVAS_YLEGISLACIONES__NORMATIVAS);

		normativaYLegislacionEClass = createEClass(NORMATIVA_YLEGISLACION);
		createEAttribute(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__ETIQUETA);
		createEAttribute(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__NOMBRE);
		createEAttribute(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__DESCRIPCION);
		createEAttribute(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__CODIGO);
		createEReference(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__NORMATIVAS);
		createEReference(normativaYLegislacionEClass, NORMATIVA_YLEGISLACION__PROCEDIMIENTOS);

		operacionEClass = createEClass(OPERACION);
		createEAttribute(operacionEClass, OPERACION__ETIQUETA);
		createEAttribute(operacionEClass, OPERACION__TITULO);
		createEAttribute(operacionEClass, OPERACION__DESCRIPCION);
		createEAttribute(operacionEClass, OPERACION__PLAZO_EJECUCION);
		createEAttribute(operacionEClass, OPERACION__ES_WORKFLOW);
		createEAttribute(operacionEClass, OPERACION__NUMERO_PAGINA);
		createEAttribute(operacionEClass, OPERACION__NUMERO_ORDEN);
		createEReference(operacionEClass, OPERACION__OPERACIONES);
		createEReference(operacionEClass, OPERACION__APLICACIONES);
		createEReference(operacionEClass, OPERACION__FLUJOS_ENTRANTES);
		createEReference(operacionEClass, OPERACION__FLUJOS_SALIENTES);
		createEReference(operacionEClass, OPERACION__UNIDAD);

		operacionesEClass = createEClass(OPERACIONES);
		createEReference(operacionesEClass, OPERACIONES__PROCEDIMIENTO);
		createEReference(operacionesEClass, OPERACIONES__OPERACIONES);

		procedimientoEClass = createEClass(PROCEDIMIENTO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__ETIQUETA);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__CODIGO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__VERSION);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__CODIGO_COMPLETO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__PROP);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__TITULO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__OBJETO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__OBSERVACIONES);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__PERSONA);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__TIPO_PROCEDIMIENTO);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__NOTAS);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__PERIODICIDAD);
		createEAttribute(procedimientoEClass, PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA);
		createEReference(procedimientoEClass, PROCEDIMIENTO__OPERACIONES);
		createEReference(procedimientoEClass, PROCEDIMIENTO__DOCUMENTOS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__TERMINOS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__FICHA_ARCHIVISTICA);
		createEReference(procedimientoEClass, PROCEDIMIENTO__UNIDADES);
		createEReference(procedimientoEClass, PROCEDIMIENTO__PROCEDIMIENTOS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO);
		createEReference(procedimientoEClass, PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__CONVOCATORIAS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__RESPONSABLE);
		createEReference(procedimientoEClass, PROCEDIMIENTO__CONTROL_PROCEDIMIENTO);
		createEReference(procedimientoEClass, PROCEDIMIENTO__NORMATIVAS);
		createEReference(procedimientoEClass, PROCEDIMIENTO__SERVICIO);
		createEReference(procedimientoEClass, PROCEDIMIENTO__APLICACIONES);

		procedimientosEClass = createEClass(PROCEDIMIENTOS);
		createEReference(procedimientosEClass, PROCEDIMIENTOS__REPOSITORIO);
		createEReference(procedimientosEClass, PROCEDIMIENTOS__PROCEDIMIENTOS);

		repositorioEClass = createEClass(REPOSITORIO);
		createEReference(repositorioEClass, REPOSITORIO__PROCEDIMIENTOS);
		createEReference(repositorioEClass, REPOSITORIO__DOCUMENTOS);
		createEReference(repositorioEClass, REPOSITORIO__ESTRUCTURAS_FUNCIONALES);
		createEReference(repositorioEClass, REPOSITORIO__GLOSARIO);
		createEReference(repositorioEClass, REPOSITORIO__NORMATIVAS);
		createEReference(repositorioEClass, REPOSITORIO__UNIDADES_ORGANICAS);
		createEReference(repositorioEClass, REPOSITORIO__UNIDADES_EXTERNAS);
		createEReference(repositorioEClass, REPOSITORIO__CLASES_DOCUMENTO);
		createEReference(repositorioEClass, REPOSITORIO__APLICACIONES);
		createEReference(repositorioEClass, REPOSITORIO__MODEL_PACKAGE);

		salidaDocumentoFinalEClass = createEClass(SALIDA_DOCUMENTO_FINAL);

		simapaCollectionEClass = createEClass(SIMAPA_COLLECTION);

		simapaObjectEClass = createEClass(SIMAPA_OBJECT);

		subprocedimientoEClass = createEClass(SUBPROCEDIMIENTO);
		createEReference(subprocedimientoEClass, SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO);

		terminoGlosarioEClass = createEClass(TERMINO_GLOSARIO);
		createEAttribute(terminoGlosarioEClass, TERMINO_GLOSARIO__ETIQUETA);
		createEAttribute(terminoGlosarioEClass, TERMINO_GLOSARIO__NOMBRE);
		createEAttribute(terminoGlosarioEClass, TERMINO_GLOSARIO__DESCRIPCION);
		createEReference(terminoGlosarioEClass, TERMINO_GLOSARIO__PROCEDIMIENTOS);
		createEReference(terminoGlosarioEClass, TERMINO_GLOSARIO__GLOSARIO);

		tramitacionProcedimientoEClass = createEClass(TRAMITACION_PROCEDIMIENTO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__ETIQUETA);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__RECURSO);
		createEAttribute(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW);
		createEReference(tramitacionProcedimientoEClass, TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO);

		unidadEClass = createEClass(UNIDAD);
		createEAttribute(unidadEClass, UNIDAD__ETIQUETA);
		createEAttribute(unidadEClass, UNIDAD__NOMBRE);
		createEAttribute(unidadEClass, UNIDAD__PERSONA);
		createEAttribute(unidadEClass, UNIDAD__TELEFONO);
		createEAttribute(unidadEClass, UNIDAD__FAX);
		createEAttribute(unidadEClass, UNIDAD__DIRECCION);
		createEAttribute(unidadEClass, UNIDAD__NOTAS);
		createEAttribute(unidadEClass, UNIDAD__OBSERVACIONES);
		createEReference(unidadEClass, UNIDAD__OPERACIONES);

		unidadesOrganicasEClass = createEClass(UNIDADES_ORGANICAS);
		createEReference(unidadesOrganicasEClass, UNIDADES_ORGANICAS__REPOSITORIO);

		unidadOrganicaEClass = createEClass(UNIDAD_ORGANICA);
		createEAttribute(unidadOrganicaEClass, UNIDAD_ORGANICA__CODIGO);
		createEAttribute(unidadOrganicaEClass, UNIDAD_ORGANICA__DESCRIPCION);
		createEAttribute(unidadOrganicaEClass, UNIDAD_ORGANICA__TIPO_UNIDAD);
		createEAttribute(unidadOrganicaEClass, UNIDAD_ORGANICA__CODIGO_ORGANICO);
		createEReference(unidadOrganicaEClass, UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS);
		createEReference(unidadOrganicaEClass, UNIDAD_ORGANICA__DESCOMPONE);
		createEReference(unidadOrganicaEClass, UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES);
		createEReference(unidadOrganicaEClass, UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS);

		unidadesExternasEClass = createEClass(UNIDADES_EXTERNAS);
		createEReference(unidadesExternasEClass, UNIDADES_EXTERNAS__REPOSITORIO);

		unidadExternaEClass = createEClass(UNIDAD_EXTERNA);
		createEAttribute(unidadExternaEClass, UNIDAD_EXTERNA__TIPO_ENTIDAD);
		createEReference(unidadExternaEClass, UNIDAD_EXTERNA__DESCOMPONE);

		// Create enums
		tipoMedioDocumentoEEnum = createEEnum(TIPO_MEDIO_DOCUMENTO);
		tipoSilencioAdministrativoEEnum = createEEnum(TIPO_SILENCIO_ADMINISTRATIVO);
		tipoSituacionProcedimientoEEnum = createEEnum(TIPO_SITUACION_PROCEDIMIENTO);
		tipoAccesoArchivoEEnum = createEEnum(TIPO_ACCESO_ARCHIVO);
		tipoAmbitoDocumentoEEnum = createEEnum(TIPO_AMBITO_DOCUMENTO);
		tipoAlmacenamientoDocumentoEEnum = createEEnum(TIPO_ALMACENAMIENTO_DOCUMENTO);
		tipoDesarrolloEEnum = createEEnum(TIPO_DESARROLLO);
		tipoAplicacionEEnum = createEEnum(TIPO_APLICACION);
		rango1_10EEnum = createEEnum(RANGO1_10);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		aplicacionEClass.getESuperTypes().add(this.getSimapaObject());
		aplicacionesEClass.getESuperTypes().add(this.getSimapaCollection());
		claseDocumentoEClass.getESuperTypes().add(this.getSimapaObject());
		clasesDocumentoEClass.getESuperTypes().add(this.getSimapaCollection());
		controlProcedimientoEClass.getESuperTypes().add(this.getSimapaObject());
		convocatoriaEClass.getESuperTypes().add(this.getSimapaObject());
		decisionEClass.getESuperTypes().add(this.getOperacion());
		documentoEClass.getESuperTypes().add(this.getSimapaObject());
		documentosEClass.getESuperTypes().add(this.getSimapaCollection());
		documentoFinalEClass.getESuperTypes().add(this.getOperacion());
		documentoFinalInternoEClass.getESuperTypes().add(this.getDocumentoFinal());
		entradaDocumentoFinalEClass.getESuperTypes().add(this.getDocumentoFinal());
		estructuraFuncionalEClass.getESuperTypes().add(this.getSimapaObject());
		estructuraFuncionalEClass.getESuperTypes().add(this.getContenedorEstructuraFuncional());
		estructurasFuncionalesEClass.getESuperTypes().add(this.getSimapaCollection());
		estructurasFuncionalesEClass.getESuperTypes().add(this.getContenedorEstructuraFuncional());
		fichaArchivisticaEClass.getESuperTypes().add(this.getSimapaObject());
		finProcesoEClass.getESuperTypes().add(this.getOperacion());
		flujoEClass.getESuperTypes().add(this.getSimapaObject());
		glosarioEClass.getESuperTypes().add(this.getSimapaObject());
		normativasYLegislacionesEClass.getESuperTypes().add(this.getSimapaCollection());
		normativaYLegislacionEClass.getESuperTypes().add(this.getSimapaObject());
		operacionEClass.getESuperTypes().add(this.getSimapaObject());
		operacionesEClass.getESuperTypes().add(this.getSimapaCollection());
		procedimientoEClass.getESuperTypes().add(this.getSimapaObject());
		procedimientosEClass.getESuperTypes().add(this.getSimapaCollection());
		repositorioEClass.getESuperTypes().add(this.getSimapaObject());
		salidaDocumentoFinalEClass.getESuperTypes().add(this.getDocumentoFinal());
		simapaCollectionEClass.getESuperTypes().add(this.getSimapaObject());
		simapaObjectEClass.getESuperTypes().add(this.getConModelClass());
		subprocedimientoEClass.getESuperTypes().add(this.getOperacion());
		terminoGlosarioEClass.getESuperTypes().add(this.getSimapaObject());
		tramitacionProcedimientoEClass.getESuperTypes().add(this.getSimapaObject());
		unidadEClass.getESuperTypes().add(this.getSimapaObject());
		unidadesOrganicasEClass.getESuperTypes().add(this.getContenedorUnidadOrganica());
		unidadOrganicaEClass.getESuperTypes().add(this.getUnidad());
		unidadOrganicaEClass.getESuperTypes().add(this.getContenedorUnidadOrganica());
		unidadesExternasEClass.getESuperTypes().add(this.getContenedorUnidadExterna());
		unidadExternaEClass.getESuperTypes().add(this.getUnidad());
		unidadExternaEClass.getESuperTypes().add(this.getContenedorUnidadExterna());

		// Initialize classes and features; add operations and parameters
		initEClass(aplicacionEClass, Aplicacion.class, "Aplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Aplicacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Herramienta(), ecorePackage.getEString(), "herramienta", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_BaseDeDatos(), ecorePackage.getEString(), "baseDeDatos", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_NumeroUsuarios(), ecorePackage.getEString(), "numeroUsuarios", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_EstadoAplicacion(), ecorePackage.getEString(), "estadoAplicacion", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_NivelSeguridad(), ecorePackage.getEString(), "nivelSeguridad", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Desarrollador(), ecorePackage.getEString(), "desarrollador", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_TipoDesarrollo(), this.getTipoDesarrollo(), "tipoDesarrollo", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_TipoAplicacion(), this.getTipoAplicacion(), "tipoAplicacion", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Complejidad(), this.getRango1_10(), "complejidad", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Importancia(), this.getRango1_10(), "importancia", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Operaciones(), this.getOperacion(), this.getOperacion_Aplicaciones(), "operaciones", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Aplicaciones(), this.getAplicaciones(), this.getAplicaciones_Aplicaciones(), "aplicaciones", null, 1, 1, Aplicacion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Aplicaciones(), "procedimientos", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aplicacionesEClass, Aplicaciones.class, "Aplicaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAplicaciones_Aplicaciones(), this.getAplicacion(), this.getAplicacion_Aplicaciones(), "aplicaciones", null, 0, -1, Aplicaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicaciones_Repositorio(), this.getRepositorio(), this.getRepositorio_Aplicaciones(), "repositorio", null, 1, 1, Aplicaciones.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseDocumentoEClass, ClaseDocumento.class, "ClaseDocumento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaseDocumento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ClaseDocumento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaseDocumento_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, ClaseDocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaseDocumento_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ClaseDocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaseDocumento_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, ClaseDocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseDocumento_ClasesDocumento(), this.getClasesDocumento(), this.getClasesDocumento_ClasesDocumento(), "clasesDocumento", null, 1, 1, ClaseDocumento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseDocumento_Documentos(), this.getDocumento(), this.getDocumento_ClaseDocumento(), "documentos", null, 0, -1, ClaseDocumento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clasesDocumentoEClass, ClasesDocumento.class, "ClasesDocumento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClasesDocumento_ClasesDocumento(), this.getClaseDocumento(), this.getClaseDocumento_ClasesDocumento(), "clasesDocumento", null, 0, -1, ClasesDocumento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasesDocumento_Repositorio(), this.getRepositorio(), this.getRepositorio_ClasesDocumento(), "repositorio", null, 1, 1, ClasesDocumento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conModelClassEClass, ConModelClass.class, "ConModelClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConModelClass_ModelClass(), theEcorePackage.getEClass(), null, "modelClass", null, 1, 1, ConModelClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(contenedorEstructuraFuncionalEClass, ContenedorEstructuraFuncional.class, "ContenedorEstructuraFuncional", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorEstructuraFuncional_Descomposicion(), this.getEstructuraFuncional(), this.getEstructuraFuncional_Descompone(), "descomposicion", null, 0, -1, ContenedorEstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorUnidadExternaEClass, ContenedorUnidadExterna.class, "ContenedorUnidadExterna", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorUnidadExterna_Descomposicion(), this.getUnidadExterna(), this.getUnidadExterna_Descompone(), "descomposicion", null, 0, -1, ContenedorUnidadExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorUnidadOrganicaEClass, ContenedorUnidadOrganica.class, "ContenedorUnidadOrganica", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorUnidadOrganica_Descomposicion(), this.getUnidadOrganica(), this.getUnidadOrganica_Descompone(), "descomposicion", null, 0, -1, ContenedorUnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlProcedimientoEClass, ControlProcedimiento.class, "ControlProcedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlProcedimiento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ControlProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_Usuario(), ecorePackage.getEString(), "usuario", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_Situacion(), this.getTipoSituacionProcedimiento(), "situacion", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaHoraModificacion(), ecorePackage.getEString(), "fechaHoraModificacion", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaInicioVigencia(), ecorePackage.getEString(), "fechaInicioVigencia", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaFinVigencia(), ecorePackage.getEString(), "fechaFinVigencia", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_ComentarioVersion(), ecorePackage.getEString(), "comentarioVersion", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaElaborado(), ecorePackage.getEString(), "fechaElaborado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_NombrePersonaElaborado(), ecorePackage.getEString(), "nombrePersonaElaborado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_PuestoPersonaElaborado(), ecorePackage.getEString(), "puestoPersonaElaborado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaRevisado(), ecorePackage.getEString(), "fechaRevisado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_NombrePersonaRevisado(), ecorePackage.getEString(), "nombrePersonaRevisado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_PuestoPersonaRevisado(), ecorePackage.getEString(), "puestoPersonaRevisado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_FechaAprobado(), ecorePackage.getEString(), "fechaAprobado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_NombrePersonaAprobado(), ecorePackage.getEString(), "nombrePersonaAprobado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlProcedimiento_PuestoPersonaAprobado(), ecorePackage.getEString(), "puestoPersonaAprobado", null, 0, 1, ControlProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlProcedimiento_Procedimiento(), this.getProcedimiento(), this.getProcedimiento_ControlProcedimiento(), "procedimiento", null, 1, 1, ControlProcedimiento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convocatoriaEClass, Convocatoria.class, "Convocatoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConvocatoria_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Convocatoria.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConvocatoria_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Convocatoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConvocatoria_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Convocatoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConvocatoria_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Convocatoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConvocatoria_Procedimiento(), this.getProcedimiento(), this.getProcedimiento_Convocatorias(), "procedimiento", null, 1, 1, Convocatoria.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentoEClass, Documento.class, "Documento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Documento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_FicheroModeloFomulario(), ecorePackage.getEString(), "ficheroModeloFomulario", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_TipoAlmacenamiento(), this.getTipoAlmacenamientoDocumento(), "tipoAlmacenamiento", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_TipoMedio(), this.getTipoMedioDocumento(), "tipoMedio", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumento_TipoAmbito(), this.getTipoAmbitoDocumento(), "tipoAmbito", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumento_ClaseDocumento(), this.getClaseDocumento(), this.getClaseDocumento_Documentos(), "claseDocumento", null, 1, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumento_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Documentos(), "procedimientos", null, 0, -1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumento_DocumentosFinales(), this.getDocumentoFinal(), this.getDocumentoFinal_Documento(), "documentosFinales", null, 0, -1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumento_Flujos(), this.getFlujo(), this.getFlujo_Documentos(), "flujos", null, 0, -1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumento_Documentos(), this.getDocumentos(), this.getDocumentos_Documentos(), "documentos", null, 1, 1, Documento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentosEClass, Documentos.class, "Documentos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentos_Documentos(), this.getDocumento(), this.getDocumento_Documentos(), "documentos", null, 0, -1, Documentos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentos_Repositorio(), this.getRepositorio(), this.getRepositorio_Documentos(), "repositorio", null, 1, 1, Documentos.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentoFinalEClass, DocumentoFinal.class, "DocumentoFinal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentoFinal_Documento(), this.getDocumento(), this.getDocumento_DocumentosFinales(), "documento", null, 1, 1, DocumentoFinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentoFinalInternoEClass, DocumentoFinalInterno.class, "DocumentoFinalInterno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entradaDocumentoFinalEClass, EntradaDocumentoFinal.class, "EntradaDocumentoFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(estructuraFuncionalEClass, EstructuraFuncional.class, "EstructuraFuncional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstructuraFuncional_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, EstructuraFuncional.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstructuraFuncional_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstructuraFuncional_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, EstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstructuraFuncional_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, EstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraFuncional_Descompone(), this.getContenedorEstructuraFuncional(), this.getContenedorEstructuraFuncional_Descomposicion(), "descompone", null, 1, 1, EstructuraFuncional.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraFuncional_UnidadesOrganicas(), this.getUnidadOrganica(), this.getUnidadOrganica_EstructurasFuncionales(), "unidadesOrganicas", null, 0, -1, EstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstructuraFuncional_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Servicio(), "procedimientos", null, 0, -1, EstructuraFuncional.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estructurasFuncionalesEClass, EstructurasFuncionales.class, "EstructurasFuncionales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEstructurasFuncionales_Repositorio(), this.getRepositorio(), this.getRepositorio_EstructurasFuncionales(), "repositorio", null, 1, 1, EstructurasFuncionales.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fichaArchivisticaEClass, FichaArchivistica.class, "FichaArchivistica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichaArchivistica_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, FichaArchivistica.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_TieneValorLegal(), ecorePackage.getEBoolean(), "tieneValorLegal", "false", 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_TieneValorAdministrativo(), ecorePackage.getEBoolean(), "tieneValorAdministrativo", "false", 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_TieneValorInformativoHistorico(), ecorePackage.getEBoolean(), "tieneValorInformativoHistorico", "false", 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_TipoAcceso(), this.getTipoAccesoArchivo(), "tipoAcceso", null, 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_ReglasEliminacion(), ecorePackage.getEString(), "reglasEliminacion", null, 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_ReglasConservacion(), ecorePackage.getEString(), "reglasConservacion", null, 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichaArchivistica_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, FichaArchivistica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFichaArchivistica_Procedimiento(), this.getProcedimiento(), this.getProcedimiento_FichaArchivistica(), "procedimiento", null, 1, 1, FichaArchivistica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finProcesoEClass, FinProceso.class, "FinProceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flujoEClass, Flujo.class, "Flujo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlujo_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Flujo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlujo_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Flujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlujo_EsConector(), ecorePackage.getEBoolean(), "esConector", "false", 0, 1, Flujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlujo_Guarda(), ecorePackage.getEString(), "guarda", null, 0, 1, Flujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlujo_Origen(), this.getOperacion(), this.getOperacion_FlujosSalientes(), "origen", null, 1, 1, Flujo.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlujo_Destino(), this.getOperacion(), this.getOperacion_FlujosEntrantes(), "destino", null, 1, 1, Flujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlujo_Documentos(), this.getDocumento(), this.getDocumento_Flujos(), "documentos", null, 0, -1, Flujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glosarioEClass, Glosario.class, "Glosario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlosario_Terminos(), this.getTerminoGlosario(), this.getTerminoGlosario_Glosario(), "terminos", null, 0, -1, Glosario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlosario_Repositorio(), this.getRepositorio(), this.getRepositorio_Glosario(), "repositorio", null, 1, 1, Glosario.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normativasYLegislacionesEClass, NormativasYLegislaciones.class, "NormativasYLegislaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormativasYLegislaciones_Repositorio(), this.getRepositorio(), this.getRepositorio_Normativas(), "repositorio", null, 1, 1, NormativasYLegislaciones.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormativasYLegislaciones_Normativas(), this.getNormativaYLegislacion(), this.getNormativaYLegislacion_Normativas(), "normativas", null, 0, -1, NormativasYLegislaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normativaYLegislacionEClass, NormativaYLegislacion.class, "NormativaYLegislacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormativaYLegislacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, NormativaYLegislacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormativaYLegislacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, NormativaYLegislacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormativaYLegislacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, NormativaYLegislacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormativaYLegislacion_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, NormativaYLegislacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormativaYLegislacion_Normativas(), this.getNormativasYLegislaciones(), this.getNormativasYLegislaciones_Normativas(), "normativas", null, 1, 1, NormativaYLegislacion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormativaYLegislacion_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Normativas(), "procedimientos", null, 0, -1, NormativaYLegislacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperacion_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Operacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_PlazoEjecucion(), ecorePackage.getEString(), "plazoEjecucion", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_EsWorkflow(), ecorePackage.getEBoolean(), "esWorkflow", "false", 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_NumeroPagina(), ecorePackage.getEIntegerObject(), "numeroPagina", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_NumeroOrden(), ecorePackage.getEIntegerObject(), "numeroOrden", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Operaciones(), this.getOperaciones(), this.getOperaciones_Operaciones(), "operaciones", null, 1, 1, Operacion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Aplicaciones(), this.getAplicacion(), this.getAplicacion_Operaciones(), "aplicaciones", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_FlujosEntrantes(), this.getFlujo(), this.getFlujo_Destino(), "flujosEntrantes", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_FlujosSalientes(), this.getFlujo(), this.getFlujo_Origen(), "flujosSalientes", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Unidad(), this.getUnidad(), this.getUnidad_Operaciones(), "unidad", null, 1, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionesEClass, Operaciones.class, "Operaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperaciones_Procedimiento(), this.getProcedimiento(), this.getProcedimiento_Operaciones(), "procedimiento", null, 1, 1, Operaciones.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperaciones_Operaciones(), this.getOperacion(), this.getOperacion_Operaciones(), "operaciones", null, 0, -1, Operaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimientoEClass, Procedimiento.class, "Procedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedimiento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Procedimiento.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Version(), ecorePackage.getEString(), "version", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Prop(), ecorePackage.getEString(), "prop", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Objeto(), ecorePackage.getEString(), "objeto", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Persona(), ecorePackage.getEString(), "persona", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_TipoProcedimiento(), ecorePackage.getEString(), "tipoProcedimiento", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Notas(), ecorePackage.getEString(), "notas", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_Periodicidad(), ecorePackage.getEString(), "periodicidad", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedimiento_TituloUltimaConvocatoria(), ecorePackage.getEString(), "tituloUltimaConvocatoria", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Operaciones(), this.getOperaciones(), this.getOperaciones_Procedimiento(), "operaciones", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Documentos(), this.getDocumento(), this.getDocumento_Procedimientos(), "documentos", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Terminos(), this.getTerminoGlosario(), this.getTerminoGlosario_Procedimientos(), "terminos", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_FichaArchivistica(), this.getFichaArchivistica(), this.getFichaArchivistica_Procedimiento(), "fichaArchivistica", null, 1, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Unidades(), this.getUnidadOrganica(), this.getUnidadOrganica_UnidadDeProcedimientos(), "unidades", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Procedimientos(), this.getProcedimientos(), this.getProcedimientos_Procedimientos(), "procedimientos", null, 1, 1, Procedimiento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_TramitacionProcedimiento(), this.getTramitacionProcedimiento(), this.getTramitacionProcedimiento_Procedimiento(), "tramitacionProcedimiento", null, 1, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_UsosComoSubProcedimientos(), this.getSubprocedimiento(), this.getSubprocedimiento_SubProcedimiento(), "usosComoSubProcedimientos", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Convocatorias(), this.getConvocatoria(), this.getConvocatoria_Procedimiento(), "convocatorias", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Responsable(), this.getUnidadOrganica(), this.getUnidadOrganica_ResponsableDeProcedimientos(), "responsable", null, 1, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_ControlProcedimiento(), this.getControlProcedimiento(), this.getControlProcedimiento_Procedimiento(), "controlProcedimiento", null, 1, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Normativas(), this.getNormativaYLegislacion(), this.getNormativaYLegislacion_Procedimientos(), "normativas", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Servicio(), this.getEstructuraFuncional(), this.getEstructuraFuncional_Procedimientos(), "servicio", null, 0, 1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimiento_Aplicaciones(), this.getAplicacion(), this.getAplicacion_Procedimientos(), "aplicaciones", null, 0, -1, Procedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedimientosEClass, Procedimientos.class, "Procedimientos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedimientos_Repositorio(), this.getRepositorio(), this.getRepositorio_Procedimientos(), "repositorio", null, 1, 1, Procedimientos.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedimientos_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Procedimientos(), "procedimientos", null, 0, -1, Procedimientos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositorioEClass, Repositorio.class, "Repositorio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositorio_Procedimientos(), this.getProcedimientos(), this.getProcedimientos_Repositorio(), "procedimientos", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_Documentos(), this.getDocumentos(), this.getDocumentos_Repositorio(), "documentos", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_EstructurasFuncionales(), this.getEstructurasFuncionales(), this.getEstructurasFuncionales_Repositorio(), "estructurasFuncionales", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_Glosario(), this.getGlosario(), this.getGlosario_Repositorio(), "glosario", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_Normativas(), this.getNormativasYLegislaciones(), this.getNormativasYLegislaciones_Repositorio(), "normativas", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_UnidadesOrganicas(), this.getUnidadesOrganicas(), this.getUnidadesOrganicas_Repositorio(), "unidadesOrganicas", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_UnidadesExternas(), this.getUnidadesExternas(), this.getUnidadesExternas_Repositorio(), "unidadesExternas", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_ClasesDocumento(), this.getClasesDocumento(), this.getClasesDocumento_Repositorio(), "clasesDocumento", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_Aplicaciones(), this.getAplicaciones(), this.getAplicaciones_Repositorio(), "aplicaciones", null, 1, 1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_ModelPackage(), theEcorePackage.getEPackage(), null, "modelPackage", "", 1, 1, Repositorio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(salidaDocumentoFinalEClass, SalidaDocumentoFinal.class, "SalidaDocumentoFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simapaCollectionEClass, SimapaCollection.class, "SimapaCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simapaObjectEClass, SimapaObject.class, "SimapaObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprocedimientoEClass, Subprocedimiento.class, "Subprocedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprocedimiento_SubProcedimiento(), this.getProcedimiento(), this.getProcedimiento_UsosComoSubProcedimientos(), "subProcedimiento", null, 1, 1, Subprocedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminoGlosarioEClass, TerminoGlosario.class, "TerminoGlosario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminoGlosario_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, TerminoGlosario.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminoGlosario_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TerminoGlosario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminoGlosario_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, TerminoGlosario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminoGlosario_Procedimientos(), this.getProcedimiento(), this.getProcedimiento_Terminos(), "procedimientos", null, 0, -1, TerminoGlosario.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminoGlosario_Glosario(), this.getGlosario(), this.getGlosario_Terminos(), "glosario", null, 1, 1, TerminoGlosario.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tramitacionProcedimientoEClass, TramitacionProcedimiento.class, "TramitacionProcedimiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTramitacionProcedimiento_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, TramitacionProcedimiento.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_InicioInstanciaDeParte(), ecorePackage.getEBoolean(), "inicioInstanciaDeParte", "false", 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_InicioDeOficio(), ecorePackage.getEBoolean(), "inicioDeOficio", "false", 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_VolumenExpedientesEjercicio(), ecorePackage.getEDouble(), "volumenExpedientesEjercicio", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_PresupuestoAnualAproximado(), ecorePackage.getEDouble(), "presupuestoAnualAproximado", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_PlazoSolicitud(), ecorePackage.getEString(), "plazoSolicitud", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_PlazoResolucion(), ecorePackage.getEString(), "plazoResolucion", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_SilencioAdministrativo(), this.getTipoSilencioAdministrativo(), "silencioAdministrativo", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_Recurso(), ecorePackage.getEString(), "recurso", null, 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTramitacionProcedimiento_EsWorkflow(), ecorePackage.getEBoolean(), "esWorkflow", "false", 0, 1, TramitacionProcedimiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTramitacionProcedimiento_Procedimiento(), this.getProcedimiento(), this.getProcedimiento_TramitacionProcedimiento(), "procedimiento", null, 1, 1, TramitacionProcedimiento.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadEClass, Unidad.class, "Unidad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnidad_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Unidad.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Persona(), ecorePackage.getEString(), "persona", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Telefono(), ecorePackage.getEString(), "telefono", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Fax(), ecorePackage.getEString(), "fax", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Direccion(), ecorePackage.getEString(), "direccion", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Notas(), ecorePackage.getEString(), "notas", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidad_Observaciones(), ecorePackage.getEString(), "observaciones", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidad_Operaciones(), this.getOperacion(), this.getOperacion_Unidad(), "operaciones", null, 0, -1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadesOrganicasEClass, UnidadesOrganicas.class, "UnidadesOrganicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnidadesOrganicas_Repositorio(), this.getRepositorio(), this.getRepositorio_UnidadesOrganicas(), "repositorio", null, 1, 1, UnidadesOrganicas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadOrganicaEClass, UnidadOrganica.class, "UnidadOrganica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnidadOrganica_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidadOrganica_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidadOrganica_TipoUnidad(), ecorePackage.getEString(), "tipoUnidad", null, 0, 1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnidadOrganica_CodigoOrganico(), ecorePackage.getEString(), "codigoOrganico", null, 0, 1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganica_UnidadDeProcedimientos(), this.getProcedimiento(), this.getProcedimiento_Unidades(), "unidadDeProcedimientos", null, 0, -1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganica_Descompone(), this.getContenedorUnidadOrganica(), this.getContenedorUnidadOrganica_Descomposicion(), "descompone", null, 1, 1, UnidadOrganica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganica_EstructurasFuncionales(), this.getEstructuraFuncional(), this.getEstructuraFuncional_UnidadesOrganicas(), "estructurasFuncionales", null, 0, -1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadOrganica_ResponsableDeProcedimientos(), this.getProcedimiento(), this.getProcedimiento_Responsable(), "responsableDeProcedimientos", null, 0, -1, UnidadOrganica.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadesExternasEClass, UnidadesExternas.class, "UnidadesExternas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnidadesExternas_Repositorio(), this.getRepositorio(), this.getRepositorio_UnidadesExternas(), "repositorio", null, 1, 1, UnidadesExternas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidadExternaEClass, UnidadExterna.class, "UnidadExterna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnidadExterna_TipoEntidad(), ecorePackage.getEString(), "tipoEntidad", null, 0, 1, UnidadExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnidadExterna_Descompone(), this.getContenedorUnidadExterna(), this.getContenedorUnidadExterna_Descomposicion(), "descompone", null, 1, 1, UnidadExterna.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoMedioDocumentoEEnum, TipoMedioDocumento.class, "TipoMedioDocumento");
		addEEnumLiteral(tipoMedioDocumentoEEnum, TipoMedioDocumento.ELECTRONICO_LITERAL);
		addEEnumLiteral(tipoMedioDocumentoEEnum, TipoMedioDocumento.PAPEL_LITERAL);

		initEEnum(tipoSilencioAdministrativoEEnum, TipoSilencioAdministrativo.class, "TipoSilencioAdministrativo");
		addEEnumLiteral(tipoSilencioAdministrativoEEnum, TipoSilencioAdministrativo.POSITIVO_LITERAL);
		addEEnumLiteral(tipoSilencioAdministrativoEEnum, TipoSilencioAdministrativo.NEGATIVO_LITERAL);

		initEEnum(tipoSituacionProcedimientoEEnum, TipoSituacionProcedimiento.class, "TipoSituacionProcedimiento");
		addEEnumLiteral(tipoSituacionProcedimientoEEnum, TipoSituacionProcedimiento.DEFINITIVO_LITERAL);
		addEEnumLiteral(tipoSituacionProcedimientoEEnum, TipoSituacionProcedimiento.BORRADOR_LITERAL);

		initEEnum(tipoAccesoArchivoEEnum, TipoAccesoArchivo.class, "TipoAccesoArchivo");
		addEEnumLiteral(tipoAccesoArchivoEEnum, TipoAccesoArchivo.NO_ESTABLECIDO_LITERAL);
		addEEnumLiteral(tipoAccesoArchivoEEnum, TipoAccesoArchivo.RESTRINGIDO_LITERAL);
		addEEnumLiteral(tipoAccesoArchivoEEnum, TipoAccesoArchivo.LIBRE_LITERAL);

		initEEnum(tipoAmbitoDocumentoEEnum, TipoAmbitoDocumento.class, "TipoAmbitoDocumento");
		addEEnumLiteral(tipoAmbitoDocumentoEEnum, TipoAmbitoDocumento.ENTRADA_LITERAL);
		addEEnumLiteral(tipoAmbitoDocumentoEEnum, TipoAmbitoDocumento.SALIDA_LITERAL);
		addEEnumLiteral(tipoAmbitoDocumentoEEnum, TipoAmbitoDocumento.INTERNO_LITERAL);

		initEEnum(tipoAlmacenamientoDocumentoEEnum, TipoAlmacenamientoDocumento.class, "TipoAlmacenamientoDocumento");
		addEEnumLiteral(tipoAlmacenamientoDocumentoEEnum, TipoAlmacenamientoDocumento.NO_ESTABLECIDO_LITERAL);
		addEEnumLiteral(tipoAlmacenamientoDocumentoEEnum, TipoAlmacenamientoDocumento.FICHERO_LITERAL);
		addEEnumLiteral(tipoAlmacenamientoDocumentoEEnum, TipoAlmacenamientoDocumento.BASE_DATOS_LITERAL);

		initEEnum(tipoDesarrolloEEnum, TipoDesarrollo.class, "TipoDesarrollo");
		addEEnumLiteral(tipoDesarrolloEEnum, TipoDesarrollo.EXTERNA_LITERAL);
		addEEnumLiteral(tipoDesarrolloEEnum, TipoDesarrollo.SERVICIO_INFORMATICA_LITERAL);
		addEEnumLiteral(tipoDesarrolloEEnum, TipoDesarrollo.PROPIA_LITERAL);

		initEEnum(tipoAplicacionEEnum, TipoAplicacion.class, "TipoAplicacion");
		addEEnumLiteral(tipoAplicacionEEnum, TipoAplicacion.CORPORATIVA_LITERAL);
		addEEnumLiteral(tipoAplicacionEEnum, TipoAplicacion.USUARIO_LITERAL);

		initEEnum(rango1_10EEnum, Rango1_10.class, "Rango1_10");
		addEEnumLiteral(rango1_10EEnum, Rango1_10.NO_ESTABLECIDO_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._1_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._2_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._3_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._4_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._5_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._6_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._7_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._8_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._9_LITERAL);
		addEEnumLiteral(rango1_10EEnum, Rango1_10._10_LITERAL);

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
		  (getAplicacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getClaseDocumento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getControlProcedimiento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif"
		   });		
		addAnnotation
		  (getConvocatoria_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getDocumento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if titulo->notEmpty() and titulo.size() > 0 then titulo else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getDocumento_ClaseDocumento(), 
		   source, 
		   new String[] {
			 "candidates", "documentos.repositorio.clasesDocumento.clasesDocumento"
		   });		
		addAnnotation
		  (getDocumentoFinal_Documento(), 
		   source, 
		   new String[] {
			 "candidates", "operaciones.procedimiento.documentos"
		   });		
		addAnnotation
		  (getEstructuraFuncional_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getFichaArchivistica_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif"
		   });		
		addAnnotation
		  (getFlujo_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\'de \'.concat( if origen->isEmpty() then \'?\' else origen.etiqueta endif).concat( \' a \').concat(if destino->isEmpty() then \'?\' else destino.etiqueta endif) "
		   });		
		addAnnotation
		  (getFlujo_Origen(), 
		   source, 
		   new String[] {
			 "candidates", "origen.operaciones.procedimiento.operaciones.operaciones"
		   });		
		addAnnotation
		  (getFlujo_Destino(), 
		   source, 
		   new String[] {
			 "candidates", "origen.operaciones.procedimiento.operaciones.operaciones"
		   });		
		addAnnotation
		  (getFlujo_Documentos(), 
		   source, 
		   new String[] {
			 "candidates", "origen.operaciones.procedimiento.documentos"
		   });		
		addAnnotation
		  (getNormativaYLegislacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getOperacion_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if titulo->notEmpty() and titulo.size() > 0 then titulo else \'\' endif).concat( \' \').concat( \r\n  if self.oclIsTypeOf(DocumentoFinal) then (\r\n    if self.oclAsType( DocumentoFinal).documento->isEmpty() then \'?\' \r\n    else self.oclAsType( DocumentoFinal).documento.etiqueta endif \r\n  ) else ( \r\n  if self.oclIsTypeOf(Subprocedimiento) then (\r\n    if self.oclAsType( Subprocedimiento).subProcedimiento->isEmpty() then \'?\' \r\n    else self.oclAsType( Subprocedimiento).subProcedimiento.etiqueta endif\r\n  ) else (\r\n    \'\' \r\n  ) endif\r\n  ) endif\r\n) \r\n\r\n"
		   });		
		addAnnotation
		  (getProcedimiento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if titulo->notEmpty() and titulo.size() > 0 then titulo else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getProcedimiento_Documentos(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.documentos.documentos"
		   });		
		addAnnotation
		  (getProcedimiento_Unidades(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.unidadesOrganicas.descomposicion->union(procedimientos.repositorio.unidadesExternas.descomposicion)"
		   });		
		addAnnotation
		  (getProcedimiento_Responsable(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.unidadesOrganicas->closure(descomposicion)"
		   });		
		addAnnotation
		  (getProcedimiento_Normativas(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.normativas.normativas"
		   });		
		addAnnotation
		  (getProcedimiento_Aplicaciones(), 
		   source, 
		   new String[] {
			 "candidates", "procedimientos.repositorio.aplicaciones.aplicaciones"
		   });		
		addAnnotation
		  (getSubprocedimiento_SubProcedimiento(), 
		   source, 
		   new String[] {
			 "candidates", "operaciones.procedimiento.procedimientos"
		   });		
		addAnnotation
		  (getTerminoGlosario_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if nombre->notEmpty() and nombre.size() > 0 then \'(\'.concat( nombre).concat(\') \') else \'\' endif).concat(\r\n  if descripcion->notEmpty() and descripcion.size() > 0 then descripcion else \'?\' endif\r\n)"
		   });		
		addAnnotation
		  (getTramitacionProcedimiento_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif"
		   });		
		addAnnotation
		  (getUnidad_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsTypeOf( UnidadOrganica) then\r\n(if self.oclAsType( UnidadOrganica).codigo->notEmpty() and self.oclAsType( UnidadOrganica).codigo.size() > 0 then \'(\'.concat( self.oclAsType( UnidadOrganica).codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)\r\nelse\r\nif self.oclIsTypeOf( UnidadExterna) then\r\n(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)\r\nelse\r\n   if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\nendif\r\n\r\nendif\r\n"
		   });
	}

} //SimapaPackageImpl
