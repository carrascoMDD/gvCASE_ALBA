
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CInterfaces;
import es.gva.cit.gvmetrica.orgcasi.Interfaz;
import es.gva.cit.gvmetrica.orgcasi.LibreriaServicios;
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
 * An implementation of the model object '<em><b>CInterfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CInterfacesImpl#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CInterfacesImpl extends OrgcasiCollectionImpl implements CInterfaces {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList interfaces = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CINTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList(Interfaz.class, this, OrgcasiPackage.CINTERFACES__INTERFACES, OrgcasiPackage.INTERFAZ__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibreriaServicios getLibreriaServicios() {
		if (eContainerFeatureID != OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS) return null;
		return (LibreriaServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreriaServicios(LibreriaServicios newLibreriaServicios, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibreriaServicios, OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreriaServicios(LibreriaServicios newLibreriaServicios) {
		if (newLibreriaServicios != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS && newLibreriaServicios != null)) {
			if (EcoreUtil.isAncestor(this, newLibreriaServicios))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibreriaServicios != null)
				msgs = ((InternalEObject)newLibreriaServicios).eInverseAdd(this, OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES, LibreriaServicios.class, msgs);
			msgs = basicSetLibreriaServicios(newLibreriaServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS, newLibreriaServicios, newLibreriaServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				return ((InternalEList)getInterfaces()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibreriaServicios((LibreriaServicios)otherEnd, msgs);
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
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				return ((InternalEList)getInterfaces()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				return basicSetLibreriaServicios(null, msgs);
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
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES, LibreriaServicios.class, msgs);
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
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				return getInterfaces();
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				return getLibreriaServicios();
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
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				setLibreriaServicios((LibreriaServicios)newValue);
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
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				getInterfaces().clear();
				return;
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				setLibreriaServicios((LibreriaServicios)null);
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
			case OrgcasiPackage.CINTERFACES__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS:
				return getLibreriaServicios() != null;
		}
		return super.eIsSet(featureID);
	}

} //CInterfacesImpl