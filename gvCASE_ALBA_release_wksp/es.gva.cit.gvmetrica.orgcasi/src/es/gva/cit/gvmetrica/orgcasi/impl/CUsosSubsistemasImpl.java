
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CUsosSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;
import es.gva.cit.gvmetrica.orgcasi.UsoSubsistema;

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
 * An implementation of the model object '<em><b>CUsos Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl#getUsosSubsistemas <em>Usos Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsosSubsistemasImpl#getSubsistema <em>Subsistema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUsosSubsistemasImpl extends OrgcasiCollectionImpl implements CUsosSubsistemas {
	/**
	 * The cached value of the '{@link #getUsosSubsistemas() <em>Usos Subsistemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected EList usosSubsistemas = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUsosSubsistemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CUSOS_SUBSISTEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsosSubsistemas() {
		if (usosSubsistemas == null) {
			usosSubsistemas = new EObjectContainmentWithInverseEList(UsoSubsistema.class, this, OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS, OrgcasiPackage.USO_SUBSISTEMA__USOS_SUBSISTEMAS);
		}
		return usosSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsistema getSubsistema() {
		if (eContainerFeatureID != OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA) return null;
		return (Subsistema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistema(Subsistema newSubsistema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubsistema, OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistema(Subsistema newSubsistema) {
		if (newSubsistema != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA && newSubsistema != null)) {
			if (EcoreUtil.isAncestor(this, newSubsistema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubsistema != null)
				msgs = ((InternalEObject)newSubsistema).eInverseAdd(this, OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS, Subsistema.class, msgs);
			msgs = basicSetSubsistema(newSubsistema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA, newSubsistema, newSubsistema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				return ((InternalEList)getUsosSubsistemas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubsistema((Subsistema)otherEnd, msgs);
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				return ((InternalEList)getUsosSubsistemas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				return basicSetSubsistema(null, msgs);
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS, Subsistema.class, msgs);
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				return getUsosSubsistemas();
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				return getSubsistema();
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				getUsosSubsistemas().clear();
				getUsosSubsistemas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				setSubsistema((Subsistema)newValue);
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				getUsosSubsistemas().clear();
				return;
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				setSubsistema((Subsistema)null);
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
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__USOS_SUBSISTEMAS:
				return usosSubsistemas != null && !usosSubsistemas.isEmpty();
			case OrgcasiPackage.CUSOS_SUBSISTEMAS__SUBSISTEMA:
				return getSubsistema() != null;
		}
		return super.eIsSet(featureID);
	}

} //CUsosSubsistemasImpl