
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Operacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getPlazoEjecucion <em>Plazo Ejecucion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#isEsWorkflow <em>Es Workflow</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getNumeroPagina <em>Numero Pagina</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getNumeroOrden <em>Numero Orden</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getFlujosEntrantes <em>Flujos Entrantes</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getFlujosSalientes <em>Flujos Salientes</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Operacion#getUnidad <em>Unidad</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if titulo->notEmpty() and titulo.size() > 0 then titulo else \'\' endif).concat( \' \').concat( \r\n  if self.oclIsTypeOf(DocumentoFinal) then (\r\n    if self.oclAsType( DocumentoFinal).documento->isEmpty() then \'?\' \r\n    else self.oclAsType( DocumentoFinal).documento.etiqueta endif \r\n  ) else ( \r\n  if self.oclIsTypeOf(Subprocedimiento) then (\r\n    if self.oclAsType( Subprocedimiento).subProcedimiento->isEmpty() then \'?\' \r\n    else self.oclAsType( Subprocedimiento).subProcedimiento.etiqueta endif\r\n  ) else (\r\n    \'\' \r\n  ) endif\r\n  ) endif\r\n) \r\n\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Plazo Ejecucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plazo Ejecucion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plazo Ejecucion</em>' attribute.
	 * @see #setPlazoEjecucion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_PlazoEjecucion()
	 * @model
	 * @generated
	 */
	String getPlazoEjecucion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#getPlazoEjecucion <em>Plazo Ejecucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plazo Ejecucion</em>' attribute.
	 * @see #getPlazoEjecucion()
	 * @generated
	 */
	void setPlazoEjecucion(String value);

	/**
	 * Returns the value of the '<em><b>Es Workflow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Workflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Workflow</em>' attribute.
	 * @see #setEsWorkflow(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_EsWorkflow()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsWorkflow();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#isEsWorkflow <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Workflow</em>' attribute.
	 * @see #isEsWorkflow()
	 * @generated
	 */
	void setEsWorkflow(boolean value);

	/**
	 * Returns the value of the '<em><b>Numero Pagina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Pagina</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Pagina</em>' attribute.
	 * @see #setNumeroPagina(Integer)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_NumeroPagina()
	 * @model
	 * @generated
	 */
	Integer getNumeroPagina();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#getNumeroPagina <em>Numero Pagina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Pagina</em>' attribute.
	 * @see #getNumeroPagina()
	 * @generated
	 */
	void setNumeroPagina(Integer value);

	/**
	 * Returns the value of the '<em><b>Numero Orden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Orden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Orden</em>' attribute.
	 * @see #setNumeroOrden(Integer)
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_NumeroOrden()
	 * @model
	 * @generated
	 */
	Integer getNumeroOrden();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Operacion#getNumeroOrden <em>Numero Orden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Orden</em>' attribute.
	 * @see #getNumeroOrden()
	 * @generated
	 */
	void setNumeroOrden(Integer value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operaciones#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Operaciones()
	 * @see es.gva.cit.simapa.Operaciones#getOperaciones
	 * @model opposite="operaciones" required="true" changeable="false"
	 * @generated
	 */
	Operaciones getOperaciones();

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Aplicacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Aplicacion#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Aplicaciones()
	 * @see es.gva.cit.simapa.Aplicacion#getOperaciones
	 * @model type="es.gva.cit.simapa.Aplicacion" opposite="operaciones"
	 * @generated
	 */
	EList getAplicaciones();

	/**
	 * Returns the value of the '<em><b>Flujos Entrantes</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Flujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Flujo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos Entrantes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos Entrantes</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_FlujosEntrantes()
	 * @see es.gva.cit.simapa.Flujo#getDestino
	 * @model type="es.gva.cit.simapa.Flujo" opposite="destino" changeable="false"
	 * @generated
	 */
	EList getFlujosEntrantes();

	/**
	 * Returns the value of the '<em><b>Flujos Salientes</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Flujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Flujo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos Salientes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos Salientes</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_FlujosSalientes()
	 * @see es.gva.cit.simapa.Flujo#getOrigen
	 * @model type="es.gva.cit.simapa.Flujo" opposite="origen" containment="true"
	 * @generated
	 */
	EList getFlujosSalientes();

	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Unidad}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Unidad#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getOperacion_Unidad()
	 * @see es.gva.cit.simapa.Unidad#getOperaciones
	 * @model type="es.gva.cit.simapa.Unidad" opposite="operaciones" required="true"
	 * @generated
	 */
	EList getUnidad();

} // Operacion