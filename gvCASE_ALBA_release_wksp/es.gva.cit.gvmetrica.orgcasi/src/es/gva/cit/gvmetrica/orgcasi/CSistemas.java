
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
 * A representation of the model object '<em><b>CSistemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getSistemas <em>Sistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSistemas()
 * @model
 * @generated
 */
public interface CSistemas extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Sistemas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Sistema}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistemas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSistemas_Sistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Sistema" opposite="sistemas" containment="true"
	 * @generated
	 */
	EList getSistemas();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSistemas_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas
	 * @model opposite="sistemas" required="true" changeable="false"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CSistemas