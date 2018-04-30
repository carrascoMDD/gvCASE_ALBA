
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
 * A representation of the model object '<em><b>Normativas YLegislaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.NormativasYLegislaciones#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativasYLegislaciones#getNormativas <em>Normativas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getNormativasYLegislaciones()
 * @model
 * @generated
 */
public interface NormativasYLegislaciones extends SimapaCollection {
	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativasYLegislaciones_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getNormativas
	 * @model opposite="normativas" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.NormativaYLegislacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.NormativaYLegislacion#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativasYLegislaciones_Normativas()
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getNormativas
	 * @model type="es.gva.cit.simapa.NormativaYLegislacion" opposite="normativas" containment="true"
	 * @generated
	 */
	EList getNormativas();

} // NormativasYLegislaciones