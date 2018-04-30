
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
 * A representation of the model object '<em><b>CSucesos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getSucesos <em>Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor <em>Contenedor</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSucesos()
 * @model
 * @generated
 */
public interface CSucesos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Contenedor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenedor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenedor</em>' container reference.
	 * @see #setContenedor(ContenedorSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSucesos_Contenedor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos#getSucesos
	 * @model opposite="sucesos" required="true"
	 * @generated
	 */
	ContenedorSucesos getContenedor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getContenedor <em>Contenedor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenedor</em>' container reference.
	 * @see #getContenedor()
	 * @generated
	 */
	void setContenedor(ContenedorSucesos value);

	/**
	 * Returns the value of the '<em><b>Sucesos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Suceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucesos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSucesos_Sucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Suceso" opposite="sucesos" containment="true"
	 * @generated
	 */
	EList getSucesos();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCSucesos_Procedimiento()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if contenedor.oclIsTypeOf(AProcedimiento) then contenedor.oclAsType(AProcedimiento) \r\nelse (\r\n   if contenedor.oclIsTypeOf(Sistema) then contenedor.oclAsType(Sistema).procedimiento \r\n   else contenedor.oclAsType(Subsistema).procedimiento endif\r\n) endif'"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CSucesos