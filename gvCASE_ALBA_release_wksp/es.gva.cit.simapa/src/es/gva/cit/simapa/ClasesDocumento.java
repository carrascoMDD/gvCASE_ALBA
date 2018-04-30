
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
 * A representation of the model object '<em><b>Clases Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.ClasesDocumento#getClasesDocumento <em>Clases Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClasesDocumento#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getClasesDocumento()
 * @model
 * @generated
 */
public interface ClasesDocumento extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Clases Documento</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.ClaseDocumento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ClaseDocumento#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases Documento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases Documento</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getClasesDocumento_ClasesDocumento()
	 * @see es.gva.cit.simapa.ClaseDocumento#getClasesDocumento
	 * @model type="es.gva.cit.simapa.ClaseDocumento" opposite="clasesDocumento" containment="true"
	 * @generated
	 */
	EList getClasesDocumento();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getClasesDocumento_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getClasesDocumento
	 * @model opposite="clasesDocumento" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // ClasesDocumento