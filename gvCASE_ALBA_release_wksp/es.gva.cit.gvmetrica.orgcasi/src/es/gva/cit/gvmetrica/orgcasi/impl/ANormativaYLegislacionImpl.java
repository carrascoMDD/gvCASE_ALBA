/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion;
import es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.NormativaYLegislacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ANormativa YLegislacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl#getNormativa <em>Normativa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ANormativaYLegislacionImpl#getNormativas <em>Normativas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ANormativaYLegislacionImpl extends AnotacionImpl implements ANormativaYLegislacion {
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
	 * The cached value of the '{@link #getNormativa() <em>Normativa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativa()
	 * @generated
	 * @ordered
	 */
	protected NormativaYLegislacion normativa = null;

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
	protected ANormativaYLegislacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ANORMATIVA_YLEGISLACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getANormativaYLegislacion().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ANormativaYLegislacion");
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
System.out.println("ANormativaYLegislacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ANormativaYLegislacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ANormativaYLegislacion etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativaYLegislacion getNormativa() {
		if (normativa != null && normativa.eIsProxy()) {
			InternalEObject oldNormativa = (InternalEObject)normativa;
			normativa = (NormativaYLegislacion)eResolveProxy(oldNormativa);
			if (normativa != oldNormativa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA, oldNormativa, normativa));
			}
		}
		return normativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativaYLegislacion basicGetNormativa() {
		return normativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormativa(NormativaYLegislacion newNormativa) {
		NormativaYLegislacion oldNormativa = normativa;
		normativa = newNormativa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA, oldNormativa, normativa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNormativasYLegislaciones getNormativas() {
		if (eContainerFeatureID != OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS) return null;
		return (CNormativasYLegislaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormativas(CNormativasYLegislaciones newNormativas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNormativas, OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormativas(CNormativasYLegislaciones newNormativas) {
		if (newNormativas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS && newNormativas != null)) {
			if (EcoreUtil.isAncestor(this, newNormativas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNormativas != null)
				msgs = ((InternalEObject)newNormativas).eInverseAdd(this, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS, CNormativasYLegislaciones.class, msgs);
			msgs = basicSetNormativas(newNormativas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS, newNormativas, newNormativas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNormativas((CNormativasYLegislaciones)otherEnd, msgs);
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				return basicSetNormativas(null, msgs);
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS, CNormativasYLegislaciones.class, msgs);
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA:
				if (resolve) return getNormativa();
				return basicGetNormativa();
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				return getNormativas();
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA:
				setNormativa((NormativaYLegislacion)newValue);
				return;
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				setNormativas((CNormativasYLegislaciones)newValue);
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA:
				setNormativa((NormativaYLegislacion)null);
				return;
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				setNormativas((CNormativasYLegislaciones)null);
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
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVA:
				return normativa != null;
			case OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS:
				return getNormativas() != null;
		}
		return super.eIsSet(featureID);
	}

} //ANormativaYLegislacionImpl