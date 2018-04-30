
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
 * A representation of the model object '<em><b>CProveedores Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CProveedoresServicios#getProveedoresServicios <em>Proveedores Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CProveedoresServicios#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProveedoresServicios()
 * @model
 * @generated
 */
public interface CProveedoresServicios extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Proveedores Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ProveedorServicios}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ProveedorServicios#getProveedoresServicios <em>Proveedores Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proveedores Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedores Servicios</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProveedoresServicios_ProveedoresServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.ProveedorServicios#getProveedoresServicios
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ProveedorServicios" opposite="proveedoresServicios" containment="true"
	 * @generated
	 */
	EList getProveedoresServicios();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getProveedoresServicios <em>Proveedores Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see #setRepositorio(ARepositorio)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProveedoresServicios_Repositorio()
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getProveedoresServicios
	 * @model opposite="proveedoresServicios" required="true"
	 * @generated
	 */
	ARepositorio getRepositorio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CProveedoresServicios#getRepositorio <em>Repositorio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositorio</em>' container reference.
	 * @see #getRepositorio()
	 * @generated
	 */
	void setRepositorio(ARepositorio value);

} // CProveedoresServicios