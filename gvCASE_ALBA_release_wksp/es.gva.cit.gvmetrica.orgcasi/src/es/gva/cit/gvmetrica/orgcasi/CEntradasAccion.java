
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
 * A representation of the model object '<em><b>CEntradas Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasAccion()
 * @model
 * @generated
 */
public interface CEntradasAccion extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Accion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' container reference.
	 * @see #setAccion(Accion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasAccion_Accion()
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas
	 * @model opposite="entradas" required="true"
	 * @generated
	 */
	Accion getAccion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion <em>Accion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accion</em>' container reference.
	 * @see #getAccion()
	 * @generated
	 */
	void setAccion(Accion value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEntradasAccion_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EntradaAccion" opposite="entradas" containment="true"
	 * @generated
	 */
	EList getEntradas();

} // CEntradasAccion