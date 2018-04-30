
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ReferenceRunImpl#getReferenciado <em>Referenciado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceRunImpl extends TextRunImpl implements ReferenceRun {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getReferenciado() <em>Referenciado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenciado()
	 * @generated
	 * @ordered
	 */
	protected Referenciable referenciado = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.REFERENCE_RUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referenciable getReferenciado() {
		if (referenciado != null && referenciado.eIsProxy()) {
			InternalEObject oldReferenciado = (InternalEObject)referenciado;
			referenciado = (Referenciable)eResolveProxy(oldReferenciado);
			if (referenciado != oldReferenciado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProinsoPackage.REFERENCE_RUN__REFERENCIADO, oldReferenciado, referenciado));
			}
		}
		return referenciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referenciable basicGetReferenciado() {
		return referenciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenciado(Referenciable newReferenciado, NotificationChain msgs) {
		Referenciable oldReferenciado = referenciado;
		referenciado = newReferenciado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.REFERENCE_RUN__REFERENCIADO, oldReferenciado, newReferenciado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenciado(Referenciable newReferenciado) {
		if (newReferenciado != referenciado) {
			NotificationChain msgs = null;
			if (referenciado != null)
				msgs = ((InternalEObject)referenciado).eInverseRemove(this, ProinsoPackage.REFERENCIABLE__REFERENCIAS, Referenciable.class, msgs);
			if (newReferenciado != null)
				msgs = ((InternalEObject)newReferenciado).eInverseAdd(this, ProinsoPackage.REFERENCIABLE__REFERENCIAS, Referenciable.class, msgs);
			msgs = basicSetReferenciado(newReferenciado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.REFERENCE_RUN__REFERENCIADO, newReferenciado, newReferenciado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				if (referenciado != null)
					msgs = ((InternalEObject)referenciado).eInverseRemove(this, ProinsoPackage.REFERENCIABLE__REFERENCIAS, Referenciable.class, msgs);
				return basicSetReferenciado((Referenciable)otherEnd, msgs);
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
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				return basicSetReferenciado(null, msgs);
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
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				if (resolve) return getReferenciado();
				return basicGetReferenciado();
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
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				setReferenciado((Referenciable)newValue);
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
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				setReferenciado((Referenciable)null);
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
			case ProinsoPackage.REFERENCE_RUN__REFERENCIADO:
				return referenciado != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceRunImpl