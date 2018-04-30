
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
 * A representation of the model object '<em><b>CServicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz <em>Interfaz</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getServicios <em>Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicios()
 * @model
 * @generated
 */
public interface CServicios extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Interfaz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaz</em>' container reference.
	 * @see #setInterfaz(Interfaz)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicios_Interfaz()
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios
	 * @model opposite="servicios" required="true"
	 * @generated
	 */
	Interfaz getInterfaz();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz <em>Interfaz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaz</em>' container reference.
	 * @see #getInterfaz()
	 * @generated
	 */
	void setInterfaz(Interfaz value);

	/**
	 * Returns the value of the '<em><b>Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Servicio}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicios_Servicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Servicio" opposite="servicios" containment="true"
	 * @generated
	 */
	EList getServicios();

} // CServicios