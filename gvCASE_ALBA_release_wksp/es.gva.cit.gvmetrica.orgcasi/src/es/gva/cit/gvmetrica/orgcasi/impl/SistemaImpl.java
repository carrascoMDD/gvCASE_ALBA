/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CSistemas;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Sistema;

import es.gva.cit.gvmetrica.orgcasi.Suceso;

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
 * An implementation of the model object '<em><b>Sistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getSubsistemas <em>Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getSucesos <em>Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getTodosSubsistemas <em>Todos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SistemaImpl#getSistemas <em>Sistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SistemaImpl extends AgrupacionImpl implements Sistema {
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
	 * The parsed OCL expression for the derivation of '{@link #getProcedimiento <em>Procedimiento</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimiento
	 * @generated
	 */
	private static OCLExpression procedimientoDeriveOCL;
	
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
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.SISTEMA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SISTEMA__SUBSISTEMAS, oldSubsistemas, newSubsistemas);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SISTEMA__SUBSISTEMAS, newSubsistemas, newSubsistemas));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SISTEMA__SUCESOS, oldSucesos, newSucesos);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SISTEMA__SUCESOS, newSucesos, newSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		AProcedimiento procedimiento = basicGetProcedimiento();
		return procedimiento != null && procedimiento.eIsProxy() ? (AProcedimiento)eResolveProxy((InternalEObject)procedimiento) : procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento basicGetProcedimiento() {
//		if (procedimientoDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSistema().getEAllStructuralFeatures().get(8);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				procedimientoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Sistema");
System.out.println("procedimiento");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(procedimientoDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Sistema");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (AProcedimiento) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Sistema");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Sistema procedimiento", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosSucesos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSistema().getEAllStructuralFeatures().get(9);
	
//		if (todosSucesosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosSucesosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Sistema");
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
System.out.println("Sistema");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("Sistema");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Sistema todosSucesos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosSubsistemas() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSistema().getEAllStructuralFeatures().get(10);
	
//		if (todosSubsistemasDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosSubsistemasDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Sistema");
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
System.out.println("Sistema");
System.out.println("todosSubsistemas");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("Sistema");
System.out.println("todosSubsistemas");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Sistema todosSubsistemas", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSistemas getSistemas() {
		if (eContainerFeatureID != OrgcasiPackage.SISTEMA__SISTEMAS) return null;
		return (CSistemas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSistemas(CSistemas newSistemas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSistemas, OrgcasiPackage.SISTEMA__SISTEMAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemas(CSistemas newSistemas) {
		if (newSistemas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.SISTEMA__SISTEMAS && newSistemas != null)) {
			if (EcoreUtil.isAncestor(this, newSistemas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSistemas != null)
				msgs = ((InternalEObject)newSistemas).eInverseAdd(this, OrgcasiPackage.CSISTEMAS__SISTEMAS, CSistemas.class, msgs);
			msgs = basicSetSistemas(newSistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SISTEMA__SISTEMAS, newSistemas, newSistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				if (subsistemas != null)
					msgs = ((InternalEObject)subsistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SISTEMA__SUBSISTEMAS, null, msgs);
				return basicSetSubsistemas((CSubsistemas)otherEnd, msgs);
			case OrgcasiPackage.SISTEMA__SUCESOS:
				if (sucesos != null)
					msgs = ((InternalEObject)sucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SISTEMA__SUCESOS, null, msgs);
				return basicSetSucesos((CSucesos)otherEnd, msgs);
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSistemas((CSistemas)otherEnd, msgs);
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
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				return basicSetSubsistemas(null, msgs);
			case OrgcasiPackage.SISTEMA__SUCESOS:
				return basicSetSucesos(null, msgs);
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				return basicSetSistemas(null, msgs);
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
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CSISTEMAS__SISTEMAS, CSistemas.class, msgs);
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
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				return getSubsistemas();
			case OrgcasiPackage.SISTEMA__SUCESOS:
				return getSucesos();
			case OrgcasiPackage.SISTEMA__PROCEDIMIENTO:
				if (resolve) return getProcedimiento();
				return basicGetProcedimiento();
			case OrgcasiPackage.SISTEMA__TODOS_SUCESOS:
				return getTodosSucesos();
			case OrgcasiPackage.SISTEMA__TODOS_SUBSISTEMAS:
				return getTodosSubsistemas();
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				return getSistemas();
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
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)newValue);
				return;
			case OrgcasiPackage.SISTEMA__SUCESOS:
				setSucesos((CSucesos)newValue);
				return;
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				setSistemas((CSistemas)newValue);
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
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)null);
				return;
			case OrgcasiPackage.SISTEMA__SUCESOS:
				setSucesos((CSucesos)null);
				return;
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				setSistemas((CSistemas)null);
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
			case OrgcasiPackage.SISTEMA__SUBSISTEMAS:
				return subsistemas != null;
			case OrgcasiPackage.SISTEMA__SUCESOS:
				return sucesos != null;
			case OrgcasiPackage.SISTEMA__PROCEDIMIENTO:
				return basicGetProcedimiento() != null;
			case OrgcasiPackage.SISTEMA__TODOS_SUCESOS:
				return !getTodosSucesos().isEmpty();
			case OrgcasiPackage.SISTEMA__TODOS_SUBSISTEMAS:
				return !getTodosSubsistemas().isEmpty();
			case OrgcasiPackage.SISTEMA__SISTEMAS:
				return getSistemas() != null;
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
				case OrgcasiPackage.SISTEMA__SUBSISTEMAS: return OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorSucesos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.SISTEMA__SUCESOS: return OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS;
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
				case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS: return OrgcasiPackage.SISTEMA__SUBSISTEMAS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorSucesos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS: return OrgcasiPackage.SISTEMA__SUCESOS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SistemaImpl