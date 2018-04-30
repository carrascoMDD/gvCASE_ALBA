
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas <em>Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorSubsistemas()
 * @model abstract="true"
 * @generated
 */
public interface ContenedorSubsistemas extends EObject {
	/**
	 * Returns the value of the '<em><b>Subsistemas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistemas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistemas</em>' containment reference.
	 * @see #setSubsistemas(CSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorSubsistemas_Subsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor
	 * @model opposite="contenedor" containment="true"
	 * @generated
	 */
	CSubsistemas getSubsistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas <em>Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsistemas</em>' containment reference.
	 * @see #getSubsistemas()
	 * @generated
	 */
	void setSubsistemas(CSubsistemas value);

} // ContenedorSubsistemas