
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
 * A representation of the model object '<em><b>Estructura Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getMiembroRelaciones <em>Miembro Relaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEntradasOSalidas <em>Entradas OSalidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructuraDatosDeSuceso <em>Estructura Datos De Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getColeccionEstructuraDatosDeSuceso <em>Coleccion Estructura Datos De Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos()
 * @model
 * @generated
 */
public interface EstructuraDatos extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_Etiqueta()
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Campos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.CampoDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_Campos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CampoDatos#getEstructurasDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.CampoDatos" opposite="estructurasDatos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='estructurasDatos.procedimiento.campos.campos'"
	 * @generated
	 */
	EList getCampos();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ADocumento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_Documentos()
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstructurasDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ADocumento" opposite="estructurasDatos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='estructurasDatos.procedimiento.documentos.documentos'"
	 * @generated
	 */
	EList getDocumentos();

	/**
	 * Returns the value of the '<em><b>Miembro Relaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos <em>Estructura Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miembro Relaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miembro Relaciones</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_MiembroRelaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.MiembroRelacion#getEstructuraDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.MiembroRelacion" opposite="estructuraDatos" changeable="false"
	 * @generated
	 */
	EList getMiembroRelaciones();

	/**
	 * Returns the value of the '<em><b>Entradas OSalidas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas OSalidas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas OSalidas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_EntradasOSalidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getEstructurasDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EntradaOSalida" opposite="estructurasDatos" changeable="false"
	 * @generated
	 */
	EList getEntradasOSalidas();

	/**
	 * Returns the value of the '<em><b>Estructura Datos De Suceso</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Suceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructura Datos De Suceso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructura Datos De Suceso</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_EstructuraDatosDeSuceso()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Suceso" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='coleccionEstructuraDatosDeSuceso.suceso'"
	 * @generated
	 */
	EList getEstructuraDatosDeSuceso();

	/**
	 * Returns the value of the '<em><b>Coleccion Estructura Datos De Suceso</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coleccion Estructura Datos De Suceso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coleccion Estructura Datos De Suceso</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_ColeccionEstructuraDatosDeSuceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEstructurasDatos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso" opposite="estructurasDatos" changeable="false"
	 * @generated
	 */
	EList getColeccionEstructuraDatosDeSuceso();

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' container reference.
	 * @see #setEstructurasDatos(CEstructurasDatos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEstructuraDatos_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos#getEstructurasDatos
	 * @model opposite="estructurasDatos" required="true"
	 * @generated
	 */
	CEstructurasDatos getEstructurasDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEstructurasDatos <em>Estructuras Datos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Datos</em>' container reference.
	 * @see #getEstructurasDatos()
	 * @generated
	 */
	void setEstructurasDatos(CEstructurasDatos value);

} // EstructuraDatos