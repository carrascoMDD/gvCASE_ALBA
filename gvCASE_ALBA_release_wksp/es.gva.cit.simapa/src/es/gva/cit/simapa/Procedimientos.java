
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedimientos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Procedimientos#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimientos#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getProcedimientos()
 * @model
 * @generated
 */
public interface Procedimientos extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimientos_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getProcedimientos
	 * @model opposite="procedimientos" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimientos_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getProcedimientos
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="procedimientos" containment="true"
	 * @generated
	 */
	EList getProcedimientos();

} // Procedimientos