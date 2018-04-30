
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
 * A representation of the model object '<em><b>Contenedor Unidad Organica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.ContenedorUnidadOrganica#getDescomposicion <em>Descomposicion</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getContenedorUnidadOrganica()
 * @model abstract="true"
 * @generated
 */
public interface ContenedorUnidadOrganica extends EObject {
	/**
	 * Returns the value of the '<em><b>Descomposicion</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.UnidadOrganica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.UnidadOrganica#getDescompone <em>Descompone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descomposicion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descomposicion</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getContenedorUnidadOrganica_Descomposicion()
	 * @see es.gva.cit.simapa.UnidadOrganica#getDescompone
	 * @model type="es.gva.cit.simapa.UnidadOrganica" opposite="descompone" containment="true"
	 * @generated
	 */
	EList getDescomposicion();

} // ContenedorUnidadOrganica