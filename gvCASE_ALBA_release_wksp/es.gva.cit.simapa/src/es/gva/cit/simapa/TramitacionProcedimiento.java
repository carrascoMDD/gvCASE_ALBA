
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
 * A representation of the model object '<em><b>Tramitacion Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioInstanciaDeParte <em>Inicio Instancia De Parte</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioDeOficio <em>Inicio De Oficio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getVolumenExpedientesEjercicio <em>Volumen Expedientes Ejercicio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getPresupuestoAnualAproximado <em>Presupuesto Anual Aproximado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoSolicitud <em>Plazo Solicitud</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoResolucion <em>Plazo Resolucion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getSilencioAdministrativo <em>Silencio Administrativo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getRecurso <em>Recurso</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#isEsWorkflow <em>Es Workflow</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TramitacionProcedimiento#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento()
 * @model
 * @generated
 */
public interface TramitacionProcedimiento extends SimapaObject {
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
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_Etiqueta()
	 * @model transient="true" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Inicio Instancia De Parte</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio Instancia De Parte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio Instancia De Parte</em>' attribute.
	 * @see #setInicioInstanciaDeParte(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_InicioInstanciaDeParte()
	 * @model default="false"
	 * @generated
	 */
	boolean isInicioInstanciaDeParte();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioInstanciaDeParte <em>Inicio Instancia De Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio Instancia De Parte</em>' attribute.
	 * @see #isInicioInstanciaDeParte()
	 * @generated
	 */
	void setInicioInstanciaDeParte(boolean value);

	/**
	 * Returns the value of the '<em><b>Inicio De Oficio</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio De Oficio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio De Oficio</em>' attribute.
	 * @see #setInicioDeOficio(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_InicioDeOficio()
	 * @model default="false"
	 * @generated
	 */
	boolean isInicioDeOficio();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#isInicioDeOficio <em>Inicio De Oficio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio De Oficio</em>' attribute.
	 * @see #isInicioDeOficio()
	 * @generated
	 */
	void setInicioDeOficio(boolean value);

	/**
	 * Returns the value of the '<em><b>Volumen Expedientes Ejercicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumen Expedientes Ejercicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumen Expedientes Ejercicio</em>' attribute.
	 * @see #setVolumenExpedientesEjercicio(double)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_VolumenExpedientesEjercicio()
	 * @model
	 * @generated
	 */
	double getVolumenExpedientesEjercicio();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getVolumenExpedientesEjercicio <em>Volumen Expedientes Ejercicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumen Expedientes Ejercicio</em>' attribute.
	 * @see #getVolumenExpedientesEjercicio()
	 * @generated
	 */
	void setVolumenExpedientesEjercicio(double value);

	/**
	 * Returns the value of the '<em><b>Presupuesto Anual Aproximado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presupuesto Anual Aproximado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presupuesto Anual Aproximado</em>' attribute.
	 * @see #setPresupuestoAnualAproximado(double)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_PresupuestoAnualAproximado()
	 * @model
	 * @generated
	 */
	double getPresupuestoAnualAproximado();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPresupuestoAnualAproximado <em>Presupuesto Anual Aproximado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presupuesto Anual Aproximado</em>' attribute.
	 * @see #getPresupuestoAnualAproximado()
	 * @generated
	 */
	void setPresupuestoAnualAproximado(double value);

	/**
	 * Returns the value of the '<em><b>Plazo Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plazo Solicitud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plazo Solicitud</em>' attribute.
	 * @see #setPlazoSolicitud(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_PlazoSolicitud()
	 * @model
	 * @generated
	 */
	String getPlazoSolicitud();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoSolicitud <em>Plazo Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plazo Solicitud</em>' attribute.
	 * @see #getPlazoSolicitud()
	 * @generated
	 */
	void setPlazoSolicitud(String value);

	/**
	 * Returns the value of the '<em><b>Plazo Resolucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plazo Resolucion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plazo Resolucion</em>' attribute.
	 * @see #setPlazoResolucion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_PlazoResolucion()
	 * @model
	 * @generated
	 */
	String getPlazoResolucion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getPlazoResolucion <em>Plazo Resolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plazo Resolucion</em>' attribute.
	 * @see #getPlazoResolucion()
	 * @generated
	 */
	void setPlazoResolucion(String value);

	/**
	 * Returns the value of the '<em><b>Silencio Administrativo</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoSilencioAdministrativo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silencio Administrativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silencio Administrativo</em>' attribute.
	 * @see es.gva.cit.simapa.TipoSilencioAdministrativo
	 * @see #setSilencioAdministrativo(TipoSilencioAdministrativo)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_SilencioAdministrativo()
	 * @model
	 * @generated
	 */
	TipoSilencioAdministrativo getSilencioAdministrativo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getSilencioAdministrativo <em>Silencio Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silencio Administrativo</em>' attribute.
	 * @see es.gva.cit.simapa.TipoSilencioAdministrativo
	 * @see #getSilencioAdministrativo()
	 * @generated
	 */
	void setSilencioAdministrativo(TipoSilencioAdministrativo value);

	/**
	 * Returns the value of the '<em><b>Recurso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso</em>' attribute.
	 * @see #setRecurso(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_Recurso()
	 * @model
	 * @generated
	 */
	String getRecurso();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#getRecurso <em>Recurso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurso</em>' attribute.
	 * @see #getRecurso()
	 * @generated
	 */
	void setRecurso(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_EsWorkflow()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsWorkflow();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TramitacionProcedimiento#isEsWorkflow <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Workflow</em>' attribute.
	 * @see #isEsWorkflow()
	 * @generated
	 */
	void setEsWorkflow(boolean value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento <em>Tramitacion Procedimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getTramitacionProcedimiento_Procedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getTramitacionProcedimiento
	 * @model opposite="tramitacionProcedimiento" required="true" changeable="false"
	 * @generated
	 */
	Procedimiento getProcedimiento();

} // TramitacionProcedimiento