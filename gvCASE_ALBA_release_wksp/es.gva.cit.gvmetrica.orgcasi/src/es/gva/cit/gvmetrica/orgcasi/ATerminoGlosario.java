
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.TerminoGlosario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATermino Glosario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminoGlosario <em>Termino Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getATerminoGlosario()
 * @model
 * @generated
 */
public interface ATerminoGlosario extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getATerminoGlosario_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if terminoGlosario->isEmpty() then \'?\' else terminoGlosario.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Termino Glosario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termino Glosario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termino Glosario</em>' reference.
	 * @see #setTerminoGlosario(TerminoGlosario)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getATerminoGlosario_TerminoGlosario()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='terminosGlosario.procedimiento.procedimiento.terminos'"
	 * @generated
	 */
	TerminoGlosario getTerminoGlosario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminoGlosario <em>Termino Glosario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termino Glosario</em>' reference.
	 * @see #getTerminoGlosario()
	 * @generated
	 */
	void setTerminoGlosario(TerminoGlosario value);

	/**
	 * Returns the value of the '<em><b>Terminos Glosario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getTerminosGlosario <em>Terminos Glosario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminos Glosario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminos Glosario</em>' container reference.
	 * @see #setTerminosGlosario(CTerminosGlosario)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getATerminoGlosario_TerminosGlosario()
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getTerminosGlosario
	 * @model opposite="terminosGlosario" required="true"
	 * @generated
	 */
	CTerminosGlosario getTerminosGlosario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario#getTerminosGlosario <em>Terminos Glosario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminos Glosario</em>' container reference.
	 * @see #getTerminosGlosario()
	 * @generated
	 */
	void setTerminosGlosario(CTerminosGlosario value);

} // ATerminoGlosario