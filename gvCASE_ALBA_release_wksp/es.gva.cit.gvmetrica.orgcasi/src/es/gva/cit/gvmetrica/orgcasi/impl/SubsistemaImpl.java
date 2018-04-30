/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
import es.gva.cit.gvmetrica.orgcasi.TipoSubsistema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 * An implementation of the model object '<em><b>Subsistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getSucesos <em>Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getTipoSubsistema <em>Tipo Subsistema</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getTodosSucesos <em>Todos Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SubsistemaImpl#getSubsistemas <em>Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubsistemaImpl extends AgrupacionImpl implements Subsistema {
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
	 * The default value of the '{@link #getTipoSubsistema() <em>Tipo Subsistema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoSubsistema()
	 * @generated
	 * @ordered
	 */
	protected static final TipoSubsistema TIPO_SUBSISTEMA_EDEFAULT = TipoSubsistema.I_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoSubsistema() <em>Tipo Subsistema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoSubsistema()
	 * @generated
	 * @ordered
	 */
	protected TipoSubsistema tipoSubsistema = TIPO_SUBSISTEMA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsosSubsistemas() <em>Usos Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected CUsosSubsistemas usosSubsistemas = null;

	/**
	 * The cached value of the '{@link #getUsadoPorSubsistemas() <em>Usado Por Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsadoPorSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected CUsadoPorSubsistemas usadoPorSubsistemas = null;


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
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected SubsistemaImpl() {
		super();
		setSucesos( OrgcasiFactory.eINSTANCE.createCSucesos());
		setUsosSubsistemas( OrgcasiFactory.eINSTANCE.createCUsosSubsistemas());
		setUsadoPorSubsistemas( OrgcasiFactory.eINSTANCE.createCUsadoPorSubsistemas());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.SUBSISTEMA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__SUCESOS, oldSucesos, newSucesos);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__SUCESOS, newSucesos, newSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoSubsistema getTipoSubsistema() {
		return tipoSubsistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoSubsistema(TipoSubsistema newTipoSubsistema) {
		TipoSubsistema oldTipoSubsistema = tipoSubsistema;
		tipoSubsistema = newTipoSubsistema == null ? TIPO_SUBSISTEMA_EDEFAULT : newTipoSubsistema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA, oldTipoSubsistema, tipoSubsistema));
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
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSubsistema().getEAllStructuralFeatures().get(8);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				procedimientoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Subsistema");
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
System.out.println("Subsistema");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (AProcedimiento) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Subsistema");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Subsistema procedimiento", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosSucesos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSubsistema().getEAllStructuralFeatures().get(9);
	
//		if (todosSucesosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosSucesosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Subsistema");
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
System.out.println("Subsistema");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("Subsistema");
System.out.println("todosSucesos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Subsistema todosSucesos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsosSubsistemas getUsosSubsistemas() {
		return usosSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsosSubsistemas(CUsosSubsistemas newUsosSubsistemas, NotificationChain msgs) {
		CUsosSubsistemas oldUsosSubsistemas = usosSubsistemas;
		usosSubsistemas = newUsosSubsistemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS, oldUsosSubsistemas, newUsosSubsistemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsosSubsistemas(CUsosSubsistemas newUsosSubsistemas) {
		if (newUsosSubsistemas != usosSubsistemas) {
			NotificationChain msgs = null;
			if (usosSubsistemas != null)
				msgs = ((InternalEObject)usosSubsistemas).eInverseRemove(this, OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA, CUsosSubsistemas.class, msgs);
			if (newUsosSubsistemas != null)
				msgs = ((InternalEObject)newUsosSubsistemas).eInverseAdd(this, OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA, CUsosSubsistemas.class, msgs);
			msgs = basicSetUsosSubsistemas(newUsosSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS, newUsosSubsistemas, newUsosSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSubsistemas getUsadoPorSubsistemas() {
		return usadoPorSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsadoPorSubsistemas(CUsadoPorSubsistemas newUsadoPorSubsistemas, NotificationChain msgs) {
		CUsadoPorSubsistemas oldUsadoPorSubsistemas = usadoPorSubsistemas;
		usadoPorSubsistemas = newUsadoPorSubsistemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS, oldUsadoPorSubsistemas, newUsadoPorSubsistemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsadoPorSubsistemas(CUsadoPorSubsistemas newUsadoPorSubsistemas) {
		if (newUsadoPorSubsistemas != usadoPorSubsistemas) {
			NotificationChain msgs = null;
			if (usadoPorSubsistemas != null)
				msgs = ((InternalEObject)usadoPorSubsistemas).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA, CUsadoPorSubsistemas.class, msgs);
			if (newUsadoPorSubsistemas != null)
				msgs = ((InternalEObject)newUsadoPorSubsistemas).eInverseAdd(this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA, CUsadoPorSubsistemas.class, msgs);
			msgs = basicSetUsadoPorSubsistemas(newUsadoPorSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS, newUsadoPorSubsistemas, newUsadoPorSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubsistemas getSubsistemas() {
		if (eContainerFeatureID != OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS) return null;
		return (CSubsistemas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistemas(CSubsistemas newSubsistemas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubsistemas, OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistemas(CSubsistemas newSubsistemas) {
		if (newSubsistemas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS && newSubsistemas != null)) {
			if (EcoreUtil.isAncestor(this, newSubsistemas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubsistemas != null)
				msgs = ((InternalEObject)newSubsistemas).eInverseAdd(this, OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS, CSubsistemas.class, msgs);
			msgs = basicSetSubsistemas(newSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS, newSubsistemas, newSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				if (sucesos != null)
					msgs = ((InternalEObject)sucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUBSISTEMA__SUCESOS, null, msgs);
				return basicSetSucesos((CSucesos)otherEnd, msgs);
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				if (usosSubsistemas != null)
					msgs = ((InternalEObject)usosSubsistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS, null, msgs);
				return basicSetUsosSubsistemas((CUsosSubsistemas)otherEnd, msgs);
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				if (usadoPorSubsistemas != null)
					msgs = ((InternalEObject)usadoPorSubsistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS, null, msgs);
				return basicSetUsadoPorSubsistemas((CUsadoPorSubsistemas)otherEnd, msgs);
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubsistemas((CSubsistemas)otherEnd, msgs);
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
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				return basicSetSucesos(null, msgs);
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				return basicSetUsosSubsistemas(null, msgs);
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				return basicSetUsadoPorSubsistemas(null, msgs);
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				return basicSetSubsistemas(null, msgs);
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
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS, CSubsistemas.class, msgs);
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
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				return getSucesos();
			case OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA:
				return getTipoSubsistema();
			case OrgcasiPackage.SUBSISTEMA__PROCEDIMIENTO:
				if (resolve) return getProcedimiento();
				return basicGetProcedimiento();
			case OrgcasiPackage.SUBSISTEMA__TODOS_SUCESOS:
				return getTodosSucesos();
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				return getUsosSubsistemas();
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				return getUsadoPorSubsistemas();
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				return getSubsistemas();
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
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				setSucesos((CSucesos)newValue);
				return;
			case OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA:
				setTipoSubsistema((TipoSubsistema)newValue);
				return;
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				setUsosSubsistemas((CUsosSubsistemas)newValue);
				return;
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				setUsadoPorSubsistemas((CUsadoPorSubsistemas)newValue);
				return;
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)newValue);
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
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				setSucesos((CSucesos)null);
				return;
			case OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA:
				setTipoSubsistema(TIPO_SUBSISTEMA_EDEFAULT);
				return;
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				setUsosSubsistemas((CUsosSubsistemas)null);
				return;
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				setUsadoPorSubsistemas((CUsadoPorSubsistemas)null);
				return;
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)null);
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
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
				return sucesos != null;
			case OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA:
				return tipoSubsistema != TIPO_SUBSISTEMA_EDEFAULT;
			case OrgcasiPackage.SUBSISTEMA__PROCEDIMIENTO:
				return basicGetProcedimiento() != null;
			case OrgcasiPackage.SUBSISTEMA__TODOS_SUCESOS:
				return !getTodosSucesos().isEmpty();
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
				return usosSubsistemas != null;
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
				return usadoPorSubsistemas != null;
			case OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS:
				return getSubsistemas() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorSucesos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.SUBSISTEMA__SUCESOS: return OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS;
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
		if (baseClass == ContenedorSucesos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS: return OrgcasiPackage.SUBSISTEMA__SUCESOS;
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
		result.append(" (tipoSubsistema: ");
		result.append(tipoSubsistema);
		result.append(')');
		return result.toString();
	}

} //SubsistemaImpl