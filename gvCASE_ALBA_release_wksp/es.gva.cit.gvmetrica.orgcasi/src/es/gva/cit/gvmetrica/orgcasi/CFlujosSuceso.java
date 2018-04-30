
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
 * A representation of the model object '<em><b>CFlujos Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCFlujosSuceso()
 * @model
 * @generated
 */
public interface CFlujosSuceso extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AFlujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujoDeSucesos <em>Flujo De Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCFlujosSuceso_Flujos()
	 * @see es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujoDeSucesos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AFlujo" opposite="flujoDeSucesos"
	 * @generated
	 */
	EList getFlujos();

	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCFlujosSuceso_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos
	 * @model opposite="flujos" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

} // CFlujosSuceso