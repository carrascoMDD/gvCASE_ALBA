
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
 * A representation of the model object '<em><b>CEstructuras Funcionales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasFuncionales()
 * @model
 * @generated
 */
public interface CEstructurasFuncionales extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Estructuras Funcionales</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Funcionales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Funcionales</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasFuncionales_EstructurasFuncionales()
	 * @see es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional" opposite="estructurasFuncionales" containment="true"
	 * @generated
	 */
	EList getEstructurasFuncionales();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasFuncionales_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales
	 * @model opposite="estructurasFuncionales" required="true" changeable="false"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CEstructurasFuncionales