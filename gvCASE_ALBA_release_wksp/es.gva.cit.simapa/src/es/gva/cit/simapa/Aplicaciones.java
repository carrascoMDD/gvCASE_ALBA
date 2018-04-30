
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
 * A representation of the model object '<em><b>Aplicaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Aplicaciones#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicaciones#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getAplicaciones()
 * @model
 * @generated
 */
public interface Aplicaciones extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Aplicacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Aplicacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicaciones_Aplicaciones()
	 * @see es.gva.cit.simapa.Aplicacion#getAplicaciones
	 * @model type="es.gva.cit.simapa.Aplicacion" opposite="aplicaciones" containment="true"
	 * @generated
	 */
	EList getAplicaciones();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicaciones_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getAplicaciones
	 * @model opposite="aplicaciones" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // Aplicaciones