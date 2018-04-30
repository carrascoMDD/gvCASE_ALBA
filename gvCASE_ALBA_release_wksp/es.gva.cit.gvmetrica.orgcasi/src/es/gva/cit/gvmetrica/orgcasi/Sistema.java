
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getTodosSubsistemas <em>Todos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas <em>Sistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSistema()
 * @model
 * @generated
 */
public interface Sistema extends Agrupacion, ContenedorSubsistemas, ContenedorSucesos {
	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSistema_Procedimiento()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='sistemas.procedimiento'"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Returns the value of the '<em><b>Todos Sucesos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Suceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todos Sucesos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todos Sucesos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSistema_TodosSucesos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Suceso" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='sucesos.sucesos->union(subsistemas.subsistemas.todosSucesos)'"
	 * @generated
	 */
	EList getTodosSucesos();

	/**
	 * Returns the value of the '<em><b>Todos Subsistemas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Subsistema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todos Subsistemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todos Subsistemas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSistema_TodosSubsistemas()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Subsistema" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='subsistemas.subsistemas'"
	 * @generated
	 */
	EList getTodosSubsistemas();

	/**
	 * Returns the value of the '<em><b>Sistemas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getSistemas <em>Sistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistemas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistemas</em>' container reference.
	 * @see #setSistemas(CSistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSistema_Sistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas#getSistemas
	 * @model opposite="sistemas" required="true"
	 * @generated
	 */
	CSistemas getSistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Sistema#getSistemas <em>Sistemas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistemas</em>' container reference.
	 * @see #getSistemas()
	 * @generated
	 */
	void setSistemas(CSistemas value);

} // Sistema