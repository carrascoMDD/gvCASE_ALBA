
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.util.OrgcasiAnnotationsBuilder;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.CActores;
import es.gva.cit.gvmetrica.orgcasi.CAplicaciones;
import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales;
import es.gva.cit.gvmetrica.orgcasi.CFlujos;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones;
import es.gva.cit.gvmetrica.orgcasi.COperaciones;
import es.gva.cit.gvmetrica.orgcasi.CProcedimientos;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.CSistemas;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario;
import es.gva.cit.gvmetrica.orgcasi.CUnidades;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.ImportadorServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;

import es.gva.cit.simapa.Procedimiento;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AProcedimiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getSubsistemas <em>Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getSucesos <em>Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getUnidadesOrganicas <em>Unidades Organicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getUnidadesExternas <em>Unidades Externas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getSistemas <em>Sistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getTodosSubsistemas <em>Todos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getTodosDocumentos <em>Todos Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AProcedimientoImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AProcedimientoImpl extends AnotacionImpl implements AProcedimiento {
	/**
	 * The cached value of the '{@link #getSubsistemas() <em>Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected CSubsistemas subsistemas = null;

	/**
	 * The cached value of the '{@link #getSucesos() <em>Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucesos()
	 * @generated
	 * @ordered
	 */
	protected CSucesos sucesos = null;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected CDocumentos documentos = null;

	/**
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected CEstructurasDatos estructurasDatos = null;

	/**
	 * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampos()
	 * @generated
	 * @ordered
	 */
	protected CCamposDatos campos = null;

	/**
	 * The cached value of the '{@link #getRelacionesDatos() <em>Relaciones Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesDatos()
	 * @generated
	 * @ordered
	 */
	protected CRelacionesDatos relacionesDatos = null;

	/**
	 * The cached value of the '{@link #getImportacionesServicios() <em>Importaciones Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportacionesServicios()
	 * @generated
	 * @ordered
	 */
	protected CImportacionesServicios importacionesServicios = null;


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
	 * The cached value of the '{@link #getProcedimiento() <em>Procedimiento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected Procedimiento procedimiento = null;

	/**
	 * The cached value of the '{@link #getNormativas() <em>Normativas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativas()
	 * @generated
	 * @ordered
	 */
	protected CNormativasYLegislaciones normativas = null;

	/**
	 * The cached value of the '{@link #getTerminosGlosario() <em>Terminos Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminosGlosario()
	 * @generated
	 * @ordered
	 */
	protected CTerminosGlosario terminosGlosario = null;

	/**
	 * The cached value of the '{@link #getUnidadesOrganicas() <em>Unidades Organicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadesOrganicas()
	 * @generated
	 * @ordered
	 */
	protected CUnidadesOrganicas unidadesOrganicas = null;

	/**
	 * The cached value of the '{@link #getUnidadesExternas() <em>Unidades Externas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadesExternas()
	 * @generated
	 * @ordered
	 */
	protected CUnidadesExternas unidadesExternas = null;

	/**
	 * The cached value of the '{@link #getUnidades() <em>Unidades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidades()
	 * @generated
	 * @ordered
	 */
	protected CUnidades unidades = null;

	/**
	 * The cached value of the '{@link #getEstructurasFuncionales() <em>Estructuras Funcionales</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasFuncionales()
	 * @generated
	 * @ordered
	 */
	protected CEstructurasFuncionales estructurasFuncionales = null;

	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected CAplicaciones aplicaciones = null;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected COperaciones operaciones = null;

	/**
	 * The cached value of the '{@link #getFlujos() <em>Flujos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujos()
	 * @generated
	 * @ordered
	 */
	protected CFlujos flujos = null;

	/**
	 * The cached value of the '{@link #getActores() <em>Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActores()
	 * @generated
	 * @ordered
	 */
	protected CActores actores = null;

	/**
	 * The cached value of the '{@link #getSistemas() <em>Sistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemas()
	 * @generated
	 * @ordered
	 */
	protected CSistemas sistemas = null;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodosSucesos <em>Todos Sucesos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodosSucesos
	 * @generated
	 */
	private static OCLExpression todosSucesosDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodosSubsistemas <em>Todos Subsistemas</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodosSubsistemas
	 * @generated
	 */
	private static OCLExpression todosSubsistemasDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodasEstructurasDatos
	 * @generated
	 */
	private static OCLExpression todasEstructurasDatosDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodosDocumentos <em>Todos Documentos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodosDocumentos
	 * @generated
	 */
	private static OCLExpression todosDocumentosDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getRepositorio <em>Repositorio</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorio
	 * @generated
	 */
	private static OCLExpression repositorioDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected AProcedimientoImpl() {
		super();
		
		setAplicaciones( OrgcasiFactory.eINSTANCE.createCAplicaciones());
		setUnidadesOrganicas( OrgcasiFactory.eINSTANCE.createCUnidadesOrganicas());
		setUnidadesExternas( OrgcasiFactory.eINSTANCE.createCUnidadesExternas());
		setUnidades( OrgcasiFactory.eINSTANCE.createCUnidades());
		setEstructurasFuncionales( OrgcasiFactory.eINSTANCE.createCEstructurasFuncionales());
		setDocumentos( OrgcasiFactory.eINSTANCE.createCDocumentos());
		setTerminosGlosario( OrgcasiFactory.eINSTANCE.createCTerminosGlosario());
		setNormativas( OrgcasiFactory.eINSTANCE.createCNormativasYLegislaciones());
		setFlujos( OrgcasiFactory.eINSTANCE.createCFlujos());
		setOperaciones( OrgcasiFactory.eINSTANCE.createCOperaciones());
		setActores( OrgcasiFactory.eINSTANCE.createCActores());
		setEstructurasDatos( OrgcasiFactory.eINSTANCE.createCEstructurasDatos());
		setRelacionesDatos( OrgcasiFactory.eINSTANCE.createCRelacionesDatos());
		setCampos( OrgcasiFactory.eINSTANCE.createCCamposDatos());
		setImportacionesServicios( OrgcasiFactory.eINSTANCE.createCImportacionesServicios());
		setSistemas( OrgcasiFactory.eINSTANCE.createCSistemas());
		setSubsistemas( OrgcasiFactory.eINSTANCE.createCSubsistemas());
		setSucesos( OrgcasiFactory.eINSTANCE.createCSucesos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.APROCEDIMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubsistemas getSubsistemas() {
		return subsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistemas(CSubsistemas newSubsistemas, NotificationChain msgs) {
		CSubsistemas oldSubsistemas = subsistemas;
		subsistemas = newSubsistemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS, oldSubsistemas, newSubsistemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistemas(CSubsistemas newSubsistemas) {
		if (newSubsistemas != subsistemas) {
			NotificationChain msgs = null;
			if (subsistemas != null)
				msgs = ((InternalEObject)subsistemas).eInverseRemove(this, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, CSubsistemas.class, msgs);
			if (newSubsistemas != null)
				msgs = ((InternalEObject)newSubsistemas).eInverseAdd(this, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, CSubsistemas.class, msgs);
			msgs = basicSetSubsistemas(newSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS, newSubsistemas, newSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSucesos getSucesos() {
		return sucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucesos(CSucesos newSucesos, NotificationChain msgs) {
		CSucesos oldSucesos = sucesos;
		sucesos = newSucesos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SUCESOS, oldSucesos, newSucesos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucesos(CSucesos newSucesos) {
		if (newSucesos != sucesos) {
			NotificationChain msgs = null;
			if (sucesos != null)
				msgs = ((InternalEObject)sucesos).eInverseRemove(this, OrgcasiPackage.CSUCESOS__CONTENEDOR, CSucesos.class, msgs);
			if (newSucesos != null)
				msgs = ((InternalEObject)newSucesos).eInverseAdd(this, OrgcasiPackage.CSUCESOS__CONTENEDOR, CSucesos.class, msgs);
			msgs = basicSetSucesos(newSucesos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SUCESOS, newSucesos, newSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(14);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
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
System.out.println("AProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getProcedimiento() {
		if (procedimiento != null && procedimiento.eIsProxy()) {
			InternalEObject oldProcedimiento = (InternalEObject)procedimiento;
			procedimiento = (Procedimiento)eResolveProxy(oldProcedimiento);
			if (procedimiento != oldProcedimiento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO, oldProcedimiento, procedimiento));
			}
		}
		return procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento basicGetProcedimiento() {
		return procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedimiento(Procedimiento newProcedimiento) {
		Procedimiento oldProcedimiento = procedimiento;
		procedimiento = newProcedimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO, oldProcedimiento, procedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNormativasYLegislaciones getNormativas() {
		return normativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormativas(CNormativasYLegislaciones newNormativas, NotificationChain msgs) {
		CNormativasYLegislaciones oldNormativas = normativas;
		normativas = newNormativas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS, oldNormativas, newNormativas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormativas(CNormativasYLegislaciones newNormativas) {
		if (newNormativas != normativas) {
			NotificationChain msgs = null;
			if (normativas != null)
				msgs = ((InternalEObject)normativas).eInverseRemove(this, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO, CNormativasYLegislaciones.class, msgs);
			if (newNormativas != null)
				msgs = ((InternalEObject)newNormativas).eInverseAdd(this, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO, CNormativasYLegislaciones.class, msgs);
			msgs = basicSetNormativas(newNormativas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS, newNormativas, newNormativas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminosGlosario getTerminosGlosario() {
		return terminosGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminosGlosario(CTerminosGlosario newTerminosGlosario, NotificationChain msgs) {
		CTerminosGlosario oldTerminosGlosario = terminosGlosario;
		terminosGlosario = newTerminosGlosario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO, oldTerminosGlosario, newTerminosGlosario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminosGlosario(CTerminosGlosario newTerminosGlosario) {
		if (newTerminosGlosario != terminosGlosario) {
			NotificationChain msgs = null;
			if (terminosGlosario != null)
				msgs = ((InternalEObject)terminosGlosario).eInverseRemove(this, OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO, CTerminosGlosario.class, msgs);
			if (newTerminosGlosario != null)
				msgs = ((InternalEObject)newTerminosGlosario).eInverseAdd(this, OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO, CTerminosGlosario.class, msgs);
			msgs = basicSetTerminosGlosario(newTerminosGlosario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO, newTerminosGlosario, newTerminosGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesOrganicas getUnidadesOrganicas() {
		return unidadesOrganicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadesOrganicas(CUnidadesOrganicas newUnidadesOrganicas, NotificationChain msgs) {
		CUnidadesOrganicas oldUnidadesOrganicas = unidadesOrganicas;
		unidadesOrganicas = newUnidadesOrganicas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS, oldUnidadesOrganicas, newUnidadesOrganicas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadesOrganicas(CUnidadesOrganicas newUnidadesOrganicas) {
		if (newUnidadesOrganicas != unidadesOrganicas) {
			NotificationChain msgs = null;
			if (unidadesOrganicas != null)
				msgs = ((InternalEObject)unidadesOrganicas).eInverseRemove(this, OrgcasiPackage.CUNIDADES_ORGANICAS__PROCEDIMIENTO, CUnidadesOrganicas.class, msgs);
			if (newUnidadesOrganicas != null)
				msgs = ((InternalEObject)newUnidadesOrganicas).eInverseAdd(this, OrgcasiPackage.CUNIDADES_ORGANICAS__PROCEDIMIENTO, CUnidadesOrganicas.class, msgs);
			msgs = basicSetUnidadesOrganicas(newUnidadesOrganicas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS, newUnidadesOrganicas, newUnidadesOrganicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesExternas getUnidadesExternas() {
		return unidadesExternas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadesExternas(CUnidadesExternas newUnidadesExternas, NotificationChain msgs) {
		CUnidadesExternas oldUnidadesExternas = unidadesExternas;
		unidadesExternas = newUnidadesExternas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS, oldUnidadesExternas, newUnidadesExternas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadesExternas(CUnidadesExternas newUnidadesExternas) {
		if (newUnidadesExternas != unidadesExternas) {
			NotificationChain msgs = null;
			if (unidadesExternas != null)
				msgs = ((InternalEObject)unidadesExternas).eInverseRemove(this, OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO, CUnidadesExternas.class, msgs);
			if (newUnidadesExternas != null)
				msgs = ((InternalEObject)newUnidadesExternas).eInverseAdd(this, OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO, CUnidadesExternas.class, msgs);
			msgs = basicSetUnidadesExternas(newUnidadesExternas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS, newUnidadesExternas, newUnidadesExternas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidades getUnidades() {
		return unidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidades(CUnidades newUnidades, NotificationChain msgs) {
		CUnidades oldUnidades = unidades;
		unidades = newUnidades;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES, oldUnidades, newUnidades);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidades(CUnidades newUnidades) {
		if (newUnidades != unidades) {
			NotificationChain msgs = null;
			if (unidades != null)
				msgs = ((InternalEObject)unidades).eInverseRemove(this, OrgcasiPackage.CUNIDADES__PROCEDIMIENTO, CUnidades.class, msgs);
			if (newUnidades != null)
				msgs = ((InternalEObject)newUnidades).eInverseAdd(this, OrgcasiPackage.CUNIDADES__PROCEDIMIENTO, CUnidades.class, msgs);
			msgs = basicSetUnidades(newUnidades, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__UNIDADES, newUnidades, newUnidades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasFuncionales getEstructurasFuncionales() {
		return estructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasFuncionales(CEstructurasFuncionales newEstructurasFuncionales, NotificationChain msgs) {
		CEstructurasFuncionales oldEstructurasFuncionales = estructurasFuncionales;
		estructurasFuncionales = newEstructurasFuncionales;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES, oldEstructurasFuncionales, newEstructurasFuncionales);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasFuncionales(CEstructurasFuncionales newEstructurasFuncionales) {
		if (newEstructurasFuncionales != estructurasFuncionales) {
			NotificationChain msgs = null;
			if (estructurasFuncionales != null)
				msgs = ((InternalEObject)estructurasFuncionales).eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO, CEstructurasFuncionales.class, msgs);
			if (newEstructurasFuncionales != null)
				msgs = ((InternalEObject)newEstructurasFuncionales).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO, CEstructurasFuncionales.class, msgs);
			msgs = basicSetEstructurasFuncionales(newEstructurasFuncionales, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES, newEstructurasFuncionales, newEstructurasFuncionales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COperaciones getOperaciones() {
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperaciones(COperaciones newOperaciones, NotificationChain msgs) {
		COperaciones oldOperaciones = operaciones;
		operaciones = newOperaciones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__OPERACIONES, oldOperaciones, newOperaciones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperaciones(COperaciones newOperaciones) {
		if (newOperaciones != operaciones) {
			NotificationChain msgs = null;
			if (operaciones != null)
				msgs = ((InternalEObject)operaciones).eInverseRemove(this, OrgcasiPackage.COPERACIONES__PROCEDIMIENTO, COperaciones.class, msgs);
			if (newOperaciones != null)
				msgs = ((InternalEObject)newOperaciones).eInverseAdd(this, OrgcasiPackage.COPERACIONES__PROCEDIMIENTO, COperaciones.class, msgs);
			msgs = basicSetOperaciones(newOperaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__OPERACIONES, newOperaciones, newOperaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDocumentos getDocumentos() {
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentos(CDocumentos newDocumentos, NotificationChain msgs) {
		CDocumentos oldDocumentos = documentos;
		documentos = newDocumentos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS, oldDocumentos, newDocumentos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentos(CDocumentos newDocumentos) {
		if (newDocumentos != documentos) {
			NotificationChain msgs = null;
			if (documentos != null)
				msgs = ((InternalEObject)documentos).eInverseRemove(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			if (newDocumentos != null)
				msgs = ((InternalEObject)newDocumentos).eInverseAdd(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			msgs = basicSetDocumentos(newDocumentos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS, newDocumentos, newDocumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAplicaciones getAplicaciones() {
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAplicaciones(CAplicaciones newAplicaciones, NotificationChain msgs) {
		CAplicaciones oldAplicaciones = aplicaciones;
		aplicaciones = newAplicaciones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__APLICACIONES, oldAplicaciones, newAplicaciones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAplicaciones(CAplicaciones newAplicaciones) {
		if (newAplicaciones != aplicaciones) {
			NotificationChain msgs = null;
			if (aplicaciones != null)
				msgs = ((InternalEObject)aplicaciones).eInverseRemove(this, OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO, CAplicaciones.class, msgs);
			if (newAplicaciones != null)
				msgs = ((InternalEObject)newAplicaciones).eInverseAdd(this, OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO, CAplicaciones.class, msgs);
			msgs = basicSetAplicaciones(newAplicaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__APLICACIONES, newAplicaciones, newAplicaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatos getEstructurasDatos() {
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasDatos(CEstructurasDatos newEstructurasDatos, NotificationChain msgs) {
		CEstructurasDatos oldEstructurasDatos = estructurasDatos;
		estructurasDatos = newEstructurasDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS, oldEstructurasDatos, newEstructurasDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasDatos(CEstructurasDatos newEstructurasDatos) {
		if (newEstructurasDatos != estructurasDatos) {
			NotificationChain msgs = null;
			if (estructurasDatos != null)
				msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			if (newEstructurasDatos != null)
				msgs = ((InternalEObject)newEstructurasDatos).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			msgs = basicSetEstructurasDatos(newEstructurasDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS, newEstructurasDatos, newEstructurasDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCamposDatos getCampos() {
		return campos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampos(CCamposDatos newCampos, NotificationChain msgs) {
		CCamposDatos oldCampos = campos;
		campos = newCampos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__CAMPOS, oldCampos, newCampos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCampos(CCamposDatos newCampos) {
		if (newCampos != campos) {
			NotificationChain msgs = null;
			if (campos != null)
				msgs = ((InternalEObject)campos).eInverseRemove(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			if (newCampos != null)
				msgs = ((InternalEObject)newCampos).eInverseAdd(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			msgs = basicSetCampos(newCampos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__CAMPOS, newCampos, newCampos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelacionesDatos getRelacionesDatos() {
		return relacionesDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelacionesDatos(CRelacionesDatos newRelacionesDatos, NotificationChain msgs) {
		CRelacionesDatos oldRelacionesDatos = relacionesDatos;
		relacionesDatos = newRelacionesDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS, oldRelacionesDatos, newRelacionesDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionesDatos(CRelacionesDatos newRelacionesDatos) {
		if (newRelacionesDatos != relacionesDatos) {
			NotificationChain msgs = null;
			if (relacionesDatos != null)
				msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			if (newRelacionesDatos != null)
				msgs = ((InternalEObject)newRelacionesDatos).eInverseAdd(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			msgs = basicSetRelacionesDatos(newRelacionesDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS, newRelacionesDatos, newRelacionesDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CActores getActores() {
		return actores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActores(CActores newActores, NotificationChain msgs) {
		CActores oldActores = actores;
		actores = newActores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ACTORES, oldActores, newActores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActores(CActores newActores) {
		if (newActores != actores) {
			NotificationChain msgs = null;
			if (actores != null)
				msgs = ((InternalEObject)actores).eInverseRemove(this, OrgcasiPackage.CACTORES__PROCEDIMIENTO, CActores.class, msgs);
			if (newActores != null)
				msgs = ((InternalEObject)newActores).eInverseAdd(this, OrgcasiPackage.CACTORES__PROCEDIMIENTO, CActores.class, msgs);
			msgs = basicSetActores(newActores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__ACTORES, newActores, newActores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSistemas getSistemas() {
		return sistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSistemas(CSistemas newSistemas, NotificationChain msgs) {
		CSistemas oldSistemas = sistemas;
		sistemas = newSistemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SISTEMAS, oldSistemas, newSistemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemas(CSistemas newSistemas) {
		if (newSistemas != sistemas) {
			NotificationChain msgs = null;
			if (sistemas != null)
				msgs = ((InternalEObject)sistemas).eInverseRemove(this, OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO, CSistemas.class, msgs);
			if (newSistemas != null)
				msgs = ((InternalEObject)newSistemas).eInverseAdd(this, OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO, CSistemas.class, msgs);
			msgs = basicSetSistemas(newSistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__SISTEMAS, newSistemas, newSistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesServicios getImportacionesServicios() {
		return importacionesServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportacionesServicios(CImportacionesServicios newImportacionesServicios, NotificationChain msgs) {
		CImportacionesServicios oldImportacionesServicios = importacionesServicios;
		importacionesServicios = newImportacionesServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS, oldImportacionesServicios, newImportacionesServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportacionesServicios(CImportacionesServicios newImportacionesServicios) {
		if (newImportacionesServicios != importacionesServicios) {
			NotificationChain msgs = null;
			if (importacionesServicios != null)
				msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			if (newImportacionesServicios != null)
				msgs = ((InternalEObject)newImportacionesServicios).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			msgs = basicSetImportacionesServicios(newImportacionesServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS, newImportacionesServicios, newImportacionesServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlujos getFlujos() {
		return flujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlujos(CFlujos newFlujos, NotificationChain msgs) {
		CFlujos oldFlujos = flujos;
		flujos = newFlujos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__FLUJOS, oldFlujos, newFlujos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlujos(CFlujos newFlujos) {
		if (newFlujos != flujos) {
			NotificationChain msgs = null;
			if (flujos != null)
				msgs = ((InternalEObject)flujos).eInverseRemove(this, OrgcasiPackage.CFLUJOS__PROCEDIMIENTO, CFlujos.class, msgs);
			if (newFlujos != null)
				msgs = ((InternalEObject)newFlujos).eInverseAdd(this, OrgcasiPackage.CFLUJOS__PROCEDIMIENTO, CFlujos.class, msgs);
			msgs = basicSetFlujos(newFlujos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__FLUJOS, newFlujos, newFlujos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CProcedimientos getProcedimientos() {
		if (eContainerFeatureID != OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS) return null;
		return (CProcedimientos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedimientos(CProcedimientos newProcedimientos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcedimientos, OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedimientos(CProcedimientos newProcedimientos) {
		if (newProcedimientos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS && newProcedimientos != null)) {
			if (EcoreUtil.isAncestor(this, newProcedimientos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcedimientos != null)
				msgs = ((InternalEObject)newProcedimientos).eInverseAdd(this, OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS, CProcedimientos.class, msgs);
			msgs = basicSetProcedimientos(newProcedimientos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS, newProcedimientos, newProcedimientos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosSucesos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(28);
	
//		if (todosSucesosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosSucesosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
System.out.println("todosSucesos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosSucesosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("AProcedimiento");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento todosSucesos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosSubsistemas() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(29);
	
//		if (todosSubsistemasDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosSubsistemasDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
System.out.println("todosSubsistemas");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosSubsistemasDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("AProcedimiento");
System.out.println("todosSubsistemas");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("todosSubsistemas");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento todosSubsistemas", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodasEstructurasDatos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(30);
	
//		if (todasEstructurasDatosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todasEstructurasDatosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
System.out.println("todasEstructurasDatos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todasEstructurasDatosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("AProcedimiento");
System.out.println("todasEstructurasDatos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("todasEstructurasDatos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento todasEstructurasDatos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosDocumentos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(31);
	
//		if (todosDocumentosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosDocumentosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
System.out.println("todosDocumentos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosDocumentosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("AProcedimiento");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento todosDocumentos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio getRepositorio() {
		ARepositorio repositorio = basicGetRepositorio();
		return repositorio != null && repositorio.eIsProxy() ? (ARepositorio)eResolveProxy((InternalEObject)repositorio) : repositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio basicGetRepositorio() {
//		if (repositorioDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAProcedimiento().getEAllStructuralFeatures().get(32);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				repositorioDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AProcedimiento");
System.out.println("repositorio");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(repositorioDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("AProcedimiento");
System.out.println("repositorio");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (ARepositorio) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AProcedimiento");
System.out.println("repositorio");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AProcedimiento repositorio", anException);
		}
	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public int crearAnotaciones() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return OrgcasiAnnotationsBuilder.createAnotacionesParaProcedimiento( this);
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				if (subsistemas != null)
					msgs = ((InternalEObject)subsistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS, null, msgs);
				return basicSetSubsistemas((CSubsistemas)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				if (sucesos != null)
					msgs = ((InternalEObject)sucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__SUCESOS, null, msgs);
				return basicSetSucesos((CSucesos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				if (documentos != null)
					msgs = ((InternalEObject)documentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS, null, msgs);
				return basicSetDocumentos((CDocumentos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				if (estructurasDatos != null)
					msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS, null, msgs);
				return basicSetEstructurasDatos((CEstructurasDatos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				if (campos != null)
					msgs = ((InternalEObject)campos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__CAMPOS, null, msgs);
				return basicSetCampos((CCamposDatos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				if (relacionesDatos != null)
					msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS, null, msgs);
				return basicSetRelacionesDatos((CRelacionesDatos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				if (importacionesServicios != null)
					msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS, null, msgs);
				return basicSetImportacionesServicios((CImportacionesServicios)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				if (normativas != null)
					msgs = ((InternalEObject)normativas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS, null, msgs);
				return basicSetNormativas((CNormativasYLegislaciones)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				if (terminosGlosario != null)
					msgs = ((InternalEObject)terminosGlosario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO, null, msgs);
				return basicSetTerminosGlosario((CTerminosGlosario)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				if (unidadesOrganicas != null)
					msgs = ((InternalEObject)unidadesOrganicas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS, null, msgs);
				return basicSetUnidadesOrganicas((CUnidadesOrganicas)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				if (unidadesExternas != null)
					msgs = ((InternalEObject)unidadesExternas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS, null, msgs);
				return basicSetUnidadesExternas((CUnidadesExternas)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				if (unidades != null)
					msgs = ((InternalEObject)unidades).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__UNIDADES, null, msgs);
				return basicSetUnidades((CUnidades)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				if (estructurasFuncionales != null)
					msgs = ((InternalEObject)estructurasFuncionales).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES, null, msgs);
				return basicSetEstructurasFuncionales((CEstructurasFuncionales)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				if (aplicaciones != null)
					msgs = ((InternalEObject)aplicaciones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__APLICACIONES, null, msgs);
				return basicSetAplicaciones((CAplicaciones)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				if (operaciones != null)
					msgs = ((InternalEObject)operaciones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__OPERACIONES, null, msgs);
				return basicSetOperaciones((COperaciones)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				if (flujos != null)
					msgs = ((InternalEObject)flujos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__FLUJOS, null, msgs);
				return basicSetFlujos((CFlujos)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				if (actores != null)
					msgs = ((InternalEObject)actores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__ACTORES, null, msgs);
				return basicSetActores((CActores)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				if (sistemas != null)
					msgs = ((InternalEObject)sistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.APROCEDIMIENTO__SISTEMAS, null, msgs);
				return basicSetSistemas((CSistemas)otherEnd, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcedimientos((CProcedimientos)otherEnd, msgs);
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
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				return basicSetSubsistemas(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				return basicSetSucesos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				return basicSetDocumentos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				return basicSetEstructurasDatos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				return basicSetCampos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				return basicSetRelacionesDatos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				return basicSetImportacionesServicios(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				return basicSetNormativas(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				return basicSetTerminosGlosario(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				return basicSetUnidadesOrganicas(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				return basicSetUnidadesExternas(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				return basicSetUnidades(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				return basicSetEstructurasFuncionales(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				return basicSetAplicaciones(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				return basicSetOperaciones(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				return basicSetFlujos(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				return basicSetActores(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				return basicSetSistemas(null, msgs);
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				return basicSetProcedimientos(null, msgs);
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
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS, CProcedimientos.class, msgs);
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
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				return getSubsistemas();
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				return getSucesos();
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				return getDocumentos();
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				return getCampos();
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				return getRelacionesDatos();
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				return getImportacionesServicios();
			case OrgcasiPackage.APROCEDIMIENTO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO:
				if (resolve) return getProcedimiento();
				return basicGetProcedimiento();
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				return getNormativas();
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				return getTerminosGlosario();
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				return getUnidadesOrganicas();
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				return getUnidadesExternas();
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				return getUnidades();
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales();
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				return getAplicaciones();
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				return getOperaciones();
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				return getFlujos();
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				return getActores();
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				return getSistemas();
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				return getProcedimientos();
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_SUCESOS:
				return getTodosSucesos();
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_SUBSISTEMAS:
				return getTodosSubsistemas();
			case OrgcasiPackage.APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS:
				return getTodasEstructurasDatos();
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_DOCUMENTOS:
				return getTodosDocumentos();
			case OrgcasiPackage.APROCEDIMIENTO__REPOSITORIO:
				if (resolve) return getRepositorio();
				return basicGetRepositorio();
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
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				setSucesos((CSucesos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				setDocumentos((CDocumentos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				setCampos((CCamposDatos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO:
				setProcedimiento((Procedimiento)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				setNormativas((CNormativasYLegislaciones)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				setTerminosGlosario((CTerminosGlosario)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				setUnidadesOrganicas((CUnidadesOrganicas)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				setUnidadesExternas((CUnidadesExternas)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				setUnidades((CUnidades)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((CEstructurasFuncionales)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				setAplicaciones((CAplicaciones)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				setOperaciones((COperaciones)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				setFlujos((CFlujos)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				setActores((CActores)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				setSistemas((CSistemas)newValue);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				setProcedimientos((CProcedimientos)newValue);
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
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				setSucesos((CSucesos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				setDocumentos((CDocumentos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				setCampos((CCamposDatos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO:
				setProcedimiento((Procedimiento)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				setNormativas((CNormativasYLegislaciones)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				setTerminosGlosario((CTerminosGlosario)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				setUnidadesOrganicas((CUnidadesOrganicas)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				setUnidadesExternas((CUnidadesExternas)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				setUnidades((CUnidades)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((CEstructurasFuncionales)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				setAplicaciones((CAplicaciones)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				setOperaciones((COperaciones)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				setFlujos((CFlujos)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				setActores((CActores)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				setSistemas((CSistemas)null);
				return;
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				setProcedimientos((CProcedimientos)null);
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
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
				return subsistemas != null;
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
				return sucesos != null;
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
				return documentos != null;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
				return estructurasDatos != null;
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
				return campos != null;
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
				return relacionesDatos != null;
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
				return importacionesServicios != null;
			case OrgcasiPackage.APROCEDIMIENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTO:
				return procedimiento != null;
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
				return normativas != null;
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
				return terminosGlosario != null;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
				return unidadesOrganicas != null;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
				return unidadesExternas != null;
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
				return unidades != null;
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
				return estructurasFuncionales != null;
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
				return aplicaciones != null;
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
				return operaciones != null;
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
				return flujos != null;
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
				return actores != null;
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
				return sistemas != null;
			case OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS:
				return getProcedimientos() != null;
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_SUCESOS:
				return !getTodosSucesos().isEmpty();
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_SUBSISTEMAS:
				return !getTodosSubsistemas().isEmpty();
			case OrgcasiPackage.APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS:
				return !getTodasEstructurasDatos().isEmpty();
			case OrgcasiPackage.APROCEDIMIENTO__TODOS_DOCUMENTOS:
				return !getTodosDocumentos().isEmpty();
			case OrgcasiPackage.APROCEDIMIENTO__REPOSITORIO:
				return basicGetRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorSubsistemas.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS: return OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorSucesos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.APROCEDIMIENTO__SUCESOS: return OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDocumentos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS: return OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDatos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS: return OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS;
				case OrgcasiPackage.APROCEDIMIENTO__CAMPOS: return OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS;
				case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS: return OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS;
				default: return -1;
			}
		}
		if (baseClass == ImportadorServicios.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS: return OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ContenedorSubsistemas.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS: return OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorSucesos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS: return OrgcasiPackage.APROCEDIMIENTO__SUCESOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDocumentos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS: return OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDatos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS: return OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS;
				case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS: return OrgcasiPackage.APROCEDIMIENTO__CAMPOS;
				case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS: return OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS;
				default: return -1;
			}
		}
		if (baseClass == ImportadorServicios.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS: return OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AProcedimientoImpl