
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repositorio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getUnidadesOrganicas <em>Unidades Organicas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getUnidadesExternas <em>Unidades Externas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getClasesDocumento <em>Clases Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Repositorio#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio()
 * @model
 * @generated
 */
public interface Repositorio extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimientos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' containment reference.
	 * @see #setProcedimientos(Procedimientos)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimientos#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	Procedimientos getProcedimientos();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getProcedimientos <em>Procedimientos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimientos</em>' containment reference.
	 * @see #getProcedimientos()
	 * @generated
	 */
	void setProcedimientos(Procedimientos value);

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documentos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' containment reference.
	 * @see #setDocumentos(Documentos)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_Documentos()
	 * @see es.gva.cit.simapa.Documentos#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	Documentos getDocumentos();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getDocumentos <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentos</em>' containment reference.
	 * @see #getDocumentos()
	 * @generated
	 */
	void setDocumentos(Documentos value);

	/**
	 * Returns the value of the '<em><b>Estructuras Funcionales</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.EstructurasFuncionales#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Funcionales</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Funcionales</em>' containment reference.
	 * @see #setEstructurasFuncionales(EstructurasFuncionales)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_EstructurasFuncionales()
	 * @see es.gva.cit.simapa.EstructurasFuncionales#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	EstructurasFuncionales getEstructurasFuncionales();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getEstructurasFuncionales <em>Estructuras Funcionales</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Funcionales</em>' containment reference.
	 * @see #getEstructurasFuncionales()
	 * @generated
	 */
	void setEstructurasFuncionales(EstructurasFuncionales value);

	/**
	 * Returns the value of the '<em><b>Glosario</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Glosario#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosario</em>' containment reference.
	 * @see #setGlosario(Glosario)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_Glosario()
	 * @see es.gva.cit.simapa.Glosario#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	Glosario getGlosario();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getGlosario <em>Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glosario</em>' containment reference.
	 * @see #getGlosario()
	 * @generated
	 */
	void setGlosario(Glosario value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.NormativasYLegislaciones#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' containment reference.
	 * @see #setNormativas(NormativasYLegislaciones)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_Normativas()
	 * @see es.gva.cit.simapa.NormativasYLegislaciones#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	NormativasYLegislaciones getNormativas();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getNormativas <em>Normativas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normativas</em>' containment reference.
	 * @see #getNormativas()
	 * @generated
	 */
	void setNormativas(NormativasYLegislaciones value);

	/**
	 * Returns the value of the '<em><b>Unidades Organicas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.UnidadesOrganicas#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades Organicas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades Organicas</em>' containment reference.
	 * @see #setUnidadesOrganicas(UnidadesOrganicas)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_UnidadesOrganicas()
	 * @see es.gva.cit.simapa.UnidadesOrganicas#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	UnidadesOrganicas getUnidadesOrganicas();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getUnidadesOrganicas <em>Unidades Organicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades Organicas</em>' containment reference.
	 * @see #getUnidadesOrganicas()
	 * @generated
	 */
	void setUnidadesOrganicas(UnidadesOrganicas value);

	/**
	 * Returns the value of the '<em><b>Unidades Externas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.UnidadesExternas#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades Externas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades Externas</em>' containment reference.
	 * @see #setUnidadesExternas(UnidadesExternas)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_UnidadesExternas()
	 * @see es.gva.cit.simapa.UnidadesExternas#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	UnidadesExternas getUnidadesExternas();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getUnidadesExternas <em>Unidades Externas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades Externas</em>' containment reference.
	 * @see #getUnidadesExternas()
	 * @generated
	 */
	void setUnidadesExternas(UnidadesExternas value);

	/**
	 * Returns the value of the '<em><b>Clases Documento</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ClasesDocumento#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases Documento</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases Documento</em>' containment reference.
	 * @see #setClasesDocumento(ClasesDocumento)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_ClasesDocumento()
	 * @see es.gva.cit.simapa.ClasesDocumento#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	ClasesDocumento getClasesDocumento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getClasesDocumento <em>Clases Documento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clases Documento</em>' containment reference.
	 * @see #getClasesDocumento()
	 * @generated
	 */
	void setClasesDocumento(ClasesDocumento value);

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Aplicaciones#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' containment reference.
	 * @see #setAplicaciones(Aplicaciones)
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_Aplicaciones()
	 * @see es.gva.cit.simapa.Aplicaciones#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	Aplicaciones getAplicaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Repositorio#getAplicaciones <em>Aplicaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aplicaciones</em>' containment reference.
	 * @see #getAplicaciones()
	 * @generated
	 */
	void setAplicaciones(Aplicaciones value);

	/**
	 * Returns the value of the '<em><b>Model Package</b></em>' reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Package</em>' reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getRepositorio_ModelPackage()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EPackage getModelPackage();

} // Repositorio