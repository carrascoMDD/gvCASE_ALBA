
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
 * A representation of the model object '<em><b>Subsistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getTipoSubsistema <em>Tipo Subsistema</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas <em>Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema()
 * @model
 * @generated
 */
public interface Subsistema extends Agrupacion, ContenedorSucesos {
	/**
	 * Returns the value of the '<em><b>Tipo Subsistema</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.orgcasi.TipoSubsistema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Subsistema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Subsistema</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoSubsistema
	 * @see #setTipoSubsistema(TipoSubsistema)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_TipoSubsistema()
	 * @model
	 * @generated
	 */
	TipoSubsistema getTipoSubsistema();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getTipoSubsistema <em>Tipo Subsistema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Subsistema</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoSubsistema
	 * @see #getTipoSubsistema()
	 * @generated
	 */
	void setTipoSubsistema(TipoSubsistema value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_Procedimiento()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='subsistemas.procedimiento'"
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_TodosSucesos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Suceso" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='sucesos.sucesos'"
	 * @generated
	 */
	EList getTodosSucesos();

	/**
	 * Returns the value of the '<em><b>Usos Subsistemas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Subsistemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Subsistemas</em>' containment reference.
	 * @see #setUsosSubsistemas(CUsosSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_UsosSubsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas#getSubsistema
	 * @model opposite="subsistema" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='subsistemas.procedimiento.todosSubsistemas'"
	 * @generated
	 */
	CUsosSubsistemas getUsosSubsistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsosSubsistemas <em>Usos Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usos Subsistemas</em>' containment reference.
	 * @see #getUsosSubsistemas()
	 * @generated
	 */
	void setUsosSubsistemas(CUsosSubsistemas value);

	/**
	 * Returns the value of the '<em><b>Usado Por Subsistemas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema <em>Subsistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usado Por Subsistemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usado Por Subsistemas</em>' containment reference.
	 * @see #setUsadoPorSubsistemas(CUsadoPorSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_UsadoPorSubsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas#getSubsistema
	 * @model opposite="subsistema" containment="true" required="true"
	 * @generated
	 */
	CUsadoPorSubsistemas getUsadoPorSubsistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usado Por Subsistemas</em>' containment reference.
	 * @see #getUsadoPorSubsistemas()
	 * @generated
	 */
	void setUsadoPorSubsistemas(CUsadoPorSubsistemas value);

	/**
	 * Returns the value of the '<em><b>Subsistemas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getSubsistemas <em>Subsistemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsistemas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsistemas</em>' container reference.
	 * @see #setSubsistemas(CSubsistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSubsistema_Subsistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSubsistemas#getSubsistemas
	 * @model opposite="subsistemas" required="true"
	 * @generated
	 */
	CSubsistemas getSubsistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Subsistema#getSubsistemas <em>Subsistemas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsistemas</em>' container reference.
	 * @see #getSubsistemas()
	 * @generated
	 */
	void setSubsistemas(CSubsistemas value);

} // Subsistema