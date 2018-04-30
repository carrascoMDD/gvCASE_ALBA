
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procesos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Procesos#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Procesos#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProcesos()
 * @model
 * @generated
 */
public interface Procesos extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Procesos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Proceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Proceso#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procesos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProcesos_Procesos()
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getProcesos
	 * @model type="es.gva.cit.gvmetrica.proinso.Proceso" opposite="procesos" containment="true"
	 * @generated
	 */
	EList getProcesos();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProcesos_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos
	 * @model opposite="procesos" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // Procesos