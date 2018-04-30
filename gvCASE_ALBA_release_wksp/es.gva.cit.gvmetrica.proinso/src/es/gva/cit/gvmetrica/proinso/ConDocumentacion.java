
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Con Documentacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion <em>Documentacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getConDocumentacion()
 * @model abstract="true"
 * @generated
 */
public interface ConDocumentacion extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Documentacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Documentacion#getDocumentado <em>Documentado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentacion</em>' containment reference.
	 * @see #setDocumentacion(Documentacion)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getConDocumentacion_Documentacion()
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion#getDocumentado
	 * @model opposite="documentado" containment="true"
	 * @generated
	 */
	Documentacion getDocumentacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.ConDocumentacion#getDocumentacion <em>Documentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentacion</em>' containment reference.
	 * @see #getDocumentacion()
	 * @generated
	 */
	void setDocumentacion(Documentacion value);

} // ConDocumentacion