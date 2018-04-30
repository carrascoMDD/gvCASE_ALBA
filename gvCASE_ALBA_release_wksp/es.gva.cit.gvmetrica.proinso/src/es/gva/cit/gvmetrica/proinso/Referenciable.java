
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenciable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Referenciable#getReferencias <em>Referencias</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getReferenciable()
 * @model abstract="true"
 * @generated
 */
public interface Referenciable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Referencias</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.ReferenceRun}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado <em>Referenciado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencias</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getReferenciable_Referencias()
	 * @see es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado
	 * @model type="es.gva.cit.gvmetrica.proinso.ReferenceRun" opposite="referenciado" changeable="false"
	 * @generated
	 */
	EList getReferencias();

} // Referenciable