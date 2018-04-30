/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Sucesos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSucesosImpl#getSucesos <em>Sucesos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContenedorSucesosImpl extends EObjectImpl implements ContenedorSucesos {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorSucesosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CONTENEDOR_SUCESOS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS, oldSucesos, newSucesos);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS, newSucesos, newSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				if (sucesos != null)
					msgs = ((InternalEObject)sucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS, null, msgs);
				return basicSetSucesos((CSucesos)otherEnd, msgs);
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
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				return basicSetSucesos(null, msgs);
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
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				return getSucesos();
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
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				setSucesos((CSucesos)newValue);
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
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				setSucesos((CSucesos)null);
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
			case OrgcasiPackage.CONTENEDOR_SUCESOS__SUCESOS:
				return sucesos != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorSucesosImpl