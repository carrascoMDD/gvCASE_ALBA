
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
 * A representation of the model object '<em><b>CEntradas Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasSuceso()
 * @model
 * @generated
 */
public interface CEntradasSuceso extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasSuceso_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EntradaSuceso" opposite="entradas" containment="true"
	 * @generated
	 */
	EList getEntradas();

	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasSuceso_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas
	 * @model opposite="entradas" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

} // CEntradasSuceso