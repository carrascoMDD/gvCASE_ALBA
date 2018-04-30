
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos <em>Usado Por Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios <em>Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getSalidas <em>Salidas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getServicio()
 * @model
 * @generated
 */
public interface Servicio extends Agrupacion {
	/**
	 * Returns the value of the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usado Por Sucesos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usado Por Sucesos</em>' containment reference.
	 * @see #setUsadoPorSucesos(CServicioUsadoPorSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getServicio_UsadoPorSucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio
	 * @model opposite="servicio" containment="true" required="true"
	 * @generated
	 */
	CServicioUsadoPorSucesos getUsadoPorSucesos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos <em>Usado Por Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usado Por Sucesos</em>' containment reference.
	 * @see #getUsadoPorSucesos()
	 * @generated
	 */
	void setUsadoPorSucesos(CServicioUsadoPorSucesos value);

	/**
	 * Returns the value of the '<em><b>Servicios</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios</em>' container reference.
	 * @see #setServicios(CServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getServicio_Servicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios#getServicios
	 * @model opposite="servicios" required="true"
	 * @generated
	 */
	CServicios getServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getServicios <em>Servicios</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicios</em>' container reference.
	 * @see #getServicios()
	 * @generated
	 */
	void setServicios(CServicios value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getServicio_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EntradaServicio" opposite="servicio" containment="true"
	 * @generated
	 */
	EList getEntradas();

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getServicio_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaServicio#getServicio
	 * @model type="es.gva.cit.gvmetrica.orgcasi.SalidaServicio" opposite="servicio" containment="true"
	 * @generated
	 */
	EList getSalidas();

} // Servicio