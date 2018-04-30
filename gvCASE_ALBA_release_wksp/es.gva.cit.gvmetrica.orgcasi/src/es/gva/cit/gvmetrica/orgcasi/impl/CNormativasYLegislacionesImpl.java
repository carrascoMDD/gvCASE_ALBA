/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CNormativas YLegislaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CNormativasYLegislacionesImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CNormativasYLegislacionesImpl extends OrgcasiCollectionImpl implements CNormativasYLegislaciones {
	/**
	 * The cached value of the '{@link #getNormativas() <em>Normativas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativas()
	 * @generated
	 * @ordered
	 */
	protected EList normativas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNormativasYLegislacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CNORMATIVAS_YLEGISLACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedimiento(AProcedimiento newProcedimiento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcedimiento, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedimiento(AProcedimiento newProcedimiento) {
		if (newProcedimiento != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO && newProcedimiento != null)) {
			if (EcoreUtil.isAncestor(this, newProcedimiento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcedimiento != null)
				msgs = ((InternalEObject)newProcedimiento).eInverseAdd(this, OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS, AProcedimiento.class, msgs);
			msgs = basicSetProcedimiento(newProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO, newProcedimiento, newProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNormativas() {
		if (normativas == null) {
			normativas = new EObjectContainmentWithInverseEList(ANormativaYLegislacion.class, this, OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS, OrgcasiPackage.ANORMATIVA_YLEGISLACION__NORMATIVAS);
		}
		return normativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcedimiento((AProcedimiento)otherEnd, msgs);
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				return basicSetProcedimiento(null, msgs);
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return getNormativas();
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				return getProcedimiento();
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				getNormativas().clear();
				getNormativas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				setProcedimiento((AProcedimiento)newValue);
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				getNormativas().clear();
				return;
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				setProcedimiento((AProcedimiento)null);
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
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return normativas != null && !normativas.isEmpty();
			case OrgcasiPackage.CNORMATIVAS_YLEGISLACIONES__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CNormativasYLegislacionesImpl