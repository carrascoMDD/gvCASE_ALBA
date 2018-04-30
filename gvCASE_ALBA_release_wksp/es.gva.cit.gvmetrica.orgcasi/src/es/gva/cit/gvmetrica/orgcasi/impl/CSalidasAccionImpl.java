/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.CSalidasAccion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.SalidaAccion;

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
 * An implementation of the model object '<em><b>CSalidas Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasAccionImpl#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSalidasAccionImpl extends OrgcasiCollectionImpl implements CSalidasAccion {
	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected EList salidas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSalidasAccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSALIDAS_ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accion getAccion() {
		if (eContainerFeatureID != OrgcasiPackage.CSALIDAS_ACCION__ACCION) return null;
		return (Accion)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccion(Accion newAccion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAccion, OrgcasiPackage.CSALIDAS_ACCION__ACCION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccion(Accion newAccion) {
		if (newAccion != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CSALIDAS_ACCION__ACCION && newAccion != null)) {
			if (EcoreUtil.isAncestor(this, newAccion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccion != null)
				msgs = ((InternalEObject)newAccion).eInverseAdd(this, OrgcasiPackage.ACCION__SALIDAS, Accion.class, msgs);
			msgs = basicSetAccion(newAccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CSALIDAS_ACCION__ACCION, newAccion, newAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSalidas() {
		if (salidas == null) {
			salidas = new EObjectContainmentWithInverseEList(SalidaAccion.class, this, OrgcasiPackage.CSALIDAS_ACCION__SALIDAS, OrgcasiPackage.SALIDA_ACCION__SALIDAS);
		}
		return salidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				return ((InternalEList)getSalidas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccion((Accion)otherEnd, msgs);
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
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				return ((InternalEList)getSalidas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				return basicSetAccion(null, msgs);
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
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.ACCION__SALIDAS, Accion.class, msgs);
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
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				return getSalidas();
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				return getAccion();
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
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				getSalidas().clear();
				getSalidas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				setAccion((Accion)newValue);
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
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				getSalidas().clear();
				return;
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				setAccion((Accion)null);
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
			case OrgcasiPackage.CSALIDAS_ACCION__SALIDAS:
				return salidas != null && !salidas.isEmpty();
			case OrgcasiPackage.CSALIDAS_ACCION__ACCION:
				return getAccion() != null;
		}
		return super.eIsSet(featureID);
	}

} //CSalidasAccionImpl