
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
 * A representation of the model object '<em><b>CAcciones Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAccionesSuceso()
 * @model
 * @generated
 */
public interface CAccionesSuceso extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAccionesSuceso_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones
	 * @model opposite="acciones" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Accion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAccionesSuceso_Acciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Accion" opposite="acciones" containment="true"
	 * @generated
	 */
	EList getAcciones();

} // CAccionesSuceso