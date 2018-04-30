
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
 * A representation of the model object '<em><b>CProcedimientos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProcedimientos()
 * @model
 * @generated
 */
public interface CProcedimientos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProcedimientos_Procedimientos()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AProcedimiento" opposite="procedimientos" containment="true"
	 * @generated
	 */
	EList getProcedimientos();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento <em>Anotaciones Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCProcedimientos_Repositorio()
	 * @see es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento
	 * @model opposite="anotacionesProcedimiento" required="true" changeable="false"
	 * @generated
	 */
	ARepositorio getRepositorio();

} // CProcedimientos