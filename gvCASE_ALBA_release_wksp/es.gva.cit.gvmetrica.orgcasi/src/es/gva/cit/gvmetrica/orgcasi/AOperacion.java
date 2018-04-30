
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Operacion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AOperacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperacion <em>Operacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getAccionesSuceso <em>Acciones Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAOperacion()
 * @model
 * @generated
 */
public interface AOperacion extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAOperacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if operacion->isEmpty() then \'?\' else operacion.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operacion</em>' reference.
	 * @see #setOperacion(Operacion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAOperacion_Operacion()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='operaciones.procedimiento.procedimiento.operaciones.operaciones'"
	 * @generated
	 */
	Operacion getOperacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperacion <em>Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operacion</em>' reference.
	 * @see #getOperacion()
	 * @generated
	 */
	void setOperacion(Operacion value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' container reference.
	 * @see #setOperaciones(COperaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAOperacion_Operaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones#getOperaciones
	 * @model opposite="operaciones" required="true"
	 * @generated
	 */
	COperaciones getOperaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getOperaciones <em>Operaciones</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operaciones</em>' container reference.
	 * @see #getOperaciones()
	 * @generated
	 */
	void setOperaciones(COperaciones value);

	/**
	 * Returns the value of the '<em><b>Acciones Suceso</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Accion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones Suceso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones Suceso</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAOperacion_AccionesSuceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getOperaciones
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Accion" opposite="operaciones" changeable="false"
	 * @generated
	 */
	EList getAccionesSuceso();

} // AOperacion