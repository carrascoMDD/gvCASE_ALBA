/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.Column;
import es.gva.cit.gvcase.prototipo.rdbms.ConModelClass;
import es.gva.cit.gvcase.prototipo.rdbms.DataType;
import es.gva.cit.gvcase.prototipo.rdbms.Element;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKey;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn;
import es.gva.cit.gvcase.prototipo.rdbms.Join;
import es.gva.cit.gvcase.prototipo.rdbms.NamedElement;
import es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsFactory;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Schema;
import es.gva.cit.gvcase.prototipo.rdbms.Table;
import es.gva.cit.gvcase.prototipo.rdbms.View;
import es.gva.cit.gvcase.prototipo.rdbms.ViewColumn;

import es.gva.cit.gvcase.prototipo.rdbms.util.RdbmsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class RdbmsPackageImpl extends EPackageImpl implements RdbmsPackage {
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
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

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
	private EClass tableEClass = null;

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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdbmsPackageImpl() {
		super(eNS_URI, RdbmsFactory.eINSTANCE);
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
	public static RdbmsPackage init() {
		if (isInited) return (RdbmsPackage)EPackage.Registry.INSTANCE.getEPackage(RdbmsPackage.eNS_URI);

		// Obtain or create and register package
		RdbmsPackageImpl theRdbmsPackage = (RdbmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RdbmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RdbmsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRdbmsPackage.createPackageContents();

		// Initialize created meta-data
		theRdbmsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRdbmsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RdbmsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRdbmsPackage.freeze();

		return theRdbmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Etiqueta() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Tables() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_DataTypes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Views() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_ModelPackage() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Etiqueta() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_EtiquetaMedia() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_EtiquetaSimple() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_ForeignOfKeyColumns() {
		return (EReference)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_OwnOfKeyColumns() {
		return (EReference)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_DataType() {
		return (EReference)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_PrimaryKey() {
		return (EReference)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Joins() {
		return (EReference)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKey() {
		return primaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKey_Etiqueta() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKey_Table() {
		return (EReference)primaryKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKey_Columns() {
		return (EReference)primaryKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKey_PrimaryKeyOfForeignKeys() {
		return (EReference)primaryKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKey_Etiqueta() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_KeyColumns() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_Table() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKey_PrimaryKey() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKeyColumn() {
		return foreignKeyColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignKeyColumn_Etiqueta() {
		return (EAttribute)foreignKeyColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyColumn_Key() {
		return (EReference)foreignKeyColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyColumn_ForeignColumn() {
		return (EReference)foreignKeyColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyColumn_OwnColumn() {
		return (EReference)foreignKeyColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Etiqueta() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Columns() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Schema() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Etiqueta() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Schema() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Tables() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_WhereClause() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_ViewColumns() {
		return (EReference)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Joins() {
		return (EReference)viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewColumn() {
		return viewColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewColumn_Etiqueta() {
		return (EAttribute)viewColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewColumn_Column() {
		return (EReference)viewColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewColumn_View() {
		return (EReference)viewColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Etiqueta() {
		return (EAttribute)joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Columns() {
		return (EReference)joinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_View() {
		return (EReference)joinEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getViewColumn_Name() {
		return (EAttribute)viewColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Etiqueta() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_EtiquetaSimple() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Schema() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_PrimaryKey() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ForeignKeys() {
		return (EReference)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsFactory getRdbmsFactory() {
		return (RdbmsFactory)getEFactoryInstance();
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
		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__ETIQUETA);
		createEAttribute(columnEClass, COLUMN__ETIQUETA_MEDIA);
		createEAttribute(columnEClass, COLUMN__ETIQUETA_SIMPLE);
		createEReference(columnEClass, COLUMN__TABLE);
		createEReference(columnEClass, COLUMN__FOREIGN_OF_KEY_COLUMNS);
		createEReference(columnEClass, COLUMN__OWN_OF_KEY_COLUMNS);
		createEReference(columnEClass, COLUMN__DATA_TYPE);
		createEReference(columnEClass, COLUMN__PRIMARY_KEY);
		createEReference(columnEClass, COLUMN__JOINS);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__ETIQUETA);
		createEReference(dataTypeEClass, DATA_TYPE__COLUMNS);
		createEReference(dataTypeEClass, DATA_TYPE__SCHEMA);

		elementEClass = createEClass(ELEMENT);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__ETIQUETA);
		createEReference(foreignKeyEClass, FOREIGN_KEY__KEY_COLUMNS);
		createEReference(foreignKeyEClass, FOREIGN_KEY__TABLE);
		createEReference(foreignKeyEClass, FOREIGN_KEY__PRIMARY_KEY);

		foreignKeyColumnEClass = createEClass(FOREIGN_KEY_COLUMN);
		createEAttribute(foreignKeyColumnEClass, FOREIGN_KEY_COLUMN__ETIQUETA);
		createEReference(foreignKeyColumnEClass, FOREIGN_KEY_COLUMN__KEY);
		createEReference(foreignKeyColumnEClass, FOREIGN_KEY_COLUMN__FOREIGN_COLUMN);
		createEReference(foreignKeyColumnEClass, FOREIGN_KEY_COLUMN__OWN_COLUMN);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		primaryKeyEClass = createEClass(PRIMARY_KEY);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__ETIQUETA);
		createEReference(primaryKeyEClass, PRIMARY_KEY__TABLE);
		createEReference(primaryKeyEClass, PRIMARY_KEY__COLUMNS);
		createEReference(primaryKeyEClass, PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__ETIQUETA);
		createEReference(schemaEClass, SCHEMA__TABLES);
		createEReference(schemaEClass, SCHEMA__DATA_TYPES);
		createEReference(schemaEClass, SCHEMA__VIEWS);
		createEReference(schemaEClass, SCHEMA__MODEL_PACKAGE);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__ETIQUETA);
		createEAttribute(tableEClass, TABLE__ETIQUETA_SIMPLE);
		createEReference(tableEClass, TABLE__SCHEMA);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__PRIMARY_KEY);
		createEReference(tableEClass, TABLE__FOREIGN_KEYS);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__ETIQUETA);
		createEReference(viewEClass, VIEW__SCHEMA);
		createEReference(viewEClass, VIEW__TABLES);
		createEAttribute(viewEClass, VIEW__WHERE_CLAUSE);
		createEReference(viewEClass, VIEW__VIEW_COLUMNS);
		createEReference(viewEClass, VIEW__JOINS);

		viewColumnEClass = createEClass(VIEW_COLUMN);
		createEAttribute(viewColumnEClass, VIEW_COLUMN__ETIQUETA);
		createEAttribute(viewColumnEClass, VIEW_COLUMN__NAME);
		createEReference(viewColumnEClass, VIEW_COLUMN__COLUMN);
		createEReference(viewColumnEClass, VIEW_COLUMN__VIEW);

		joinEClass = createEClass(JOIN);
		createEAttribute(joinEClass, JOIN__ETIQUETA);
		createEReference(joinEClass, JOIN__COLUMNS);
		createEReference(joinEClass, JOIN__VIEW);

		conModelClassEClass = createEClass(CON_MODEL_CLASS);
		createEReference(conModelClassEClass, CON_MODEL_CLASS__MODEL_CLASS);
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
		columnEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getNamedElement());
		elementEClass.getESuperTypes().add(this.getConModelClass());
		foreignKeyEClass.getESuperTypes().add(this.getNamedElement());
		foreignKeyColumnEClass.getESuperTypes().add(this.getElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		primaryKeyEClass.getESuperTypes().add(this.getNamedElement());
		schemaEClass.getESuperTypes().add(this.getNamedElement());
		tableEClass.getESuperTypes().add(this.getNamedElement());
		viewEClass.getESuperTypes().add(this.getNamedElement());
		viewColumnEClass.getESuperTypes().add(this.getElement());
		joinEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Column.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_EtiquetaMedia(), ecorePackage.getEString(), "etiquetaMedia", null, 0, 1, Column.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, Column.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, Column.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_ForeignOfKeyColumns(), this.getForeignKeyColumn(), this.getForeignKeyColumn_ForeignColumn(), "foreignOfKeyColumns", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_OwnOfKeyColumns(), this.getForeignKeyColumn(), this.getForeignKeyColumn_OwnColumn(), "ownOfKeyColumns", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_DataType(), this.getDataType(), this.getDataType_Columns(), "dataType", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_PrimaryKey(), this.getPrimaryKey(), this.getPrimaryKey_Columns(), "primaryKey", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Joins(), this.getJoin(), this.getJoin_Columns(), "joins", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, DataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Columns(), this.getColumn(), this.getColumn_DataType(), "columns", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Schema(), this.getSchema(), this.getSchema_DataTypes(), "schema", null, 1, 1, DataType.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeignKey_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ForeignKey.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_KeyColumns(), this.getForeignKeyColumn(), this.getForeignKeyColumn_Key(), "keyColumns", null, 1, -1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_Table(), this.getTable(), this.getTable_ForeignKeys(), "table", null, 1, 1, ForeignKey.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKey_PrimaryKey(), this.getPrimaryKey(), this.getPrimaryKey_PrimaryKeyOfForeignKeys(), "primaryKey", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(foreignKeyEClass, ecorePackage.getEBoolean(), "validatePrimaryKeyTable", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(foreignKeyEClass, ecorePackage.getEBoolean(), "validateKeyColumnsSize", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(foreignKeyEClass, ecorePackage.getEBoolean(), "validateKeyColumnsSequence", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(foreignKeyColumnEClass, ForeignKeyColumn.class, "ForeignKeyColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeignKeyColumn_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ForeignKeyColumn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyColumn_Key(), this.getForeignKey(), this.getForeignKey_KeyColumns(), "key", null, 1, 1, ForeignKeyColumn.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyColumn_ForeignColumn(), this.getColumn(), this.getColumn_ForeignOfKeyColumns(), "foreignColumn", null, 1, 1, ForeignKeyColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyColumn_OwnColumn(), this.getColumn(), this.getColumn_OwnOfKeyColumns(), "ownColumn", null, 1, 1, ForeignKeyColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(foreignKeyColumnEClass, ecorePackage.getEBoolean(), "validateOwnColumn", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(foreignKeyColumnEClass, ecorePackage.getEBoolean(), "validateForeignColumn", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(foreignKeyColumnEClass, ecorePackage.getEBoolean(), "validateColumnDataTypes", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(namedElementEClass, ecorePackage.getEBoolean(), "validateNamedElement", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKey_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, PrimaryKey.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryKey_Table(), this.getTable(), this.getTable_PrimaryKey(), "table", null, 1, 1, PrimaryKey.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryKey_Columns(), this.getColumn(), this.getColumn_PrimaryKey(), "columns", null, 1, -1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryKey_PrimaryKeyOfForeignKeys(), this.getForeignKey(), this.getForeignKey_PrimaryKey(), "primaryKeyOfForeignKeys", null, 0, -1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(primaryKeyEClass, ecorePackage.getEBoolean(), "validatePrimaryKeyColumnsTable", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Schema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Tables(), this.getTable(), this.getTable_Schema(), "tables", null, 1, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_DataTypes(), this.getDataType(), this.getDataType_Schema(), "dataTypes", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Views(), this.getView(), this.getView_Schema(), "views", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_ModelPackage(), theEcorePackage.getEPackage(), null, "modelPackage", null, 1, 1, Schema.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(schemaEClass, ecorePackage.getEBoolean(), "validateUniqueTableNames", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(schemaEClass, ecorePackage.getEBoolean(), "validateUniqueDataTypeNames", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_EtiquetaSimple(), ecorePackage.getEString(), "etiquetaSimple", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Schema(), this.getSchema(), this.getSchema_Tables(), "schema", null, 1, 1, Table.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_PrimaryKey(), this.getPrimaryKey(), this.getPrimaryKey_Table(), "primaryKey", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ForeignKeys(), this.getForeignKey(), this.getForeignKey_Table(), "foreignKeys", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tableEClass, ecorePackage.getEBoolean(), "validateUniqueColumnNames", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(tableEClass, ecorePackage.getEBoolean(), "validateUniqueForeignKeyNames", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, View.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getView_Schema(), this.getSchema(), this.getSchema_Views(), "schema", null, 1, 1, View.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Tables(), this.getTable(), null, "tables", null, 1, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_WhereClause(), ecorePackage.getEString(), "whereClause", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_ViewColumns(), this.getViewColumn(), this.getViewColumn_View(), "viewColumns", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Joins(), this.getJoin(), this.getJoin_View(), "joins", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(viewEClass, ecorePackage.getEInt(), "createViewColumns", 0, 1);

		initEClass(viewColumnEClass, ViewColumn.class, "ViewColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewColumn_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, ViewColumn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewColumn_Name(), ecorePackage.getEString(), "name", "", 1, 1, ViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewColumn_Column(), this.getColumn(), null, "column", null, 1, 1, ViewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewColumn_View(), this.getView(), this.getView_ViewColumns(), "view", null, 1, 1, ViewColumn.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoin_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Join.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_Columns(), this.getColumn(), this.getColumn_Joins(), "columns", null, 2, 2, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_View(), this.getView(), this.getView_Joins(), "view", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conModelClassEClass, ConModelClass.class, "ConModelClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConModelClass_ModelClass(), theEcorePackage.getEClass(), null, "modelClass", null, 1, 1, ConModelClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (getColumn_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getColumn_EtiquetaMedia(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiquetaSimple\r\n)\r\n"
		   });		
		addAnnotation
		  (getColumn_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif)\r\n"
		   });		
		addAnnotation
		  (getColumn_DataType(), 
		   source, 
		   new String[] {
			 "candidates", "table.schema.dataTypes"
		   });		
		addAnnotation
		  (getDataType_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "not (primaryKey.table = table)"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "keyColumns->size() = primaryKey.columns->size()"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "invariant", "Sequence { 1..keyColumns->size() }->forAll(anIndex | anIndex = primaryKey.columns->indexOf( keyColumns->at(anIndex).foreignColumn))"
		   });		
		addAnnotation
		  (getForeignKey_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getForeignKey_PrimaryKey(), 
		   source, 
		   new String[] {
			 "candidates", "table.schema.tables->asSet()->excluding( table).primaryKey"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyColumnEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "ownColumn.table = key.table"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyColumnEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "foreignColumn.primaryKey = key.primaryKey"
		   });		
		addAnnotation
		  ((EOperation)foreignKeyColumnEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "invariant", "ownColumn.dataType = foreignColumn.dataType"
		   });		
		addAnnotation
		  (getForeignKeyColumn_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "\'Own \'.concat( if ownColumn->isEmpty() then \'?\' else ownColumn.etiquetaSimple endif).concat(\' Foreign \').concat(\r\n   if foreignColumn->isEmpty() then \'?\' else foreignColumn.etiquetaSimple endif\r\n).concat(\' de \').concat(\r\nkey.etiqueta\r\n)"
		   });		
		addAnnotation
		  (getForeignKeyColumn_ForeignColumn(), 
		   source, 
		   new String[] {
			 "candidates", "key.primaryKey.columns"
		   });		
		addAnnotation
		  (getForeignKeyColumn_OwnColumn(), 
		   source, 
		   new String[] {
			 "candidates", "key.table.columns"
		   });		
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "name.size() > 0"
		   });		
		addAnnotation
		  ((EOperation)primaryKeyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "columns->forAll( aKeyCol | aKeyCol.table = table)"
		   });		
		addAnnotation
		  (getPrimaryKey_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getPrimaryKey_Columns(), 
		   source, 
		   new String[] {
			 "candidates", "table.columns->reject(aC | columns->includes(aC))"
		   });		
		addAnnotation
		  ((EOperation)schemaEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "tables->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)"
		   });		
		addAnnotation
		  ((EOperation)schemaEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "dataTypes->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)"
		   });		
		addAnnotation
		  (getSchema_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if name->isEmpty() or name.size() < 1 then \'?\' else name endif"
		   });		
		addAnnotation
		  ((EOperation)tableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "invariant", "columns->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)"
		   });		
		addAnnotation
		  ((EOperation)tableEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "invariant", "foreignKeys->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)"
		   });		
		addAnnotation
		  (getTable_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getTable_EtiquetaSimple(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif)"
		   });		
		addAnnotation
		  (getView_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getViewColumn_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' viewing \').concat(\r\nif column->isEmpty() then \'?\' else column.etiquetaMedia endif\r\n).concat(\' de \').concat(\r\nview.etiqueta\r\n)\r\n"
		   });		
		addAnnotation
		  (getViewColumn_Column(), 
		   source, 
		   new String[] {
			 "candidates", "view.tables.columns->reject(aC | view.viewColumns.column->includes(aC))"
		   });		
		addAnnotation
		  (getJoin_Etiqueta(), 
		   source, 
		   new String[] {
			 "derive", "if columns->isEmpty() then \'? = ?\' else\r\n(\r\n  if columns->size()< 2 then\r\n\tcolumns->at(1).etiquetaMedia.concat( \' = ?\')\r\n  else\r\n\tcolumns->at(1).etiquetaMedia.concat( \' = \').concat(columns->at(2).etiquetaMedia)\r\n  endif\r\n)\r\nendif\r\n"
		   });		
		addAnnotation
		  (getJoin_Columns(), 
		   source, 
		   new String[] {
			 "candidates", "view.tables.columns"
		   });
	}

} //RdbmsPackageImpl
