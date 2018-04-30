/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.util;

import es.gva.cit.gvmetrica.proinso.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage
 * @generated
 */
public class ProinsoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProinsoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProinsoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProinsoSwitch modelSwitch =
		new ProinsoSwitch() {
			public Object caseActividad(Actividad object) {
				return createActividadAdapter();
			}
			public Object caseActividadAbstracta(ActividadAbstracta object) {
				return createActividadAbstractaAdapter();
			}
			public Object caseActividadInterfaz(ActividadInterfaz object) {
				return createActividadInterfazAdapter();
			}
			public Object caseCargo(Cargo object) {
				return createCargoAdapter();
			}
			public Object caseConDocumentacion(ConDocumentacion object) {
				return createConDocumentacionAdapter();
			}
			public Object caseComite(Comite object) {
				return createComiteAdapter();
			}
			public Object caseConModelClass(ConModelClass object) {
				return createConModelClassAdapter();
			}
			public Object caseDocumentacion(Documentacion object) {
				return createDocumentacionAdapter();
			}
			public Object caseEntrada(Entrada object) {
				return createEntradaAdapter();
			}
			public Object caseInterfaces(Interfaces object) {
				return createInterfacesAdapter();
			}
			public Object caseInterfaz(Interfaz object) {
				return createInterfazAdapter();
			}
			public Object caseMetodologia(Metodologia object) {
				return createMetodologiaAdapter();
			}
			public Object caseParrafo(Parrafo object) {
				return createParrafoAdapter();
			}
			public Object caseParticipacion(Participacion object) {
				return createParticipacionAdapter();
			}
			public Object caseParticipante(Participante object) {
				return createParticipanteAdapter();
			}
			public Object casePerfilesParticipantes(PerfilesParticipantes object) {
				return createPerfilesParticipantesAdapter();
			}
			public Object casePerfilParticipante(PerfilParticipante object) {
				return createPerfilParticipanteAdapter();
			}
			public Object casePractica(Practica object) {
				return createPracticaAdapter();
			}
			public Object casePracticas(Practicas object) {
				return createPracticasAdapter();
			}
			public Object caseProceso(Proceso object) {
				return createProcesoAdapter();
			}
			public Object caseProcesoInterfaz(ProcesoInterfaz object) {
				return createProcesoInterfazAdapter();
			}
			public Object caseProcesos(Procesos object) {
				return createProcesosAdapter();
			}
			public Object caseProinsoCollection(ProinsoCollection object) {
				return createProinsoCollectionAdapter();
			}
			public Object caseProinsoObject(ProinsoObject object) {
				return createProinsoObjectAdapter();
			}
			public Object caseProducto(Producto object) {
				return createProductoAdapter();
			}
			public Object caseProductos(Productos object) {
				return createProductosAdapter();
			}
			public Object caseReferenceRun(ReferenceRun object) {
				return createReferenceRunAdapter();
			}
			public Object caseReferenciable(Referenciable object) {
				return createReferenciableAdapter();
			}
			public Object caseRepositorio(Repositorio object) {
				return createRepositorioAdapter();
			}
			public Object caseRun(Run object) {
				return createRunAdapter();
			}
			public Object caseSalida(Salida object) {
				return createSalidaAdapter();
			}
			public Object caseSeccion(Seccion object) {
				return createSeccionAdapter();
			}
			public Object caseTarea(Tarea object) {
				return createTareaAdapter();
			}
			public Object caseTecnica(Tecnica object) {
				return createTecnicaAdapter();
			}
			public Object caseTecnicas(Tecnicas object) {
				return createTecnicasAdapter();
			}
			public Object caseTextRun(TextRun object) {
				return createTextRunAdapter();
			}
			public Object caseUsable(Usable object) {
				return createUsableAdapter();
			}
			public Object caseUsoFlujo(UsoFlujo object) {
				return createUsoFlujoAdapter();
			}
			public Object caseUsoPractica(UsoPractica object) {
				return createUsoPracticaAdapter();
			}
			public Object caseUsoTecnica(UsoTecnica object) {
				return createUsoTecnicaAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Actividad
	 * @generated
	 */
	public Adapter createActividadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta <em>Actividad Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta
	 * @generated
	 */
	public Adapter createActividadAbstractaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ActividadInterfaz <em>Actividad Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadInterfaz
	 * @generated
	 */
	public Adapter createActividadInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Cargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Cargo
	 * @generated
	 */
	public Adapter createCargoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion <em>Con Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ConDocumentacion
	 * @generated
	 */
	public Adapter createConDocumentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Comite <em>Comite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Comite
	 * @generated
	 */
	public Adapter createComiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Documentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion
	 * @generated
	 */
	public Adapter createDocumentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada
	 * @generated
	 */
	public Adapter createEntradaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Interfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces
	 * @generated
	 */
	public Adapter createInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz
	 * @generated
	 */
	public Adapter createInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Metodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia
	 * @generated
	 */
	public Adapter createMetodologiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Parrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo
	 * @generated
	 */
	public Adapter createParrafoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Participacion <em>Participacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Participacion
	 * @generated
	 */
	public Adapter createParticipacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Participante <em>Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Participante
	 * @generated
	 */
	public Adapter createParticipanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes
	 * @generated
	 */
	public Adapter createPerfilesParticipantesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante
	 * @generated
	 */
	public Adapter createPerfilParticipanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Practica <em>Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Practica
	 * @generated
	 */
	public Adapter createPracticaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Practicas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Practicas
	 * @generated
	 */
	public Adapter createPracticasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso
	 * @generated
	 */
	public Adapter createProcesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz <em>Proceso Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz
	 * @generated
	 */
	public Adapter createProcesoInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Procesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Procesos
	 * @generated
	 */
	public Adapter createProcesosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ProinsoCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoCollection
	 * @generated
	 */
	public Adapter createProinsoCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ProinsoObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoObject
	 * @generated
	 */
	public Adapter createProinsoObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Producto
	 * @generated
	 */
	public Adapter createProductoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Productos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Productos
	 * @generated
	 */
	public Adapter createProductosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ReferenceRun <em>Reference Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ReferenceRun
	 * @generated
	 */
	public Adapter createReferenceRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Referenciable <em>Referenciable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Referenciable
	 * @generated
	 */
	public Adapter createReferenciableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Repositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Repositorio
	 * @generated
	 */
	public Adapter createRepositorioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Salida
	 * @generated
	 */
	public Adapter createSalidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Seccion <em>Seccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Seccion
	 * @generated
	 */
	public Adapter createSeccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Tecnica <em>Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica
	 * @generated
	 */
	public Adapter createTecnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Tecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas
	 * @generated
	 */
	public Adapter createTecnicasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.TextRun <em>Text Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.TextRun
	 * @generated
	 */
	public Adapter createTextRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.Usable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.Usable
	 * @generated
	 */
	public Adapter createUsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo <em>Uso Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo
	 * @generated
	 */
	public Adapter createUsoFlujoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.UsoPractica <em>Uso Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica
	 * @generated
	 */
	public Adapter createUsoPracticaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica <em>Uso Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica
	 * @generated
	 */
	public Adapter createUsoTecnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.proinso.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.proinso.ConModelClass
	 * @generated
	 */
	public Adapter createConModelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProinsoAdapterFactory
