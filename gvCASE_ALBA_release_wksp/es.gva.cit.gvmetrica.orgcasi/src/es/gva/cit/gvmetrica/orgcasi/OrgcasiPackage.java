/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory
 * @model kind="package"
 * @generated
 */
public interface OrgcasiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orgcasi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///es/gva/cit/gvmetrica/orgcasi.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.gva.cit.gvmetrica.orgcasi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrgcasiPackage eINSTANCE = es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ConModelClassImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getConModelClass()
	 * @generated
	 */
	int CON_MODEL_CLASS = 38;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_MODEL_CLASS__MODEL_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Con Model Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_MODEL_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiObjectImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getOrgcasiObject()
	 * @generated
	 */
	int ORGCASI_OBJECT = 73;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGCASI_OBJECT__MODEL_CLASS = CON_MODEL_CLASS__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGCASI_OBJECT_FEATURE_COUNT = CON_MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl <em>Anotacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAnotacion()
	 * @generated
	 */
	int ANOTACION = 10;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__ID_ANOTADA = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__VERSION_ANOTADA = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__FECHA_ANOTACION = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__REALIZADOR_ANOTACION = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__RESPONSABLE_ANOTACION = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl <em>ARepositorio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getARepositorio()
	 * @generated
	 */
	int AREPOSITORIO = 13;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl <em>AProcedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAProcedimiento()
	 * @generated
	 */
	int APROCEDIMIENTO = 12;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl <em>AAplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAAplicacion()
	 * @generated
	 */
	int AAPLICACION = 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadImpl <em>AUnidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidad()
	 * @generated
	 */
	int AUNIDAD = 16;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl <em>AUnidad Organica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidadOrganica()
	 * @generated
	 */
	int AUNIDAD_ORGANICA = 18;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl <em>AUnidad Externa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidadExterna()
	 * @generated
	 */
	int AUNIDAD_EXTERNA = 17;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl <em>AEstructura Funcional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAEstructuraFuncional()
	 * @generated
	 */
	int AESTRUCTURA_FUNCIONAL = 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl <em>ATermino Glosario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getATerminoGlosario()
	 * @generated
	 */
	int ATERMINO_GLOSARIO = 15;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl <em>ANormativa YLegislacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getANormativaYLegislacion()
	 * @generated
	 */
	int ANORMATIVA_YLEGISLACION = 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl <em>AOperacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAOperacion()
	 * @generated
	 */
	int AOPERACION = 11;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ASubprocedimientoImpl <em>ASubprocedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ASubprocedimientoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getASubprocedimiento()
	 * @generated
	 */
	int ASUBPROCEDIMIENTO = 14;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoFinalImpl <em>ADocumento Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoFinalImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getADocumentoFinal()
	 * @generated
	 */
	int ADOCUMENTO_FINAL = 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl <em>AFlujo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAFlujo()
	 * @generated
	 */
	int AFLUJO = 7;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl <em>Campo Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCampoDatos()
	 * @generated
	 */
	int CAMPO_DATOS = 22;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl <em>Estructura Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEstructuraDatos()
	 * @generated
	 */
	int ESTRUCTURA_DATOS = 66;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RelacionDatosImpl <em>Relacion Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.RelacionDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRelacionDatos()
	 * @generated
	 */
	int RELACION_DATOS = 74;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl <em>Miembro Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getMiembroRelacion()
	 * @generated
	 */
	int MIEMBRO_RELACION = 71;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AgrupacionImpl <em>Agrupacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AgrupacionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAgrupacion()
	 * @generated
	 */
	int AGRUPACION = 8;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl <em>Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSuceso()
	 * @generated
	 */
	int SUCESO = 85;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoConsultorImpl <em>Suceso Consultor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoConsultorImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSucesoConsultor()
	 * @generated
	 */
	int SUCESO_CONSULTOR = 87;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoConstructorImpl <em>Suceso Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoConstructorImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSucesoConstructor()
	 * @generated
	 */
	int SUCESO_CONSTRUCTOR = 86;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl <em>Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSistema()
	 * @generated
	 */
	int SISTEMA = 83;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl <em>Subsistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSubsistema()
	 * @generated
	 */
	int SUBSISTEMA = 84;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ActorImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ActorFuncionalImpl <em>Actor Funcional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ActorFuncionalImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getActorFuncional()
	 * @generated
	 */
	int ACTOR_FUNCIONAL = 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl <em>Entrada OSalida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaOSalida()
	 * @generated
	 */
	int ENTRADA_OSALIDA = 63;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaImpl <em>Entrada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntrada()
	 * @generated
	 */
	int ENTRADA = 61;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaServicioImpl <em>Entrada Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaServicioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaServicio()
	 * @generated
	 */
	int ENTRADA_SERVICIO = 64;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaImpl <em>Salida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalida()
	 * @generated
	 */
	int SALIDA = 78;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaServicioImpl <em>Salida Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaServicioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaServicio()
	 * @generated
	 */
	int SALIDA_SERVICIO = 80;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl <em>Entrada Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaSuceso()
	 * @generated
	 */
	int ENTRADA_SUCESO = 65;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl <em>Salida Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaSuceso()
	 * @generated
	 */
	int SALIDA_SUCESO = 81;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl <em>Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAccion()
	 * @generated
	 */
	int ACCION = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSucesoImpl <em>Uso Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoSuceso()
	 * @generated
	 */
	int USO_SUCESO = 90;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaAccionImpl <em>Entrada Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaAccionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaAccion()
	 * @generated
	 */
	int ENTRADA_ACCION = 62;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaAccionImpl <em>Salida Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaAccionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaAccion()
	 * @generated
	 */
	int SALIDA_ACCION = 79;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoServicioImpl <em>Uso Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoServicioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoServicio()
	 * @generated
	 */
	int USO_SERVICIO = 88;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSucesosImpl <em>Contenedor Sucesos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSucesosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorSucesos()
	 * @generated
	 */
	int CONTENEDOR_SUCESOS = 41;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSubsistemasImpl <em>Contenedor Subsistemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSubsistemasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorSubsistemas()
	 * @generated
	 */
	int CONTENEDOR_SUBSISTEMAS = 42;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl <em>CSistemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSistemas()
	 * @generated
	 */
	int CSISTEMAS = 50;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl <em>CSubsistemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSubsistemas()
	 * @generated
	 */
	int CSUBSISTEMAS = 51;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSucesosImpl <em>CSucesos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSucesosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSucesos()
	 * @generated
	 */
	int CSUCESOS = 52;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl <em>CAcciones Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCAccionesSuceso()
	 * @generated
	 */
	int CACCIONES_SUCESO = 19;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CActoresSucesoImpl <em>CActores Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CActoresSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCActoresSuceso()
	 * @generated
	 */
	int CACTORES_SUCESO = 21;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosSucesoImpl <em>CEstructuras Datos Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasDatosSuceso()
	 * @generated
	 */
	int CESTRUCTURAS_DATOS_SUCESO = 29;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosImpl <em>CFlujos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CFlujosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCFlujos()
	 * @generated
	 */
	int CFLUJOS = 30;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl <em>CDocumentos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCDocumentos()
	 * @generated
	 */
	int CDOCUMENTOS = 25;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl <em>CNormativas YLegislaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCNormativasYLegislaciones()
	 * @generated
	 */
	int CNORMATIVAS_YLEGISLACIONES = 37;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl <em>COperaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCOperaciones()
	 * @generated
	 */
	int COPERACIONES = 43;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CCamposDatosImpl <em>CCampos Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CCamposDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCCamposDatos()
	 * @generated
	 */
	int CCAMPOS_DATOS = 24;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl <em>CEstructuras Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasDatos()
	 * @generated
	 */
	int CESTRUCTURAS_DATOS = 28;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl <em>CFlujos Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCFlujosSuceso()
	 * @generated
	 */
	int CFLUJOS_SUCESO = 31;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasSucesoImpl <em>CEntradas Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEntradasSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEntradasSuceso()
	 * @generated
	 */
	int CENTRADAS_SUCESO = 27;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl <em>CSalidas Suceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSalidasSuceso()
	 * @generated
	 */
	int CSALIDAS_SUCESO = 47;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl <em>CRelaciones Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCRelacionesDatos()
	 * @generated
	 */
	int CRELACIONES_DATOS = 45;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CActoresImpl <em>CActores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CActoresImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCActores()
	 * @generated
	 */
	int CACTORES = 20;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl <em>CProcedimientos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCProcedimientos()
	 * @generated
	 */
	int CPROCEDIMIENTOS = 44;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl <em>CAplicaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCAplicaciones()
	 * @generated
	 */
	int CAPLICACIONES = 23;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesOrganicasImpl <em>CUnidades Organicas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesOrganicasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidadesOrganicas()
	 * @generated
	 */
	int CUNIDADES_ORGANICAS = 56;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl <em>CUnidades Externas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidadesExternas()
	 * @generated
	 */
	int CUNIDADES_EXTERNAS = 55;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesImpl <em>CUnidades</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidades()
	 * @generated
	 */
	int CUNIDADES = 54;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl <em>CEstructuras Funcionales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasFuncionales()
	 * @generated
	 */
	int CESTRUCTURAS_FUNCIONALES = 32;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl <em>CTerminos Glosario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCTerminosGlosario()
	 * @generated
	 */
	int CTERMINOS_GLOSARIO = 53;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl <em>CEntradas Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEntradasAccion()
	 * @generated
	 */
	int CENTRADAS_ACCION = 26;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl <em>CSalidas Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSalidasAccion()
	 * @generated
	 */
	int CSALIDAS_ACCION = 46;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl <em>Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getInterfaz()
	 * @generated
	 */
	int INTERFAZ = 69;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 75;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitanteImpl <em>Rol Solicitante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitanteImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRolSolicitante()
	 * @generated
	 */
	int ROL_SOLICITANTE = 76;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitadoImpl <em>Rol Solicitado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitadoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRolSolicitado()
	 * @generated
	 */
	int ROL_SOLICITADO = 77;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl <em>Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getServicio()
	 * @generated
	 */
	int SERVICIO = 82;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl <em>Importacion Servicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getImportacionServicios()
	 * @generated
	 */
	int IMPORTACION_SERVICIOS = 67;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aplicacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__APLICACION = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION__APLICACIONES = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AAplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPLICACION_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Es Colaborativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ES_COLABORATIVA = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__OPERACIONES = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ACTORES = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ENTRADAS = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__SALIDAS = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ACCIONES = ORGCASI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ETIQUETA_SIMPLE = ORGCASI_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__UNIDADES = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actor De Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_DE_SUCESOS = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACCIONES = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTORES = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__MODEL_CLASS = ACTOR__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__ETIQUETA = ACTOR__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__NOMBRE = ACTOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__COMENTARIO = ACTOR__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__UNIDADES = ACTOR__UNIDADES;

	/**
	 * The feature id for the '<em><b>Actor De Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__ACTOR_DE_SUCESOS = ACTOR__ACTOR_DE_SUCESOS;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__ACCIONES = ACTOR__ACCIONES;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__ACTORES = ACTOR__ACTORES;

	/**
	 * The feature id for the '<em><b>Nombre Funcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Funcional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FUNCIONAL_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl <em>ADocumento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getADocumento()
	 * @generated
	 */
	int ADOCUMENTO = 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__NOMBRE = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__DESCRIPCION = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__DOCUMENTO = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__ESTRUCTURAS_DATOS = ANOTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entradas OSalidas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__ENTRADAS_OSALIDAS = ANOTACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estados</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__ESTADOS = ANOTACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__DOCUMENTOS = ANOTACION_FEATURE_COUNT + 7;


	/**
	 * The feature id for the '<em><b>Todos Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO__TODOS_DOCUMENTOS = ANOTACION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>ADocumento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__OPERACION = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acciones Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__ACCIONES_SUCESO = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION__OPERACIONES = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AOperacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERACION_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__MODEL_CLASS = AOPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__COMENTARIO = AOPERACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__ID_ANOTADA = AOPERACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__VERSION_ANOTADA = AOPERACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__FECHA_ANOTACION = AOPERACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__REALIZADOR_ANOTACION = AOPERACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__RESPONSABLE_ANOTACION = AOPERACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__ETIQUETA = AOPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__OPERACION = AOPERACION__OPERACION;

	/**
	 * The feature id for the '<em><b>Acciones Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__ACCIONES_SUCESO = AOPERACION__ACCIONES_SUCESO;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL__OPERACIONES = AOPERACION__OPERACIONES;

	/**
	 * The number of structural features of the '<em>ADocumento Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTO_FINAL_FEATURE_COUNT = AOPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estructura Funcional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estructuras Funcionales</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AEstructura Funcional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AESTRUCTURA_FUNCIONAL_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flujo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__FLUJO = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flujo De Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__FLUJO_DE_SUCESOS = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO__FLUJOS = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AFlujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFLUJO_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__CODIGO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__DESCRIPCION = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Agrupacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRUPACION_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normativa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__NORMATIVA = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION__NORMATIVAS = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ANormativa YLegislacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANORMATIVA_YLEGISLACION_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Subsistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__SUBSISTEMAS = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__SUCESOS = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__DOCUMENTOS = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__ESTRUCTURAS_DATOS = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__CAMPOS = ANOTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relaciones Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__RELACIONES_DATOS = ANOTACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Importaciones Servicios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__IMPORTACIONES_SERVICIOS = ANOTACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__ETIQUETA = ANOTACION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__PROCEDIMIENTO = ANOTACION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__NORMATIVAS = ANOTACION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Terminos Glosario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__TERMINOS_GLOSARIO = ANOTACION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unidades Organicas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__UNIDADES_ORGANICAS = ANOTACION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unidades Externas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__UNIDADES_EXTERNAS = ANOTACION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__UNIDADES = ANOTACION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Estructuras Funcionales</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES = ANOTACION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__APLICACIONES = ANOTACION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__OPERACIONES = ANOTACION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__FLUJOS = ANOTACION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__ACTORES = ANOTACION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__SISTEMAS = ANOTACION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__PROCEDIMIENTOS = ANOTACION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Todos Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__TODOS_SUCESOS = ANOTACION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Todos Subsistemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__TODOS_SUBSISTEMAS = ANOTACION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Todas Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS = ANOTACION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Todos Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__TODOS_DOCUMENTOS = ANOTACION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO__REPOSITORIO = ANOTACION_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>AProcedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROCEDIMIENTO_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Anotaciones Procedimiento</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__REPOSITORIO = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__MODEL_PACKAGE = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Librerias Servicios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO__LIBRERIAS_SERVICIOS = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ARepositorio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPOSITORIO_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__MODEL_CLASS = AOPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__COMENTARIO = AOPERACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__ID_ANOTADA = AOPERACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__VERSION_ANOTADA = AOPERACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__FECHA_ANOTACION = AOPERACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__REALIZADOR_ANOTACION = AOPERACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__RESPONSABLE_ANOTACION = AOPERACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__ETIQUETA = AOPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__OPERACION = AOPERACION__OPERACION;

	/**
	 * The feature id for the '<em><b>Acciones Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__ACCIONES_SUCESO = AOPERACION__ACCIONES_SUCESO;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO__OPERACIONES = AOPERACION__OPERACIONES;

	/**
	 * The number of structural features of the '<em>ASubprocedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASUBPROCEDIMIENTO_FEATURE_COUNT = AOPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Termino Glosario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__TERMINO_GLOSARIO = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminos Glosario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO__TERMINOS_GLOSARIO = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ATermino Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERMINO_GLOSARIO_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__MODEL_CLASS = ANOTACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__COMENTARIO = ANOTACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__ID_ANOTADA = ANOTACION__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__VERSION_ANOTADA = ANOTACION__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__FECHA_ANOTACION = ANOTACION__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__REALIZADOR_ANOTACION = ANOTACION__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__RESPONSABLE_ANOTACION = ANOTACION__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__ETIQUETA = ANOTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actores Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD__ACTORES_SUCESOS = ANOTACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AUnidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_FEATURE_COUNT = ANOTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__MODEL_CLASS = AUNIDAD__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__COMENTARIO = AUNIDAD__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__ID_ANOTADA = AUNIDAD__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__VERSION_ANOTADA = AUNIDAD__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__FECHA_ANOTACION = AUNIDAD__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__REALIZADOR_ANOTACION = AUNIDAD__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__RESPONSABLE_ANOTACION = AUNIDAD__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__ETIQUETA = AUNIDAD__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Actores Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__ACTORES_SUCESOS = AUNIDAD__ACTORES_SUCESOS;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__UNIDAD = AUNIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA__UNIDADES = AUNIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AUnidad Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_EXTERNA_FEATURE_COUNT = AUNIDAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__MODEL_CLASS = AUNIDAD__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__COMENTARIO = AUNIDAD__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__ID_ANOTADA = AUNIDAD__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__VERSION_ANOTADA = AUNIDAD__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__FECHA_ANOTACION = AUNIDAD__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__REALIZADOR_ANOTACION = AUNIDAD__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__RESPONSABLE_ANOTACION = AUNIDAD__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__ETIQUETA = AUNIDAD__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Actores Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__ACTORES_SUCESOS = AUNIDAD__ACTORES_SUCESOS;

	/**
	 * The feature id for the '<em><b>Tipo Unidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__TIPO_UNIDAD = AUNIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__UNIDAD = AUNIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA__UNIDADES = AUNIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AUnidad Organica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNIDAD_ORGANICA_FEATURE_COUNT = AUNIDAD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl <em>CImportaciones Servicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCImportacionesServicios()
	 * @generated
	 */
	int CIMPORTACIONES_SERVICIOS = 34;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl <em>CUsos Subsistemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsosSubsistemas()
	 * @generated
	 */
	int CUSOS_SUBSISTEMAS = 59;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl <em>CUsado Por Subsistemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsadoPorSubsistemas()
	 * @generated
	 */
	int CUSADO_POR_SUBSISTEMAS = 57;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl <em>CInterfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCInterfaces()
	 * @generated
	 */
	int CINTERFACES = 35;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl <em>CServicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCServicios()
	 * @generated
	 */
	int CSERVICIOS = 48;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl <em>CServicio Usado Por Sucesos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCServicioUsadoPorSucesos()
	 * @generated
	 */
	int CSERVICIO_USADO_POR_SUCESOS = 49;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl <em>Uso Subsistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoSubsistema()
	 * @generated
	 */
	int USO_SUBSISTEMA = 89;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDocumentosImpl <em>Contenedor Documentos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDocumentosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorDocumentos()
	 * @generated
	 */
	int CONTENEDOR_DOCUMENTOS = 40;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiCollectionImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getOrgcasiCollection()
	 * @generated
	 */
	int ORGCASI_COLLECTION = 72;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGCASI_COLLECTION__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGCASI_COLLECTION_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACCIONES_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACCIONES_SUCESO__ACCIONES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACCIONES_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CAcciones Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACCIONES_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl <em>Contenedor Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorDatos()
	 * @generated
	 */
	int CONTENEDOR_DATOS = 39;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl <em>CUsado Por Sucesos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsadoPorSucesos()
	 * @generated
	 */
	int CUSADO_POR_SUCESOS = 58;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES__ACTORES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CActores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_SUCESO__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_SUCESO__ACTORES = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CActores Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACTORES_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__DESCRIPCION = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__TIPO = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__FORMATO = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ejemplo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__EJEMPLO = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requerido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__REQUERIDO = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Valor Por Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__VALOR_POR_DEFECTO = ORGCASI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rango</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__RANGO = ORGCASI_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rango Razonable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__RANGO_RAZONABLE = ORGCASI_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fuente Datos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__FUENTE_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__OBSERVACIONES = ORGCASI_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__ESTRUCTURAS_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS__CAMPOS = ORGCASI_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Campo Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_DATOS_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPLICACIONES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPLICACIONES__APLICACIONES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPLICACIONES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CAplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPLICACIONES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCAMPOS_DATOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCAMPOS_DATOS__CAMPOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCAMPOS_DATOS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CCampos Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCAMPOS_DATOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDOCUMENTOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDOCUMENTOS__DOCUMENTOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDOCUMENTOS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CDocumentos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDOCUMENTOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_ACCION__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_ACCION__ENTRADAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_ACCION__ACCION = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CEntradas Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_ACCION_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_SUCESO__ENTRADAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CEntradas Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRADAS_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CEstructuras Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_SUCESO__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CEstructuras Datos Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_DATOS_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS__FLUJOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CFlujos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS_SUCESO__FLUJOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CFlujos Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFLUJOS_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_FUNCIONALES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Estructuras Funcionales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CEstructuras Funcionales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESTRUCTURAS_FUNCIONALES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl <em>CImportaciones Por</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCImportacionesPor()
	 * @generated
	 */
	int CIMPORTACIONES_POR = 33;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_POR__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_POR__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libreria Servicios</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_POR__LIBRERIA_SERVICIOS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Importado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_POR__IMPORTADO_POR = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CImportaciones Por</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_POR_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_SERVICIOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Importador</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_SERVICIOS__IMPORTADOR = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importaciones Servicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CImportaciones Servicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMPORTACIONES_SERVICIOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERFACES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERFACES__INTERFACES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libreria Servicios</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERFACES__LIBRERIA_SERVICIOS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CInterfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERFACES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl <em>CLibrerias Servicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCLibreriasServicios()
	 * @generated
	 */
	int CLIBRERIAS_SERVICIOS = 36;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIBRERIAS_SERVICIOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Librerias Servicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIBRERIAS_SERVICIOS__REPOSITORIO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CLibrerias Servicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIBRERIAS_SERVICIOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNORMATIVAS_YLEGISLACIONES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNORMATIVAS_YLEGISLACIONES__NORMATIVAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CNormativas YLegislaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNORMATIVAS_YLEGISLACIONES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS__ESTRUCTURAS_DATOS = 0;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS__CAMPOS = 1;

	/**
	 * The feature id for the '<em><b>Relaciones Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS__RELACIONES_DATOS = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DOCUMENTOS__DOCUMENTOS = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Documentos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DOCUMENTOS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SUCESOS__SUCESOS = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Sucesos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SUCESOS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Subsistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Subsistemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SUBSISTEMAS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPERACIONES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPERACIONES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPERACIONES__OPERACIONES = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>COperaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPERACIONES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDIMIENTOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDIMIENTOS__PROCEDIMIENTOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDIMIENTOS__REPOSITORIO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CProcedimientos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDIMIENTOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRELACIONES_DATOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Relaciones Datos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRELACIONES_DATOS__RELACIONES_DATOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRELACIONES_DATOS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CRelaciones Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRELACIONES_DATOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_ACCION__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_ACCION__SALIDAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_ACCION__ACCION = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSalidas Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_ACCION_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_SUCESO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_SUCESO__SALIDAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_SUCESO__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSalidas Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSALIDAS_SUCESO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Interfaz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIOS__INTERFAZ = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIOS__SERVICIOS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CServicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIO_USADO_POR_SUCESOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIO_USADO_POR_SUCESOS__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIO_USADO_POR_SUCESOS__SERVICIO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usos Servicio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CServicio Usado Por Sucesos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSERVICIO_USADO_POR_SUCESOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSISTEMAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Sistemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSISTEMAS__SISTEMAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSISTEMAS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSistemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSISTEMAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUBSISTEMAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Subsistemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUBSISTEMAS__SUBSISTEMAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUBSISTEMAS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUBSISTEMAS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSubsistemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUBSISTEMAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUCESOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUCESOS__SUCESOS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUCESOS__CONTENEDOR = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUCESOS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSucesos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUCESOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINOS_GLOSARIO__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Terminos Glosario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINOS_GLOSARIO__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CTerminos Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINOS_GLOSARIO_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES__UNIDADES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CUnidades</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_EXTERNAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_EXTERNAS__UNIDADES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_EXTERNAS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CUnidades Externas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_EXTERNAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_ORGANICAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_ORGANICAS__UNIDADES = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_ORGANICAS__PROCEDIMIENTO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CUnidades Organicas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUNIDADES_ORGANICAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUBSISTEMAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUBSISTEMAS__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usado Por Subsistemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subsistema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUBSISTEMAS__SUBSISTEMA = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CUsado Por Subsistemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUBSISTEMAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUCESOS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUCESOS__ETIQUETA = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUCESOS__SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usos Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUCESOS__USOS_SUCESO = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CUsado Por Sucesos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSADO_POR_SUCESOS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSOS_SUBSISTEMAS__MODEL_CLASS = ORGCASI_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Usos Subsistemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS = ORGCASI_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsistema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSOS_SUBSISTEMAS__SUBSISTEMA = ORGCASI_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CUsos Subsistemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSOS_SUBSISTEMAS_FEATURE_COUNT = ORGCASI_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl <em>Documento En Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getDocumentoEnEstado()
	 * @generated
	 */
	int DOCUMENTO_EN_ESTADO = 60;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__MODEL_CLASS = ADOCUMENTO__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__COMENTARIO = ADOCUMENTO__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Id Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__ID_ANOTADA = ADOCUMENTO__ID_ANOTADA;

	/**
	 * The feature id for the '<em><b>Version Anotada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__VERSION_ANOTADA = ADOCUMENTO__VERSION_ANOTADA;

	/**
	 * The feature id for the '<em><b>Fecha Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__FECHA_ANOTACION = ADOCUMENTO__FECHA_ANOTACION;

	/**
	 * The feature id for the '<em><b>Realizador Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__REALIZADOR_ANOTACION = ADOCUMENTO__REALIZADOR_ANOTACION;

	/**
	 * The feature id for the '<em><b>Responsable Anotacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__RESPONSABLE_ANOTACION = ADOCUMENTO__RESPONSABLE_ANOTACION;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__ETIQUETA = ADOCUMENTO__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__NOMBRE = ADOCUMENTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__DESCRIPCION = ADOCUMENTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__DOCUMENTO = ADOCUMENTO__DOCUMENTO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__ESTRUCTURAS_DATOS = ADOCUMENTO__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Entradas OSalidas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__ENTRADAS_OSALIDAS = ADOCUMENTO__ENTRADAS_OSALIDAS;

	/**
	 * The feature id for the '<em><b>Estados</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__ESTADOS = ADOCUMENTO__ESTADOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__DOCUMENTOS = ADOCUMENTO__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Todos Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__TODOS_DOCUMENTOS = ADOCUMENTO__TODOS_DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Condiciones Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO = ADOCUMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documento Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE = ADOCUMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documento En Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_EN_ESTADO_FEATURE_COUNT = ADOCUMENTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__DESCRIPCION = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__ESTRUCTURAS_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA__DOCUMENTOS = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entrada OSalida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_OSALIDA_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__MODEL_CLASS = ENTRADA_OSALIDA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__NOMBRE = ENTRADA_OSALIDA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__ES_DOCUMENTO_PAPEL = ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__DESCRIPCION = ENTRADA_OSALIDA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__COMENTARIO = ENTRADA_OSALIDA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__ESTRUCTURAS_DATOS = ENTRADA_OSALIDA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__DOCUMENTOS = ENTRADA_OSALIDA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Fuentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__FUENTES = ENTRADA_OSALIDA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entrada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_FEATURE_COUNT = ENTRADA_OSALIDA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__MODEL_CLASS = ENTRADA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__NOMBRE = ENTRADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__ES_DOCUMENTO_PAPEL = ENTRADA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__DESCRIPCION = ENTRADA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__COMENTARIO = ENTRADA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__ESTRUCTURAS_DATOS = ENTRADA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__DOCUMENTOS = ENTRADA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Fuentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__FUENTES = ENTRADA__FUENTES;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__ETIQUETA = ENTRADA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__ETIQUETA_SIMPLE = ENTRADA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION__ENTRADAS = ENTRADA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entrada Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_ACCION_FEATURE_COUNT = ENTRADA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__MODEL_CLASS = ENTRADA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__NOMBRE = ENTRADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__ES_DOCUMENTO_PAPEL = ENTRADA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__DESCRIPCION = ENTRADA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__COMENTARIO = ENTRADA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__ESTRUCTURAS_DATOS = ENTRADA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__DOCUMENTOS = ENTRADA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Fuentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__FUENTES = ENTRADA__FUENTES;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__ETIQUETA = ENTRADA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__SERVICIO = ENTRADA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO__ETIQUETA_SIMPLE = ENTRADA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entrada Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SERVICIO_FEATURE_COUNT = ENTRADA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__MODEL_CLASS = ENTRADA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__NOMBRE = ENTRADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ES_DOCUMENTO_PAPEL = ENTRADA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__DESCRIPCION = ENTRADA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__COMENTARIO = ENTRADA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ESTRUCTURAS_DATOS = ENTRADA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__DOCUMENTOS = ENTRADA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Fuentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__FUENTES = ENTRADA__FUENTES;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ETIQUETA = ENTRADA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Informacion Previa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ES_INFORMACION_PREVIA = ENTRADA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ENTRADAS = ENTRADA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO__ETIQUETA_SIMPLE = ENTRADA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entrada Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_SUCESO_FEATURE_COUNT = ENTRADA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__CAMPOS = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__DOCUMENTOS = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Miembro Relaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__MIEMBRO_RELACIONES = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entradas OSalidas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estructura Datos De Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO = ORGCASI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Coleccion Estructura Datos De Suceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO = ORGCASI_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Estructura Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_DATOS_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTACION_SERVICIOS__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTACION_SERVICIOS__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importaciones Servicios</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libreria Servicios</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Importacion Servicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTACION_SERVICIOS_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl <em>Libreria Servicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getLibreriaServicios()
	 * @generated
	 */
	int LIBRERIA_SERVICIOS = 70;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportadorServiciosImpl <em>Importador Servicios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.ImportadorServiciosImpl
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getImportadorServicios()
	 * @generated
	 */
	int IMPORTADOR_SERVICIOS = 68;

	/**
	 * The feature id for the '<em><b>Importaciones Servicios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS = 0;

	/**
	 * The number of structural features of the '<em>Importador Servicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTADOR_SERVICIOS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Servicios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__SERVICIOS = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__INTERFACES = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rol Solicitante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__ROL_SOLICITANTE = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rol Solicitado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__ROL_SOLICITADO = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__DOCUMENTOS = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__CAMPOS = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relaciones Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__RELACIONES_DATOS = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Importaciones Servicios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Importado Por</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__IMPORTADO_POR = AGRUPACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Librerias Servicios</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS = AGRUPACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__INTERFACES = AGRUPACION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Todos Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__TODOS_DOCUMENTOS = AGRUPACION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Todas Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__TODAS_ESTRUCTURAS_DATOS = AGRUPACION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS__REPOSITORIO = AGRUPACION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Libreria Servicios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRERIA_SERVICIOS_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tipo Relacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__TIPO_RELACION = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multiplicidad Minima</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multiplicidad Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estructura Datos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__ESTRUCTURA_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION__RELACION = ORGCASI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Miembro Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIEMBRO_RELACION_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Miembros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__MIEMBROS = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relaciones Datos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS__RELACIONES_DATOS = ORGCASI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relacion Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_DATOS_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NOMBRE = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__COMENTARIO = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE__MODEL_CLASS = ROL__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE__ETIQUETA = ROL__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE__NOMBRE = ROL__NOMBRE;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE__COMENTARIO = ROL__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Interfaz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE__INTERFAZ = ROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rol Solicitante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITANTE_FEATURE_COUNT = ROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO__MODEL_CLASS = ROL__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO__ETIQUETA = ROL__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO__NOMBRE = ROL__NOMBRE;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO__COMENTARIO = ROL__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Interfaz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO__INTERFAZ = ROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rol Solicitado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_SOLICITADO_FEATURE_COUNT = ROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__MODEL_CLASS = ENTRADA_OSALIDA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__NOMBRE = ENTRADA_OSALIDA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ES_DOCUMENTO_PAPEL = ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__DESCRIPCION = ENTRADA_OSALIDA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__COMENTARIO = ENTRADA_OSALIDA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ESTRUCTURAS_DATOS = ENTRADA_OSALIDA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__DOCUMENTOS = ENTRADA_OSALIDA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Destinos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__DESTINOS = ENTRADA_OSALIDA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_FEATURE_COUNT = ENTRADA_OSALIDA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__MODEL_CLASS = SALIDA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__NOMBRE = SALIDA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__ES_DOCUMENTO_PAPEL = SALIDA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__DESCRIPCION = SALIDA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__COMENTARIO = SALIDA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__ESTRUCTURAS_DATOS = SALIDA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__DOCUMENTOS = SALIDA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Destinos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__DESTINOS = SALIDA__DESTINOS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__ETIQUETA = SALIDA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__ETIQUETA_SIMPLE = SALIDA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION__SALIDAS = SALIDA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Salida Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_ACCION_FEATURE_COUNT = SALIDA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__MODEL_CLASS = SALIDA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__NOMBRE = SALIDA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__ES_DOCUMENTO_PAPEL = SALIDA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__DESCRIPCION = SALIDA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__COMENTARIO = SALIDA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__ESTRUCTURAS_DATOS = SALIDA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__DOCUMENTOS = SALIDA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Destinos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__DESTINOS = SALIDA__DESTINOS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__ETIQUETA = SALIDA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__SERVICIO = SALIDA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO__ETIQUETA_SIMPLE = SALIDA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Salida Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SERVICIO_FEATURE_COUNT = SALIDA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__MODEL_CLASS = SALIDA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__NOMBRE = SALIDA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Es Documento Papel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__ES_DOCUMENTO_PAPEL = SALIDA__ES_DOCUMENTO_PAPEL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__DESCRIPCION = SALIDA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__COMENTARIO = SALIDA__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__ESTRUCTURAS_DATOS = SALIDA__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__DOCUMENTOS = SALIDA__DOCUMENTOS;

	/**
	 * The feature id for the '<em><b>Destinos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__DESTINOS = SALIDA__DESTINOS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__ETIQUETA = SALIDA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Es Distribucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__ES_DISTRIBUCION = SALIDA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__SALIDAS = SALIDA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO__ETIQUETA_SIMPLE = SALIDA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Salida Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_SUCESO_FEATURE_COUNT = SALIDA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__USADO_POR_SUCESOS = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicios</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__SERVICIOS = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ENTRADAS = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__SALIDAS = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Subsistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__SUBSISTEMAS = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__SUCESOS = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__PROCEDIMIENTO = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Todos Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__TODOS_SUCESOS = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Todos Subsistemas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__TODOS_SUBSISTEMAS = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sistemas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__SISTEMAS = AGRUPACION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__SUCESOS = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo Subsistema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__TIPO_SUBSISTEMA = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__PROCEDIMIENTO = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Todos Sucesos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__TODOS_SUCESOS = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usos Subsistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__USOS_SUBSISTEMAS = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usado Por Subsistemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__USADO_POR_SUBSISTEMAS = AGRUPACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subsistemas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA__SUBSISTEMAS = AGRUPACION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Subsistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSISTEMA_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__MODEL_CLASS = AGRUPACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ETIQUETA = AGRUPACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__NOMBRE = AGRUPACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__CODIGO = AGRUPACION__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__DESCRIPCION = AGRUPACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__COMENTARIO = AGRUPACION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__PRIORIDAD = AGRUPACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__TIPO = AGRUPACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rendimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__RENDIMIENTO = AGRUPACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disparo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__DISPARO = AGRUPACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distribucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__DISTRIBUCION = AGRUPACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pre Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__PRE_CONDICION = AGRUPACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Post Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__POST_CONDICION = AGRUPACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Es Colaborativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ES_COLABORATIVO = AGRUPACION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ACCIONES = AGRUPACION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ACTORES = AGRUPACION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ESTRUCTURAS_DATOS = AGRUPACION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__FLUJOS = AGRUPACION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__ENTRADAS = AGRUPACION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__SALIDAS = AGRUPACION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__USADO_POR_SUCESOS = AGRUPACION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__PROCEDIMIENTO = AGRUPACION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO__SUCESOS = AGRUPACION_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_FEATURE_COUNT = AGRUPACION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__MODEL_CLASS = SUCESO__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ETIQUETA = SUCESO__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__NOMBRE = SUCESO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__CODIGO = SUCESO__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__DESCRIPCION = SUCESO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__COMENTARIO = SUCESO__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__PRIORIDAD = SUCESO__PRIORIDAD;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__TIPO = SUCESO__TIPO;

	/**
	 * The feature id for the '<em><b>Rendimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__RENDIMIENTO = SUCESO__RENDIMIENTO;

	/**
	 * The feature id for the '<em><b>Disparo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__DISPARO = SUCESO__DISPARO;

	/**
	 * The feature id for the '<em><b>Distribucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__DISTRIBUCION = SUCESO__DISTRIBUCION;

	/**
	 * The feature id for the '<em><b>Pre Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__PRE_CONDICION = SUCESO__PRE_CONDICION;

	/**
	 * The feature id for the '<em><b>Post Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__POST_CONDICION = SUCESO__POST_CONDICION;

	/**
	 * The feature id for the '<em><b>Es Colaborativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ES_COLABORATIVO = SUCESO__ES_COLABORATIVO;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ACCIONES = SUCESO__ACCIONES;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ACTORES = SUCESO__ACTORES;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ESTRUCTURAS_DATOS = SUCESO__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__FLUJOS = SUCESO__FLUJOS;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__ENTRADAS = SUCESO__ENTRADAS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__SALIDAS = SUCESO__SALIDAS;

	/**
	 * The feature id for the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__USADO_POR_SUCESOS = SUCESO__USADO_POR_SUCESOS;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__PROCEDIMIENTO = SUCESO__PROCEDIMIENTO;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR__SUCESOS = SUCESO__SUCESOS;

	/**
	 * The number of structural features of the '<em>Suceso Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSTRUCTOR_FEATURE_COUNT = SUCESO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__MODEL_CLASS = SUCESO__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ETIQUETA = SUCESO__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__NOMBRE = SUCESO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__CODIGO = SUCESO__CODIGO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__DESCRIPCION = SUCESO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__COMENTARIO = SUCESO__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Prioridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__PRIORIDAD = SUCESO__PRIORIDAD;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__TIPO = SUCESO__TIPO;

	/**
	 * The feature id for the '<em><b>Rendimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__RENDIMIENTO = SUCESO__RENDIMIENTO;

	/**
	 * The feature id for the '<em><b>Disparo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__DISPARO = SUCESO__DISPARO;

	/**
	 * The feature id for the '<em><b>Distribucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__DISTRIBUCION = SUCESO__DISTRIBUCION;

	/**
	 * The feature id for the '<em><b>Pre Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__PRE_CONDICION = SUCESO__PRE_CONDICION;

	/**
	 * The feature id for the '<em><b>Post Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__POST_CONDICION = SUCESO__POST_CONDICION;

	/**
	 * The feature id for the '<em><b>Es Colaborativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ES_COLABORATIVO = SUCESO__ES_COLABORATIVO;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ACCIONES = SUCESO__ACCIONES;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ACTORES = SUCESO__ACTORES;

	/**
	 * The feature id for the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ESTRUCTURAS_DATOS = SUCESO__ESTRUCTURAS_DATOS;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__FLUJOS = SUCESO__FLUJOS;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__ENTRADAS = SUCESO__ENTRADAS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__SALIDAS = SUCESO__SALIDAS;

	/**
	 * The feature id for the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__USADO_POR_SUCESOS = SUCESO__USADO_POR_SUCESOS;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__PROCEDIMIENTO = SUCESO__PROCEDIMIENTO;

	/**
	 * The feature id for the '<em><b>Sucesos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR__SUCESOS = SUCESO__SUCESOS;

	/**
	 * The number of structural features of the '<em>Suceso Consultor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCESO_CONSULTOR_FEATURE_COUNT = SUCESO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__MODEL_CLASS = ACCION__MODEL_CLASS;


	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ETIQUETA = ACCION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__COMENTARIO = ACCION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Es Colaborativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ES_COLABORATIVA = ACCION__ES_COLABORATIVA;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__OPERACIONES = ACCION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ACTORES = ACCION__ACTORES;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ENTRADAS = ACCION__ENTRADAS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__SALIDAS = ACCION__SALIDAS;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ACCIONES = ACCION__ACCIONES;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__ETIQUETA_SIMPLE = ACCION__ETIQUETA_SIMPLE;

	/**
	 * The feature id for the '<em><b>Servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO__SERVICIO = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uso Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SERVICIO_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUBSISTEMA__MODEL_CLASS = ORGCASI_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUBSISTEMA__ETIQUETA = ORGCASI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsistema Usado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUBSISTEMA__SUBSISTEMA_USADO = ORGCASI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usos Subsistemas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUBSISTEMA__USOS_SUBSISTEMAS = ORGCASI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uso Subsistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUBSISTEMA_FEATURE_COUNT = ORGCASI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__MODEL_CLASS = ACCION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ETIQUETA = ACCION__ETIQUETA;



	/**
	 * The feature id for the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__COMENTARIO = ACCION__COMENTARIO;

	/**
	 * The feature id for the '<em><b>Es Colaborativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ES_COLABORATIVA = ACCION__ES_COLABORATIVA;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__OPERACIONES = ACCION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ACTORES = ACCION__ACTORES;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ENTRADAS = ACCION__ENTRADAS;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__SALIDAS = ACCION__SALIDAS;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ACCIONES = ACCION__ACCIONES;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__ETIQUETA_SIMPLE = ACCION__ETIQUETA_SIMPLE;

	/**
	 * The feature id for the '<em><b>Suceso Usado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO__SUCESO_USADO = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uso Suceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_SUCESO_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento <em>Tipo Uso Documento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoUsoDocumento()
	 * @generated
	 */
	int TIPO_USO_DOCUMENTO = 91;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoPrioridad <em>Tipo Prioridad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPrioridad
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoPrioridad()
	 * @generated
	 */
	int TIPO_PRIORIDAD = 92;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoUnidad <em>Tipo Unidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUnidad
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoUnidad()
	 * @generated
	 */
	int TIPO_UNIDAD = 93;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoSubsistema <em>Tipo Subsistema</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoSubsistema
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoSubsistema()
	 * @generated
	 */
	int TIPO_SUBSISTEMA = 94;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoRelacion <em>Tipo Relacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoRelacion
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoRelacion()
	 * @generated
	 */
	int TIPO_RELACION = 95;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida <em>Tipo Agrupacion Predefinida</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoAgrupacionPredefinida()
	 * @generated
	 */
	int TIPO_AGRUPACION_PREDEFINIDA = 96;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion <em>Tipo Propiedad Clase Agrupacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion
	 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoPropiedadClaseAgrupacion()
	 * @generated
	 */
	int TIPO_PROPIEDAD_CLASE_AGRUPACION = 97;


	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio <em>ARepositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARepositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio
	 * @generated
	 */
	EClass getARepositorio();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento <em>Anotaciones Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anotaciones Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento()
	 * @see #getARepositorio()
	 * @generated
	 */
	EReference getARepositorio_AnotacionesProcedimiento();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getRepositorio()
	 * @see #getARepositorio()
	 * @generated
	 */
	EReference getARepositorio_Repositorio();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Package</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getModelPackage()
	 * @see #getARepositorio()
	 * @generated
	 */
	EReference getARepositorio_ModelPackage();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Librerias Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios()
	 * @see #getARepositorio()
	 * @generated
	 */
	EReference getARepositorio_LibreriasServicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento <em>AProcedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AProcedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento
	 * @generated
	 */
	EClass getAProcedimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEtiqueta()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EAttribute getAProcedimiento_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimiento()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Procedimiento();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normativas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Normativas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminos Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_TerminosGlosario();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unidades Organicas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_UnidadesOrganicas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesExternas <em>Unidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unidades Externas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesExternas()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_UnidadesExternas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Unidades();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_EstructurasFuncionales();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Aplicaciones();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Operaciones();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getFlujos()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Flujos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Actores();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Sistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimientos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Procedimientos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSucesos <em>Todos Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSucesos()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_TodosSucesos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSubsistemas <em>Todos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSubsistemas()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_TodosSubsistemas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todas Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodasEstructurasDatos()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_TodasEstructurasDatos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosDocumentos <em>Todos Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosDocumentos()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_TodosDocumentos();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getRepositorio()
	 * @see #getAProcedimiento()
	 * @generated
	 */
	EReference getAProcedimiento_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion <em>AAplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAplicacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion
	 * @generated
	 */
	EClass getAAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion#getEtiqueta()
	 * @see #getAAplicacion()
	 * @generated
	 */
	EAttribute getAAplicacion_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aplicacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicacion()
	 * @see #getAAplicacion()
	 * @generated
	 */
	EReference getAAplicacion_Aplicacion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones()
	 * @see #getAAplicacion()
	 * @generated
	 */
	EReference getAAplicacion_Aplicaciones();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidad <em>AUnidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AUnidad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidad
	 * @generated
	 */
	EClass getAUnidad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AUnidad#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidad#getEtiqueta()
	 * @see #getAUnidad()
	 * @generated
	 */
	EAttribute getAUnidad_Etiqueta();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AUnidad#getActoresSucesos <em>Actores Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actores Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidad#getActoresSucesos()
	 * @see #getAUnidad()
	 * @generated
	 */
	EReference getAUnidad_ActoresSucesos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica <em>AUnidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AUnidad Organica</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica
	 * @generated
	 */
	EClass getAUnidadOrganica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Unidad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getTipoUnidad()
	 * @see #getAUnidadOrganica()
	 * @generated
	 */
	EAttribute getAUnidadOrganica_TipoUnidad();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unidad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidad()
	 * @see #getAUnidadOrganica()
	 * @generated
	 */
	EReference getAUnidadOrganica_Unidad();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades()
	 * @see #getAUnidadOrganica()
	 * @generated
	 */
	EReference getAUnidadOrganica_Unidades();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna <em>AUnidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AUnidad Externa</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadExterna
	 * @generated
	 */
	EClass getAUnidadExterna();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unidad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidad()
	 * @see #getAUnidadExterna()
	 * @generated
	 */
	EReference getAUnidadExterna_Unidad();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidades()
	 * @see #getAUnidadExterna()
	 * @generated
	 */
	EReference getAUnidadExterna_Unidades();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional <em>AEstructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AEstructura Funcional</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional
	 * @generated
	 */
	EClass getAEstructuraFuncional();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEtiqueta()
	 * @see #getAEstructuraFuncional()
	 * @generated
	 */
	EAttribute getAEstructuraFuncional_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructuraFuncional <em>Estructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estructura Funcional</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructuraFuncional()
	 * @see #getAEstructuraFuncional()
	 * @generated
	 */
	EReference getAEstructuraFuncional_EstructuraFuncional();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales()
	 * @see #getAEstructuraFuncional()
	 * @generated
	 */
	EReference getAEstructuraFuncional_EstructurasFuncionales();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario <em>ATermino Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATermino Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario
	 * @generated
	 */
	EClass getATerminoGlosario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getEtiqueta()
	 * @see #getATerminoGlosario()
	 * @generated
	 */
	EAttribute getATerminoGlosario_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminoGlosario <em>Termino Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Termino Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminoGlosario()
	 * @see #getATerminoGlosario()
	 * @generated
	 */
	EReference getATerminoGlosario_TerminoGlosario();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Terminos Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario()
	 * @see #getATerminoGlosario()
	 * @generated
	 */
	EReference getATerminoGlosario_TerminosGlosario();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion <em>ANormativa YLegislacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANormativa YLegislacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion
	 * @generated
	 */
	EClass getANormativaYLegislacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getEtiqueta()
	 * @see #getANormativaYLegislacion()
	 * @generated
	 */
	EAttribute getANormativaYLegislacion_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativa <em>Normativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Normativa</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativa()
	 * @see #getANormativaYLegislacion()
	 * @generated
	 */
	EReference getANormativaYLegislacion_Normativa();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Normativas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas()
	 * @see #getANormativaYLegislacion()
	 * @generated
	 */
	EReference getANormativaYLegislacion_Normativas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion <em>AOperacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AOperacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion
	 * @generated
	 */
	EClass getAOperacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getEtiqueta()
	 * @see #getAOperacion()
	 * @generated
	 */
	EAttribute getAOperacion_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperacion()
	 * @see #getAOperacion()
	 * @generated
	 */
	EReference getAOperacion_Operacion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones()
	 * @see #getAOperacion()
	 * @generated
	 */
	EReference getAOperacion_Operaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getAccionesSuceso <em>Acciones Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acciones Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getAccionesSuceso()
	 * @see #getAOperacion()
	 * @generated
	 */
	EReference getAOperacion_AccionesSuceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento <em>ASubprocedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASubprocedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento
	 * @generated
	 */
	EClass getASubprocedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal <em>ADocumento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADocumento Final</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal
	 * @generated
	 */
	EClass getADocumentoFinal();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo <em>AFlujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFlujo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo
	 * @generated
	 */
	EClass getAFlujo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo#getEtiqueta()
	 * @see #getAFlujo()
	 * @generated
	 */
	EAttribute getAFlujo_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flujo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujo()
	 * @see #getAFlujo()
	 * @generated
	 */
	EReference getAFlujo_Flujo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujos()
	 * @see #getAFlujo()
	 * @generated
	 */
	EReference getAFlujo_Flujos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujoDeSucesos <em>Flujo De Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flujo De Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujoDeSucesos()
	 * @see #getAFlujo()
	 * @generated
	 */
	EReference getAFlujo_FlujoDeSucesos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos <em>Campo Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos
	 * @generated
	 */
	EClass getCampoDatos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEtiqueta()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getNombre()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getDescripcion()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getTipo()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFormato <em>Formato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formato</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFormato()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Formato();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEjemplo <em>Ejemplo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejemplo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEjemplo()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Ejemplo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRequerido <em>Requerido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requerido</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRequerido()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Requerido();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getValorPorDefecto <em>Valor Por Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Por Defecto</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getValorPorDefecto()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_ValorPorDefecto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRango <em>Rango</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rango</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRango()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Rango();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRangoRazonable <em>Rango Razonable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rango Razonable</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRangoRazonable()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_RangoRazonable();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFuenteDatos <em>Fuente Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuente Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFuenteDatos()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_FuenteDatos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getObservaciones()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Observaciones();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getComentario()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EAttribute getCampoDatos_Comentario();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEstructurasDatos()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EReference getCampoDatos_EstructurasDatos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Campos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos()
	 * @see #getCampoDatos()
	 * @generated
	 */
	EReference getCampoDatos_Campos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos <em>Estructura Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estructura Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos
	 * @generated
	 */
	EClass getEstructuraDatos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEtiqueta()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EAttribute getEstructuraDatos_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getNombre()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EAttribute getEstructuraDatos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getComentario()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EAttribute getEstructuraDatos_Comentario();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Campos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getCampos()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_Campos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getDocumentos()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_Documentos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getMiembroRelaciones <em>Miembro Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Miembro Relaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getMiembroRelaciones()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_MiembroRelaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEntradasOSalidas <em>Entradas OSalidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entradas OSalidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEntradasOSalidas()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_EntradasOSalidas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructuraDatosDeSuceso <em>Estructura Datos De Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructura Datos De Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructuraDatosDeSuceso()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_EstructuraDatosDeSuceso();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getColeccionEstructuraDatosDeSuceso <em>Coleccion Estructura Datos De Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coleccion Estructura Datos De Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getColeccionEstructuraDatosDeSuceso()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_ColeccionEstructuraDatosDeSuceso();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos()
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	EReference getEstructuraDatos_EstructurasDatos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos <em>Relacion Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos
	 * @generated
	 */
	EClass getRelacionDatos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getEtiqueta()
	 * @see #getRelacionDatos()
	 * @generated
	 */
	EAttribute getRelacionDatos_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getNombre()
	 * @see #getRelacionDatos()
	 * @generated
	 */
	EAttribute getRelacionDatos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getComentario()
	 * @see #getRelacionDatos()
	 * @generated
	 */
	EAttribute getRelacionDatos_Comentario();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getMiembros <em>Miembros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Miembros</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getMiembros()
	 * @see #getRelacionDatos()
	 * @generated
	 */
	EReference getRelacionDatos_Miembros();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relaciones Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos()
	 * @see #getRelacionDatos()
	 * @generated
	 */
	EReference getRelacionDatos_RelacionesDatos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion <em>Miembro Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miembro Relacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion
	 * @generated
	 */
	EClass getMiembroRelacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEtiqueta()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getNombre()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getComentario()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_Comentario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getTipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Relacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getTipoRelacion()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_TipoRelacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMinima <em>Multiplicidad Minima</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Minima</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMinima()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_MultiplicidadMinima();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMaxima <em>Multiplicidad Maxima</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Maxima</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMaxima()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EAttribute getMiembroRelacion_MultiplicidadMaxima();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos <em>Estructura Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estructura Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EReference getMiembroRelacion_EstructuraDatos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion()
	 * @see #getMiembroRelacion()
	 * @generated
	 */
	EReference getMiembroRelacion_Relacion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion <em>Agrupacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agrupacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion
	 * @generated
	 */
	EClass getAgrupacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion#getEtiqueta()
	 * @see #getAgrupacion()
	 * @generated
	 */
	EAttribute getAgrupacion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion#getNombre()
	 * @see #getAgrupacion()
	 * @generated
	 */
	EAttribute getAgrupacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion#getCodigo()
	 * @see #getAgrupacion()
	 * @generated
	 */
	EAttribute getAgrupacion_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion#getDescripcion()
	 * @see #getAgrupacion()
	 * @generated
	 */
	EAttribute getAgrupacion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Agrupacion#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Agrupacion#getComentario()
	 * @see #getAgrupacion()
	 * @generated
	 */
	EAttribute getAgrupacion_Comentario();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Suceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso
	 * @generated
	 */
	EClass getSuceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPrioridad <em>Prioridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prioridad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getPrioridad()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_Prioridad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getTipo()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getRendimiento <em>Rendimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rendimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getRendimiento()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_Rendimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDisparo <em>Disparo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disparo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getDisparo()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_Disparo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDistribucion <em>Distribucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribucion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getDistribucion()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_Distribucion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPreCondicion <em>Pre Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Condicion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getPreCondicion()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_PreCondicion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPostCondicion <em>Post Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Condicion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getPostCondicion()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_PostCondicion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#isEsColaborativo <em>Es Colaborativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Colaborativo</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#isEsColaborativo()
	 * @see #getSuceso()
	 * @generated
	 */
	EAttribute getSuceso_EsColaborativo();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Acciones();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getActores()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Actores();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_EstructurasDatos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Flujos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Entradas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Salidas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos <em>Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usado Por Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_UsadoPorSucesos();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getProcedimiento()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Procedimiento();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos()
	 * @see #getSuceso()
	 * @generated
	 */
	EReference getSuceso_Sucesos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.SucesoConsultor <em>Suceso Consultor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suceso Consultor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SucesoConsultor
	 * @generated
	 */
	EClass getSucesoConsultor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.SucesoConstructor <em>Suceso Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suceso Constructor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SucesoConstructor
	 * @generated
	 */
	EClass getSucesoConstructor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema
	 * @generated
	 */
	EClass getSistema();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema#getProcedimiento()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_Procedimiento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSucesos <em>Todos Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSucesos()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_TodosSucesos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSubsistemas <em>Todos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSubsistemas()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_TodosSubsistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_Sistemas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema
	 * @generated
	 */
	EClass getSubsistema();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getTipoSubsistema <em>Tipo Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getTipoSubsistema()
	 * @see #getSubsistema()
	 * @generated
	 */
	EAttribute getSubsistema_TipoSubsistema();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getProcedimiento()
	 * @see #getSubsistema()
	 * @generated
	 */
	EReference getSubsistema_Procedimiento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getTodosSucesos <em>Todos Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getTodosSucesos()
	 * @see #getSubsistema()
	 * @generated
	 */
	EReference getSubsistema_TodosSucesos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas()
	 * @see #getSubsistema()
	 * @generated
	 */
	EReference getSubsistema_UsosSubsistemas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usado Por Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas()
	 * @see #getSubsistema()
	 * @generated
	 */
	EReference getSubsistema_UsadoPorSubsistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas()
	 * @see #getSubsistema()
	 * @generated
	 */
	EReference getSubsistema_Subsistemas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getEtiqueta()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getNombre()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getComentario()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Comentario();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getUnidades()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Unidades();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActorDeSucesos <em>Actor De Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor De Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getActorDeSucesos()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ActorDeSucesos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getAcciones()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Acciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getActores()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Actores();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ActorFuncional <em>Actor Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Funcional</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ActorFuncional
	 * @generated
	 */
	EClass getActorFuncional();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ActorFuncional#getNombreFuncional <em>Nombre Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Funcional</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ActorFuncional#getNombreFuncional()
	 * @see #getActorFuncional()
	 * @generated
	 */
	EAttribute getActorFuncional_NombreFuncional();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento <em>ADocumento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADocumento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento
	 * @generated
	 */
	EClass getADocumento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEtiqueta()
	 * @see #getADocumento()
	 * @generated
	 */
	EAttribute getADocumento_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumento()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_Documento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getNombre()
	 * @see #getADocumento()
	 * @generated
	 */
	EAttribute getADocumento_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getDescripcion()
	 * @see #getADocumento()
	 * @generated
	 */
	EAttribute getADocumento_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstructurasDatos()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_EstructurasDatos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEntradasOSalidas <em>Entradas OSalidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entradas OSalidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEntradasOSalidas()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_EntradasOSalidas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstados <em>Estados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estados</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstados()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_Estados();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumentos()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_Documentos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getTodosDocumentos <em>Todos Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getTodosDocumentos()
	 * @see #getADocumento()
	 * @generated
	 */
	EReference getADocumento_TodosDocumentos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida <em>Entrada OSalida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada OSalida</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida
	 * @generated
	 */
	EClass getEntradaOSalida();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getNombre()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EAttribute getEntradaOSalida_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#isEsDocumentoPapel <em>Es Documento Papel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Documento Papel</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#isEsDocumentoPapel()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EAttribute getEntradaOSalida_EsDocumentoPapel();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDescripcion()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EAttribute getEntradaOSalida_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getComentario()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EAttribute getEntradaOSalida_Comentario();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getEstructurasDatos()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EReference getEntradaOSalida_EstructurasDatos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDocumentos()
	 * @see #getEntradaOSalida()
	 * @generated
	 */
	EReference getEntradaOSalida_Documentos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Entrada
	 * @generated
	 */
	EClass getEntrada();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Entrada#getFuentes <em>Fuentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuentes</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Entrada#getFuentes()
	 * @see #getEntrada()
	 * @generated
	 */
	EReference getEntrada_Fuentes();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Salida
	 * @generated
	 */
	EClass getSalida();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Salida#getDestinos <em>Destinos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destinos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Salida#getDestinos()
	 * @see #getSalida()
	 * @generated
	 */
	EReference getSalida_Destinos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso <em>Entrada Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso
	 * @generated
	 */
	EClass getEntradaSuceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiqueta()
	 * @see #getEntradaSuceso()
	 * @generated
	 */
	EAttribute getEntradaSuceso_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#isEsInformacionPrevia <em>Es Informacion Previa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Informacion Previa</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#isEsInformacionPrevia()
	 * @see #getEntradaSuceso()
	 * @generated
	 */
	EAttribute getEntradaSuceso_EsInformacionPrevia();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas()
	 * @see #getEntradaSuceso()
	 * @generated
	 */
	EReference getEntradaSuceso_Entradas();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiquetaSimple()
	 * @see #getEntradaSuceso()
	 * @generated
	 */
	EAttribute getEntradaSuceso_EtiquetaSimple();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso <em>Salida Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso
	 * @generated
	 */
	EClass getSalidaSuceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#isEsDistribucion <em>Es Distribucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Distribucion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#isEsDistribucion()
	 * @see #getSalidaSuceso()
	 * @generated
	 */
	EAttribute getSalidaSuceso_EsDistribucion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas()
	 * @see #getSalidaSuceso()
	 * @generated
	 */
	EReference getSalidaSuceso_Salidas();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiquetaSimple()
	 * @see #getSalidaSuceso()
	 * @generated
	 */
	EAttribute getSalidaSuceso_EtiquetaSimple();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiqueta()
	 * @see #getSalidaSuceso()
	 * @generated
	 */
	EAttribute getSalidaSuceso_Etiqueta();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion
	 * @generated
	 */
	EClass getAccion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getEtiqueta()
	 * @see #getAccion()
	 * @generated
	 */
	EAttribute getAccion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getComentario()
	 * @see #getAccion()
	 * @generated
	 */
	EAttribute getAccion_Comentario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Accion#isEsColaborativa <em>Es Colaborativa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Colaborativa</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#isEsColaborativa()
	 * @see #getAccion()
	 * @generated
	 */
	EAttribute getAccion_EsColaborativa();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getActores()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Actores();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getOperaciones()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Operaciones();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Entradas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Salidas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Acciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Acciones();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getEtiquetaSimple()
	 * @see #getAccion()
	 * @generated
	 */
	EAttribute getAccion_EtiquetaSimple();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso <em>Uso Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSuceso
	 * @generated
	 */
	EClass getUsoSuceso();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado <em>Suceso Usado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suceso Usado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado()
	 * @see #getUsoSuceso()
	 * @generated
	 */
	EReference getUsoSuceso_SucesoUsado();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios <em>Importador Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importador Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportadorServicios
	 * @generated
	 */
	EClass getImportadorServicios();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Importaciones Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios()
	 * @see #getImportadorServicios()
	 * @generated
	 */
	EReference getImportadorServicios_ImportacionesServicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio <em>Uso Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoServicio
	 * @generated
	 */
	EClass getUsoServicio();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio()
	 * @see #getUsoServicio()
	 * @generated
	 */
	EReference getUsoServicio_Servicio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion <em>Entrada Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion
	 * @generated
	 */
	EClass getEntradaAccion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiqueta()
	 * @see #getEntradaAccion()
	 * @generated
	 */
	EAttribute getEntradaAccion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiquetaSimple()
	 * @see #getEntradaAccion()
	 * @generated
	 */
	EAttribute getEntradaAccion_EtiquetaSimple();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas()
	 * @see #getEntradaAccion()
	 * @generated
	 */
	EReference getEntradaAccion_Entradas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion <em>Salida Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion
	 * @generated
	 */
	EClass getSalidaAccion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiqueta()
	 * @see #getSalidaAccion()
	 * @generated
	 */
	EAttribute getSalidaAccion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiquetaSimple()
	 * @see #getSalidaAccion()
	 * @generated
	 */
	EAttribute getSalidaAccion_EtiquetaSimple();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas()
	 * @see #getSalidaAccion()
	 * @generated
	 */
	EReference getSalidaAccion_Salidas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anotacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion
	 * @generated
	 */
	EClass getAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getComentario()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Comentario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getIdAnotada <em>Id Anotada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Anotada</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getIdAnotada()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_IdAnotada();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getVersionAnotada <em>Version Anotada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Anotada</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getVersionAnotada()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_VersionAnotada();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getFechaAnotacion <em>Fecha Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Anotacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getFechaAnotacion()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_FechaAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getRealizadorAnotacion <em>Realizador Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizador Anotacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getRealizadorAnotacion()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_RealizadorAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Anotacion#getResponsableAnotacion <em>Responsable Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsable Anotacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Anotacion#getResponsableAnotacion()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_ResponsableAnotacion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos <em>Contenedor Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos
	 * @generated
	 */
	EClass getContenedorSucesos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos()
	 * @see #getContenedorSucesos()
	 * @generated
	 */
	EReference getContenedorSucesos_Sucesos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas <em>Contenedor Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas
	 * @generated
	 */
	EClass getContenedorSubsistemas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas()
	 * @see #getContenedorSubsistemas()
	 * @generated
	 */
	EReference getContenedorSubsistemas_Subsistemas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas <em>CSistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas
	 * @generated
	 */
	EClass getCSistemas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas#getSistemas()
	 * @see #getCSistemas()
	 * @generated
	 */
	EReference getCSistemas_Sistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas#getProcedimiento()
	 * @see #getCSistemas()
	 * @generated
	 */
	EReference getCSistemas_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas <em>CSubsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSubsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas
	 * @generated
	 */
	EClass getCSubsistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor()
	 * @see #getCSubsistemas()
	 * @generated
	 */
	EReference getCSubsistemas_Contenedor();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getSubsistemas()
	 * @see #getCSubsistemas()
	 * @generated
	 */
	EReference getCSubsistemas_Subsistemas();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getProcedimiento()
	 * @see #getCSubsistemas()
	 * @generated
	 */
	EReference getCSubsistemas_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos <em>CSucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos
	 * @generated
	 */
	EClass getCSucesos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor()
	 * @see #getCSucesos()
	 * @generated
	 */
	EReference getCSucesos_Contenedor();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos#getSucesos()
	 * @see #getCSucesos()
	 * @generated
	 */
	EReference getCSucesos_Sucesos();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos#getProcedimiento()
	 * @see #getCSucesos()
	 * @generated
	 */
	EReference getCSucesos_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso <em>CAcciones Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAcciones Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso
	 * @generated
	 */
	EClass getCAccionesSuceso();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso()
	 * @see #getCAccionesSuceso()
	 * @generated
	 */
	EReference getCAccionesSuceso_Suceso();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getAcciones()
	 * @see #getCAccionesSuceso()
	 * @generated
	 */
	EReference getCAccionesSuceso_Acciones();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso <em>CActores Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CActores Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso
	 * @generated
	 */
	EClass getCActoresSuceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getEtiqueta()
	 * @see #getCActoresSuceso()
	 * @generated
	 */
	EAttribute getCActoresSuceso_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getSuceso()
	 * @see #getCActoresSuceso()
	 * @generated
	 */
	EReference getCActoresSuceso_Suceso();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getActores()
	 * @see #getCActoresSuceso()
	 * @generated
	 */
	EReference getCActoresSuceso_Actores();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso <em>CEstructuras Datos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEstructuras Datos Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso
	 * @generated
	 */
	EClass getCEstructurasDatosSuceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEtiqueta()
	 * @see #getCEstructurasDatosSuceso()
	 * @generated
	 */
	EAttribute getCEstructurasDatosSuceso_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso()
	 * @see #getCEstructurasDatosSuceso()
	 * @generated
	 */
	EReference getCEstructurasDatosSuceso_Suceso();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEstructurasDatos()
	 * @see #getCEstructurasDatosSuceso()
	 * @generated
	 */
	EReference getCEstructurasDatosSuceso_EstructurasDatos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos <em>CFlujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFlujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos
	 * @generated
	 */
	EClass getCFlujos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos#getProcedimiento()
	 * @see #getCFlujos()
	 * @generated
	 */
	EReference getCFlujos_Procedimiento();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos#getFlujos()
	 * @see #getCFlujos()
	 * @generated
	 */
	EReference getCFlujos_Flujos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos <em>CDocumentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDocumentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos
	 * @generated
	 */
	EClass getCDocumentos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos#getDocumentos()
	 * @see #getCDocumentos()
	 * @generated
	 */
	EReference getCDocumentos_Documentos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos#getContenedor()
	 * @see #getCDocumentos()
	 * @generated
	 */
	EReference getCDocumentos_Contenedor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones <em>CNormativas YLegislaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CNormativas YLegislaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones
	 * @generated
	 */
	EClass getCNormativasYLegislaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento()
	 * @see #getCNormativasYLegislaciones()
	 * @generated
	 */
	EReference getCNormativasYLegislaciones_Procedimiento();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Normativas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getNormativas()
	 * @see #getCNormativasYLegislaciones()
	 * @generated
	 */
	EReference getCNormativasYLegislaciones_Normativas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones <em>COperaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COperaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones
	 * @generated
	 */
	EClass getCOperaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones#getOperaciones()
	 * @see #getCOperaciones()
	 * @generated
	 */
	EReference getCOperaciones_Operaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento()
	 * @see #getCOperaciones()
	 * @generated
	 */
	EReference getCOperaciones_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos <em>CCampos Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CCampos Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos
	 * @generated
	 */
	EClass getCCamposDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getCampos()
	 * @see #getCCamposDatos()
	 * @generated
	 */
	EReference getCCamposDatos_Campos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor()
	 * @see #getCCamposDatos()
	 * @generated
	 */
	EReference getCCamposDatos_Contenedor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos <em>CEstructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEstructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos
	 * @generated
	 */
	EClass getCEstructurasDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getEstructurasDatos()
	 * @see #getCEstructurasDatos()
	 * @generated
	 */
	EReference getCEstructurasDatos_EstructurasDatos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor()
	 * @see #getCEstructurasDatos()
	 * @generated
	 */
	EReference getCEstructurasDatos_Contenedor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso <em>CFlujos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFlujos Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso
	 * @generated
	 */
	EClass getCFlujosSuceso();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getFlujos()
	 * @see #getCFlujosSuceso()
	 * @generated
	 */
	EReference getCFlujosSuceso_Flujos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso()
	 * @see #getCFlujosSuceso()
	 * @generated
	 */
	EReference getCFlujosSuceso_Suceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor <em>CImportaciones Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CImportaciones Por</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor
	 * @generated
	 */
	EClass getCImportacionesPor();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getEtiqueta()
	 * @see #getCImportacionesPor()
	 * @generated
	 */
	EAttribute getCImportacionesPor_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Libreria Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios()
	 * @see #getCImportacionesPor()
	 * @generated
	 */
	EReference getCImportacionesPor_LibreriaServicios();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getImportadoPor <em>Importado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Importado Por</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getImportadoPor()
	 * @see #getCImportacionesPor()
	 * @generated
	 */
	EReference getCImportacionesPor_ImportadoPor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos <em>CUsado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUsado Por Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos
	 * @generated
	 */
	EClass getCUsadoPorSucesos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getEtiqueta()
	 * @see #getCUsadoPorSucesos()
	 * @generated
	 */
	EAttribute getCUsadoPorSucesos_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso()
	 * @see #getCUsadoPorSucesos()
	 * @generated
	 */
	EReference getCUsadoPorSucesos_Suceso();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getUsosSuceso <em>Usos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getUsosSuceso()
	 * @see #getCUsadoPorSucesos()
	 * @generated
	 */
	EReference getCUsadoPorSucesos_UsosSuceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso <em>CEntradas Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEntradas Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso
	 * @generated
	 */
	EClass getCEntradasSuceso();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getEntradas()
	 * @see #getCEntradasSuceso()
	 * @generated
	 */
	EReference getCEntradasSuceso_Entradas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso()
	 * @see #getCEntradasSuceso()
	 * @generated
	 */
	EReference getCEntradasSuceso_Suceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso <em>CSalidas Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSalidas Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso
	 * @generated
	 */
	EClass getCSalidasSuceso();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suceso</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso()
	 * @see #getCSalidasSuceso()
	 * @generated
	 */
	EReference getCSalidasSuceso_Suceso();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSalidas()
	 * @see #getCSalidasSuceso()
	 * @generated
	 */
	EReference getCSalidasSuceso_Salidas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos <em>CRelaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRelaciones Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos
	 * @generated
	 */
	EClass getCRelacionesDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getRelacionesDatos()
	 * @see #getCRelacionesDatos()
	 * @generated
	 */
	EReference getCRelacionesDatos_RelacionesDatos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor()
	 * @see #getCRelacionesDatos()
	 * @generated
	 */
	EReference getCRelacionesDatos_Contenedor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CActores <em>CActores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CActores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores
	 * @generated
	 */
	EClass getCActores();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento()
	 * @see #getCActores()
	 * @generated
	 */
	EReference getCActores_Procedimiento();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CActores#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actores</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores#getActores()
	 * @see #getCActores()
	 * @generated
	 */
	EReference getCActores_Actores();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos <em>CProcedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CProcedimientos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos
	 * @generated
	 */
	EClass getCProcedimientos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getProcedimientos()
	 * @see #getCProcedimientos()
	 * @generated
	 */
	EReference getCProcedimientos_Procedimientos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getRepositorio()
	 * @see #getCProcedimientos()
	 * @generated
	 */
	EReference getCProcedimientos_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios <em>CLibrerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLibrerias Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios
	 * @generated
	 */
	EClass getCLibreriasServicios();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Librerias Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getLibreriasServicios()
	 * @see #getCLibreriasServicios()
	 * @generated
	 */
	EReference getCLibreriasServicios_LibreriasServicios();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio()
	 * @see #getCLibreriasServicios()
	 * @generated
	 */
	EReference getCLibreriasServicios_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones <em>CAplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAplicaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones
	 * @generated
	 */
	EClass getCAplicaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getAplicaciones()
	 * @see #getCAplicaciones()
	 * @generated
	 */
	EReference getCAplicaciones_Aplicaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getProcedimiento()
	 * @see #getCAplicaciones()
	 * @generated
	 */
	EReference getCAplicaciones_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas <em>CUnidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUnidades Organicas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas
	 * @generated
	 */
	EClass getCUnidadesOrganicas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getUnidades()
	 * @see #getCUnidadesOrganicas()
	 * @generated
	 */
	EReference getCUnidadesOrganicas_Unidades();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getProcedimiento()
	 * @see #getCUnidadesOrganicas()
	 * @generated
	 */
	EReference getCUnidadesOrganicas_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas <em>CUnidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUnidades Externas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas
	 * @generated
	 */
	EClass getCUnidadesExternas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getUnidades()
	 * @see #getCUnidadesExternas()
	 * @generated
	 */
	EReference getCUnidadesExternas_Unidades();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getProcedimiento()
	 * @see #getCUnidadesExternas()
	 * @generated
	 */
	EReference getCUnidadesExternas_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades <em>CUnidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUnidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidades
	 * @generated
	 */
	EClass getCUnidades();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidades</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidades#getUnidades()
	 * @see #getCUnidades()
	 * @generated
	 */
	EReference getCUnidades_Unidades();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento()
	 * @see #getCUnidades()
	 * @generated
	 */
	EReference getCUnidades_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales <em>CEstructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEstructuras Funcionales</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales
	 * @generated
	 */
	EClass getCEstructurasFuncionales();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getEstructurasFuncionales()
	 * @see #getCEstructurasFuncionales()
	 * @generated
	 */
	EReference getCEstructurasFuncionales_EstructurasFuncionales();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getProcedimiento()
	 * @see #getCEstructurasFuncionales()
	 * @generated
	 */
	EReference getCEstructurasFuncionales_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario <em>CTerminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTerminos Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario
	 * @generated
	 */
	EClass getCTerminosGlosario();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminos Glosario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getTerminosGlosario()
	 * @see #getCTerminosGlosario()
	 * @generated
	 */
	EReference getCTerminosGlosario_TerminosGlosario();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getProcedimiento()
	 * @see #getCTerminosGlosario()
	 * @generated
	 */
	EReference getCTerminosGlosario_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion <em>CEntradas Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEntradas Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion
	 * @generated
	 */
	EClass getCEntradasAccion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion()
	 * @see #getCEntradasAccion()
	 * @generated
	 */
	EReference getCEntradasAccion_Accion();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getEntradas()
	 * @see #getCEntradasAccion()
	 * @generated
	 */
	EReference getCEntradasAccion_Entradas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion <em>CSalidas Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSalidas Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion
	 * @generated
	 */
	EClass getCSalidasAccion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Accion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion()
	 * @see #getCSalidasAccion()
	 * @generated
	 */
	EReference getCSalidasAccion_Accion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz
	 * @generated
	 */
	EClass getInterfaz();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_Servicios();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante <em>Rol Solicitante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rol Solicitante</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_RolSolicitante();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado <em>Rol Solicitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rol Solicitado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_RolSolicitado();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libreria Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios
	 * @generated
	 */
	EClass getLibreriaServicios();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor <em>Importado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Importado Por</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_ImportadoPor();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Librerias Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_LibreriasServicios();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodosDocumentos <em>Todos Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todos Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodosDocumentos()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_TodosDocumentos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Todas Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodasEstructurasDatos()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_TodasEstructurasDatos();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getRepositorio()
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	EReference getLibreriaServicios_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Rol#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Rol#getEtiqueta()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Rol#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Rol#getNombre()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.Rol#getComentario <em>Comentario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Rol#getComentario()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Comentario();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante <em>Rol Solicitante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol Solicitante</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitante
	 * @generated
	 */
	EClass getRolSolicitante();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz()
	 * @see #getRolSolicitante()
	 * @generated
	 */
	EReference getRolSolicitante_Interfaz();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado <em>Rol Solicitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol Solicitado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitado
	 * @generated
	 */
	EClass getRolSolicitado();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz()
	 * @see #getRolSolicitado()
	 * @generated
	 */
	EReference getRolSolicitado_Interfaz();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio
	 * @generated
	 */
	EClass getServicio();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos <em>Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usado Por Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_UsadoPorSucesos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Servicios();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getEntradas()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Entradas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getSalidas()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Salidas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio <em>Entrada Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio
	 * @generated
	 */
	EClass getEntradaServicio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiqueta()
	 * @see #getEntradaServicio()
	 * @generated
	 */
	EAttribute getEntradaServicio_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio()
	 * @see #getEntradaServicio()
	 * @generated
	 */
	EReference getEntradaServicio_Servicio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiquetaSimple()
	 * @see #getEntradaServicio()
	 * @generated
	 */
	EAttribute getEntradaServicio_EtiquetaSimple();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio <em>Salida Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio
	 * @generated
	 */
	EClass getSalidaServicio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getEtiqueta()
	 * @see #getSalidaServicio()
	 * @generated
	 */
	EAttribute getSalidaServicio_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getServicio()
	 * @see #getSalidaServicio()
	 * @generated
	 */
	EReference getSalidaServicio_Servicio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getEtiquetaSimple()
	 * @see #getSalidaServicio()
	 * @generated
	 */
	EAttribute getSalidaServicio_EtiquetaSimple();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios <em>Importacion Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importacion Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios
	 * @generated
	 */
	EClass getImportacionServicios();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getEtiqueta()
	 * @see #getImportacionServicios()
	 * @generated
	 */
	EAttribute getImportacionServicios_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importaciones Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios()
	 * @see #getImportacionServicios()
	 * @generated
	 */
	EReference getImportacionServicios_ImportacionesServicios();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Libreria Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios()
	 * @see #getImportacionServicios()
	 * @generated
	 */
	EReference getImportacionServicios_LibreriaServicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios <em>CImportaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CImportaciones Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios
	 * @generated
	 */
	EClass getCImportacionesServicios();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador <em>Importador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importador</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador()
	 * @see #getCImportacionesServicios()
	 * @generated
	 */
	EReference getCImportacionesServicios_Importador();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Importaciones Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportacionesServicios()
	 * @see #getCImportacionesServicios()
	 * @generated
	 */
	EReference getCImportacionesServicios_ImportacionesServicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas <em>CUsos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUsos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas
	 * @generated
	 */
	EClass getCUsosSubsistemas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getUsosSubsistemas()
	 * @see #getCUsosSubsistemas()
	 * @generated
	 */
	EReference getCUsosSubsistemas_UsosSubsistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema()
	 * @see #getCUsosSubsistemas()
	 * @generated
	 */
	EReference getCUsosSubsistemas_Subsistema();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado <em>Documento En Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento En Estado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado
	 * @generated
	 */
	EClass getDocumentoEnEstado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getCondicionesEstado <em>Condiciones Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condiciones Estado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getCondicionesEstado()
	 * @see #getDocumentoEnEstado()
	 * @generated
	 */
	EAttribute getDocumentoEnEstado_CondicionesEstado();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase <em>Documento Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documento Base</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase()
	 * @see #getDocumentoEnEstado()
	 * @generated
	 */
	EReference getDocumentoEnEstado_DocumentoBase();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas <em>CUsado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CUsado Por Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas
	 * @generated
	 */
	EClass getCUsadoPorSubsistemas();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getEtiqueta()
	 * @see #getCUsadoPorSubsistemas()
	 * @generated
	 */
	EAttribute getCUsadoPorSubsistemas_Etiqueta();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usado Por Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getUsadoPorSubsistemas()
	 * @see #getCUsadoPorSubsistemas()
	 * @generated
	 */
	EReference getCUsadoPorSubsistemas_UsadoPorSubsistemas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema()
	 * @see #getCUsadoPorSubsistemas()
	 * @generated
	 */
	EReference getCUsadoPorSubsistemas_Subsistema();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces <em>CInterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CInterfaces</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces
	 * @generated
	 */
	EClass getCInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces#getInterfaces()
	 * @see #getCInterfaces()
	 * @generated
	 */
	EReference getCInterfaces_Interfaces();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Libreria Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios()
	 * @see #getCInterfaces()
	 * @generated
	 */
	EReference getCInterfaces_LibreriaServicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CServicios <em>CServicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CServicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios
	 * @generated
	 */
	EClass getCServicios();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz()
	 * @see #getCServicios()
	 * @generated
	 */
	EReference getCServicios_Interfaz();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicios</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios#getServicios()
	 * @see #getCServicios()
	 * @generated
	 */
	EReference getCServicios_Servicios();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos <em>CServicio Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CServicio Usado Por Sucesos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos
	 * @generated
	 */
	EClass getCServicioUsadoPorSucesos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getEtiqueta()
	 * @see #getCServicioUsadoPorSucesos()
	 * @generated
	 */
	EAttribute getCServicioUsadoPorSucesos_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio()
	 * @see #getCServicioUsadoPorSucesos()
	 * @generated
	 */
	EReference getCServicioUsadoPorSucesos_Servicio();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getUsosServicio <em>Usos Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos Servicio</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getUsosServicio()
	 * @see #getCServicioUsadoPorSucesos()
	 * @generated
	 */
	EReference getCServicioUsadoPorSucesos_UsosServicio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Con Model Class</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ConModelClass
	 * @generated
	 */
	EClass getConModelClass();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.ConModelClass#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Class</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ConModelClass#getModelClass()
	 * @see #getConModelClass()
	 * @generated
	 */
	EReference getConModelClass_ModelClass();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos <em>Contenedor Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos
	 * @generated
	 */
	EClass getContenedorDatos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estructuras Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos()
	 * @see #getContenedorDatos()
	 * @generated
	 */
	EReference getContenedorDatos_EstructurasDatos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Campos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos()
	 * @see #getContenedorDatos()
	 * @generated
	 */
	EReference getContenedorDatos_Campos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relaciones Datos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos()
	 * @see #getContenedorDatos()
	 * @generated
	 */
	EReference getContenedorDatos_RelacionesDatos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.OrgcasiObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiObject
	 * @generated
	 */
	EClass getOrgcasiObject();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.OrgcasiCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiCollection
	 * @generated
	 */
	EClass getOrgcasiCollection();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema <em>Uso Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema
	 * @generated
	 */
	EClass getUsoSubsistema();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getEtiqueta()
	 * @see #getUsoSubsistema()
	 * @generated
	 */
	EAttribute getUsoSubsistema_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Usos Subsistemas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas()
	 * @see #getUsoSubsistema()
	 * @generated
	 */
	EReference getUsoSubsistema_UsosSubsistemas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos <em>Contenedor Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos
	 * @generated
	 */
	EClass getContenedorDocumentos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentos</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos#getDocumentos()
	 * @see #getContenedorDocumentos()
	 * @generated
	 */
	EReference getContenedorDocumentos_Documentos();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado <em>Subsistema Usado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsistema Usado</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado()
	 * @see #getUsoSubsistema()
	 * @generated
	 */
	EReference getUsoSubsistema_SubsistemaUsado();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getSalidas()
	 * @see #getCSalidasAccion()
	 * @generated
	 */
	EReference getCSalidasAccion_Salidas();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento <em>Tipo Uso Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Uso Documento</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento
	 * @generated
	 */
	EEnum getTipoUsoDocumento();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoPrioridad <em>Tipo Prioridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Prioridad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPrioridad
	 * @generated
	 */
	EEnum getTipoPrioridad();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoUnidad <em>Tipo Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Unidad</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUnidad
	 * @generated
	 */
	EEnum getTipoUnidad();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoSubsistema <em>Tipo Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Subsistema</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoSubsistema
	 * @generated
	 */
	EEnum getTipoSubsistema();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Relacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoRelacion
	 * @generated
	 */
	EEnum getTipoRelacion();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida <em>Tipo Agrupacion Predefinida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Agrupacion Predefinida</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida
	 * @generated
	 */
	EEnum getTipoAgrupacionPredefinida();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion <em>Tipo Propiedad Clase Agrupacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Propiedad Clase Agrupacion</em>'.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion
	 * @generated
	 */
	EEnum getTipoPropiedadClaseAgrupacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrgcasiFactory getOrgcasiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl <em>ARepositorio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getARepositorio()
		 * @generated
		 */
		EClass AREPOSITORIO = eINSTANCE.getARepositorio();

		/**
		 * The meta object literal for the '<em><b>Anotaciones Procedimiento</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO = eINSTANCE.getARepositorio_AnotacionesProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREPOSITORIO__REPOSITORIO = eINSTANCE.getARepositorio_Repositorio();

		/**
		 * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREPOSITORIO__MODEL_PACKAGE = eINSTANCE.getARepositorio_ModelPackage();

		/**
		 * The meta object literal for the '<em><b>Librerias Servicios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREPOSITORIO__LIBRERIAS_SERVICIOS = eINSTANCE.getARepositorio_LibreriasServicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl <em>AProcedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAProcedimiento()
		 * @generated
		 */
		EClass APROCEDIMIENTO = eINSTANCE.getAProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APROCEDIMIENTO__ETIQUETA = eINSTANCE.getAProcedimiento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__PROCEDIMIENTO = eINSTANCE.getAProcedimiento_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__NORMATIVAS = eINSTANCE.getAProcedimiento_Normativas();

		/**
		 * The meta object literal for the '<em><b>Terminos Glosario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__TERMINOS_GLOSARIO = eINSTANCE.getAProcedimiento_TerminosGlosario();

		/**
		 * The meta object literal for the '<em><b>Unidades Organicas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__UNIDADES_ORGANICAS = eINSTANCE.getAProcedimiento_UnidadesOrganicas();

		/**
		 * The meta object literal for the '<em><b>Unidades Externas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__UNIDADES_EXTERNAS = eINSTANCE.getAProcedimiento_UnidadesExternas();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__UNIDADES = eINSTANCE.getAProcedimiento_Unidades();

		/**
		 * The meta object literal for the '<em><b>Estructuras Funcionales</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES = eINSTANCE.getAProcedimiento_EstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__APLICACIONES = eINSTANCE.getAProcedimiento_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__OPERACIONES = eINSTANCE.getAProcedimiento_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__FLUJOS = eINSTANCE.getAProcedimiento_Flujos();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__ACTORES = eINSTANCE.getAProcedimiento_Actores();

		/**
		 * The meta object literal for the '<em><b>Sistemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__SISTEMAS = eINSTANCE.getAProcedimiento_Sistemas();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__PROCEDIMIENTOS = eINSTANCE.getAProcedimiento_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Todos Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__TODOS_SUCESOS = eINSTANCE.getAProcedimiento_TodosSucesos();

		/**
		 * The meta object literal for the '<em><b>Todos Subsistemas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__TODOS_SUBSISTEMAS = eINSTANCE.getAProcedimiento_TodosSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Todas Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS = eINSTANCE.getAProcedimiento_TodasEstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Todos Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__TODOS_DOCUMENTOS = eINSTANCE.getAProcedimiento_TodosDocumentos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APROCEDIMIENTO__REPOSITORIO = eINSTANCE.getAProcedimiento_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl <em>AAplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAAplicacion()
		 * @generated
		 */
		EClass AAPLICACION = eINSTANCE.getAAplicacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAPLICACION__ETIQUETA = eINSTANCE.getAAplicacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Aplicacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AAPLICACION__APLICACION = eINSTANCE.getAAplicacion_Aplicacion();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AAPLICACION__APLICACIONES = eINSTANCE.getAAplicacion_Aplicaciones();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadImpl <em>AUnidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidad()
		 * @generated
		 */
		EClass AUNIDAD = eINSTANCE.getAUnidad();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUNIDAD__ETIQUETA = eINSTANCE.getAUnidad_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Actores Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUNIDAD__ACTORES_SUCESOS = eINSTANCE.getAUnidad_ActoresSucesos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl <em>AUnidad Organica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidadOrganica()
		 * @generated
		 */
		EClass AUNIDAD_ORGANICA = eINSTANCE.getAUnidadOrganica();

		/**
		 * The meta object literal for the '<em><b>Tipo Unidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUNIDAD_ORGANICA__TIPO_UNIDAD = eINSTANCE.getAUnidadOrganica_TipoUnidad();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUNIDAD_ORGANICA__UNIDAD = eINSTANCE.getAUnidadOrganica_Unidad();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUNIDAD_ORGANICA__UNIDADES = eINSTANCE.getAUnidadOrganica_Unidades();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl <em>AUnidad Externa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAUnidadExterna()
		 * @generated
		 */
		EClass AUNIDAD_EXTERNA = eINSTANCE.getAUnidadExterna();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUNIDAD_EXTERNA__UNIDAD = eINSTANCE.getAUnidadExterna_Unidad();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUNIDAD_EXTERNA__UNIDADES = eINSTANCE.getAUnidadExterna_Unidades();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl <em>AEstructura Funcional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAEstructuraFuncional()
		 * @generated
		 */
		EClass AESTRUCTURA_FUNCIONAL = eINSTANCE.getAEstructuraFuncional();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AESTRUCTURA_FUNCIONAL__ETIQUETA = eINSTANCE.getAEstructuraFuncional_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Estructura Funcional</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL = eINSTANCE.getAEstructuraFuncional_EstructuraFuncional();

		/**
		 * The meta object literal for the '<em><b>Estructuras Funcionales</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES = eINSTANCE.getAEstructuraFuncional_EstructurasFuncionales();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl <em>ATermino Glosario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getATerminoGlosario()
		 * @generated
		 */
		EClass ATERMINO_GLOSARIO = eINSTANCE.getATerminoGlosario();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATERMINO_GLOSARIO__ETIQUETA = eINSTANCE.getATerminoGlosario_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Termino Glosario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATERMINO_GLOSARIO__TERMINO_GLOSARIO = eINSTANCE.getATerminoGlosario_TerminoGlosario();

		/**
		 * The meta object literal for the '<em><b>Terminos Glosario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATERMINO_GLOSARIO__TERMINOS_GLOSARIO = eINSTANCE.getATerminoGlosario_TerminosGlosario();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl <em>ANormativa YLegislacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getANormativaYLegislacion()
		 * @generated
		 */
		EClass ANORMATIVA_YLEGISLACION = eINSTANCE.getANormativaYLegislacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANORMATIVA_YLEGISLACION__ETIQUETA = eINSTANCE.getANormativaYLegislacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Normativa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANORMATIVA_YLEGISLACION__NORMATIVA = eINSTANCE.getANormativaYLegislacion_Normativa();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANORMATIVA_YLEGISLACION__NORMATIVAS = eINSTANCE.getANormativaYLegislacion_Normativas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl <em>AOperacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAOperacion()
		 * @generated
		 */
		EClass AOPERACION = eINSTANCE.getAOperacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOPERACION__ETIQUETA = eINSTANCE.getAOperacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Operacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOPERACION__OPERACION = eINSTANCE.getAOperacion_Operacion();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOPERACION__OPERACIONES = eINSTANCE.getAOperacion_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Acciones Suceso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOPERACION__ACCIONES_SUCESO = eINSTANCE.getAOperacion_AccionesSuceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ASubprocedimientoImpl <em>ASubprocedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ASubprocedimientoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getASubprocedimiento()
		 * @generated
		 */
		EClass ASUBPROCEDIMIENTO = eINSTANCE.getASubprocedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoFinalImpl <em>ADocumento Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoFinalImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getADocumentoFinal()
		 * @generated
		 */
		EClass ADOCUMENTO_FINAL = eINSTANCE.getADocumentoFinal();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl <em>AFlujo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAFlujo()
		 * @generated
		 */
		EClass AFLUJO = eINSTANCE.getAFlujo();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFLUJO__ETIQUETA = eINSTANCE.getAFlujo_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Flujo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFLUJO__FLUJO = eINSTANCE.getAFlujo_Flujo();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFLUJO__FLUJOS = eINSTANCE.getAFlujo_Flujos();

		/**
		 * The meta object literal for the '<em><b>Flujo De Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFLUJO__FLUJO_DE_SUCESOS = eINSTANCE.getAFlujo_FlujoDeSucesos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl <em>Campo Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCampoDatos()
		 * @generated
		 */
		EClass CAMPO_DATOS = eINSTANCE.getCampoDatos();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__ETIQUETA = eINSTANCE.getCampoDatos_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__NOMBRE = eINSTANCE.getCampoDatos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__DESCRIPCION = eINSTANCE.getCampoDatos_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__TIPO = eINSTANCE.getCampoDatos_Tipo();

		/**
		 * The meta object literal for the '<em><b>Formato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__FORMATO = eINSTANCE.getCampoDatos_Formato();

		/**
		 * The meta object literal for the '<em><b>Ejemplo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__EJEMPLO = eINSTANCE.getCampoDatos_Ejemplo();

		/**
		 * The meta object literal for the '<em><b>Requerido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__REQUERIDO = eINSTANCE.getCampoDatos_Requerido();

		/**
		 * The meta object literal for the '<em><b>Valor Por Defecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__VALOR_POR_DEFECTO = eINSTANCE.getCampoDatos_ValorPorDefecto();

		/**
		 * The meta object literal for the '<em><b>Rango</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__RANGO = eINSTANCE.getCampoDatos_Rango();

		/**
		 * The meta object literal for the '<em><b>Rango Razonable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__RANGO_RAZONABLE = eINSTANCE.getCampoDatos_RangoRazonable();

		/**
		 * The meta object literal for the '<em><b>Fuente Datos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__FUENTE_DATOS = eINSTANCE.getCampoDatos_FuenteDatos();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__OBSERVACIONES = eINSTANCE.getCampoDatos_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO_DATOS__COMENTARIO = eINSTANCE.getCampoDatos_Comentario();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO_DATOS__ESTRUCTURAS_DATOS = eINSTANCE.getCampoDatos_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Campos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO_DATOS__CAMPOS = eINSTANCE.getCampoDatos_Campos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl <em>Estructura Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEstructuraDatos()
		 * @generated
		 */
		EClass ESTRUCTURA_DATOS = eINSTANCE.getEstructuraDatos();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_DATOS__ETIQUETA = eINSTANCE.getEstructuraDatos_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_DATOS__NOMBRE = eINSTANCE.getEstructuraDatos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_DATOS__COMENTARIO = eINSTANCE.getEstructuraDatos_Comentario();

		/**
		 * The meta object literal for the '<em><b>Campos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__CAMPOS = eINSTANCE.getEstructuraDatos_Campos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__DOCUMENTOS = eINSTANCE.getEstructuraDatos_Documentos();

		/**
		 * The meta object literal for the '<em><b>Miembro Relaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__MIEMBRO_RELACIONES = eINSTANCE.getEstructuraDatos_MiembroRelaciones();

		/**
		 * The meta object literal for the '<em><b>Entradas OSalidas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS = eINSTANCE.getEstructuraDatos_EntradasOSalidas();

		/**
		 * The meta object literal for the '<em><b>Estructura Datos De Suceso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO = eINSTANCE.getEstructuraDatos_EstructuraDatosDeSuceso();

		/**
		 * The meta object literal for the '<em><b>Coleccion Estructura Datos De Suceso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO = eINSTANCE.getEstructuraDatos_ColeccionEstructuraDatosDeSuceso();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS = eINSTANCE.getEstructuraDatos_EstructurasDatos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RelacionDatosImpl <em>Relacion Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.RelacionDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRelacionDatos()
		 * @generated
		 */
		EClass RELACION_DATOS = eINSTANCE.getRelacionDatos();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_DATOS__ETIQUETA = eINSTANCE.getRelacionDatos_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_DATOS__NOMBRE = eINSTANCE.getRelacionDatos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_DATOS__COMENTARIO = eINSTANCE.getRelacionDatos_Comentario();

		/**
		 * The meta object literal for the '<em><b>Miembros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_DATOS__MIEMBROS = eINSTANCE.getRelacionDatos_Miembros();

		/**
		 * The meta object literal for the '<em><b>Relaciones Datos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_DATOS__RELACIONES_DATOS = eINSTANCE.getRelacionDatos_RelacionesDatos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl <em>Miembro Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getMiembroRelacion()
		 * @generated
		 */
		EClass MIEMBRO_RELACION = eINSTANCE.getMiembroRelacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__ETIQUETA = eINSTANCE.getMiembroRelacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__NOMBRE = eINSTANCE.getMiembroRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__COMENTARIO = eINSTANCE.getMiembroRelacion_Comentario();

		/**
		 * The meta object literal for the '<em><b>Tipo Relacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__TIPO_RELACION = eINSTANCE.getMiembroRelacion_TipoRelacion();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Minima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA = eINSTANCE.getMiembroRelacion_MultiplicidadMinima();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Maxima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA = eINSTANCE.getMiembroRelacion_MultiplicidadMaxima();

		/**
		 * The meta object literal for the '<em><b>Estructura Datos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIEMBRO_RELACION__ESTRUCTURA_DATOS = eINSTANCE.getMiembroRelacion_EstructuraDatos();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIEMBRO_RELACION__RELACION = eINSTANCE.getMiembroRelacion_Relacion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AgrupacionImpl <em>Agrupacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AgrupacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAgrupacion()
		 * @generated
		 */
		EClass AGRUPACION = eINSTANCE.getAgrupacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRUPACION__ETIQUETA = eINSTANCE.getAgrupacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRUPACION__NOMBRE = eINSTANCE.getAgrupacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRUPACION__CODIGO = eINSTANCE.getAgrupacion_Codigo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRUPACION__DESCRIPCION = eINSTANCE.getAgrupacion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRUPACION__COMENTARIO = eINSTANCE.getAgrupacion_Comentario();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl <em>Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSuceso()
		 * @generated
		 */
		EClass SUCESO = eINSTANCE.getSuceso();

		/**
		 * The meta object literal for the '<em><b>Prioridad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__PRIORIDAD = eINSTANCE.getSuceso_Prioridad();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__TIPO = eINSTANCE.getSuceso_Tipo();

		/**
		 * The meta object literal for the '<em><b>Rendimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__RENDIMIENTO = eINSTANCE.getSuceso_Rendimiento();

		/**
		 * The meta object literal for the '<em><b>Disparo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__DISPARO = eINSTANCE.getSuceso_Disparo();

		/**
		 * The meta object literal for the '<em><b>Distribucion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__DISTRIBUCION = eINSTANCE.getSuceso_Distribucion();

		/**
		 * The meta object literal for the '<em><b>Pre Condicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__PRE_CONDICION = eINSTANCE.getSuceso_PreCondicion();

		/**
		 * The meta object literal for the '<em><b>Post Condicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__POST_CONDICION = eINSTANCE.getSuceso_PostCondicion();

		/**
		 * The meta object literal for the '<em><b>Es Colaborativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCESO__ES_COLABORATIVO = eINSTANCE.getSuceso_EsColaborativo();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__ACCIONES = eINSTANCE.getSuceso_Acciones();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__ACTORES = eINSTANCE.getSuceso_Actores();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__ESTRUCTURAS_DATOS = eINSTANCE.getSuceso_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__FLUJOS = eINSTANCE.getSuceso_Flujos();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__ENTRADAS = eINSTANCE.getSuceso_Entradas();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__SALIDAS = eINSTANCE.getSuceso_Salidas();

		/**
		 * The meta object literal for the '<em><b>Usado Por Sucesos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__USADO_POR_SUCESOS = eINSTANCE.getSuceso_UsadoPorSucesos();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__PROCEDIMIENTO = eINSTANCE.getSuceso_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Sucesos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCESO__SUCESOS = eINSTANCE.getSuceso_Sucesos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoConsultorImpl <em>Suceso Consultor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoConsultorImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSucesoConsultor()
		 * @generated
		 */
		EClass SUCESO_CONSULTOR = eINSTANCE.getSucesoConsultor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoConstructorImpl <em>Suceso Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SucesoConstructorImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSucesoConstructor()
		 * @generated
		 */
		EClass SUCESO_CONSTRUCTOR = eINSTANCE.getSucesoConstructor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl <em>Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSistema()
		 * @generated
		 */
		EClass SISTEMA = eINSTANCE.getSistema();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__PROCEDIMIENTO = eINSTANCE.getSistema_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Todos Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__TODOS_SUCESOS = eINSTANCE.getSistema_TodosSucesos();

		/**
		 * The meta object literal for the '<em><b>Todos Subsistemas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__TODOS_SUBSISTEMAS = eINSTANCE.getSistema_TodosSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Sistemas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__SISTEMAS = eINSTANCE.getSistema_Sistemas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl <em>Subsistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSubsistema()
		 * @generated
		 */
		EClass SUBSISTEMA = eINSTANCE.getSubsistema();

		/**
		 * The meta object literal for the '<em><b>Tipo Subsistema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSISTEMA__TIPO_SUBSISTEMA = eINSTANCE.getSubsistema_TipoSubsistema();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSISTEMA__PROCEDIMIENTO = eINSTANCE.getSubsistema_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Todos Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSISTEMA__TODOS_SUCESOS = eINSTANCE.getSubsistema_TodosSucesos();

		/**
		 * The meta object literal for the '<em><b>Usos Subsistemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSISTEMA__USOS_SUBSISTEMAS = eINSTANCE.getSubsistema_UsosSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Usado Por Subsistemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSISTEMA__USADO_POR_SUBSISTEMAS = eINSTANCE.getSubsistema_UsadoPorSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Subsistemas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSISTEMA__SUBSISTEMAS = eINSTANCE.getSubsistema_Subsistemas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ActorImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ETIQUETA = eINSTANCE.getActor_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NOMBRE = eINSTANCE.getActor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__COMENTARIO = eINSTANCE.getActor_Comentario();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__UNIDADES = eINSTANCE.getActor_Unidades();

		/**
		 * The meta object literal for the '<em><b>Actor De Sucesos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTOR_DE_SUCESOS = eINSTANCE.getActor_ActorDeSucesos();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACCIONES = eINSTANCE.getActor_Acciones();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTORES = eINSTANCE.getActor_Actores();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ActorFuncionalImpl <em>Actor Funcional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ActorFuncionalImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getActorFuncional()
		 * @generated
		 */
		EClass ACTOR_FUNCIONAL = eINSTANCE.getActorFuncional();

		/**
		 * The meta object literal for the '<em><b>Nombre Funcional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL = eINSTANCE.getActorFuncional_NombreFuncional();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl <em>ADocumento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getADocumento()
		 * @generated
		 */
		EClass ADOCUMENTO = eINSTANCE.getADocumento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADOCUMENTO__ETIQUETA = eINSTANCE.getADocumento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__DOCUMENTO = eINSTANCE.getADocumento_Documento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADOCUMENTO__NOMBRE = eINSTANCE.getADocumento_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADOCUMENTO__DESCRIPCION = eINSTANCE.getADocumento_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__ESTRUCTURAS_DATOS = eINSTANCE.getADocumento_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Entradas OSalidas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__ENTRADAS_OSALIDAS = eINSTANCE.getADocumento_EntradasOSalidas();

		/**
		 * The meta object literal for the '<em><b>Estados</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__ESTADOS = eINSTANCE.getADocumento_Estados();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__DOCUMENTOS = eINSTANCE.getADocumento_Documentos();

		/**
		 * The meta object literal for the '<em><b>Todos Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOCUMENTO__TODOS_DOCUMENTOS = eINSTANCE.getADocumento_TodosDocumentos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl <em>Entrada OSalida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaOSalida()
		 * @generated
		 */
		EClass ENTRADA_OSALIDA = eINSTANCE.getEntradaOSalida();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_OSALIDA__NOMBRE = eINSTANCE.getEntradaOSalida_Nombre();

		/**
		 * The meta object literal for the '<em><b>Es Documento Papel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL = eINSTANCE.getEntradaOSalida_EsDocumentoPapel();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_OSALIDA__DESCRIPCION = eINSTANCE.getEntradaOSalida_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_OSALIDA__COMENTARIO = eINSTANCE.getEntradaOSalida_Comentario();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA_OSALIDA__ESTRUCTURAS_DATOS = eINSTANCE.getEntradaOSalida_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA_OSALIDA__DOCUMENTOS = eINSTANCE.getEntradaOSalida_Documentos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaImpl <em>Entrada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntrada()
		 * @generated
		 */
		EClass ENTRADA = eINSTANCE.getEntrada();

		/**
		 * The meta object literal for the '<em><b>Fuentes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA__FUENTES = eINSTANCE.getEntrada_Fuentes();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaImpl <em>Salida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalida()
		 * @generated
		 */
		EClass SALIDA = eINSTANCE.getSalida();

		/**
		 * The meta object literal for the '<em><b>Destinos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA__DESTINOS = eINSTANCE.getSalida_Destinos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl <em>Entrada Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaSuceso()
		 * @generated
		 */
		EClass ENTRADA_SUCESO = eINSTANCE.getEntradaSuceso();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_SUCESO__ETIQUETA = eINSTANCE.getEntradaSuceso_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Es Informacion Previa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_SUCESO__ES_INFORMACION_PREVIA = eINSTANCE.getEntradaSuceso_EsInformacionPrevia();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA_SUCESO__ENTRADAS = eINSTANCE.getEntradaSuceso_Entradas();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_SUCESO__ETIQUETA_SIMPLE = eINSTANCE.getEntradaSuceso_EtiquetaSimple();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl <em>Salida Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaSuceso()
		 * @generated
		 */
		EClass SALIDA_SUCESO = eINSTANCE.getSalidaSuceso();

		/**
		 * The meta object literal for the '<em><b>Es Distribucion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_SUCESO__ES_DISTRIBUCION = eINSTANCE.getSalidaSuceso_EsDistribucion();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA_SUCESO__SALIDAS = eINSTANCE.getSalidaSuceso_Salidas();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_SUCESO__ETIQUETA_SIMPLE = eINSTANCE.getSalidaSuceso_EtiquetaSimple();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_SUCESO__ETIQUETA = eINSTANCE.getSalidaSuceso_Etiqueta();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl <em>Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getAccion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__ETIQUETA = eINSTANCE.getAccion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__COMENTARIO = eINSTANCE.getAccion_Comentario();

		/**
		 * The meta object literal for the '<em><b>Es Colaborativa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__ES_COLABORATIVA = eINSTANCE.getAccion_EsColaborativa();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ACTORES = eINSTANCE.getAccion_Actores();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__OPERACIONES = eINSTANCE.getAccion_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ENTRADAS = eINSTANCE.getAccion_Entradas();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__SALIDAS = eINSTANCE.getAccion_Salidas();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ACCIONES = eINSTANCE.getAccion_Acciones();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__ETIQUETA_SIMPLE = eINSTANCE.getAccion_EtiquetaSimple();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSucesoImpl <em>Uso Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoSuceso()
		 * @generated
		 */
		EClass USO_SUCESO = eINSTANCE.getUsoSuceso();

		/**
		 * The meta object literal for the '<em><b>Suceso Usado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_SUCESO__SUCESO_USADO = eINSTANCE.getUsoSuceso_SucesoUsado();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportadorServiciosImpl <em>Importador Servicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ImportadorServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getImportadorServicios()
		 * @generated
		 */
		EClass IMPORTADOR_SERVICIOS = eINSTANCE.getImportadorServicios();

		/**
		 * The meta object literal for the '<em><b>Importaciones Servicios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS = eINSTANCE.getImportadorServicios_ImportacionesServicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoServicioImpl <em>Uso Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoServicioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoServicio()
		 * @generated
		 */
		EClass USO_SERVICIO = eINSTANCE.getUsoServicio();

		/**
		 * The meta object literal for the '<em><b>Servicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_SERVICIO__SERVICIO = eINSTANCE.getUsoServicio_Servicio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaAccionImpl <em>Entrada Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaAccionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaAccion()
		 * @generated
		 */
		EClass ENTRADA_ACCION = eINSTANCE.getEntradaAccion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_ACCION__ETIQUETA = eINSTANCE.getEntradaAccion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_ACCION__ETIQUETA_SIMPLE = eINSTANCE.getEntradaAccion_EtiquetaSimple();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA_ACCION__ENTRADAS = eINSTANCE.getEntradaAccion_Entradas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaAccionImpl <em>Salida Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaAccionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaAccion()
		 * @generated
		 */
		EClass SALIDA_ACCION = eINSTANCE.getSalidaAccion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_ACCION__ETIQUETA = eINSTANCE.getSalidaAccion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_ACCION__ETIQUETA_SIMPLE = eINSTANCE.getSalidaAccion_EtiquetaSimple();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA_ACCION__SALIDAS = eINSTANCE.getSalidaAccion_Salidas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl <em>Anotacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getAnotacion()
		 * @generated
		 */
		EClass ANOTACION = eINSTANCE.getAnotacion();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__COMENTARIO = eINSTANCE.getAnotacion_Comentario();

		/**
		 * The meta object literal for the '<em><b>Id Anotada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__ID_ANOTADA = eINSTANCE.getAnotacion_IdAnotada();

		/**
		 * The meta object literal for the '<em><b>Version Anotada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__VERSION_ANOTADA = eINSTANCE.getAnotacion_VersionAnotada();

		/**
		 * The meta object literal for the '<em><b>Fecha Anotacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__FECHA_ANOTACION = eINSTANCE.getAnotacion_FechaAnotacion();

		/**
		 * The meta object literal for the '<em><b>Realizador Anotacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__REALIZADOR_ANOTACION = eINSTANCE.getAnotacion_RealizadorAnotacion();

		/**
		 * The meta object literal for the '<em><b>Responsable Anotacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__RESPONSABLE_ANOTACION = eINSTANCE.getAnotacion_ResponsableAnotacion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSucesosImpl <em>Contenedor Sucesos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSucesosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorSucesos()
		 * @generated
		 */
		EClass CONTENEDOR_SUCESOS = eINSTANCE.getContenedorSucesos();

		/**
		 * The meta object literal for the '<em><b>Sucesos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SUCESOS__SUCESOS = eINSTANCE.getContenedorSucesos_Sucesos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSubsistemasImpl <em>Contenedor Subsistemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSubsistemasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorSubsistemas()
		 * @generated
		 */
		EClass CONTENEDOR_SUBSISTEMAS = eINSTANCE.getContenedorSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Subsistemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS = eINSTANCE.getContenedorSubsistemas_Subsistemas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl <em>CSistemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSistemas()
		 * @generated
		 */
		EClass CSISTEMAS = eINSTANCE.getCSistemas();

		/**
		 * The meta object literal for the '<em><b>Sistemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSISTEMAS__SISTEMAS = eINSTANCE.getCSistemas_Sistemas();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSISTEMAS__PROCEDIMIENTO = eINSTANCE.getCSistemas_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl <em>CSubsistemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSubsistemas()
		 * @generated
		 */
		EClass CSUBSISTEMAS = eINSTANCE.getCSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUBSISTEMAS__CONTENEDOR = eINSTANCE.getCSubsistemas_Contenedor();

		/**
		 * The meta object literal for the '<em><b>Subsistemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUBSISTEMAS__SUBSISTEMAS = eINSTANCE.getCSubsistemas_Subsistemas();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUBSISTEMAS__PROCEDIMIENTO = eINSTANCE.getCSubsistemas_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSucesosImpl <em>CSucesos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSucesosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSucesos()
		 * @generated
		 */
		EClass CSUCESOS = eINSTANCE.getCSucesos();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUCESOS__CONTENEDOR = eINSTANCE.getCSucesos_Contenedor();

		/**
		 * The meta object literal for the '<em><b>Sucesos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUCESOS__SUCESOS = eINSTANCE.getCSucesos_Sucesos();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUCESOS__PROCEDIMIENTO = eINSTANCE.getCSucesos_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl <em>CAcciones Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCAccionesSuceso()
		 * @generated
		 */
		EClass CACCIONES_SUCESO = eINSTANCE.getCAccionesSuceso();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACCIONES_SUCESO__SUCESO = eINSTANCE.getCAccionesSuceso_Suceso();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACCIONES_SUCESO__ACCIONES = eINSTANCE.getCAccionesSuceso_Acciones();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CActoresSucesoImpl <em>CActores Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CActoresSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCActoresSuceso()
		 * @generated
		 */
		EClass CACTORES_SUCESO = eINSTANCE.getCActoresSuceso();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACTORES_SUCESO__ETIQUETA = eINSTANCE.getCActoresSuceso_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACTORES_SUCESO__SUCESO = eINSTANCE.getCActoresSuceso_Suceso();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACTORES_SUCESO__ACTORES = eINSTANCE.getCActoresSuceso_Actores();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosSucesoImpl <em>CEstructuras Datos Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasDatosSuceso()
		 * @generated
		 */
		EClass CESTRUCTURAS_DATOS_SUCESO = eINSTANCE.getCEstructurasDatosSuceso();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESTRUCTURAS_DATOS_SUCESO__ETIQUETA = eINSTANCE.getCEstructurasDatosSuceso_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_DATOS_SUCESO__SUCESO = eINSTANCE.getCEstructurasDatosSuceso_Suceso();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS = eINSTANCE.getCEstructurasDatosSuceso_EstructurasDatos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosImpl <em>CFlujos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CFlujosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCFlujos()
		 * @generated
		 */
		EClass CFLUJOS = eINSTANCE.getCFlujos();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFLUJOS__PROCEDIMIENTO = eINSTANCE.getCFlujos_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFLUJOS__FLUJOS = eINSTANCE.getCFlujos_Flujos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl <em>CDocumentos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCDocumentos()
		 * @generated
		 */
		EClass CDOCUMENTOS = eINSTANCE.getCDocumentos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDOCUMENTOS__DOCUMENTOS = eINSTANCE.getCDocumentos_Documentos();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDOCUMENTOS__CONTENEDOR = eINSTANCE.getCDocumentos_Contenedor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl <em>CNormativas YLegislaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCNormativasYLegislaciones()
		 * @generated
		 */
		EClass CNORMATIVAS_YLEGISLACIONES = eINSTANCE.getCNormativasYLegislaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO = eINSTANCE.getCNormativasYLegislaciones_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNORMATIVAS_YLEGISLACIONES__NORMATIVAS = eINSTANCE.getCNormativasYLegislaciones_Normativas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl <em>COperaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCOperaciones()
		 * @generated
		 */
		EClass COPERACIONES = eINSTANCE.getCOperaciones();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPERACIONES__OPERACIONES = eINSTANCE.getCOperaciones_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPERACIONES__PROCEDIMIENTO = eINSTANCE.getCOperaciones_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CCamposDatosImpl <em>CCampos Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CCamposDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCCamposDatos()
		 * @generated
		 */
		EClass CCAMPOS_DATOS = eINSTANCE.getCCamposDatos();

		/**
		 * The meta object literal for the '<em><b>Campos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCAMPOS_DATOS__CAMPOS = eINSTANCE.getCCamposDatos_Campos();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCAMPOS_DATOS__CONTENEDOR = eINSTANCE.getCCamposDatos_Contenedor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl <em>CEstructuras Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasDatos()
		 * @generated
		 */
		EClass CESTRUCTURAS_DATOS = eINSTANCE.getCEstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS = eINSTANCE.getCEstructurasDatos_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_DATOS__CONTENEDOR = eINSTANCE.getCEstructurasDatos_Contenedor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl <em>CFlujos Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCFlujosSuceso()
		 * @generated
		 */
		EClass CFLUJOS_SUCESO = eINSTANCE.getCFlujosSuceso();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFLUJOS_SUCESO__FLUJOS = eINSTANCE.getCFlujosSuceso_Flujos();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFLUJOS_SUCESO__SUCESO = eINSTANCE.getCFlujosSuceso_Suceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl <em>CImportaciones Por</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCImportacionesPor()
		 * @generated
		 */
		EClass CIMPORTACIONES_POR = eINSTANCE.getCImportacionesPor();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIMPORTACIONES_POR__ETIQUETA = eINSTANCE.getCImportacionesPor_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Libreria Servicios</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIMPORTACIONES_POR__LIBRERIA_SERVICIOS = eINSTANCE.getCImportacionesPor_LibreriaServicios();

		/**
		 * The meta object literal for the '<em><b>Importado Por</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIMPORTACIONES_POR__IMPORTADO_POR = eINSTANCE.getCImportacionesPor_ImportadoPor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl <em>CUsado Por Sucesos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsadoPorSucesos()
		 * @generated
		 */
		EClass CUSADO_POR_SUCESOS = eINSTANCE.getCUsadoPorSucesos();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSADO_POR_SUCESOS__ETIQUETA = eINSTANCE.getCUsadoPorSucesos_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSADO_POR_SUCESOS__SUCESO = eINSTANCE.getCUsadoPorSucesos_Suceso();

		/**
		 * The meta object literal for the '<em><b>Usos Suceso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSADO_POR_SUCESOS__USOS_SUCESO = eINSTANCE.getCUsadoPorSucesos_UsosSuceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasSucesoImpl <em>CEntradas Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEntradasSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEntradasSuceso()
		 * @generated
		 */
		EClass CENTRADAS_SUCESO = eINSTANCE.getCEntradasSuceso();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRADAS_SUCESO__ENTRADAS = eINSTANCE.getCEntradasSuceso_Entradas();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRADAS_SUCESO__SUCESO = eINSTANCE.getCEntradasSuceso_Suceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl <em>CSalidas Suceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSalidasSuceso()
		 * @generated
		 */
		EClass CSALIDAS_SUCESO = eINSTANCE.getCSalidasSuceso();

		/**
		 * The meta object literal for the '<em><b>Suceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSALIDAS_SUCESO__SUCESO = eINSTANCE.getCSalidasSuceso_Suceso();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSALIDAS_SUCESO__SALIDAS = eINSTANCE.getCSalidasSuceso_Salidas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl <em>CRelaciones Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCRelacionesDatos()
		 * @generated
		 */
		EClass CRELACIONES_DATOS = eINSTANCE.getCRelacionesDatos();

		/**
		 * The meta object literal for the '<em><b>Relaciones Datos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRELACIONES_DATOS__RELACIONES_DATOS = eINSTANCE.getCRelacionesDatos_RelacionesDatos();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRELACIONES_DATOS__CONTENEDOR = eINSTANCE.getCRelacionesDatos_Contenedor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CActoresImpl <em>CActores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CActoresImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCActores()
		 * @generated
		 */
		EClass CACTORES = eINSTANCE.getCActores();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACTORES__PROCEDIMIENTO = eINSTANCE.getCActores_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACTORES__ACTORES = eINSTANCE.getCActores_Actores();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl <em>CProcedimientos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCProcedimientos()
		 * @generated
		 */
		EClass CPROCEDIMIENTOS = eINSTANCE.getCProcedimientos();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPROCEDIMIENTOS__PROCEDIMIENTOS = eINSTANCE.getCProcedimientos_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPROCEDIMIENTOS__REPOSITORIO = eINSTANCE.getCProcedimientos_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl <em>CLibrerias Servicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCLibreriasServicios()
		 * @generated
		 */
		EClass CLIBRERIAS_SERVICIOS = eINSTANCE.getCLibreriasServicios();

		/**
		 * The meta object literal for the '<em><b>Librerias Servicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS = eINSTANCE.getCLibreriasServicios_LibreriasServicios();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIBRERIAS_SERVICIOS__REPOSITORIO = eINSTANCE.getCLibreriasServicios_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl <em>CAplicaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCAplicaciones()
		 * @generated
		 */
		EClass CAPLICACIONES = eINSTANCE.getCAplicaciones();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPLICACIONES__APLICACIONES = eINSTANCE.getCAplicaciones_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPLICACIONES__PROCEDIMIENTO = eINSTANCE.getCAplicaciones_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesOrganicasImpl <em>CUnidades Organicas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesOrganicasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidadesOrganicas()
		 * @generated
		 */
		EClass CUNIDADES_ORGANICAS = eINSTANCE.getCUnidadesOrganicas();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES_ORGANICAS__UNIDADES = eINSTANCE.getCUnidadesOrganicas_Unidades();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES_ORGANICAS__PROCEDIMIENTO = eINSTANCE.getCUnidadesOrganicas_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl <em>CUnidades Externas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidadesExternas()
		 * @generated
		 */
		EClass CUNIDADES_EXTERNAS = eINSTANCE.getCUnidadesExternas();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES_EXTERNAS__UNIDADES = eINSTANCE.getCUnidadesExternas_Unidades();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES_EXTERNAS__PROCEDIMIENTO = eINSTANCE.getCUnidadesExternas_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesImpl <em>CUnidades</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUnidades()
		 * @generated
		 */
		EClass CUNIDADES = eINSTANCE.getCUnidades();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES__UNIDADES = eINSTANCE.getCUnidades_Unidades();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUNIDADES__PROCEDIMIENTO = eINSTANCE.getCUnidades_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl <em>CEstructuras Funcionales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEstructurasFuncionales()
		 * @generated
		 */
		EClass CESTRUCTURAS_FUNCIONALES = eINSTANCE.getCEstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Estructuras Funcionales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES = eINSTANCE.getCEstructurasFuncionales_EstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO = eINSTANCE.getCEstructurasFuncionales_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl <em>CTerminos Glosario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCTerminosGlosario()
		 * @generated
		 */
		EClass CTERMINOS_GLOSARIO = eINSTANCE.getCTerminosGlosario();

		/**
		 * The meta object literal for the '<em><b>Terminos Glosario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO = eINSTANCE.getCTerminosGlosario_TerminosGlosario();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTERMINOS_GLOSARIO__PROCEDIMIENTO = eINSTANCE.getCTerminosGlosario_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl <em>CEntradas Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCEntradasAccion()
		 * @generated
		 */
		EClass CENTRADAS_ACCION = eINSTANCE.getCEntradasAccion();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRADAS_ACCION__ACCION = eINSTANCE.getCEntradasAccion_Accion();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRADAS_ACCION__ENTRADAS = eINSTANCE.getCEntradasAccion_Entradas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl <em>CSalidas Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCSalidasAccion()
		 * @generated
		 */
		EClass CSALIDAS_ACCION = eINSTANCE.getCSalidasAccion();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSALIDAS_ACCION__ACCION = eINSTANCE.getCSalidasAccion_Accion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl <em>Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getInterfaz()
		 * @generated
		 */
		EClass INTERFAZ = eINSTANCE.getInterfaz();

		/**
		 * The meta object literal for the '<em><b>Servicios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__SERVICIOS = eINSTANCE.getInterfaz_Servicios();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__INTERFACES = eINSTANCE.getInterfaz_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Rol Solicitante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__ROL_SOLICITANTE = eINSTANCE.getInterfaz_RolSolicitante();

		/**
		 * The meta object literal for the '<em><b>Rol Solicitado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__ROL_SOLICITADO = eINSTANCE.getInterfaz_RolSolicitado();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl <em>Libreria Servicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getLibreriaServicios()
		 * @generated
		 */
		EClass LIBRERIA_SERVICIOS = eINSTANCE.getLibreriaServicios();

		/**
		 * The meta object literal for the '<em><b>Importado Por</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__IMPORTADO_POR = eINSTANCE.getLibreriaServicios_ImportadoPor();

		/**
		 * The meta object literal for the '<em><b>Librerias Servicios</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS = eINSTANCE.getLibreriaServicios_LibreriasServicios();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__INTERFACES = eINSTANCE.getLibreriaServicios_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Todos Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__TODOS_DOCUMENTOS = eINSTANCE.getLibreriaServicios_TodosDocumentos();

		/**
		 * The meta object literal for the '<em><b>Todas Estructuras Datos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__TODAS_ESTRUCTURAS_DATOS = eINSTANCE.getLibreriaServicios_TodasEstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRERIA_SERVICIOS__REPOSITORIO = eINSTANCE.getLibreriaServicios_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__ETIQUETA = eINSTANCE.getRol_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NOMBRE = eINSTANCE.getRol_Nombre();

		/**
		 * The meta object literal for the '<em><b>Comentario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__COMENTARIO = eINSTANCE.getRol_Comentario();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitanteImpl <em>Rol Solicitante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitanteImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRolSolicitante()
		 * @generated
		 */
		EClass ROL_SOLICITANTE = eINSTANCE.getRolSolicitante();

		/**
		 * The meta object literal for the '<em><b>Interfaz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL_SOLICITANTE__INTERFAZ = eINSTANCE.getRolSolicitante_Interfaz();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitadoImpl <em>Rol Solicitado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.RolSolicitadoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getRolSolicitado()
		 * @generated
		 */
		EClass ROL_SOLICITADO = eINSTANCE.getRolSolicitado();

		/**
		 * The meta object literal for the '<em><b>Interfaz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL_SOLICITADO__INTERFAZ = eINSTANCE.getRolSolicitado_Interfaz();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl <em>Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getServicio()
		 * @generated
		 */
		EClass SERVICIO = eINSTANCE.getServicio();

		/**
		 * The meta object literal for the '<em><b>Usado Por Sucesos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__USADO_POR_SUCESOS = eINSTANCE.getServicio_UsadoPorSucesos();

		/**
		 * The meta object literal for the '<em><b>Servicios</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__SERVICIOS = eINSTANCE.getServicio_Servicios();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__ENTRADAS = eINSTANCE.getServicio_Entradas();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__SALIDAS = eINSTANCE.getServicio_Salidas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaServicioImpl <em>Entrada Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.EntradaServicioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getEntradaServicio()
		 * @generated
		 */
		EClass ENTRADA_SERVICIO = eINSTANCE.getEntradaServicio();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_SERVICIO__ETIQUETA = eINSTANCE.getEntradaServicio_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Servicio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA_SERVICIO__SERVICIO = eINSTANCE.getEntradaServicio_Servicio();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA_SERVICIO__ETIQUETA_SIMPLE = eINSTANCE.getEntradaServicio_EtiquetaSimple();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaServicioImpl <em>Salida Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.SalidaServicioImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getSalidaServicio()
		 * @generated
		 */
		EClass SALIDA_SERVICIO = eINSTANCE.getSalidaServicio();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_SERVICIO__ETIQUETA = eINSTANCE.getSalidaServicio_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Servicio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA_SERVICIO__SERVICIO = eINSTANCE.getSalidaServicio_Servicio();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA_SERVICIO__ETIQUETA_SIMPLE = eINSTANCE.getSalidaServicio_EtiquetaSimple();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl <em>Importacion Servicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getImportacionServicios()
		 * @generated
		 */
		EClass IMPORTACION_SERVICIOS = eINSTANCE.getImportacionServicios();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTACION_SERVICIOS__ETIQUETA = eINSTANCE.getImportacionServicios_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Importaciones Servicios</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS = eINSTANCE.getImportacionServicios_ImportacionesServicios();

		/**
		 * The meta object literal for the '<em><b>Libreria Servicios</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS = eINSTANCE.getImportacionServicios_LibreriaServicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl <em>CImportaciones Servicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCImportacionesServicios()
		 * @generated
		 */
		EClass CIMPORTACIONES_SERVICIOS = eINSTANCE.getCImportacionesServicios();

		/**
		 * The meta object literal for the '<em><b>Importador</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIMPORTACIONES_SERVICIOS__IMPORTADOR = eINSTANCE.getCImportacionesServicios_Importador();

		/**
		 * The meta object literal for the '<em><b>Importaciones Servicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS = eINSTANCE.getCImportacionesServicios_ImportacionesServicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl <em>CUsos Subsistemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsosSubsistemas()
		 * @generated
		 */
		EClass CUSOS_SUBSISTEMAS = eINSTANCE.getCUsosSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Usos Subsistemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS = eINSTANCE.getCUsosSubsistemas_UsosSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Subsistema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSOS_SUBSISTEMAS__SUBSISTEMA = eINSTANCE.getCUsosSubsistemas_Subsistema();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl <em>Documento En Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getDocumentoEnEstado()
		 * @generated
		 */
		EClass DOCUMENTO_EN_ESTADO = eINSTANCE.getDocumentoEnEstado();

		/**
		 * The meta object literal for the '<em><b>Condiciones Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO = eINSTANCE.getDocumentoEnEstado_CondicionesEstado();

		/**
		 * The meta object literal for the '<em><b>Documento Base</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE = eINSTANCE.getDocumentoEnEstado_DocumentoBase();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl <em>CUsado Por Subsistemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCUsadoPorSubsistemas()
		 * @generated
		 */
		EClass CUSADO_POR_SUBSISTEMAS = eINSTANCE.getCUsadoPorSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSADO_POR_SUBSISTEMAS__ETIQUETA = eINSTANCE.getCUsadoPorSubsistemas_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Usado Por Subsistemas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS = eINSTANCE.getCUsadoPorSubsistemas_UsadoPorSubsistemas();

		/**
		 * The meta object literal for the '<em><b>Subsistema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSADO_POR_SUBSISTEMAS__SUBSISTEMA = eINSTANCE.getCUsadoPorSubsistemas_Subsistema();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl <em>CInterfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCInterfaces()
		 * @generated
		 */
		EClass CINTERFACES = eINSTANCE.getCInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINTERFACES__INTERFACES = eINSTANCE.getCInterfaces_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Libreria Servicios</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINTERFACES__LIBRERIA_SERVICIOS = eINSTANCE.getCInterfaces_LibreriaServicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl <em>CServicios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCServicios()
		 * @generated
		 */
		EClass CSERVICIOS = eINSTANCE.getCServicios();

		/**
		 * The meta object literal for the '<em><b>Interfaz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSERVICIOS__INTERFAZ = eINSTANCE.getCServicios_Interfaz();

		/**
		 * The meta object literal for the '<em><b>Servicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSERVICIOS__SERVICIOS = eINSTANCE.getCServicios_Servicios();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl <em>CServicio Usado Por Sucesos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getCServicioUsadoPorSucesos()
		 * @generated
		 */
		EClass CSERVICIO_USADO_POR_SUCESOS = eINSTANCE.getCServicioUsadoPorSucesos();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSERVICIO_USADO_POR_SUCESOS__ETIQUETA = eINSTANCE.getCServicioUsadoPorSucesos_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Servicio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSERVICIO_USADO_POR_SUCESOS__SERVICIO = eINSTANCE.getCServicioUsadoPorSucesos_Servicio();

		/**
		 * The meta object literal for the '<em><b>Usos Servicio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO = eINSTANCE.getCServicioUsadoPorSucesos_UsosServicio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ConModelClassImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getConModelClass()
		 * @generated
		 */
		EClass CON_MODEL_CLASS = eINSTANCE.getConModelClass();

		/**
		 * The meta object literal for the '<em><b>Model Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CON_MODEL_CLASS__MODEL_CLASS = eINSTANCE.getConModelClass_ModelClass();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl <em>Contenedor Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorDatos()
		 * @generated
		 */
		EClass CONTENEDOR_DATOS = eINSTANCE.getContenedorDatos();

		/**
		 * The meta object literal for the '<em><b>Estructuras Datos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOS__ESTRUCTURAS_DATOS = eINSTANCE.getContenedorDatos_EstructurasDatos();

		/**
		 * The meta object literal for the '<em><b>Campos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOS__CAMPOS = eINSTANCE.getContenedorDatos_Campos();

		/**
		 * The meta object literal for the '<em><b>Relaciones Datos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOS__RELACIONES_DATOS = eINSTANCE.getContenedorDatos_RelacionesDatos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiObjectImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getOrgcasiObject()
		 * @generated
		 */
		EClass ORGCASI_OBJECT = eINSTANCE.getOrgcasiObject();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiCollectionImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getOrgcasiCollection()
		 * @generated
		 */
		EClass ORGCASI_COLLECTION = eINSTANCE.getOrgcasiCollection();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl <em>Uso Subsistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getUsoSubsistema()
		 * @generated
		 */
		EClass USO_SUBSISTEMA = eINSTANCE.getUsoSubsistema();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_SUBSISTEMA__ETIQUETA = eINSTANCE.getUsoSubsistema_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Usos Subsistemas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_SUBSISTEMA__USOS_SUBSISTEMAS = eINSTANCE.getUsoSubsistema_UsosSubsistemas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDocumentosImpl <em>Contenedor Documentos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDocumentosImpl
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getContenedorDocumentos()
		 * @generated
		 */
		EClass CONTENEDOR_DOCUMENTOS = eINSTANCE.getContenedorDocumentos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DOCUMENTOS__DOCUMENTOS = eINSTANCE.getContenedorDocumentos_Documentos();

		/**
		 * The meta object literal for the '<em><b>Subsistema Usado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_SUBSISTEMA__SUBSISTEMA_USADO = eINSTANCE.getUsoSubsistema_SubsistemaUsado();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSALIDAS_ACCION__SALIDAS = eINSTANCE.getCSalidasAccion_Salidas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento <em>Tipo Uso Documento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoUsoDocumento()
		 * @generated
		 */
		EEnum TIPO_USO_DOCUMENTO = eINSTANCE.getTipoUsoDocumento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoPrioridad <em>Tipo Prioridad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoPrioridad
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoPrioridad()
		 * @generated
		 */
		EEnum TIPO_PRIORIDAD = eINSTANCE.getTipoPrioridad();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoUnidad <em>Tipo Unidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoUnidad
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoUnidad()
		 * @generated
		 */
		EEnum TIPO_UNIDAD = eINSTANCE.getTipoUnidad();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoSubsistema <em>Tipo Subsistema</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoSubsistema
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoSubsistema()
		 * @generated
		 */
		EEnum TIPO_SUBSISTEMA = eINSTANCE.getTipoSubsistema();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoRelacion <em>Tipo Relacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoRelacion
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoRelacion()
		 * @generated
		 */
		EEnum TIPO_RELACION = eINSTANCE.getTipoRelacion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida <em>Tipo Agrupacion Predefinida</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoAgrupacionPredefinida()
		 * @generated
		 */
		EEnum TIPO_AGRUPACION_PREDEFINIDA = eINSTANCE.getTipoAgrupacionPredefinida();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion <em>Tipo Propiedad Clase Agrupacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion
		 * @see es.gva.cit.gvmetrica.orgcasi.impl.OrgcasiPackageImpl#getTipoPropiedadClaseAgrupacion()
		 * @generated
		 */
		EEnum TIPO_PROPIEDAD_CLASE_AGRUPACION = eINSTANCE.getTipoPropiedadClaseAgrupacion();

	}

} //OrgcasiPackage
