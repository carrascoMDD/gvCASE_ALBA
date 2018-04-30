
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
 * A representation of the model object '<em><b>CUsado Por Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema <em>Subsistema</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSubsistemas()
 * @model
 * @generated
 */
public interface CUsadoPorSubsistemas extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSubsistemas_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if subsistema->isEmpty()  then \'?\' else  subsistema.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Usado Por Subsistemas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado <em>Subsistema Usado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usado Por Subsistemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usado Por Subsistemas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSubsistemas_UsadoPorSubsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado
	 * @model type="es.gva.cit.gvmetrica.orgcasi.UsoSubsistema" opposite="subsistemaUsado"
	 * @generated
	 */
	EList getUsadoPorSubsistemas();

	/**
	 * Returns the value of the '<em><b>Subsistema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistema</em>' container reference.
	 * @see #setSubsistema(Subsistema)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSubsistemas_Subsistema()
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas
	 * @model opposite="usadoPorSubsistemas" required="true"
	 * @generated
	 */
	Subsistema getSubsistema();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema <em>Subsistema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsistema</em>' container reference.
	 * @see #getSubsistema()
	 * @generated
	 */
	void setSubsistema(Subsistema value);

} // CUsadoPorSubsistemas