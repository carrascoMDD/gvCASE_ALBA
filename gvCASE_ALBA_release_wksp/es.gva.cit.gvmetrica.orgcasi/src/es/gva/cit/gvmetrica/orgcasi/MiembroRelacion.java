
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
 * A representation of the model object '<em><b>Miembro Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getTipoRelacion <em>Tipo Relacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMinima <em>Multiplicidad Minima</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMaxima <em>Multiplicidad Maxima</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos <em>Estructura Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion <em>Relacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion()
 * @model
 * @generated
 */
public interface MiembroRelacion extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat(\' \').concat(\r\nif estructuraDatos->isEmpty() then \'?\' else estructuraDatos.etiqueta endif)\r\n\r\n'"
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Relacion</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.orgcasi.TipoRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Relacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Relacion</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoRelacion
	 * @see #setTipoRelacion(TipoRelacion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_TipoRelacion()
	 * @model
	 * @generated
	 */
	TipoRelacion getTipoRelacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getTipoRelacion <em>Tipo Relacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Relacion</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoRelacion
	 * @see #getTipoRelacion()
	 * @generated
	 */
	void setTipoRelacion(TipoRelacion value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Minima</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Minima</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Minima</em>' attribute.
	 * @see #setMultiplicidadMinima(Integer)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_MultiplicidadMinima()
	 * @model default="0"
	 * @generated
	 */
	Integer getMultiplicidadMinima();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMinima <em>Multiplicidad Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Minima</em>' attribute.
	 * @see #getMultiplicidadMinima()
	 * @generated
	 */
	void setMultiplicidadMinima(Integer value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Maxima</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Maxima</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Maxima</em>' attribute.
	 * @see #setMultiplicidadMaxima(Integer)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_MultiplicidadMaxima()
	 * @model default="-1"
	 * @generated
	 */
	Integer getMultiplicidadMaxima();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getMultiplicidadMaxima <em>Multiplicidad Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Maxima</em>' attribute.
	 * @see #getMultiplicidadMaxima()
	 * @generated
	 */
	void setMultiplicidadMaxima(Integer value);

	/**
	 * Returns the value of the '<em><b>Estructura Datos</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getMiembroRelaciones <em>Miembro Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructura Datos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructura Datos</em>' reference.
	 * @see #setEstructuraDatos(EstructuraDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_EstructuraDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getMiembroRelaciones
	 * @model opposite="miembroRelaciones" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='relacion.relacionesDatos.procedimiento.estructurasDatos.estructurasDatos'"
	 * @generated
	 */
	EstructuraDatos getEstructuraDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos <em>Estructura Datos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructura Datos</em>' reference.
	 * @see #getEstructuraDatos()
	 * @generated
	 */
	void setEstructuraDatos(EstructuraDatos value);

	/**
	 * Returns the value of the '<em><b>Relacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getMiembros <em>Miembros</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion</em>' container reference.
	 * @see #setRelacion(RelacionDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getMiembroRelacion_Relacion()
	 * @see es.gva.cit.gvmetrica.orgcasi.RelacionDatos#getMiembros
	 * @model opposite="miembros" required="true"
	 * @generated
	 */
	RelacionDatos getRelacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getRelacion <em>Relacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion</em>' container reference.
	 * @see #getRelacion()
	 * @generated
	 */
	void setRelacion(RelacionDatos value);

} // MiembroRelacion