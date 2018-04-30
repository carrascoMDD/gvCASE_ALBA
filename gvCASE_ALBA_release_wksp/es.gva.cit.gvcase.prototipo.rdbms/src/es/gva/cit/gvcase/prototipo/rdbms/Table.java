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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getSchema <em>Schema</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif)'"
	 * @generated
	 */
	String getEtiquetaSimple();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_Schema()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getTables
	 * @model opposite="tables" required="true" changeable="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Column}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_Columns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getTable
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Column" opposite="table" containment="true" required="true"
	 * @generated
	 */
	EList getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_PrimaryKey()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getTable
	 * @model opposite="table" containment="true" required="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getTable_ForeignKeys()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getTable
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ForeignKey" opposite="table" containment="true"
	 * @generated
	 */
	EList getForeignKeys();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='columns->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)'"
	 * @generated
	 */
	boolean validateUniqueColumnNames(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='foreignKeys->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)'"
	 * @generated
	 */
	boolean validateUniqueForeignKeyNames(DiagnosticChain diagnostics, Map context);

} // Table