
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
 * A representation of the model object '<em><b>Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getVersion <em>Version</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getProp <em>Prop</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getObjeto <em>Objeto</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getPersona <em>Persona</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getTipoProcedimiento <em>Tipo Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getNotas <em>Notas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getPeriodicidad <em>Periodicidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getTituloUltimaConvocatoria <em>Titulo Ultima Convocatoria</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getTerminos <em>Terminos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getFichaArchivistica <em>Ficha Archivistica</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento <em>Tramitacion Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getUsosComoSubProcedimientos <em>Usos Como Sub Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getConvocatorias <em>Convocatorias</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getControlProcedimiento <em>Control Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getServicio <em>Servicio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Procedimiento#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento()
 * @model
 * @generated
 */
public interface Procedimiento extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if titulo->notEmpty() and titulo.size() > 0 then titulo else \'?\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Completo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Completo</em>' attribute.
	 * @see #setCodigoCompleto(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_CodigoCompleto()
	 * @model
	 * @generated
	 */
	String getCodigoCompleto();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getCodigoCompleto <em>Codigo Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Completo</em>' attribute.
	 * @see #getCodigoCompleto()
	 * @generated
	 */
	void setCodigoCompleto(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' attribute.
	 * @see #setProp(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Prop()
	 * @model
	 * @generated
	 */
	String getProp();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getProp <em>Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop</em>' attribute.
	 * @see #getProp()
	 * @generated
	 */
	void setProp(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Objeto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objeto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objeto</em>' attribute.
	 * @see #setObjeto(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Objeto()
	 * @model
	 * @generated
	 */
	String getObjeto();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getObjeto <em>Objeto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objeto</em>' attribute.
	 * @see #getObjeto()
	 * @generated
	 */
	void setObjeto(String value);

	/**
	 * Returns the value of the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observaciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observaciones</em>' attribute.
	 * @see #setObservaciones(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' attribute.
	 * @see #setPersona(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Persona()
	 * @model
	 * @generated
	 */
	String getPersona();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getPersona <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' attribute.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Procedimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Procedimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Procedimiento</em>' attribute.
	 * @see #setTipoProcedimiento(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_TipoProcedimiento()
	 * @model
	 * @generated
	 */
	String getTipoProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getTipoProcedimiento <em>Tipo Procedimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Procedimiento</em>' attribute.
	 * @see #getTipoProcedimiento()
	 * @generated
	 */
	void setTipoProcedimiento(String value);

	/**
	 * Returns the value of the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notas</em>' attribute.
	 * @see #setNotas(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Notas()
	 * @model
	 * @generated
	 */
	String getNotas();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getNotas <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notas</em>' attribute.
	 * @see #getNotas()
	 * @generated
	 */
	void setNotas(String value);

	/**
	 * Returns the value of the '<em><b>Periodicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicidad</em>' attribute.
	 * @see #setPeriodicidad(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Periodicidad()
	 * @model
	 * @generated
	 */
	String getPeriodicidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getPeriodicidad <em>Periodicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicidad</em>' attribute.
	 * @see #getPeriodicidad()
	 * @generated
	 */
	void setPeriodicidad(String value);

	/**
	 * Returns the value of the '<em><b>Titulo Ultima Convocatoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo Ultima Convocatoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo Ultima Convocatoria</em>' attribute.
	 * @see #setTituloUltimaConvocatoria(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_TituloUltimaConvocatoria()
	 * @model
	 * @generated
	 */
	String getTituloUltimaConvocatoria();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getTituloUltimaConvocatoria <em>Titulo Ultima Convocatoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo Ultima Convocatoria</em>' attribute.
	 * @see #getTituloUltimaConvocatoria()
	 * @generated
	 */
	void setTituloUltimaConvocatoria(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operaciones#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference.
	 * @see #setOperaciones(Operaciones)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Operaciones()
	 * @see es.gva.cit.simapa.Operaciones#getProcedimiento
	 * @model opposite="procedimiento" containment="true"
	 * @generated
	 */
	Operaciones getOperaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getOperaciones <em>Operaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operaciones</em>' containment reference.
	 * @see #getOperaciones()
	 * @generated
	 */
	void setOperaciones(Operaciones value);

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Documento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documento#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Documentos()
	 * @see es.gva.cit.simapa.Documento#getProcedimientos
	 * @model type="es.gva.cit.simapa.Documento" opposite="procedimientos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.documentos.documentos'"
	 * @generated
	 */
	EList getDocumentos();

	/**
	 * Returns the value of the '<em><b>Terminos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.TerminoGlosario}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.TerminoGlosario#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Terminos()
	 * @see es.gva.cit.simapa.TerminoGlosario#getProcedimientos
	 * @model type="es.gva.cit.simapa.TerminoGlosario" opposite="procedimientos"
	 * @generated
	 */
	EList getTerminos();

	/**
	 * Returns the value of the '<em><b>Ficha Archivistica</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.FichaArchivistica#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ficha Archivistica</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ficha Archivistica</em>' containment reference.
	 * @see #setFichaArchivistica(FichaArchivistica)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_FichaArchivistica()
	 * @see es.gva.cit.simapa.FichaArchivistica#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	FichaArchivistica getFichaArchivistica();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getFichaArchivistica <em>Ficha Archivistica</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ficha Archivistica</em>' containment reference.
	 * @see #getFichaArchivistica()
	 * @generated
	 */
	void setFichaArchivistica(FichaArchivistica value);

	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.UnidadOrganica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.UnidadOrganica#getUnidadDeProcedimientos <em>Unidad De Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Unidades()
	 * @see es.gva.cit.simapa.UnidadOrganica#getUnidadDeProcedimientos
	 * @model type="es.gva.cit.simapa.UnidadOrganica" opposite="unidadDeProcedimientos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.unidadesOrganicas.descomposicion->union(procedimientos.repositorio.unidadesExternas.descomposicion)'"
	 * @generated
	 */
	EList getUnidades();

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimientos#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimientos#getProcedimientos
	 * @model opposite="procedimientos" required="true" changeable="false"
	 * @generated
	 */
	Procedimientos getProcedimientos();

	/**
	 * Returns the value of the '<em><b>Tramitacion Procedimiento</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.TramitacionProcedimiento#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tramitacion Procedimiento</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tramitacion Procedimiento</em>' containment reference.
	 * @see #setTramitacionProcedimiento(TramitacionProcedimiento)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_TramitacionProcedimiento()
	 * @see es.gva.cit.simapa.TramitacionProcedimiento#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	TramitacionProcedimiento getTramitacionProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento <em>Tramitacion Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tramitacion Procedimiento</em>' containment reference.
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 */
	void setTramitacionProcedimiento(TramitacionProcedimiento value);

	/**
	 * Returns the value of the '<em><b>Usos Como Sub Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Subprocedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento <em>Sub Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Como Sub Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Como Sub Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_UsosComoSubProcedimientos()
	 * @see es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento
	 * @model type="es.gva.cit.simapa.Subprocedimiento" opposite="subProcedimiento" changeable="false"
	 * @generated
	 */
	EList getUsosComoSubProcedimientos();

	/**
	 * Returns the value of the '<em><b>Convocatorias</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Convocatoria}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Convocatoria#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convocatorias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convocatorias</em>' containment reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Convocatorias()
	 * @see es.gva.cit.simapa.Convocatoria#getProcedimiento
	 * @model type="es.gva.cit.simapa.Convocatoria" opposite="procedimiento" containment="true"
	 * @generated
	 */
	EList getConvocatorias();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.UnidadOrganica#getResponsableDeProcedimientos <em>Responsable De Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(UnidadOrganica)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Responsable()
	 * @see es.gva.cit.simapa.UnidadOrganica#getResponsableDeProcedimientos
	 * @model opposite="responsableDeProcedimientos" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.unidadesOrganicas->closure(descomposicion)'"
	 * @generated
	 */
	UnidadOrganica getResponsable();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(UnidadOrganica value);

	/**
	 * Returns the value of the '<em><b>Control Procedimiento</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ControlProcedimiento#getProcedimiento <em>Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Procedimiento</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Procedimiento</em>' containment reference.
	 * @see #setControlProcedimiento(ControlProcedimiento)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_ControlProcedimiento()
	 * @see es.gva.cit.simapa.ControlProcedimiento#getProcedimiento
	 * @model opposite="procedimiento" containment="true" required="true"
	 * @generated
	 */
	ControlProcedimiento getControlProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getControlProcedimiento <em>Control Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Procedimiento</em>' containment reference.
	 * @see #getControlProcedimiento()
	 * @generated
	 */
	void setControlProcedimiento(ControlProcedimiento value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.NormativaYLegislacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.NormativaYLegislacion#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Normativas()
	 * @see es.gva.cit.simapa.NormativaYLegislacion#getProcedimientos
	 * @model type="es.gva.cit.simapa.NormativaYLegislacion" opposite="procedimientos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.normativas.normativas'"
	 * @generated
	 */
	EList getNormativas();

	/**
	 * Returns the value of the '<em><b>Servicio</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.EstructuraFuncional#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicio</em>' reference.
	 * @see #setServicio(EstructuraFuncional)
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Servicio()
	 * @see es.gva.cit.simapa.EstructuraFuncional#getProcedimientos
	 * @model opposite="procedimientos"
	 * @generated
	 */
	EstructuraFuncional getServicio();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Procedimiento#getServicio <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(EstructuraFuncional value);

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Aplicacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Aplicacion#getProcedimientos <em>Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getProcedimiento_Aplicaciones()
	 * @see es.gva.cit.simapa.Aplicacion#getProcedimientos
	 * @model type="es.gva.cit.simapa.Aplicacion" opposite="procedimientos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='procedimientos.repositorio.aplicaciones.aplicaciones'"
	 * @generated
	 */
	EList getAplicaciones();

} // Procedimiento