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
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getColumns <em>Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends NamedElement {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getDataType_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Column}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getDataType_Columns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getDataType
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Column" opposite="dataType" changeable="false"
	 * @generated
	 */
	EList getColumns();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getDataType_Schema()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getDataTypes
	 * @model opposite="dataTypes" required="true" changeable="false"
	 * @generated
	 */
	Schema getSchema();

} // DataType