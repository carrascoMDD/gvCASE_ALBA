
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
 * A representation of the model object '<em><b>CNormativas YLegislaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCNormativasYLegislaciones()
 * @model
 * @generated
 */
public interface CNormativasYLegislaciones extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see #setProcedimiento(AProcedimiento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCNormativasYLegislaciones_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas
	 * @model opposite="normativas" required="true"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento <em>Procedimiento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimiento</em>' container reference.
	 * @see #getProcedimiento()
	 * @generated
	 */
	void setProcedimiento(AProcedimiento value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCNormativasYLegislaciones_Normativas()
	 * @see es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion" opposite="normativas" containment="true"
	 * @generated
	 */
	EList getNormativas();

} // CNormativasYLegislaciones