/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.AUnidadExterna;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas;
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
 * An implementation of the model object '<em><b>CUnidades Externas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUnidadesExternasImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUnidadesExternasImpl extends OrgcasiCollectionImpl implements CUnidadesExternas {
	/**
	 * The cached value of the '{@link #getUnidades() <em>Unidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidades()
	 * @generated
	 * @ordered
	 */
	protected EList unidades = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUnidadesExternasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CUNIDADES_EXTERNAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnidades() {
		if (unidades == null) {
			unidades = new EObjectContainmentWithInverseEList(AUnidadExterna.class, this, OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES, OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES);
		}
		return unidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				return ((InternalEList)getUnidades()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				return ((InternalEList)getUnidades()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO:
				return eBasicSetContainer(null, OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				return getUnidades();
			case OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO:
				return getProcedimiento();
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				getUnidades().clear();
				getUnidades().addAll((Collection)newValue);
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				getUnidades().clear();
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
			case OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES:
				return unidades != null && !unidades.isEmpty();
			case OrgcasiPackage.CUNIDADES_EXTERNAS__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CUnidadesExternasImpl