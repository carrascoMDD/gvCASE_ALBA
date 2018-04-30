
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Servicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio <em>Servicio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoServicio()
 * @model
 * @generated
 */
public interface UsoServicio extends Accion {
	/**
	 * Returns the value of the '<em><b>Servicio</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getUsosServicio <em>Usos Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicio</em>' reference.
	 * @see #setServicio(CServicioUsadoPorSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoServicio_Servicio()
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getUsosServicio
	 * @model opposite="usosServicio" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='acciones.suceso.procedimiento.importacionesServicios.importacionesServicios.libreriaServicios.libreriaServicios.interfaces.interfaces.servicios.servicios.usadoPorSucesos'"
	 * @generated
	 */
	CServicioUsadoPorSucesos getServicio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(CServicioUsadoPorSucesos value);

} // UsoServicio