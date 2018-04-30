
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getSituacion <em>Situacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaHoraModificacion <em>Fecha Hora Modificacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaInicioVigencia <em>Fecha Inicio Vigencia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaFinVigencia <em>Fecha Fin Vigencia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getComentarioVersion <em>Comentario Version</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaElaborado <em>Fecha Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaElaborado <em>Nombre Persona Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaElaborado <em>Puesto Persona Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaRevisado <em>Fecha Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaRevisado <em>Nombre Persona Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaRevisado <em>Puesto Persona Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getFechaAprobado <em>Fecha Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaAprobado <em>Nombre Persona Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaAprobado <em>Puesto Persona Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ControlProcedimiento#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento()
 * @model
 * @generated
 */
public interface ControlProcedimiento extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_Etiqueta()
	 * @model transient="true" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Situacion</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoSituacionProcedimiento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situacion</em>' attribute.
	 * @see es.gva.cit.simapa.TipoSituacionProcedimiento
	 * @see #setSituacion(TipoSituacionProcedimiento)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_Situacion()
	 * @model
	 * @generated
	 */
	TipoSituacionProcedimiento getSituacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getSituacion <em>Situacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situacion</em>' attribute.
	 * @see es.gva.cit.simapa.TipoSituacionProcedimiento
	 * @see #getSituacion()
	 * @generated
	 */
	void setSituacion(TipoSituacionProcedimiento value);

	/**
	 * Returns the value of the '<em><b>Fecha Hora Modificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Hora Modificacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Hora Modificacion</em>' attribute.
	 * @see #setFechaHoraModificacion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaHoraModificacion()
	 * @model
	 * @generated
	 */
	String getFechaHoraModificacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaHoraModificacion <em>Fecha Hora Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Hora Modificacion</em>' attribute.
	 * @see #getFechaHoraModificacion()
	 * @generated
	 */
	void setFechaHoraModificacion(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Inicio Vigencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio Vigencia</em>' attribute.
	 * @see #setFechaInicioVigencia(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaInicioVigencia()
	 * @model
	 * @generated
	 */
	String getFechaInicioVigencia();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaInicioVigencia <em>Fecha Inicio Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio Vigencia</em>' attribute.
	 * @see #getFechaInicioVigencia()
	 * @generated
	 */
	void setFechaInicioVigencia(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Fin Vigencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Fin Vigencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Fin Vigencia</em>' attribute.
	 * @see #setFechaFinVigencia(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaFinVigencia()
	 * @model
	 * @generated
	 */
	String getFechaFinVigencia();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaFinVigencia <em>Fecha Fin Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Fin Vigencia</em>' attribute.
	 * @see #getFechaFinVigencia()
	 * @generated
	 */
	void setFechaFinVigencia(String value);

	/**
	 * Returns the value of the '<em><b>Comentario Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comentario Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comentario Version</em>' attribute.
	 * @see #setComentarioVersion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_ComentarioVersion()
	 * @model
	 * @generated
	 */
	String getComentarioVersion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getComentarioVersion <em>Comentario Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario Version</em>' attribute.
	 * @see #getComentarioVersion()
	 * @generated
	 */
	void setComentarioVersion(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Elaborado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Elaborado</em>' attribute.
	 * @see #setFechaElaborado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaElaborado()
	 * @model
	 * @generated
	 */
	String getFechaElaborado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaElaborado <em>Fecha Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Elaborado</em>' attribute.
	 * @see #getFechaElaborado()
	 * @generated
	 */
	void setFechaElaborado(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Persona Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Persona Elaborado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Persona Elaborado</em>' attribute.
	 * @see #setNombrePersonaElaborado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_NombrePersonaElaborado()
	 * @model
	 * @generated
	 */
	String getNombrePersonaElaborado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaElaborado <em>Nombre Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Persona Elaborado</em>' attribute.
	 * @see #getNombrePersonaElaborado()
	 * @generated
	 */
	void setNombrePersonaElaborado(String value);

	/**
	 * Returns the value of the '<em><b>Puesto Persona Elaborado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puesto Persona Elaborado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puesto Persona Elaborado</em>' attribute.
	 * @see #setPuestoPersonaElaborado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_PuestoPersonaElaborado()
	 * @model
	 * @generated
	 */
	String getPuestoPersonaElaborado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaElaborado <em>Puesto Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puesto Persona Elaborado</em>' attribute.
	 * @see #getPuestoPersonaElaborado()
	 * @generated
	 */
	void setPuestoPersonaElaborado(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Revisado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Revisado</em>' attribute.
	 * @see #setFechaRevisado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaRevisado()
	 * @model
	 * @generated
	 */
	String getFechaRevisado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaRevisado <em>Fecha Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Revisado</em>' attribute.
	 * @see #getFechaRevisado()
	 * @generated
	 */
	void setFechaRevisado(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Persona Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Persona Revisado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Persona Revisado</em>' attribute.
	 * @see #setNombrePersonaRevisado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_NombrePersonaRevisado()
	 * @model
	 * @generated
	 */
	String getNombrePersonaRevisado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaRevisado <em>Nombre Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Persona Revisado</em>' attribute.
	 * @see #getNombrePersonaRevisado()
	 * @generated
	 */
	void setNombrePersonaRevisado(String value);

	/**
	 * Returns the value of the '<em><b>Puesto Persona Revisado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puesto Persona Revisado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puesto Persona Revisado</em>' attribute.
	 * @see #setPuestoPersonaRevisado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_PuestoPersonaRevisado()
	 * @model
	 * @generated
	 */
	String getPuestoPersonaRevisado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaRevisado <em>Puesto Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puesto Persona Revisado</em>' attribute.
	 * @see #getPuestoPersonaRevisado()
	 * @generated
	 */
	void setPuestoPersonaRevisado(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Aprobado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Aprobado</em>' attribute.
	 * @see #setFechaAprobado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_FechaAprobado()
	 * @model
	 * @generated
	 */
	String getFechaAprobado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getFechaAprobado <em>Fecha Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Aprobado</em>' attribute.
	 * @see #getFechaAprobado()
	 * @generated
	 */
	void setFechaAprobado(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Persona Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Persona Aprobado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Persona Aprobado</em>' attribute.
	 * @see #setNombrePersonaAprobado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_NombrePersonaAprobado()
	 * @model
	 * @generated
	 */
	String getNombrePersonaAprobado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getNombrePersonaAprobado <em>Nombre Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Persona Aprobado</em>' attribute.
	 * @see #getNombrePersonaAprobado()
	 * @generated
	 */
	void setNombrePersonaAprobado(String value);

	/**
	 * Returns the value of the '<em><b>Puesto Persona Aprobado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puesto Persona Aprobado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puesto Persona Aprobado</em>' attribute.
	 * @see #setPuestoPersonaAprobado(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_PuestoPersonaAprobado()
	 * @model
	 * @generated
	 */
	String getPuestoPersonaAprobado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ControlProcedimiento#getPuestoPersonaAprobado <em>Puesto Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puesto Persona Aprobado</em>' attribute.
	 * @see #getPuestoPersonaAprobado()
	 * @generated
	 */
	void setPuestoPersonaAprobado(String value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getControlProcedimiento <em>Control Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getControlProcedimiento_Procedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getControlProcedimiento
	 * @model opposite="controlProcedimiento" required="true" changeable="false"
	 * @generated
	 */
	Procedimiento getProcedimiento();

} // ControlProcedimiento