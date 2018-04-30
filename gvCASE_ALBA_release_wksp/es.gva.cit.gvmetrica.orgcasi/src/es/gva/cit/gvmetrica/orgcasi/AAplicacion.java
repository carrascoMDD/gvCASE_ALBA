
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Aplicacion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AAplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicacion <em>Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAAplicacion()
 * @model
 * @generated
 */
public interface AAplicacion extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAAplicacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if aplicacion->isEmpty() then \'?\' else aplicacion.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Aplicacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicacion</em>' reference.
	 * @see #setAplicacion(Aplicacion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAAplicacion_Aplicacion()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='aplicaciones.procedimiento.procedimiento.aplicaciones'"
	 * @generated
	 */
	Aplicacion getAplicacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicacion <em>Aplicacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aplicacion</em>' reference.
	 * @see #getAplicacion()
	 * @generated
	 */
	void setAplicacion(Aplicacion value);

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' container reference.
	 * @see #setAplicaciones(CAplicaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAAplicacion_Aplicaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getAplicaciones
	 * @model opposite="aplicaciones" required="true"
	 * @generated
	 */
	CAplicaciones getAplicaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones <em>Aplicaciones</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aplicaciones</em>' container reference.
	 * @see #getAplicaciones()
	 * @generated
	 */
	void setAplicaciones(CAplicaciones value);

} // AAplicacion