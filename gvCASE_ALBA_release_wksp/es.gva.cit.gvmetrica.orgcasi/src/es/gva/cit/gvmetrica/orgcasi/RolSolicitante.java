
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol Solicitante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz <em>Interfaz</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRolSolicitante()
 * @model
 * @generated
 */
public interface RolSolicitante extends Rol {
	/**
	 * Returns the value of the '<em><b>Interfaz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante <em>Rol Solicitante</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaz</em>' container reference.
	 * @see #setInterfaz(Interfaz)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getRolSolicitante_Interfaz()
	 * @see es.gva.cit.gvmetrica.orgcasi.Interfaz#getRolSolicitante
	 * @model opposite="rolSolicitante" required="true"
	 * @generated
	 */
	Interfaz getInterfaz();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.RolSolicitante#getInterfaz <em>Interfaz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaz</em>' container reference.
	 * @see #getInterfaz()
	 * @generated
	 */
	void setInterfaz(Interfaz value);

} // RolSolicitante