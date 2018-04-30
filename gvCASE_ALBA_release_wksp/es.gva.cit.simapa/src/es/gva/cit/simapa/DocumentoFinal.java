
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documento Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.DocumentoFinal#getDocumento <em>Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getDocumentoFinal()
 * @model abstract="true"
 * @generated
 */
public interface DocumentoFinal extends Operacion {
	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documento#getDocumentosFinales <em>Documentos Finales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference.
	 * @see #setDocumento(Documento)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumentoFinal_Documento()
	 * @see es.gva.cit.simapa.Documento#getDocumentosFinales
	 * @model opposite="documentosFinales" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='operaciones.procedimiento.documentos'"
	 * @generated
	 */
	Documento getDocumento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.DocumentoFinal#getDocumento <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(Documento value);

} // DocumentoFinal