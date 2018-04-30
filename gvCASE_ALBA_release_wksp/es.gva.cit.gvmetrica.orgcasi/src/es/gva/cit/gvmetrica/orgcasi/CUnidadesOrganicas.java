
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
 * A representation of the model object '<em><b>CUnidades Organicas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidadesOrganicas()
 * @model
 * @generated
 */
public interface CUnidadesOrganicas extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidadesOrganicas_Unidades()
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica" opposite="unidades" containment="true"
	 * @generated
	 */
	EList getUnidades();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidadesOrganicas_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas
	 * @model opposite="unidadesOrganicas" required="true" changeable="false"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CUnidadesOrganicas