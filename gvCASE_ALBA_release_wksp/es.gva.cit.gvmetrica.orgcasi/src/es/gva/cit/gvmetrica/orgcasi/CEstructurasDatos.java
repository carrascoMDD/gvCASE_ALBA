
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
 * A representation of the model object '<em><b>CEstructuras Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatos()
 * @model
 * @generated
 */
public interface CEstructurasDatos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatos_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" opposite="estructurasDatos" containment="true"
	 * @generated
	 */
	EList getEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Contenedor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor</em>' container reference.
	 * @see #setContenedor(ContenedorDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatos_Contenedor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos
	 * @model opposite="estructurasDatos" required="true"
	 * @generated
	 */
	ContenedorDatos getContenedor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor <em>Contenedor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor</em>' container reference.
	 * @see #getContenedor()
	 * @generated
	 */
	void setContenedor(ContenedorDatos value);

} // CEstructurasDatos