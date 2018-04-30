
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
 * A representation of the model object '<em><b>Relacion Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getMiembros <em>Miembros</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos()
 * @model
 * @generated
 */
public interface RelacionDatos extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comentario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comentario</em>' attribute.
	 * @see #setComentario(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Miembros</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miembros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miembros</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos_Miembros()
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion
	 * @model type="es.gva.cit.gvmetrica.orgcasi.MiembroRelacion" opposite="relacion" containment="true" lower="2"
	 * @generated
	 */
	EList getMiembros();

	/**
	 * Returns the value of the '<em><b>Relaciones Datos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getRelacionesDatos <em>Relaciones Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Datos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Datos</em>' container reference.
	 * @see #setRelacionesDatos(CRelacionesDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRelacionDatos_RelacionesDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos#getRelacionesDatos
	 * @model opposite="relacionesDatos" required="true"
	 * @generated
	 */
	CRelacionesDatos getRelacionesDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getRelacionesDatos <em>Relaciones Datos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaciones Datos</em>' container reference.
	 * @see #getRelacionesDatos()
	 * @generated
	 */
	void setRelacionesDatos(CRelacionesDatos value);

} // RelacionDatos