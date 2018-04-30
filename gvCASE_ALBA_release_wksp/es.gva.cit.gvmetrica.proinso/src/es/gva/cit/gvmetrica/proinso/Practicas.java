
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
 * A representation of the model object '<em><b>Practicas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Practicas#getPracticas <em>Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Practicas#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPracticas()
 * @model
 * @generated
 */
public interface Practicas extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Practicas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Practica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Practica#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practicas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practicas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPracticas_Practicas()
	 * @see es.gva.cit.gvmetrica.proinso.Practica#getPracticas
	 * @model type="es.gva.cit.gvmetrica.proinso.Practica" opposite="practicas" containment="true"
	 * @generated
	 */
	EList getPracticas();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPracticas_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas
	 * @model opposite="practicas" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // Practicas