
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento En Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl#getCondicionesEstado <em>Condiciones Estado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.DocumentoEnEstadoImpl#getDocumentoBase <em>Documento Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentoEnEstadoImpl extends ADocumentoImpl implements DocumentoEnEstado {
	/**
	 * The default value of the '{@link #getCondicionesEstado() <em>Condiciones Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicionesEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDICIONES_ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondicionesEstado() <em>Condiciones Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicionesEstado()
	 * @generated
	 * @ordered
	 */
	protected String condicionesEstado = CONDICIONES_ESTADO_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentoEnEstadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.DOCUMENTO_EN_ESTADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondicionesEstado() {
		return condicionesEstado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondicionesEstado(String newCondicionesEstado) {
		String oldCondicionesEstado = condicionesEstado;
		condicionesEstado = newCondicionesEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO, oldCondicionesEstado, condicionesEstado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADocumento getDocumentoBase() {
		if (eContainerFeatureID != OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE) return null;
		return (ADocumento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentoBase(ADocumento newDocumentoBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentoBase, OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentoBase(ADocumento newDocumentoBase) {
		if (newDocumentoBase != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE && newDocumentoBase != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentoBase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentoBase != null)
				msgs = ((InternalEObject)newDocumentoBase).eInverseAdd(this, OrgcasiPackage.ADOCUMENTO__ESTADOS, ADocumento.class, msgs);
			msgs = basicSetDocumentoBase(newDocumentoBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE, newDocumentoBase, newDocumentoBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentoBase((ADocumento)otherEnd, msgs);
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				return basicSetDocumentoBase(null, msgs);
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.ADOCUMENTO__ESTADOS, ADocumento.class, msgs);
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO:
				return getCondicionesEstado();
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				return getDocumentoBase();
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO:
				setCondicionesEstado((String)newValue);
				return;
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				setDocumentoBase((ADocumento)newValue);
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO:
				setCondicionesEstado(CONDICIONES_ESTADO_EDEFAULT);
				return;
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				setDocumentoBase((ADocumento)null);
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
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__CONDICIONES_ESTADO:
				return CONDICIONES_ESTADO_EDEFAULT == null ? condicionesEstado != null : !CONDICIONES_ESTADO_EDEFAULT.equals(condicionesEstado);
			case OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE:
				return getDocumentoBase() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (condicionesEstado: ");
		result.append(condicionesEstado);
		result.append(')');
		return result.toString();
	}

} //DocumentoEnEstadoImpl