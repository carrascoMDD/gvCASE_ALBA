
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
 * A representation of the model object '<em><b>CCampos Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCCamposDatos()
 * @model
 * @generated
 */
public interface CCamposDatos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Campos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.CampoDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCCamposDatos_Campos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.CampoDatos" opposite="campos" containment="true"
	 * @generated
	 */
	EList getCampos();

	/**
	 * Returns the value of the '<em><b>Contenedor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor</em>' container reference.
	 * @see #setContenedor(ContenedorDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCCamposDatos_Contenedor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos
	 * @model opposite="campos" required="true"
	 * @generated
	 */
	ContenedorDatos getContenedor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor <em>Contenedor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor</em>' container reference.
	 * @see #getContenedor()
	 * @generated
	 */
	void setContenedor(ContenedorDatos value);

} // CCamposDatos