/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CSistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Sistema;

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
 * An implementation of the model object '<em><b>CSistemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl#getSistemas <em>Sistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSistemasImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSistemasImpl extends OrgcasiCollectionImpl implements CSistemas {
	/**
	 * The cached value of the '{@link #getSistemas() <em>Sistemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemas()
	 * @generated
	 * @ordered
	 */
	protected EList sistemas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSistemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSISTEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSistemas() {
		if (sistemas == null) {
			sistemas = new EObjectContainmentWithInverseEList(Sistema.class, this, OrgcasiPackage.CSISTEMAS__SISTEMAS, OrgcasiPackage.SISTEMA__SISTEMAS);
		}
		return sistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				return ((InternalEList)getSistemas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				return ((InternalEList)getSistemas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO:
				return eBasicSetContainer(null, OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__SISTEMAS, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				return getSistemas();
			case OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO:
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
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				getSistemas().clear();
				getSistemas().addAll((Collection)newValue);
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
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				getSistemas().clear();
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
			case OrgcasiPackage.CSISTEMAS__SISTEMAS:
				return sistemas != null && !sistemas.isEmpty();
			case OrgcasiPackage.CSISTEMAS__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CSistemasImpl