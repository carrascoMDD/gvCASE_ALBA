
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Documentos#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documentos#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getDocumentos()
 * @model
 * @generated
 */
public interface Documentos extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Documento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumentos_Documentos()
	 * @see es.gva.cit.simapa.Documento#getDocumentos
	 * @model type="es.gva.cit.simapa.Documento" opposite="documentos" containment="true"
	 * @generated
	 */
	EList getDocumentos();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumentos_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getDocumentos
	 * @model opposite="documentos" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // Documentos