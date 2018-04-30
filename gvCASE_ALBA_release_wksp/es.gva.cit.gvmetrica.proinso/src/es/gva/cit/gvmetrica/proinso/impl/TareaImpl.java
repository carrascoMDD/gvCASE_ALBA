
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ActividadAbstracta;
import es.gva.cit.gvmetrica.proinso.Participacion;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;
import es.gva.cit.gvmetrica.proinso.Tarea;
import es.gva.cit.gvmetrica.proinso.UsoFlujo;
import es.gva.cit.gvmetrica.proinso.UsoPractica;
import es.gva.cit.gvmetrica.proinso.UsoTecnica;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
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
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getCodigoYNombre <em>Codigo YNombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getActividad <em>Actividad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getParticipaciones <em>Participaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getUsoPracticas <em>Uso Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TareaImpl#getUsoTecnicas <em>Uso Tecnicas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TareaImpl extends ConDocumentacionImpl implements Tarea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

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
	 * The cached value of the '{@link #getFlujos() <em>Flujos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujos()
	 * @generated
	 * @ordered
	 */
	protected EList flujos = null;

	/**
	 * The cached value of the '{@link #getParticipaciones() <em>Participaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipaciones()
	 * @generated
	 * @ordered
	 */
	protected EList participaciones = null;

	/**
	 * The cached value of the '{@link #getUsoPracticas() <em>Uso Practicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsoPracticas()
	 * @generated
	 * @ordered
	 */
	protected EList usoPracticas = null;

	/**
	 * The cached value of the '{@link #getUsoTecnicas() <em>Uso Tecnicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsoTecnicas()
	 * @generated
	 * @ordered
	 */
	protected EList usoTecnicas = null;


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
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.TAREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.TAREA__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
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
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getTarea().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				codigoYNombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Tarea");
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
System.out.println("Tarea");
System.out.println("codigoYNombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Tarea");
System.out.println("codigoYNombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Tarea codigoYNombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoCompleto() {
//		if (codigoCompletoDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getTarea().getEAllStructuralFeatures().get(3);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				codigoCompletoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Tarea");
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
System.out.println("Tarea");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Tarea");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Tarea codigoCompleto", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.TAREA__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.TAREA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadAbstracta getActividad() {
		if (eContainerFeatureID != ProinsoPackage.TAREA__ACTIVIDAD) return null;
		return (ActividadAbstracta)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujos() {
		if (flujos == null) {
			flujos = new EObjectContainmentWithInverseEList(UsoFlujo.class, this, ProinsoPackage.TAREA__FLUJOS, ProinsoPackage.USO_FLUJO__TAREA);
		}
		return flujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParticipaciones() {
		if (participaciones == null) {
			participaciones = new EObjectContainmentWithInverseEList(Participacion.class, this, ProinsoPackage.TAREA__PARTICIPACIONES, ProinsoPackage.PARTICIPACION__TAREA);
		}
		return participaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsoPracticas() {
		if (usoPracticas == null) {
			usoPracticas = new EObjectContainmentWithInverseEList(UsoPractica.class, this, ProinsoPackage.TAREA__USO_PRACTICAS, ProinsoPackage.USO_PRACTICA__TAREA);
		}
		return usoPracticas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsoTecnicas() {
		if (usoTecnicas == null) {
			usoTecnicas = new EObjectContainmentWithInverseEList(UsoTecnica.class, this, ProinsoPackage.TAREA__USO_TECNICAS, ProinsoPackage.USO_TECNICA__TAREA);
		}
		return usoTecnicas;
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
						 ProinsoValidator.TAREA__NOMBRE_VALIDAR,
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
						 ProinsoValidator.TAREA__CODIGO_VALIDAR,
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.TAREA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TAREA__ACTIVIDAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.TAREA__ACTIVIDAD, msgs);
			case ProinsoPackage.TAREA__FLUJOS:
				return ((InternalEList)getFlujos()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				return ((InternalEList)getParticipaciones()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				return ((InternalEList)getUsoPracticas()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TAREA__USO_TECNICAS:
				return ((InternalEList)getUsoTecnicas()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.TAREA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TAREA__ACTIVIDAD:
				return eBasicSetContainer(null, ProinsoPackage.TAREA__ACTIVIDAD, msgs);
			case ProinsoPackage.TAREA__FLUJOS:
				return ((InternalEList)getFlujos()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				return ((InternalEList)getParticipaciones()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				return ((InternalEList)getUsoPracticas()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TAREA__USO_TECNICAS:
				return ((InternalEList)getUsoTecnicas()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.TAREA__ACTIVIDAD:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS, ActividadAbstracta.class, msgs);
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
			case ProinsoPackage.TAREA__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.TAREA__CODIGO_YNOMBRE:
				return getCodigoYNombre();
			case ProinsoPackage.TAREA__CODIGO_COMPLETO:
				return getCodigoCompleto();
			case ProinsoPackage.TAREA__CODIGO:
				return getCodigo();
			case ProinsoPackage.TAREA__NOMBRE:
				return getNombre();
			case ProinsoPackage.TAREA__ACTIVIDAD:
				return getActividad();
			case ProinsoPackage.TAREA__FLUJOS:
				return getFlujos();
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				return getParticipaciones();
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				return getUsoPracticas();
			case ProinsoPackage.TAREA__USO_TECNICAS:
				return getUsoTecnicas();
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
			case ProinsoPackage.TAREA__CODIGO:
				setCodigo((String)newValue);
				return;
			case ProinsoPackage.TAREA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProinsoPackage.TAREA__FLUJOS:
				getFlujos().clear();
				getFlujos().addAll((Collection)newValue);
				return;
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				getParticipaciones().clear();
				getParticipaciones().addAll((Collection)newValue);
				return;
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				getUsoPracticas().clear();
				getUsoPracticas().addAll((Collection)newValue);
				return;
			case ProinsoPackage.TAREA__USO_TECNICAS:
				getUsoTecnicas().clear();
				getUsoTecnicas().addAll((Collection)newValue);
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
			case ProinsoPackage.TAREA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ProinsoPackage.TAREA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProinsoPackage.TAREA__FLUJOS:
				getFlujos().clear();
				return;
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				getParticipaciones().clear();
				return;
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				getUsoPracticas().clear();
				return;
			case ProinsoPackage.TAREA__USO_TECNICAS:
				getUsoTecnicas().clear();
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
			case ProinsoPackage.TAREA__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.TAREA__CODIGO_YNOMBRE:
				return CODIGO_YNOMBRE_EDEFAULT == null ? getCodigoYNombre() != null : !CODIGO_YNOMBRE_EDEFAULT.equals(getCodigoYNombre());
			case ProinsoPackage.TAREA__CODIGO_COMPLETO:
				return CODIGO_COMPLETO_EDEFAULT == null ? getCodigoCompleto() != null : !CODIGO_COMPLETO_EDEFAULT.equals(getCodigoCompleto());
			case ProinsoPackage.TAREA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ProinsoPackage.TAREA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.TAREA__ACTIVIDAD:
				return getActividad() != null;
			case ProinsoPackage.TAREA__FLUJOS:
				return flujos != null && !flujos.isEmpty();
			case ProinsoPackage.TAREA__PARTICIPACIONES:
				return participaciones != null && !participaciones.isEmpty();
			case ProinsoPackage.TAREA__USO_PRACTICAS:
				return usoPracticas != null && !usoPracticas.isEmpty();
			case ProinsoPackage.TAREA__USO_TECNICAS:
				return usoTecnicas != null && !usoTecnicas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.TAREA__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
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
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.TAREA__REFERENCIAS;
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

} //TareaImpl