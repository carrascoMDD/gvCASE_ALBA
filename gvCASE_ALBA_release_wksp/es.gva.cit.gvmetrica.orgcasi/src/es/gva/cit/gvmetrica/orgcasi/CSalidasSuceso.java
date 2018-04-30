
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
 * A representation of the model object '<em><b>CSalidas Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasSuceso()
 * @model
 * @generated
 */
public interface CSalidasSuceso extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasSuceso_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas
	 * @model opposite="salidas" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSalidasSuceso_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.SalidaSuceso" opposite="salidas" containment="true"
	 * @generated
	 */
	EList getSalidas();

} // CSalidasSuceso