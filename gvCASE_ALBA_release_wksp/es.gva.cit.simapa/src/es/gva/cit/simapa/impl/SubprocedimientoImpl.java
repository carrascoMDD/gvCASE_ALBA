
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.Subprocedimiento;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprocedimiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.SubprocedimientoImpl#getSubProcedimiento <em>Sub Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubprocedimientoImpl extends OperacionImpl implements Subprocedimiento {
	/**
	 * The cached value of the '{@link #getSubProcedimiento() <em>Sub Procedimiento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected Procedimiento subProcedimiento = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprocedimientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.SUBPROCEDIMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getSubProcedimiento() {
		if (subProcedimiento != null && subProcedimiento.eIsProxy()) {
			InternalEObject oldSubProcedimiento = (InternalEObject)subProcedimiento;
			subProcedimiento = (Procedimiento)eResolveProxy(oldSubProcedimiento);
			if (subProcedimiento != oldSubProcedimiento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO, oldSubProcedimiento, subProcedimiento));
			}
		}
		return subProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento basicGetSubProcedimiento() {
		return subProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubProcedimiento(Procedimiento newSubProcedimiento, NotificationChain msgs) {
		Procedimiento oldSubProcedimiento = subProcedimiento;
		subProcedimiento = newSubProcedimiento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO, oldSubProcedimiento, newSubProcedimiento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubProcedimiento(Procedimiento newSubProcedimiento) {
		if (newSubProcedimiento != subProcedimiento) {
			NotificationChain msgs = null;
			if (subProcedimiento != null)
				msgs = ((InternalEObject)subProcedimiento).eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS, Procedimiento.class, msgs);
			if (newSubProcedimiento != null)
				msgs = ((InternalEObject)newSubProcedimiento).eInverseAdd(this, SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS, Procedimiento.class, msgs);
			msgs = basicSetSubProcedimiento(newSubProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO, newSubProcedimiento, newSubProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				if (subProcedimiento != null)
					msgs = ((InternalEObject)subProcedimiento).eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS, Procedimiento.class, msgs);
				return basicSetSubProcedimiento((Procedimiento)otherEnd, msgs);
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
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				return basicSetSubProcedimiento(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				if (resolve) return getSubProcedimiento();
				return basicGetSubProcedimiento();
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
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				setSubProcedimiento((Procedimiento)newValue);
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
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				setSubProcedimiento((Procedimiento)null);
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
			case SimapaPackage.SUBPROCEDIMIENTO__SUB_PROCEDIMIENTO:
				return subProcedimiento != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprocedimientoImpl