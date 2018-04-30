/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Actividad;
import es.gva.cit.gvmetrica.proinso.ActividadAbstracta;
import es.gva.cit.gvmetrica.proinso.ActividadInterfaz;
import es.gva.cit.gvmetrica.proinso.Cargo;
import es.gva.cit.gvmetrica.proinso.Comite;
import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.ConModelClass;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.Entrada;
import es.gva.cit.gvmetrica.proinso.Interfaces;
import es.gva.cit.gvmetrica.proinso.Interfaz;
import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind;
import es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind;
import es.gva.cit.gvmetrica.proinso.Parrafo;
import es.gva.cit.gvmetrica.proinso.Participacion;
import es.gva.cit.gvmetrica.proinso.Participante;
import es.gva.cit.gvmetrica.proinso.PerfilParticipante;
import es.gva.cit.gvmetrica.proinso.PerfilesParticipantes;
import es.gva.cit.gvmetrica.proinso.Practica;
import es.gva.cit.gvmetrica.proinso.Practicas;
import es.gva.cit.gvmetrica.proinso.Proceso;
import es.gva.cit.gvmetrica.proinso.ProcesoInterfaz;
import es.gva.cit.gvmetrica.proinso.Procesos;
import es.gva.cit.gvmetrica.proinso.Producto;
import es.gva.cit.gvmetrica.proinso.Productos;
import es.gva.cit.gvmetrica.proinso.ProinsoCollection;
import es.gva.cit.gvmetrica.proinso.ProinsoFactory;
import es.gva.cit.gvmetrica.proinso.ProinsoObject;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;
import es.gva.cit.gvmetrica.proinso.Repositorio;
import es.gva.cit.gvmetrica.proinso.Run;
import es.gva.cit.gvmetrica.proinso.Salida;
import es.gva.cit.gvmetrica.proinso.Seccion;
import es.gva.cit.gvmetrica.proinso.Tarea;
import es.gva.cit.gvmetrica.proinso.Tecnica;
import es.gva.cit.gvmetrica.proinso.Tecnicas;
import es.gva.cit.gvmetrica.proinso.TextRun;
import es.gva.cit.gvmetrica.proinso.Usable;
import es.gva.cit.gvmetrica.proinso.UsoFlujo;
import es.gva.cit.gvmetrica.proinso.UsoPractica;
import es.gva.cit.gvmetrica.proinso.UsoTecnica;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProinsoPackageImpl extends EPackageImpl implements ProinsoPackage {
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
	private EClass actividadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadInterfazEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cargoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conDocumentacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentacionEClass = null;

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
	private EClass interfacesEClass = null;

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
	private EClass metodologiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parrafoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perfilesParticipantesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perfilParticipanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practicasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procesoInterfazEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procesosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proinsoCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proinsoObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenciableEClass = null;

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
	private EClass runEClass = null;

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
	private EClass seccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tecnicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tecnicasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoFlujoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoPracticaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usoTecnicaEClass = null;

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
	private EEnum modoUsoEntradaKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modoUsoSalidaKindEEnum = null;

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProinsoPackageImpl() {
		super(eNS_URI, ProinsoFactory.eINSTANCE);
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
	public static ProinsoPackage init() {
		if (isInited) return (ProinsoPackage)EPackage.Registry.INSTANCE.getEPackage(ProinsoPackage.eNS_URI);

		// Obtain or create and register package
		ProinsoPackageImpl theProinsoPackage = (ProinsoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProinsoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ProinsoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProinsoPackage.createPackageContents();

		// Initialize created meta-data
		theProinsoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProinsoPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ProinsoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProinsoPackage.freeze();

		return theProinsoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividad() {
		return actividadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividad_Proceso() {
		return (EReference)actividadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadAbstracta() {
		return actividadAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadAbstracta_CodigoYNombre() {
		return (EAttribute)actividadAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadAbstracta_CodigoCompleto() {
		return (EAttribute)actividadAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadAbstracta_Codigo() {
		return (EAttribute)actividadAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadAbstracta_Nombre() {
		return (EAttribute)actividadAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadAbstracta_Tareas() {
		return (EReference)actividadAbstractaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadAbstracta_Predecesores() {
		return (EReference)actividadAbstractaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadAbstracta_Sucesores() {
		return (EReference)actividadAbstractaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadInterfaz() {
		return actividadInterfazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadInterfaz_Proceso() {
		return (EReference)actividadInterfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCargo() {
		return cargoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConDocumentacion() {
		return conDocumentacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConDocumentacion_Documentacion() {
		return (EReference)conDocumentacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComite() {
		return comiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentacion() {
		return documentacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentacion_Documentado() {
		return (EReference)documentacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentacion_Parrafos() {
		return (EReference)documentacionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getEntrada_Nombre() {
		return (EAttribute)entradaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrada_ModoUso() {
		return (EAttribute)entradaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrada_Guarda() {
		return (EAttribute)entradaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrada_Precondiciones() {
		return (EAttribute)entradaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntrada_Salidas() {
		return (EReference)entradaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaces() {
		return interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaces_Interfaces() {
		return (EReference)interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaces_Metodologia() {
		return (EReference)interfacesEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getInterfaz_Codigo() {
		return (EAttribute)interfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaz_Nombre() {
		return (EAttribute)interfazEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_Interfaces() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaz_Procesos() {
		return (EReference)interfazEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaz_CodigoCompleto() {
		return (EAttribute)interfazEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetodologia() {
		return metodologiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodologia_Nombre() {
		return (EAttribute)metodologiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Procesos() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Interfaces() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Productos() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_PerfilesParticipantes() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Practicas() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Tecnicas() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodologia_Repositorio() {
		return (EReference)metodologiaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParrafo() {
		return parrafoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParrafo_Texto() {
		return (EAttribute)parrafoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParrafo_Documentacion() {
		return (EReference)parrafoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParrafo_Runs() {
		return (EReference)parrafoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParrafo_Estilo() {
		return (EAttribute)parrafoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipacion() {
		return participacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipacion_Nombre() {
		return (EAttribute)participacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipacion_Tarea() {
		return (EReference)participacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipacion_PerfilParticipante() {
		return (EReference)participacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipante() {
		return participanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipante_Nombre() {
		return (EAttribute)participanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipante_PerfilParticipante() {
		return (EReference)participanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerfilesParticipantes() {
		return perfilesParticipantesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfilesParticipantes_PerfilesParticipantes() {
		return (EReference)perfilesParticipantesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfilesParticipantes_Metodologia() {
		return (EReference)perfilesParticipantesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerfilParticipante() {
		return perfilParticipanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfilParticipante_Nombre() {
		return (EAttribute)perfilParticipanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfilParticipante_Participaciones() {
		return (EReference)perfilParticipanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfilParticipante_Participantes() {
		return (EReference)perfilParticipanteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfilParticipante_PerfilesParticipantes() {
		return (EReference)perfilParticipanteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractica() {
		return practicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPractica_Nombre() {
		return (EAttribute)practicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractica_Practicas() {
		return (EReference)practicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractica_UsosPractica() {
		return (EReference)practicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPracticas() {
		return practicasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticas_Practicas() {
		return (EReference)practicasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticas_Metodologia() {
		return (EReference)practicasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceso() {
		return procesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceso_CodigoYNombre() {
		return (EAttribute)procesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceso_Codigo() {
		return (EAttribute)procesoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceso_Nombre() {
		return (EAttribute)procesoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProceso_Actividades() {
		return (EReference)procesoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProceso_Procesos() {
		return (EReference)procesoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceso_CodigoCompleto() {
		return (EAttribute)procesoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcesoInterfaz() {
		return procesoInterfazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcesoInterfaz_CodigoCompleto() {
		return (EAttribute)procesoInterfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcesoInterfaz_Nombre() {
		return (EAttribute)procesoInterfazEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcesoInterfaz_Codigo() {
		return (EAttribute)procesoInterfazEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcesoInterfaz_Interfaz() {
		return (EReference)procesoInterfazEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcesoInterfaz_Actividades() {
		return (EReference)procesoInterfazEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcesos() {
		return procesosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcesos_Procesos() {
		return (EReference)procesosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcesos_Metodologia() {
		return (EReference)procesosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProinsoCollection() {
		return proinsoCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProinsoObject() {
		return proinsoObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducto() {
		return productoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Nombre() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Codigo() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducto_Metodologia() {
		return (EReference)productoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_EsExterno() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductos() {
		return productosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductos_Productos() {
		return (EReference)productosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductos_Metodologia() {
		return (EReference)productosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceRun() {
		return referenceRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceRun_Referenciado() {
		return (EReference)referenceRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenciable() {
		return referenciableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenciable_Referencias() {
		return (EReference)referenciableEClass.getEStructuralFeatures().get(0);
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
	public EReference getRepositorio_Metodologias() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositorio_ModelPackage() {
		return (EReference)repositorioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRun() {
		return runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_Texto() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRun_Parrafo() {
		return (EReference)runEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSalida_Nombre() {
		return (EAttribute)salidaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalida_ModoUso() {
		return (EAttribute)salidaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalida_Guarda() {
		return (EAttribute)salidaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalida_Postcondiciones() {
		return (EAttribute)salidaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalida_Forzado() {
		return (EAttribute)salidaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalida_Entradas() {
		return (EReference)salidaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeccion() {
		return seccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeccion_Nombre() {
		return (EAttribute)seccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeccion_Codigo() {
		return (EAttribute)seccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeccion_Contenedor() {
		return (EReference)seccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_CodigoYNombre() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_CodigoCompleto() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Codigo() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Nombre() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Actividad() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Flujos() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Participaciones() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_UsoPracticas() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_UsoTecnicas() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTecnica() {
		return tecnicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTecnica_Nombre() {
		return (EAttribute)tecnicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTecnica_Tecnicas() {
		return (EReference)tecnicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTecnica_UsosTecnica() {
		return (EReference)tecnicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTecnicas() {
		return tecnicasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTecnicas_Tecnicas() {
		return (EReference)tecnicasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTecnicas_Metodologia() {
		return (EReference)tecnicasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextRun() {
		return textRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Estilo() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsable() {
		return usableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsable_Etiqueta() {
		return (EAttribute)usableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsable_Contenido() {
		return (EReference)usableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsable_Usos() {
		return (EReference)usableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoFlujo() {
		return usoFlujoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoFlujo_Etiqueta() {
		return (EAttribute)usoFlujoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoFlujo_Producto() {
		return (EReference)usoFlujoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoFlujo_Tarea() {
		return (EReference)usoFlujoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoPractica() {
		return usoPracticaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoPractica_Nombre() {
		return (EAttribute)usoPracticaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoPractica_Descripcion() {
		return (EAttribute)usoPracticaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoPractica_Tarea() {
		return (EReference)usoPracticaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoPractica_Practica() {
		return (EReference)usoPracticaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsoTecnica() {
		return usoTecnicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoTecnica_Nombre() {
		return (EAttribute)usoTecnicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsoTecnica_Descripcion() {
		return (EAttribute)usoTecnicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoTecnica_Tarea() {
		return (EReference)usoTecnicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsoTecnica_Tecnica() {
		return (EReference)usoTecnicaEClass.getEStructuralFeatures().get(3);
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
	public EEnum getModoUsoEntradaKind() {
		return modoUsoEntradaKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModoUsoSalidaKind() {
		return modoUsoSalidaKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoFactory getProinsoFactory() {
		return (ProinsoFactory)getEFactoryInstance();
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
		actividadEClass = createEClass(ACTIVIDAD);
		createEReference(actividadEClass, ACTIVIDAD__PROCESO);

		actividadAbstractaEClass = createEClass(ACTIVIDAD_ABSTRACTA);
		createEAttribute(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE);
		createEAttribute(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO);
		createEAttribute(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__CODIGO);
		createEAttribute(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__NOMBRE);
		createEReference(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__TAREAS);
		createEReference(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__PREDECESORES);
		createEReference(actividadAbstractaEClass, ACTIVIDAD_ABSTRACTA__SUCESORES);

		actividadInterfazEClass = createEClass(ACTIVIDAD_INTERFAZ);
		createEReference(actividadInterfazEClass, ACTIVIDAD_INTERFAZ__PROCESO);

		cargoEClass = createEClass(CARGO);

		conDocumentacionEClass = createEClass(CON_DOCUMENTACION);
		createEReference(conDocumentacionEClass, CON_DOCUMENTACION__DOCUMENTACION);

		comiteEClass = createEClass(COMITE);

		conModelClassEClass = createEClass(CON_MODEL_CLASS);
		createEReference(conModelClassEClass, CON_MODEL_CLASS__MODEL_CLASS);

		documentacionEClass = createEClass(DOCUMENTACION);
		createEReference(documentacionEClass, DOCUMENTACION__DOCUMENTADO);
		createEReference(documentacionEClass, DOCUMENTACION__PARRAFOS);

		entradaEClass = createEClass(ENTRADA);
		createEAttribute(entradaEClass, ENTRADA__NOMBRE);
		createEAttribute(entradaEClass, ENTRADA__MODO_USO);
		createEAttribute(entradaEClass, ENTRADA__GUARDA);
		createEAttribute(entradaEClass, ENTRADA__PRECONDICIONES);
		createEReference(entradaEClass, ENTRADA__SALIDAS);

		interfacesEClass = createEClass(INTERFACES);
		createEReference(interfacesEClass, INTERFACES__INTERFACES);
		createEReference(interfacesEClass, INTERFACES__METODOLOGIA);

		interfazEClass = createEClass(INTERFAZ);
		createEAttribute(interfazEClass, INTERFAZ__CODIGO);
		createEAttribute(interfazEClass, INTERFAZ__NOMBRE);
		createEReference(interfazEClass, INTERFAZ__INTERFACES);
		createEReference(interfazEClass, INTERFAZ__PROCESOS);
		createEAttribute(interfazEClass, INTERFAZ__CODIGO_COMPLETO);

		metodologiaEClass = createEClass(METODOLOGIA);
		createEAttribute(metodologiaEClass, METODOLOGIA__NOMBRE);
		createEReference(metodologiaEClass, METODOLOGIA__PROCESOS);
		createEReference(metodologiaEClass, METODOLOGIA__INTERFACES);
		createEReference(metodologiaEClass, METODOLOGIA__PRODUCTOS);
		createEReference(metodologiaEClass, METODOLOGIA__PERFILES_PARTICIPANTES);
		createEReference(metodologiaEClass, METODOLOGIA__PRACTICAS);
		createEReference(metodologiaEClass, METODOLOGIA__TECNICAS);
		createEReference(metodologiaEClass, METODOLOGIA__REPOSITORIO);

		parrafoEClass = createEClass(PARRAFO);
		createEAttribute(parrafoEClass, PARRAFO__TEXTO);
		createEReference(parrafoEClass, PARRAFO__DOCUMENTACION);
		createEReference(parrafoEClass, PARRAFO__RUNS);
		createEAttribute(parrafoEClass, PARRAFO__ESTILO);

		participacionEClass = createEClass(PARTICIPACION);
		createEAttribute(participacionEClass, PARTICIPACION__NOMBRE);
		createEReference(participacionEClass, PARTICIPACION__TAREA);
		createEReference(participacionEClass, PARTICIPACION__PERFIL_PARTICIPANTE);

		participanteEClass = createEClass(PARTICIPANTE);
		createEAttribute(participanteEClass, PARTICIPANTE__NOMBRE);
		createEReference(participanteEClass, PARTICIPANTE__PERFIL_PARTICIPANTE);

		perfilesParticipantesEClass = createEClass(PERFILES_PARTICIPANTES);
		createEReference(perfilesParticipantesEClass, PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES);
		createEReference(perfilesParticipantesEClass, PERFILES_PARTICIPANTES__METODOLOGIA);

		perfilParticipanteEClass = createEClass(PERFIL_PARTICIPANTE);
		createEAttribute(perfilParticipanteEClass, PERFIL_PARTICIPANTE__NOMBRE);
		createEReference(perfilParticipanteEClass, PERFIL_PARTICIPANTE__PARTICIPACIONES);
		createEReference(perfilParticipanteEClass, PERFIL_PARTICIPANTE__PARTICIPANTES);
		createEReference(perfilParticipanteEClass, PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES);

		practicaEClass = createEClass(PRACTICA);
		createEAttribute(practicaEClass, PRACTICA__NOMBRE);
		createEReference(practicaEClass, PRACTICA__PRACTICAS);
		createEReference(practicaEClass, PRACTICA__USOS_PRACTICA);

		practicasEClass = createEClass(PRACTICAS);
		createEReference(practicasEClass, PRACTICAS__PRACTICAS);
		createEReference(practicasEClass, PRACTICAS__METODOLOGIA);

		procesoEClass = createEClass(PROCESO);
		createEAttribute(procesoEClass, PROCESO__CODIGO_YNOMBRE);
		createEAttribute(procesoEClass, PROCESO__CODIGO);
		createEAttribute(procesoEClass, PROCESO__NOMBRE);
		createEReference(procesoEClass, PROCESO__ACTIVIDADES);
		createEReference(procesoEClass, PROCESO__PROCESOS);
		createEAttribute(procesoEClass, PROCESO__CODIGO_COMPLETO);

		procesoInterfazEClass = createEClass(PROCESO_INTERFAZ);
		createEAttribute(procesoInterfazEClass, PROCESO_INTERFAZ__CODIGO_COMPLETO);
		createEAttribute(procesoInterfazEClass, PROCESO_INTERFAZ__NOMBRE);
		createEAttribute(procesoInterfazEClass, PROCESO_INTERFAZ__CODIGO);
		createEReference(procesoInterfazEClass, PROCESO_INTERFAZ__INTERFAZ);
		createEReference(procesoInterfazEClass, PROCESO_INTERFAZ__ACTIVIDADES);

		procesosEClass = createEClass(PROCESOS);
		createEReference(procesosEClass, PROCESOS__PROCESOS);
		createEReference(procesosEClass, PROCESOS__METODOLOGIA);

		proinsoCollectionEClass = createEClass(PROINSO_COLLECTION);

		proinsoObjectEClass = createEClass(PROINSO_OBJECT);

		productoEClass = createEClass(PRODUCTO);
		createEAttribute(productoEClass, PRODUCTO__NOMBRE);
		createEAttribute(productoEClass, PRODUCTO__CODIGO);
		createEReference(productoEClass, PRODUCTO__METODOLOGIA);
		createEAttribute(productoEClass, PRODUCTO__ES_EXTERNO);

		productosEClass = createEClass(PRODUCTOS);
		createEReference(productosEClass, PRODUCTOS__PRODUCTOS);
		createEReference(productosEClass, PRODUCTOS__METODOLOGIA);

		referenceRunEClass = createEClass(REFERENCE_RUN);
		createEReference(referenceRunEClass, REFERENCE_RUN__REFERENCIADO);

		referenciableEClass = createEClass(REFERENCIABLE);
		createEReference(referenciableEClass, REFERENCIABLE__REFERENCIAS);

		repositorioEClass = createEClass(REPOSITORIO);
		createEReference(repositorioEClass, REPOSITORIO__METODOLOGIAS);
		createEReference(repositorioEClass, REPOSITORIO__MODEL_PACKAGE);

		runEClass = createEClass(RUN);
		createEAttribute(runEClass, RUN__TEXTO);
		createEReference(runEClass, RUN__PARRAFO);

		salidaEClass = createEClass(SALIDA);
		createEAttribute(salidaEClass, SALIDA__NOMBRE);
		createEAttribute(salidaEClass, SALIDA__MODO_USO);
		createEAttribute(salidaEClass, SALIDA__GUARDA);
		createEAttribute(salidaEClass, SALIDA__POSTCONDICIONES);
		createEAttribute(salidaEClass, SALIDA__FORZADO);
		createEReference(salidaEClass, SALIDA__ENTRADAS);

		seccionEClass = createEClass(SECCION);
		createEAttribute(seccionEClass, SECCION__NOMBRE);
		createEAttribute(seccionEClass, SECCION__CODIGO);
		createEReference(seccionEClass, SECCION__CONTENEDOR);

		tareaEClass = createEClass(TAREA);
		createEAttribute(tareaEClass, TAREA__CODIGO_YNOMBRE);
		createEAttribute(tareaEClass, TAREA__CODIGO_COMPLETO);
		createEAttribute(tareaEClass, TAREA__CODIGO);
		createEAttribute(tareaEClass, TAREA__NOMBRE);
		createEReference(tareaEClass, TAREA__ACTIVIDAD);
		createEReference(tareaEClass, TAREA__FLUJOS);
		createEReference(tareaEClass, TAREA__PARTICIPACIONES);
		createEReference(tareaEClass, TAREA__USO_PRACTICAS);
		createEReference(tareaEClass, TAREA__USO_TECNICAS);

		tecnicaEClass = createEClass(TECNICA);
		createEAttribute(tecnicaEClass, TECNICA__NOMBRE);
		createEReference(tecnicaEClass, TECNICA__TECNICAS);
		createEReference(tecnicaEClass, TECNICA__USOS_TECNICA);

		tecnicasEClass = createEClass(TECNICAS);
		createEReference(tecnicasEClass, TECNICAS__TECNICAS);
		createEReference(tecnicasEClass, TECNICAS__METODOLOGIA);

		textRunEClass = createEClass(TEXT_RUN);
		createEAttribute(textRunEClass, TEXT_RUN__ESTILO);

		usableEClass = createEClass(USABLE);
		createEAttribute(usableEClass, USABLE__ETIQUETA);
		createEReference(usableEClass, USABLE__CONTENIDO);
		createEReference(usableEClass, USABLE__USOS);

		usoFlujoEClass = createEClass(USO_FLUJO);
		createEAttribute(usoFlujoEClass, USO_FLUJO__ETIQUETA);
		createEReference(usoFlujoEClass, USO_FLUJO__PRODUCTO);
		createEReference(usoFlujoEClass, USO_FLUJO__TAREA);

		usoPracticaEClass = createEClass(USO_PRACTICA);
		createEAttribute(usoPracticaEClass, USO_PRACTICA__NOMBRE);
		createEAttribute(usoPracticaEClass, USO_PRACTICA__DESCRIPCION);
		createEReference(usoPracticaEClass, USO_PRACTICA__TAREA);
		createEReference(usoPracticaEClass, USO_PRACTICA__PRACTICA);

		usoTecnicaEClass = createEClass(USO_TECNICA);
		createEAttribute(usoTecnicaEClass, USO_TECNICA__NOMBRE);
		createEAttribute(usoTecnicaEClass, USO_TECNICA__DESCRIPCION);
		createEReference(usoTecnicaEClass, USO_TECNICA__TAREA);
		createEReference(usoTecnicaEClass, USO_TECNICA__TECNICA);

		// Create enums
		modoUsoEntradaKindEEnum = createEEnum(MODO_USO_ENTRADA_KIND);
		modoUsoSalidaKindEEnum = createEEnum(MODO_USO_SALIDA_KIND);
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
		actividadEClass.getESuperTypes().add(this.getActividadAbstracta());
		actividadAbstractaEClass.getESuperTypes().add(this.getProinsoObject());
		actividadAbstractaEClass.getESuperTypes().add(this.getConDocumentacion());
		actividadAbstractaEClass.getESuperTypes().add(this.getReferenciable());
		actividadInterfazEClass.getESuperTypes().add(this.getActividadAbstracta());
		cargoEClass.getESuperTypes().add(this.getParticipante());
		comiteEClass.getESuperTypes().add(this.getParticipante());
		documentacionEClass.getESuperTypes().add(this.getProinsoObject());
		entradaEClass.getESuperTypes().add(this.getUsoFlujo());
		interfacesEClass.getESuperTypes().add(this.getProinsoCollection());
		interfazEClass.getESuperTypes().add(this.getProinsoObject());
		interfazEClass.getESuperTypes().add(this.getConDocumentacion());
		interfazEClass.getESuperTypes().add(this.getReferenciable());
		metodologiaEClass.getESuperTypes().add(this.getConDocumentacion());
		parrafoEClass.getESuperTypes().add(this.getProinsoObject());
		participacionEClass.getESuperTypes().add(this.getProinsoObject());
		participanteEClass.getESuperTypes().add(this.getProinsoObject());
		participanteEClass.getESuperTypes().add(this.getConDocumentacion());
		participanteEClass.getESuperTypes().add(this.getReferenciable());
		perfilesParticipantesEClass.getESuperTypes().add(this.getProinsoCollection());
		perfilParticipanteEClass.getESuperTypes().add(this.getProinsoObject());
		perfilParticipanteEClass.getESuperTypes().add(this.getConDocumentacion());
		perfilParticipanteEClass.getESuperTypes().add(this.getReferenciable());
		practicaEClass.getESuperTypes().add(this.getProinsoObject());
		practicaEClass.getESuperTypes().add(this.getConDocumentacion());
		practicaEClass.getESuperTypes().add(this.getReferenciable());
		practicasEClass.getESuperTypes().add(this.getProinsoCollection());
		procesoEClass.getESuperTypes().add(this.getProinsoObject());
		procesoEClass.getESuperTypes().add(this.getConDocumentacion());
		procesoEClass.getESuperTypes().add(this.getReferenciable());
		procesoInterfazEClass.getESuperTypes().add(this.getProinsoObject());
		procesoInterfazEClass.getESuperTypes().add(this.getConDocumentacion());
		procesoInterfazEClass.getESuperTypes().add(this.getReferenciable());
		procesosEClass.getESuperTypes().add(this.getProinsoCollection());
		proinsoCollectionEClass.getESuperTypes().add(this.getProinsoObject());
		proinsoObjectEClass.getESuperTypes().add(this.getConModelClass());
		productoEClass.getESuperTypes().add(this.getUsable());
		productosEClass.getESuperTypes().add(this.getProinsoCollection());
		referenceRunEClass.getESuperTypes().add(this.getTextRun());
		repositorioEClass.getESuperTypes().add(this.getProinsoObject());
		runEClass.getESuperTypes().add(this.getProinsoObject());
		salidaEClass.getESuperTypes().add(this.getUsoFlujo());
		seccionEClass.getESuperTypes().add(this.getUsable());
		tareaEClass.getESuperTypes().add(this.getConDocumentacion());
		tareaEClass.getESuperTypes().add(this.getReferenciable());
		tecnicaEClass.getESuperTypes().add(this.getConDocumentacion());
		tecnicaEClass.getESuperTypes().add(this.getReferenciable());
		tecnicasEClass.getESuperTypes().add(this.getProinsoCollection());
		textRunEClass.getESuperTypes().add(this.getRun());
		usableEClass.getESuperTypes().add(this.getProinsoObject());
		usableEClass.getESuperTypes().add(this.getConDocumentacion());
		usableEClass.getESuperTypes().add(this.getReferenciable());
		usoFlujoEClass.getESuperTypes().add(this.getProinsoObject());
		usoPracticaEClass.getESuperTypes().add(this.getProinsoObject());
		usoTecnicaEClass.getESuperTypes().add(this.getProinsoObject());

		// Initialize classes and features; add operations and parameters
		initEClass(actividadEClass, Actividad.class, "Actividad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActividad_Proceso(), this.getProceso(), this.getProceso_Actividades(), "proceso", "", 1, 1, Actividad.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actividadAbstractaEClass, ActividadAbstracta.class, "ActividadAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActividadAbstracta_CodigoYNombre(), ecorePackage.getEString(), "codigoYNombre", null, 0, 1, ActividadAbstracta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividadAbstracta_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, ActividadAbstracta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividadAbstracta_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, ActividadAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividadAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, ActividadAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividadAbstracta_Tareas(), this.getTarea(), this.getTarea_Actividad(), "tareas", null, 0, -1, ActividadAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividadAbstracta_Predecesores(), this.getActividadAbstracta(), this.getActividadAbstracta_Sucesores(), "predecesores", null, 0, -1, ActividadAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividadAbstracta_Sucesores(), this.getActividadAbstracta(), this.getActividadAbstracta_Predecesores(), "sucesores", null, 0, -1, ActividadAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(actividadAbstractaEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		op = addEOperation(actividadAbstractaEClass, ecorePackage.getEBoolean(), "codigo_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		addEOperation(actividadAbstractaEClass, this.getActividadAbstracta(), "todosPredecesores", 0, -1);

		addEOperation(actividadAbstractaEClass, this.getActividadAbstracta(), "todosSucesores", 0, -1);

		op = addEOperation(actividadAbstractaEClass, ecorePackage.getEBoolean(), "predecesores_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		addEOperation(actividadAbstractaEClass, this.getActividadAbstracta(), "predecesores_candidates", 0, -1);

		op = addEOperation(actividadAbstractaEClass, ecorePackage.getEBoolean(), "sucesores_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		addEOperation(actividadAbstractaEClass, this.getActividadAbstracta(), "sucesores_candidates", 0, -1);

		initEClass(actividadInterfazEClass, ActividadInterfaz.class, "ActividadInterfaz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActividadInterfaz_Proceso(), this.getProcesoInterfaz(), this.getProcesoInterfaz_Actividades(), "proceso", null, 1, 1, ActividadInterfaz.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cargoEClass, Cargo.class, "Cargo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conDocumentacionEClass, ConDocumentacion.class, "ConDocumentacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConDocumentacion_Documentacion(), this.getDocumentacion(), this.getDocumentacion_Documentado(), "documentacion", null, 0, 1, ConDocumentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comiteEClass, Comite.class, "Comite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conModelClassEClass, ConModelClass.class, "ConModelClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConModelClass_ModelClass(), theEcorePackage.getEClass(), null, "modelClass", null, 1, 1, ConModelClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentacionEClass, Documentacion.class, "Documentacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentacion_Documentado(), this.getConDocumentacion(), this.getConDocumentacion_Documentacion(), "documentado", null, 0, 1, Documentacion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentacion_Parrafos(), this.getParrafo(), this.getParrafo_Documentacion(), "parrafos", null, 0, -1, Documentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entradaEClass, Entrada.class, "Entrada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntrada_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Entrada.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrada_ModoUso(), this.getModoUsoEntradaKind(), "modoUso", "", 0, 1, Entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrada_Guarda(), ecorePackage.getEString(), "guarda", "", 0, 1, Entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrada_Precondiciones(), ecorePackage.getEString(), "precondiciones", "", 0, 1, Entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntrada_Salidas(), this.getSalida(), this.getSalida_Entradas(), "salidas", null, 0, -1, Entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacesEClass, Interfaces.class, "Interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaces_Interfaces(), this.getInterfaz(), this.getInterfaz_Interfaces(), "interfaces", null, 0, -1, Interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaces_Metodologia(), this.getMetodologia(), this.getMetodologia_Interfaces(), "metodologia", null, 1, 1, Interfaces.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfazEClass, Interfaz.class, "Interfaz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaz_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaz_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaz_Interfaces(), this.getInterfaces(), this.getInterfaces_Interfaces(), "interfaces", null, 1, 1, Interfaz.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaz_Procesos(), this.getProcesoInterfaz(), this.getProcesoInterfaz_Interfaz(), "procesos", null, 0, -1, Interfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaz_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, Interfaz.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(interfazEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		op = addEOperation(interfazEClass, ecorePackage.getEBoolean(), "codigo_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(metodologiaEClass, Metodologia.class, "Metodologia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetodologia_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Procesos(), this.getProcesos(), this.getProcesos_Metodologia(), "procesos", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Interfaces(), this.getInterfaces(), this.getInterfaces_Metodologia(), "interfaces", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Productos(), this.getProductos(), this.getProductos_Metodologia(), "productos", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_PerfilesParticipantes(), this.getPerfilesParticipantes(), this.getPerfilesParticipantes_Metodologia(), "perfilesParticipantes", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Practicas(), this.getPracticas(), this.getPracticas_Metodologia(), "practicas", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Tecnicas(), this.getTecnicas(), this.getTecnicas_Metodologia(), "tecnicas", null, 0, 1, Metodologia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodologia_Repositorio(), this.getRepositorio(), this.getRepositorio_Metodologias(), "repositorio", "", 1, 1, Metodologia.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(metodologiaEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(parrafoEClass, Parrafo.class, "Parrafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParrafo_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Parrafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParrafo_Documentacion(), this.getDocumentacion(), this.getDocumentacion_Parrafos(), "documentacion", null, 0, 1, Parrafo.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParrafo_Runs(), this.getRun(), this.getRun_Parrafo(), "runs", null, 0, -1, Parrafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParrafo_Estilo(), ecorePackage.getEString(), "estilo", null, 0, 1, Parrafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participacionEClass, Participacion.class, "Participacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Participacion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParticipacion_Tarea(), this.getTarea(), this.getTarea_Participaciones(), "tarea", null, 1, 1, Participacion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipacion_PerfilParticipante(), this.getPerfilParticipante(), this.getPerfilParticipante_Participaciones(), "perfilParticipante", null, 1, 1, Participacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participanteEClass, Participante.class, "Participante", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipante_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Participante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipante_PerfilParticipante(), this.getPerfilParticipante(), this.getPerfilParticipante_Participantes(), "perfilParticipante", null, 1, 1, Participante.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(participanteEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(perfilesParticipantesEClass, PerfilesParticipantes.class, "PerfilesParticipantes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerfilesParticipantes_PerfilesParticipantes(), this.getPerfilParticipante(), this.getPerfilParticipante_PerfilesParticipantes(), "perfilesParticipantes", null, 0, -1, PerfilesParticipantes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfilesParticipantes_Metodologia(), this.getMetodologia(), this.getMetodologia_PerfilesParticipantes(), "metodologia", null, 1, 1, PerfilesParticipantes.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perfilParticipanteEClass, PerfilParticipante.class, "PerfilParticipante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerfilParticipante_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, PerfilParticipante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfilParticipante_Participaciones(), this.getParticipacion(), this.getParticipacion_PerfilParticipante(), "participaciones", null, 0, -1, PerfilParticipante.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfilParticipante_Participantes(), this.getParticipante(), this.getParticipante_PerfilParticipante(), "participantes", null, 0, -1, PerfilParticipante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfilParticipante_PerfilesParticipantes(), this.getPerfilesParticipantes(), this.getPerfilesParticipantes_PerfilesParticipantes(), "perfilesParticipantes", null, 1, 1, PerfilParticipante.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(perfilParticipanteEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(practicaEClass, Practica.class, "Practica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPractica_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Practica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPractica_Practicas(), this.getPracticas(), this.getPracticas_Practicas(), "practicas", null, 1, 1, Practica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPractica_UsosPractica(), this.getUsoPractica(), this.getUsoPractica_Practica(), "usosPractica", null, 0, -1, Practica.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(practicaEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(practicasEClass, Practicas.class, "Practicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPracticas_Practicas(), this.getPractica(), this.getPractica_Practicas(), "practicas", null, 0, -1, Practicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPracticas_Metodologia(), this.getMetodologia(), this.getMetodologia_Practicas(), "metodologia", null, 1, 1, Practicas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procesoEClass, Proceso.class, "Proceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProceso_CodigoYNombre(), ecorePackage.getEString(), "codigoYNombre", null, 0, 1, Proceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProceso_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, Proceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProceso_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Proceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProceso_Actividades(), this.getActividad(), this.getActividad_Proceso(), "actividades", null, 0, -1, Proceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProceso_Procesos(), this.getProcesos(), this.getProcesos_Procesos(), "procesos", "", 1, 1, Proceso.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProceso_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, Proceso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(procesoEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		op = addEOperation(procesoEClass, ecorePackage.getEBoolean(), "codigo_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(procesoInterfazEClass, ProcesoInterfaz.class, "ProcesoInterfaz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcesoInterfaz_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, ProcesoInterfaz.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcesoInterfaz_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, ProcesoInterfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcesoInterfaz_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, ProcesoInterfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcesoInterfaz_Interfaz(), this.getInterfaz(), this.getInterfaz_Procesos(), "interfaz", null, 1, 1, ProcesoInterfaz.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcesoInterfaz_Actividades(), this.getActividadInterfaz(), this.getActividadInterfaz_Proceso(), "actividades", null, 0, -1, ProcesoInterfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(procesoInterfazEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		op = addEOperation(procesoInterfazEClass, ecorePackage.getEBoolean(), "codigo_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(procesosEClass, Procesos.class, "Procesos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcesos_Procesos(), this.getProceso(), this.getProceso_Procesos(), "procesos", null, 0, -1, Procesos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcesos_Metodologia(), this.getMetodologia(), this.getMetodologia_Procesos(), "metodologia", "", 1, 1, Procesos.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proinsoCollectionEClass, ProinsoCollection.class, "ProinsoCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proinsoObjectEClass, ProinsoObject.class, "ProinsoObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducto_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_Metodologia(), this.getProductos(), this.getProductos_Productos(), "metodologia", null, 1, 1, Producto.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_EsExterno(), ecorePackage.getEBoolean(), "esExterno", "false", 1, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(productoEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(productosEClass, Productos.class, "Productos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductos_Productos(), this.getProducto(), this.getProducto_Metodologia(), "productos", null, 0, -1, Productos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductos_Metodologia(), this.getMetodologia(), this.getMetodologia_Productos(), "metodologia", "", 1, 1, Productos.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceRunEClass, ReferenceRun.class, "ReferenceRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceRun_Referenciado(), this.getReferenciable(), this.getReferenciable_Referencias(), "referenciado", null, 0, 1, ReferenceRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenciableEClass, Referenciable.class, "Referenciable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenciable_Referencias(), this.getReferenceRun(), this.getReferenceRun_Referenciado(), "referencias", null, 0, -1, Referenciable.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositorioEClass, Repositorio.class, "Repositorio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositorio_Metodologias(), this.getMetodologia(), this.getMetodologia_Repositorio(), "metodologias", null, 0, -1, Repositorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositorio_ModelPackage(), theEcorePackage.getEPackage(), null, "modelPackage", null, 1, 1, Repositorio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(runEClass, Run.class, "Run", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRun_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Parrafo(), this.getParrafo(), this.getParrafo_Runs(), "parrafo", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salidaEClass, Salida.class, "Salida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalida_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Salida.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalida_ModoUso(), this.getModoUsoSalidaKind(), "modoUso", "Actualizacion", 0, 1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalida_Guarda(), ecorePackage.getEString(), "guarda", "", 0, 1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalida_Postcondiciones(), ecorePackage.getEString(), "postcondiciones", "", 0, 1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalida_Forzado(), ecorePackage.getEBoolean(), "forzado", "false", 0, 1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalida_Entradas(), this.getEntrada(), this.getEntrada_Salidas(), "entradas", null, 0, -1, Salida.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seccionEClass, Seccion.class, "Seccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeccion_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Seccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeccion_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Seccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeccion_Contenedor(), this.getUsable(), this.getUsable_Contenido(), "contenedor", null, 1, 1, Seccion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(seccionEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(tareaEClass, Tarea.class, "Tarea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarea_CodigoYNombre(), ecorePackage.getEString(), "codigoYNombre", null, 0, 1, Tarea.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_CodigoCompleto(), ecorePackage.getEString(), "codigoCompleto", null, 0, 1, Tarea.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Actividad(), this.getActividadAbstracta(), this.getActividadAbstracta_Tareas(), "actividad", null, 1, 1, Tarea.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Flujos(), this.getUsoFlujo(), this.getUsoFlujo_Tarea(), "flujos", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Participaciones(), this.getParticipacion(), this.getParticipacion_Tarea(), "participaciones", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_UsoPracticas(), this.getUsoPractica(), this.getUsoPractica_Tarea(), "usoPracticas", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_UsoTecnicas(), this.getUsoTecnica(), this.getUsoTecnica_Tarea(), "usoTecnicas", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tareaEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		op = addEOperation(tareaEClass, ecorePackage.getEBoolean(), "codigo_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(tecnicaEClass, Tecnica.class, "Tecnica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTecnica_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Tecnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTecnica_Tecnicas(), this.getTecnicas(), this.getTecnicas_Tecnicas(), "tecnicas", null, 1, 1, Tecnica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTecnica_UsosTecnica(), this.getUsoTecnica(), this.getUsoTecnica_Tecnica(), "usosTecnica", null, 0, -1, Tecnica.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tecnicaEClass, ecorePackage.getEBoolean(), "nombre_validar", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "theDiagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "theContext", 0, 1);

		initEClass(tecnicasEClass, Tecnicas.class, "Tecnicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTecnicas_Tecnicas(), this.getTecnica(), this.getTecnica_Tecnicas(), "tecnicas", null, 0, -1, Tecnicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTecnicas_Metodologia(), this.getMetodologia(), this.getMetodologia_Tecnicas(), "metodologia", null, 1, 1, Tecnicas.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textRunEClass, TextRun.class, "TextRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextRun_Estilo(), ecorePackage.getEString(), "estilo", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usableEClass, Usable.class, "Usable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsable_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Usable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsable_Contenido(), this.getSeccion(), this.getSeccion_Contenedor(), "contenido", null, 0, -1, Usable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsable_Usos(), this.getUsoFlujo(), this.getUsoFlujo_Producto(), "usos", null, 0, -1, Usable.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usoFlujoEClass, UsoFlujo.class, "UsoFlujo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsoFlujo_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, UsoFlujo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsoFlujo_Producto(), this.getUsable(), this.getUsable_Usos(), "producto", null, 1, 1, UsoFlujo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoFlujo_Tarea(), this.getTarea(), this.getTarea_Flujos(), "tarea", null, 1, 1, UsoFlujo.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usoPracticaEClass, UsoPractica.class, "UsoPractica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsoPractica_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, UsoPractica.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsoPractica_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, UsoPractica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoPractica_Tarea(), this.getTarea(), this.getTarea_UsoPracticas(), "tarea", null, 1, 1, UsoPractica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoPractica_Practica(), this.getPractica(), this.getPractica_UsosPractica(), "practica", null, 1, 1, UsoPractica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usoTecnicaEClass, UsoTecnica.class, "UsoTecnica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsoTecnica_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, UsoTecnica.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsoTecnica_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, UsoTecnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoTecnica_Tarea(), this.getTarea(), this.getTarea_UsoTecnicas(), "tarea", null, 1, 1, UsoTecnica.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsoTecnica_Tecnica(), this.getTecnica(), this.getTecnica_UsosTecnica(), "tecnica", null, 1, 1, UsoTecnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modoUsoEntradaKindEEnum, ModoUsoEntradaKind.class, "ModoUsoEntradaKind");
		addEEnumLiteral(modoUsoEntradaKindEEnum, ModoUsoEntradaKind.CONSULTA_LITERAL);
		addEEnumLiteral(modoUsoEntradaKindEEnum, ModoUsoEntradaKind.VALIDACION_LITERAL);
		addEEnumLiteral(modoUsoEntradaKindEEnum, ModoUsoEntradaKind.SUSTITUCION_LITERAL);
		addEEnumLiteral(modoUsoEntradaKindEEnum, ModoUsoEntradaKind.ELIMINACION_LITERAL);

		initEEnum(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.class, "ModoUsoSalidaKind");
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.CREACION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.CONSULTA_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.VALIDACION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.APROBACION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.FIRMA_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.ACTUALIZACION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.SUSTITUCION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.CANCELACION_LITERAL);
		addEEnumLiteral(modoUsoSalidaKindEEnum, ModoUsoSalidaKind.ELIMINACION_LITERAL);

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
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "codigo.size() > 0"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "(if predecesores->isEmpty() then predecesores else predecesores.todosPrecedesores() endif)->union(predecesores)"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "sucesores.todosSucesores->union(sucesores)"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "invariant", "predecesores_candidates()->includesAll( predecesores)"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.actividades else (self.oclAsType(ActividadInterfaz).proceso.actividades) endif - todosPredecesores()"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "invariant", "sucesores_candidates()->includesAll( sucesores)"
		   });		
		addAnnotation
		  ((EOperation)actividadAbstractaEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.actividades else (self.oclAsType(ActividadInterfaz).proceso.actividades) endif - todosSucesores()"
		   });		
		addAnnotation
		  (getActividadAbstracta_CodigoYNombre(), 
		   source, 
		   new String[] {
			 "derive", "codigoCompleto.concat(\' \').concat( if nombre->isEmpty() then \'~\' else nombre endif)"
		   });		
		addAnnotation
		  (getActividadAbstracta_CodigoCompleto(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.codigoCompleto.concat(\' \').concat( if codigo->isEmpty() then \'?\' else codigo endif) else self.oclAsType(ActividadInterfaz).proceso.codigoCompleto.concat(\' \').concat( if codigo->isEmpty() then \'?\' else codigo endif) endif"
		   });		
		addAnnotation
		  (getActividadAbstracta_Predecesores(), 
		   source, 
		   new String[] {
			 "candidates", "predecesores_candidates()"
		   });		
		addAnnotation
		  (getActividadAbstracta_Sucesores(), 
		   source, 
		   new String[] {
			 "candidates", "sucesores_candidates()"
		   });		
		addAnnotation
		  (getEntrada_Nombre(), 
		   source, 
		   new String[] {
			 "derive", "(if guarda.size() < 1 then \'\' else \' condicional\' endif).concat((\' de \'.concat(if producto->isEmpty() then \'?\' else (if producto.oclIsTypeOf( Producto) then (if producto.oclAsType( Producto).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else (if producto.oclIsTypeOf( Seccion) then (if producto.oclAsType( Seccion).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else \'?\' endif) endif) endif)).concat( \' en \').concat( tarea.codigoYNombre )).concat(if guarda.size() < 1  then \'\' else \' si \'.concat(guarda) endif)"
		   });		
		addAnnotation
		  (getEntrada_Salidas(), 
		   source, 
		   new String[] {
			 "candidates", "(if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.procesos.procesos.actividades.tareas.flujos else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.procesos.procesos.actividades.tareas.flujos) endif)->select( aFlujo | aFlujo.oclIsTypeOf( Salida))"
		   });		
		addAnnotation
		  ((EOperation)interfazEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)interfazEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "codigo.size() > 0"
		   });		
		addAnnotation
		  (getInterfaz_CodigoCompleto(), 
		   source, 
		   new String[] {
			 "derive", " if codigo->isEmpty() then \'?\' else codigo endif"
		   });		
		addAnnotation
		  ((EOperation)metodologiaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre->notEmpty()"
		   });		
		addAnnotation
		  (getParticipacion_Nombre(), 
		   source, 
		   new String[] {
			 "derive", "(\'de \').concat(if perfilParticipante->isEmpty() then \'?\' else (if perfilParticipante.nombre.size() = 0 then \'~\' else perfilParticipante.nombre endif) endif).concat(\' en \').concat(tarea.codigoYNombre)"
		   });		
		addAnnotation
		  (getParticipacion_PerfilParticipante(), 
		   source, 
		   new String[] {
			 "candidates", "if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.perfilesParticipantes.perfilesParticipantes else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.perfilesParticipantes.perfilesParticipantes) endif"
		   });		
		addAnnotation
		  ((EOperation)participanteEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)perfilParticipanteEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)practicaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)procesoEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)procesoEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "codigo.size() > 0"
		   });		
		addAnnotation
		  (getProceso_CodigoYNombre(), 
		   source, 
		   new String[] {
			 "derive", "(if codigo.size() = 0  then \'?\' else codigo endif).concat(\' \').concat( if nombre.size() = 0  then \'~\' else nombre endif)"
		   });		
		addAnnotation
		  (getProceso_CodigoCompleto(), 
		   source, 
		   new String[] {
			 "derive", "if codigo->isEmpty() then \'?\' else codigo endif"
		   });		
		addAnnotation
		  ((EOperation)procesoInterfazEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)procesoInterfazEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "codigo.size() > 0"
		   });		
		addAnnotation
		  (getProcesoInterfaz_CodigoCompleto(), 
		   source, 
		   new String[] {
			 "derive", "interfaz.codigoCompleto.concat(\'::\').concat( if codigo.size() = 0 then \'?\' else codigo endif)"
		   });		
		addAnnotation
		  ((EOperation)productoEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  (getSalida_Nombre(), 
		   source, 
		   new String[] {
			 "derive", "(if guarda.size() < 1 then \'\' else \' condicional\' endif).concat((\' de \'.concat(if producto->isEmpty() then \'?\' else (if producto.oclIsTypeOf( Producto) then (if producto.oclAsType( Producto).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else (if producto.oclIsTypeOf( Seccion) then (if producto.oclAsType( Seccion).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else \'?\' endif) endif) endif)).concat( \' en \').concat( tarea.codigoYNombre )).concat(if guarda.size() < 1  then \'\' else \' si \'.concat(guarda) endif)"
		   });		
		addAnnotation
		  ((EOperation)seccionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)tareaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  ((EOperation)tareaEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "codigo.size() > 0"
		   });		
		addAnnotation
		  (getTarea_CodigoYNombre(), 
		   source, 
		   new String[] {
			 "derive", "codigoCompleto.concat(\' \').concat( if nombre->isEmpty() or nombre.size() = 0  then \'~\' else nombre endif)"
		   });		
		addAnnotation
		  (getTarea_CodigoCompleto(), 
		   source, 
		   new String[] {
			 "derive", "(if actividad->isEmpty() then \'?\' else actividad.codigoCompleto endif).concat(\'.\').concat( if codigo->isEmpty() or codigo.size() = 0 then \'?\' else codigo endif)"
		   });		
		addAnnotation
		  ((EOperation)tecnicaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "nombre.size() > 0 "
		   });		
		addAnnotation
		  (getUsable_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsTypeOf( Producto) then \r\n( if self.oclAsType( Producto).nombre->isEmpty() or self.oclAsType( Producto).nombre.size() < 0 then \'?\' else self.oclAsType( Producto).nombre endif)\r\nelse\r\n( if self.oclAsType( Seccion).nombre->isEmpty() or self.oclAsType( Seccion).nombre.size() < 0 then \'?\' else self.oclAsType( Seccion).nombre endif).concat( \' en \').concat( \r\n if self.oclAsType( Seccion).contenedor->isEmpty() then \'?\' else self.oclAsType( Seccion).contenedor.etiqueta endif\r\n)\r\nendif\r\n"
		   });		
		addAnnotation
		  (getUsoFlujo_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if producto->isEmpty() then \'?\' else producto.etiqueta endif).concat( \' en tarea \').concat(\r\nif tarea->isEmpty() then \'?\' else tarea.codigoYNombre endif\r\n)"
		   });		
		addAnnotation
		  (getUsoFlujo_Producto(), 
		   source, 
		   new String[] {
			 "candidates", "if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.productos.productos else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.productos.productos) endif"
		   });		
		addAnnotation
		  (getUsoPractica_Nombre(), 
		   source, 
		   new String[] {
			 "derive", "(if practica->isEmpty() then \'~\' else (if practica.nombre.size() = 0 then \'~\' else practica.nombre endif) endif).concat( \' por \').concat(tarea.codigoYNombre)"
		   });		
		addAnnotation
		  (getUsoPractica_Practica(), 
		   source, 
		   new String[] {
			 "candidates", "if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.practicas.practicas else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.practicas.practicas) endif"
		   });		
		addAnnotation
		  (getUsoTecnica_Nombre(), 
		   source, 
		   new String[] {
			 "derive", "( if tecnica->isEmpty() then \'~\' else (if tecnica.nombre.size() = 0 then \'~\' else tecnica.nombre endif)endif).concat( \' por \').concat(tarea.codigoYNombre)"
		   });		
		addAnnotation
		  (getUsoTecnica_Tecnica(), 
		   source, 
		   new String[] {
			 "candidates", "if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.tecnicas.tecnicas else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.tecnicas.tecnicas) endif"
		   });
	}

} //ProinsoPackageImpl
