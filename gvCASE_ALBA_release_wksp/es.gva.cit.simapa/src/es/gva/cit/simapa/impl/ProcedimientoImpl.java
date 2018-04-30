
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.ControlProcedimiento;
import es.gva.cit.simapa.Convocatoria;
import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.FichaArchivistica;
import es.gva.cit.simapa.NormativaYLegislacion;
import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.Procedimientos;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.Subprocedimiento;
import es.gva.cit.simapa.TerminoGlosario;
import es.gva.cit.simapa.TramitacionProcedimiento;
import es.gva.cit.simapa.UnidadOrganica;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedimiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getObjeto <em>Objeto</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getTipoProcedimiento <em>Tipo Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getNotas <em>Notas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getPeriodicidad <em>Periodicidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getTituloUltimaConvocatoria <em>Titulo Ultima Convocatoria</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getTerminos <em>Terminos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getFichaArchivistica <em>Ficha Archivistica</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getTramitacionProcedimiento <em>Tramitacion Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getUsosComoSubProcedimientos <em>Usos Como Sub Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getConvocatorias <em>Convocatorias</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getControlProcedimiento <em>Control Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getServicio <em>Servicio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientoImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedimientoImpl extends SimapaObjectImpl implements Procedimiento {
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
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoCompleto() <em>Codigo Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoCompleto()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_COMPLETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoCompleto() <em>Codigo Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoCompleto()
	 * @generated
	 * @ordered
	 */
	protected String codigoCompleto = CODIGO_COMPLETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProp() <em>Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected static final String PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected String prop = PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjeto() <em>Objeto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjeto()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjeto() <em>Objeto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjeto()
	 * @generated
	 * @ordered
	 */
	protected String objeto = OBJETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected String observaciones = OBSERVACIONES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersona() <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected String persona = PERSONA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoProcedimiento() <em>Tipo Procedimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_PROCEDIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoProcedimiento() <em>Tipo Procedimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected String tipoProcedimiento = TIPO_PROCEDIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotas() <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotas()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotas() <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotas()
	 * @generated
	 * @ordered
	 */
	protected String notas = NOTAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodicidad() <em>Periodicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicidad()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIODICIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriodicidad() <em>Periodicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicidad()
	 * @generated
	 * @ordered
	 */
	protected String periodicidad = PERIODICIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTituloUltimaConvocatoria() <em>Titulo Ultima Convocatoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTituloUltimaConvocatoria()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_ULTIMA_CONVOCATORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTituloUltimaConvocatoria() <em>Titulo Ultima Convocatoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTituloUltimaConvocatoria()
	 * @generated
	 * @ordered
	 */
	protected String tituloUltimaConvocatoria = TITULO_ULTIMA_CONVOCATORIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected Operaciones operaciones = null;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList documentos = null;

	/**
	 * The cached value of the '{@link #getTerminos() <em>Terminos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminos()
	 * @generated
	 * @ordered
	 */
	protected EList terminos = null;

	/**
	 * The cached value of the '{@link #getFichaArchivistica() <em>Ficha Archivistica</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichaArchivistica()
	 * @generated
	 * @ordered
	 */
	protected FichaArchivistica fichaArchivistica = null;

	/**
	 * The cached value of the '{@link #getUnidades() <em>Unidades</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidades()
	 * @generated
	 * @ordered
	 */
	protected EList unidades = null;

	/**
	 * The cached value of the '{@link #getTramitacionProcedimiento() <em>Tramitacion Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTramitacionProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected TramitacionProcedimiento tramitacionProcedimiento = null;

	/**
	 * The cached value of the '{@link #getUsosComoSubProcedimientos() <em>Usos Como Sub Procedimientos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosComoSubProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected EList usosComoSubProcedimientos = null;

	/**
	 * The cached value of the '{@link #getConvocatorias() <em>Convocatorias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvocatorias()
	 * @generated
	 * @ordered
	 */
	protected EList convocatorias = null;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected UnidadOrganica responsable = null;

	/**
	 * The cached value of the '{@link #getControlProcedimiento() <em>Control Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected ControlProcedimiento controlProcedimiento = null;

	/**
	 * The cached value of the '{@link #getNormativas() <em>Normativas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativas()
	 * @generated
	 * @ordered
	 */
	protected EList normativas = null;

	/**
	 * The cached value of the '{@link #getServicio() <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicio()
	 * @generated
	 * @ordered
	 */
	protected EstructuraFuncional servicio = null;

	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected EList aplicaciones = null;


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
	protected ProcedimientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.PROCEDIMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getProcedimiento().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Procedimiento");
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
System.out.println("Procedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Procedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Procedimiento etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoCompleto() {
		return codigoCompleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoCompleto(String newCodigoCompleto) {
		String oldCodigoCompleto = codigoCompleto;
		codigoCompleto = newCodigoCompleto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO, oldCodigoCompleto, codigoCompleto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProp() {
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProp(String newProp) {
		String oldProp = prop;
		prop = newProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__PROP, oldProp, prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjeto() {
		return objeto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjeto(String newObjeto) {
		String oldObjeto = objeto;
		objeto = newObjeto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__OBJETO, oldObjeto, objeto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservaciones(String newObservaciones) {
		String oldObservaciones = observaciones;
		observaciones = newObservaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__OBSERVACIONES, oldObservaciones, observaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersona() {
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(String newPersona) {
		String oldPersona = persona;
		persona = newPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoProcedimiento() {
		return tipoProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoProcedimiento(String newTipoProcedimiento) {
		String oldTipoProcedimiento = tipoProcedimiento;
		tipoProcedimiento = newTipoProcedimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO, oldTipoProcedimiento, tipoProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotas() {
		return notas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotas(String newNotas) {
		String oldNotas = notas;
		notas = newNotas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__NOTAS, oldNotas, notas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriodicidad() {
		return periodicidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicidad(String newPeriodicidad) {
		String oldPeriodicidad = periodicidad;
		periodicidad = newPeriodicidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__PERIODICIDAD, oldPeriodicidad, periodicidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTituloUltimaConvocatoria() {
		return tituloUltimaConvocatoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTituloUltimaConvocatoria(String newTituloUltimaConvocatoria) {
		String oldTituloUltimaConvocatoria = tituloUltimaConvocatoria;
		tituloUltimaConvocatoria = newTituloUltimaConvocatoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA, oldTituloUltimaConvocatoria, tituloUltimaConvocatoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operaciones getOperaciones() {
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperaciones(Operaciones newOperaciones, NotificationChain msgs) {
		Operaciones oldOperaciones = operaciones;
		operaciones = newOperaciones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__OPERACIONES, oldOperaciones, newOperaciones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperaciones(Operaciones newOperaciones) {
		if (newOperaciones != operaciones) {
			NotificationChain msgs = null;
			if (operaciones != null)
				msgs = ((InternalEObject)operaciones).eInverseRemove(this, SimapaPackage.OPERACIONES__PROCEDIMIENTO, Operaciones.class, msgs);
			if (newOperaciones != null)
				msgs = ((InternalEObject)newOperaciones).eInverseAdd(this, SimapaPackage.OPERACIONES__PROCEDIMIENTO, Operaciones.class, msgs);
			msgs = basicSetOperaciones(newOperaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__OPERACIONES, newOperaciones, newOperaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectWithInverseResolvingEList.ManyInverse(Documento.class, this, SimapaPackage.PROCEDIMIENTO__DOCUMENTOS, SimapaPackage.DOCUMENTO__PROCEDIMIENTOS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTerminos() {
		if (terminos == null) {
			terminos = new EObjectWithInverseResolvingEList.ManyInverse(TerminoGlosario.class, this, SimapaPackage.PROCEDIMIENTO__TERMINOS, SimapaPackage.TERMINO_GLOSARIO__PROCEDIMIENTOS);
		}
		return terminos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichaArchivistica getFichaArchivistica() {
		return fichaArchivistica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFichaArchivistica(FichaArchivistica newFichaArchivistica, NotificationChain msgs) {
		FichaArchivistica oldFichaArchivistica = fichaArchivistica;
		fichaArchivistica = newFichaArchivistica;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA, oldFichaArchivistica, newFichaArchivistica);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFichaArchivistica(FichaArchivistica newFichaArchivistica) {
		if (newFichaArchivistica != fichaArchivistica) {
			NotificationChain msgs = null;
			if (fichaArchivistica != null)
				msgs = ((InternalEObject)fichaArchivistica).eInverseRemove(this, SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO, FichaArchivistica.class, msgs);
			if (newFichaArchivistica != null)
				msgs = ((InternalEObject)newFichaArchivistica).eInverseAdd(this, SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO, FichaArchivistica.class, msgs);
			msgs = basicSetFichaArchivistica(newFichaArchivistica, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA, newFichaArchivistica, newFichaArchivistica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnidades() {
		if (unidades == null) {
			unidades = new EObjectWithInverseResolvingEList.ManyInverse(UnidadOrganica.class, this, SimapaPackage.PROCEDIMIENTO__UNIDADES, SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS);
		}
		return unidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimientos getProcedimientos() {
		if (eContainerFeatureID != SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS) return null;
		return (Procedimientos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramitacionProcedimiento getTramitacionProcedimiento() {
		return tramitacionProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTramitacionProcedimiento(TramitacionProcedimiento newTramitacionProcedimiento, NotificationChain msgs) {
		TramitacionProcedimiento oldTramitacionProcedimiento = tramitacionProcedimiento;
		tramitacionProcedimiento = newTramitacionProcedimiento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO, oldTramitacionProcedimiento, newTramitacionProcedimiento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTramitacionProcedimiento(TramitacionProcedimiento newTramitacionProcedimiento) {
		if (newTramitacionProcedimiento != tramitacionProcedimiento) {
			NotificationChain msgs = null;
			if (tramitacionProcedimiento != null)
				msgs = ((InternalEObject)tramitacionProcedimiento).eInverseRemove(this, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO, TramitacionProcedimiento.class, msgs);
			if (newTramitacionProcedimiento != null)
				msgs = ((InternalEObject)newTramitacionProcedimiento).eInverseAdd(this, SimapaPackage.TRAMITACION_PROCEDIMIENTO__PROCEDIMIENTO, TramitacionProcedimiento.class, msgs);
			msgs = basicSetTramitacionProcedimiento(newTramitacionProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO, newTramitacionProcedimiento, newTramitacionProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsosComoSubProcedimientos() {
		if (usosComoSubProcedimientos == null) {
			usosComoSubProcedimientos = new EObjectWithInverseResolvingEList(Subprocedimiento.class, this, SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS, SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO);
		}
		return usosComoSubProcedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConvocatorias() {
		if (convocatorias == null) {
			convocatorias = new EObjectContainmentWithInverseEList(Convocatoria.class, this, SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS, SimapaPackage.CONVOCATORIA__PROCEDIMIENTO);
		}
		return convocatorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganica getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject)responsable;
			responsable = (UnidadOrganica)eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.PROCEDIMIENTO__RESPONSABLE, oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganica basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsable(UnidadOrganica newResponsable, NotificationChain msgs) {
		UnidadOrganica oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__RESPONSABLE, oldResponsable, newResponsable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(UnidadOrganica newResponsable) {
		if (newResponsable != responsable) {
			NotificationChain msgs = null;
			if (responsable != null)
				msgs = ((InternalEObject)responsable).eInverseRemove(this, SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS, UnidadOrganica.class, msgs);
			if (newResponsable != null)
				msgs = ((InternalEObject)newResponsable).eInverseAdd(this, SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS, UnidadOrganica.class, msgs);
			msgs = basicSetResponsable(newResponsable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__RESPONSABLE, newResponsable, newResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlProcedimiento getControlProcedimiento() {
		return controlProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlProcedimiento(ControlProcedimiento newControlProcedimiento, NotificationChain msgs) {
		ControlProcedimiento oldControlProcedimiento = controlProcedimiento;
		controlProcedimiento = newControlProcedimiento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO, oldControlProcedimiento, newControlProcedimiento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlProcedimiento(ControlProcedimiento newControlProcedimiento) {
		if (newControlProcedimiento != controlProcedimiento) {
			NotificationChain msgs = null;
			if (controlProcedimiento != null)
				msgs = ((InternalEObject)controlProcedimiento).eInverseRemove(this, SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO, ControlProcedimiento.class, msgs);
			if (newControlProcedimiento != null)
				msgs = ((InternalEObject)newControlProcedimiento).eInverseAdd(this, SimapaPackage.CONTROL_PROCEDIMIENTO__PROCEDIMIENTO, ControlProcedimiento.class, msgs);
			msgs = basicSetControlProcedimiento(newControlProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO, newControlProcedimiento, newControlProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNormativas() {
		if (normativas == null) {
			normativas = new EObjectWithInverseResolvingEList.ManyInverse(NormativaYLegislacion.class, this, SimapaPackage.PROCEDIMIENTO__NORMATIVAS, SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS);
		}
		return normativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraFuncional getServicio() {
		if (servicio != null && servicio.eIsProxy()) {
			InternalEObject oldServicio = (InternalEObject)servicio;
			servicio = (EstructuraFuncional)eResolveProxy(oldServicio);
			if (servicio != oldServicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.PROCEDIMIENTO__SERVICIO, oldServicio, servicio));
			}
		}
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraFuncional basicGetServicio() {
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicio(EstructuraFuncional newServicio, NotificationChain msgs) {
		EstructuraFuncional oldServicio = servicio;
		servicio = newServicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__SERVICIO, oldServicio, newServicio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicio(EstructuraFuncional newServicio) {
		if (newServicio != servicio) {
			NotificationChain msgs = null;
			if (servicio != null)
				msgs = ((InternalEObject)servicio).eInverseRemove(this, SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS, EstructuraFuncional.class, msgs);
			if (newServicio != null)
				msgs = ((InternalEObject)newServicio).eInverseAdd(this, SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS, EstructuraFuncional.class, msgs);
			msgs = basicSetServicio(newServicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.PROCEDIMIENTO__SERVICIO, newServicio, newServicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAplicaciones() {
		if (aplicaciones == null) {
			aplicaciones = new EObjectWithInverseResolvingEList.ManyInverse(Aplicacion.class, this, SimapaPackage.PROCEDIMIENTO__APLICACIONES, SimapaPackage.APLICACION__PROCEDIMIENTOS);
		}
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				if (operaciones != null)
					msgs = ((InternalEObject)operaciones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.PROCEDIMIENTO__OPERACIONES, null, msgs);
				return basicSetOperaciones((Operaciones)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				return ((InternalEList)getTerminos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				if (fichaArchivistica != null)
					msgs = ((InternalEObject)fichaArchivistica).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA, null, msgs);
				return basicSetFichaArchivistica((FichaArchivistica)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				return ((InternalEList)getUnidades()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS, msgs);
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				if (tramitacionProcedimiento != null)
					msgs = ((InternalEObject)tramitacionProcedimiento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO, null, msgs);
				return basicSetTramitacionProcedimiento((TramitacionProcedimiento)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS:
				return ((InternalEList)getUsosComoSubProcedimientos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				return ((InternalEList)getConvocatorias()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				if (responsable != null)
					msgs = ((InternalEObject)responsable).eInverseRemove(this, SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS, UnidadOrganica.class, msgs);
				return basicSetResponsable((UnidadOrganica)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				if (controlProcedimiento != null)
					msgs = ((InternalEObject)controlProcedimiento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO, null, msgs);
				return basicSetControlProcedimiento((ControlProcedimiento)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicAdd(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				if (servicio != null)
					msgs = ((InternalEObject)servicio).eInverseRemove(this, SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS, EstructuraFuncional.class, msgs);
				return basicSetServicio((EstructuraFuncional)otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				return basicSetOperaciones(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				return ((InternalEList)getTerminos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				return basicSetFichaArchivistica(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				return ((InternalEList)getUnidades()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS:
				return eBasicSetContainer(null, SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS, msgs);
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				return basicSetTramitacionProcedimiento(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS:
				return ((InternalEList)getUsosComoSubProcedimientos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				return ((InternalEList)getConvocatorias()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				return basicSetResponsable(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				return basicSetControlProcedimiento(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicRemove(otherEnd, msgs);
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				return basicSetServicio(null, msgs);
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS, Procedimientos.class, msgs);
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
			case SimapaPackage.PROCEDIMIENTO__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.PROCEDIMIENTO__CODIGO:
				return getCodigo();
			case SimapaPackage.PROCEDIMIENTO__VERSION:
				return getVersion();
			case SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO:
				return getCodigoCompleto();
			case SimapaPackage.PROCEDIMIENTO__PROP:
				return getProp();
			case SimapaPackage.PROCEDIMIENTO__TITULO:
				return getTitulo();
			case SimapaPackage.PROCEDIMIENTO__OBJETO:
				return getObjeto();
			case SimapaPackage.PROCEDIMIENTO__OBSERVACIONES:
				return getObservaciones();
			case SimapaPackage.PROCEDIMIENTO__PERSONA:
				return getPersona();
			case SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO:
				return getTipoProcedimiento();
			case SimapaPackage.PROCEDIMIENTO__NOTAS:
				return getNotas();
			case SimapaPackage.PROCEDIMIENTO__PERIODICIDAD:
				return getPeriodicidad();
			case SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA:
				return getTituloUltimaConvocatoria();
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				return getOperaciones();
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				return getDocumentos();
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				return getTerminos();
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				return getFichaArchivistica();
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				return getUnidades();
			case SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS:
				return getProcedimientos();
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				return getTramitacionProcedimiento();
			case SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS:
				return getUsosComoSubProcedimientos();
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				return getConvocatorias();
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				return getControlProcedimiento();
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				return getNormativas();
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				if (resolve) return getServicio();
				return basicGetServicio();
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				return getAplicaciones();
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
			case SimapaPackage.PROCEDIMIENTO__CODIGO:
				setCodigo((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__VERSION:
				setVersion((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO:
				setCodigoCompleto((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__PROP:
				setProp((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__TITULO:
				setTitulo((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__OBJETO:
				setObjeto((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__OBSERVACIONES:
				setObservaciones((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__PERSONA:
				setPersona((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO:
				setTipoProcedimiento((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__NOTAS:
				setNotas((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__PERIODICIDAD:
				setPeriodicidad((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA:
				setTituloUltimaConvocatoria((String)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				setOperaciones((Operaciones)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				getTerminos().clear();
				getTerminos().addAll((Collection)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				setFichaArchivistica((FichaArchivistica)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				getUnidades().clear();
				getUnidades().addAll((Collection)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				setTramitacionProcedimiento((TramitacionProcedimiento)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				getConvocatorias().clear();
				getConvocatorias().addAll((Collection)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				setResponsable((UnidadOrganica)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				setControlProcedimiento((ControlProcedimiento)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				getNormativas().clear();
				getNormativas().addAll((Collection)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				setServicio((EstructuraFuncional)newValue);
				return;
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				getAplicaciones().clear();
				getAplicaciones().addAll((Collection)newValue);
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
			case SimapaPackage.PROCEDIMIENTO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO:
				setCodigoCompleto(CODIGO_COMPLETO_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__PROP:
				setProp(PROP_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__OBJETO:
				setObjeto(OBJETO_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__PERSONA:
				setPersona(PERSONA_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO:
				setTipoProcedimiento(TIPO_PROCEDIMIENTO_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__NOTAS:
				setNotas(NOTAS_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__PERIODICIDAD:
				setPeriodicidad(PERIODICIDAD_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA:
				setTituloUltimaConvocatoria(TITULO_ULTIMA_CONVOCATORIA_EDEFAULT);
				return;
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				setOperaciones((Operaciones)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				getDocumentos().clear();
				return;
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				getTerminos().clear();
				return;
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				setFichaArchivistica((FichaArchivistica)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				getUnidades().clear();
				return;
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				setTramitacionProcedimiento((TramitacionProcedimiento)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				getConvocatorias().clear();
				return;
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				setResponsable((UnidadOrganica)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				setControlProcedimiento((ControlProcedimiento)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				getNormativas().clear();
				return;
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				setServicio((EstructuraFuncional)null);
				return;
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				getAplicaciones().clear();
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
			case SimapaPackage.PROCEDIMIENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.PROCEDIMIENTO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.PROCEDIMIENTO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO:
				return CODIGO_COMPLETO_EDEFAULT == null ? codigoCompleto != null : !CODIGO_COMPLETO_EDEFAULT.equals(codigoCompleto);
			case SimapaPackage.PROCEDIMIENTO__PROP:
				return PROP_EDEFAULT == null ? prop != null : !PROP_EDEFAULT.equals(prop);
			case SimapaPackage.PROCEDIMIENTO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case SimapaPackage.PROCEDIMIENTO__OBJETO:
				return OBJETO_EDEFAULT == null ? objeto != null : !OBJETO_EDEFAULT.equals(objeto);
			case SimapaPackage.PROCEDIMIENTO__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case SimapaPackage.PROCEDIMIENTO__PERSONA:
				return PERSONA_EDEFAULT == null ? persona != null : !PERSONA_EDEFAULT.equals(persona);
			case SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO:
				return TIPO_PROCEDIMIENTO_EDEFAULT == null ? tipoProcedimiento != null : !TIPO_PROCEDIMIENTO_EDEFAULT.equals(tipoProcedimiento);
			case SimapaPackage.PROCEDIMIENTO__NOTAS:
				return NOTAS_EDEFAULT == null ? notas != null : !NOTAS_EDEFAULT.equals(notas);
			case SimapaPackage.PROCEDIMIENTO__PERIODICIDAD:
				return PERIODICIDAD_EDEFAULT == null ? periodicidad != null : !PERIODICIDAD_EDEFAULT.equals(periodicidad);
			case SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA:
				return TITULO_ULTIMA_CONVOCATORIA_EDEFAULT == null ? tituloUltimaConvocatoria != null : !TITULO_ULTIMA_CONVOCATORIA_EDEFAULT.equals(tituloUltimaConvocatoria);
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
				return operaciones != null;
			case SimapaPackage.PROCEDIMIENTO__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__TERMINOS:
				return terminos != null && !terminos.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
				return fichaArchivistica != null;
			case SimapaPackage.PROCEDIMIENTO__UNIDADES:
				return unidades != null && !unidades.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS:
				return getProcedimientos() != null;
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
				return tramitacionProcedimiento != null;
			case SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS:
				return usosComoSubProcedimientos != null && !usosComoSubProcedimientos.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
				return convocatorias != null && !convocatorias.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__RESPONSABLE:
				return responsable != null;
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
				return controlProcedimiento != null;
			case SimapaPackage.PROCEDIMIENTO__NORMATIVAS:
				return normativas != null && !normativas.isEmpty();
			case SimapaPackage.PROCEDIMIENTO__SERVICIO:
				return servicio != null;
			case SimapaPackage.PROCEDIMIENTO__APLICACIONES:
				return aplicaciones != null && !aplicaciones.isEmpty();
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", version: ");
		result.append(version);
		result.append(", codigoCompleto: ");
		result.append(codigoCompleto);
		result.append(", prop: ");
		result.append(prop);
		result.append(", titulo: ");
		result.append(titulo);
		result.append(", objeto: ");
		result.append(objeto);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(", persona: ");
		result.append(persona);
		result.append(", tipoProcedimiento: ");
		result.append(tipoProcedimiento);
		result.append(", notas: ");
		result.append(notas);
		result.append(", periodicidad: ");
		result.append(periodicidad);
		result.append(", tituloUltimaConvocatoria: ");
		result.append(tituloUltimaConvocatoria);
		result.append(')');
		return result.toString();
	}

} //ProcedimientoImpl