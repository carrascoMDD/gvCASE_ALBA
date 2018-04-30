
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
 * A representation of the model object '<em><b>CUsos Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema <em>Subsistema</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsosSubsistemas()
 * @model
 * @generated
 */
public interface CUsosSubsistemas extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Usos Subsistemas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Subsistemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Subsistemas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsosSubsistemas_UsosSubsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSubsistema#getUsosSubsistemas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.UsoSubsistema" opposite="usosSubsistemas" containment="true"
	 * @generated
	 */
	EList getUsosSubsistemas();

	/**
	 * Returns the value of the '<em><b>Subsistema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistema</em>' container reference.
	 * @see #setSubsistema(Subsistema)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsosSubsistemas_Subsistema()
	 * @see es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas
	 * @model opposite="usosSubsistemas" required="true"
	 * @generated
	 */
	Subsistema getSubsistema();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema <em>Subsistema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsistema</em>' container reference.
	 * @see #getSubsistema()
	 * @generated
	 */
	void setSubsistema(Subsistema value);

} // CUsosSubsistemas