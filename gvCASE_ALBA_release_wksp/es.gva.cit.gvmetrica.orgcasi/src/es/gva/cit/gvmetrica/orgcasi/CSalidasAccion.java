
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSalidas Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasAccion()
 * @model
 * @generated
 */
public interface CSalidasAccion extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Accion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' container reference.
	 * @see #setAccion(Accion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasAccion_Accion()
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas
	 * @model opposite="salidas" required="true"
	 * @generated
	 */
	Accion getAccion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion <em>Accion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accion</em>' container reference.
	 * @see #getAccion()
	 * @generated
	 */
	void setAccion(Accion value);

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasAccion_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.SalidaAccion" opposite="salidas" containment="true"
	 * @generated
	 */
	EList getSalidas();

} // CSalidasAccion