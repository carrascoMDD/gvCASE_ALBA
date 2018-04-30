
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.EstructuraFuncional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AEstructura Funcional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructuraFuncional <em>Estructura Funcional</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAEstructuraFuncional()
 * @model
 * @generated
 */
public interface AEstructuraFuncional extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAEstructuraFuncional_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if estructuraFuncional->isEmpty() then \'?\' else estructuraFuncional.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Estructura Funcional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructura Funcional</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructura Funcional</em>' reference.
	 * @see #setEstructuraFuncional(EstructuraFuncional)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAEstructuraFuncional_EstructuraFuncional()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='estructurasFuncionales.procedimiento.procedimiento.estructurasFuncionales->closure( descomposicion)'"
	 * @generated
	 */
	EstructuraFuncional getEstructuraFuncional();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructuraFuncional <em>Estructura Funcional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructura Funcional</em>' reference.
	 * @see #getEstructuraFuncional()
	 * @generated
	 */
	void setEstructuraFuncional(EstructuraFuncional value);

	/**
	 * Returns the value of the '<em><b>Estructuras Funcionales</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getEstructurasFuncionales <em>Estructuras Funcionales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Funcionales</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Funcionales</em>' container reference.
	 * @see #setEstructurasFuncionales(CEstructurasFuncionales)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAEstructuraFuncional_EstructurasFuncionales()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getEstructurasFuncionales
	 * @model opposite="estructurasFuncionales" required="true"
	 * @generated
	 */
	CEstructurasFuncionales getEstructurasFuncionales();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional#getEstructurasFuncionales <em>Estructuras Funcionales</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Funcionales</em>' container reference.
	 * @see #getEstructurasFuncionales()
	 * @generated
	 */
	void setEstructurasFuncionales(CEstructurasFuncionales value);

} // AEstructuraFuncional