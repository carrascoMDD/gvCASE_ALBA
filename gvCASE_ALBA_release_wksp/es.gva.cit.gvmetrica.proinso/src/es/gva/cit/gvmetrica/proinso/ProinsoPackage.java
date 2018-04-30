/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

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
 * @see es.gva.cit.gvmetrica.proinso.ProinsoFactory
 * @model kind="package"
 * @generated
 */
public interface ProinsoPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proinso";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///es/gva/cit/gvmetrica/proinso.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.gva.cit.gvmetrica.proinso";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProinsoPackage eINSTANCE = es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ConModelClassImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getConModelClass()
	 * @generated
	 */
	int CON_MODEL_CLASS = 6;

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
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProinsoObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoObjectImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProinsoObject()
	 * @generated
	 */
	int PROINSO_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROINSO_OBJECT__MODEL_CLASS = CON_MODEL_CLASS__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROINSO_OBJECT_FEATURE_COUNT = CON_MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl <em>Actividad Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividadAbstracta()
	 * @generated
	 */
	int ACTIVIDAD_ABSTRACTA = 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__CODIGO = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__TAREAS = PROINSO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Predecesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__PREDECESORES = PROINSO_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sucesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA__SUCESORES = PROINSO_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Actividad Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ABSTRACTA_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadImpl <em>Actividad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividad()
	 * @generated
	 */
	int ACTIVIDAD = 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__MODEL_CLASS = ACTIVIDAD_ABSTRACTA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__DOCUMENTACION = ACTIVIDAD_ABSTRACTA__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__REFERENCIAS = ACTIVIDAD_ABSTRACTA__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__CODIGO_YNOMBRE = ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__CODIGO_COMPLETO = ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__CODIGO = ACTIVIDAD_ABSTRACTA__CODIGO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__NOMBRE = ACTIVIDAD_ABSTRACTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__TAREAS = ACTIVIDAD_ABSTRACTA__TAREAS;

	/**
	 * The feature id for the '<em><b>Predecesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__PREDECESORES = ACTIVIDAD_ABSTRACTA__PREDECESORES;

	/**
	 * The feature id for the '<em><b>Sucesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__SUCESORES = ACTIVIDAD_ABSTRACTA__SUCESORES;

	/**
	 * The feature id for the '<em><b>Proceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__PROCESO = ACTIVIDAD_ABSTRACTA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_FEATURE_COUNT = ACTIVIDAD_ABSTRACTA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadInterfazImpl <em>Actividad Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadInterfazImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividadInterfaz()
	 * @generated
	 */
	int ACTIVIDAD_INTERFAZ = 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__MODEL_CLASS = ACTIVIDAD_ABSTRACTA__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__DOCUMENTACION = ACTIVIDAD_ABSTRACTA__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__REFERENCIAS = ACTIVIDAD_ABSTRACTA__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__CODIGO_YNOMBRE = ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__CODIGO_COMPLETO = ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__CODIGO = ACTIVIDAD_ABSTRACTA__CODIGO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__NOMBRE = ACTIVIDAD_ABSTRACTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__TAREAS = ACTIVIDAD_ABSTRACTA__TAREAS;

	/**
	 * The feature id for the '<em><b>Predecesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__PREDECESORES = ACTIVIDAD_ABSTRACTA__PREDECESORES;

	/**
	 * The feature id for the '<em><b>Sucesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__SUCESORES = ACTIVIDAD_ABSTRACTA__SUCESORES;

	/**
	 * The feature id for the '<em><b>Proceso</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ__PROCESO = ACTIVIDAD_ABSTRACTA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actividad Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_INTERFAZ_FEATURE_COUNT = ACTIVIDAD_ABSTRACTA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParticipanteImpl <em>Participante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ParticipanteImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParticipante()
	 * @generated
	 */
	int PARTICIPANTE = 14;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perfil Participante</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE__PERFIL_PARTICIPANTE = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Participante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANTE_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.CargoImpl <em>Cargo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.CargoImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getCargo()
	 * @generated
	 */
	int CARGO = 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO__MODEL_CLASS = PARTICIPANTE__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO__DOCUMENTACION = PARTICIPANTE__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO__REFERENCIAS = PARTICIPANTE__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO__NOMBRE = PARTICIPANTE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Perfil Participante</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO__PERFIL_PARTICIPANTE = PARTICIPANTE__PERFIL_PARTICIPANTE;

	/**
	 * The number of structural features of the '<em>Cargo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGO_FEATURE_COUNT = PARTICIPANTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ConDocumentacionImpl <em>Con Documentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ConDocumentacionImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getConDocumentacion()
	 * @generated
	 */
	int CON_DOCUMENTACION = 4;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_DOCUMENTACION__DOCUMENTACION = 0;

	/**
	 * The number of structural features of the '<em>Con Documentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_DOCUMENTACION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ComiteImpl <em>Comite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ComiteImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getComite()
	 * @generated
	 */
	int COMITE = 5;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE__MODEL_CLASS = PARTICIPANTE__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE__DOCUMENTACION = PARTICIPANTE__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE__REFERENCIAS = PARTICIPANTE__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE__NOMBRE = PARTICIPANTE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Perfil Participante</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE__PERFIL_PARTICIPANTE = PARTICIPANTE__PERFIL_PARTICIPANTE;

	/**
	 * The number of structural features of the '<em>Comite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMITE_FEATURE_COUNT = PARTICIPANTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl <em>Documentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getDocumentacion()
	 * @generated
	 */
	int DOCUMENTACION = 7;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTACION__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTACION__DOCUMENTADO = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parrafos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTACION__PARRAFOS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTACION_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl <em>Uso Flujo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoFlujo()
	 * @generated
	 */
	int USO_FLUJO = 37;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_FLUJO__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_FLUJO__ETIQUETA = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_FLUJO__PRODUCTO = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_FLUJO__TAREA = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uso Flujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_FLUJO_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl <em>Entrada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.EntradaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getEntrada()
	 * @generated
	 */
	int ENTRADA = 8;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__MODEL_CLASS = USO_FLUJO__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__ETIQUETA = USO_FLUJO__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__PRODUCTO = USO_FLUJO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__TAREA = USO_FLUJO__TAREA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__NOMBRE = USO_FLUJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modo Uso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__MODO_USO = USO_FLUJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guarda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__GUARDA = USO_FLUJO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precondiciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__PRECONDICIONES = USO_FLUJO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Salidas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA__SALIDAS = USO_FLUJO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entrada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_FEATURE_COUNT = USO_FLUJO_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProinsoCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoCollectionImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProinsoCollection()
	 * @generated
	 */
	int PROINSO_COLLECTION = 22;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROINSO_COLLECTION__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROINSO_COLLECTION_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.InterfacesImpl <em>Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.InterfacesImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getInterfaces()
	 * @generated
	 */
	int INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES__INTERFACES = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl <em>Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.InterfazImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getInterfaz()
	 * @generated
	 */
	int INTERFAZ = 10;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__CODIGO = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__INTERFACES = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Procesos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__PROCESOS = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ__CODIGO_COMPLETO = PROINSO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl <em>Metodologia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getMetodologia()
	 * @generated
	 */
	int METODOLOGIA = 11;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__DOCUMENTACION = CON_DOCUMENTACION__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__NOMBRE = CON_DOCUMENTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procesos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__PROCESOS = CON_DOCUMENTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__INTERFACES = CON_DOCUMENTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Productos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__PRODUCTOS = CON_DOCUMENTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perfiles Participantes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__PERFILES_PARTICIPANTES = CON_DOCUMENTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Practicas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__PRACTICAS = CON_DOCUMENTACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tecnicas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__TECNICAS = CON_DOCUMENTACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA__REPOSITORIO = CON_DOCUMENTACION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Metodologia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODOLOGIA_FEATURE_COUNT = CON_DOCUMENTACION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl <em>Parrafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParrafo()
	 * @generated
	 */
	int PARRAFO = 12;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__TEXTO = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__RUNS = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO__ESTILO = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parrafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARRAFO_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl <em>Participacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParticipacion()
	 * @generated
	 */
	int PARTICIPACION = 13;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPACION__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPACION__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPACION__TAREA = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Perfil Participante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPACION__PERFIL_PARTICIPANTE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPACION_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl <em>Perfiles Participantes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPerfilesParticipantes()
	 * @generated
	 */
	int PERFILES_PARTICIPANTES = 15;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFILES_PARTICIPANTES__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Perfiles Participantes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFILES_PARTICIPANTES__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Perfiles Participantes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFILES_PARTICIPANTES_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl <em>Perfil Participante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPerfilParticipante()
	 * @generated
	 */
	int PERFIL_PARTICIPANTE = 16;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__PARTICIPACIONES = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participantes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__PARTICIPANTES = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Perfiles Participantes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Perfil Participante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFIL_PARTICIPANTE_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.PracticaImpl <em>Practica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.PracticaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPractica()
	 * @generated
	 */
	int PRACTICA = 17;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Practicas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__PRACTICAS = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usos Practica</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA__USOS_PRACTICA = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Practica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICA_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.PracticasImpl <em>Practicas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.PracticasImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPracticas()
	 * @generated
	 */
	int PRACTICAS = 18;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICAS__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Practicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICAS__PRACTICAS = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICAS__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Practicas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRACTICAS_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesoImpl <em>Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesoImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProceso()
	 * @generated
	 */
	int PROCESO = 19;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__CODIGO_YNOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__CODIGO = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__ACTIVIDADES = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Procesos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__PROCESOS = PROINSO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__CODIGO_COMPLETO = PROINSO_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesoInterfazImpl <em>Proceso Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesoInterfazImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProcesoInterfaz()
	 * @generated
	 */
	int PROCESO_INTERFAZ = 20;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__CODIGO_COMPLETO = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__CODIGO = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__INTERFAZ = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ__ACTIVIDADES = PROINSO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Proceso Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_INTERFAZ_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl <em>Procesos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProcesos()
	 * @generated
	 */
	int PROCESOS = 21;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESOS__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Procesos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESOS__PROCESOS = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESOS__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procesos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESOS_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl <em>Usable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.UsableImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsable()
	 * @generated
	 */
	int USABLE = 36;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__DOCUMENTACION = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__REFERENCIAS = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__ETIQUETA = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__CONTENIDO = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE__USOS = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Usable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProductoImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 24;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__MODEL_CLASS = USABLE__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DOCUMENTACION = USABLE__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__REFERENCIAS = USABLE__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ETIQUETA = USABLE__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CONTENIDO = USABLE__CONTENIDO;

	/**
	 * The feature id for the '<em><b>Usos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__USOS = USABLE__USOS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = USABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CODIGO = USABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__METODOLOGIA = USABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Es Externo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ES_EXTERNO = USABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = USABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProductosImpl <em>Productos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProductosImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProductos()
	 * @generated
	 */
	int PRODUCTOS = 25;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Productos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS__PRODUCTOS = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Productos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTOS_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.RunImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 29;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__TEXTO = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parrafo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__PARRAFO = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.TextRunImpl <em>Text Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.TextRunImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTextRun()
	 * @generated
	 */
	int TEXT_RUN = 35;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__MODEL_CLASS = RUN__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__TEXTO = RUN__TEXTO;

	/**
	 * The feature id for the '<em><b>Parrafo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__PARRAFO = RUN__PARRAFO;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__ESTILO = RUN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN_FEATURE_COUNT = RUN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ReferenceRunImpl <em>Reference Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ReferenceRunImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getReferenceRun()
	 * @generated
	 */
	int REFERENCE_RUN = 26;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN__MODEL_CLASS = TEXT_RUN__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN__TEXTO = TEXT_RUN__TEXTO;

	/**
	 * The feature id for the '<em><b>Parrafo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN__PARRAFO = TEXT_RUN__PARRAFO;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN__ESTILO = TEXT_RUN__ESTILO;

	/**
	 * The feature id for the '<em><b>Referenciado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN__REFERENCIADO = TEXT_RUN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RUN_FEATURE_COUNT = TEXT_RUN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.ReferenciableImpl <em>Referenciable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.ReferenciableImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getReferenciable()
	 * @generated
	 */
	int REFERENCIABLE = 27;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIABLE__REFERENCIAS = 0;

	/**
	 * The number of structural features of the '<em>Referenciable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl <em>Repositorio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getRepositorio()
	 * @generated
	 */
	int REPOSITORIO = 28;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Metodologias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__METODOLOGIAS = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__MODEL_PACKAGE = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repositorio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl <em>Salida</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.SalidaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getSalida()
	 * @generated
	 */
	int SALIDA = 30;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__MODEL_CLASS = USO_FLUJO__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ETIQUETA = USO_FLUJO__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__PRODUCTO = USO_FLUJO__PRODUCTO;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__TAREA = USO_FLUJO__TAREA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__NOMBRE = USO_FLUJO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modo Uso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__MODO_USO = USO_FLUJO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guarda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__GUARDA = USO_FLUJO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postcondiciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__POSTCONDICIONES = USO_FLUJO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Forzado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__FORZADO = USO_FLUJO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA__ENTRADAS = USO_FLUJO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Salida</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_FEATURE_COUNT = USO_FLUJO_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.SeccionImpl <em>Seccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.SeccionImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getSeccion()
	 * @generated
	 */
	int SECCION = 31;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__MODEL_CLASS = USABLE__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__DOCUMENTACION = USABLE__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__REFERENCIAS = USABLE__REFERENCIAS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__ETIQUETA = USABLE__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__CONTENIDO = USABLE__CONTENIDO;

	/**
	 * The feature id for the '<em><b>Usos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__USOS = USABLE__USOS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__NOMBRE = USABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__CODIGO = USABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contenedor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION__CONTENEDOR = USABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Seccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCION_FEATURE_COUNT = USABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.TareaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 32;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__DOCUMENTACION = CON_DOCUMENTACION__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__REFERENCIAS = CON_DOCUMENTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__CODIGO_YNOMBRE = CON_DOCUMENTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__CODIGO_COMPLETO = CON_DOCUMENTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__CODIGO = CON_DOCUMENTACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE = CON_DOCUMENTACION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actividad</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__ACTIVIDAD = CON_DOCUMENTACION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__FLUJOS = CON_DOCUMENTACION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PARTICIPACIONES = CON_DOCUMENTACION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uso Practicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__USO_PRACTICAS = CON_DOCUMENTACION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Uso Tecnicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__USO_TECNICAS = CON_DOCUMENTACION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = CON_DOCUMENTACION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl <em>Tecnica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTecnica()
	 * @generated
	 */
	int TECNICA = 33;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA__DOCUMENTACION = CON_DOCUMENTACION__DOCUMENTACION;

	/**
	 * The feature id for the '<em><b>Referencias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA__REFERENCIAS = CON_DOCUMENTACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA__NOMBRE = CON_DOCUMENTACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tecnicas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA__TECNICAS = CON_DOCUMENTACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usos Tecnica</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA__USOS_TECNICA = CON_DOCUMENTACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tecnica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICA_FEATURE_COUNT = CON_DOCUMENTACION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl <em>Tecnicas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTecnicas()
	 * @generated
	 */
	int TECNICAS = 34;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICAS__MODEL_CLASS = PROINSO_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Tecnicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICAS__TECNICAS = PROINSO_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metodologia</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICAS__METODOLOGIA = PROINSO_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tecnicas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNICAS_FEATURE_COUNT = PROINSO_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoPracticaImpl <em>Uso Practica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.UsoPracticaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoPractica()
	 * @generated
	 */
	int USO_PRACTICA = 38;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA__DESCRIPCION = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA__TAREA = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Practica</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA__PRACTICA = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Uso Practica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_PRACTICA_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl <em>Uso Tecnica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoTecnica()
	 * @generated
	 */
	int USO_TECNICA = 39;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA__MODEL_CLASS = PROINSO_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA__NOMBRE = PROINSO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA__DESCRIPCION = PROINSO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA__TAREA = PROINSO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tecnica</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA__TECNICA = PROINSO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Uso Tecnica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USO_TECNICA_FEATURE_COUNT = PROINSO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind <em>Modo Uso Entrada Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getModoUsoEntradaKind()
	 * @generated
	 */
	int MODO_USO_ENTRADA_KIND = 40;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind <em>Modo Uso Salida Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind
	 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getModoUsoSalidaKind()
	 * @generated
	 */
	int MODO_USO_SALIDA_KIND = 41;


	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Actividad
	 * @generated
	 */
	EClass getActividad();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Actividad#getProceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proceso</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Actividad#getProceso()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_Proceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta <em>Actividad Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Abstracta</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta
	 * @generated
	 */
	EClass getActividadAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoYNombre <em>Codigo YNombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo YNombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoYNombre()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EAttribute getActividadAbstracta_CodigoYNombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoCompleto()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EAttribute getActividadAbstracta_CodigoCompleto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigo()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EAttribute getActividadAbstracta_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getNombre()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EAttribute getActividadAbstracta_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tareas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getTareas()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EReference getActividadAbstracta_Tareas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getPredecesores <em>Predecesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecesores</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getPredecesores()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EReference getActividadAbstracta_Predecesores();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getSucesores <em>Sucesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sucesores</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getSucesores()
	 * @see #getActividadAbstracta()
	 * @generated
	 */
	EReference getActividadAbstracta_Sucesores();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ActividadInterfaz <em>Actividad Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadInterfaz
	 * @generated
	 */
	EClass getActividadInterfaz();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.ActividadInterfaz#getProceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proceso</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ActividadInterfaz#getProceso()
	 * @see #getActividadInterfaz()
	 * @generated
	 */
	EReference getActividadInterfaz_Proceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Cargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cargo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Cargo
	 * @generated
	 */
	EClass getCargo();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion <em>Con Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Con Documentacion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ConDocumentacion
	 * @generated
	 */
	EClass getConDocumentacion();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentacion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion()
	 * @see #getConDocumentacion()
	 * @generated
	 */
	EReference getConDocumentacion_Documentacion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Comite <em>Comite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comite</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Comite
	 * @generated
	 */
	EClass getComite();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Documentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentacion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion
	 * @generated
	 */
	EClass getDocumentacion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Documentacion#getDocumentado <em>Documentado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documentado</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion#getDocumentado()
	 * @see #getDocumentacion()
	 * @generated
	 */
	EReference getDocumentacion_Documentado();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Documentacion#getParrafos <em>Parrafos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parrafos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion#getParrafos()
	 * @see #getDocumentacion()
	 * @generated
	 */
	EReference getDocumentacion_Parrafos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Entrada <em>Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada
	 * @generated
	 */
	EClass getEntrada();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Entrada#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getNombre()
	 * @see #getEntrada()
	 * @generated
	 */
	EAttribute getEntrada_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Entrada#getModoUso <em>Modo Uso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modo Uso</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getModoUso()
	 * @see #getEntrada()
	 * @generated
	 */
	EAttribute getEntrada_ModoUso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Entrada#getGuarda <em>Guarda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guarda</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getGuarda()
	 * @see #getEntrada()
	 * @generated
	 */
	EAttribute getEntrada_Guarda();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Entrada#getPrecondiciones <em>Precondiciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondiciones</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getPrecondiciones()
	 * @see #getEntrada()
	 * @generated
	 */
	EAttribute getEntrada_Precondiciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Entrada#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Salidas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getSalidas()
	 * @see #getEntrada()
	 * @generated
	 */
	EReference getEntrada_Salidas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Interfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces
	 * @generated
	 */
	EClass getInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Interfaces#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces#getInterfaces()
	 * @see #getInterfaces()
	 * @generated
	 */
	EReference getInterfaces_Interfaces();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Interfaces#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces#getMetodologia()
	 * @see #getInterfaces()
	 * @generated
	 */
	EReference getInterfaces_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Interfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz
	 * @generated
	 */
	EClass getInterfaz();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getCodigo()
	 * @see #getInterfaz()
	 * @generated
	 */
	EAttribute getInterfaz_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getNombre()
	 * @see #getInterfaz()
	 * @generated
	 */
	EAttribute getInterfaz_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getInterfaces()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procesos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getProcesos()
	 * @see #getInterfaz()
	 * @generated
	 */
	EReference getInterfaz_Procesos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getCodigoCompleto()
	 * @see #getInterfaz()
	 * @generated
	 */
	EAttribute getInterfaz_CodigoCompleto();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Metodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia
	 * @generated
	 */
	EClass getMetodologia();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getNombre()
	 * @see #getMetodologia()
	 * @generated
	 */
	EAttribute getMetodologia_Nombre();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procesos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Procesos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Productos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getProductos()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Productos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perfiles Participantes</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_PerfilesParticipantes();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Practicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Practicas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tecnicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Tecnicas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getRepositorio()
	 * @see #getMetodologia()
	 * @generated
	 */
	EReference getMetodologia_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Parrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parrafo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo
	 * @generated
	 */
	EClass getParrafo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo#getTexto()
	 * @see #getParrafo()
	 * @generated
	 */
	EAttribute getParrafo_Texto();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documentacion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo#getDocumentacion()
	 * @see #getParrafo()
	 * @generated
	 */
	EReference getParrafo_Documentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo#getRuns()
	 * @see #getParrafo()
	 * @generated
	 */
	EReference getParrafo_Runs();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo#getEstilo()
	 * @see #getParrafo()
	 * @generated
	 */
	EAttribute getParrafo_Estilo();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Participacion <em>Participacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participacion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participacion
	 * @generated
	 */
	EClass getParticipacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Participacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participacion#getNombre()
	 * @see #getParticipacion()
	 * @generated
	 */
	EAttribute getParticipacion_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Participacion#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tarea</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participacion#getTarea()
	 * @see #getParticipacion()
	 * @generated
	 */
	EReference getParticipacion_Tarea();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perfil Participante</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante()
	 * @see #getParticipacion()
	 * @generated
	 */
	EReference getParticipacion_PerfilParticipante();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Participante <em>Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participante</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participante
	 * @generated
	 */
	EClass getParticipante();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Participante#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participante#getNombre()
	 * @see #getParticipante()
	 * @generated
	 */
	EAttribute getParticipante_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Participante#getPerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Perfil Participante</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Participante#getPerfilParticipante()
	 * @see #getParticipante()
	 * @generated
	 */
	EReference getParticipante_PerfilParticipante();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perfiles Participantes</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes
	 * @generated
	 */
	EClass getPerfilesParticipantes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perfiles Participantes</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getPerfilesParticipantes()
	 * @see #getPerfilesParticipantes()
	 * @generated
	 */
	EReference getPerfilesParticipantes_PerfilesParticipantes();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getMetodologia()
	 * @see #getPerfilesParticipantes()
	 * @generated
	 */
	EReference getPerfilesParticipantes_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perfil Participante</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante
	 * @generated
	 */
	EClass getPerfilParticipante();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getNombre()
	 * @see #getPerfilParticipante()
	 * @generated
	 */
	EAttribute getPerfilParticipante_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipaciones <em>Participaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participaciones</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipaciones()
	 * @see #getPerfilParticipante()
	 * @generated
	 */
	EReference getPerfilParticipante_Participaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipantes <em>Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participantes</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipantes()
	 * @see #getPerfilParticipante()
	 * @generated
	 */
	EReference getPerfilParticipante_Participantes();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Perfiles Participantes</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getPerfilesParticipantes()
	 * @see #getPerfilParticipante()
	 * @generated
	 */
	EReference getPerfilParticipante_PerfilesParticipantes();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Practica <em>Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Practica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practica
	 * @generated
	 */
	EClass getPractica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Practica#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practica#getNombre()
	 * @see #getPractica()
	 * @generated
	 */
	EAttribute getPractica_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Practica#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Practicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practica#getPracticas()
	 * @see #getPractica()
	 * @generated
	 */
	EReference getPractica_Practicas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Practica#getUsosPractica <em>Usos Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos Practica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practica#getUsosPractica()
	 * @see #getPractica()
	 * @generated
	 */
	EReference getPractica_UsosPractica();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Practicas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Practicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practicas
	 * @generated
	 */
	EClass getPracticas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Practicas#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Practicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practicas#getPracticas()
	 * @see #getPracticas()
	 * @generated
	 */
	EReference getPracticas_Practicas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Practicas#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Practicas#getMetodologia()
	 * @see #getPracticas()
	 * @generated
	 */
	EReference getPracticas_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso
	 * @generated
	 */
	EClass getProceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigoYNombre <em>Codigo YNombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo YNombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getCodigoYNombre()
	 * @see #getProceso()
	 * @generated
	 */
	EAttribute getProceso_CodigoYNombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getCodigo()
	 * @see #getProceso()
	 * @generated
	 */
	EAttribute getProceso_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Proceso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getNombre()
	 * @see #getProceso()
	 * @generated
	 */
	EAttribute getProceso_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Proceso#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getActividades()
	 * @see #getProceso()
	 * @generated
	 */
	EReference getProceso_Actividades();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Proceso#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procesos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getProcesos()
	 * @see #getProceso()
	 * @generated
	 */
	EReference getProceso_Procesos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getCodigoCompleto()
	 * @see #getProceso()
	 * @generated
	 */
	EAttribute getProceso_CodigoCompleto();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz <em>Proceso Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz
	 * @generated
	 */
	EClass getProcesoInterfaz();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getCodigoCompleto()
	 * @see #getProcesoInterfaz()
	 * @generated
	 */
	EAttribute getProcesoInterfaz_CodigoCompleto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getNombre()
	 * @see #getProcesoInterfaz()
	 * @generated
	 */
	EAttribute getProcesoInterfaz_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getCodigo()
	 * @see #getProcesoInterfaz()
	 * @generated
	 */
	EAttribute getProcesoInterfaz_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interfaz</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getInterfaz()
	 * @see #getProcesoInterfaz()
	 * @generated
	 */
	EReference getProcesoInterfaz_Interfaz();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getActividades()
	 * @see #getProcesoInterfaz()
	 * @generated
	 */
	EReference getProcesoInterfaz_Actividades();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Procesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procesos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Procesos
	 * @generated
	 */
	EClass getProcesos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Procesos#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procesos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Procesos#getProcesos()
	 * @see #getProcesos()
	 * @generated
	 */
	EReference getProcesos_Procesos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Procesos#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Procesos#getMetodologia()
	 * @see #getProcesos()
	 * @generated
	 */
	EReference getProcesos_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ProinsoCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoCollection
	 * @generated
	 */
	EClass getProinsoCollection();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ProinsoObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoObject
	 * @generated
	 */
	EClass getProinsoObject();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Producto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Producto#getNombre()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Producto#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Producto#getCodigo()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Producto#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Producto#getMetodologia()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Metodologia();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Producto#isEsExterno <em>Es Externo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Externo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Producto#isEsExterno()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_EsExterno();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Productos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Productos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Productos
	 * @generated
	 */
	EClass getProductos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Productos#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Productos#getProductos()
	 * @see #getProductos()
	 * @generated
	 */
	EReference getProductos_Productos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Productos#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Productos#getMetodologia()
	 * @see #getProductos()
	 * @generated
	 */
	EReference getProductos_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ReferenceRun <em>Reference Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Run</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ReferenceRun
	 * @generated
	 */
	EClass getReferenceRun();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado <em>Referenciado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenciado</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado()
	 * @see #getReferenceRun()
	 * @generated
	 */
	EReference getReferenceRun_Referenciado();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Referenciable <em>Referenciable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenciable</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Referenciable
	 * @generated
	 */
	EClass getReferenciable();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Referenciable#getReferencias <em>Referencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencias</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Referenciable#getReferencias()
	 * @see #getReferenciable()
	 * @generated
	 */
	EReference getReferenciable_Referencias();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Repositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositorio</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Repositorio
	 * @generated
	 */
	EClass getRepositorio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Repositorio#getMetodologias <em>Metodologias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodologias</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Repositorio#getMetodologias()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Metodologias();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.Repositorio#getModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Package</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Repositorio#getModelPackage()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_ModelPackage();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Run#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Run#getTexto()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Texto();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Run#getParrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parrafo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Run#getParrafo()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Parrafo();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Salida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida
	 * @generated
	 */
	EClass getSalida();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Salida#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getNombre()
	 * @see #getSalida()
	 * @generated
	 */
	EAttribute getSalida_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Salida#getModoUso <em>Modo Uso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modo Uso</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getModoUso()
	 * @see #getSalida()
	 * @generated
	 */
	EAttribute getSalida_ModoUso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Salida#getGuarda <em>Guarda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guarda</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getGuarda()
	 * @see #getSalida()
	 * @generated
	 */
	EAttribute getSalida_Guarda();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Salida#getPostcondiciones <em>Postcondiciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondiciones</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getPostcondiciones()
	 * @see #getSalida()
	 * @generated
	 */
	EAttribute getSalida_Postcondiciones();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Salida#isForzado <em>Forzado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forzado</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#isForzado()
	 * @see #getSalida()
	 * @generated
	 */
	EAttribute getSalida_Forzado();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Salida#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entradas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getEntradas()
	 * @see #getSalida()
	 * @generated
	 */
	EReference getSalida_Entradas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Seccion <em>Seccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seccion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Seccion
	 * @generated
	 */
	EClass getSeccion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Seccion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Seccion#getNombre()
	 * @see #getSeccion()
	 * @generated
	 */
	EAttribute getSeccion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Seccion#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Seccion#getCodigo()
	 * @see #getSeccion()
	 * @generated
	 */
	EAttribute getSeccion_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Seccion#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenedor</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Seccion#getContenedor()
	 * @see #getSeccion()
	 * @generated
	 */
	EReference getSeccion_Contenedor();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigoYNombre <em>Codigo YNombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo YNombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getCodigoYNombre()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_CodigoYNombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getCodigoCompleto()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_CodigoCompleto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getCodigo()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Tarea#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getNombre()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Tarea#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actividad</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getActividad()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Actividad();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Tarea#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flujos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getFlujos()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Flujos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Tarea#getParticipaciones <em>Participaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participaciones</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getParticipaciones()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Participaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoPracticas <em>Uso Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uso Practicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getUsoPracticas()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_UsoPracticas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoTecnicas <em>Uso Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uso Tecnicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getUsoTecnicas()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_UsoTecnicas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Tecnica <em>Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tecnica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica
	 * @generated
	 */
	EClass getTecnica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica#getNombre()
	 * @see #getTecnica()
	 * @generated
	 */
	EAttribute getTecnica_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tecnicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica#getTecnicas()
	 * @see #getTecnica()
	 * @generated
	 */
	EReference getTecnica_Tecnicas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getUsosTecnica <em>Usos Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos Tecnica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica#getUsosTecnica()
	 * @see #getTecnica()
	 * @generated
	 */
	EReference getTecnica_UsosTecnica();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Tecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tecnicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas
	 * @generated
	 */
	EClass getTecnicas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tecnicas</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas#getTecnicas()
	 * @see #getTecnicas()
	 * @generated
	 */
	EReference getTecnicas_Tecnicas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metodologia</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas#getMetodologia()
	 * @see #getTecnicas()
	 * @generated
	 */
	EReference getTecnicas_Metodologia();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.TextRun <em>Text Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Run</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.TextRun
	 * @generated
	 */
	EClass getTextRun();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.TextRun#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.TextRun#getEstilo()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Estilo();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.Usable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usable</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Usable
	 * @generated
	 */
	EClass getUsable();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.Usable#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Usable#getEtiqueta()
	 * @see #getUsable()
	 * @generated
	 */
	EAttribute getUsable_Etiqueta();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvmetrica.proinso.Usable#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenido</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Usable#getContenido()
	 * @see #getUsable()
	 * @generated
	 */
	EReference getUsable_Contenido();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvmetrica.proinso.Usable#getUsos <em>Usos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.Usable#getUsos()
	 * @see #getUsable()
	 * @generated
	 */
	EReference getUsable_Usos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo <em>Uso Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Flujo</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo
	 * @generated
	 */
	EClass getUsoFlujo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo#getEtiqueta()
	 * @see #getUsoFlujo()
	 * @generated
	 */
	EAttribute getUsoFlujo_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producto</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto()
	 * @see #getUsoFlujo()
	 * @generated
	 */
	EReference getUsoFlujo_Producto();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tarea</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo#getTarea()
	 * @see #getUsoFlujo()
	 * @generated
	 */
	EReference getUsoFlujo_Tarea();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.UsoPractica <em>Uso Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Practica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica
	 * @generated
	 */
	EClass getUsoPractica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getNombre()
	 * @see #getUsoPractica()
	 * @generated
	 */
	EAttribute getUsoPractica_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getDescripcion()
	 * @see #getUsoPractica()
	 * @generated
	 */
	EAttribute getUsoPractica_Descripcion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tarea</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getTarea()
	 * @see #getUsoPractica()
	 * @generated
	 */
	EReference getUsoPractica_Tarea();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica <em>Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Practica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica()
	 * @see #getUsoPractica()
	 * @generated
	 */
	EReference getUsoPractica_Practica();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica <em>Uso Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uso Tecnica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica
	 * @generated
	 */
	EClass getUsoTecnica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getNombre()
	 * @see #getUsoTecnica()
	 * @generated
	 */
	EAttribute getUsoTecnica_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getDescripcion()
	 * @see #getUsoTecnica()
	 * @generated
	 */
	EAttribute getUsoTecnica_Descripcion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tarea</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getTarea()
	 * @see #getUsoTecnica()
	 * @generated
	 */
	EReference getUsoTecnica_Tarea();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica <em>Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tecnica</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica()
	 * @see #getUsoTecnica()
	 * @generated
	 */
	EReference getUsoTecnica_Tecnica();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvmetrica.proinso.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Con Model Class</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ConModelClass
	 * @generated
	 */
	EClass getConModelClass();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvmetrica.proinso.ConModelClass#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Class</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ConModelClass#getModelClass()
	 * @see #getConModelClass()
	 * @generated
	 */
	EReference getConModelClass_ModelClass();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind <em>Modo Uso Entrada Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modo Uso Entrada Kind</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind
	 * @generated
	 */
	EEnum getModoUsoEntradaKind();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind <em>Modo Uso Salida Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modo Uso Salida Kind</em>'.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind
	 * @generated
	 */
	EEnum getModoUsoSalidaKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProinsoFactory getProinsoFactory();

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
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadImpl <em>Actividad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividad()
		 * @generated
		 */
		EClass ACTIVIDAD = eINSTANCE.getActividad();

		/**
		 * The meta object literal for the '<em><b>Proceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__PROCESO = eINSTANCE.getActividad_Proceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl <em>Actividad Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividadAbstracta()
		 * @generated
		 */
		EClass ACTIVIDAD_ABSTRACTA = eINSTANCE.getActividadAbstracta();

		/**
		 * The meta object literal for the '<em><b>Codigo YNombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE = eINSTANCE.getActividadAbstracta_CodigoYNombre();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO = eINSTANCE.getActividadAbstracta_CodigoCompleto();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ABSTRACTA__CODIGO = eINSTANCE.getActividadAbstracta_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ABSTRACTA__NOMBRE = eINSTANCE.getActividadAbstracta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tareas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ABSTRACTA__TAREAS = eINSTANCE.getActividadAbstracta_Tareas();

		/**
		 * The meta object literal for the '<em><b>Predecesores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ABSTRACTA__PREDECESORES = eINSTANCE.getActividadAbstracta_Predecesores();

		/**
		 * The meta object literal for the '<em><b>Sucesores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ABSTRACTA__SUCESORES = eINSTANCE.getActividadAbstracta_Sucesores();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ActividadInterfazImpl <em>Actividad Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ActividadInterfazImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getActividadInterfaz()
		 * @generated
		 */
		EClass ACTIVIDAD_INTERFAZ = eINSTANCE.getActividadInterfaz();

		/**
		 * The meta object literal for the '<em><b>Proceso</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_INTERFAZ__PROCESO = eINSTANCE.getActividadInterfaz_Proceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.CargoImpl <em>Cargo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.CargoImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getCargo()
		 * @generated
		 */
		EClass CARGO = eINSTANCE.getCargo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ConDocumentacionImpl <em>Con Documentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ConDocumentacionImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getConDocumentacion()
		 * @generated
		 */
		EClass CON_DOCUMENTACION = eINSTANCE.getConDocumentacion();

		/**
		 * The meta object literal for the '<em><b>Documentacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CON_DOCUMENTACION__DOCUMENTACION = eINSTANCE.getConDocumentacion_Documentacion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ComiteImpl <em>Comite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ComiteImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getComite()
		 * @generated
		 */
		EClass COMITE = eINSTANCE.getComite();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl <em>Documentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getDocumentacion()
		 * @generated
		 */
		EClass DOCUMENTACION = eINSTANCE.getDocumentacion();

		/**
		 * The meta object literal for the '<em><b>Documentado</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTACION__DOCUMENTADO = eINSTANCE.getDocumentacion_Documentado();

		/**
		 * The meta object literal for the '<em><b>Parrafos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTACION__PARRAFOS = eINSTANCE.getDocumentacion_Parrafos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl <em>Entrada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.EntradaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getEntrada()
		 * @generated
		 */
		EClass ENTRADA = eINSTANCE.getEntrada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA__NOMBRE = eINSTANCE.getEntrada_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modo Uso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA__MODO_USO = eINSTANCE.getEntrada_ModoUso();

		/**
		 * The meta object literal for the '<em><b>Guarda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA__GUARDA = eINSTANCE.getEntrada_Guarda();

		/**
		 * The meta object literal for the '<em><b>Precondiciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRADA__PRECONDICIONES = eINSTANCE.getEntrada_Precondiciones();

		/**
		 * The meta object literal for the '<em><b>Salidas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRADA__SALIDAS = eINSTANCE.getEntrada_Salidas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.InterfacesImpl <em>Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.InterfacesImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getInterfaces()
		 * @generated
		 */
		EClass INTERFACES = eINSTANCE.getInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES__INTERFACES = eINSTANCE.getInterfaces_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES__METODOLOGIA = eINSTANCE.getInterfaces_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl <em>Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.InterfazImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getInterfaz()
		 * @generated
		 */
		EClass INTERFAZ = eINSTANCE.getInterfaz();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFAZ__CODIGO = eINSTANCE.getInterfaz_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFAZ__NOMBRE = eINSTANCE.getInterfaz_Nombre();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__INTERFACES = eINSTANCE.getInterfaz_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Procesos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFAZ__PROCESOS = eINSTANCE.getInterfaz_Procesos();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFAZ__CODIGO_COMPLETO = eINSTANCE.getInterfaz_CodigoCompleto();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl <em>Metodologia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getMetodologia()
		 * @generated
		 */
		EClass METODOLOGIA = eINSTANCE.getMetodologia();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODOLOGIA__NOMBRE = eINSTANCE.getMetodologia_Nombre();

		/**
		 * The meta object literal for the '<em><b>Procesos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__PROCESOS = eINSTANCE.getMetodologia_Procesos();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__INTERFACES = eINSTANCE.getMetodologia_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Productos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__PRODUCTOS = eINSTANCE.getMetodologia_Productos();

		/**
		 * The meta object literal for the '<em><b>Perfiles Participantes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__PERFILES_PARTICIPANTES = eINSTANCE.getMetodologia_PerfilesParticipantes();

		/**
		 * The meta object literal for the '<em><b>Practicas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__PRACTICAS = eINSTANCE.getMetodologia_Practicas();

		/**
		 * The meta object literal for the '<em><b>Tecnicas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__TECNICAS = eINSTANCE.getMetodologia_Tecnicas();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODOLOGIA__REPOSITORIO = eINSTANCE.getMetodologia_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl <em>Parrafo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParrafo()
		 * @generated
		 */
		EClass PARRAFO = eINSTANCE.getParrafo();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARRAFO__TEXTO = eINSTANCE.getParrafo_Texto();

		/**
		 * The meta object literal for the '<em><b>Documentacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARRAFO__DOCUMENTACION = eINSTANCE.getParrafo_Documentacion();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARRAFO__RUNS = eINSTANCE.getParrafo_Runs();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARRAFO__ESTILO = eINSTANCE.getParrafo_Estilo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl <em>Participacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParticipacion()
		 * @generated
		 */
		EClass PARTICIPACION = eINSTANCE.getParticipacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPACION__NOMBRE = eINSTANCE.getParticipacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPACION__TAREA = eINSTANCE.getParticipacion_Tarea();

		/**
		 * The meta object literal for the '<em><b>Perfil Participante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPACION__PERFIL_PARTICIPANTE = eINSTANCE.getParticipacion_PerfilParticipante();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ParticipanteImpl <em>Participante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ParticipanteImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getParticipante()
		 * @generated
		 */
		EClass PARTICIPANTE = eINSTANCE.getParticipante();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANTE__NOMBRE = eINSTANCE.getParticipante_Nombre();

		/**
		 * The meta object literal for the '<em><b>Perfil Participante</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANTE__PERFIL_PARTICIPANTE = eINSTANCE.getParticipante_PerfilParticipante();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl <em>Perfiles Participantes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPerfilesParticipantes()
		 * @generated
		 */
		EClass PERFILES_PARTICIPANTES = eINSTANCE.getPerfilesParticipantes();

		/**
		 * The meta object literal for the '<em><b>Perfiles Participantes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES = eINSTANCE.getPerfilesParticipantes_PerfilesParticipantes();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFILES_PARTICIPANTES__METODOLOGIA = eINSTANCE.getPerfilesParticipantes_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl <em>Perfil Participante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPerfilParticipante()
		 * @generated
		 */
		EClass PERFIL_PARTICIPANTE = eINSTANCE.getPerfilParticipante();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFIL_PARTICIPANTE__NOMBRE = eINSTANCE.getPerfilParticipante_Nombre();

		/**
		 * The meta object literal for the '<em><b>Participaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFIL_PARTICIPANTE__PARTICIPACIONES = eINSTANCE.getPerfilParticipante_Participaciones();

		/**
		 * The meta object literal for the '<em><b>Participantes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFIL_PARTICIPANTE__PARTICIPANTES = eINSTANCE.getPerfilParticipante_Participantes();

		/**
		 * The meta object literal for the '<em><b>Perfiles Participantes</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES = eINSTANCE.getPerfilParticipante_PerfilesParticipantes();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.PracticaImpl <em>Practica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.PracticaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPractica()
		 * @generated
		 */
		EClass PRACTICA = eINSTANCE.getPractica();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRACTICA__NOMBRE = eINSTANCE.getPractica_Nombre();

		/**
		 * The meta object literal for the '<em><b>Practicas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICA__PRACTICAS = eINSTANCE.getPractica_Practicas();

		/**
		 * The meta object literal for the '<em><b>Usos Practica</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICA__USOS_PRACTICA = eINSTANCE.getPractica_UsosPractica();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.PracticasImpl <em>Practicas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.PracticasImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getPracticas()
		 * @generated
		 */
		EClass PRACTICAS = eINSTANCE.getPracticas();

		/**
		 * The meta object literal for the '<em><b>Practicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICAS__PRACTICAS = eINSTANCE.getPracticas_Practicas();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRACTICAS__METODOLOGIA = eINSTANCE.getPracticas_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesoImpl <em>Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesoImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProceso()
		 * @generated
		 */
		EClass PROCESO = eINSTANCE.getProceso();

		/**
		 * The meta object literal for the '<em><b>Codigo YNombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO__CODIGO_YNOMBRE = eINSTANCE.getProceso_CodigoYNombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO__CODIGO = eINSTANCE.getProceso_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO__NOMBRE = eINSTANCE.getProceso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO__ACTIVIDADES = eINSTANCE.getProceso_Actividades();

		/**
		 * The meta object literal for the '<em><b>Procesos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO__PROCESOS = eINSTANCE.getProceso_Procesos();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO__CODIGO_COMPLETO = eINSTANCE.getProceso_CodigoCompleto();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesoInterfazImpl <em>Proceso Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesoInterfazImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProcesoInterfaz()
		 * @generated
		 */
		EClass PROCESO_INTERFAZ = eINSTANCE.getProcesoInterfaz();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO_INTERFAZ__CODIGO_COMPLETO = eINSTANCE.getProcesoInterfaz_CodigoCompleto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO_INTERFAZ__NOMBRE = eINSTANCE.getProcesoInterfaz_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO_INTERFAZ__CODIGO = eINSTANCE.getProcesoInterfaz_Codigo();

		/**
		 * The meta object literal for the '<em><b>Interfaz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO_INTERFAZ__INTERFAZ = eINSTANCE.getProcesoInterfaz_Interfaz();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO_INTERFAZ__ACTIVIDADES = eINSTANCE.getProcesoInterfaz_Actividades();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl <em>Procesos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProcesos()
		 * @generated
		 */
		EClass PROCESOS = eINSTANCE.getProcesos();

		/**
		 * The meta object literal for the '<em><b>Procesos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESOS__PROCESOS = eINSTANCE.getProcesos_Procesos();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESOS__METODOLOGIA = eINSTANCE.getProcesos_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProinsoCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoCollectionImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProinsoCollection()
		 * @generated
		 */
		EClass PROINSO_COLLECTION = eINSTANCE.getProinsoCollection();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProinsoObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoObjectImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProinsoObject()
		 * @generated
		 */
		EClass PROINSO_OBJECT = eINSTANCE.getProinsoObject();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProductoImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__NOMBRE = eINSTANCE.getProducto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__CODIGO = eINSTANCE.getProducto_Codigo();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__METODOLOGIA = eINSTANCE.getProducto_Metodologia();

		/**
		 * The meta object literal for the '<em><b>Es Externo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ES_EXTERNO = eINSTANCE.getProducto_EsExterno();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ProductosImpl <em>Productos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProductosImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getProductos()
		 * @generated
		 */
		EClass PRODUCTOS = eINSTANCE.getProductos();

		/**
		 * The meta object literal for the '<em><b>Productos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTOS__PRODUCTOS = eINSTANCE.getProductos_Productos();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTOS__METODOLOGIA = eINSTANCE.getProductos_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ReferenceRunImpl <em>Reference Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ReferenceRunImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getReferenceRun()
		 * @generated
		 */
		EClass REFERENCE_RUN = eINSTANCE.getReferenceRun();

		/**
		 * The meta object literal for the '<em><b>Referenciado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RUN__REFERENCIADO = eINSTANCE.getReferenceRun_Referenciado();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ReferenciableImpl <em>Referenciable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ReferenciableImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getReferenciable()
		 * @generated
		 */
		EClass REFERENCIABLE = eINSTANCE.getReferenciable();

		/**
		 * The meta object literal for the '<em><b>Referencias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCIABLE__REFERENCIAS = eINSTANCE.getReferenciable_Referencias();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl <em>Repositorio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getRepositorio()
		 * @generated
		 */
		EClass REPOSITORIO = eINSTANCE.getRepositorio();

		/**
		 * The meta object literal for the '<em><b>Metodologias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__METODOLOGIAS = eINSTANCE.getRepositorio_Metodologias();

		/**
		 * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__MODEL_PACKAGE = eINSTANCE.getRepositorio_ModelPackage();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.RunImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__TEXTO = eINSTANCE.getRun_Texto();

		/**
		 * The meta object literal for the '<em><b>Parrafo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__PARRAFO = eINSTANCE.getRun_Parrafo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl <em>Salida</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.SalidaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getSalida()
		 * @generated
		 */
		EClass SALIDA = eINSTANCE.getSalida();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA__NOMBRE = eINSTANCE.getSalida_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modo Uso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA__MODO_USO = eINSTANCE.getSalida_ModoUso();

		/**
		 * The meta object literal for the '<em><b>Guarda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA__GUARDA = eINSTANCE.getSalida_Guarda();

		/**
		 * The meta object literal for the '<em><b>Postcondiciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA__POSTCONDICIONES = eINSTANCE.getSalida_Postcondiciones();

		/**
		 * The meta object literal for the '<em><b>Forzado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALIDA__FORZADO = eINSTANCE.getSalida_Forzado();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALIDA__ENTRADAS = eINSTANCE.getSalida_Entradas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.SeccionImpl <em>Seccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.SeccionImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getSeccion()
		 * @generated
		 */
		EClass SECCION = eINSTANCE.getSeccion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECCION__NOMBRE = eINSTANCE.getSeccion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECCION__CODIGO = eINSTANCE.getSeccion_Codigo();

		/**
		 * The meta object literal for the '<em><b>Contenedor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECCION__CONTENEDOR = eINSTANCE.getSeccion_Contenedor();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.TareaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Codigo YNombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__CODIGO_YNOMBRE = eINSTANCE.getTarea_CodigoYNombre();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__CODIGO_COMPLETO = eINSTANCE.getTarea_CodigoCompleto();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__CODIGO = eINSTANCE.getTarea_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NOMBRE = eINSTANCE.getTarea_Nombre();

		/**
		 * The meta object literal for the '<em><b>Actividad</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__ACTIVIDAD = eINSTANCE.getTarea_Actividad();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__FLUJOS = eINSTANCE.getTarea_Flujos();

		/**
		 * The meta object literal for the '<em><b>Participaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__PARTICIPACIONES = eINSTANCE.getTarea_Participaciones();

		/**
		 * The meta object literal for the '<em><b>Uso Practicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__USO_PRACTICAS = eINSTANCE.getTarea_UsoPracticas();

		/**
		 * The meta object literal for the '<em><b>Uso Tecnicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__USO_TECNICAS = eINSTANCE.getTarea_UsoTecnicas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl <em>Tecnica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTecnica()
		 * @generated
		 */
		EClass TECNICA = eINSTANCE.getTecnica();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECNICA__NOMBRE = eINSTANCE.getTecnica_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tecnicas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECNICA__TECNICAS = eINSTANCE.getTecnica_Tecnicas();

		/**
		 * The meta object literal for the '<em><b>Usos Tecnica</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECNICA__USOS_TECNICA = eINSTANCE.getTecnica_UsosTecnica();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl <em>Tecnicas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTecnicas()
		 * @generated
		 */
		EClass TECNICAS = eINSTANCE.getTecnicas();

		/**
		 * The meta object literal for the '<em><b>Tecnicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECNICAS__TECNICAS = eINSTANCE.getTecnicas_Tecnicas();

		/**
		 * The meta object literal for the '<em><b>Metodologia</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECNICAS__METODOLOGIA = eINSTANCE.getTecnicas_Metodologia();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.TextRunImpl <em>Text Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.TextRunImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getTextRun()
		 * @generated
		 */
		EClass TEXT_RUN = eINSTANCE.getTextRun();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__ESTILO = eINSTANCE.getTextRun_Estilo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl <em>Usable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.UsableImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsable()
		 * @generated
		 */
		EClass USABLE = eINSTANCE.getUsable();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABLE__ETIQUETA = eINSTANCE.getUsable_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABLE__CONTENIDO = eINSTANCE.getUsable_Contenido();

		/**
		 * The meta object literal for the '<em><b>Usos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABLE__USOS = eINSTANCE.getUsable_Usos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl <em>Uso Flujo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoFlujo()
		 * @generated
		 */
		EClass USO_FLUJO = eINSTANCE.getUsoFlujo();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_FLUJO__ETIQUETA = eINSTANCE.getUsoFlujo_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_FLUJO__PRODUCTO = eINSTANCE.getUsoFlujo_Producto();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_FLUJO__TAREA = eINSTANCE.getUsoFlujo_Tarea();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoPracticaImpl <em>Uso Practica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.UsoPracticaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoPractica()
		 * @generated
		 */
		EClass USO_PRACTICA = eINSTANCE.getUsoPractica();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_PRACTICA__NOMBRE = eINSTANCE.getUsoPractica_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_PRACTICA__DESCRIPCION = eINSTANCE.getUsoPractica_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_PRACTICA__TAREA = eINSTANCE.getUsoPractica_Tarea();

		/**
		 * The meta object literal for the '<em><b>Practica</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_PRACTICA__PRACTICA = eINSTANCE.getUsoPractica_Practica();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl <em>Uso Tecnica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getUsoTecnica()
		 * @generated
		 */
		EClass USO_TECNICA = eINSTANCE.getUsoTecnica();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_TECNICA__NOMBRE = eINSTANCE.getUsoTecnica_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USO_TECNICA__DESCRIPCION = eINSTANCE.getUsoTecnica_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_TECNICA__TAREA = eINSTANCE.getUsoTecnica_Tarea();

		/**
		 * The meta object literal for the '<em><b>Tecnica</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USO_TECNICA__TECNICA = eINSTANCE.getUsoTecnica_Tecnica();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.impl.ConModelClassImpl
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getConModelClass()
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
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind <em>Modo Uso Entrada Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getModoUsoEntradaKind()
		 * @generated
		 */
		EEnum MODO_USO_ENTRADA_KIND = eINSTANCE.getModoUsoEntradaKind();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind <em>Modo Uso Salida Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind
		 * @see es.gva.cit.gvmetrica.proinso.impl.ProinsoPackageImpl#getModoUsoSalidaKind()
		 * @generated
		 */
		EEnum MODO_USO_SALIDA_KIND = eINSTANCE.getModoUsoSalidaKind();

	}

} //ProinsoPackage
