/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKey_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKey_KeyColumns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getKey
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn" opposite="key" containment="true" required="true"
	 * @generated
	 */
	EList getKeyColumns();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKey_Table()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getForeignKeys
	 * @model opposite="foreignKeys" required="true" changeable="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getPrimaryKeyOfForeignKeys <em>Primary Key Of Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKey_PrimaryKey()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getPrimaryKeyOfForeignKeys
	 * @model opposite="primaryKeyOfForeignKeys" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='table.schema.tables->asSet()->excluding( table).primaryKey'"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='not (primaryKey.table = table)'"
	 * @generated
	 */
	boolean validatePrimaryKeyTable(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='keyColumns->size() = primaryKey.columns->size()'"
	 * @generated
	 */
	boolean validateKeyColumnsSize(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='Sequence { 1..keyColumns->size() }->forAll(anIndex | anIndex = primaryKey.columns->indexOf( keyColumns->at(anIndex).foreignColumn))'"
	 * @generated
	 */
	boolean validateKeyColumnsSequence(DiagnosticChain diagnostics, Map context);

} // ForeignKey