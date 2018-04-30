
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
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getColumns <em>Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Join#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Element {
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
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getJoin_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if columns->isEmpty() then \'? = ?\' else\r\n(\r\n  if columns->size()< 2 then\r\n\tcolumns->at(1).etiquetaMedia.concat( \' = ?\')\r\n  else\r\n\tcolumns->at(1).etiquetaMedia.concat( \' = \').concat(columns->at(2).etiquetaMedia)\r\n  endif\r\n)\r\nendif\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Column}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Column#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getJoin_Columns()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Column#getJoins
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Column" opposite="joins" lower="2" upper="2"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='view.tables.columns'"
	 * @generated
	 */
	EList getColumns();

	/**
	 * Returns the value of the '<em><b>View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' container reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getJoin_View()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getJoins
	 * @model opposite="joins" required="true" changeable="false"
	 * @generated
	 */
	View getView();

} // Join