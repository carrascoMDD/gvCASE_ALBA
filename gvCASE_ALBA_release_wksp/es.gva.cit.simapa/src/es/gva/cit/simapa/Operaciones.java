
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
 * A representation of the model object '<em><b>Operaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Operaciones#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operaciones#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getOperaciones()
 * @model
 * @generated
 */
public interface Operaciones extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperaciones_Procedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getOperaciones
	 * @model opposite="operaciones" required="true" changeable="false"
	 * @generated
	 */
	Procedimiento getProcedimiento();

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Operacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperaciones_Operaciones()
	 * @see es.gva.cit.simapa.Operacion#getOperaciones
	 * @model type="es.gva.cit.simapa.Operacion" opposite="operaciones" containment="true"
	 * @generated
	 */
	EList getOperaciones();

} // Operaciones