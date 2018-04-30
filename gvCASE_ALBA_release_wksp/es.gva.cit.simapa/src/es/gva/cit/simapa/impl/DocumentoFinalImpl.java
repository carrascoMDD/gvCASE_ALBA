
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.DocumentoFinal;
import es.gva.cit.simapa.SimapaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento Final</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoFinalImpl#getDocumento <em>Documento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DocumentoFinalImpl extends OperacionImpl implements DocumentoFinal {
	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected Documento documento = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentoFinalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.DOCUMENTO_FINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getDocumento() {
		if (documento != null && documento.eIsProxy()) {
			InternalEObject oldDocumento = (InternalEObject)documento;
			documento = (Documento)eResolveProxy(oldDocumento);
			if (documento != oldDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO, oldDocumento, documento));
			}
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento basicGetDocumento() {
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumento(Documento newDocumento, NotificationChain msgs) {
		Documento oldDocumento = documento;
		documento = newDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO, oldDocumento, newDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(Documento newDocumento) {
		if (newDocumento != documento) {
			NotificationChain msgs = null;
			if (documento != null)
				msgs = ((InternalEObject)documento).eInverseRemove(this, SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES, Documento.class, msgs);
			if (newDocumento != null)
				msgs = ((InternalEObject)newDocumento).eInverseAdd(this, SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES, Documento.class, msgs);
			msgs = basicSetDocumento(newDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO, newDocumento, newDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				if (documento != null)
					msgs = ((InternalEObject)documento).eInverseRemove(this, SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES, Documento.class, msgs);
				return basicSetDocumento((Documento)otherEnd, msgs);
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
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				return basicSetDocumento(null, msgs);
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
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				if (resolve) return getDocumento();
				return basicGetDocumento();
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
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				setDocumento((Documento)newValue);
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
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				setDocumento((Documento)null);
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
			case SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO:
				return documento != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentoFinalImpl