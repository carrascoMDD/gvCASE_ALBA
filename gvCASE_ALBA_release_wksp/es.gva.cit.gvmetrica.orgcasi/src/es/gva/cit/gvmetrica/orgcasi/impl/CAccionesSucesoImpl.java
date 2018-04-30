/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAcciones Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CAccionesSucesoImpl#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CAccionesSucesoImpl extends OrgcasiCollectionImpl implements CAccionesSuceso {
	/**
	 * The cached value of the '{@link #getAcciones() <em>Acciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcciones()
	 * @generated
	 * @ordered
	 */
	protected EList acciones = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAccionesSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CACCIONES_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suceso getSuceso() {
		if (eContainerFeatureID != OrgcasiPackage.CACCIONES_SUCESO__SUCESO) return null;
		return (Suceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuceso(Suceso newSuceso, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuceso, OrgcasiPackage.CACCIONES_SUCESO__SUCESO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuceso(Suceso newSuceso) {
		if (newSuceso != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CACCIONES_SUCESO__SUCESO && newSuceso != null)) {
			if (EcoreUtil.isAncestor(this, newSuceso))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuceso != null)
				msgs = ((InternalEObject)newSuceso).eInverseAdd(this, OrgcasiPackage.SUCESO__ACCIONES, Suceso.class, msgs);
			msgs = basicSetSuceso(newSuceso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CACCIONES_SUCESO__SUCESO, newSuceso, newSuceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAcciones() {
		if (acciones == null) {
			acciones = new EObjectContainmentWithInverseEList(Accion.class, this, OrgcasiPackage.CACCIONES_SUCESO__ACCIONES, OrgcasiPackage.ACCION__ACCIONES);
		}
		return acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				return ((InternalEList)getAcciones()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
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
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				return ((InternalEList)getAcciones()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
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
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUCESO__ACCIONES, Suceso.class, msgs);
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
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				return getAcciones();
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
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
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				getAcciones().clear();
				getAcciones().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
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
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				getAcciones().clear();
				return;
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
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
			case OrgcasiPackage.CACCIONES_SUCESO__ACCIONES:
				return acciones != null && !acciones.isEmpty();
			case OrgcasiPackage.CACCIONES_SUCESO__SUCESO:
				return getSuceso() != null;
		}
		return super.eIsSet(featureID);
	}

} //CAccionesSucesoImpl