/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AOperacion;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.COperaciones;
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
 * An implementation of the model object '<em><b>COperaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.COperacionesImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COperacionesImpl extends OrgcasiCollectionImpl implements COperaciones {
	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COperacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.COPERACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentWithInverseEList(AOperacion.class, this, OrgcasiPackage.COPERACIONES__OPERACIONES, OrgcasiPackage.AOPERACION__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.COPERACIONES__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedimiento(AProcedimiento newProcedimiento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcedimiento, OrgcasiPackage.COPERACIONES__PROCEDIMIENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedimiento(AProcedimiento newProcedimiento) {
		if (newProcedimiento != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.COPERACIONES__PROCEDIMIENTO && newProcedimiento != null)) {
			if (EcoreUtil.isAncestor(this, newProcedimiento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcedimiento != null)
				msgs = ((InternalEObject)newProcedimiento).eInverseAdd(this, OrgcasiPackage.APROCEDIMIENTO__OPERACIONES, AProcedimiento.class, msgs);
			msgs = basicSetProcedimiento(newProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.COPERACIONES__PROCEDIMIENTO, newProcedimiento, newProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcedimiento((AProcedimiento)otherEnd, msgs);
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				return basicSetProcedimiento(null, msgs);
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__OPERACIONES, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				return getProcedimiento();
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				return getOperaciones();
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				setProcedimiento((AProcedimiento)newValue);
				return;
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection)newValue);
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				setProcedimiento((AProcedimiento)null);
				return;
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				getOperaciones().clear();
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
			case OrgcasiPackage.COPERACIONES__PROCEDIMIENTO:
				return getProcedimiento() != null;
			case OrgcasiPackage.COPERACIONES__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COperacionesImpl