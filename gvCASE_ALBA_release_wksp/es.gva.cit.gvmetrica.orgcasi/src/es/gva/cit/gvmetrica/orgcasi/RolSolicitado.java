
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol Solicitado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz <em>Interfaz</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRolSolicitado()
 * @model
 * @generated
 */
public interface RolSolicitado extends Rol {
	/**
	 * Returns the value of the '<em><b>Interfaz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado <em>Rol Solicitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaz</em>' container reference.
	 * @see #setInterfaz(Interfaz)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRolSolicitado_Interfaz()
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitado
	 * @model opposite="rolSolicitado" required="true"
	 * @generated
	 */
	Interfaz getInterfaz();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitado#getInterfaz <em>Interfaz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaz</em>' container reference.
	 * @see #getInterfaz()
	 * @generated
	 */
	void setInterfaz(Interfaz value);

} // RolSolicitado