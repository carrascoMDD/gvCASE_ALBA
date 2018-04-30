
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
 * A representation of the model object '<em><b>COperaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCOperaciones()
 * @model
 * @generated
 */
public interface COperaciones extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AOperacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCOperaciones_Operaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AOperacion" opposite="operaciones" containment="true"
	 * @generated
	 */
	EList getOperaciones();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see #setProcedimiento(AProcedimiento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCOperaciones_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones
	 * @model opposite="operaciones" required="true"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento <em>Procedimiento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimiento</em>' container reference.
	 * @see #getProcedimiento()
	 * @generated
	 */
	void setProcedimiento(AProcedimiento value);

} // COperaciones