
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
 * A representation of the model object '<em><b>CSubsistemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getSubsistemas <em>Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor <em>Contenedor</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSubsistemas()
 * @model
 * @generated
 */
public interface CSubsistemas extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Contenedor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor</em>' container reference.
	 * @see #setContenedor(ContenedorSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSubsistemas_Contenedor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas#getSubsistemas
	 * @model opposite="subsistemas" required="true"
	 * @generated
	 */
	ContenedorSubsistemas getContenedor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getContenedor <em>Contenedor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor</em>' container reference.
	 * @see #getContenedor()
	 * @generated
	 */
	void setContenedor(ContenedorSubsistemas value);

	/**
	 * Returns the value of the '<em><b>Subsistemas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Subsistema}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistemas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSubsistemas_Subsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Subsistema" opposite="subsistemas" containment="true"
	 * @generated
	 */
	EList getSubsistemas();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSubsistemas_Procedimiento()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if contenedor.oclIsTypeOf(AProcedimiento) then contenedor.oclAsType(AProcedimiento) else \r\n contenedor.oclAsType(Sistema).procedimiento endif'"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CSubsistemas