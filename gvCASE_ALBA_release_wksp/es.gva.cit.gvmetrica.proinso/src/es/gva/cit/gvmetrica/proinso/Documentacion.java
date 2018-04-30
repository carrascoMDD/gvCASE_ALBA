
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
 * A representation of the model object '<em><b>Documentacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Documentacion#getDocumentado <em>Documentado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Documentacion#getParrafos <em>Parrafos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getDocumentacion()
 * @model
 * @generated
 */
public interface Documentacion extends ProinsoObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Documentado</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentado</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentado</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getDocumentacion_Documentado()
	 * @see es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion
	 * @model opposite="documentacion" changeable="false"
	 * @generated
	 */
	ConDocumentacion getDocumentado();

	/**
	 * Returns the value of the '<em><b>Parrafos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Parrafo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parrafos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parrafos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getDocumentacion_Parrafos()
	 * @see es.gva.cit.gvmetrica.proinso.Parrafo#getDocumentacion
	 * @model type="es.gva.cit.gvmetrica.proinso.Parrafo" opposite="documentacion" containment="true"
	 * @generated
	 */
	EList getParrafos();

} // Documentacion