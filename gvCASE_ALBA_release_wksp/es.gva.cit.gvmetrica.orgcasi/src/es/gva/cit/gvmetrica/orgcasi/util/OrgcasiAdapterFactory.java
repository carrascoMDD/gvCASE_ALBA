/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.util;

import es.gva.cit.gvmetrica.orgcasi.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage
 * @generated
 */
public class OrgcasiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrgcasiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgcasiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OrgcasiPackage.eINSTANCE;
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
	protected OrgcasiSwitch modelSwitch =
		new OrgcasiSwitch() {
			public Object caseAAplicacion(AAplicacion object) {
				return createAAplicacionAdapter();
			}
			public Object caseAccion(Accion object) {
				return createAccionAdapter();
			}
			public Object caseActor(Actor object) {
				return createActorAdapter();
			}
			public Object caseActorFuncional(ActorFuncional object) {
				return createActorFuncionalAdapter();
			}
			public Object caseADocumento(ADocumento object) {
				return createADocumentoAdapter();
			}
			public Object caseADocumentoFinal(ADocumentoFinal object) {
				return createADocumentoFinalAdapter();
			}
			public Object caseAEstructuraFuncional(AEstructuraFuncional object) {
				return createAEstructuraFuncionalAdapter();
			}
			public Object caseAFlujo(AFlujo object) {
				return createAFlujoAdapter();
			}
			public Object caseAgrupacion(Agrupacion object) {
				return createAgrupacionAdapter();
			}
			public Object caseANormativaYLegislacion(ANormativaYLegislacion object) {
				return createANormativaYLegislacionAdapter();
			}
			public Object caseAnotacion(Anotacion object) {
				return createAnotacionAdapter();
			}
			public Object caseAOperacion(AOperacion object) {
				return createAOperacionAdapter();
			}
			public Object caseAProcedimiento(AProcedimiento object) {
				return createAProcedimientoAdapter();
			}
			public Object caseARepositorio(ARepositorio object) {
				return createARepositorioAdapter();
			}
			public Object caseASubprocedimiento(ASubprocedimiento object) {
				return createASubprocedimientoAdapter();
			}
			public Object caseATerminoGlosario(ATerminoGlosario object) {
				return createATerminoGlosarioAdapter();
			}
			public Object caseAUnidad(AUnidad object) {
				return createAUnidadAdapter();
			}
			public Object caseAUnidadExterna(AUnidadExterna object) {
				return createAUnidadExternaAdapter();
			}
			public Object caseAUnidadOrganica(AUnidadOrganica object) {
				return createAUnidadOrganicaAdapter();
			}
			public Object caseCAccionesSuceso(CAccionesSuceso object) {
				return createCAccionesSucesoAdapter();
			}
			public Object caseCActores(CActores object) {
				return createCActoresAdapter();
			}
			public Object caseCActoresSuceso(CActoresSuceso object) {
				return createCActoresSucesoAdapter();
			}
			public Object caseCampoDatos(CampoDatos object) {
				return createCampoDatosAdapter();
			}
			public Object caseCAplicaciones(CAplicaciones object) {
				return createCAplicacionesAdapter();
			}
			public Object caseCCamposDatos(CCamposDatos object) {
				return createCCamposDatosAdapter();
			}
			public Object caseCDocumentos(CDocumentos object) {
				return createCDocumentosAdapter();
			}
			public Object caseCEntradasAccion(CEntradasAccion object) {
				return createCEntradasAccionAdapter();
			}
			public Object caseCEntradasSuceso(CEntradasSuceso object) {
				return createCEntradasSucesoAdapter();
			}
			public Object caseCEstructurasDatos(CEstructurasDatos object) {
				return createCEstructurasDatosAdapter();
			}
			public Object caseCEstructurasDatosSuceso(CEstructurasDatosSuceso object) {
				return createCEstructurasDatosSucesoAdapter();
			}
			public Object caseCFlujos(CFlujos object) {
				return createCFlujosAdapter();
			}
			public Object caseCFlujosSuceso(CFlujosSuceso object) {
				return createCFlujosSucesoAdapter();
			}
			public Object caseCEstructurasFuncionales(CEstructurasFuncionales object) {
				return createCEstructurasFuncionalesAdapter();
			}
			public Object caseCImportacionesPor(CImportacionesPor object) {
				return createCImportacionesPorAdapter();
			}
			public Object caseCImportacionesServicios(CImportacionesServicios object) {
				return createCImportacionesServiciosAdapter();
			}
			public Object caseCInterfaces(CInterfaces object) {
				return createCInterfacesAdapter();
			}
			public Object caseCLibreriasServicios(CLibreriasServicios object) {
				return createCLibreriasServiciosAdapter();
			}
			public Object caseCNormativasYLegislaciones(CNormativasYLegislaciones object) {
				return createCNormativasYLegislacionesAdapter();
			}
			public Object caseConModelClass(ConModelClass object) {
				return createConModelClassAdapter();
			}
			public Object caseContenedorDatos(ContenedorDatos object) {
				return createContenedorDatosAdapter();
			}
			public Object caseContenedorDocumentos(ContenedorDocumentos object) {
				return createContenedorDocumentosAdapter();
			}
			public Object caseContenedorSucesos(ContenedorSucesos object) {
				return createContenedorSucesosAdapter();
			}
			public Object caseContenedorSubsistemas(ContenedorSubsistemas object) {
				return createContenedorSubsistemasAdapter();
			}
			public Object caseCOperaciones(COperaciones object) {
				return createCOperacionesAdapter();
			}
			public Object caseCProcedimientos(CProcedimientos object) {
				return createCProcedimientosAdapter();
			}
			public Object caseCRelacionesDatos(CRelacionesDatos object) {
				return createCRelacionesDatosAdapter();
			}
			public Object caseCSalidasAccion(CSalidasAccion object) {
				return createCSalidasAccionAdapter();
			}
			public Object caseCSalidasSuceso(CSalidasSuceso object) {
				return createCSalidasSucesoAdapter();
			}
			public Object caseCServicios(CServicios object) {
				return createCServiciosAdapter();
			}
			public Object caseCServicioUsadoPorSucesos(CServicioUsadoPorSucesos object) {
				return createCServicioUsadoPorSucesosAdapter();
			}
			public Object caseCSistemas(CSistemas object) {
				return createCSistemasAdapter();
			}
			public Object caseCSubsistemas(CSubsistemas object) {
				return createCSubsistemasAdapter();
			}
			public Object caseCSucesos(CSucesos object) {
				return createCSucesosAdapter();
			}
			public Object caseCTerminosGlosario(CTerminosGlosario object) {
				return createCTerminosGlosarioAdapter();
			}
			public Object caseCUnidades(CUnidades object) {
				return createCUnidadesAdapter();
			}
			public Object caseCUnidadesExternas(CUnidadesExternas object) {
				return createCUnidadesExternasAdapter();
			}
			public Object caseCUnidadesOrganicas(CUnidadesOrganicas object) {
				return createCUnidadesOrganicasAdapter();
			}
			public Object caseCUsadoPorSubsistemas(CUsadoPorSubsistemas object) {
				return createCUsadoPorSubsistemasAdapter();
			}
			public Object caseCUsadoPorSucesos(CUsadoPorSucesos object) {
				return createCUsadoPorSucesosAdapter();
			}
			public Object caseCUsosSubsistemas(CUsosSubsistemas object) {
				return createCUsosSubsistemasAdapter();
			}
			public Object caseDocumentoEnEstado(DocumentoEnEstado object) {
				return createDocumentoEnEstadoAdapter();
			}
			public Object caseEntrada(Entrada object) {
				return createEntradaAdapter();
			}
			public Object caseEntradaAccion(EntradaAccion object) {
				return createEntradaAccionAdapter();
			}
			public Object caseEntradaOSalida(EntradaOSalida object) {
				return createEntradaOSalidaAdapter();
			}
			public Object caseEntradaServicio(EntradaServicio object) {
				return createEntradaServicioAdapter();
			}
			public Object caseEntradaSuceso(EntradaSuceso object) {
				return createEntradaSucesoAdapter();
			}
			public Object caseEstructuraDatos(EstructuraDatos object) {
				return createEstructuraDatosAdapter();
			}
			public Object caseImportacionServicios(ImportacionServicios object) {
				return createImportacionServiciosAdapter();
			}
			public Object caseImportadorServicios(ImportadorServicios object) {
				return createImportadorServiciosAdapter();
			}
			public Object caseInterfaz(Interfaz object) {
				return createInterfazAdapter();
			}
			public Object caseLibreriaServicios(LibreriaServicios object) {
				return createLibreriaServiciosAdapter();
			}
			public Object caseMiembroRelacion(MiembroRelacion object) {
				return createMiembroRelacionAdapter();
			}
			public Object caseOrgcasiCollection(OrgcasiCollection object) {
				return createOrgcasiCollectionAdapter();
			}
			public Object caseOrgcasiObject(OrgcasiObject object) {
				return createOrgcasiObjectAdapter();
			}
			public Object caseRelacionDatos(RelacionDatos object) {
				return createRelacionDatosAdapter();
			}
			public Object caseRol(Rol object) {
				return createRolAdapter();
			}
			public Object caseRolSolicitante(RolSolicitante object) {
				return createRolSolicitanteAdapter();
			}
			public Object caseRolSolicitado(RolSolicitado object) {
				return createRolSolicitadoAdapter();
			}
			public Object caseSalida(Salida object) {
				return createSalidaAdapter();
			}
			public Object caseSalidaAccion(SalidaAccion object) {
				return createSalidaAccionAdapter();
			}
			public Object caseSalidaServicio(SalidaServicio object) {
				return createSalidaServicioAdapter();
			}
			public Object caseSalidaSuceso(SalidaSuceso object) {
				return createSalidaSucesoAdapter();
			}
			public Object caseServicio(Servicio object) {
				return createServicioAdapter();
			}
			public Object caseSistema(Sistema object) {
				return createSistemaAdapter();
			}
			public Object caseSubsistema(Subsistema object) {
				return createSubsistemaAdapter();
			}
			public Object caseSuceso(Suceso object) {
				return createSucesoAdapter();
			}
			public Object caseSucesoConstructor(SucesoConstructor object) {
				return createSucesoConstructorAdapter();
			}
			public Object caseSucesoConsultor(SucesoConsultor object) {
				return createSucesoConsultorAdapter();
			}
			public Object caseUsoServicio(UsoServicio object) {
				return createUsoServicioAdapter();
			}
			public Object caseUsoSubsistema(UsoSubsistema object) {
				return createUsoSubsistemaAdapter();
			}
			public Object caseUsoSuceso(UsoSuceso object) {
				return createUsoSucesoAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida <em>Entrada OSalida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida
	 * @generated
	 */
	public Adapter createEntradaOSalidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Entrada
	 * @generated
	 */
	public Adapter createEntradaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Salida
	 * @generated
	 */
	public Adapter createSalidaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos <em>Campo Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos
	 * @generated
	 */
	public Adapter createCampoDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos <em>Estructura Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos
	 * @generated
	 */
	public Adapter createEstructuraDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion <em>Agrupacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion
	 * @generated
	 */
	public Adapter createAgrupacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento <em>AProcedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento
	 * @generated
	 */
	public Adapter createAProcedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion <em>AOperacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion
	 * @generated
	 */
	public Adapter createAOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Suceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso
	 * @generated
	 */
	public Adapter createSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.SucesoConsultor <em>Suceso Consultor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.SucesoConsultor
	 * @generated
	 */
	public Adapter createSucesoConsultorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.SucesoConstructor <em>Suceso Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.SucesoConstructor
	 * @generated
	 */
	public Adapter createSucesoConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema
	 * @generated
	 */
	public Adapter createSubsistemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema
	 * @generated
	 */
	public Adapter createSistemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica <em>AUnidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica
	 * @generated
	 */
	public Adapter createAUnidadOrganicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos <em>CProcedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos
	 * @generated
	 */
	public Adapter createCProcedimientosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios <em>CLibrerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios
	 * @generated
	 */
	public Adapter createCLibreriasServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal <em>ADocumento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal
	 * @generated
	 */
	public Adapter createADocumentoFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso <em>CAcciones Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso
	 * @generated
	 */
	public Adapter createCAccionesSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso <em>CActores Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso
	 * @generated
	 */
	public Adapter createCActoresSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso <em>CEstructuras Datos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso
	 * @generated
	 */
	public Adapter createCEstructurasDatosSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio <em>ARepositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio
	 * @generated
	 */
	public Adapter createARepositorioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional <em>AEstructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional
	 * @generated
	 */
	public Adapter createAEstructuraFuncionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion <em>ANormativa YLegislacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion
	 * @generated
	 */
	public Adapter createANormativaYLegislacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario <em>ATermino Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario
	 * @generated
	 */
	public Adapter createATerminoGlosarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo <em>AFlujo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo
	 * @generated
	 */
	public Adapter createAFlujoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas <em>CUnidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas
	 * @generated
	 */
	public Adapter createCUnidadesOrganicasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos <em>CFlujos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos
	 * @generated
	 */
	public Adapter createCFlujosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos <em>CDocumentos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos
	 * @generated
	 */
	public Adapter createCDocumentosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario <em>CTerminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario
	 * @generated
	 */
	public Adapter createCTerminosGlosarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales <em>CEstructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales
	 * @generated
	 */
	public Adapter createCEstructurasFuncionalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones <em>CNormativas YLegislaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones
	 * @generated
	 */
	public Adapter createCNormativasYLegislacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones <em>COperaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones
	 * @generated
	 */
	public Adapter createCOperacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion <em>AAplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion
	 * @generated
	 */
	public Adapter createAAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones <em>CAplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones
	 * @generated
	 */
	public Adapter createCAplicacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento <em>ASubprocedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento
	 * @generated
	 */
	public Adapter createASubprocedimientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna <em>AUnidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadExterna
	 * @generated
	 */
	public Adapter createAUnidadExternaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas <em>CUnidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas
	 * @generated
	 */
	public Adapter createCUnidadesExternasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos <em>CCampos Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos
	 * @generated
	 */
	public Adapter createCCamposDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos <em>CEstructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos
	 * @generated
	 */
	public Adapter createCEstructurasDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidad <em>AUnidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidad
	 * @generated
	 */
	public Adapter createAUnidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades <em>CUnidades</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidades
	 * @generated
	 */
	public Adapter createCUnidadesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso <em>CFlujos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso
	 * @generated
	 */
	public Adapter createCFlujosSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor <em>CImportaciones Por</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor
	 * @generated
	 */
	public Adapter createCImportacionesPorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos <em>CUsado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos
	 * @generated
	 */
	public Adapter createCUsadoPorSucesosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso <em>CEntradas Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso
	 * @generated
	 */
	public Adapter createCEntradasSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso <em>CSalidas Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso
	 * @generated
	 */
	public Adapter createCSalidasSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso <em>Entrada Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso
	 * @generated
	 */
	public Adapter createEntradaSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso <em>Salida Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso
	 * @generated
	 */
	public Adapter createSalidaSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion <em>CEntradas Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion
	 * @generated
	 */
	public Adapter createCEntradasAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion <em>CSalidas Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion
	 * @generated
	 */
	public Adapter createCSalidasAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz
	 * @generated
	 */
	public Adapter createInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios
	 * @generated
	 */
	public Adapter createLibreriaServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante <em>Rol Solicitante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitante
	 * @generated
	 */
	public Adapter createRolSolicitanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado <em>Rol Solicitado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitado
	 * @generated
	 */
	public Adapter createRolSolicitadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio
	 * @generated
	 */
	public Adapter createServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio <em>Entrada Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio
	 * @generated
	 */
	public Adapter createEntradaServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio <em>Salida Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio
	 * @generated
	 */
	public Adapter createSalidaServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios <em>Importacion Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios
	 * @generated
	 */
	public Adapter createImportacionServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios <em>CImportaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios
	 * @generated
	 */
	public Adapter createCImportacionesServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas <em>CUsos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas
	 * @generated
	 */
	public Adapter createCUsosSubsistemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado <em>Documento En Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado
	 * @generated
	 */
	public Adapter createDocumentoEnEstadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas <em>CUsado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas
	 * @generated
	 */
	public Adapter createCUsadoPorSubsistemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces <em>CInterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces
	 * @generated
	 */
	public Adapter createCInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CServicios <em>CServicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios
	 * @generated
	 */
	public Adapter createCServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos <em>CServicio Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos
	 * @generated
	 */
	public Adapter createCServicioUsadoPorSucesosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ConModelClass
	 * @generated
	 */
	public Adapter createConModelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos <em>Contenedor Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos
	 * @generated
	 */
	public Adapter createContenedorDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.OrgcasiObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiObject
	 * @generated
	 */
	public Adapter createOrgcasiObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.OrgcasiCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiCollection
	 * @generated
	 */
	public Adapter createOrgcasiCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema <em>Uso Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema
	 * @generated
	 */
	public Adapter createUsoSubsistemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos <em>Contenedor Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos
	 * @generated
	 */
	public Adapter createContenedorDocumentosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion <em>Entrada Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion
	 * @generated
	 */
	public Adapter createEntradaAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion <em>Salida Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion
	 * @generated
	 */
	public Adapter createSalidaAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion
	 * @generated
	 */
	public Adapter createAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion
	 * @generated
	 */
	public Adapter createAnotacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos <em>Relacion Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos
	 * @generated
	 */
	public Adapter createRelacionDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos <em>CRelaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos
	 * @generated
	 */
	public Adapter createCRelacionesDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion <em>Miembro Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion
	 * @generated
	 */
	public Adapter createMiembroRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CActores <em>CActores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores
	 * @generated
	 */
	public Adapter createCActoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ActorFuncional <em>Actor Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ActorFuncional
	 * @generated
	 */
	public Adapter createActorFuncionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento <em>ADocumento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento
	 * @generated
	 */
	public Adapter createADocumentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso <em>Uso Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSuceso
	 * @generated
	 */
	public Adapter createUsoSucesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios <em>Importador Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportadorServicios
	 * @generated
	 */
	public Adapter createImportadorServiciosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio <em>Uso Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoServicio
	 * @generated
	 */
	public Adapter createUsoServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos <em>Contenedor Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos
	 * @generated
	 */
	public Adapter createContenedorSucesosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas <em>Contenedor Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas
	 * @generated
	 */
	public Adapter createContenedorSubsistemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas <em>CSubsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas
	 * @generated
	 */
	public Adapter createCSubsistemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas <em>CSistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas
	 * @generated
	 */
	public Adapter createCSistemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos <em>CSucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos
	 * @generated
	 */
	public Adapter createCSucesosAdapter() {
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

} //OrgcasiAdapterFactory
