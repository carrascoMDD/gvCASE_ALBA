/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos;
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
 * An implementation of the model object '<em><b>CDocumentos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CDocumentosImpl#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDocumentosImpl extends OrgcasiCollectionImpl implements CDocumentos {
	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList documentos = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDocumentosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CDOCUMENTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectContainmentWithInverseEList(ADocumento.class, this, OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS, OrgcasiPackage.ADOCUMENTO__DOCUMENTOS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDocumentos getContenedor() {
		if (eContainerFeatureID != OrgcasiPackage.CDOCUMENTOS__CONTENEDOR) return null;
		return (ContenedorDocumentos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedor(ContenedorDocumentos newContenedor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedor, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedor(ContenedorDocumentos newContenedor) {
		if (newContenedor != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CDOCUMENTOS__CONTENEDOR && newContenedor != null)) {
			if (EcoreUtil.isAncestor(this, newContenedor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedor != null)
				msgs = ((InternalEObject)newContenedor).eInverseAdd(this, OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS, ContenedorDocumentos.class, msgs);
			msgs = basicSetContenedor(newContenedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, newContenedor, newContenedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedor((ContenedorDocumentos)otherEnd, msgs);
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
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				return basicSetContenedor(null, msgs);
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
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS, ContenedorDocumentos.class, msgs);
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
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				return getDocumentos();
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				return getContenedor();
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
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				setContenedor((ContenedorDocumentos)newValue);
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
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				getDocumentos().clear();
				return;
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				setContenedor((ContenedorDocumentos)null);
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
			case OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
			case OrgcasiPackage.CDOCUMENTOS__CONTENEDOR:
				return getContenedor() != null;
		}
		return super.eIsSet(featureID);
	}

} //CDocumentosImpl