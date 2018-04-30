
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
 * A representation of the model object '<em><b>CAplicaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAplicaciones()
 * @model
 * @generated
 */
public interface CAplicaciones extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AAplicacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAplicaciones_Aplicaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.AAplicacion#getAplicaciones
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AAplicacion" opposite="aplicaciones" containment="true"
	 * @generated
	 */
	EList getAplicaciones();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCAplicaciones_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones
	 * @model opposite="aplicaciones" required="true" changeable="false"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

} // CAplicaciones