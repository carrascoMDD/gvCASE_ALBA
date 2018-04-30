
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.NormativaYLegislacion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANormativa YLegislacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativa <em>Normativa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas <em>Normativas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getANormativaYLegislacion()
 * @model
 * @generated
 */
public interface ANormativaYLegislacion extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getANormativaYLegislacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if normativa->isEmpty() then \'?\' else normativa.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Normativa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativa</em>' reference.
	 * @see #setNormativa(NormativaYLegislacion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getANormativaYLegislacion_Normativa()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='normativas.procedimiento.procedimiento.normativas'"
	 * @generated
	 */
	NormativaYLegislacion getNormativa();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativa <em>Normativa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normativa</em>' reference.
	 * @see #getNormativa()
	 * @generated
	 */
	void setNormativa(NormativaYLegislacion value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' container reference.
	 * @see #setNormativas(CNormativasYLegislaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getANormativaYLegislacion_Normativas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getNormativas
	 * @model opposite="normativas" required="true"
	 * @generated
	 */
	CNormativasYLegislaciones getNormativas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion#getNormativas <em>Normativas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normativas</em>' container reference.
	 * @see #getNormativas()
	 * @generated
	 */
	void setNormativas(CNormativasYLegislaciones value);

} // ANormativaYLegislacion