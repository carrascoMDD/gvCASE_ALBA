
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
 * A representation of the model object '<em><b>Campo Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getTipo <em>Tipo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFormato <em>Formato</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEjemplo <em>Ejemplo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRequerido <em>Requerido</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getValorPorDefecto <em>Valor Por Defecto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRango <em>Rango</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRangoRazonable <em>Rango Razonable</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFuenteDatos <em>Fuente Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos <em>Campos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos()
 * @model
 * @generated
 */
public interface CampoDatos extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Etiqueta()
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Formato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formato</em>' attribute.
	 * @see #setFormato(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Formato()
	 * @model
	 * @generated
	 */
	String getFormato();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFormato <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formato</em>' attribute.
	 * @see #getFormato()
	 * @generated
	 */
	void setFormato(String value);

	/**
	 * Returns the value of the '<em><b>Ejemplo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejemplo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejemplo</em>' attribute.
	 * @see #setEjemplo(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Ejemplo()
	 * @model
	 * @generated
	 */
	String getEjemplo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEjemplo <em>Ejemplo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejemplo</em>' attribute.
	 * @see #getEjemplo()
	 * @generated
	 */
	void setEjemplo(String value);

	/**
	 * Returns the value of the '<em><b>Requerido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requerido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requerido</em>' attribute.
	 * @see #setRequerido(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Requerido()
	 * @model
	 * @generated
	 */
	String getRequerido();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRequerido <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requerido</em>' attribute.
	 * @see #getRequerido()
	 * @generated
	 */
	void setRequerido(String value);

	/**
	 * Returns the value of the '<em><b>Valor Por Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Por Defecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Por Defecto</em>' attribute.
	 * @see #setValorPorDefecto(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_ValorPorDefecto()
	 * @model
	 * @generated
	 */
	String getValorPorDefecto();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getValorPorDefecto <em>Valor Por Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Por Defecto</em>' attribute.
	 * @see #getValorPorDefecto()
	 * @generated
	 */
	void setValorPorDefecto(String value);

	/**
	 * Returns the value of the '<em><b>Rango</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rango</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rango</em>' attribute.
	 * @see #setRango(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Rango()
	 * @model
	 * @generated
	 */
	String getRango();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRango <em>Rango</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rango</em>' attribute.
	 * @see #getRango()
	 * @generated
	 */
	void setRango(String value);

	/**
	 * Returns the value of the '<em><b>Rango Razonable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rango Razonable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rango Razonable</em>' attribute.
	 * @see #setRangoRazonable(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_RangoRazonable()
	 * @model
	 * @generated
	 */
	String getRangoRazonable();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getRangoRazonable <em>Rango Razonable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rango Razonable</em>' attribute.
	 * @see #getRangoRazonable()
	 * @generated
	 */
	void setRangoRazonable(String value);

	/**
	 * Returns the value of the '<em><b>Fuente Datos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuente Datos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuente Datos</em>' attribute.
	 * @see #setFuenteDatos(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_FuenteDatos()
	 * @model
	 * @generated
	 */
	String getFuenteDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getFuenteDatos <em>Fuente Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuente Datos</em>' attribute.
	 * @see #getFuenteDatos()
	 * @generated
	 */
	void setFuenteDatos(String value);

	/**
	 * Returns the value of the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observaciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observaciones</em>' attribute.
	 * @see #setObservaciones(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getCampos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" opposite="campos" changeable="false"
	 * @generated
	 */
	EList getEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Campos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' container reference.
	 * @see #setCampos(CCamposDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCampoDatos_Campos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CCamposDatos#getCampos
	 * @model opposite="campos" required="true"
	 * @generated
	 */
	CCamposDatos getCampos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getCampos <em>Campos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campos</em>' container reference.
	 * @see #getCampos()
	 * @generated
	 */
	void setCampos(CCamposDatos value);

} // CampoDatos