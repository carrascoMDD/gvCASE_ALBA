/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsFactory
 * @model kind="package"
 * @generated
 */
public interface RdbmsPackage extends EPackage {
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
	String eNAME = "rdbms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///es/gva/cit/gvcase/prototipo/rdbms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.gva.cit.gvcase.prototipo.rdbms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbmsPackage eINSTANCE = es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ConModelClassImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getConModelClass()
	 * @generated
	 */
	int CON_MODEL_CLASS = 12;

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
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ElementImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODEL_CLASS = CON_MODEL_CLASS__MODEL_CLASS;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = CON_MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.NamedElementImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MODEL_CLASS = ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 7;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etiqueta Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ETIQUETA_MEDIA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ETIQUETA_SIMPLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Foreign Of Key Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FOREIGN_OF_KEY_COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Own Of Key Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWN_OF_KEY_COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRIMARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__JOINS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 6;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 3;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl <em>Foreign Key Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getForeignKeyColumn()
	 * @generated
	 */
	int FOREIGN_KEY_COLUMN = 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.DataTypeImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCHEMA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__KEY_COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__PRIMARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN__MODEL_CLASS = ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN__ETIQUETA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN__KEY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreign Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN__FOREIGN_COLUMN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Own Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN__OWN_COLUMN = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Foreign Key Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_COLUMN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Key Of Foreign Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DATA_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VIEWS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MODEL_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 9;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewColumnImpl <em>View Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ViewColumnImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getViewColumn()
	 * @generated
	 */
	int VIEW_COLUMN = 10;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.TableImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 8;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ETIQUETA_SIMPLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOREIGN_KEYS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__MODEL_CLASS = NAMED_ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ETIQUETA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SCHEMA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TABLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__WHERE_CLAUSE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__JOINS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__MODEL_CLASS = ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__ETIQUETA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__COLUMN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN__VIEW = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLUMN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.JoinImpl
	 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 11;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MODEL_CLASS = ELEMENT__MODEL_CLASS;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ETIQUETA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COLUMNS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__VIEW = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getEtiqueta()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Etiqueta();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getDataTypes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getViews()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Views();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Package</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getModelPackage()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ModelPackage();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiqueta()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaMedia <em>Etiqueta Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Media</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaMedia()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_EtiquetaMedia();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaSimple()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_EtiquetaSimple();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getForeignOfKeyColumns <em>Foreign Of Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Foreign Of Key Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getForeignOfKeyColumns()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ForeignOfKeyColumns();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getOwnOfKeyColumns <em>Own Of Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Own Of Key Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getOwnOfKeyColumns()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_OwnOfKeyColumns();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_DataType();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_PrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Joins</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getJoins()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Joins();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getEtiqueta()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getTable()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Table();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getColumns()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Columns();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getPrimaryKeyOfForeignKeys <em>Primary Key Of Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Key Of Foreign Keys</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getPrimaryKeyOfForeignKeys()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_PrimaryKeyOfForeignKeys();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getEtiqueta()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Etiqueta();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getKeyColumns <em>Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getKeyColumns()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_KeyColumns();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Table();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn <em>Foreign Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn
	 * @generated
	 */
	EClass getForeignKeyColumn();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getEtiqueta()
	 * @see #getForeignKeyColumn()
	 * @generated
	 */
	EAttribute getForeignKeyColumn_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getKey()
	 * @see #getForeignKeyColumn()
	 * @generated
	 */
	EReference getForeignKeyColumn_Key();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn <em>Foreign Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn()
	 * @see #getForeignKeyColumn()
	 * @generated
	 */
	EReference getForeignKeyColumn_ForeignColumn();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn <em>Own Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Own Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn()
	 * @see #getForeignKeyColumn()
	 * @generated
	 */
	EReference getForeignKeyColumn_OwnColumn();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType#getEtiqueta()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Etiqueta();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType#getColumns()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Columns();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType#getSchema()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Schema();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getEtiqueta()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Etiqueta();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getSchema()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Schema();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getTables()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Tables();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where Clause</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getWhereClause()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_WhereClause();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getViewColumns <em>View Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getViewColumns()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getJoins()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Joins();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn <em>View Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn
	 * @generated
	 */
	EClass getViewColumn();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getEtiqueta()
	 * @see #getViewColumn()
	 * @generated
	 */
	EAttribute getViewColumn_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getColumn()
	 * @see #getViewColumn()
	 * @generated
	 */
	EReference getViewColumn_Column();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getView()
	 * @see #getViewColumn()
	 * @generated
	 */
	EReference getViewColumn_View();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join#getEtiqueta()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Etiqueta();

	/**
	 * Returns the meta object for the reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join#getColumns()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Columns();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join#getView()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_View();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.ConModelClass <em>Con Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Con Model Class</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ConModelClass
	 * @generated
	 */
	EClass getConModelClass();

	/**
	 * Returns the meta object for the reference '{@link es.gva.cit.gvcase.prototipo.rdbms.ConModelClass#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Class</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ConModelClass#getModelClass()
	 * @see #getConModelClass()
	 * @generated
	 */
	EReference getConModelClass_ModelClass();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getName()
	 * @see #getViewColumn()
	 * @generated
	 */
	EAttribute getViewColumn_Name();

	/**
	 * Returns the meta object for class '{@link es.gva.cit.gvcase.prototipo.rdbms.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiqueta()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiquetaSimple <em>Etiqueta Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta Simple</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiquetaSimple()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_EtiquetaSimple();

	/**
	 * Returns the meta object for the container reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getForeignKeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ForeignKeys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdbmsFactory getRdbmsFactory();

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
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ETIQUETA = eINSTANCE.getSchema_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DATA_TYPES = eINSTANCE.getSchema_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__VIEWS = eINSTANCE.getSchema_Views();

		/**
		 * The meta object literal for the '<em><b>Model Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__MODEL_PACKAGE = eINSTANCE.getSchema_ModelPackage();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.NamedElementImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ETIQUETA = eINSTANCE.getColumn_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ETIQUETA_MEDIA = eINSTANCE.getColumn_EtiquetaMedia();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ETIQUETA_SIMPLE = eINSTANCE.getColumn_EtiquetaSimple();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Foreign Of Key Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__FOREIGN_OF_KEY_COLUMNS = eINSTANCE.getColumn_ForeignOfKeyColumns();

		/**
		 * The meta object literal for the '<em><b>Own Of Key Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__OWN_OF_KEY_COLUMNS = eINSTANCE.getColumn_OwnOfKeyColumns();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__PRIMARY_KEY = eINSTANCE.getColumn_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__JOINS = eINSTANCE.getColumn_Joins();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__ETIQUETA = eINSTANCE.getPrimaryKey_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__TABLE = eINSTANCE.getPrimaryKey_Table();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COLUMNS = eINSTANCE.getPrimaryKey_Columns();

		/**
		 * The meta object literal for the '<em><b>Primary Key Of Foreign Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS = eINSTANCE.getPrimaryKey_PrimaryKeyOfForeignKeys();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__ETIQUETA = eINSTANCE.getForeignKey_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Key Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__KEY_COLUMNS = eINSTANCE.getForeignKey_KeyColumns();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TABLE = eINSTANCE.getForeignKey_Table();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__PRIMARY_KEY = eINSTANCE.getForeignKey_PrimaryKey();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl <em>Foreign Key Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getForeignKeyColumn()
		 * @generated
		 */
		EClass FOREIGN_KEY_COLUMN = eINSTANCE.getForeignKeyColumn();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_COLUMN__ETIQUETA = eINSTANCE.getForeignKeyColumn_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_COLUMN__KEY = eINSTANCE.getForeignKeyColumn_Key();

		/**
		 * The meta object literal for the '<em><b>Foreign Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_COLUMN__FOREIGN_COLUMN = eINSTANCE.getForeignKeyColumn_ForeignColumn();

		/**
		 * The meta object literal for the '<em><b>Own Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_COLUMN__OWN_COLUMN = eINSTANCE.getForeignKeyColumn_OwnColumn();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.DataTypeImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ETIQUETA = eINSTANCE.getDataType_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__COLUMNS = eINSTANCE.getDataType_Columns();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__SCHEMA = eINSTANCE.getDataType_Schema();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ElementImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ETIQUETA = eINSTANCE.getView_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SCHEMA = eINSTANCE.getView_Schema();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__TABLES = eINSTANCE.getView_Tables();

		/**
		 * The meta object literal for the '<em><b>Where Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__WHERE_CLAUSE = eINSTANCE.getView_WhereClause();

		/**
		 * The meta object literal for the '<em><b>View Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_COLUMNS = eINSTANCE.getView_ViewColumns();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__JOINS = eINSTANCE.getView_Joins();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewColumnImpl <em>View Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ViewColumnImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getViewColumn()
		 * @generated
		 */
		EClass VIEW_COLUMN = eINSTANCE.getViewColumn();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_COLUMN__ETIQUETA = eINSTANCE.getViewColumn_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COLUMN__COLUMN = eINSTANCE.getViewColumn_Column();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COLUMN__VIEW = eINSTANCE.getViewColumn_View();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.JoinImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__ETIQUETA = eINSTANCE.getJoin_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__COLUMNS = eINSTANCE.getJoin_Columns();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__VIEW = eINSTANCE.getJoin_View();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ConModelClassImpl <em>Con Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.ConModelClassImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getConModelClass()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_COLUMN__NAME = eINSTANCE.getViewColumn_Name();

		/**
		 * The meta object literal for the '{@link es.gva.cit.gvcase.prototipo.rdbms.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.TableImpl
		 * @see es.gva.cit.gvcase.prototipo.rdbms.impl.RdbmsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ETIQUETA = eINSTANCE.getTable_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Etiqueta Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ETIQUETA_SIMPLE = eINSTANCE.getTable_EtiquetaSimple();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__SCHEMA = eINSTANCE.getTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

	}

} //RdbmsPackage
