
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
 * A representation of the model object '<em><b>CInterfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCInterfaces()
 * @model
 * @generated
 */
public interface CInterfaces extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Interfaz}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCInterfaces_Interfaces()
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Interfaz" opposite="interfaces" containment="true"
	 * @generated
	 */
	EList getInterfaces();

	/**
	 * Returns the value of the '<em><b>Libreria Servicios</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria Servicios</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria Servicios</em>' container reference.
	 * @see #setLibreriaServicios(LibreriaServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCInterfaces_LibreriaServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces
	 * @model opposite="interfaces" required="true"
	 * @generated
	 */
	LibreriaServicios getLibreriaServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios <em>Libreria Servicios</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libreria Servicios</em>' container reference.
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	void setLibreriaServicios(LibreriaServicios value);

} // CInterfaces