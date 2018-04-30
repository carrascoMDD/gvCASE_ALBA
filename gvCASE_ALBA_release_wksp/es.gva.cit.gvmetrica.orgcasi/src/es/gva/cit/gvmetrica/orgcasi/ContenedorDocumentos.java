
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
 * A representation of the model object '<em><b>Contenedor Documentos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDocumentos()
 * @model abstract="true"
 * @generated
 */
public interface ContenedorDocumentos extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' containment reference.
	 * @see #setDocumentos(CDocumentos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDocumentos_Documentos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos#getContenedor
	 * @model opposite="contenedor" containment="true" required="true"
	 * @generated
	 */
	CDocumentos getDocumentos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos#getDocumentos <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentos</em>' containment reference.
	 * @see #getDocumentos()
	 * @generated
	 */
	void setDocumentos(CDocumentos value);

} // ContenedorDocumentos