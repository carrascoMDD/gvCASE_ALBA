
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Con Documentacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ConDocumentacionImpl#getDocumentacion <em>Documentacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConDocumentacionImpl extends EObjectImpl implements ConDocumentacion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getDocumentacion() <em>Documentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected Documentacion documentacion = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConDocumentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.CON_DOCUMENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentacion getDocumentacion() {
		return documentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentacion(Documentacion newDocumentacion, NotificationChain msgs) {
		Documentacion oldDocumentacion = documentacion;
		documentacion = newDocumentacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION, oldDocumentacion, newDocumentacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentacion(Documentacion newDocumentacion) {
		if (newDocumentacion != documentacion) {
			NotificationChain msgs = null;
			if (documentacion != null)
				msgs = ((InternalEObject)documentacion).eInverseRemove(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			if (newDocumentacion != null)
				msgs = ((InternalEObject)newDocumentacion).eInverseAdd(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			msgs = basicSetDocumentacion(newDocumentacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION, newDocumentacion, newDocumentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				if (documentacion != null)
					msgs = ((InternalEObject)documentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION, null, msgs);
				return basicSetDocumentacion((Documentacion)otherEnd, msgs);
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
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				return basicSetDocumentacion(null, msgs);
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
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				return getDocumentacion();
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
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				setDocumentacion((Documentacion)newValue);
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
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				setDocumentacion((Documentacion)null);
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
			case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION:
				return documentacion != null;
		}
		return super.eIsSet(featureID);
	}

} //ConDocumentacionImpl