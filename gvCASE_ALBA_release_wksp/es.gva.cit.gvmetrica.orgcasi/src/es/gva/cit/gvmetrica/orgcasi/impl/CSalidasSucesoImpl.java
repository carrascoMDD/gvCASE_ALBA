/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.SalidaSuceso;
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
 * An implementation of the model object '<em><b>CSalidas Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSalidasSucesoImpl#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSalidasSucesoImpl extends OrgcasiCollectionImpl implements CSalidasSuceso {
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
	protected CSalidasSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSALIDAS_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suceso getSuceso() {
		if (eContainerFeatureID != OrgcasiPackage.CSALIDAS_SUCESO__SUCESO) return null;
		return (Suceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuceso(Suceso newSuceso, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuceso, OrgcasiPackage.CSALIDAS_SUCESO__SUCESO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuceso(Suceso newSuceso) {
		if (newSuceso != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CSALIDAS_SUCESO__SUCESO && newSuceso != null)) {
			if (EcoreUtil.isAncestor(this, newSuceso))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuceso != null)
				msgs = ((InternalEObject)newSuceso).eInverseAdd(this, OrgcasiPackage.SUCESO__SALIDAS, Suceso.class, msgs);
			msgs = basicSetSuceso(newSuceso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CSALIDAS_SUCESO__SUCESO, newSuceso, newSuceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSalidas() {
		if (salidas == null) {
			salidas = new EObjectContainmentWithInverseEList(SalidaSuceso.class, this, OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS, OrgcasiPackage.SALIDA_SUCESO__SALIDAS);
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				return ((InternalEList)getSalidas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				return ((InternalEList)getSalidas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUCESO__SALIDAS, Suceso.class, msgs);
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				return getSalidas();
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				getSalidas().clear();
				getSalidas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				getSalidas().clear();
				return;
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
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
			case OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS:
				return salidas != null && !salidas.isEmpty();
			case OrgcasiPackage.CSALIDAS_SUCESO__SUCESO:
				return getSuceso() != null;
		}
		return super.eIsSet(featureID);
	}

} //CSalidasSucesoImpl