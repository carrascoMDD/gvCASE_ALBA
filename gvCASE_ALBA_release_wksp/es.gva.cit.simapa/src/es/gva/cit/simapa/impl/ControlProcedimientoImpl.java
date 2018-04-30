
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ControlProcedimiento;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TipoSituacionProcedimiento;

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
 * An implementation of the model object '<em><b>Control Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getSituacion <em>Situacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaHoraModificacion <em>Fecha Hora Modificacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaInicioVigencia <em>Fecha Inicio Vigencia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaFinVigencia <em>Fecha Fin Vigencia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getComentarioVersion <em>Comentario Version</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaElaborado <em>Fecha Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getNombrePersonaElaborado <em>Nombre Persona Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getPuestoPersonaElaborado <em>Puesto Persona Elaborado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaRevisado <em>Fecha Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getNombrePersonaRevisado <em>Nombre Persona Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getPuestoPersonaRevisado <em>Puesto Persona Revisado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getFechaAprobado <em>Fecha Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getNombrePersonaAprobado <em>Nombre Persona Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getPuestoPersonaAprobado <em>Puesto Persona Aprobado</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ControlProcedimientoImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlProcedimientoImpl extends SimapaObjectImpl implements ControlProcedimiento {
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
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected String usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSituacion() <em>Situacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituacion()
	 * @generated
	 * @ordered
	 */
	protected static final TipoSituacionProcedimiento SITUACION_EDEFAULT = TipoSituacionProcedimiento.DEFINITIVO_LITERAL;

	/**
	 * The cached value of the '{@link #getSituacion() <em>Situacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituacion()
	 * @generated
	 * @ordered
	 */
	protected TipoSituacionProcedimiento situacion = SITUACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaHoraModificacion() <em>Fecha Hora Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaHoraModificacion()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_HORA_MODIFICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaHoraModificacion() <em>Fecha Hora Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaHoraModificacion()
	 * @generated
	 * @ordered
	 */
	protected String fechaHoraModificacion = FECHA_HORA_MODIFICACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaInicioVigencia() <em>Fecha Inicio Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicioVigencia()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_INICIO_VIGENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaInicioVigencia() <em>Fecha Inicio Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicioVigencia()
	 * @generated
	 * @ordered
	 */
	protected String fechaInicioVigencia = FECHA_INICIO_VIGENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaFinVigencia() <em>Fecha Fin Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFinVigencia()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_FIN_VIGENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaFinVigencia() <em>Fecha Fin Vigencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFinVigencia()
	 * @generated
	 * @ordered
	 */
	protected String fechaFinVigencia = FECHA_FIN_VIGENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getComentarioVersion() <em>Comentario Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarioVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMENTARIO_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComentarioVersion() <em>Comentario Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentarioVersion()
	 * @generated
	 * @ordered
	 */
	protected String comentarioVersion = COMENTARIO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaElaborado() <em>Fecha Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaElaborado()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ELABORADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaElaborado() <em>Fecha Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaElaborado()
	 * @generated
	 * @ordered
	 */
	protected String fechaElaborado = FECHA_ELABORADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePersonaElaborado() <em>Nombre Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaElaborado()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PERSONA_ELABORADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePersonaElaborado() <em>Nombre Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaElaborado()
	 * @generated
	 * @ordered
	 */
	protected String nombrePersonaElaborado = NOMBRE_PERSONA_ELABORADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuestoPersonaElaborado() <em>Puesto Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaElaborado()
	 * @generated
	 * @ordered
	 */
	protected static final String PUESTO_PERSONA_ELABORADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPuestoPersonaElaborado() <em>Puesto Persona Elaborado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaElaborado()
	 * @generated
	 * @ordered
	 */
	protected String puestoPersonaElaborado = PUESTO_PERSONA_ELABORADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaRevisado() <em>Fecha Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaRevisado()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_REVISADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaRevisado() <em>Fecha Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaRevisado()
	 * @generated
	 * @ordered
	 */
	protected String fechaRevisado = FECHA_REVISADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePersonaRevisado() <em>Nombre Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaRevisado()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PERSONA_REVISADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePersonaRevisado() <em>Nombre Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaRevisado()
	 * @generated
	 * @ordered
	 */
	protected String nombrePersonaRevisado = NOMBRE_PERSONA_REVISADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuestoPersonaRevisado() <em>Puesto Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaRevisado()
	 * @generated
	 * @ordered
	 */
	protected static final String PUESTO_PERSONA_REVISADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPuestoPersonaRevisado() <em>Puesto Persona Revisado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaRevisado()
	 * @generated
	 * @ordered
	 */
	protected String puestoPersonaRevisado = PUESTO_PERSONA_REVISADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaAprobado() <em>Fecha Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAprobado()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_APROBADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaAprobado() <em>Fecha Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAprobado()
	 * @generated
	 * @ordered
	 */
	protected String fechaAprobado = FECHA_APROBADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePersonaAprobado() <em>Nombre Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaAprobado()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PERSONA_APROBADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePersonaAprobado() <em>Nombre Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonaAprobado()
	 * @generated
	 * @ordered
	 */
	protected String nombrePersonaAprobado = NOMBRE_PERSONA_APROBADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuestoPersonaAprobado() <em>Puesto Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaAprobado()
	 * @generated
	 * @ordered
	 */
	protected static final String PUESTO_PERSONA_APROBADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPuestoPersonaAprobado() <em>Puesto Persona Aprobado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuestoPersonaAprobado()
	 * @generated
	 * @ordered
	 */
	protected String puestoPersonaAprobado = PUESTO_PERSONA_APROBADO_EDEFAULT;


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
	protected ControlProcedimientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.CONTROL_PROCEDIMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getControlProcedimiento().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ControlProcedimiento");
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
System.out.println("ControlProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ControlProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ControlProcedimiento etiqueta", anException);
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
	public String getUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(String newUsuario) {
		String oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSituacionProcedimiento getSituacion() {
		return situacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituacion(TipoSituacionProcedimiento newSituacion) {
		TipoSituacionProcedimiento oldSituacion = situacion;
		situacion = newSituacion == null ? SITUACION_EDEFAULT : newSituacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION, oldSituacion, situacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaHoraModificacion(String newFechaHoraModificacion) {
		String oldFechaHoraModificacion = fechaHoraModificacion;
		fechaHoraModificacion = newFechaHoraModificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION, oldFechaHoraModificacion, fechaHoraModificacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaInicioVigencia() {
		return fechaInicioVigencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicioVigencia(String newFechaInicioVigencia) {
		String oldFechaInicioVigencia = fechaInicioVigencia;
		fechaInicioVigencia = newFechaInicioVigencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA, oldFechaInicioVigencia, fechaInicioVigencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaFinVigencia() {
		return fechaFinVigencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaFinVigencia(String newFechaFinVigencia) {
		String oldFechaFinVigencia = fechaFinVigencia;
		fechaFinVigencia = newFechaFinVigencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA, oldFechaFinVigencia, fechaFinVigencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComentarioVersion() {
		return comentarioVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComentarioVersion(String newComentarioVersion) {
		String oldComentarioVersion = comentarioVersion;
		comentarioVersion = newComentarioVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION, oldComentarioVersion, comentarioVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaElaborado() {
		return fechaElaborado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaElaborado(String newFechaElaborado) {
		String oldFechaElaborado = fechaElaborado;
		fechaElaborado = newFechaElaborado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO, oldFechaElaborado, fechaElaborado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrePersonaElaborado() {
		return nombrePersonaElaborado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonaElaborado(String newNombrePersonaElaborado) {
		String oldNombrePersonaElaborado = nombrePersonaElaborado;
		nombrePersonaElaborado = newNombrePersonaElaborado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO, oldNombrePersonaElaborado, nombrePersonaElaborado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPuestoPersonaElaborado() {
		return puestoPersonaElaborado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuestoPersonaElaborado(String newPuestoPersonaElaborado) {
		String oldPuestoPersonaElaborado = puestoPersonaElaborado;
		puestoPersonaElaborado = newPuestoPersonaElaborado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO, oldPuestoPersonaElaborado, puestoPersonaElaborado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaRevisado() {
		return fechaRevisado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaRevisado(String newFechaRevisado) {
		String oldFechaRevisado = fechaRevisado;
		fechaRevisado = newFechaRevisado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO, oldFechaRevisado, fechaRevisado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrePersonaRevisado() {
		return nombrePersonaRevisado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonaRevisado(String newNombrePersonaRevisado) {
		String oldNombrePersonaRevisado = nombrePersonaRevisado;
		nombrePersonaRevisado = newNombrePersonaRevisado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO, oldNombrePersonaRevisado, nombrePersonaRevisado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPuestoPersonaRevisado() {
		return puestoPersonaRevisado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuestoPersonaRevisado(String newPuestoPersonaRevisado) {
		String oldPuestoPersonaRevisado = puestoPersonaRevisado;
		puestoPersonaRevisado = newPuestoPersonaRevisado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO, oldPuestoPersonaRevisado, puestoPersonaRevisado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaAprobado() {
		return fechaAprobado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaAprobado(String newFechaAprobado) {
		String oldFechaAprobado = fechaAprobado;
		fechaAprobado = newFechaAprobado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO, oldFechaAprobado, fechaAprobado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrePersonaAprobado() {
		return nombrePersonaAprobado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonaAprobado(String newNombrePersonaAprobado) {
		String oldNombrePersonaAprobado = nombrePersonaAprobado;
		nombrePersonaAprobado = newNombrePersonaAprobado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO, oldNombrePersonaAprobado, nombrePersonaAprobado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPuestoPersonaAprobado() {
		return puestoPersonaAprobado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuestoPersonaAprobado(String newPuestoPersonaAprobado) {
		String oldPuestoPersonaAprobado = puestoPersonaAprobado;
		puestoPersonaAprobado = newPuestoPersonaAprobado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO, oldPuestoPersonaAprobado, puestoPersonaAprobado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getProcedimiento() {
		if (eContainerFeatureID != SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO) return null;
		return (Procedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO, msgs);
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO:
				return eBasicSetContainer(null, SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO, msgs);
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO, Procedimiento.class, msgs);
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO:
				return getUsuario();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION:
				return getSituacion();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION:
				return getFechaHoraModificacion();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA:
				return getFechaInicioVigencia();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA:
				return getFechaFinVigencia();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION:
				return getComentarioVersion();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO:
				return getFechaElaborado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO:
				return getNombrePersonaElaborado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO:
				return getPuestoPersonaElaborado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO:
				return getFechaRevisado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO:
				return getNombrePersonaRevisado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO:
				return getPuestoPersonaRevisado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO:
				return getFechaAprobado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO:
				return getNombrePersonaAprobado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO:
				return getPuestoPersonaAprobado();
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO:
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO:
				setUsuario((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION:
				setSituacion((TipoSituacionProcedimiento)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION:
				setFechaHoraModificacion((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA:
				setFechaInicioVigencia((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA:
				setFechaFinVigencia((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION:
				setComentarioVersion((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO:
				setFechaElaborado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO:
				setNombrePersonaElaborado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO:
				setPuestoPersonaElaborado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO:
				setFechaRevisado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO:
				setNombrePersonaRevisado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO:
				setPuestoPersonaRevisado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO:
				setFechaAprobado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO:
				setNombrePersonaAprobado((String)newValue);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO:
				setPuestoPersonaAprobado((String)newValue);
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION:
				setSituacion(SITUACION_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION:
				setFechaHoraModificacion(FECHA_HORA_MODIFICACION_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA:
				setFechaInicioVigencia(FECHA_INICIO_VIGENCIA_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA:
				setFechaFinVigencia(FECHA_FIN_VIGENCIA_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION:
				setComentarioVersion(COMENTARIO_VERSION_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO:
				setFechaElaborado(FECHA_ELABORADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO:
				setNombrePersonaElaborado(NOMBRE_PERSONA_ELABORADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO:
				setPuestoPersonaElaborado(PUESTO_PERSONA_ELABORADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO:
				setFechaRevisado(FECHA_REVISADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO:
				setNombrePersonaRevisado(NOMBRE_PERSONA_REVISADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO:
				setPuestoPersonaRevisado(PUESTO_PERSONA_REVISADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO:
				setFechaAprobado(FECHA_APROBADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO:
				setNombrePersonaAprobado(NOMBRE_PERSONA_APROBADO_EDEFAULT);
				return;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO:
				setPuestoPersonaAprobado(PUESTO_PERSONA_APROBADO_EDEFAULT);
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
			case SimapaPackage.CONTROL_PROCEDIMIENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION:
				return situacion != SITUACION_EDEFAULT;
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION:
				return FECHA_HORA_MODIFICACION_EDEFAULT == null ? fechaHoraModificacion != null : !FECHA_HORA_MODIFICACION_EDEFAULT.equals(fechaHoraModificacion);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA:
				return FECHA_INICIO_VIGENCIA_EDEFAULT == null ? fechaInicioVigencia != null : !FECHA_INICIO_VIGENCIA_EDEFAULT.equals(fechaInicioVigencia);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA:
				return FECHA_FIN_VIGENCIA_EDEFAULT == null ? fechaFinVigencia != null : !FECHA_FIN_VIGENCIA_EDEFAULT.equals(fechaFinVigencia);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION:
				return COMENTARIO_VERSION_EDEFAULT == null ? comentarioVersion != null : !COMENTARIO_VERSION_EDEFAULT.equals(comentarioVersion);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO:
				return FECHA_ELABORADO_EDEFAULT == null ? fechaElaborado != null : !FECHA_ELABORADO_EDEFAULT.equals(fechaElaborado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO:
				return NOMBRE_PERSONA_ELABORADO_EDEFAULT == null ? nombrePersonaElaborado != null : !NOMBRE_PERSONA_ELABORADO_EDEFAULT.equals(nombrePersonaElaborado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO:
				return PUESTO_PERSONA_ELABORADO_EDEFAULT == null ? puestoPersonaElaborado != null : !PUESTO_PERSONA_ELABORADO_EDEFAULT.equals(puestoPersonaElaborado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO:
				return FECHA_REVISADO_EDEFAULT == null ? fechaRevisado != null : !FECHA_REVISADO_EDEFAULT.equals(fechaRevisado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO:
				return NOMBRE_PERSONA_REVISADO_EDEFAULT == null ? nombrePersonaRevisado != null : !NOMBRE_PERSONA_REVISADO_EDEFAULT.equals(nombrePersonaRevisado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO:
				return PUESTO_PERSONA_REVISADO_EDEFAULT == null ? puestoPersonaRevisado != null : !PUESTO_PERSONA_REVISADO_EDEFAULT.equals(puestoPersonaRevisado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO:
				return FECHA_APROBADO_EDEFAULT == null ? fechaAprobado != null : !FECHA_APROBADO_EDEFAULT.equals(fechaAprobado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO:
				return NOMBRE_PERSONA_APROBADO_EDEFAULT == null ? nombrePersonaAprobado != null : !NOMBRE_PERSONA_APROBADO_EDEFAULT.equals(nombrePersonaAprobado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO:
				return PUESTO_PERSONA_APROBADO_EDEFAULT == null ? puestoPersonaAprobado != null : !PUESTO_PERSONA_APROBADO_EDEFAULT.equals(puestoPersonaAprobado);
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO:
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
		result.append(" (usuario: ");
		result.append(usuario);
		result.append(", situacion: ");
		result.append(situacion);
		result.append(", fechaHoraModificacion: ");
		result.append(fechaHoraModificacion);
		result.append(", fechaInicioVigencia: ");
		result.append(fechaInicioVigencia);
		result.append(", fechaFinVigencia: ");
		result.append(fechaFinVigencia);
		result.append(", comentarioVersion: ");
		result.append(comentarioVersion);
		result.append(", fechaElaborado: ");
		result.append(fechaElaborado);
		result.append(", nombrePersonaElaborado: ");
		result.append(nombrePersonaElaborado);
		result.append(", puestoPersonaElaborado: ");
		result.append(puestoPersonaElaborado);
		result.append(", fechaRevisado: ");
		result.append(fechaRevisado);
		result.append(", nombrePersonaRevisado: ");
		result.append(nombrePersonaRevisado);
		result.append(", puestoPersonaRevisado: ");
		result.append(puestoPersonaRevisado);
		result.append(", fechaAprobado: ");
		result.append(fechaAprobado);
		result.append(", nombrePersonaAprobado: ");
		result.append(nombrePersonaAprobado);
		result.append(", puestoPersonaAprobado: ");
		result.append(puestoPersonaAprobado);
		result.append(')');
		return result.toString();
	}

} //ControlProcedimientoImpl