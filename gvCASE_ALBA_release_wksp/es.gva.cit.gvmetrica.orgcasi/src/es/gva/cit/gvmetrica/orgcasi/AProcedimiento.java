
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Procedimiento;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AProcedimiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas <em>Unidades Organicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesExternas <em>Unidades Externas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas <em>Sistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosSubsistemas <em>Todos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTodosDocumentos <em>Todos Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento()
 * @model
 * @generated
 */
public interface AProcedimiento extends Anotacion, ContenedorSubsistemas, ContenedorSucesos, ContenedorDocumentos, ContenedorDatos, ImportadorServicios {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see #setProcedimiento(Procedimiento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Procedimiento()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.repositorio.procedimientos.procedimientos'"
	 * @generated
	 */
	Procedimiento getProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimiento <em>Procedimiento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimiento</em>' reference.
	 * @see #getProcedimiento()
	 * @generated
	 */
	void setProcedimiento(Procedimiento value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' containment reference.
	 * @see #setNormativas(CNormativasYLegislaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Normativas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CNormativasYLegislaciones getNormativas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getNormativas <em>Normativas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normativas</em>' containment reference.
	 * @see #getNormativas()
	 * @generated
	 */
	void setNormativas(CNormativasYLegislaciones value);

	/**
	 * Returns the value of the '<em><b>Terminos Glosario</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminos Glosario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminos Glosario</em>' containment reference.
	 * @see #setTerminosGlosario(CTerminosGlosario)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_TerminosGlosario()
	 * @see es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CTerminosGlosario getTerminosGlosario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getTerminosGlosario <em>Terminos Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminos Glosario</em>' containment reference.
	 * @see #getTerminosGlosario()
	 * @generated
	 */
	void setTerminosGlosario(CTerminosGlosario value);

	/**
	 * Returns the value of the '<em><b>Unidades Organicas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades Organicas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades Organicas</em>' containment reference.
	 * @see #setUnidadesOrganicas(CUnidadesOrganicas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_UnidadesOrganicas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CUnidadesOrganicas getUnidadesOrganicas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesOrganicas <em>Unidades Organicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades Organicas</em>' containment reference.
	 * @see #getUnidadesOrganicas()
	 * @generated
	 */
	void setUnidadesOrganicas(CUnidadesOrganicas value);

	/**
	 * Returns the value of the '<em><b>Unidades Externas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades Externas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades Externas</em>' containment reference.
	 * @see #setUnidadesExternas(CUnidadesExternas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_UnidadesExternas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CUnidadesExternas getUnidadesExternas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidadesExternas <em>Unidades Externas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades Externas</em>' containment reference.
	 * @see #getUnidadesExternas()
	 * @generated
	 */
	void setUnidadesExternas(CUnidadesExternas value);

	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' containment reference.
	 * @see #setUnidades(CUnidades)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Unidades()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CUnidades getUnidades();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades <em>Unidades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades</em>' containment reference.
	 * @see #getUnidades()
	 * @generated
	 */
	void setUnidades(CUnidades value);

	/**
	 * Returns the value of the '<em><b>Estructuras Funcionales</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Funcionales</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Funcionales</em>' containment reference.
	 * @see #setEstructurasFuncionales(CEstructurasFuncionales)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_EstructurasFuncionales()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CEstructurasFuncionales getEstructurasFuncionales();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getEstructurasFuncionales <em>Estructuras Funcionales</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Funcionales</em>' containment reference.
	 * @see #getEstructurasFuncionales()
	 * @generated
	 */
	void setEstructurasFuncionales(CEstructurasFuncionales value);

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' containment reference.
	 * @see #setAplicaciones(CAplicaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Aplicaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.CAplicaciones#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CAplicaciones getAplicaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getAplicaciones <em>Aplicaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aplicaciones</em>' containment reference.
	 * @see #getAplicaciones()
	 * @generated
	 */
	void setAplicaciones(CAplicaciones value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference.
	 * @see #setOperaciones(COperaciones)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Operaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.COperaciones#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	COperaciones getOperaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getOperaciones <em>Operaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operaciones</em>' containment reference.
	 * @see #getOperaciones()
	 * @generated
	 */
	void setOperaciones(COperaciones value);

	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CFlujos#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' containment reference.
	 * @see #setFlujos(CFlujos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Flujos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujos#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CFlujos getFlujos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getFlujos <em>Flujos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flujos</em>' containment reference.
	 * @see #getFlujos()
	 * @generated
	 */
	void setFlujos(CFlujos value);

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' containment reference.
	 * @see #setActores(CActores)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Actores()
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	CActores getActores();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getActores <em>Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actores</em>' containment reference.
	 * @see #getActores()
	 * @generated
	 */
	void setActores(CActores value);

	/**
	 * Returns the value of the '<em><b>Sistemas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSistemas#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistemas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistemas</em>' containment reference.
	 * @see #setSistemas(CSistemas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Sistemas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSistemas#getProcedimiento
	 * @model opposite="procedimiento" containment="true"
	 * @generated
	 */
	CSistemas getSistemas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getSistemas <em>Sistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistemas</em>' containment reference.
	 * @see #getSistemas()
	 * @generated
	 */
	void setSistemas(CSistemas value);

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' container reference.
	 * @see #setProcedimientos(CProcedimientos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Procedimientos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getProcedimientos
	 * @model opposite="procedimientos" required="true"
	 * @generated
	 */
	CProcedimientos getProcedimientos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getProcedimientos <em>Procedimientos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimientos</em>' container reference.
	 * @see #getProcedimientos()
	 * @generated
	 */
	void setProcedimientos(CProcedimientos value);

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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_TodosSucesos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Suceso" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='sucesos.sucesos->asOrderedSet()->union( subsistemas.subsistemas.todosSucesos->asOrderedSet())->union(sistemas.sistemas.todosSucesos->asOrderedSet())\r\n\r\n\r\n'"
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_TodosSubsistemas()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Subsistema" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if subsistemas->isEmpty() or subsistemas.subsistemas->isEmpty() then\r\n  sistemas.sistemas.todosSubsistemas\r\nelse\r\nif sistemas->isEmpty() or sistemas.sistemas->isEmpty() then\r\n  subsistemas.subsistemas\r\nelse\r\n  subsistemas.subsistemas->asOrderedSet()->union(sistemas.sistemas.todosSubsistemas->asOrderedSet())\r\nendif\r\nendif\r\n\r\n'"
	 * @generated
	 */
	EList getTodosSubsistemas();

	/**
	 * Returns the value of the '<em><b>Todas Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todas Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todas Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_TodasEstructurasDatos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if  importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen estructurasDatos.estructurasDatos->asOrderedSet()\r\nelse\r\n  estructurasDatos.estructurasDatos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todasEstructurasDatos->asOrderedSet()\r\n  )\r\nendif\r\n'"
	 * @generated
	 */
	EList getTodasEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Todos Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ADocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todos Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todos Documentos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_TodosDocumentos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ADocumento" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen documentos.documentos.todosDocumentos->asOrderedSet()\r\nelse\r\n  documentos.documentos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todosDocumentos.todosDocumentos->asOrderedSet()\r\n  )\r\nendif\r\n'"
	 * @generated
	 */
	EList getTodosDocumentos();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAProcedimiento_Repositorio()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='procedimientos.repositorio'"
	 * @generated
	 */
	ARepositorio getRepositorio();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int crearAnotaciones();

} // AProcedimiento