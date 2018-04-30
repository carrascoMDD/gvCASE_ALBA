
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
 * A representation of the model object '<em><b>CTerminos Glosario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCTerminosGlosario()
 * @model
 * @generated
 */
public interface CTerminosGlosario extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Terminos Glosario</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminos Glosario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminos Glosario</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCTerminosGlosario_TerminosGlosario()
	 * @see es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario" opposite="terminosGlosario" containment="true"
	 * @generated
	 */
	EList getTerminosGlosario();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCTerminosGlosario_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario
	 * @model opposite="terminosGlosario" required="true" changeable="false"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CTerminosGlosario