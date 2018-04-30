/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.util;

import es.gva.cit.gvcase.prototipo.rdbms.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage
 * @generated
 */
public class RdbmsValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RdbmsValidator INSTANCE = new RdbmsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.gva.cit.gvcase.prototipo.rdbms";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Table Names' of 'Schema'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEMA__VALIDATE_UNIQUE_TABLE_NAMES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Data Type Names' of 'Schema'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEMA__VALIDATE_UNIQUE_DATA_TYPE_NAMES = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Named Element' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VALIDATE_NAMED_ELEMENT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Primary Key Columns Table' of 'Primary Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIMARY_KEY__VALIDATE_PRIMARY_KEY_COLUMNS_TABLE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Primary Key Table' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__VALIDATE_PRIMARY_KEY_TABLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Key Columns Size' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__VALIDATE_KEY_COLUMNS_SIZE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Key Columns Sequence' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__VALIDATE_KEY_COLUMNS_SEQUENCE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Own Column' of 'Foreign Key Column'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY_COLUMN__VALIDATE_OWN_COLUMN = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Foreign Column' of 'Foreign Key Column'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY_COLUMN__VALIDATE_FOREIGN_COLUMN = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Column Data Types' of 'Foreign Key Column'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY_COLUMN__VALIDATE_COLUMN_DATA_TYPES = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Column Names' of 'Table'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLE__VALIDATE_UNIQUE_COLUMN_NAMES = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Foreign Key Names' of 'Table'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLE__VALIDATE_UNIQUE_FOREIGN_KEY_NAMES = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return RdbmsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case RdbmsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case RdbmsPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case RdbmsPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case RdbmsPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case RdbmsPackage.FOREIGN_KEY_COLUMN:
				return validateForeignKeyColumn((ForeignKeyColumn)value, diagnostics, context);
			case RdbmsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case RdbmsPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case RdbmsPackage.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case RdbmsPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case RdbmsPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case RdbmsPackage.VIEW_COLUMN:
				return validateViewColumn((ViewColumn)value, diagnostics, context);
			case RdbmsPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case RdbmsPackage.CON_MODEL_CLASS:
				return validateConModelClass((ConModelClass)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchema_validateUniqueTableNames(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchema_validateUniqueDataTypeNames(schema, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUniqueTableNames constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema_validateUniqueTableNames(Schema schema, DiagnosticChain diagnostics, Map context) {
		return schema.validateUniqueTableNames(diagnostics, context);
	}

	/**
	 * Validates the validateUniqueDataTypeNames constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema_validateUniqueDataTypeNames(Schema schema, DiagnosticChain diagnostics, Map context) {
		return schema.validateUniqueDataTypeNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNamedElement constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		return namedElement.validateNamedElement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(column, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrimaryKey_validatePrimaryKeyColumnsTable(primaryKey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrimaryKeyColumnsTable constraint of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey_validatePrimaryKeyColumnsTable(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map context) {
		return primaryKey.validatePrimaryKeyColumnsTable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_validatePrimaryKeyTable(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_validateKeyColumnsSize(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_validateKeyColumnsSequence(foreignKey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrimaryKeyTable constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_validatePrimaryKeyTable(ForeignKey foreignKey, DiagnosticChain diagnostics, Map context) {
		return foreignKey.validatePrimaryKeyTable(diagnostics, context);
	}

	/**
	 * Validates the validateKeyColumnsSize constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_validateKeyColumnsSize(ForeignKey foreignKey, DiagnosticChain diagnostics, Map context) {
		return foreignKey.validateKeyColumnsSize(diagnostics, context);
	}

	/**
	 * Validates the validateKeyColumnsSequence constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_validateKeyColumnsSequence(ForeignKey foreignKey, DiagnosticChain diagnostics, Map context) {
		return foreignKey.validateKeyColumnsSequence(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumn(ForeignKeyColumn foreignKeyColumn, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKeyColumn_validateOwnColumn(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKeyColumn_validateForeignColumn(foreignKeyColumn, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKeyColumn_validateColumnDataTypes(foreignKeyColumn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOwnColumn constraint of '<em>Foreign Key Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumn_validateOwnColumn(ForeignKeyColumn foreignKeyColumn, DiagnosticChain diagnostics, Map context) {
		return foreignKeyColumn.validateOwnColumn(diagnostics, context);
	}

	/**
	 * Validates the validateForeignColumn constraint of '<em>Foreign Key Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumn_validateForeignColumn(ForeignKeyColumn foreignKeyColumn, DiagnosticChain diagnostics, Map context) {
		return foreignKeyColumn.validateForeignColumn(diagnostics, context);
	}

	/**
	 * Validates the validateColumnDataTypes constraint of '<em>Foreign Key Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumn_validateColumnDataTypes(ForeignKeyColumn foreignKeyColumn, DiagnosticChain diagnostics, Map context) {
		return foreignKeyColumn.validateColumnDataTypes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(view, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(view, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(view, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewColumn(ViewColumn viewColumn, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(viewColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(join, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConModelClass(ConModelClass conModelClass, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(conModelClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNamedElement(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_validateUniqueColumnNames(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_validateUniqueForeignKeyNames(table, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUniqueColumnNames constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_validateUniqueColumnNames(Table table, DiagnosticChain diagnostics, Map context) {
		return table.validateUniqueColumnNames(diagnostics, context);
	}

	/**
	 * Validates the validateUniqueForeignKeyNames constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_validateUniqueForeignKeyNames(Table table, DiagnosticChain diagnostics, Map context) {
		return table.validateUniqueForeignKeyNames(diagnostics, context);
	}

} //RdbmsValidator
