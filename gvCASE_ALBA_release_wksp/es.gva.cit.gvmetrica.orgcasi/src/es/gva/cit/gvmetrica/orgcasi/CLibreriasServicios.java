
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLibrerias Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCLibreriasServicios()
 * @model
 * @generated
 */
public interface CLibreriasServicios extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Librerias Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librerias Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librerias Servicios</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCLibreriasServicios_LibreriasServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios
	 * @model type="es.gva.cit.gvmetrica.orgcasi.LibreriaServicios" opposite="libreriasServicios" containment="true"
	 * @generated
	 */
	EList getLibreriasServicios();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see #setRepositorio(ARepositorio)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCLibreriasServicios_Repositorio()
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios
	 * @model opposite="libreriasServicios" required="true"
	 * @generated
	 */
	ARepositorio getRepositorio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio <em>Repositorio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositorio</em>' container reference.
	 * @see #getRepositorio()
	 * @generated
	 */
	void setRepositorio(ARepositorio value);

} // CLibreriasServicios