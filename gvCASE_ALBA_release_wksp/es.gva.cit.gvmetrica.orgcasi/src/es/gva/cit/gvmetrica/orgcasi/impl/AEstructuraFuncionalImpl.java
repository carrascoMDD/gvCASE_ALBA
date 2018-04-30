/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.EstructuraFuncional;

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
 * An implementation of the model object '<em><b>AEstructura Funcional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl#getEstructuraFuncional <em>Estructura Funcional</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AEstructuraFuncionalImpl#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AEstructuraFuncionalImpl extends AnotacionImpl implements AEstructuraFuncional {
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
	 * The cached value of the '{@link #getEstructuraFuncional() <em>Estructura Funcional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuraFuncional()
	 * @generated
	 * @ordered
	 */
	protected EstructuraFuncional estructuraFuncional = null;

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
	protected AEstructuraFuncionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AESTRUCTURA_FUNCIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAEstructuraFuncional().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AEstructuraFuncional");
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
System.out.println("AEstructuraFuncional");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AEstructuraFuncional");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AEstructuraFuncional etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraFuncional getEstructuraFuncional() {
		if (estructuraFuncional != null && estructuraFuncional.eIsProxy()) {
			InternalEObject oldEstructuraFuncional = (InternalEObject)estructuraFuncional;
			estructuraFuncional = (EstructuraFuncional)eResolveProxy(oldEstructuraFuncional);
			if (estructuraFuncional != oldEstructuraFuncional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL, oldEstructuraFuncional, estructuraFuncional));
			}
		}
		return estructuraFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraFuncional basicGetEstructuraFuncional() {
		return estructuraFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructuraFuncional(EstructuraFuncional newEstructuraFuncional) {
		EstructuraFuncional oldEstructuraFuncional = estructuraFuncional;
		estructuraFuncional = newEstructuraFuncional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL, oldEstructuraFuncional, estructuraFuncional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasFuncionales getEstructurasFuncionales() {
		if (eContainerFeatureID != OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES) return null;
		return (CEstructurasFuncionales)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasFuncionales(CEstructurasFuncionales newEstructurasFuncionales, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEstructurasFuncionales, OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasFuncionales(CEstructurasFuncionales newEstructurasFuncionales) {
		if (newEstructurasFuncionales != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES && newEstructurasFuncionales != null)) {
			if (EcoreUtil.isAncestor(this, newEstructurasFuncionales))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEstructurasFuncionales != null)
				msgs = ((InternalEObject)newEstructurasFuncionales).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES, CEstructurasFuncionales.class, msgs);
			msgs = basicSetEstructurasFuncionales(newEstructurasFuncionales, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES, newEstructurasFuncionales, newEstructurasFuncionales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEstructurasFuncionales((CEstructurasFuncionales)otherEnd, msgs);
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				return basicSetEstructurasFuncionales(null, msgs);
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES, CEstructurasFuncionales.class, msgs);
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL:
				if (resolve) return getEstructuraFuncional();
				return basicGetEstructuraFuncional();
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales();
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL:
				setEstructuraFuncional((EstructuraFuncional)newValue);
				return;
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((CEstructurasFuncionales)newValue);
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL:
				setEstructuraFuncional((EstructuraFuncional)null);
				return;
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((CEstructurasFuncionales)null);
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
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURA_FUNCIONAL:
				return estructuraFuncional != null;
			case OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales() != null;
		}
		return super.eIsSet(featureID);
	}

} //AEstructuraFuncionalImpl