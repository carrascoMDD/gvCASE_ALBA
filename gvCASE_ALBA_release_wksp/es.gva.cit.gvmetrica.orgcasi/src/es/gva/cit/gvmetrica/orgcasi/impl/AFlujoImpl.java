/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AFlujo;
import es.gva.cit.gvmetrica.orgcasi.CFlujos;
import es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.Flujo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * An implementation of the model object '<em><b>AFlujo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl#getFlujo <em>Flujo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl#getFlujoDeSucesos <em>Flujo De Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AFlujoImpl#getFlujos <em>Flujos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFlujoImpl extends AnotacionImpl implements AFlujo {
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
	 * The cached value of the '{@link #getFlujo() <em>Flujo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujo()
	 * @generated
	 * @ordered
	 */
	protected Flujo flujo = null;

	/**
	 * The cached value of the '{@link #getFlujoDeSucesos() <em>Flujo De Sucesos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujoDeSucesos()
	 * @generated
	 * @ordered
	 */
	protected EList flujoDeSucesos = null;

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
	protected AFlujoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AFLUJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAFlujo().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AFlujo");
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
System.out.println("AFlujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AFlujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AFlujo etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flujo getFlujo() {
		if (flujo != null && flujo.eIsProxy()) {
			InternalEObject oldFlujo = (InternalEObject)flujo;
			flujo = (Flujo)eResolveProxy(oldFlujo);
			if (flujo != oldFlujo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AFLUJO__FLUJO, oldFlujo, flujo));
			}
		}
		return flujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flujo basicGetFlujo() {
		return flujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlujo(Flujo newFlujo) {
		Flujo oldFlujo = flujo;
		flujo = newFlujo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AFLUJO__FLUJO, oldFlujo, flujo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlujos getFlujos() {
		if (eContainerFeatureID != OrgcasiPackage.AFLUJO__FLUJOS) return null;
		return (CFlujos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlujos(CFlujos newFlujos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlujos, OrgcasiPackage.AFLUJO__FLUJOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlujos(CFlujos newFlujos) {
		if (newFlujos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AFLUJO__FLUJOS && newFlujos != null)) {
			if (EcoreUtil.isAncestor(this, newFlujos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlujos != null)
				msgs = ((InternalEObject)newFlujos).eInverseAdd(this, OrgcasiPackage.CFLUJOS__FLUJOS, CFlujos.class, msgs);
			msgs = basicSetFlujos(newFlujos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AFLUJO__FLUJOS, newFlujos, newFlujos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujoDeSucesos() {
		if (flujoDeSucesos == null) {
			flujoDeSucesos = new EObjectWithInverseResolvingEList.ManyInverse(CFlujosSuceso.class, this, OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS, OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS);
		}
		return flujoDeSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS:
				return ((InternalEList)getFlujoDeSucesos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.AFLUJO__FLUJOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlujos((CFlujos)otherEnd, msgs);
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
			case OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS:
				return ((InternalEList)getFlujoDeSucesos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.AFLUJO__FLUJOS:
				return basicSetFlujos(null, msgs);
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
			case OrgcasiPackage.AFLUJO__FLUJOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CFLUJOS__FLUJOS, CFlujos.class, msgs);
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
			case OrgcasiPackage.AFLUJO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.AFLUJO__FLUJO:
				if (resolve) return getFlujo();
				return basicGetFlujo();
			case OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS:
				return getFlujoDeSucesos();
			case OrgcasiPackage.AFLUJO__FLUJOS:
				return getFlujos();
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
			case OrgcasiPackage.AFLUJO__FLUJO:
				setFlujo((Flujo)newValue);
				return;
			case OrgcasiPackage.AFLUJO__FLUJOS:
				setFlujos((CFlujos)newValue);
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
			case OrgcasiPackage.AFLUJO__FLUJO:
				setFlujo((Flujo)null);
				return;
			case OrgcasiPackage.AFLUJO__FLUJOS:
				setFlujos((CFlujos)null);
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
			case OrgcasiPackage.AFLUJO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.AFLUJO__FLUJO:
				return flujo != null;
			case OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS:
				return flujoDeSucesos != null && !flujoDeSucesos.isEmpty();
			case OrgcasiPackage.AFLUJO__FLUJOS:
				return getFlujos() != null;
		}
		return super.eIsSet(featureID);
	}

} //AFlujoImpl