/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaMedia <em>Etiqueta Media</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getForeignOfKeyColumns <em>Foreign Of Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getOwnOfKeyColumns <em>Own Of Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Etiqueta Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Media</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Media</em>' attribute.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_EtiquetaMedia()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' de \').concat(\r\ntable.etiquetaSimple\r\n)\r\n'"
	 * @generated
	 */
	String getEtiquetaMedia();

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif)\r\n'"
	 * @generated
	 */
	String getEtiquetaSimple();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_Table()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getColumns
	 * @model opposite="columns" required="true" changeable="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Foreign Of Key Columns</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn <em>Foreign Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Of Key Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Of Key Columns</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_ForeignOfKeyColumns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getForeignColumn
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn" opposite="foreignColumn" changeable="false"
	 * @generated
	 */
	EList getForeignOfKeyColumns();

	/**
	 * Returns the value of the '<em><b>Own Of Key Columns</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn <em>Own Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Of Key Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Of Key Columns</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_OwnOfKeyColumns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn#getOwnColumn
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn" opposite="ownColumn" changeable="false"
	 * @generated
	 */
	EList getOwnOfKeyColumns();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_DataType()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType#getColumns
	 * @model opposite="columns" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='table.schema.dataTypes'"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_PrimaryKey()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey#getColumns
	 * @model opposite="columns"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Join}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getColumn_Joins()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join#getColumns
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Join" opposite="columns" changeable="false"
	 * @generated
	 */
	EList getJoins();

} // Column