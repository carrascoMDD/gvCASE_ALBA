
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
 * A representation of the model object '<em><b>CImportaciones Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador <em>Importador</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesServicios()
 * @model
 * @generated
 */
public interface CImportacionesServicios extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Importador</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importador</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importador</em>' container reference.
	 * @see #setImportador(ImportadorServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesServicios_Importador()
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportadorServicios#getImportacionesServicios
	 * @model opposite="importacionesServicios" required="true"
	 * @generated
	 */
	ImportadorServicios getImportador();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportador <em>Importador</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importador</em>' container reference.
	 * @see #getImportador()
	 * @generated
	 */
	void setImportador(ImportadorServicios value);

	/**
	 * Returns the value of the '<em><b>Importaciones Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importaciones Servicios</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesServicios_ImportacionesServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ImportacionServicios" opposite="importacionesServicios" containment="true"
	 * @generated
	 */
	EList getImportacionesServicios();

} // CImportacionesServicios