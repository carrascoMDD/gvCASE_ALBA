
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
 * A representation of the model object '<em><b>Glosario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Glosario#getTerminos <em>Terminos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Glosario#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getGlosario()
 * @model
 * @generated
 */
public interface Glosario extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Terminos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.TerminoGlosario}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.TerminoGlosario#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminos</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getGlosario_Terminos()
	 * @see es.gva.cit.simapa.TerminoGlosario#getGlosario
	 * @model type="es.gva.cit.simapa.TerminoGlosario" opposite="glosario" containment="true"
	 * @generated
	 */
	EList getTerminos();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getGlosario <em>Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getGlosario_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getGlosario
	 * @model opposite="glosario" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // Glosario