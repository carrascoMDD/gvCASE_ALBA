/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getKey <em>Key</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn <em>Foreign Column</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn <em>Own Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKeyColumn()
 * @model
 * @generated
 */
public interface ForeignKeyColumn extends Element {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKeyColumn_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\'Own \'.concat( if ownColumn->isEmpty() then \'?\' else ownColumn.etiquetaSimple endif).concat(\' Foreign \').concat(\r\n   if foreignColumn->isEmpty() then \'?\' else foreignColumn.etiquetaSimple endif\r\n).concat(\' de \').concat(\r\nkey.etiqueta\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getKeyColumns <em>Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKeyColumn_Key()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKey#getKeyColumns
	 * @model opposite="keyColumns" required="true" changeable="false"
	 * @generated
	 */
	ForeignKey getKey();

	/**
	 * Returns the value of the '<em><b>Foreign Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getForeignOfKeyColumns <em>Foreign Of Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Column</em>' reference.
	 * @see #setForeignColumn(Column)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKeyColumn_ForeignColumn()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getForeignOfKeyColumns
	 * @model opposite="foreignOfKeyColumns" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='key.primaryKey.columns'"
	 * @generated
	 */
	Column getForeignColumn();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn <em>Foreign Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Column</em>' reference.
	 * @see #getForeignColumn()
	 * @generated
	 */
	void setForeignColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Own Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getOwnOfKeyColumns <em>Own Of Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Column</em>' reference.
	 * @see #setOwnColumn(Column)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getForeignKeyColumn_OwnColumn()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getOwnOfKeyColumns
	 * @model opposite="ownOfKeyColumns" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='key.table.columns'"
	 * @generated
	 */
	Column getOwnColumn();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn <em>Own Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own Column</em>' reference.
	 * @see #getOwnColumn()
	 * @generated
	 */
	void setOwnColumn(Column value);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='ownColumn.table = key.table'"
	 * @generated
	 */
	boolean validateOwnColumn(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='foreignColumn.primaryKey = key.primaryKey'"
	 * @generated
	 */
	boolean validateForeignColumn(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='ownColumn.dataType = foreignColumn.dataType'"
	 * @generated
	 */
	boolean validateColumnDataTypes(DiagnosticChain diagnostics, Map context);

} // ForeignKeyColumn