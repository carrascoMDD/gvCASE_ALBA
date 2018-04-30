
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
 * A representation of the model object '<em><b>Contenedor Sucesos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos <em>Sucesos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorSucesos()
 * @model abstract="true"
 * @generated
 */
public interface ContenedorSucesos extends EObject {
	/**
	 * Returns the value of the '<em><b>Sucesos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucesos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucesos</em>' containment reference.
	 * @see #setSucesos(CSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorSucesos_Sucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor
	 * @model opposite="contenedor" containment="true"
	 * @generated
	 */
	CSucesos getSucesos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos <em>Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucesos</em>' containment reference.
	 * @see #getSucesos()
	 * @generated
	 */
	void setSucesos(CSucesos value);

} // ContenedorSucesos