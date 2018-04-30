
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
 * A representation of the model object '<em><b>Contenedor Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDatos()
 * @model
 * @generated
 */
public interface ContenedorDatos extends EObject {
	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' containment reference.
	 * @see #setEstructurasDatos(CEstructurasDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDatos_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getContenedor
	 * @model opposite="contenedor" containment="true" required="true"
	 * @generated
	 */
	CEstructurasDatos getEstructurasDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getEstructurasDatos <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Datos</em>' containment reference.
	 * @see #getEstructurasDatos()
	 * @generated
	 */
	void setEstructurasDatos(CEstructurasDatos value);

	/**
	 * Returns the value of the '<em><b>Campos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' containment reference.
	 * @see #setCampos(CCamposDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDatos_Campos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getContenedor
	 * @model opposite="contenedor" containment="true" required="true"
	 * @generated
	 */
	CCamposDatos getCampos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getCampos <em>Campos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campos</em>' containment reference.
	 * @see #getCampos()
	 * @generated
	 */
	void setCampos(CCamposDatos value);

	/**
	 * Returns the value of the '<em><b>Relaciones Datos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Datos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Datos</em>' containment reference.
	 * @see #setRelacionesDatos(CRelacionesDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getContenedorDatos_RelacionesDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getContenedor
	 * @model opposite="contenedor" containment="true" required="true"
	 * @generated
	 */
	CRelacionesDatos getRelacionesDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorDatos#getRelacionesDatos <em>Relaciones Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaciones Datos</em>' containment reference.
	 * @see #getRelacionesDatos()
	 * @generated
	 */
	void setRelacionesDatos(CRelacionesDatos value);

} // ContenedorDatos