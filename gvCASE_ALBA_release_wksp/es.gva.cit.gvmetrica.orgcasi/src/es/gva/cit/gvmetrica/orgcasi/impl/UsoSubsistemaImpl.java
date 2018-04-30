
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.UsoSubsistema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 * An implementation of the model object '<em><b>Uso Subsistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl#getSubsistemaUsado <em>Subsistema Usado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSubsistemaImpl#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsoSubsistemaImpl extends OrgcasiObjectImpl implements UsoSubsistema {
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
	 * The cached value of the '{@link #getSubsistemaUsado() <em>Subsistema Usado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsistemaUsado()
	 * @generated
	 * @ordered
	 */
	protected CUsadoPorSubsistemas subsistemaUsado = null;


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
	protected UsoSubsistemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.USO_SUBSISTEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getUsoSubsistema().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("UsoSubsistema");
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
System.out.println("UsoSubsistema");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("UsoSubsistema");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "UsoSubsistema etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsosSubsistemas getUsosSubsistemas() {
		if (eContainerFeatureID != OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS) return null;
		return (CUsosSubsistemas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsosSubsistemas(CUsosSubsistemas newUsosSubsistemas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsosSubsistemas, OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsosSubsistemas(CUsosSubsistemas newUsosSubsistemas) {
		if (newUsosSubsistemas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS && newUsosSubsistemas != null)) {
			if (EcoreUtil.isAncestor(this, newUsosSubsistemas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsosSubsistemas != null)
				msgs = ((InternalEObject)newUsosSubsistemas).eInverseAdd(this, OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS, CUsosSubsistemas.class, msgs);
			msgs = basicSetUsosSubsistemas(newUsosSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS, newUsosSubsistemas, newUsosSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSubsistemas getSubsistemaUsado() {
		if (subsistemaUsado != null && subsistemaUsado.eIsProxy()) {
			InternalEObject oldSubsistemaUsado = (InternalEObject)subsistemaUsado;
			subsistemaUsado = (CUsadoPorSubsistemas)eResolveProxy(oldSubsistemaUsado);
			if (subsistemaUsado != oldSubsistemaUsado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO, oldSubsistemaUsado, subsistemaUsado));
			}
		}
		return subsistemaUsado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSubsistemas basicGetSubsistemaUsado() {
		return subsistemaUsado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistemaUsado(CUsadoPorSubsistemas newSubsistemaUsado, NotificationChain msgs) {
		CUsadoPorSubsistemas oldSubsistemaUsado = subsistemaUsado;
		subsistemaUsado = newSubsistemaUsado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO, oldSubsistemaUsado, newSubsistemaUsado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistemaUsado(CUsadoPorSubsistemas newSubsistemaUsado) {
		if (newSubsistemaUsado != subsistemaUsado) {
			NotificationChain msgs = null;
			if (subsistemaUsado != null)
				msgs = ((InternalEObject)subsistemaUsado).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS, CUsadoPorSubsistemas.class, msgs);
			if (newSubsistemaUsado != null)
				msgs = ((InternalEObject)newSubsistemaUsado).eInverseAdd(this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS, CUsadoPorSubsistemas.class, msgs);
			msgs = basicSetSubsistemaUsado(newSubsistemaUsado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO, newSubsistemaUsado, newSubsistemaUsado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				if (subsistemaUsado != null)
					msgs = ((InternalEObject)subsistemaUsado).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS, CUsadoPorSubsistemas.class, msgs);
				return basicSetSubsistemaUsado((CUsadoPorSubsistemas)otherEnd, msgs);
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsosSubsistemas((CUsosSubsistemas)otherEnd, msgs);
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
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				return basicSetSubsistemaUsado(null, msgs);
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				return basicSetUsosSubsistemas(null, msgs);
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
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS, CUsosSubsistemas.class, msgs);
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
			case OrgcasiPackage.USO_SUBSISTEMA__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				if (resolve) return getSubsistemaUsado();
				return basicGetSubsistemaUsado();
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				return getUsosSubsistemas();
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
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				setSubsistemaUsado((CUsadoPorSubsistemas)newValue);
				return;
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				setUsosSubsistemas((CUsosSubsistemas)newValue);
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
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				setSubsistemaUsado((CUsadoPorSubsistemas)null);
				return;
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				setUsosSubsistemas((CUsosSubsistemas)null);
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
			case OrgcasiPackage.USO_SUBSISTEMA__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO:
				return subsistemaUsado != null;
			case OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS:
				return getUsosSubsistemas() != null;
		}
		return super.eIsSet(featureID);
	}

} //UsoSubsistemaImpl