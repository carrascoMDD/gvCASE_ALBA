/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.*;

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
public class ProinsoFactoryImpl extends EFactoryImpl implements ProinsoFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProinsoFactory init() {
		try {
			ProinsoFactory theProinsoFactory = (ProinsoFactory)EPackage.Registry.INSTANCE.getEFactory("http:///es/gva/cit/gvmetrica/proinso.ecore"); 
			if (theProinsoFactory != null) {
				return theProinsoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProinsoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProinsoPackage.ACTIVIDAD: return createActividad();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA: return createActividadAbstracta();
			case ProinsoPackage.ACTIVIDAD_INTERFAZ: return createActividadInterfaz();
			case ProinsoPackage.CARGO: return createCargo();
			case ProinsoPackage.COMITE: return createComite();
			case ProinsoPackage.DOCUMENTACION: return createDocumentacion();
			case ProinsoPackage.ENTRADA: return createEntrada();
			case ProinsoPackage.INTERFACES: return createInterfaces();
			case ProinsoPackage.INTERFAZ: return createInterfaz();
			case ProinsoPackage.METODOLOGIA: return createMetodologia();
			case ProinsoPackage.PARRAFO: return createParrafo();
			case ProinsoPackage.PARTICIPACION: return createParticipacion();
			case ProinsoPackage.PERFILES_PARTICIPANTES: return createPerfilesParticipantes();
			case ProinsoPackage.PERFIL_PARTICIPANTE: return createPerfilParticipante();
			case ProinsoPackage.PRACTICA: return createPractica();
			case ProinsoPackage.PRACTICAS: return createPracticas();
			case ProinsoPackage.PROCESO: return createProceso();
			case ProinsoPackage.PROCESO_INTERFAZ: return createProcesoInterfaz();
			case ProinsoPackage.PROCESOS: return createProcesos();
			case ProinsoPackage.PRODUCTO: return createProducto();
			case ProinsoPackage.PRODUCTOS: return createProductos();
			case ProinsoPackage.REFERENCE_RUN: return createReferenceRun();
			case ProinsoPackage.REPOSITORIO: return createRepositorio();
			case ProinsoPackage.SALIDA: return createSalida();
			case ProinsoPackage.SECCION: return createSeccion();
			case ProinsoPackage.TAREA: return createTarea();
			case ProinsoPackage.TECNICA: return createTecnica();
			case ProinsoPackage.TECNICAS: return createTecnicas();
			case ProinsoPackage.TEXT_RUN: return createTextRun();
			case ProinsoPackage.USO_PRACTICA: return createUsoPractica();
			case ProinsoPackage.USO_TECNICA: return createUsoTecnica();
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
			case ProinsoPackage.MODO_USO_ENTRADA_KIND:
				return createModoUsoEntradaKindFromString(eDataType, initialValue);
			case ProinsoPackage.MODO_USO_SALIDA_KIND:
				return createModoUsoSalidaKindFromString(eDataType, initialValue);
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
			case ProinsoPackage.MODO_USO_ENTRADA_KIND:
				return convertModoUsoEntradaKindToString(eDataType, instanceValue);
			case ProinsoPackage.MODO_USO_SALIDA_KIND:
				return convertModoUsoSalidaKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actividad createActividad() {
		ActividadImpl actividad = new ActividadImpl();
		return actividad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadAbstracta createActividadAbstracta() {
		ActividadAbstractaImpl actividadAbstracta = new ActividadAbstractaImpl();
		return actividadAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadInterfaz createActividadInterfaz() {
		ActividadInterfazImpl actividadInterfaz = new ActividadInterfazImpl();
		return actividadInterfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cargo createCargo() {
		CargoImpl cargo = new CargoImpl();
		return cargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comite createComite() {
		ComiteImpl comite = new ComiteImpl();
		return comite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentacion createDocumentacion() {
		DocumentacionImpl documentacion = new DocumentacionImpl();
		return documentacion;
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
	public Interfaces createInterfaces() {
		InterfacesImpl interfaces = new InterfacesImpl();
		return interfaces;
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
	public Metodologia createMetodologia() {
		MetodologiaImpl metodologia = new MetodologiaImpl();
		return metodologia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parrafo createParrafo() {
		ParrafoImpl parrafo = new ParrafoImpl();
		return parrafo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participacion createParticipacion() {
		ParticipacionImpl participacion = new ParticipacionImpl();
		return participacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilesParticipantes createPerfilesParticipantes() {
		PerfilesParticipantesImpl perfilesParticipantes = new PerfilesParticipantesImpl();
		return perfilesParticipantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilParticipante createPerfilParticipante() {
		PerfilParticipanteImpl perfilParticipante = new PerfilParticipanteImpl();
		return perfilParticipante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practica createPractica() {
		PracticaImpl practica = new PracticaImpl();
		return practica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practicas createPracticas() {
		PracticasImpl practicas = new PracticasImpl();
		return practicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proceso createProceso() {
		ProcesoImpl proceso = new ProcesoImpl();
		return proceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesoInterfaz createProcesoInterfaz() {
		ProcesoInterfazImpl procesoInterfaz = new ProcesoInterfazImpl();
		return procesoInterfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procesos createProcesos() {
		ProcesosImpl procesos = new ProcesosImpl();
		return procesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productos createProductos() {
		ProductosImpl productos = new ProductosImpl();
		return productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRun createReferenceRun() {
		ReferenceRunImpl referenceRun = new ReferenceRunImpl();
		return referenceRun;
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
	public Salida createSalida() {
		SalidaImpl salida = new SalidaImpl();
		return salida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seccion createSeccion() {
		SeccionImpl seccion = new SeccionImpl();
		return seccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea createTarea() {
		TareaImpl tarea = new TareaImpl();
		return tarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnica createTecnica() {
		TecnicaImpl tecnica = new TecnicaImpl();
		return tecnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnicas createTecnicas() {
		TecnicasImpl tecnicas = new TecnicasImpl();
		return tecnicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRun createTextRun() {
		TextRunImpl textRun = new TextRunImpl();
		return textRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoPractica createUsoPractica() {
		UsoPracticaImpl usoPractica = new UsoPracticaImpl();
		return usoPractica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsoTecnica createUsoTecnica() {
		UsoTecnicaImpl usoTecnica = new UsoTecnicaImpl();
		return usoTecnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoUsoEntradaKind createModoUsoEntradaKindFromString(EDataType eDataType, String initialValue) {
		ModoUsoEntradaKind result = ModoUsoEntradaKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModoUsoEntradaKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoUsoSalidaKind createModoUsoSalidaKindFromString(EDataType eDataType, String initialValue) {
		ModoUsoSalidaKind result = ModoUsoSalidaKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModoUsoSalidaKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoPackage getProinsoPackage() {
		return (ProinsoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ProinsoPackage getPackage() {
		return ProinsoPackage.eINSTANCE;
	}

} //ProinsoFactoryImpl
