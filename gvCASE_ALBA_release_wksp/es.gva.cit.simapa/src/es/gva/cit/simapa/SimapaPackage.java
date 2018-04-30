/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

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
 * @see es.gva.cit.simapa.SimapaFactory
 * @model kind="package"
 * @generated
 */
public interface SimapaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simapa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///es/gva/cit/simapa.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.gva.cit.simapa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimapaPackage eINSTANCE = es.gva.cit.simapa.impl.SimapaPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ConModelClassImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getConModelClass()
	 * @generated
	 */
	int CON_MODEL_CLASS = 4;

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
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.SimapaObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.SimapaObjectImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSimapaObject()
	 * @generated
	 */
	int SIMAPA_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMAPA_OBJECT__MODEL_CLASS = CON_MODEL_CLASS__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMAPA_OBJECT_FEATURE_COUNT = CON_MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.RepositorioImpl <em>Repositorio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.RepositorioImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getRepositorio()
	 * @generated
	 */
	int REPOSITORIO = 28;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.NormativasYLegislacionesImpl <em>Normativas YLegislaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.NormativasYLegislacionesImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getNormativasYLegislaciones()
	 * @generated
	 */
	int NORMATIVAS_YLEGISLACIONES = 22;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl <em>Normativa YLegislacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.NormativaYLegislacionImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getNormativaYLegislacion()
	 * @generated
	 */
	int NORMATIVA_YLEGISLACION = 23;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.UnidadImpl <em>Unidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.UnidadImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidad()
	 * @generated
	 */
	int UNIDAD = 35;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ContenedorUnidadOrganicaImpl <em>Contenedor Unidad Organica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ContenedorUnidadOrganicaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorUnidadOrganica()
	 * @generated
	 */
	int CONTENEDOR_UNIDAD_ORGANICA = 7;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.UnidadesOrganicasImpl <em>Unidades Organicas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.UnidadesOrganicasImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadesOrganicas()
	 * @generated
	 */
	int UNIDADES_ORGANICAS = 36;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl <em>Unidad Organica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.UnidadOrganicaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadOrganica()
	 * @generated
	 */
	int UNIDAD_ORGANICA = 37;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ContenedorUnidadExternaImpl <em>Contenedor Unidad Externa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ContenedorUnidadExternaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorUnidadExterna()
	 * @generated
	 */
	int CONTENEDOR_UNIDAD_EXTERNA = 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.UnidadesExternasImpl <em>Unidades Externas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.UnidadesExternasImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadesExternas()
	 * @generated
	 */
	int UNIDADES_EXTERNAS = 38;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.UnidadExternaImpl <em>Unidad Externa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.UnidadExternaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadExterna()
	 * @generated
	 */
	int UNIDAD_EXTERNA = 39;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ContenedorEstructuraFuncionalImpl <em>Contenedor Estructura Funcional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ContenedorEstructuraFuncionalImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorEstructuraFuncional()
	 * @generated
	 */
	int CONTENEDOR_ESTRUCTURA_FUNCIONAL = 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.EstructurasFuncionalesImpl <em>Estructuras Funcionales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.EstructurasFuncionalesImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEstructurasFuncionales()
	 * @generated
	 */
	int ESTRUCTURAS_FUNCIONALES = 17;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl <em>Estructura Funcional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.EstructuraFuncionalImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEstructuraFuncional()
	 * @generated
	 */
	int ESTRUCTURA_FUNCIONAL = 16;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ClasesDocumentoImpl <em>Clases Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ClasesDocumentoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getClasesDocumento()
	 * @generated
	 */
	int CLASES_DOCUMENTO = 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ClaseDocumentoImpl <em>Clase Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ClaseDocumentoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getClaseDocumento()
	 * @generated
	 */
	int CLASE_DOCUMENTO = 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.DocumentosImpl <em>Documentos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.DocumentosImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentos()
	 * @generated
	 */
	int DOCUMENTOS = 12;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.DocumentoImpl <em>Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.DocumentoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumento()
	 * @generated
	 */
	int DOCUMENTO = 11;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.AplicacionesImpl <em>Aplicaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.AplicacionesImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getAplicaciones()
	 * @generated
	 */
	int APLICACIONES = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.AplicacionImpl <em>Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.AplicacionImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getAplicacion()
	 * @generated
	 */
	int APLICACION = 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Herramienta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__HERRAMIENTA = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base De Datos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__BASE_DE_DATOS = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Numero Usuarios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NUMERO_USUARIOS = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estado Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__ESTADO_APLICACION = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nivel Seguridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NIVEL_SEGURIDAD = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Desarrollador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__DESARROLLADOR = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tipo Desarrollo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__TIPO_DESARROLLO = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tipo Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__TIPO_APLICACION = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Complejidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__COMPLEJIDAD = SIMAPA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Importancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__IMPORTANCIA = SIMAPA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__OPERACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__APLICACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.SimapaCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.SimapaCollectionImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSimapaCollection()
	 * @generated
	 */
	int SIMAPA_COLLECTION = 30;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMAPA_COLLECTION__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMAPA_COLLECTION_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACIONES__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACIONES__APLICACIONES = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACIONES__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACIONES_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__OBSERVACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clases Documento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__CLASES_DOCUMENTO = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO__DOCUMENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clase Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_DOCUMENTO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASES_DOCUMENTO__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Clases Documento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASES_DOCUMENTO__CLASES_DOCUMENTO = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASES_DOCUMENTO__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clases Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASES_DOCUMENTO_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Estructura Funcional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESTRUCTURA_FUNCIONAL_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Unidad Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UNIDAD_EXTERNA_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION = 0;

	/**
	 * The number of structural features of the '<em>Contenedor Unidad Organica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UNIDAD_ORGANICA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.GlosarioImpl <em>Glosario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.GlosarioImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getGlosario()
	 * @generated
	 */
	int GLOSARIO = 21;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.TerminoGlosarioImpl <em>Termino Glosario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.TerminoGlosarioImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTerminoGlosario()
	 * @generated
	 */
	int TERMINO_GLOSARIO = 33;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ProcedimientosImpl <em>Procedimientos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ProcedimientosImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getProcedimientos()
	 * @generated
	 */
	int PROCEDIMIENTOS = 27;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ProcedimientoImpl <em>Procedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ProcedimientoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getProcedimiento()
	 * @generated
	 */
	int PROCEDIMIENTO = 26;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl <em>Ficha Archivistica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.FichaArchivisticaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFichaArchivistica()
	 * @generated
	 */
	int FICHA_ARCHIVISTICA = 18;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ConvocatoriaImpl <em>Convocatoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ConvocatoriaImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getConvocatoria()
	 * @generated
	 */
	int CONVOCATORIA = 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl <em>Control Procedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.ControlProcedimientoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getControlProcedimiento()
	 * @generated
	 */
	int CONTROL_PROCEDIMIENTO = 8;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__USUARIO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Situacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__SITUACION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fecha Hora Modificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fecha Inicio Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fecha Fin Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comentario Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fecha Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_ELABORADO = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nombre Persona Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Puesto Persona Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fecha Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_REVISADO = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Nombre Persona Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Puesto Persona Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO = SIMAPA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fecha Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__FECHA_APROBADO = SIMAPA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Nombre Persona Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO = SIMAPA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Puesto Persona Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO = SIMAPA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO__PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Control Procedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PROCEDIMIENTO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA__PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Convocatoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVOCATORIA_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl <em>Tramitacion Procedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.TramitacionProcedimientoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTramitacionProcedimiento()
	 * @generated
	 */
	int TRAMITACION_PROCEDIMIENTO = 34;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.OperacionesImpl <em>Operaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.OperacionesImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getOperaciones()
	 * @generated
	 */
	int OPERACIONES = 25;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.OperacionImpl <em>Operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.OperacionImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getOperacion()
	 * @generated
	 */
	int OPERACION = 24;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__TITULO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__PLAZO_EJECUCION = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_WORKFLOW = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NUMERO_PAGINA = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NUMERO_ORDEN = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__OPERACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__APLICACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__FLUJOS_ENTRANTES = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__FLUJOS_SALIENTES = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__UNIDAD = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.DecisionImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 10;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__MODEL_CLASS = OPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ETIQUETA = OPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TITULO = OPERACION__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPCION = OPERACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PLAZO_EJECUCION = OPERACION__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ES_WORKFLOW = OPERACION__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NUMERO_PAGINA = OPERACION__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NUMERO_ORDEN = OPERACION__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OPERACIONES = OPERACION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__APLICACIONES = OPERACION__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__FLUJOS_ENTRANTES = OPERACION__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__FLUJOS_SALIENTES = OPERACION__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__UNIDAD = OPERACION__UNIDAD;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TITULO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fichero Modelo Fomulario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__FICHERO_MODELO_FOMULARIO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__OBSERVACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tipo Almacenamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TIPO_ALMACENAMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tipo Medio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TIPO_MEDIO = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tipo Ambito</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TIPO_AMBITO = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clase Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__CLASE_DOCUMENTO = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Documentos Finales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DOCUMENTOS_FINALES = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Flujos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__FLUJOS = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DOCUMENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTOS__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTOS__DOCUMENTOS = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTOS__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documentos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTOS_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.SubprocedimientoImpl <em>Subprocedimiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.SubprocedimientoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSubprocedimiento()
	 * @generated
	 */
	int SUBPROCEDIMIENTO = 32;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.DocumentoFinalImpl <em>Documento Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.DocumentoFinalImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentoFinal()
	 * @generated
	 */
	int DOCUMENTO_FINAL = 13;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__MODEL_CLASS = OPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__ETIQUETA = OPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__TITULO = OPERACION__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__DESCRIPCION = OPERACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__PLAZO_EJECUCION = OPERACION__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__ES_WORKFLOW = OPERACION__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__NUMERO_PAGINA = OPERACION__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__NUMERO_ORDEN = OPERACION__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__OPERACIONES = OPERACION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__APLICACIONES = OPERACION__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__FLUJOS_ENTRANTES = OPERACION__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__FLUJOS_SALIENTES = OPERACION__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__UNIDAD = OPERACION__UNIDAD;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL__DOCUMENTO = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documento Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.DocumentoFinalInternoImpl <em>Documento Final Interno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.DocumentoFinalInternoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentoFinalInterno()
	 * @generated
	 */
	int DOCUMENTO_FINAL_INTERNO = 14;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__MODEL_CLASS = DOCUMENTO_FINAL__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__ETIQUETA = DOCUMENTO_FINAL__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__TITULO = DOCUMENTO_FINAL__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__DESCRIPCION = DOCUMENTO_FINAL__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__PLAZO_EJECUCION = DOCUMENTO_FINAL__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__ES_WORKFLOW = DOCUMENTO_FINAL__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__NUMERO_PAGINA = DOCUMENTO_FINAL__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__NUMERO_ORDEN = DOCUMENTO_FINAL__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__OPERACIONES = DOCUMENTO_FINAL__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__APLICACIONES = DOCUMENTO_FINAL__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__FLUJOS_ENTRANTES = DOCUMENTO_FINAL__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__FLUJOS_SALIENTES = DOCUMENTO_FINAL__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__UNIDAD = DOCUMENTO_FINAL__UNIDAD;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO__DOCUMENTO = DOCUMENTO_FINAL__DOCUMENTO;

	/**
	 * The number of structural features of the '<em>Documento Final Interno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FINAL_INTERNO_FEATURE_COUNT = DOCUMENTO_FINAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.EntradaDocumentoFinalImpl <em>Entrada Documento Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.EntradaDocumentoFinalImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEntradaDocumentoFinal()
	 * @generated
	 */
	int ENTRADA_DOCUMENTO_FINAL = 15;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__MODEL_CLASS = DOCUMENTO_FINAL__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__ETIQUETA = DOCUMENTO_FINAL__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__TITULO = DOCUMENTO_FINAL__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__DESCRIPCION = DOCUMENTO_FINAL__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__PLAZO_EJECUCION = DOCUMENTO_FINAL__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__ES_WORKFLOW = DOCUMENTO_FINAL__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__NUMERO_PAGINA = DOCUMENTO_FINAL__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__NUMERO_ORDEN = DOCUMENTO_FINAL__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__OPERACIONES = DOCUMENTO_FINAL__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__APLICACIONES = DOCUMENTO_FINAL__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__FLUJOS_ENTRANTES = DOCUMENTO_FINAL__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__FLUJOS_SALIENTES = DOCUMENTO_FINAL__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__UNIDAD = DOCUMENTO_FINAL__UNIDAD;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL__DOCUMENTO = DOCUMENTO_FINAL__DOCUMENTO;

	/**
	 * The number of structural features of the '<em>Entrada Documento Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRADA_DOCUMENTO_FINAL_FEATURE_COUNT = DOCUMENTO_FINAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__DESCOMPOSICION = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Descompone</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__DESCOMPONE = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unidades Organicas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Estructura Funcional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURA_FUNCIONAL_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAS_FUNCIONALES__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAS_FUNCIONALES__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Estructuras Funcionales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAS_FUNCIONALES_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tiene Valor Legal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tiene Valor Administrativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tiene Valor Informativo Historico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tipo Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__TIPO_ACCESO = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reglas Eliminacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__REGLAS_ELIMINACION = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reglas Conservacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__REGLAS_CONSERVACION = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__OBSERVACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA__PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ficha Archivistica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHA_ARCHIVISTICA_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.SalidaDocumentoFinalImpl <em>Salida Documento Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.SalidaDocumentoFinalImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSalidaDocumentoFinal()
	 * @generated
	 */
	int SALIDA_DOCUMENTO_FINAL = 29;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.FinProcesoImpl <em>Fin Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.FinProcesoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFinProceso()
	 * @generated
	 */
	int FIN_PROCESO = 19;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__MODEL_CLASS = OPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__ETIQUETA = OPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__TITULO = OPERACION__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__DESCRIPCION = OPERACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__PLAZO_EJECUCION = OPERACION__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__ES_WORKFLOW = OPERACION__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__NUMERO_PAGINA = OPERACION__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__NUMERO_ORDEN = OPERACION__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__OPERACIONES = OPERACION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__APLICACIONES = OPERACION__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__FLUJOS_ENTRANTES = OPERACION__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__FLUJOS_SALIENTES = OPERACION__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO__UNIDAD = OPERACION__UNIDAD;

	/**
	 * The number of structural features of the '<em>Fin Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_PROCESO_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.impl.FlujoImpl <em>Flujo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.impl.FlujoImpl
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFlujo()
	 * @generated
	 */
	int FLUJO = 20;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__TEXTO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Es Conector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__ES_CONECTOR = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guarda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__GUARDA = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__ORIGEN = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__DESTINO = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO__DOCUMENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Flujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUJO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Terminos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__TERMINOS = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO__REPOSITORIO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSARIO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVAS_YLEGISLACIONES__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVAS_YLEGISLACIONES__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVAS_YLEGISLACIONES__NORMATIVAS = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normativas YLegislaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVAS_YLEGISLACIONES_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__NORMATIVAS = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Normativa YLegislacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMATIVA_YLEGISLACION_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__PROCEDIMIENTO = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__OPERACIONES = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__CODIGO = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__VERSION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__CODIGO_COMPLETO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__PROP = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__TITULO = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Objeto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__OBJETO = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__OBSERVACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__PERSONA = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tipo Procedimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__TIPO_PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__NOTAS = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Periodicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__PERIODICIDAD = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Titulo Ultima Convocatoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA = SIMAPA_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__OPERACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__DOCUMENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Terminos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__TERMINOS = SIMAPA_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ficha Archivistica</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__FICHA_ARCHIVISTICA = SIMAPA_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Unidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__UNIDADES = SIMAPA_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tramitacion Procedimiento</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Usos Como Sub Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Convocatorias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__CONVOCATORIAS = SIMAPA_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__RESPONSABLE = SIMAPA_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Control Procedimiento</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__CONTROL_PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__NORMATIVAS = SIMAPA_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__SERVICIO = SIMAPA_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO__APLICACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Procedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTOS__MODEL_CLASS = SIMAPA_COLLECTION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTOS__REPOSITORIO = SIMAPA_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTOS__PROCEDIMIENTOS = SIMAPA_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedimientos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDIMIENTOS_FEATURE_COUNT = SIMAPA_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__DOCUMENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estructuras Funcionales</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__ESTRUCTURAS_FUNCIONALES = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Glosario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__GLOSARIO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normativas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__NORMATIVAS = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unidades Organicas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__UNIDADES_ORGANICAS = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unidades Externas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__UNIDADES_EXTERNAS = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clases Documento</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__CLASES_DOCUMENTO = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__APLICACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO__MODEL_PACKAGE = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Repositorio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORIO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__MODEL_CLASS = DOCUMENTO_FINAL__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__ETIQUETA = DOCUMENTO_FINAL__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__TITULO = DOCUMENTO_FINAL__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__DESCRIPCION = DOCUMENTO_FINAL__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__PLAZO_EJECUCION = DOCUMENTO_FINAL__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__ES_WORKFLOW = DOCUMENTO_FINAL__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__NUMERO_PAGINA = DOCUMENTO_FINAL__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__NUMERO_ORDEN = DOCUMENTO_FINAL__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__OPERACIONES = DOCUMENTO_FINAL__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__APLICACIONES = DOCUMENTO_FINAL__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__FLUJOS_ENTRANTES = DOCUMENTO_FINAL__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__FLUJOS_SALIENTES = DOCUMENTO_FINAL__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__UNIDAD = DOCUMENTO_FINAL__UNIDAD;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL__DOCUMENTO = DOCUMENTO_FINAL__DOCUMENTO;

	/**
	 * The number of structural features of the '<em>Salida Documento Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALIDA_DOCUMENTO_FINAL_FEATURE_COUNT = DOCUMENTO_FINAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__MODEL_CLASS = OPERACION__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__ETIQUETA = OPERACION__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__TITULO = OPERACION__TITULO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__DESCRIPCION = OPERACION__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__PLAZO_EJECUCION = OPERACION__PLAZO_EJECUCION;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__ES_WORKFLOW = OPERACION__ES_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__NUMERO_PAGINA = OPERACION__NUMERO_PAGINA;

	/**
	 * The feature id for the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__NUMERO_ORDEN = OPERACION__NUMERO_ORDEN;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__OPERACIONES = OPERACION__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Aplicaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__APLICACIONES = OPERACION__APLICACIONES;

	/**
	 * The feature id for the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__FLUJOS_ENTRANTES = OPERACION__FLUJOS_ENTRANTES;

	/**
	 * The feature id for the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__FLUJOS_SALIENTES = OPERACION__FLUJOS_SALIENTES;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__UNIDAD = OPERACION__UNIDAD;

	/**
	 * The feature id for the '<em><b>Sub Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO = OPERACION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subprocedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCEDIMIENTO_FEATURE_COUNT = OPERACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__DESCRIPCION = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__PROCEDIMIENTOS = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Glosario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO__GLOSARIO = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Termino Glosario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINO_GLOSARIO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inicio Instancia De Parte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inicio De Oficio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumen Expedientes Ejercicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Presupuesto Anual Aproximado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Plazo Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Plazo Resolucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Silencio Administrativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recurso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__RECURSO = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Es Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Procedimiento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO = SIMAPA_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tramitacion Procedimiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMITACION_PROCEDIMIENTO_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__MODEL_CLASS = SIMAPA_OBJECT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__ETIQUETA = SIMAPA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__NOMBRE = SIMAPA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__PERSONA = SIMAPA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__TELEFONO = SIMAPA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__FAX = SIMAPA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__DIRECCION = SIMAPA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__NOTAS = SIMAPA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__OBSERVACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD__OPERACIONES = SIMAPA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_FEATURE_COUNT = SIMAPA_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_ORGANICAS__DESCOMPOSICION = CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_ORGANICAS__REPOSITORIO = CONTENEDOR_UNIDAD_ORGANICA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unidades Organicas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_ORGANICAS_FEATURE_COUNT = CONTENEDOR_UNIDAD_ORGANICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__MODEL_CLASS = UNIDAD__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__ETIQUETA = UNIDAD__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__NOMBRE = UNIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__PERSONA = UNIDAD__PERSONA;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__TELEFONO = UNIDAD__TELEFONO;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__FAX = UNIDAD__FAX;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__DIRECCION = UNIDAD__DIRECCION;

	/**
	 * The feature id for the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__NOTAS = UNIDAD__NOTAS;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__OBSERVACIONES = UNIDAD__OBSERVACIONES;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__OPERACIONES = UNIDAD__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__DESCOMPOSICION = UNIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__CODIGO = UNIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__DESCRIPCION = UNIDAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tipo Unidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__TIPO_UNIDAD = UNIDAD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codigo Organico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__CODIGO_ORGANICO = UNIDAD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unidad De Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS = UNIDAD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Descompone</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__DESCOMPONE = UNIDAD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estructuras Funcionales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES = UNIDAD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Responsable De Procedimientos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS = UNIDAD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unidad Organica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_ORGANICA_FEATURE_COUNT = UNIDAD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_EXTERNAS__DESCOMPOSICION = CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION;

	/**
	 * The feature id for the '<em><b>Repositorio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_EXTERNAS__REPOSITORIO = CONTENEDOR_UNIDAD_EXTERNA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unidades Externas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDADES_EXTERNAS_FEATURE_COUNT = CONTENEDOR_UNIDAD_EXTERNA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__MODEL_CLASS = UNIDAD__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__ETIQUETA = UNIDAD__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__NOMBRE = UNIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__PERSONA = UNIDAD__PERSONA;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__TELEFONO = UNIDAD__TELEFONO;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__FAX = UNIDAD__FAX;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__DIRECCION = UNIDAD__DIRECCION;

	/**
	 * The feature id for the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__NOTAS = UNIDAD__NOTAS;

	/**
	 * The feature id for the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__OBSERVACIONES = UNIDAD__OBSERVACIONES;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__OPERACIONES = UNIDAD__OPERACIONES;

	/**
	 * The feature id for the '<em><b>Descomposicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__DESCOMPOSICION = UNIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__TIPO_ENTIDAD = UNIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descompone</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA__DESCOMPONE = UNIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unidad Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDAD_EXTERNA_FEATURE_COUNT = UNIDAD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoMedioDocumento <em>Tipo Medio Documento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoMedioDocumento
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoMedioDocumento()
	 * @generated
	 */
	int TIPO_MEDIO_DOCUMENTO = 40;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoSilencioAdministrativo <em>Tipo Silencio Administrativo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoSilencioAdministrativo
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoSilencioAdministrativo()
	 * @generated
	 */
	int TIPO_SILENCIO_ADMINISTRATIVO = 41;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoSituacionProcedimiento <em>Tipo Situacion Procedimiento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoSituacionProcedimiento
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoSituacionProcedimiento()
	 * @generated
	 */
	int TIPO_SITUACION_PROCEDIMIENTO = 42;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoAccesoArchivo <em>Tipo Acceso Archivo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoAccesoArchivo
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAccesoArchivo()
	 * @generated
	 */
	int TIPO_ACCESO_ARCHIVO = 43;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoAmbitoDocumento <em>Tipo Ambito Documento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoAmbitoDocumento
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAmbitoDocumento()
	 * @generated
	 */
	int TIPO_AMBITO_DOCUMENTO = 44;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoAlmacenamientoDocumento <em>Tipo Almacenamiento Documento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoAlmacenamientoDocumento
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAlmacenamientoDocumento()
	 * @generated
	 */
	int TIPO_ALMACENAMIENTO_DOCUMENTO = 45;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoDesarrollo <em>Tipo Desarrollo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoDesarrollo
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoDesarrollo()
	 * @generated
	 */
	int TIPO_DESARROLLO = 46;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.TipoAplicacion <em>Tipo Aplicacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.TipoAplicacion
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAplicacion()
	 * @generated
	 */
	int TIPO_APLICACION = 47;

	/**
	 * The meta object id for the '{@link es.gva.cit.simapa.Rango1_10 <em>Rango1 10</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.simapa.Rango1_10
	 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getRango1_10()
	 * @generated
	 */
	int RANGO1_10 = 48;


	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Repositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.Repositorio
	 * @generated
	 */
	EClass getRepositorio();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getProcedimientos()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Procedimientos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getDocumentos()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Documentos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getEstructurasFuncionales()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_EstructurasFuncionales();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glosario</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getGlosario()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Glosario();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normativas</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getNormativas()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Normativas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unidades Organicas</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getUnidadesOrganicas()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_UnidadesOrganicas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getUnidadesExternas <em>Unidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unidades Externas</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getUnidadesExternas()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_UnidadesExternas();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clases Documento</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getClasesDocumento()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_ClasesDocumento();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Repositorio#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getAplicaciones()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_Aplicaciones();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Repositorio#getModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Package</em>'.
	 * @see es.gva.cit.simapa.Repositorio#getModelPackage()
	 * @see #getRepositorio()
	 * @generated
	 */
	EReference getRepositorio_ModelPackage();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.NormativasYLegislaciones <em>Normativas YLegislaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normativas YLegislaciones</em>'.
	 * @see es.gva.cit.simapa.NormativasYLegislaciones
	 * @generated
	 */
	EClass getNormativasYLegislaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.NormativasYLegislaciones#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.NormativasYLegislaciones#getRepositorio()
	 * @see #getNormativasYLegislaciones()
	 * @generated
	 */
	EReference getNormativasYLegislaciones_Repositorio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.NormativasYLegislaciones#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Normativas</em>'.
	 * @see es.gva.cit.simapa.NormativasYLegislaciones#getNormativas()
	 * @see #getNormativasYLegislaciones()
	 * @generated
	 */
	EReference getNormativasYLegislaciones_Normativas();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.NormativaYLegislacion <em>Normativa YLegislacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normativa YLegislacion</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion
	 * @generated
	 */
	EClass getNormativaYLegislacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.NormativaYLegislacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getEtiqueta()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EAttribute getNormativaYLegislacion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.NormativaYLegislacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getNombre()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EAttribute getNormativaYLegislacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.NormativaYLegislacion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getDescripcion()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EAttribute getNormativaYLegislacion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.NormativaYLegislacion#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getCodigo()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EAttribute getNormativaYLegislacion_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.NormativaYLegislacion#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Normativas</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getNormativas()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EReference getNormativaYLegislacion_Normativas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.NormativaYLegislacion#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getProcedimientos()
	 * @see #getNormativaYLegislacion()
	 * @generated
	 */
	EReference getNormativaYLegislacion_Procedimientos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Unidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidad</em>'.
	 * @see es.gva.cit.simapa.Unidad
	 * @generated
	 */
	EClass getUnidad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Unidad#getEtiqueta()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.Unidad#getNombre()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persona</em>'.
	 * @see es.gva.cit.simapa.Unidad#getPersona()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Persona();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see es.gva.cit.simapa.Unidad#getTelefono()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see es.gva.cit.simapa.Unidad#getFax()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Fax();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see es.gva.cit.simapa.Unidad#getDireccion()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getNotas <em>Notas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notas</em>'.
	 * @see es.gva.cit.simapa.Unidad#getNotas()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Notas();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Unidad#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.simapa.Unidad#getObservaciones()
	 * @see #getUnidad()
	 * @generated
	 */
	EAttribute getUnidad_Observaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Unidad#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Unidad#getOperaciones()
	 * @see #getUnidad()
	 * @generated
	 */
	EReference getUnidad_Operaciones();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ContenedorUnidadOrganica <em>Contenedor Unidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Unidad Organica</em>'.
	 * @see es.gva.cit.simapa.ContenedorUnidadOrganica
	 * @generated
	 */
	EClass getContenedorUnidadOrganica();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.ContenedorUnidadOrganica#getDescomposicion <em>Descomposicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descomposicion</em>'.
	 * @see es.gva.cit.simapa.ContenedorUnidadOrganica#getDescomposicion()
	 * @see #getContenedorUnidadOrganica()
	 * @generated
	 */
	EReference getContenedorUnidadOrganica_Descomposicion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.UnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidades Organicas</em>'.
	 * @see es.gva.cit.simapa.UnidadesOrganicas
	 * @generated
	 */
	EClass getUnidadesOrganicas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.UnidadesOrganicas#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.UnidadesOrganicas#getRepositorio()
	 * @see #getUnidadesOrganicas()
	 * @generated
	 */
	EReference getUnidadesOrganicas_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.UnidadOrganica <em>Unidad Organica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidad Organica</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica
	 * @generated
	 */
	EClass getUnidadOrganica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.UnidadOrganica#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getCodigo()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EAttribute getUnidadOrganica_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.UnidadOrganica#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getDescripcion()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EAttribute getUnidadOrganica_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.UnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Unidad</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getTipoUnidad()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EAttribute getUnidadOrganica_TipoUnidad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.UnidadOrganica#getCodigoOrganico <em>Codigo Organico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Organico</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getCodigoOrganico()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EAttribute getUnidadOrganica_CodigoOrganico();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.UnidadOrganica#getUnidadDeProcedimientos <em>Unidad De Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidad De Procedimientos</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getUnidadDeProcedimientos()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EReference getUnidadOrganica_UnidadDeProcedimientos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.UnidadOrganica#getDescompone <em>Descompone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Descompone</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getDescompone()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EReference getUnidadOrganica_Descompone();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.UnidadOrganica#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getEstructurasFuncionales()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EReference getUnidadOrganica_EstructurasFuncionales();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.UnidadOrganica#getResponsableDeProcedimientos <em>Responsable De Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsable De Procedimientos</em>'.
	 * @see es.gva.cit.simapa.UnidadOrganica#getResponsableDeProcedimientos()
	 * @see #getUnidadOrganica()
	 * @generated
	 */
	EReference getUnidadOrganica_ResponsableDeProcedimientos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ContenedorUnidadExterna <em>Contenedor Unidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Unidad Externa</em>'.
	 * @see es.gva.cit.simapa.ContenedorUnidadExterna
	 * @generated
	 */
	EClass getContenedorUnidadExterna();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.ContenedorUnidadExterna#getDescomposicion <em>Descomposicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descomposicion</em>'.
	 * @see es.gva.cit.simapa.ContenedorUnidadExterna#getDescomposicion()
	 * @see #getContenedorUnidadExterna()
	 * @generated
	 */
	EReference getContenedorUnidadExterna_Descomposicion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.UnidadesExternas <em>Unidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidades Externas</em>'.
	 * @see es.gva.cit.simapa.UnidadesExternas
	 * @generated
	 */
	EClass getUnidadesExternas();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.UnidadesExternas#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.UnidadesExternas#getRepositorio()
	 * @see #getUnidadesExternas()
	 * @generated
	 */
	EReference getUnidadesExternas_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.UnidadExterna <em>Unidad Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidad Externa</em>'.
	 * @see es.gva.cit.simapa.UnidadExterna
	 * @generated
	 */
	EClass getUnidadExterna();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.UnidadExterna#getTipoEntidad <em>Tipo Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Entidad</em>'.
	 * @see es.gva.cit.simapa.UnidadExterna#getTipoEntidad()
	 * @see #getUnidadExterna()
	 * @generated
	 */
	EAttribute getUnidadExterna_TipoEntidad();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.UnidadExterna#getDescompone <em>Descompone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Descompone</em>'.
	 * @see es.gva.cit.simapa.UnidadExterna#getDescompone()
	 * @see #getUnidadExterna()
	 * @generated
	 */
	EReference getUnidadExterna_Descompone();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ContenedorEstructuraFuncional <em>Contenedor Estructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Estructura Funcional</em>'.
	 * @see es.gva.cit.simapa.ContenedorEstructuraFuncional
	 * @generated
	 */
	EClass getContenedorEstructuraFuncional();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.ContenedorEstructuraFuncional#getDescomposicion <em>Descomposicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descomposicion</em>'.
	 * @see es.gva.cit.simapa.ContenedorEstructuraFuncional#getDescomposicion()
	 * @see #getContenedorEstructuraFuncional()
	 * @generated
	 */
	EReference getContenedorEstructuraFuncional_Descomposicion();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.EstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estructuras Funcionales</em>'.
	 * @see es.gva.cit.simapa.EstructurasFuncionales
	 * @generated
	 */
	EClass getEstructurasFuncionales();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.EstructurasFuncionales#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.EstructurasFuncionales#getRepositorio()
	 * @see #getEstructurasFuncionales()
	 * @generated
	 */
	EReference getEstructurasFuncionales_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.EstructuraFuncional <em>Estructura Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estructura Funcional</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional
	 * @generated
	 */
	EClass getEstructuraFuncional();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.EstructuraFuncional#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getEtiqueta()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EAttribute getEstructuraFuncional_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.EstructuraFuncional#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getNombre()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EAttribute getEstructuraFuncional_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.EstructuraFuncional#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getCodigo()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EAttribute getEstructuraFuncional_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.EstructuraFuncional#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getDescripcion()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EAttribute getEstructuraFuncional_Descripcion();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.EstructuraFuncional#getDescompone <em>Descompone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Descompone</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getDescompone()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EReference getEstructuraFuncional_Descompone();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.EstructuraFuncional#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidades Organicas</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getUnidadesOrganicas()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EReference getEstructuraFuncional_UnidadesOrganicas();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.EstructuraFuncional#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.EstructuraFuncional#getProcedimientos()
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	EReference getEstructuraFuncional_Procedimientos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clases Documento</em>'.
	 * @see es.gva.cit.simapa.ClasesDocumento
	 * @generated
	 */
	EClass getClasesDocumento();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.ClasesDocumento#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases Documento</em>'.
	 * @see es.gva.cit.simapa.ClasesDocumento#getClasesDocumento()
	 * @see #getClasesDocumento()
	 * @generated
	 */
	EReference getClasesDocumento_ClasesDocumento();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.ClasesDocumento#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.ClasesDocumento#getRepositorio()
	 * @see #getClasesDocumento()
	 * @generated
	 */
	EReference getClasesDocumento_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Con Model Class</em>'.
	 * @see es.gva.cit.simapa.ConModelClass
	 * @generated
	 */
	EClass getConModelClass();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.ConModelClass#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Class</em>'.
	 * @see es.gva.cit.simapa.ConModelClass#getModelClass()
	 * @see #getConModelClass()
	 * @generated
	 */
	EReference getConModelClass_ModelClass();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ClaseDocumento <em>Clase Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase Documento</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento
	 * @generated
	 */
	EClass getClaseDocumento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ClaseDocumento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getEtiqueta()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EAttribute getClaseDocumento_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ClaseDocumento#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getCodigo()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EAttribute getClaseDocumento_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ClaseDocumento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getNombre()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EAttribute getClaseDocumento_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ClaseDocumento#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getObservaciones()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EAttribute getClaseDocumento_Observaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.ClaseDocumento#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clases Documento</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getClasesDocumento()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EReference getClaseDocumento_ClasesDocumento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.ClaseDocumento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.ClaseDocumento#getDocumentos()
	 * @see #getClaseDocumento()
	 * @generated
	 */
	EReference getClaseDocumento_Documentos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Documentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Documentos
	 * @generated
	 */
	EClass getDocumentos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Documentos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Documentos#getDocumentos()
	 * @see #getDocumentos()
	 * @generated
	 */
	EReference getDocumentos_Documentos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Documentos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.Documentos#getRepositorio()
	 * @see #getDocumentos()
	 * @generated
	 */
	EReference getDocumentos_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento</em>'.
	 * @see es.gva.cit.simapa.Documento
	 * @generated
	 */
	EClass getDocumento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Documento#getEtiqueta()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see es.gva.cit.simapa.Documento#getTitulo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.Documento#getCodigo()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getFicheroModeloFomulario <em>Fichero Modelo Fomulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fichero Modelo Fomulario</em>'.
	 * @see es.gva.cit.simapa.Documento#getFicheroModeloFomulario()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_FicheroModeloFomulario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.simapa.Documento#getObservaciones()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Observaciones();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getTipoAlmacenamiento <em>Tipo Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Almacenamiento</em>'.
	 * @see es.gva.cit.simapa.Documento#getTipoAlmacenamiento()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_TipoAlmacenamiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getTipoMedio <em>Tipo Medio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Medio</em>'.
	 * @see es.gva.cit.simapa.Documento#getTipoMedio()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_TipoMedio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Documento#getTipoAmbito <em>Tipo Ambito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Ambito</em>'.
	 * @see es.gva.cit.simapa.Documento#getTipoAmbito()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_TipoAmbito();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Documento#getClaseDocumento <em>Clase Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase Documento</em>'.
	 * @see es.gva.cit.simapa.Documento#getClaseDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_ClaseDocumento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Documento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Documento#getProcedimientos()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Procedimientos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Documento#getDocumentosFinales <em>Documentos Finales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos Finales</em>'.
	 * @see es.gva.cit.simapa.Documento#getDocumentosFinales()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_DocumentosFinales();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Documento#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flujos</em>'.
	 * @see es.gva.cit.simapa.Documento#getFlujos()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Flujos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Documento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Documento#getDocumentos()
	 * @see #getDocumento()
	 * @generated
	 */
	EReference getDocumento_Documentos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Aplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Aplicaciones
	 * @generated
	 */
	EClass getAplicaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Aplicaciones#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Aplicaciones#getAplicaciones()
	 * @see #getAplicaciones()
	 * @generated
	 */
	EReference getAplicaciones_Aplicaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Aplicaciones#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.Aplicaciones#getRepositorio()
	 * @see #getAplicaciones()
	 * @generated
	 */
	EReference getAplicaciones_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion</em>'.
	 * @see es.gva.cit.simapa.Aplicacion
	 * @generated
	 */
	EClass getAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getEtiqueta()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getNombre()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getDescripcion()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getCodigo()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getHerramienta <em>Herramienta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Herramienta</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getHerramienta()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Herramienta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getBaseDeDatos <em>Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base De Datos</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getBaseDeDatos()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_BaseDeDatos();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getNumeroUsuarios <em>Numero Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Usuarios</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getNumeroUsuarios()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_NumeroUsuarios();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getEstadoAplicacion <em>Estado Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado Aplicacion</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getEstadoAplicacion()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_EstadoAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getNivelSeguridad <em>Nivel Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nivel Seguridad</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getNivelSeguridad()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_NivelSeguridad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getDesarrollador <em>Desarrollador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desarrollador</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getDesarrollador()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Desarrollador();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getTipoDesarrollo <em>Tipo Desarrollo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Desarrollo</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getTipoDesarrollo()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_TipoDesarrollo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getTipoAplicacion <em>Tipo Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Aplicacion</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getTipoAplicacion()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_TipoAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getComplejidad <em>Complejidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complejidad</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getComplejidad()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Complejidad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Aplicacion#getImportancia <em>Importancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importancia</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getImportancia()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Importancia();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Aplicacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getOperaciones()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Operaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Aplicacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getAplicaciones()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Aplicaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Aplicacion#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Aplicacion#getProcedimientos()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Procedimientos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Glosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glosario</em>'.
	 * @see es.gva.cit.simapa.Glosario
	 * @generated
	 */
	EClass getGlosario();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Glosario#getTerminos <em>Terminos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminos</em>'.
	 * @see es.gva.cit.simapa.Glosario#getTerminos()
	 * @see #getGlosario()
	 * @generated
	 */
	EReference getGlosario_Terminos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Glosario#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.Glosario#getRepositorio()
	 * @see #getGlosario()
	 * @generated
	 */
	EReference getGlosario_Repositorio();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.TerminoGlosario <em>Termino Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termino Glosario</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario
	 * @generated
	 */
	EClass getTerminoGlosario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TerminoGlosario#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario#getEtiqueta()
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	EAttribute getTerminoGlosario_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TerminoGlosario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario#getNombre()
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	EAttribute getTerminoGlosario_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TerminoGlosario#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario#getDescripcion()
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	EAttribute getTerminoGlosario_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.TerminoGlosario#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario#getProcedimientos()
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	EReference getTerminoGlosario_Procedimientos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.TerminoGlosario#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Glosario</em>'.
	 * @see es.gva.cit.simapa.TerminoGlosario#getGlosario()
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	EReference getTerminoGlosario_Glosario();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Procedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Procedimientos
	 * @generated
	 */
	EClass getProcedimientos();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Procedimientos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repositorio</em>'.
	 * @see es.gva.cit.simapa.Procedimientos#getRepositorio()
	 * @see #getProcedimientos()
	 * @generated
	 */
	EReference getProcedimientos_Repositorio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Procedimientos#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Procedimientos#getProcedimientos()
	 * @see #getProcedimientos()
	 * @generated
	 */
	EReference getProcedimientos_Procedimientos();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Procedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Procedimiento
	 * @generated
	 */
	EClass getProcedimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getEtiqueta()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getCodigo()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getVersion()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getCodigoCompleto <em>Codigo Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Completo</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getCodigoCompleto()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_CodigoCompleto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getProp()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Prop();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getTitulo()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getObjeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objeto</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getObjeto()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Objeto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getObservaciones()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Observaciones();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persona</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getPersona()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Persona();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getTipoProcedimiento <em>Tipo Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getTipoProcedimiento()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_TipoProcedimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getNotas <em>Notas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notas</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getNotas()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Notas();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getPeriodicidad <em>Periodicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicidad</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getPeriodicidad()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_Periodicidad();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Procedimiento#getTituloUltimaConvocatoria <em>Titulo Ultima Convocatoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo Ultima Convocatoria</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getTituloUltimaConvocatoria()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EAttribute getProcedimiento_TituloUltimaConvocatoria();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Procedimiento#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getOperaciones()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Operaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getDocumentos()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Documentos();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getTerminos <em>Terminos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminos</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getTerminos()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Terminos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Procedimiento#getFichaArchivistica <em>Ficha Archivistica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ficha Archivistica</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getFichaArchivistica()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_FichaArchivistica();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidades</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getUnidades()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Unidades();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Procedimiento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getProcedimientos()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Procedimientos();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento <em>Tramitacion Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tramitacion Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_TramitacionProcedimiento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getUsosComoSubProcedimientos <em>Usos Como Sub Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usos Como Sub Procedimientos</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getUsosComoSubProcedimientos()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_UsosComoSubProcedimientos();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Procedimiento#getConvocatorias <em>Convocatorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convocatorias</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getConvocatorias()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Convocatorias();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Procedimiento#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getResponsable()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Responsable();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.simapa.Procedimiento#getControlProcedimiento <em>Control Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getControlProcedimiento()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_ControlProcedimiento();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Normativas</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getNormativas()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Normativas();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Procedimiento#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicio</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getServicio()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Servicio();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Procedimiento#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Procedimiento#getAplicaciones()
	 * @see #getProcedimiento()
	 * @generated
	 */
	EReference getProcedimiento_Aplicaciones();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.FichaArchivistica <em>Ficha Archivistica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ficha Archivistica</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica
	 * @generated
	 */
	EClass getFichaArchivistica();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getEtiqueta()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorLegal <em>Tiene Valor Legal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Valor Legal</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#isTieneValorLegal()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_TieneValorLegal();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorAdministrativo <em>Tiene Valor Administrativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Valor Administrativo</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#isTieneValorAdministrativo()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_TieneValorAdministrativo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorInformativoHistorico <em>Tiene Valor Informativo Historico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Valor Informativo Historico</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#isTieneValorInformativoHistorico()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_TieneValorInformativoHistorico();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#getTipoAcceso <em>Tipo Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Acceso</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getTipoAcceso()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_TipoAcceso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#getReglasEliminacion <em>Reglas Eliminacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reglas Eliminacion</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getReglasEliminacion()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_ReglasEliminacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#getReglasConservacion <em>Reglas Conservacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reglas Conservacion</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getReglasConservacion()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_ReglasConservacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.FichaArchivistica#getObservaciones <em>Observaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observaciones</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getObservaciones()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EAttribute getFichaArchivistica_Observaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.FichaArchivistica#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.FichaArchivistica#getProcedimiento()
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	EReference getFichaArchivistica_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Convocatoria <em>Convocatoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convocatoria</em>'.
	 * @see es.gva.cit.simapa.Convocatoria
	 * @generated
	 */
	EClass getConvocatoria();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Convocatoria#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Convocatoria#getEtiqueta()
	 * @see #getConvocatoria()
	 * @generated
	 */
	EAttribute getConvocatoria_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Convocatoria#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see es.gva.cit.simapa.Convocatoria#getNombre()
	 * @see #getConvocatoria()
	 * @generated
	 */
	EAttribute getConvocatoria_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Convocatoria#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.Convocatoria#getDescripcion()
	 * @see #getConvocatoria()
	 * @generated
	 */
	EAttribute getConvocatoria_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Convocatoria#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see es.gva.cit.simapa.Convocatoria#getCodigo()
	 * @see #getConvocatoria()
	 * @generated
	 */
	EAttribute getConvocatoria_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Convocatoria#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Convocatoria#getProcedimiento()
	 * @see #getConvocatoria()
	 * @generated
	 */
	EReference getConvocatoria_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.ControlProcedimiento <em>Control Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Procedimiento</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento
	 * @generated
	 */
	EClass getControlProcedimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getEtiqueta()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getUsuario()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getSituacion <em>Situacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Situacion</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getSituacion()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_Situacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaHoraModificacion <em>Fecha Hora Modificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Hora Modificacion</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaHoraModificacion()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaHoraModificacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaInicioVigencia <em>Fecha Inicio Vigencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio Vigencia</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaInicioVigencia()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaInicioVigencia();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaFinVigencia <em>Fecha Fin Vigencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Fin Vigencia</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaFinVigencia()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaFinVigencia();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getComentarioVersion <em>Comentario Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comentario Version</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getComentarioVersion()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_ComentarioVersion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaElaborado <em>Fecha Elaborado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Elaborado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaElaborado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaElaborado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaElaborado <em>Nombre Persona Elaborado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Persona Elaborado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaElaborado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_NombrePersonaElaborado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaElaborado <em>Puesto Persona Elaborado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puesto Persona Elaborado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaElaborado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_PuestoPersonaElaborado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaRevisado <em>Fecha Revisado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Revisado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaRevisado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaRevisado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaRevisado <em>Nombre Persona Revisado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Persona Revisado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaRevisado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_NombrePersonaRevisado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaRevisado <em>Puesto Persona Revisado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puesto Persona Revisado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaRevisado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_PuestoPersonaRevisado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaAprobado <em>Fecha Aprobado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Aprobado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getFechaAprobado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_FechaAprobado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaAprobado <em>Nombre Persona Aprobado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Persona Aprobado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaAprobado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_NombrePersonaAprobado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaAprobado <em>Puesto Persona Aprobado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puesto Persona Aprobado</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaAprobado()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EAttribute getControlProcedimiento_PuestoPersonaAprobado();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.ControlProcedimiento#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.ControlProcedimiento#getProcedimiento()
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	EReference getControlProcedimiento_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.TramitacionProcedimiento <em>Tramitacion Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tramitacion Procedimiento</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento
	 * @generated
	 */
	EClass getTramitacionProcedimiento();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getEtiqueta()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioInstanciaDeParte <em>Inicio Instancia De Parte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicio Instancia De Parte</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#isInicioInstanciaDeParte()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_InicioInstanciaDeParte();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioDeOficio <em>Inicio De Oficio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicio De Oficio</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#isInicioDeOficio()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_InicioDeOficio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getVolumenExpedientesEjercicio <em>Volumen Expedientes Ejercicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volumen Expedientes Ejercicio</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getVolumenExpedientesEjercicio()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_VolumenExpedientesEjercicio();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPresupuestoAnualAproximado <em>Presupuesto Anual Aproximado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presupuesto Anual Aproximado</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getPresupuestoAnualAproximado()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_PresupuestoAnualAproximado();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoSolicitud <em>Plazo Solicitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plazo Solicitud</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getPlazoSolicitud()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_PlazoSolicitud();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoResolucion <em>Plazo Resolucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plazo Resolucion</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getPlazoResolucion()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_PlazoResolucion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getSilencioAdministrativo <em>Silencio Administrativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Silencio Administrativo</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getSilencioAdministrativo()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_SilencioAdministrativo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#getRecurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurso</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getRecurso()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_Recurso();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.TramitacionProcedimiento#isEsWorkflow <em>Es Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Workflow</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#isEsWorkflow()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EAttribute getTramitacionProcedimiento_EsWorkflow();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.TramitacionProcedimiento#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getProcedimiento()
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	EReference getTramitacionProcedimiento_Procedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Operaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Operaciones
	 * @generated
	 */
	EClass getOperaciones();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Operaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Operaciones#getProcedimiento()
	 * @see #getOperaciones()
	 * @generated
	 */
	EReference getOperaciones_Procedimiento();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Operaciones#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Operaciones#getOperaciones()
	 * @see #getOperaciones()
	 * @generated
	 */
	EReference getOperaciones_Operaciones();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion</em>'.
	 * @see es.gva.cit.simapa.Operacion
	 * @generated
	 */
	EClass getOperacion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Operacion#getEtiqueta()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see es.gva.cit.simapa.Operacion#getTitulo()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see es.gva.cit.simapa.Operacion#getDescripcion()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getPlazoEjecucion <em>Plazo Ejecucion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plazo Ejecucion</em>'.
	 * @see es.gva.cit.simapa.Operacion#getPlazoEjecucion()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_PlazoEjecucion();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#isEsWorkflow <em>Es Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Workflow</em>'.
	 * @see es.gva.cit.simapa.Operacion#isEsWorkflow()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_EsWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getNumeroPagina <em>Numero Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Pagina</em>'.
	 * @see es.gva.cit.simapa.Operacion#getNumeroPagina()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_NumeroPagina();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Operacion#getNumeroOrden <em>Numero Orden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Orden</em>'.
	 * @see es.gva.cit.simapa.Operacion#getNumeroOrden()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_NumeroOrden();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Operacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operaciones</em>'.
	 * @see es.gva.cit.simapa.Operacion#getOperaciones()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Operaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Operacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aplicaciones</em>'.
	 * @see es.gva.cit.simapa.Operacion#getAplicaciones()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Aplicaciones();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Operacion#getFlujosEntrantes <em>Flujos Entrantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flujos Entrantes</em>'.
	 * @see es.gva.cit.simapa.Operacion#getFlujosEntrantes()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_FlujosEntrantes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.simapa.Operacion#getFlujosSalientes <em>Flujos Salientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flujos Salientes</em>'.
	 * @see es.gva.cit.simapa.Operacion#getFlujosSalientes()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_FlujosSalientes();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Operacion#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unidad</em>'.
	 * @see es.gva.cit.simapa.Operacion#getUnidad()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Unidad();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see es.gva.cit.simapa.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Subprocedimiento <em>Subprocedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprocedimiento</em>'.
	 * @see es.gva.cit.simapa.Subprocedimiento
	 * @generated
	 */
	EClass getSubprocedimiento();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento <em>Sub Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Procedimiento</em>'.
	 * @see es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento()
	 * @see #getSubprocedimiento()
	 * @generated
	 */
	EReference getSubprocedimiento_SubProcedimiento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.DocumentoFinal <em>Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento Final</em>'.
	 * @see es.gva.cit.simapa.DocumentoFinal
	 * @generated
	 */
	EClass getDocumentoFinal();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.DocumentoFinal#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documento</em>'.
	 * @see es.gva.cit.simapa.DocumentoFinal#getDocumento()
	 * @see #getDocumentoFinal()
	 * @generated
	 */
	EReference getDocumentoFinal_Documento();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.DocumentoFinalInterno <em>Documento Final Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento Final Interno</em>'.
	 * @see es.gva.cit.simapa.DocumentoFinalInterno
	 * @generated
	 */
	EClass getDocumentoFinalInterno();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.EntradaDocumentoFinal <em>Entrada Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrada Documento Final</em>'.
	 * @see es.gva.cit.simapa.EntradaDocumentoFinal
	 * @generated
	 */
	EClass getEntradaDocumentoFinal();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.SalidaDocumentoFinal <em>Salida Documento Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salida Documento Final</em>'.
	 * @see es.gva.cit.simapa.SalidaDocumentoFinal
	 * @generated
	 */
	EClass getSalidaDocumentoFinal();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.SimapaCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see es.gva.cit.simapa.SimapaCollection
	 * @generated
	 */
	EClass getSimapaCollection();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.SimapaObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see es.gva.cit.simapa.SimapaObject
	 * @generated
	 */
	EClass getSimapaObject();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.FinProceso <em>Fin Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Proceso</em>'.
	 * @see es.gva.cit.simapa.FinProceso
	 * @generated
	 */
	EClass getFinProceso();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.simapa.Flujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flujo</em>'.
	 * @see es.gva.cit.simapa.Flujo
	 * @generated
	 */
	EClass getFlujo();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Flujo#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.simapa.Flujo#getEtiqueta()
	 * @see #getFlujo()
	 * @generated
	 */
	EAttribute getFlujo_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Flujo#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see es.gva.cit.simapa.Flujo#getTexto()
	 * @see #getFlujo()
	 * @generated
	 */
	EAttribute getFlujo_Texto();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Flujo#isEsConector <em>Es Conector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Conector</em>'.
	 * @see es.gva.cit.simapa.Flujo#isEsConector()
	 * @see #getFlujo()
	 * @generated
	 */
	EAttribute getFlujo_EsConector();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.simapa.Flujo#getGuarda <em>Guarda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guarda</em>'.
	 * @see es.gva.cit.simapa.Flujo#getGuarda()
	 * @see #getFlujo()
	 * @generated
	 */
	EAttribute getFlujo_Guarda();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.simapa.Flujo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Origen</em>'.
	 * @see es.gva.cit.simapa.Flujo#getOrigen()
	 * @see #getFlujo()
	 * @generated
	 */
	EReference getFlujo_Origen();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.simapa.Flujo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see es.gva.cit.simapa.Flujo#getDestino()
	 * @see #getFlujo()
	 * @generated
	 */
	EReference getFlujo_Destino();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.simapa.Flujo#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentos</em>'.
	 * @see es.gva.cit.simapa.Flujo#getDocumentos()
	 * @see #getFlujo()
	 * @generated
	 */
	EReference getFlujo_Documentos();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoMedioDocumento <em>Tipo Medio Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Medio Documento</em>'.
	 * @see es.gva.cit.simapa.TipoMedioDocumento
	 * @generated
	 */
	EEnum getTipoMedioDocumento();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoSilencioAdministrativo <em>Tipo Silencio Administrativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Silencio Administrativo</em>'.
	 * @see es.gva.cit.simapa.TipoSilencioAdministrativo
	 * @generated
	 */
	EEnum getTipoSilencioAdministrativo();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoSituacionProcedimiento <em>Tipo Situacion Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Situacion Procedimiento</em>'.
	 * @see es.gva.cit.simapa.TipoSituacionProcedimiento
	 * @generated
	 */
	EEnum getTipoSituacionProcedimiento();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoAccesoArchivo <em>Tipo Acceso Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Acceso Archivo</em>'.
	 * @see es.gva.cit.simapa.TipoAccesoArchivo
	 * @generated
	 */
	EEnum getTipoAccesoArchivo();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoAmbitoDocumento <em>Tipo Ambito Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Ambito Documento</em>'.
	 * @see es.gva.cit.simapa.TipoAmbitoDocumento
	 * @generated
	 */
	EEnum getTipoAmbitoDocumento();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoAlmacenamientoDocumento <em>Tipo Almacenamiento Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Almacenamiento Documento</em>'.
	 * @see es.gva.cit.simapa.TipoAlmacenamientoDocumento
	 * @generated
	 */
	EEnum getTipoAlmacenamientoDocumento();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoDesarrollo <em>Tipo Desarrollo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Desarrollo</em>'.
	 * @see es.gva.cit.simapa.TipoDesarrollo
	 * @generated
	 */
	EEnum getTipoDesarrollo();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.TipoAplicacion <em>Tipo Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Aplicacion</em>'.
	 * @see es.gva.cit.simapa.TipoAplicacion
	 * @generated
	 */
	EEnum getTipoAplicacion();

	/**
	 * Returns the meta object for enum '{@link es.gva.cit.simapa.Rango1_10 <em>Rango1 10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rango1 10</em>'.
	 * @see es.gva.cit.simapa.Rango1_10
	 * @generated
	 */
	EEnum getRango1_10();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimapaFactory getSimapaFactory();

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
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.RepositorioImpl <em>Repositorio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.RepositorioImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getRepositorio()
		 * @generated
		 */
		EClass REPOSITORIO = eINSTANCE.getRepositorio();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__PROCEDIMIENTOS = eINSTANCE.getRepositorio_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__DOCUMENTOS = eINSTANCE.getRepositorio_Documentos();

		/**
		 * The meta object literal for the '<em><b>Estructuras Funcionales</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__ESTRUCTURAS_FUNCIONALES = eINSTANCE.getRepositorio_EstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Glosario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__GLOSARIO = eINSTANCE.getRepositorio_Glosario();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__NORMATIVAS = eINSTANCE.getRepositorio_Normativas();

		/**
		 * The meta object literal for the '<em><b>Unidades Organicas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__UNIDADES_ORGANICAS = eINSTANCE.getRepositorio_UnidadesOrganicas();

		/**
		 * The meta object literal for the '<em><b>Unidades Externas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__UNIDADES_EXTERNAS = eINSTANCE.getRepositorio_UnidadesExternas();

		/**
		 * The meta object literal for the '<em><b>Clases Documento</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__CLASES_DOCUMENTO = eINSTANCE.getRepositorio_ClasesDocumento();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__APLICACIONES = eINSTANCE.getRepositorio_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORIO__MODEL_PACKAGE = eINSTANCE.getRepositorio_ModelPackage();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.NormativasYLegislacionesImpl <em>Normativas YLegislaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.NormativasYLegislacionesImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getNormativasYLegislaciones()
		 * @generated
		 */
		EClass NORMATIVAS_YLEGISLACIONES = eINSTANCE.getNormativasYLegislaciones();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMATIVAS_YLEGISLACIONES__REPOSITORIO = eINSTANCE.getNormativasYLegislaciones_Repositorio();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMATIVAS_YLEGISLACIONES__NORMATIVAS = eINSTANCE.getNormativasYLegislaciones_Normativas();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl <em>Normativa YLegislacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.NormativaYLegislacionImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getNormativaYLegislacion()
		 * @generated
		 */
		EClass NORMATIVA_YLEGISLACION = eINSTANCE.getNormativaYLegislacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMATIVA_YLEGISLACION__ETIQUETA = eINSTANCE.getNormativaYLegislacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMATIVA_YLEGISLACION__NOMBRE = eINSTANCE.getNormativaYLegislacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMATIVA_YLEGISLACION__DESCRIPCION = eINSTANCE.getNormativaYLegislacion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMATIVA_YLEGISLACION__CODIGO = eINSTANCE.getNormativaYLegislacion_Codigo();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMATIVA_YLEGISLACION__NORMATIVAS = eINSTANCE.getNormativaYLegislacion_Normativas();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMATIVA_YLEGISLACION__PROCEDIMIENTOS = eINSTANCE.getNormativaYLegislacion_Procedimientos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.UnidadImpl <em>Unidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.UnidadImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidad()
		 * @generated
		 */
		EClass UNIDAD = eINSTANCE.getUnidad();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__ETIQUETA = eINSTANCE.getUnidad_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__NOMBRE = eINSTANCE.getUnidad_Nombre();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__PERSONA = eINSTANCE.getUnidad_Persona();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__TELEFONO = eINSTANCE.getUnidad_Telefono();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__FAX = eINSTANCE.getUnidad_Fax();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__DIRECCION = eINSTANCE.getUnidad_Direccion();

		/**
		 * The meta object literal for the '<em><b>Notas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__NOTAS = eINSTANCE.getUnidad_Notas();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD__OBSERVACIONES = eINSTANCE.getUnidad_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD__OPERACIONES = eINSTANCE.getUnidad_Operaciones();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ContenedorUnidadOrganicaImpl <em>Contenedor Unidad Organica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ContenedorUnidadOrganicaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorUnidadOrganica()
		 * @generated
		 */
		EClass CONTENEDOR_UNIDAD_ORGANICA = eINSTANCE.getContenedorUnidadOrganica();

		/**
		 * The meta object literal for the '<em><b>Descomposicion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION = eINSTANCE.getContenedorUnidadOrganica_Descomposicion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.UnidadesOrganicasImpl <em>Unidades Organicas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.UnidadesOrganicasImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadesOrganicas()
		 * @generated
		 */
		EClass UNIDADES_ORGANICAS = eINSTANCE.getUnidadesOrganicas();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDADES_ORGANICAS__REPOSITORIO = eINSTANCE.getUnidadesOrganicas_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl <em>Unidad Organica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.UnidadOrganicaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadOrganica()
		 * @generated
		 */
		EClass UNIDAD_ORGANICA = eINSTANCE.getUnidadOrganica();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD_ORGANICA__CODIGO = eINSTANCE.getUnidadOrganica_Codigo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD_ORGANICA__DESCRIPCION = eINSTANCE.getUnidadOrganica_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Tipo Unidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD_ORGANICA__TIPO_UNIDAD = eINSTANCE.getUnidadOrganica_TipoUnidad();

		/**
		 * The meta object literal for the '<em><b>Codigo Organico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD_ORGANICA__CODIGO_ORGANICO = eINSTANCE.getUnidadOrganica_CodigoOrganico();

		/**
		 * The meta object literal for the '<em><b>Unidad De Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS = eINSTANCE.getUnidadOrganica_UnidadDeProcedimientos();

		/**
		 * The meta object literal for the '<em><b>Descompone</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANICA__DESCOMPONE = eINSTANCE.getUnidadOrganica_Descompone();

		/**
		 * The meta object literal for the '<em><b>Estructuras Funcionales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES = eINSTANCE.getUnidadOrganica_EstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Responsable De Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS = eINSTANCE.getUnidadOrganica_ResponsableDeProcedimientos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ContenedorUnidadExternaImpl <em>Contenedor Unidad Externa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ContenedorUnidadExternaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorUnidadExterna()
		 * @generated
		 */
		EClass CONTENEDOR_UNIDAD_EXTERNA = eINSTANCE.getContenedorUnidadExterna();

		/**
		 * The meta object literal for the '<em><b>Descomposicion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION = eINSTANCE.getContenedorUnidadExterna_Descomposicion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.UnidadesExternasImpl <em>Unidades Externas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.UnidadesExternasImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadesExternas()
		 * @generated
		 */
		EClass UNIDADES_EXTERNAS = eINSTANCE.getUnidadesExternas();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDADES_EXTERNAS__REPOSITORIO = eINSTANCE.getUnidadesExternas_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.UnidadExternaImpl <em>Unidad Externa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.UnidadExternaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getUnidadExterna()
		 * @generated
		 */
		EClass UNIDAD_EXTERNA = eINSTANCE.getUnidadExterna();

		/**
		 * The meta object literal for the '<em><b>Tipo Entidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIDAD_EXTERNA__TIPO_ENTIDAD = eINSTANCE.getUnidadExterna_TipoEntidad();

		/**
		 * The meta object literal for the '<em><b>Descompone</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDAD_EXTERNA__DESCOMPONE = eINSTANCE.getUnidadExterna_Descompone();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ContenedorEstructuraFuncionalImpl <em>Contenedor Estructura Funcional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ContenedorEstructuraFuncionalImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getContenedorEstructuraFuncional()
		 * @generated
		 */
		EClass CONTENEDOR_ESTRUCTURA_FUNCIONAL = eINSTANCE.getContenedorEstructuraFuncional();

		/**
		 * The meta object literal for the '<em><b>Descomposicion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION = eINSTANCE.getContenedorEstructuraFuncional_Descomposicion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.EstructurasFuncionalesImpl <em>Estructuras Funcionales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.EstructurasFuncionalesImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEstructurasFuncionales()
		 * @generated
		 */
		EClass ESTRUCTURAS_FUNCIONALES = eINSTANCE.getEstructurasFuncionales();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAS_FUNCIONALES__REPOSITORIO = eINSTANCE.getEstructurasFuncionales_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl <em>Estructura Funcional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.EstructuraFuncionalImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEstructuraFuncional()
		 * @generated
		 */
		EClass ESTRUCTURA_FUNCIONAL = eINSTANCE.getEstructuraFuncional();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_FUNCIONAL__ETIQUETA = eINSTANCE.getEstructuraFuncional_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_FUNCIONAL__NOMBRE = eINSTANCE.getEstructuraFuncional_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_FUNCIONAL__CODIGO = eINSTANCE.getEstructuraFuncional_Codigo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURA_FUNCIONAL__DESCRIPCION = eINSTANCE.getEstructuraFuncional_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Descompone</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_FUNCIONAL__DESCOMPONE = eINSTANCE.getEstructuraFuncional_Descompone();

		/**
		 * The meta object literal for the '<em><b>Unidades Organicas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS = eINSTANCE.getEstructuraFuncional_UnidadesOrganicas();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS = eINSTANCE.getEstructuraFuncional_Procedimientos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ClasesDocumentoImpl <em>Clases Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ClasesDocumentoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getClasesDocumento()
		 * @generated
		 */
		EClass CLASES_DOCUMENTO = eINSTANCE.getClasesDocumento();

		/**
		 * The meta object literal for the '<em><b>Clases Documento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASES_DOCUMENTO__CLASES_DOCUMENTO = eINSTANCE.getClasesDocumento_ClasesDocumento();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASES_DOCUMENTO__REPOSITORIO = eINSTANCE.getClasesDocumento_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ConModelClassImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getConModelClass()
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
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ClaseDocumentoImpl <em>Clase Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ClaseDocumentoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getClaseDocumento()
		 * @generated
		 */
		EClass CLASE_DOCUMENTO = eINSTANCE.getClaseDocumento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_DOCUMENTO__ETIQUETA = eINSTANCE.getClaseDocumento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_DOCUMENTO__CODIGO = eINSTANCE.getClaseDocumento_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_DOCUMENTO__NOMBRE = eINSTANCE.getClaseDocumento_Nombre();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_DOCUMENTO__OBSERVACIONES = eINSTANCE.getClaseDocumento_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Clases Documento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_DOCUMENTO__CLASES_DOCUMENTO = eINSTANCE.getClaseDocumento_ClasesDocumento();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_DOCUMENTO__DOCUMENTOS = eINSTANCE.getClaseDocumento_Documentos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.DocumentosImpl <em>Documentos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.DocumentosImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentos()
		 * @generated
		 */
		EClass DOCUMENTOS = eINSTANCE.getDocumentos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTOS__DOCUMENTOS = eINSTANCE.getDocumentos_Documentos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTOS__REPOSITORIO = eINSTANCE.getDocumentos_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.DocumentoImpl <em>Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.DocumentoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumento()
		 * @generated
		 */
		EClass DOCUMENTO = eINSTANCE.getDocumento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ETIQUETA = eINSTANCE.getDocumento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TITULO = eINSTANCE.getDocumento_Titulo();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__CODIGO = eINSTANCE.getDocumento_Codigo();

		/**
		 * The meta object literal for the '<em><b>Fichero Modelo Fomulario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__FICHERO_MODELO_FOMULARIO = eINSTANCE.getDocumento_FicheroModeloFomulario();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__OBSERVACIONES = eINSTANCE.getDocumento_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Tipo Almacenamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TIPO_ALMACENAMIENTO = eINSTANCE.getDocumento_TipoAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Tipo Medio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TIPO_MEDIO = eINSTANCE.getDocumento_TipoMedio();

		/**
		 * The meta object literal for the '<em><b>Tipo Ambito</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TIPO_AMBITO = eINSTANCE.getDocumento_TipoAmbito();

		/**
		 * The meta object literal for the '<em><b>Clase Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__CLASE_DOCUMENTO = eINSTANCE.getDocumento_ClaseDocumento();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__PROCEDIMIENTOS = eINSTANCE.getDocumento_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Documentos Finales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__DOCUMENTOS_FINALES = eINSTANCE.getDocumento_DocumentosFinales();

		/**
		 * The meta object literal for the '<em><b>Flujos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__FLUJOS = eINSTANCE.getDocumento_Flujos();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO__DOCUMENTOS = eINSTANCE.getDocumento_Documentos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.AplicacionesImpl <em>Aplicaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.AplicacionesImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getAplicaciones()
		 * @generated
		 */
		EClass APLICACIONES = eINSTANCE.getAplicaciones();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACIONES__APLICACIONES = eINSTANCE.getAplicaciones_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACIONES__REPOSITORIO = eINSTANCE.getAplicaciones_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.AplicacionImpl <em>Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.AplicacionImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getAplicacion()
		 * @generated
		 */
		EClass APLICACION = eINSTANCE.getAplicacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__ETIQUETA = eINSTANCE.getAplicacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NOMBRE = eINSTANCE.getAplicacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__DESCRIPCION = eINSTANCE.getAplicacion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__CODIGO = eINSTANCE.getAplicacion_Codigo();

		/**
		 * The meta object literal for the '<em><b>Herramienta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__HERRAMIENTA = eINSTANCE.getAplicacion_Herramienta();

		/**
		 * The meta object literal for the '<em><b>Base De Datos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__BASE_DE_DATOS = eINSTANCE.getAplicacion_BaseDeDatos();

		/**
		 * The meta object literal for the '<em><b>Numero Usuarios</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NUMERO_USUARIOS = eINSTANCE.getAplicacion_NumeroUsuarios();

		/**
		 * The meta object literal for the '<em><b>Estado Aplicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__ESTADO_APLICACION = eINSTANCE.getAplicacion_EstadoAplicacion();

		/**
		 * The meta object literal for the '<em><b>Nivel Seguridad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NIVEL_SEGURIDAD = eINSTANCE.getAplicacion_NivelSeguridad();

		/**
		 * The meta object literal for the '<em><b>Desarrollador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__DESARROLLADOR = eINSTANCE.getAplicacion_Desarrollador();

		/**
		 * The meta object literal for the '<em><b>Tipo Desarrollo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__TIPO_DESARROLLO = eINSTANCE.getAplicacion_TipoDesarrollo();

		/**
		 * The meta object literal for the '<em><b>Tipo Aplicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__TIPO_APLICACION = eINSTANCE.getAplicacion_TipoAplicacion();

		/**
		 * The meta object literal for the '<em><b>Complejidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__COMPLEJIDAD = eINSTANCE.getAplicacion_Complejidad();

		/**
		 * The meta object literal for the '<em><b>Importancia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__IMPORTANCIA = eINSTANCE.getAplicacion_Importancia();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__OPERACIONES = eINSTANCE.getAplicacion_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__APLICACIONES = eINSTANCE.getAplicacion_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__PROCEDIMIENTOS = eINSTANCE.getAplicacion_Procedimientos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.GlosarioImpl <em>Glosario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.GlosarioImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getGlosario()
		 * @generated
		 */
		EClass GLOSARIO = eINSTANCE.getGlosario();

		/**
		 * The meta object literal for the '<em><b>Terminos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSARIO__TERMINOS = eINSTANCE.getGlosario_Terminos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSARIO__REPOSITORIO = eINSTANCE.getGlosario_Repositorio();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.TerminoGlosarioImpl <em>Termino Glosario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.TerminoGlosarioImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTerminoGlosario()
		 * @generated
		 */
		EClass TERMINO_GLOSARIO = eINSTANCE.getTerminoGlosario();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINO_GLOSARIO__ETIQUETA = eINSTANCE.getTerminoGlosario_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINO_GLOSARIO__NOMBRE = eINSTANCE.getTerminoGlosario_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINO_GLOSARIO__DESCRIPCION = eINSTANCE.getTerminoGlosario_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINO_GLOSARIO__PROCEDIMIENTOS = eINSTANCE.getTerminoGlosario_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Glosario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINO_GLOSARIO__GLOSARIO = eINSTANCE.getTerminoGlosario_Glosario();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ProcedimientosImpl <em>Procedimientos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ProcedimientosImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getProcedimientos()
		 * @generated
		 */
		EClass PROCEDIMIENTOS = eINSTANCE.getProcedimientos();

		/**
		 * The meta object literal for the '<em><b>Repositorio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTOS__REPOSITORIO = eINSTANCE.getProcedimientos_Repositorio();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTOS__PROCEDIMIENTOS = eINSTANCE.getProcedimientos_Procedimientos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ProcedimientoImpl <em>Procedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ProcedimientoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getProcedimiento()
		 * @generated
		 */
		EClass PROCEDIMIENTO = eINSTANCE.getProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__ETIQUETA = eINSTANCE.getProcedimiento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__CODIGO = eINSTANCE.getProcedimiento_Codigo();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__VERSION = eINSTANCE.getProcedimiento_Version();

		/**
		 * The meta object literal for the '<em><b>Codigo Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__CODIGO_COMPLETO = eINSTANCE.getProcedimiento_CodigoCompleto();

		/**
		 * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__PROP = eINSTANCE.getProcedimiento_Prop();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__TITULO = eINSTANCE.getProcedimiento_Titulo();

		/**
		 * The meta object literal for the '<em><b>Objeto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__OBJETO = eINSTANCE.getProcedimiento_Objeto();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__OBSERVACIONES = eINSTANCE.getProcedimiento_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__PERSONA = eINSTANCE.getProcedimiento_Persona();

		/**
		 * The meta object literal for the '<em><b>Tipo Procedimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__TIPO_PROCEDIMIENTO = eINSTANCE.getProcedimiento_TipoProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Notas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__NOTAS = eINSTANCE.getProcedimiento_Notas();

		/**
		 * The meta object literal for the '<em><b>Periodicidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__PERIODICIDAD = eINSTANCE.getProcedimiento_Periodicidad();

		/**
		 * The meta object literal for the '<em><b>Titulo Ultima Convocatoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA = eINSTANCE.getProcedimiento_TituloUltimaConvocatoria();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__OPERACIONES = eINSTANCE.getProcedimiento_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__DOCUMENTOS = eINSTANCE.getProcedimiento_Documentos();

		/**
		 * The meta object literal for the '<em><b>Terminos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__TERMINOS = eINSTANCE.getProcedimiento_Terminos();

		/**
		 * The meta object literal for the '<em><b>Ficha Archivistica</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__FICHA_ARCHIVISTICA = eINSTANCE.getProcedimiento_FichaArchivistica();

		/**
		 * The meta object literal for the '<em><b>Unidades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__UNIDADES = eINSTANCE.getProcedimiento_Unidades();

		/**
		 * The meta object literal for the '<em><b>Procedimientos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__PROCEDIMIENTOS = eINSTANCE.getProcedimiento_Procedimientos();

		/**
		 * The meta object literal for the '<em><b>Tramitacion Procedimiento</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO = eINSTANCE.getProcedimiento_TramitacionProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Usos Como Sub Procedimientos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS = eINSTANCE.getProcedimiento_UsosComoSubProcedimientos();

		/**
		 * The meta object literal for the '<em><b>Convocatorias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__CONVOCATORIAS = eINSTANCE.getProcedimiento_Convocatorias();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__RESPONSABLE = eINSTANCE.getProcedimiento_Responsable();

		/**
		 * The meta object literal for the '<em><b>Control Procedimiento</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__CONTROL_PROCEDIMIENTO = eINSTANCE.getProcedimiento_ControlProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Normativas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__NORMATIVAS = eINSTANCE.getProcedimiento_Normativas();

		/**
		 * The meta object literal for the '<em><b>Servicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__SERVICIO = eINSTANCE.getProcedimiento_Servicio();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDIMIENTO__APLICACIONES = eINSTANCE.getProcedimiento_Aplicaciones();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl <em>Ficha Archivistica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.FichaArchivisticaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFichaArchivistica()
		 * @generated
		 */
		EClass FICHA_ARCHIVISTICA = eINSTANCE.getFichaArchivistica();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__ETIQUETA = eINSTANCE.getFichaArchivistica_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Tiene Valor Legal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL = eINSTANCE.getFichaArchivistica_TieneValorLegal();

		/**
		 * The meta object literal for the '<em><b>Tiene Valor Administrativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO = eINSTANCE.getFichaArchivistica_TieneValorAdministrativo();

		/**
		 * The meta object literal for the '<em><b>Tiene Valor Informativo Historico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO = eINSTANCE.getFichaArchivistica_TieneValorInformativoHistorico();

		/**
		 * The meta object literal for the '<em><b>Tipo Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__TIPO_ACCESO = eINSTANCE.getFichaArchivistica_TipoAcceso();

		/**
		 * The meta object literal for the '<em><b>Reglas Eliminacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__REGLAS_ELIMINACION = eINSTANCE.getFichaArchivistica_ReglasEliminacion();

		/**
		 * The meta object literal for the '<em><b>Reglas Conservacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__REGLAS_CONSERVACION = eINSTANCE.getFichaArchivistica_ReglasConservacion();

		/**
		 * The meta object literal for the '<em><b>Observaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHA_ARCHIVISTICA__OBSERVACIONES = eINSTANCE.getFichaArchivistica_Observaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FICHA_ARCHIVISTICA__PROCEDIMIENTO = eINSTANCE.getFichaArchivistica_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ConvocatoriaImpl <em>Convocatoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ConvocatoriaImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getConvocatoria()
		 * @generated
		 */
		EClass CONVOCATORIA = eINSTANCE.getConvocatoria();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVOCATORIA__ETIQUETA = eINSTANCE.getConvocatoria_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVOCATORIA__NOMBRE = eINSTANCE.getConvocatoria_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVOCATORIA__DESCRIPCION = eINSTANCE.getConvocatoria_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVOCATORIA__CODIGO = eINSTANCE.getConvocatoria_Codigo();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVOCATORIA__PROCEDIMIENTO = eINSTANCE.getConvocatoria_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl <em>Control Procedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.ControlProcedimientoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getControlProcedimiento()
		 * @generated
		 */
		EClass CONTROL_PROCEDIMIENTO = eINSTANCE.getControlProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__ETIQUETA = eINSTANCE.getControlProcedimiento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__USUARIO = eINSTANCE.getControlProcedimiento_Usuario();

		/**
		 * The meta object literal for the '<em><b>Situacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__SITUACION = eINSTANCE.getControlProcedimiento_Situacion();

		/**
		 * The meta object literal for the '<em><b>Fecha Hora Modificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION = eINSTANCE.getControlProcedimiento_FechaHoraModificacion();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio Vigencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA = eINSTANCE.getControlProcedimiento_FechaInicioVigencia();

		/**
		 * The meta object literal for the '<em><b>Fecha Fin Vigencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA = eINSTANCE.getControlProcedimiento_FechaFinVigencia();

		/**
		 * The meta object literal for the '<em><b>Comentario Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION = eINSTANCE.getControlProcedimiento_ComentarioVersion();

		/**
		 * The meta object literal for the '<em><b>Fecha Elaborado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_ELABORADO = eINSTANCE.getControlProcedimiento_FechaElaborado();

		/**
		 * The meta object literal for the '<em><b>Nombre Persona Elaborado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO = eINSTANCE.getControlProcedimiento_NombrePersonaElaborado();

		/**
		 * The meta object literal for the '<em><b>Puesto Persona Elaborado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO = eINSTANCE.getControlProcedimiento_PuestoPersonaElaborado();

		/**
		 * The meta object literal for the '<em><b>Fecha Revisado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_REVISADO = eINSTANCE.getControlProcedimiento_FechaRevisado();

		/**
		 * The meta object literal for the '<em><b>Nombre Persona Revisado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO = eINSTANCE.getControlProcedimiento_NombrePersonaRevisado();

		/**
		 * The meta object literal for the '<em><b>Puesto Persona Revisado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO = eINSTANCE.getControlProcedimiento_PuestoPersonaRevisado();

		/**
		 * The meta object literal for the '<em><b>Fecha Aprobado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__FECHA_APROBADO = eINSTANCE.getControlProcedimiento_FechaAprobado();

		/**
		 * The meta object literal for the '<em><b>Nombre Persona Aprobado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO = eINSTANCE.getControlProcedimiento_NombrePersonaAprobado();

		/**
		 * The meta object literal for the '<em><b>Puesto Persona Aprobado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO = eINSTANCE.getControlProcedimiento_PuestoPersonaAprobado();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PROCEDIMIENTO__PROCEDIMIENTO = eINSTANCE.getControlProcedimiento_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl <em>Tramitacion Procedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.TramitacionProcedimientoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTramitacionProcedimiento()
		 * @generated
		 */
		EClass TRAMITACION_PROCEDIMIENTO = eINSTANCE.getTramitacionProcedimiento();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__ETIQUETA = eINSTANCE.getTramitacionProcedimiento_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Inicio Instancia De Parte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE = eINSTANCE.getTramitacionProcedimiento_InicioInstanciaDeParte();

		/**
		 * The meta object literal for the '<em><b>Inicio De Oficio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO = eINSTANCE.getTramitacionProcedimiento_InicioDeOficio();

		/**
		 * The meta object literal for the '<em><b>Volumen Expedientes Ejercicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO = eINSTANCE.getTramitacionProcedimiento_VolumenExpedientesEjercicio();

		/**
		 * The meta object literal for the '<em><b>Presupuesto Anual Aproximado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO = eINSTANCE.getTramitacionProcedimiento_PresupuestoAnualAproximado();

		/**
		 * The meta object literal for the '<em><b>Plazo Solicitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD = eINSTANCE.getTramitacionProcedimiento_PlazoSolicitud();

		/**
		 * The meta object literal for the '<em><b>Plazo Resolucion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION = eINSTANCE.getTramitacionProcedimiento_PlazoResolucion();

		/**
		 * The meta object literal for the '<em><b>Silencio Administrativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO = eINSTANCE.getTramitacionProcedimiento_SilencioAdministrativo();

		/**
		 * The meta object literal for the '<em><b>Recurso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__RECURSO = eINSTANCE.getTramitacionProcedimiento_Recurso();

		/**
		 * The meta object literal for the '<em><b>Es Workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW = eINSTANCE.getTramitacionProcedimiento_EsWorkflow();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO = eINSTANCE.getTramitacionProcedimiento_Procedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.OperacionesImpl <em>Operaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.OperacionesImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getOperaciones()
		 * @generated
		 */
		EClass OPERACIONES = eINSTANCE.getOperaciones();

		/**
		 * The meta object literal for the '<em><b>Procedimiento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACIONES__PROCEDIMIENTO = eINSTANCE.getOperaciones_Procedimiento();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACIONES__OPERACIONES = eINSTANCE.getOperaciones_Operaciones();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.OperacionImpl <em>Operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.OperacionImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getOperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getOperacion();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ETIQUETA = eINSTANCE.getOperacion_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__TITULO = eINSTANCE.getOperacion_Titulo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__DESCRIPCION = eINSTANCE.getOperacion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Plazo Ejecucion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__PLAZO_EJECUCION = eINSTANCE.getOperacion_PlazoEjecucion();

		/**
		 * The meta object literal for the '<em><b>Es Workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ES_WORKFLOW = eINSTANCE.getOperacion_EsWorkflow();

		/**
		 * The meta object literal for the '<em><b>Numero Pagina</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__NUMERO_PAGINA = eINSTANCE.getOperacion_NumeroPagina();

		/**
		 * The meta object literal for the '<em><b>Numero Orden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__NUMERO_ORDEN = eINSTANCE.getOperacion_NumeroOrden();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__OPERACIONES = eINSTANCE.getOperacion_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Aplicaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__APLICACIONES = eINSTANCE.getOperacion_Aplicaciones();

		/**
		 * The meta object literal for the '<em><b>Flujos Entrantes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__FLUJOS_ENTRANTES = eINSTANCE.getOperacion_FlujosEntrantes();

		/**
		 * The meta object literal for the '<em><b>Flujos Salientes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__FLUJOS_SALIENTES = eINSTANCE.getOperacion_FlujosSalientes();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__UNIDAD = eINSTANCE.getOperacion_Unidad();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.DecisionImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.SubprocedimientoImpl <em>Subprocedimiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.SubprocedimientoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSubprocedimiento()
		 * @generated
		 */
		EClass SUBPROCEDIMIENTO = eINSTANCE.getSubprocedimiento();

		/**
		 * The meta object literal for the '<em><b>Sub Procedimiento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO = eINSTANCE.getSubprocedimiento_SubProcedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.DocumentoFinalImpl <em>Documento Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.DocumentoFinalImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentoFinal()
		 * @generated
		 */
		EClass DOCUMENTO_FINAL = eINSTANCE.getDocumentoFinal();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTO_FINAL__DOCUMENTO = eINSTANCE.getDocumentoFinal_Documento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.DocumentoFinalInternoImpl <em>Documento Final Interno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.DocumentoFinalInternoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getDocumentoFinalInterno()
		 * @generated
		 */
		EClass DOCUMENTO_FINAL_INTERNO = eINSTANCE.getDocumentoFinalInterno();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.EntradaDocumentoFinalImpl <em>Entrada Documento Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.EntradaDocumentoFinalImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getEntradaDocumentoFinal()
		 * @generated
		 */
		EClass ENTRADA_DOCUMENTO_FINAL = eINSTANCE.getEntradaDocumentoFinal();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.SalidaDocumentoFinalImpl <em>Salida Documento Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.SalidaDocumentoFinalImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSalidaDocumentoFinal()
		 * @generated
		 */
		EClass SALIDA_DOCUMENTO_FINAL = eINSTANCE.getSalidaDocumentoFinal();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.SimapaCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.SimapaCollectionImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSimapaCollection()
		 * @generated
		 */
		EClass SIMAPA_COLLECTION = eINSTANCE.getSimapaCollection();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.SimapaObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.SimapaObjectImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getSimapaObject()
		 * @generated
		 */
		EClass SIMAPA_OBJECT = eINSTANCE.getSimapaObject();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.FinProcesoImpl <em>Fin Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.FinProcesoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFinProceso()
		 * @generated
		 */
		EClass FIN_PROCESO = eINSTANCE.getFinProceso();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.impl.FlujoImpl <em>Flujo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.impl.FlujoImpl
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getFlujo()
		 * @generated
		 */
		EClass FLUJO = eINSTANCE.getFlujo();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUJO__ETIQUETA = eINSTANCE.getFlujo_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUJO__TEXTO = eINSTANCE.getFlujo_Texto();

		/**
		 * The meta object literal for the '<em><b>Es Conector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUJO__ES_CONECTOR = eINSTANCE.getFlujo_EsConector();

		/**
		 * The meta object literal for the '<em><b>Guarda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUJO__GUARDA = eINSTANCE.getFlujo_Guarda();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLUJO__ORIGEN = eINSTANCE.getFlujo_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLUJO__DESTINO = eINSTANCE.getFlujo_Destino();

		/**
		 * The meta object literal for the '<em><b>Documentos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLUJO__DOCUMENTOS = eINSTANCE.getFlujo_Documentos();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoMedioDocumento <em>Tipo Medio Documento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoMedioDocumento
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoMedioDocumento()
		 * @generated
		 */
		EEnum TIPO_MEDIO_DOCUMENTO = eINSTANCE.getTipoMedioDocumento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoSilencioAdministrativo <em>Tipo Silencio Administrativo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoSilencioAdministrativo
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoSilencioAdministrativo()
		 * @generated
		 */
		EEnum TIPO_SILENCIO_ADMINISTRATIVO = eINSTANCE.getTipoSilencioAdministrativo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoSituacionProcedimiento <em>Tipo Situacion Procedimiento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoSituacionProcedimiento
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoSituacionProcedimiento()
		 * @generated
		 */
		EEnum TIPO_SITUACION_PROCEDIMIENTO = eINSTANCE.getTipoSituacionProcedimiento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoAccesoArchivo <em>Tipo Acceso Archivo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoAccesoArchivo
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAccesoArchivo()
		 * @generated
		 */
		EEnum TIPO_ACCESO_ARCHIVO = eINSTANCE.getTipoAccesoArchivo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoAmbitoDocumento <em>Tipo Ambito Documento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoAmbitoDocumento
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAmbitoDocumento()
		 * @generated
		 */
		EEnum TIPO_AMBITO_DOCUMENTO = eINSTANCE.getTipoAmbitoDocumento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoAlmacenamientoDocumento <em>Tipo Almacenamiento Documento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoAlmacenamientoDocumento
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAlmacenamientoDocumento()
		 * @generated
		 */
		EEnum TIPO_ALMACENAMIENTO_DOCUMENTO = eINSTANCE.getTipoAlmacenamientoDocumento();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoDesarrollo <em>Tipo Desarrollo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoDesarrollo
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoDesarrollo()
		 * @generated
		 */
		EEnum TIPO_DESARROLLO = eINSTANCE.getTipoDesarrollo();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.TipoAplicacion <em>Tipo Aplicacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.TipoAplicacion
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getTipoAplicacion()
		 * @generated
		 */
		EEnum TIPO_APLICACION = eINSTANCE.getTipoAplicacion();

		/**
		 * The meta object literal for the '{@link es.gva.cit.simapa.Rango1_10 <em>Rango1 10</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.simapa.Rango1_10
		 * @see es.gva.cit.simapa.impl.SimapaPackageImpl#getRango1_10()
		 * @generated
		 */
		EEnum RANGO1_10 = eINSTANCE.getRango1_10();

	}

} //SimapaPackage
