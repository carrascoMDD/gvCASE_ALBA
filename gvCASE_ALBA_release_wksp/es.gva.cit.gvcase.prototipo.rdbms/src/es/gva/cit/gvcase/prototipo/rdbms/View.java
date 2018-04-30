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
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getSchema <em>Schema</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getTables <em>Tables</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getViewColumns <em>View Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.View#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedElement {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if name->isEmpty() or name.size() < 1 then \'?\' else name endif).concat( \' en \').concat(\r\nschema.etiqueta\r\n)\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_Schema()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Schema#getViews
	 * @model opposite="views" required="true" changeable="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_Tables()
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Table" required="true"
	 * @generated
	 */
	EList getTables();

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' attribute.
	 * @see #setWhereClause(String)
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_WhereClause()
	 * @model required="true"
	 * @generated
	 */
	String getWhereClause();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getWhereClause <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' attribute.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(String value);

	/**
	 * Returns the value of the '<em><b>View Columns</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Columns</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_ViewColumns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.ViewColumn#getView
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.ViewColumn" opposite="view" containment="true"
	 * @generated
	 */
	EList getViewColumns();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Join}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getView_Joins()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Join#getView
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Join" opposite="view" containment="true"
	 * @generated
	 */
	EList getJoins();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int createViewColumns();

} // View