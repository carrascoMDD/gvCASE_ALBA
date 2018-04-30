
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
 * A representation of the model object '<em><b>CActores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CActores#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCActores()
 * @model
 * @generated
 */
public interface CActores extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see #setProcedimiento(AProcedimiento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCActores_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores
	 * @model opposite="actores" required="true"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento <em>Procedimiento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimiento</em>' container reference.
	 * @see #getProcedimiento()
	 * @generated
	 */
	void setProcedimiento(AProcedimiento value);

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Actor}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCActores_Actores()
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getActores
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Actor" opposite="actores" containment="true"
	 * @generated
	 */
	EList getActores();

} // CActores