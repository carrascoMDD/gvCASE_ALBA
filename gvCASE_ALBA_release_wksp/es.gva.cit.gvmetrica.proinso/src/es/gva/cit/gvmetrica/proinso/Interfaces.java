
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaces#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaces#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaces()
 * @model
 * @generated
 */
public interface Interfaces extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Interfaz}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaces_Interfaces()
	 * @see es.gva.cit.gvmetrica.proinso.Interfaz#getInterfaces
	 * @model type="es.gva.cit.gvmetrica.proinso.Interfaz" opposite="interfaces" containment="true"
	 * @generated
	 */
	EList getInterfaces();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaces_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces
	 * @model opposite="interfaces" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // Interfaces