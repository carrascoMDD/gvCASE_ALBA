
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Subsistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado <em>Subsistema Usado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSubsistema()
 * @model
 * @generated
 */
public interface UsoSubsistema extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSubsistema_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\' de \'.concat(\r\n  if subsistemaUsado->isEmpty()  then \'?\' else  subsistemaUsado.etiqueta endif\r\n).concat( \' por \').concat(\r\n usosSubsistemas.subsistema.etiqueta \r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Usos Subsistemas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Subsistemas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Subsistemas</em>' container reference.
	 * @see #setUsosSubsistemas(CUsosSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSubsistema_UsosSubsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getUsosSubsistemas
	 * @model opposite="usosSubsistemas" required="true"
	 * @generated
	 */
	CUsosSubsistemas getUsosSubsistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usos Subsistemas</em>' container reference.
	 * @see #getUsosSubsistemas()
	 * @generated
	 */
	void setUsosSubsistemas(CUsosSubsistemas value);

	/**
	 * Returns the value of the '<em><b>Subsistema Usado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistema Usado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistema Usado</em>' reference.
	 * @see #setSubsistemaUsado(CUsadoPorSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSubsistema_SubsistemaUsado()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getUsadoPorSubsistemas
	 * @model opposite="usadoPorSubsistemas" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='usosSubsistemas.subsistema.procedimiento.todosSubsistemas.usadoPorSubsistemas'"
	 * @generated
	 */
	CUsadoPorSubsistemas getSubsistemaUsado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getSubsistemaUsado <em>Subsistema Usado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsistema Usado</em>' reference.
	 * @see #getSubsistemaUsado()
	 * @generated
	 */
	void setSubsistemaUsado(CUsadoPorSubsistemas value);

} // UsoSubsistema