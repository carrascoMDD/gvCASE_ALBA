/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage
 * @generated
 */
public interface OrgcasiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrgcasiFactory eINSTANCE = es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ARepositorio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARepositorio</em>'.
	 * @generated
	 */
	ARepositorio createARepositorio();

	/**
	 * Returns a new object of class '<em>AProcedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AProcedimiento</em>'.
	 * @generated
	 */
	AProcedimiento createAProcedimiento();

	/**
	 * Returns a new object of class '<em>AAplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AAplicacion</em>'.
	 * @generated
	 */
	AAplicacion createAAplicacion();

	/**
	 * Returns a new object of class '<em>AUnidad Organica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AUnidad Organica</em>'.
	 * @generated
	 */
	AUnidadOrganica createAUnidadOrganica();

	/**
	 * Returns a new object of class '<em>AUnidad Externa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AUnidad Externa</em>'.
	 * @generated
	 */
	AUnidadExterna createAUnidadExterna();

	/**
	 * Returns a new object of class '<em>AEstructura Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AEstructura Funcional</em>'.
	 * @generated
	 */
	AEstructuraFuncional createAEstructuraFuncional();

	/**
	 * Returns a new object of class '<em>ATermino Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATermino Glosario</em>'.
	 * @generated
	 */
	ATerminoGlosario createATerminoGlosario();

	/**
	 * Returns a new object of class '<em>ANormativa YLegislacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ANormativa YLegislacion</em>'.
	 * @generated
	 */
	ANormativaYLegislacion createANormativaYLegislacion();

	/**
	 * Returns a new object of class '<em>AOperacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AOperacion</em>'.
	 * @generated
	 */
	AOperacion createAOperacion();

	/**
	 * Returns a new object of class '<em>ASubprocedimiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASubprocedimiento</em>'.
	 * @generated
	 */
	ASubprocedimiento createASubprocedimiento();

	/**
	 * Returns a new object of class '<em>ADocumento Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADocumento Final</em>'.
	 * @generated
	 */
	ADocumentoFinal createADocumentoFinal();

	/**
	 * Returns a new object of class '<em>AFlujo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFlujo</em>'.
	 * @generated
	 */
	AFlujo createAFlujo();

	/**
	 * Returns a new object of class '<em>Campo Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo Datos</em>'.
	 * @generated
	 */
	CampoDatos createCampoDatos();

	/**
	 * Returns a new object of class '<em>Estructura Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estructura Datos</em>'.
	 * @generated
	 */
	EstructuraDatos createEstructuraDatos();

	/**
	 * Returns a new object of class '<em>Relacion Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion Datos</em>'.
	 * @generated
	 */
	RelacionDatos createRelacionDatos();

	/**
	 * Returns a new object of class '<em>Miembro Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Miembro Relacion</em>'.
	 * @generated
	 */
	MiembroRelacion createMiembroRelacion();

	/**
	 * Returns a new object of class '<em>Suceso Consultor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suceso Consultor</em>'.
	 * @generated
	 */
	SucesoConsultor createSucesoConsultor();

	/**
	 * Returns a new object of class '<em>Suceso Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suceso Constructor</em>'.
	 * @generated
	 */
	SucesoConstructor createSucesoConstructor();

	/**
	 * Returns a new object of class '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sistema</em>'.
	 * @generated
	 */
	Sistema createSistema();

	/**
	 * Returns a new object of class '<em>Subsistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsistema</em>'.
	 * @generated
	 */
	Subsistema createSubsistema();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Actor Funcional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Funcional</em>'.
	 * @generated
	 */
	ActorFuncional createActorFuncional();

	/**
	 * Returns a new object of class '<em>ADocumento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADocumento</em>'.
	 * @generated
	 */
	ADocumento createADocumento();

	/**
	 * Returns a new object of class '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada</em>'.
	 * @generated
	 */
	Entrada createEntrada();

	/**
	 * Returns a new object of class '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida</em>'.
	 * @generated
	 */
	Salida createSalida();

	/**
	 * Returns a new object of class '<em>Entrada Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada Suceso</em>'.
	 * @generated
	 */
	EntradaSuceso createEntradaSuceso();

	/**
	 * Returns a new object of class '<em>Salida Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida Suceso</em>'.
	 * @generated
	 */
	SalidaSuceso createSalidaSuceso();

	/**
	 * Returns a new object of class '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accion</em>'.
	 * @generated
	 */
	Accion createAccion();

	/**
	 * Returns a new object of class '<em>Uso Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uso Suceso</em>'.
	 * @generated
	 */
	UsoSuceso createUsoSuceso();

	/**
	 * Returns a new object of class '<em>Uso Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uso Servicio</em>'.
	 * @generated
	 */
	UsoServicio createUsoServicio();

	/**
	 * Returns a new object of class '<em>Entrada Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada Accion</em>'.
	 * @generated
	 */
	EntradaAccion createEntradaAccion();

	/**
	 * Returns a new object of class '<em>Salida Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida Accion</em>'.
	 * @generated
	 */
	SalidaAccion createSalidaAccion();

	/**
	 * Returns a new object of class '<em>CSistemas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSistemas</em>'.
	 * @generated
	 */
	CSistemas createCSistemas();

	/**
	 * Returns a new object of class '<em>CSubsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSubsistemas</em>'.
	 * @generated
	 */
	CSubsistemas createCSubsistemas();

	/**
	 * Returns a new object of class '<em>CSucesos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSucesos</em>'.
	 * @generated
	 */
	CSucesos createCSucesos();

	/**
	 * Returns a new object of class '<em>CAcciones Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAcciones Suceso</em>'.
	 * @generated
	 */
	CAccionesSuceso createCAccionesSuceso();

	/**
	 * Returns a new object of class '<em>CActores Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CActores Suceso</em>'.
	 * @generated
	 */
	CActoresSuceso createCActoresSuceso();

	/**
	 * Returns a new object of class '<em>CEstructuras Datos Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEstructuras Datos Suceso</em>'.
	 * @generated
	 */
	CEstructurasDatosSuceso createCEstructurasDatosSuceso();

	/**
	 * Returns a new object of class '<em>CFlujos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFlujos</em>'.
	 * @generated
	 */
	CFlujos createCFlujos();

	/**
	 * Returns a new object of class '<em>CDocumentos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDocumentos</em>'.
	 * @generated
	 */
	CDocumentos createCDocumentos();

	/**
	 * Returns a new object of class '<em>CNormativas YLegislaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CNormativas YLegislaciones</em>'.
	 * @generated
	 */
	CNormativasYLegislaciones createCNormativasYLegislaciones();

	/**
	 * Returns a new object of class '<em>Contenedor Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Datos</em>'.
	 * @generated
	 */
	ContenedorDatos createContenedorDatos();

	/**
	 * Returns a new object of class '<em>COperaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COperaciones</em>'.
	 * @generated
	 */
	COperaciones createCOperaciones();

	/**
	 * Returns a new object of class '<em>CCampos Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CCampos Datos</em>'.
	 * @generated
	 */
	CCamposDatos createCCamposDatos();

	/**
	 * Returns a new object of class '<em>CEstructuras Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEstructuras Datos</em>'.
	 * @generated
	 */
	CEstructurasDatos createCEstructurasDatos();

	/**
	 * Returns a new object of class '<em>CFlujos Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFlujos Suceso</em>'.
	 * @generated
	 */
	CFlujosSuceso createCFlujosSuceso();

	/**
	 * Returns a new object of class '<em>CImportaciones Por</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CImportaciones Por</em>'.
	 * @generated
	 */
	CImportacionesPor createCImportacionesPor();

	/**
	 * Returns a new object of class '<em>CUsado Por Sucesos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUsado Por Sucesos</em>'.
	 * @generated
	 */
	CUsadoPorSucesos createCUsadoPorSucesos();

	/**
	 * Returns a new object of class '<em>CEntradas Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEntradas Suceso</em>'.
	 * @generated
	 */
	CEntradasSuceso createCEntradasSuceso();

	/**
	 * Returns a new object of class '<em>CSalidas Suceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSalidas Suceso</em>'.
	 * @generated
	 */
	CSalidasSuceso createCSalidasSuceso();

	/**
	 * Returns a new object of class '<em>CRelaciones Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRelaciones Datos</em>'.
	 * @generated
	 */
	CRelacionesDatos createCRelacionesDatos();

	/**
	 * Returns a new object of class '<em>CActores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CActores</em>'.
	 * @generated
	 */
	CActores createCActores();

	/**
	 * Returns a new object of class '<em>CProcedimientos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CProcedimientos</em>'.
	 * @generated
	 */
	CProcedimientos createCProcedimientos();

	/**
	 * Returns a new object of class '<em>CLibrerias Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLibrerias Servicios</em>'.
	 * @generated
	 */
	CLibreriasServicios createCLibreriasServicios();

	/**
	 * Returns a new object of class '<em>CAplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAplicaciones</em>'.
	 * @generated
	 */
	CAplicaciones createCAplicaciones();

	/**
	 * Returns a new object of class '<em>CUnidades Organicas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUnidades Organicas</em>'.
	 * @generated
	 */
	CUnidadesOrganicas createCUnidadesOrganicas();

	/**
	 * Returns a new object of class '<em>CUnidades Externas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUnidades Externas</em>'.
	 * @generated
	 */
	CUnidadesExternas createCUnidadesExternas();

	/**
	 * Returns a new object of class '<em>CUnidades</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUnidades</em>'.
	 * @generated
	 */
	CUnidades createCUnidades();

	/**
	 * Returns a new object of class '<em>CEstructuras Funcionales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEstructuras Funcionales</em>'.
	 * @generated
	 */
	CEstructurasFuncionales createCEstructurasFuncionales();

	/**
	 * Returns a new object of class '<em>CTerminos Glosario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTerminos Glosario</em>'.
	 * @generated
	 */
	CTerminosGlosario createCTerminosGlosario();

	/**
	 * Returns a new object of class '<em>CEntradas Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEntradas Accion</em>'.
	 * @generated
	 */
	CEntradasAccion createCEntradasAccion();

	/**
	 * Returns a new object of class '<em>CSalidas Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSalidas Accion</em>'.
	 * @generated
	 */
	CSalidasAccion createCSalidasAccion();

	/**
	 * Returns a new object of class '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaz</em>'.
	 * @generated
	 */
	Interfaz createInterfaz();

	/**
	 * Returns a new object of class '<em>Libreria Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Libreria Servicios</em>'.
	 * @generated
	 */
	LibreriaServicios createLibreriaServicios();

	/**
	 * Returns a new object of class '<em>Rol Solicitante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol Solicitante</em>'.
	 * @generated
	 */
	RolSolicitante createRolSolicitante();

	/**
	 * Returns a new object of class '<em>Rol Solicitado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol Solicitado</em>'.
	 * @generated
	 */
	RolSolicitado createRolSolicitado();

	/**
	 * Returns a new object of class '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio</em>'.
	 * @generated
	 */
	Servicio createServicio();

	/**
	 * Returns a new object of class '<em>Entrada Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada Servicio</em>'.
	 * @generated
	 */
	EntradaServicio createEntradaServicio();

	/**
	 * Returns a new object of class '<em>Salida Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida Servicio</em>'.
	 * @generated
	 */
	SalidaServicio createSalidaServicio();

	/**
	 * Returns a new object of class '<em>Importacion Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Importacion Servicios</em>'.
	 * @generated
	 */
	ImportacionServicios createImportacionServicios();

	/**
	 * Returns a new object of class '<em>CImportaciones Servicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CImportaciones Servicios</em>'.
	 * @generated
	 */
	CImportacionesServicios createCImportacionesServicios();

	/**
	 * Returns a new object of class '<em>CUsos Subsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUsos Subsistemas</em>'.
	 * @generated
	 */
	CUsosSubsistemas createCUsosSubsistemas();

	/**
	 * Returns a new object of class '<em>Documento En Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documento En Estado</em>'.
	 * @generated
	 */
	DocumentoEnEstado createDocumentoEnEstado();

	/**
	 * Returns a new object of class '<em>CUsado Por Subsistemas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CUsado Por Subsistemas</em>'.
	 * @generated
	 */
	CUsadoPorSubsistemas createCUsadoPorSubsistemas();

	/**
	 * Returns a new object of class '<em>CInterfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CInterfaces</em>'.
	 * @generated
	 */
	CInterfaces createCInterfaces();

	/**
	 * Returns a new object of class '<em>CServicios</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CServicios</em>'.
	 * @generated
	 */
	CServicios createCServicios();

	/**
	 * Returns a new object of class '<em>CServicio Usado Por Sucesos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CServicio Usado Por Sucesos</em>'.
	 * @generated
	 */
	CServicioUsadoPorSucesos createCServicioUsadoPorSucesos();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	OrgcasiObject createOrgcasiObject();

	/**
	 * Returns a new object of class '<em>Uso Subsistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uso Subsistema</em>'.
	 * @generated
	 */
	UsoSubsistema createUsoSubsistema();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrgcasiPackage getOrgcasiPackage();

} //OrgcasiFactory
