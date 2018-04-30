
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios <em>Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante <em>Rol Solicitante</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado <em>Rol Solicitado</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getInterfaz()
 * @model
 * @generated
 */
public interface Interfaz extends Agrupacion, ConModelClass {
	/**
	 * Returns the value of the '<em><b>Servicios</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios</em>' containment reference.
	 * @see #setServicios(CServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getInterfaz_Servicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CServicios#getInterfaz
	 * @model opposite="interfaz" containment="true" required="true"
	 * @generated
	 */
	CServicios getServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getServicios <em>Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicios</em>' containment reference.
	 * @see #getServicios()
	 * @generated
	 */
	void setServicios(CServicios value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' container reference.
	 * @see #setInterfaces(CInterfaces)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getInterfaz_Interfaces()
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces#getInterfaces
	 * @model opposite="interfaces" required="true"
	 * @generated
	 */
	CInterfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getInterfaces <em>Interfaces</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' container reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(CInterfaces value);

	/**
	 * Returns the value of the '<em><b>Rol Solicitante</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol Solicitante</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol Solicitante</em>' containment reference.
	 * @see #setRolSolicitante(RolSolicitante)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getInterfaz_RolSolicitante()
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz
	 * @model opposite="interfaz" containment="true" required="true"
	 * @generated
	 */
	RolSolicitante getRolSolicitante();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante <em>Rol Solicitante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol Solicitante</em>' containment reference.
	 * @see #getRolSolicitante()
	 * @generated
	 */
	void setRolSolicitante(RolSolicitante value);

	/**
	 * Returns the value of the '<em><b>Rol Solicitado</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol Solicitado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol Solicitado</em>' containment reference.
	 * @see #setRolSolicitado(RolSolicitado)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getInterfaz_RolSolicitado()
	 * @see es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz
	 * @model opposite="interfaz" containment="true" required="true"
	 * @generated
	 */
	RolSolicitado getRolSolicitado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado <em>Rol Solicitado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol Solicitado</em>' containment reference.
	 * @see #getRolSolicitado()
	 * @generated
	 */
	void setRolSolicitado(RolSolicitado value);

} // Interfaz