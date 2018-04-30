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
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getColumns <em>Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getPrimaryKeyOfForeignKeys <em>Primary Key Of Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends NamedElement {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getPrimaryKey_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getPrimaryKey_Table()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getPrimaryKey
	 * @model opposite="primaryKey" required="true" changeable="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Column}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getPrimaryKey_Columns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Column" opposite="primaryKey" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='table.columns->reject(aC | columns->includes(aC))'"
	 * @generated
	 */
	EList getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key Of Foreign Keys</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Of Foreign Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Of Foreign Keys</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getPrimaryKey_PrimaryKeyOfForeignKeys()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getPrimaryKey
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ForeignKey" opposite="primaryKey" changeable="false"
	 * @generated
	 */
	EList getPrimaryKeyOfForeignKeys();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='columns->forAll( aKeyCol | aKeyCol.table = table)'"
	 * @generated
	 */
	boolean validatePrimaryKeyColumnsTable(DiagnosticChain diagnostics, Map context);

} // PrimaryKey