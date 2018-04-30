
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documento En Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getCondicionesEstado <em>Condiciones Estado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase <em>Documento Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getDocumentoEnEstado()
 * @model
 * @generated
 */
public interface DocumentoEnEstado extends ADocumento {
	/**
	 * Returns the value of the '<em><b>Condiciones Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condiciones Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condiciones Estado</em>' attribute.
	 * @see #setCondicionesEstado(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getDocumentoEnEstado_CondicionesEstado()
	 * @model
	 * @generated
	 */
	String getCondicionesEstado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getCondicionesEstado <em>Condiciones Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condiciones Estado</em>' attribute.
	 * @see #getCondicionesEstado()
	 * @generated
	 */
	void setCondicionesEstado(String value);

	/**
	 * Returns the value of the '<em><b>Documento Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstados <em>Estados</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento Base</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento Base</em>' container reference.
	 * @see #setDocumentoBase(ADocumento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getDocumentoEnEstado_DocumentoBase()
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstados
	 * @model opposite="estados" required="true"
	 * @generated
	 */
	ADocumento getDocumentoBase();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase <em>Documento Base</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento Base</em>' container reference.
	 * @see #getDocumentoBase()
	 * @generated
	 */
	void setDocumentoBase(ADocumento value);

} // DocumentoEnEstado