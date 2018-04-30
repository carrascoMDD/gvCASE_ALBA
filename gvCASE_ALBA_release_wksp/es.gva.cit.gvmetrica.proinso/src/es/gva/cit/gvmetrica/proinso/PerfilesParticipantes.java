
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
 * A representation of the model object '<em><b>Perfiles Participantes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilesParticipantes()
 * @model
 * @generated
 */
public interface PerfilesParticipantes extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Perfiles Participantes</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.PerfilParticipante}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfiles Participantes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfiles Participantes</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilesParticipantes_PerfilesParticipantes()
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getPerfilesParticipantes
	 * @model type="es.gva.cit.gvmetrica.proinso.PerfilParticipante" opposite="perfilesParticipantes" containment="true"
	 * @generated
	 */
	EList getPerfilesParticipantes();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilesParticipantes_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes
	 * @model opposite="perfilesParticipantes" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // PerfilesParticipantes