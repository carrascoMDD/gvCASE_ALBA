
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perfil Participante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipaciones <em>Participaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipantes <em>Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilParticipante()
 * @model
 * @generated
 */
public interface PerfilParticipante extends ProinsoObject, ConDocumentacion, Referenciable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilParticipante_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Participaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Participacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participaciones</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilParticipante_Participaciones()
	 * @see es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante
	 * @model type="es.gva.cit.gvmetrica.proinso.Participacion" opposite="perfilParticipante" changeable="false"
	 * @generated
	 */
	EList getParticipaciones();

	/**
	 * Returns the value of the '<em><b>Participantes</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Participante}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Participante#getPerfilParticipante <em>Perfil Participante</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participantes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participantes</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilParticipante_Participantes()
	 * @see es.gva.cit.gvmetrica.proinso.Participante#getPerfilParticipante
	 * @model type="es.gva.cit.gvmetrica.proinso.Participante" opposite="perfilParticipante" containment="true"
	 * @generated
	 */
	EList getParticipantes();

	/**
	 * Returns the value of the '<em><b>Perfiles Participantes</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getPerfilesParticipantes <em>Perfiles Participantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfiles Participantes</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfiles Participantes</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPerfilParticipante_PerfilesParticipantes()
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getPerfilesParticipantes
	 * @model opposite="perfilesParticipantes" required="true" changeable="false"
	 * @generated
	 */
	PerfilesParticipantes getPerfilesParticipantes();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='nombre.size() > 0 '"
	 * @generated
	 */
	boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext);

} // PerfilParticipante