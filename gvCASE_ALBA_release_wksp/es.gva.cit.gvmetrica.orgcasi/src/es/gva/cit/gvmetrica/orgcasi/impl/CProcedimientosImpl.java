/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.CProcedimientos;
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
 * An implementation of the model object '<em><b>CProcedimientos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CProcedimientosImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CProcedimientosImpl extends OrgcasiCollectionImpl implements CProcedimientos {
	/**
	 * The cached value of the '{@link #getProcedimientos() <em>Procedimientos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected EList procedimientos = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CProcedimientosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CPROCEDIMIENTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectContainmentWithInverseEList(AProcedimiento.class, this, OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS, OrgcasiPackage.APROCEDIMIENTO__PROCEDIMIENTOS);
		}
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio getRepositorio() {
		if (eContainerFeatureID != OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO) return null;
		return (ARepositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO, msgs);
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
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO:
				return eBasicSetContainer(null, OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO, msgs);
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
			case OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO, ARepositorio.class, msgs);
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
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				return getProcedimientos();
			case OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO:
				return getRepositorio();
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
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				getProcedimientos().clear();
				getProcedimientos().addAll((Collection)newValue);
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
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				getProcedimientos().clear();
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
			case OrgcasiPackage.CPROCEDIMIENTOS__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
			case OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO:
				return getRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

} //CProcedimientosImpl