
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
 * A representation of the model object '<em><b>Tecnicas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnicas()
 * @model
 * @generated
 */
public interface Tecnicas extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Tecnicas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Tecnica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnicas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnicas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnicas_Tecnicas()
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica#getTecnicas
	 * @model type="es.gva.cit.gvmetrica.proinso.Tecnica" opposite="tecnicas" containment="true"
	 * @generated
	 */
	EList getTecnicas();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnicas_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas
	 * @model opposite="tecnicas" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // Tecnicas