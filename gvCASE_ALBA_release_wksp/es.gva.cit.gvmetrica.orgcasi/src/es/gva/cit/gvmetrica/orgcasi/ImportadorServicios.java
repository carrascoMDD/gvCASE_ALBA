
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
 * A representation of the model object '<em><b>Importador Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportadorServicios()
 * @model abstract="true"
 * @generated
 */
public interface ImportadorServicios extends EObject {
	/**
	 * Returns the value of the '<em><b>Importaciones Servicios</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador <em>Importador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones Servicios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importaciones Servicios</em>' containment reference.
	 * @see #setImportacionesServicios(CImportacionesServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportadorServicios_ImportacionesServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador
	 * @model opposite="importador" containment="true" required="true"
	 * @generated
	 */
	CImportacionesServicios getImportacionesServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios <em>Importaciones Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importaciones Servicios</em>' containment reference.
	 * @see #getImportacionesServicios()
	 * @generated
	 */
	void setImportacionesServicios(CImportacionesServicios value);

} // ImportadorServicios