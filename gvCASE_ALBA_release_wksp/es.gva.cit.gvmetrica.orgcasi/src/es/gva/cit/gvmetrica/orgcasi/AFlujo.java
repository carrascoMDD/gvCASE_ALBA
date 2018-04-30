
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Flujo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFlujo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujo <em>Flujo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujoDeSucesos <em>Flujo De Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujos <em>Flujos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAFlujo()
 * @model
 * @generated
 */
public interface AFlujo extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAFlujo_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if flujo->isEmpty() then \'?\' else  flujo.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Flujo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujo</em>' reference.
	 * @see #setFlujo(Flujo)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAFlujo_Flujo()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='documentos.procedimiento.procedimiento.operaciones.operaciones.flujosSalientes'"
	 * @generated
	 */
	Flujo getFlujo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujo <em>Flujo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flujo</em>' reference.
	 * @see #getFlujo()
	 * @generated
	 */
	void setFlujo(Flujo value);

	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' container reference.
	 * @see #setFlujos(CFlujos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAFlujo_Flujos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos#getFlujos
	 * @model opposite="flujos" required="true"
	 * @generated
	 */
	CFlujos getFlujos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AFlujo#getFlujos <em>Flujos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flujos</em>' container reference.
	 * @see #getFlujos()
	 * @generated
	 */
	void setFlujos(CFlujos value);

	/**
	 * Returns the value of the '<em><b>Flujo De Sucesos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujo De Sucesos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujo De Sucesos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAFlujo_FlujoDeSucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getFlujos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso" opposite="flujos" changeable="false"
	 * @generated
	 */
	EList getFlujoDeSucesos();

} // AFlujo