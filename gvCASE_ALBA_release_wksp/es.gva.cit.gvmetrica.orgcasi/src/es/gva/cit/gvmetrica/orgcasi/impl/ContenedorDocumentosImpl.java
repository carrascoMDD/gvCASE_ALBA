
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Documentos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDocumentosImpl#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContenedorDocumentosImpl extends EObjectImpl implements ContenedorDocumentos {
	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected CDocumentos documentos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDocumentosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CONTENEDOR_DOCUMENTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDocumentos getDocumentos() {
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentos(CDocumentos newDocumentos, NotificationChain msgs) {
		CDocumentos oldDocumentos = documentos;
		documentos = newDocumentos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS, oldDocumentos, newDocumentos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentos(CDocumentos newDocumentos) {
		if (newDocumentos != documentos) {
			NotificationChain msgs = null;
			if (documentos != null)
				msgs = ((InternalEObject)documentos).eInverseRemove(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			if (newDocumentos != null)
				msgs = ((InternalEObject)newDocumentos).eInverseAdd(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			msgs = basicSetDocumentos(newDocumentos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS, newDocumentos, newDocumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				if (documentos != null)
					msgs = ((InternalEObject)documentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS, null, msgs);
				return basicSetDocumentos((CDocumentos)otherEnd, msgs);
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
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				return basicSetDocumentos(null, msgs);
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
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				return getDocumentos();
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
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				setDocumentos((CDocumentos)newValue);
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
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				setDocumentos((CDocumentos)null);
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
			case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS:
				return documentos != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorDocumentosImpl