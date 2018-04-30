/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.CEntradasAccion;
import es.gva.cit.gvmetrica.orgcasi.EntradaAccion;
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
 * An implementation of the model object '<em><b>CEntradas Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEntradasAccionImpl#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEntradasAccionImpl extends OrgcasiCollectionImpl implements CEntradasAccion {
	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected EList entradas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEntradasAccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CENTRADAS_ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accion getAccion() {
		if (eContainerFeatureID != OrgcasiPackage.CENTRADAS_ACCION__ACCION) return null;
		return (Accion)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccion(Accion newAccion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAccion, OrgcasiPackage.CENTRADAS_ACCION__ACCION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccion(Accion newAccion) {
		if (newAccion != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CENTRADAS_ACCION__ACCION && newAccion != null)) {
			if (EcoreUtil.isAncestor(this, newAccion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccion != null)
				msgs = ((InternalEObject)newAccion).eInverseAdd(this, OrgcasiPackage.ACCION__ENTRADAS, Accion.class, msgs);
			msgs = basicSetAccion(newAccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CENTRADAS_ACCION__ACCION, newAccion, newAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntradas() {
		if (entradas == null) {
			entradas = new EObjectContainmentWithInverseEList(EntradaAccion.class, this, OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS, OrgcasiPackage.ENTRADA_ACCION__ENTRADAS);
		}
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				return ((InternalEList)getEntradas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
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
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				return ((InternalEList)getEntradas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
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
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.ACCION__ENTRADAS, Accion.class, msgs);
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
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				return getEntradas();
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
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
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				getEntradas().clear();
				getEntradas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
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
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				getEntradas().clear();
				return;
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
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
			case OrgcasiPackage.CENTRADAS_ACCION__ENTRADAS:
				return entradas != null && !entradas.isEmpty();
			case OrgcasiPackage.CENTRADAS_ACCION__ACCION:
				return getAccion() != null;
		}
		return super.eIsSet(featureID);
	}

} //CEntradasAccionImpl