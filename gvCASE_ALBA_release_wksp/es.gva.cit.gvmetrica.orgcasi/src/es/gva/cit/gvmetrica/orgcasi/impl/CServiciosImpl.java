
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CServicios;
import es.gva.cit.gvmetrica.orgcasi.Interfaz;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Servicio;

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
 * An implementation of the model object '<em><b>CServicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl#getInterfaz <em>Interfaz</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CServiciosImpl#getServicios <em>Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CServiciosImpl extends OrgcasiCollectionImpl implements CServicios {
	/**
	 * The cached value of the '{@link #getServicios() <em>Servicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicios()
	 * @generated
	 * @ordered
	 */
	protected EList servicios = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CServiciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaz getInterfaz() {
		if (eContainerFeatureID != OrgcasiPackage.CSERVICIOS__INTERFAZ) return null;
		return (Interfaz)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaz(Interfaz newInterfaz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterfaz, OrgcasiPackage.CSERVICIOS__INTERFAZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaz(Interfaz newInterfaz) {
		if (newInterfaz != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CSERVICIOS__INTERFAZ && newInterfaz != null)) {
			if (EcoreUtil.isAncestor(this, newInterfaz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterfaz != null)
				msgs = ((InternalEObject)newInterfaz).eInverseAdd(this, OrgcasiPackage.INTERFAZ__SERVICIOS, Interfaz.class, msgs);
			msgs = basicSetInterfaz(newInterfaz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CSERVICIOS__INTERFAZ, newInterfaz, newInterfaz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServicios() {
		if (servicios == null) {
			servicios = new EObjectContainmentWithInverseEList(Servicio.class, this, OrgcasiPackage.CSERVICIOS__SERVICIOS, OrgcasiPackage.SERVICIO__SERVICIOS);
		}
		return servicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterfaz((Interfaz)otherEnd, msgs);
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				return ((InternalEList)getServicios()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				return basicSetInterfaz(null, msgs);
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				return ((InternalEList)getServicios()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.INTERFAZ__SERVICIOS, Interfaz.class, msgs);
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				return getInterfaz();
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				return getServicios();
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				setInterfaz((Interfaz)newValue);
				return;
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				getServicios().clear();
				getServicios().addAll((Collection)newValue);
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				setInterfaz((Interfaz)null);
				return;
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				getServicios().clear();
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
			case OrgcasiPackage.CSERVICIOS__INTERFAZ:
				return getInterfaz() != null;
			case OrgcasiPackage.CSERVICIOS__SERVICIOS:
				return servicios != null && !servicios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CServiciosImpl