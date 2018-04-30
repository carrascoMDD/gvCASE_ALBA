/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AFlujo;
import es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFlujos Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CFlujosSucesoImpl#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CFlujosSucesoImpl extends OrgcasiCollectionImpl implements CFlujosSuceso {
	/**
	 * The cached value of the '{@link #getFlujos() <em>Flujos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujos()
	 * @generated
	 * @ordered
	 */
	protected EList flujos = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFlujosSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CFLUJOS_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujos() {
		if (flujos == null) {
			flujos = new EObjectWithInverseResolvingEList.ManyInverse(AFlujo.class, this, OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS, OrgcasiPackage.AFLUJO__FLUJO_DE_SUCESOS);
		}
		return flujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suceso getSuceso() {
		if (eContainerFeatureID != OrgcasiPackage.CFLUJOS_SUCESO__SUCESO) return null;
		return (Suceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuceso(Suceso newSuceso, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuceso, OrgcasiPackage.CFLUJOS_SUCESO__SUCESO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuceso(Suceso newSuceso) {
		if (newSuceso != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CFLUJOS_SUCESO__SUCESO && newSuceso != null)) {
			if (EcoreUtil.isAncestor(this, newSuceso))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuceso != null)
				msgs = ((InternalEObject)newSuceso).eInverseAdd(this, OrgcasiPackage.SUCESO__FLUJOS, Suceso.class, msgs);
			msgs = basicSetSuceso(newSuceso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CFLUJOS_SUCESO__SUCESO, newSuceso, newSuceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				return ((InternalEList)getFlujos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuceso((Suceso)otherEnd, msgs);
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
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				return ((InternalEList)getFlujos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				return basicSetSuceso(null, msgs);
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
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUCESO__FLUJOS, Suceso.class, msgs);
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
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				return getFlujos();
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				return getSuceso();
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
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				getFlujos().clear();
				getFlujos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				setSuceso((Suceso)newValue);
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
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				getFlujos().clear();
				return;
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				setSuceso((Suceso)null);
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
			case OrgcasiPackage.CFLUJOS_SUCESO__FLUJOS:
				return flujos != null && !flujos.isEmpty();
			case OrgcasiPackage.CFLUJOS_SUCESO__SUCESO:
				return getSuceso() != null;
		}
		return super.eIsSet(featureID);
	}

} //CFlujosSucesoImpl