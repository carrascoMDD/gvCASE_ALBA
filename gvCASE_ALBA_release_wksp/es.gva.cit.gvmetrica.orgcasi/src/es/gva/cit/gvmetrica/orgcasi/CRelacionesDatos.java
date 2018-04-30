
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
 * A representation of the model object '<em><b>CRelaciones Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCRelacionesDatos()
 * @model
 * @generated
 */
public interface CRelacionesDatos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Relaciones Datos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Datos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Datos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCRelacionesDatos_RelacionesDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.RelacionDatos" opposite="relacionesDatos" containment="true"
	 * @generated
	 */
	EList getRelacionesDatos();

	/**
	 * Returns the value of the '<em><b>Contenedor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor</em>' container reference.
	 * @see #setContenedor(ContenedorDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCRelacionesDatos_Contenedor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos
	 * @model opposite="relacionesDatos" required="true"
	 * @generated
	 */
	ContenedorDatos getContenedor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor <em>Contenedor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor</em>' container reference.
	 * @see #getContenedor()
	 * @generated
	 */
	void setContenedor(ContenedorDatos value);

} // CRelacionesDatos