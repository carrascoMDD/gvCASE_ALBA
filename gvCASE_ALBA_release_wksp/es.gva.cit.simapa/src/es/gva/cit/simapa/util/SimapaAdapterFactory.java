/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.util;

import es.gva.cit.simapa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage
 * @generated
 */
public class SimapaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimapaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimapaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimapaPackage.eINSTANCE;
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
	protected SimapaSwitch modelSwitch =
		new SimapaSwitch() {
			public Object caseAplicacion(Aplicacion object) {
				return createAplicacionAdapter();
			}
			public Object caseAplicaciones(Aplicaciones object) {
				return createAplicacionesAdapter();
			}
			public Object caseClaseDocumento(ClaseDocumento object) {
				return createClaseDocumentoAdapter();
			}
			public Object caseClasesDocumento(ClasesDocumento object) {
				return createClasesDocumentoAdapter();
			}
			public Object caseConModelClass(ConModelClass object) {
				return createConModelClassAdapter();
			}
			public Object caseContenedorEstructuraFuncional(ContenedorEstructuraFuncional object) {
				return createContenedorEstructuraFuncionalAdapter();
			}
			public Object caseContenedorUnidadExterna(ContenedorUnidadExterna object) {
				return createContenedorUnidadExternaAdapter();
			}
			public Object caseContenedorUnidadOrganica(ContenedorUnidadOrganica object) {
				return createContenedorUnidadOrganicaAdapter();
			}
			public Object caseControlProcedimiento(ControlProcedimiento object) {
				return createControlProcedimientoAdapter();
			}
			public Object caseConvocatoria(Convocatoria object) {
				return createConvocatoriaAdapter();
			}
			public Object caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			public Object caseDocumento(Documento object) {
				return createDocumentoAdapter();
			}
			public Object caseDocumentos(Documentos object) {
				return createDocumentosAdapter();
			}
			public Object caseDocumentoFinal(DocumentoFinal object) {
				return createDocumentoFinalAdapter();
			}
			public Object caseDocumentoFinalInterno(DocumentoFinalInterno object) {
				return createDocumentoFinalInternoAdapter();
			}
			public Object caseEntradaDocumentoFinal(EntradaDocumentoFinal object) {
				return createEntradaDocumentoFinalAdapter();
			}
			public Object caseEstructuraFuncional(EstructuraFuncional object) {
				return createEstructuraFuncionalAdapter();
			}
			public Object caseEstructurasFuncionales(EstructurasFuncionales object) {
				return createEstructurasFuncionalesAdapter();
			}
			public Object caseFichaArchivistica(FichaArchivistica object) {
				return createFichaArchivisticaAdapter();
			}
			public Object caseFinProceso(FinProceso object) {
				return createFinProcesoAdapter();
			}
			public Object caseFlujo(Flujo object) {
				return createFlujoAdapter();
			}
			public Object caseGlosario(Glosario object) {
				return createGlosarioAdapter();
			}
			public Object caseNormativasYLegislaciones(NormativasYLegislaciones object) {
				return createNormativasYLegislacionesAdapter();
			}
			public Object caseNormativaYLegislacion(NormativaYLegislacion object) {
				return createNormativaYLegislacionAdapter();
			}
			public Object caseOperacion(Operacion object) {
				return createOperacionAdapter();
			}
			public Object caseOperaciones(Operaciones object) {
				return createOperacionesAdapter();
			}
			public Object caseProcedimiento(Procedimiento object) {
				return createProcedimientoAdapter();
			}
			public Object caseProcedimientos(Procedimientos object) {
				return createProcedimientosAdapter();
			}
			public Object caseRepositorio(Repositorio object) {
				return createRepositorioAdapter();
			}
			public Object caseSalidaDocumentoFinal(SalidaDocumentoFinal object) {
				return createSalidaDocumentoFinalAdapter();
			}
			public Object caseSimapaCollection(SimapaCollection object) {
				return createSimapaCollectionAdapter();
			}
			public Object caseSimapaObject(SimapaObject object) {
				return createSimapaObjectAdapter();
			}
			public Object caseSubprocedimiento(Subprocedimiento object) {
				return createSubprocedimientoAdapter();
			}
			public Object caseTerminoGlosario(TerminoGlosario object) {
				return createTerminoGlosarioAdapter();
			}
			public Object caseTramitacionProcedimiento(TramitacionProcedimiento object) {
				return createTramitacionProcedimientoAdapter();
			}
			public Object caseUnidad(Unidad object) {
				return createUnidadAdapter();
			}
			public Object caseUnidadesOrganicas(UnidadesOrganicas object) {
				return createUnidadesOrganicasAdapter();
			}
			public Object caseUnidadOrganica(UnidadOrganica object) {
				return createUnidadOrganicaAdapter();
			}
			public Object caseUnidadesExternas(UnidadesExternas object) {
				return createUnidadesExternasAdapter();
			}
			public Object caseUnidadExterna(UnidadExterna object) {
				return createUnidadExternaAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Repositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Repositorio
	 * @generated
	 */
	public Adapter createRepositorioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.NormativasYLegislaciones <em>Normativas YLegislaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.NormativasYLegislaciones
	 * @generated
	 */
	public Adapter createNormativasYLegislacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.NormativaYLegislacion <em>Normativa YLegislacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.NormativaYLegislacion
	 * @generated
	 */
	public Adapter createNormativaYLegislacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Unidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Unidad
	 * @generated
	 */
	public Adapter createUnidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ContenedorUnidadOrganica <em>Contenedor Unidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ContenedorUnidadOrganica
	 * @generated
	 */
	public Adapter createContenedorUnidadOrganicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.UnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.UnidadesOrganicas
	 * @generated
	 */
	public Adapter createUnidadesOrganicasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.UnidadOrganica <em>Unidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.UnidadOrganica
	 * @generated
	 */
	public Adapter createUnidadOrganicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ContenedorUnidadExterna <em>Contenedor Unidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ContenedorUnidadExterna
	 * @generated
	 */
	public Adapter createContenedorUnidadExternaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.UnidadesExternas <em>Unidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.UnidadesExternas
	 * @generated
	 */
	public Adapter createUnidadesExternasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.UnidadExterna <em>Unidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.UnidadExterna
	 * @generated
	 */
	public Adapter createUnidadExternaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ContenedorEstructuraFuncional <em>Contenedor Estructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ContenedorEstructuraFuncional
	 * @generated
	 */
	public Adapter createContenedorEstructuraFuncionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.EstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.EstructurasFuncionales
	 * @generated
	 */
	public Adapter createEstructurasFuncionalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.EstructuraFuncional <em>Estructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.EstructuraFuncional
	 * @generated
	 */
	public Adapter createEstructuraFuncionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ClasesDocumento
	 * @generated
	 */
	public Adapter createClasesDocumentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ConModelClass
	 * @generated
	 */
	public Adapter createConModelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ClaseDocumento <em>Clase Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ClaseDocumento
	 * @generated
	 */
	public Adapter createClaseDocumentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Documentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Documentos
	 * @generated
	 */
	public Adapter createDocumentosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Documento
	 * @generated
	 */
	public Adapter createDocumentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Aplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Aplicaciones
	 * @generated
	 */
	public Adapter createAplicacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Aplicacion
	 * @generated
	 */
	public Adapter createAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Glosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Glosario
	 * @generated
	 */
	public Adapter createGlosarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.TerminoGlosario <em>Termino Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.TerminoGlosario
	 * @generated
	 */
	public Adapter createTerminoGlosarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Procedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Procedimientos
	 * @generated
	 */
	public Adapter createProcedimientosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Procedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Procedimiento
	 * @generated
	 */
	public Adapter createProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.FichaArchivistica <em>Ficha Archivistica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.FichaArchivistica
	 * @generated
	 */
	public Adapter createFichaArchivisticaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Convocatoria <em>Convocatoria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Convocatoria
	 * @generated
	 */
	public Adapter createConvocatoriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.ControlProcedimiento <em>Control Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.ControlProcedimiento
	 * @generated
	 */
	public Adapter createControlProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.TramitacionProcedimiento <em>Tramitacion Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento
	 * @generated
	 */
	public Adapter createTramitacionProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Operaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Operaciones
	 * @generated
	 */
	public Adapter createOperacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Operacion
	 * @generated
	 */
	public Adapter createOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Subprocedimiento <em>Subprocedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Subprocedimiento
	 * @generated
	 */
	public Adapter createSubprocedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.DocumentoFinal <em>Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.DocumentoFinal
	 * @generated
	 */
	public Adapter createDocumentoFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.DocumentoFinalInterno <em>Documento Final Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.DocumentoFinalInterno
	 * @generated
	 */
	public Adapter createDocumentoFinalInternoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.EntradaDocumentoFinal <em>Entrada Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.EntradaDocumentoFinal
	 * @generated
	 */
	public Adapter createEntradaDocumentoFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.SalidaDocumentoFinal <em>Salida Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.SalidaDocumentoFinal
	 * @generated
	 */
	public Adapter createSalidaDocumentoFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.SimapaCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.SimapaCollection
	 * @generated
	 */
	public Adapter createSimapaCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.SimapaObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.SimapaObject
	 * @generated
	 */
	public Adapter createSimapaObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.FinProceso <em>Fin Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.FinProceso
	 * @generated
	 */
	public Adapter createFinProcesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.simapa.Flujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.simapa.Flujo
	 * @generated
	 */
	public Adapter createFlujoAdapter() {
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

} //SimapaAdapterFactory
