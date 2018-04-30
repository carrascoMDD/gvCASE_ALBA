
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TipoSilencioAdministrativo;
import es.gva.cit.simapa.TramitacionProcedimiento;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tramitacion Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#isInicioInstanciaDeParte <em>Inicio Instancia De Parte</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#isInicioDeOficio <em>Inicio De Oficio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getVolumenExpedientesEjercicio <em>Volumen Expedientes Ejercicio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getPresupuestoAnualAproximado <em>Presupuesto Anual Aproximado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getPlazoSolicitud <em>Plazo Solicitud</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getPlazoResolucion <em>Plazo Resolucion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getSilencioAdministrativo <em>Silencio Administrativo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getRecurso <em>Recurso</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#isEsWorkflow <em>Es Workflow</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.TramitacionProcedimientoImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TramitacionProcedimientoImpl extends SimapaObjectImpl implements TramitacionProcedimiento {
	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isInicioInstanciaDeParte() <em>Inicio Instancia De Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicioInstanciaDeParte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INICIO_INSTANCIA_DE_PARTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInicioInstanciaDeParte() <em>Inicio Instancia De Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicioInstanciaDeParte()
	 * @generated
	 * @ordered
	 */
	protected boolean inicioInstanciaDeParte = INICIO_INSTANCIA_DE_PARTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInicioDeOficio() <em>Inicio De Oficio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicioDeOficio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INICIO_DE_OFICIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInicioDeOficio() <em>Inicio De Oficio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicioDeOficio()
	 * @generated
	 * @ordered
	 */
	protected boolean inicioDeOficio = INICIO_DE_OFICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumenExpedientesEjercicio() <em>Volumen Expedientes Ejercicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumenExpedientesEjercicio()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUMEN_EXPEDIENTES_EJERCICIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolumenExpedientesEjercicio() <em>Volumen Expedientes Ejercicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumenExpedientesEjercicio()
	 * @generated
	 * @ordered
	 */
	protected double volumenExpedientesEjercicio = VOLUMEN_EXPEDIENTES_EJERCICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresupuestoAnualAproximado() <em>Presupuesto Anual Aproximado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresupuestoAnualAproximado()
	 * @generated
	 * @ordered
	 */
	protected static final double PRESUPUESTO_ANUAL_APROXIMADO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPresupuestoAnualAproximado() <em>Presupuesto Anual Aproximado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresupuestoAnualAproximado()
	 * @generated
	 * @ordered
	 */
	protected double presupuestoAnualAproximado = PRESUPUESTO_ANUAL_APROXIMADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlazoSolicitud() <em>Plazo Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoSolicitud()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAZO_SOLICITUD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlazoSolicitud() <em>Plazo Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoSolicitud()
	 * @generated
	 * @ordered
	 */
	protected String plazoSolicitud = PLAZO_SOLICITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlazoResolucion() <em>Plazo Resolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoResolucion()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAZO_RESOLUCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlazoResolucion() <em>Plazo Resolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoResolucion()
	 * @generated
	 * @ordered
	 */
	protected String plazoResolucion = PLAZO_RESOLUCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSilencioAdministrativo() <em>Silencio Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilencioAdministrativo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoSilencioAdministrativo SILENCIO_ADMINISTRATIVO_EDEFAULT = TipoSilencioAdministrativo.POSITIVO_LITERAL;

	/**
	 * The cached value of the '{@link #getSilencioAdministrativo() <em>Silencio Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilencioAdministrativo()
	 * @generated
	 * @ordered
	 */
	protected TipoSilencioAdministrativo silencioAdministrativo = SILENCIO_ADMINISTRATIVO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurso() <em>Recurso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurso() <em>Recurso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso()
	 * @generated
	 * @ordered
	 */
	protected String recurso = RECURSO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsWorkflow() <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsWorkflow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_WORKFLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsWorkflow() <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsWorkflow()
	 * @generated
	 * @ordered
	 */
	protected boolean esWorkflow = ES_WORKFLOW_EDEFAULT;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TramitacionProcedimientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getTramitacionProcedimiento().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("TramitacionProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("TramitacionProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("TramitacionProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "TramitacionProcedimiento etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtiqueta(String newEtiqueta) {
		// TODO: implement this method to set the 'Etiqueta' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInicioInstanciaDeParte() {
		return inicioInstanciaDeParte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicioInstanciaDeParte(boolean newInicioInstanciaDeParte) {
		boolean oldInicioInstanciaDeParte = inicioInstanciaDeParte;
		inicioInstanciaDeParte = newInicioInstanciaDeParte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE, oldInicioInstanciaDeParte, inicioInstanciaDeParte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInicioDeOficio() {
		return inicioDeOficio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicioDeOficio(boolean newInicioDeOficio) {
		boolean oldInicioDeOficio = inicioDeOficio;
		inicioDeOficio = newInicioDeOficio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO, oldInicioDeOficio, inicioDeOficio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolumenExpedientesEjercicio() {
		return volumenExpedientesEjercicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumenExpedientesEjercicio(double newVolumenExpedientesEjercicio) {
		double oldVolumenExpedientesEjercicio = volumenExpedientesEjercicio;
		volumenExpedientesEjercicio = newVolumenExpedientesEjercicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO, oldVolumenExpedientesEjercicio, volumenExpedientesEjercicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPresupuestoAnualAproximado() {
		return presupuestoAnualAproximado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresupuestoAnualAproximado(double newPresupuestoAnualAproximado) {
		double oldPresupuestoAnualAproximado = presupuestoAnualAproximado;
		presupuestoAnualAproximado = newPresupuestoAnualAproximado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO, oldPresupuestoAnualAproximado, presupuestoAnualAproximado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlazoSolicitud() {
		return plazoSolicitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlazoSolicitud(String newPlazoSolicitud) {
		String oldPlazoSolicitud = plazoSolicitud;
		plazoSolicitud = newPlazoSolicitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD, oldPlazoSolicitud, plazoSolicitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlazoResolucion() {
		return plazoResolucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlazoResolucion(String newPlazoResolucion) {
		String oldPlazoResolucion = plazoResolucion;
		plazoResolucion = newPlazoResolucion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION, oldPlazoResolucion, plazoResolucion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSilencioAdministrativo getSilencioAdministrativo() {
		return silencioAdministrativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilencioAdministrativo(TipoSilencioAdministrativo newSilencioAdministrativo) {
		TipoSilencioAdministrativo oldSilencioAdministrativo = silencioAdministrativo;
		silencioAdministrativo = newSilencioAdministrativo == null ? SILENCIO_ADMINISTRATIVO_EDEFAULT : newSilencioAdministrativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO, oldSilencioAdministrativo, silencioAdministrativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecurso() {
		return recurso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurso(String newRecurso) {
		String oldRecurso = recurso;
		recurso = newRecurso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO, oldRecurso, recurso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsWorkflow() {
		return esWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsWorkflow(boolean newEsWorkflow) {
		boolean oldEsWorkflow = esWorkflow;
		esWorkflow = newEsWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW, oldEsWorkflow, esWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getProcedimiento() {
		if (eContainerFeatureID != SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO) return null;
		return (Procedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO:
				return eBasicSetContainer(null, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO, Procedimiento.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE:
				return isInicioInstanciaDeParte() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO:
				return isInicioDeOficio() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO:
				return new Double(getVolumenExpedientesEjercicio());
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO:
				return new Double(getPresupuestoAnualAproximado());
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD:
				return getPlazoSolicitud();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION:
				return getPlazoResolucion();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO:
				return getSilencioAdministrativo();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO:
				return getRecurso();
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW:
				return isEsWorkflow() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO:
				return getProcedimiento();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE:
				setInicioInstanciaDeParte(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO:
				setInicioDeOficio(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO:
				setVolumenExpedientesEjercicio(((Double)newValue).doubleValue());
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO:
				setPresupuestoAnualAproximado(((Double)newValue).doubleValue());
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD:
				setPlazoSolicitud((String)newValue);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION:
				setPlazoResolucion((String)newValue);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO:
				setSilencioAdministrativo((TipoSilencioAdministrativo)newValue);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO:
				setRecurso((String)newValue);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW:
				setEsWorkflow(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE:
				setInicioInstanciaDeParte(INICIO_INSTANCIA_DE_PARTE_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO:
				setInicioDeOficio(INICIO_DE_OFICIO_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO:
				setVolumenExpedientesEjercicio(VOLUMEN_EXPEDIENTES_EJERCICIO_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO:
				setPresupuestoAnualAproximado(PRESUPUESTO_ANUAL_APROXIMADO_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD:
				setPlazoSolicitud(PLAZO_SOLICITUD_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION:
				setPlazoResolucion(PLAZO_RESOLUCION_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO:
				setSilencioAdministrativo(SILENCIO_ADMINISTRATIVO_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO:
				setRecurso(RECURSO_EDEFAULT);
				return;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW:
				setEsWorkflow(ES_WORKFLOW_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE:
				return inicioInstanciaDeParte != INICIO_INSTANCIA_DE_PARTE_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO:
				return inicioDeOficio != INICIO_DE_OFICIO_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO:
				return volumenExpedientesEjercicio != VOLUMEN_EXPEDIENTES_EJERCICIO_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO:
				return presupuestoAnualAproximado != PRESUPUESTO_ANUAL_APROXIMADO_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD:
				return PLAZO_SOLICITUD_EDEFAULT == null ? plazoSolicitud != null : !PLAZO_SOLICITUD_EDEFAULT.equals(plazoSolicitud);
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION:
				return PLAZO_RESOLUCION_EDEFAULT == null ? plazoResolucion != null : !PLAZO_RESOLUCION_EDEFAULT.equals(plazoResolucion);
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO:
				return silencioAdministrativo != SILENCIO_ADMINISTRATIVO_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO:
				return RECURSO_EDEFAULT == null ? recurso != null : !RECURSO_EDEFAULT.equals(recurso);
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW:
				return esWorkflow != ES_WORKFLOW_EDEFAULT;
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inicioInstanciaDeParte: ");
		result.append(inicioInstanciaDeParte);
		result.append(", inicioDeOficio: ");
		result.append(inicioDeOficio);
		result.append(", volumenExpedientesEjercicio: ");
		result.append(volumenExpedientesEjercicio);
		result.append(", presupuestoAnualAproximado: ");
		result.append(presupuestoAnualAproximado);
		result.append(", plazoSolicitud: ");
		result.append(plazoSolicitud);
		result.append(", plazoResolucion: ");
		result.append(plazoResolucion);
		result.append(", silencioAdministrativo: ");
		result.append(silencioAdministrativo);
		result.append(", recurso: ");
		result.append(recurso);
		result.append(", esWorkflow: ");
		result.append(esWorkflow);
		result.append(')');
		return result.toString();
	}

} //TramitacionProcedimientoImpl