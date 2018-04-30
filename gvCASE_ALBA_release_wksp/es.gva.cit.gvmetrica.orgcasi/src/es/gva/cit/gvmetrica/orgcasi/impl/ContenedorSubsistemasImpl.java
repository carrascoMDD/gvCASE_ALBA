/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorSubsistemasImpl#getSubsistemas <em>Subsistemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContenedorSubsistemasImpl extends EObjectImpl implements ContenedorSubsistemas {
	/**
	 * The cached value of the '{@link #getSubsistemas() <em>Subsistemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected CSubsistemas subsistemas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorSubsistemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CONTENEDOR_SUBSISTEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubsistemas getSubsistemas() {
		return subsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistemas(CSubsistemas newSubsistemas, NotificationChain msgs) {
		CSubsistemas oldSubsistemas = subsistemas;
		subsistemas = newSubsistemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS, oldSubsistemas, newSubsistemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistemas(CSubsistemas newSubsistemas) {
		if (newSubsistemas != subsistemas) {
			NotificationChain msgs = null;
			if (subsistemas != null)
				msgs = ((InternalEObject)subsistemas).eInverseRemove(this, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, CSubsistemas.class, msgs);
			if (newSubsistemas != null)
				msgs = ((InternalEObject)newSubsistemas).eInverseAdd(this, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, CSubsistemas.class, msgs);
			msgs = basicSetSubsistemas(newSubsistemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS, newSubsistemas, newSubsistemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				if (subsistemas != null)
					msgs = ((InternalEObject)subsistemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS, null, msgs);
				return basicSetSubsistemas((CSubsistemas)otherEnd, msgs);
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
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				return basicSetSubsistemas(null, msgs);
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
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				return getSubsistemas();
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
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)newValue);
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
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				setSubsistemas((CSubsistemas)null);
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
			case OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS:
				return subsistemas != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorSubsistemasImpl