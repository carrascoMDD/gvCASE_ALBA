
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ActividadAbstracta;
import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;
import es.gva.cit.gvmetrica.proinso.Tarea;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
 * An implementation of the model object '<em><b>Actividad Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getCodigoYNombre <em>Codigo YNombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getTareas <em>Tareas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getPredecesores <em>Predecesores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadAbstractaImpl#getSucesores <em>Sucesores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadAbstractaImpl extends ProinsoObjectImpl implements ActividadAbstracta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getDocumentacion() <em>Documentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected Documentacion documentacion = null;

	/**
	 * The cached value of the '{@link #getReferencias() <em>Referencias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencias()
	 * @generated
	 * @ordered
	 */
	protected EList referencias = null;

	/**
	 * The default value of the '{@link #getCodigoYNombre() <em>Codigo YNombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoYNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_YNOMBRE_EDEFAULT = null;

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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTareas() <em>Tareas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTareas()
	 * @generated
	 * @ordered
	 */
	protected EList tareas = null;

	/**
	 * The cached value of the '{@link #getPredecesores() <em>Predecesores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesores()
	 * @generated
	 * @ordered
	 */
	protected EList predecesores = null;

	/**
	 * The cached value of the '{@link #getSucesores() <em>Sucesores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucesores()
	 * @generated
	 * @ordered
	 */
	protected EList sucesores = null;


	/**
	 * The parsed OCL expression for the definition of the '{@link #nombre_validar <em>Nombre validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nombre_validar
	 * @generated
	 */
	private static OCLExpression nombre_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #codigo_validar <em>Codigo validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #codigo_validar
	 * @generated
	 */
	private static OCLExpression codigo_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #todosPredecesores <em>Todos Predecesores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #todosPredecesores
	 * @generated
	 */
	private static OCLExpression todosPredecesoresBodyOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #todosSucesores <em>Todos Sucesores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #todosSucesores
	 * @generated
	 */
	private static OCLExpression todosSucesoresBodyOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #predecesores_validar <em>Predecesores validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #predecesores_validar
	 * @generated
	 */
	private static OCLExpression predecesores_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #predecesores_candidates <em>Predecesores candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #predecesores_candidates
	 * @generated
	 */
	private static OCLExpression predecesores_candidatesBodyOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #sucesores_validar <em>Sucesores validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #sucesores_validar
	 * @generated
	 */
	private static OCLExpression sucesores_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the body of the '{@link #sucesores_candidates <em>Sucesores candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #sucesores_candidates
	 * @generated
	 */
	private static OCLExpression sucesores_candidatesBodyOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getCodigoYNombre <em>Codigo YNombre</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoYNombre
	 * @generated
	 */
	private static OCLExpression codigoYNombreDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getCodigoCompleto <em>Codigo Completo</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoCompleto
	 * @generated
	 */
	private static OCLExpression codigoCompletoDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentacion getDocumentacion() {
		return documentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentacion(Documentacion newDocumentacion, NotificationChain msgs) {
		Documentacion oldDocumentacion = documentacion;
		documentacion = newDocumentacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION, oldDocumentacion, newDocumentacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentacion(Documentacion newDocumentacion) {
		if (newDocumentacion != documentacion) {
			NotificationChain msgs = null;
			if (documentacion != null)
				msgs = ((InternalEObject)documentacion).eInverseRemove(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			if (newDocumentacion != null)
				msgs = ((InternalEObject)newDocumentacion).eInverseAdd(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			msgs = basicSetDocumentacion(newDocumentacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION, newDocumentacion, newDocumentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
		}
		return referencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoYNombre() {
//		if (codigoYNombreDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getActividadAbstracta().getEAllStructuralFeatures().get(3);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				codigoYNombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ActividadAbstracta");
System.out.println("codigoYNombre");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(codigoYNombreDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("ActividadAbstracta");
System.out.println("codigoYNombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ActividadAbstracta");
System.out.println("codigoYNombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ActividadAbstracta codigoYNombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoCompleto() {
//		if (codigoCompletoDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getActividadAbstracta().getEAllStructuralFeatures().get(4);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				codigoCompletoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ActividadAbstracta");
System.out.println("codigoCompleto");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(codigoCompletoDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("ActividadAbstracta");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ActividadAbstracta");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ActividadAbstracta codigoCompleto", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTareas() {
		if (tareas == null) {
			tareas = new EObjectContainmentWithInverseEList(Tarea.class, this, ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS, ProinsoPackage.TAREA__ACTIVIDAD);
		}
		return tareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPredecesores() {
		if (predecesores == null) {
			predecesores = new EObjectWithInverseResolvingEList.ManyInverse(ActividadAbstracta.class, this, ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES, ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES);
		}
		return predecesores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSucesores() {
		if (sucesores == null) {
			sucesores = new EObjectWithInverseResolvingEList.ManyInverse(ActividadAbstracta.class, this, ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES, ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES);
		}
		return sucesores;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (nombre_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(0);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				nombre_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(nombre_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.ACTIVIDAD_ABSTRACTA__NOMBRE_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nombre_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean codigo_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (codigo_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				codigo_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(codigo_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.ACTIVIDAD_ABSTRACTA__CODIGO_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "codigo_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList todosPredecesores() {
		if (todosPredecesoresBodyOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(2);
			Environment env = ExpressionsUtil.createOperationContext(eClass(), eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("body");
			
			try {
				todosPredecesoresBodyOCL = ExpressionsUtil.createQuery(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosPredecesoresBodyOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
	
		query.setEvaluationEnvironment(evalEnv);
	
		Collection result = (Collection) query.evaluate(this);
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList todosSucesores() {
		if (todosSucesoresBodyOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(3);
			Environment env = ExpressionsUtil.createOperationContext(eClass(), eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("body");
			
			try {
				todosSucesoresBodyOCL = ExpressionsUtil.createQuery(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosSucesoresBodyOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
	
		query.setEvaluationEnvironment(evalEnv);
	
		Collection result = (Collection) query.evaluate(this);
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean predecesores_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (predecesores_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(4);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				predecesores_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(predecesores_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.ACTIVIDAD_ABSTRACTA__PREDECESORES_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "predecesores_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList predecesores_candidates() {
		if (predecesores_candidatesBodyOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(5);
			Environment env = ExpressionsUtil.createOperationContext(eClass(), eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("body");
			
			try {
				predecesores_candidatesBodyOCL = ExpressionsUtil.createQuery(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(predecesores_candidatesBodyOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
	
		query.setEvaluationEnvironment(evalEnv);
	
		Collection result = (Collection) query.evaluate(this);
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sucesores_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (sucesores_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(6);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				sucesores_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(sucesores_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.ACTIVIDAD_ABSTRACTA__SUCESORES_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sucesores_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList sucesores_candidates() {
		if (sucesores_candidatesBodyOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(7);
			Environment env = ExpressionsUtil.createOperationContext(eClass(), eOperation);
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("body");
			
			try {
				sucesores_candidatesBodyOCL = ExpressionsUtil.createQuery(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(sucesores_candidatesBodyOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
	
		query.setEvaluationEnvironment(evalEnv);
	
		Collection result = (Collection) query.evaluate(this);
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				if (documentacion != null)
					msgs = ((InternalEObject)documentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION, null, msgs);
				return basicSetDocumentacion((Documentacion)otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				return ((InternalEList)getTareas()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				return ((InternalEList)getPredecesores()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				return ((InternalEList)getSucesores()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				return basicSetDocumentacion(null, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				return ((InternalEList)getTareas()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				return ((InternalEList)getPredecesores()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				return ((InternalEList)getSucesores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				return getDocumentacion();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE:
				return getCodigoYNombre();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO:
				return getCodigoCompleto();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO:
				return getCodigo();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE:
				return getNombre();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				return getTareas();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				return getPredecesores();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				return getSucesores();
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
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				setDocumentacion((Documentacion)newValue);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO:
				setCodigo((String)newValue);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				getTareas().clear();
				getTareas().addAll((Collection)newValue);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				getPredecesores().clear();
				getPredecesores().addAll((Collection)newValue);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				getSucesores().clear();
				getSucesores().addAll((Collection)newValue);
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
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				setDocumentacion((Documentacion)null);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				getTareas().clear();
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				getPredecesores().clear();
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				getSucesores().clear();
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
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
				return documentacion != null;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE:
				return CODIGO_YNOMBRE_EDEFAULT == null ? getCodigoYNombre() != null : !CODIGO_YNOMBRE_EDEFAULT.equals(getCodigoYNombre());
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO:
				return CODIGO_COMPLETO_EDEFAULT == null ? getCodigoCompleto() != null : !CODIGO_COMPLETO_EDEFAULT.equals(getCodigoCompleto());
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
				return tareas != null && !tareas.isEmpty();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__PREDECESORES:
				return predecesores != null && !predecesores.isEmpty();
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__SUCESORES:
				return sucesores != null && !sucesores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ConDocumentacion.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION: return ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
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
		if (baseClass == ConDocumentacion.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION: return ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.ACTIVIDAD_ABSTRACTA__REFERENCIAS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ActividadAbstractaImpl