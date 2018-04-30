/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales;
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
 * An implementation of the model object '<em><b>CEstructuras Funcionales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasFuncionalesImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEstructurasFuncionalesImpl extends OrgcasiCollectionImpl implements CEstructurasFuncionales {
	/**
	 * The cached value of the '{@link #getEstructurasFuncionales() <em>Estructuras Funcionales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasFuncionales()
	 * @generated
	 * @ordered
	 */
	protected EList estructurasFuncionales = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEstructurasFuncionalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CESTRUCTURAS_FUNCIONALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasFuncionales() {
		if (estructurasFuncionales == null) {
			estructurasFuncionales = new EObjectContainmentWithInverseEList(AEstructuraFuncional.class, this, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES, OrgcasiPackage.AESTRUCTURA_FUNCIONAL__ESTRUCTURAS_FUNCIONALES);
		}
		return estructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				return ((InternalEList)getEstructurasFuncionales()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				return ((InternalEList)getEstructurasFuncionales()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO:
				return eBasicSetContainer(null, OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales();
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO:
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				getEstructurasFuncionales().clear();
				getEstructurasFuncionales().addAll((Collection)newValue);
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				getEstructurasFuncionales().clear();
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
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__ESTRUCTURAS_FUNCIONALES:
				return estructurasFuncionales != null && !estructurasFuncionales.isEmpty();
			case OrgcasiPackage.CESTRUCTURAS_FUNCIONALES__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CEstructurasFuncionalesImpl