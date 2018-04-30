/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AAplicacion;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CAplicaciones;
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
 * An implementation of the model object '<em><b>CAplicaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CAplicacionesImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CAplicacionesImpl extends OrgcasiCollectionImpl implements CAplicaciones {
	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected EList aplicaciones = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAplicacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CAPLICACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAplicaciones() {
		if (aplicaciones == null) {
			aplicaciones = new EObjectContainmentWithInverseEList(AAplicacion.class, this, OrgcasiPackage.CAPLICACIONES__APLICACIONES, OrgcasiPackage.AAPLICACION__APLICACIONES);
		}
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO:
				return eBasicSetContainer(null, OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__APLICACIONES, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				return getAplicaciones();
			case OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO:
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
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				getAplicaciones().clear();
				getAplicaciones().addAll((Collection)newValue);
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
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				getAplicaciones().clear();
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
			case OrgcasiPackage.CAPLICACIONES__APLICACIONES:
				return aplicaciones != null && !aplicaciones.isEmpty();
			case OrgcasiPackage.CAPLICACIONES__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CAplicacionesImpl