
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.Procedimientos;
import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedimientos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientosImpl#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ProcedimientosImpl#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedimientosImpl extends SimapaCollectionImpl implements Procedimientos {
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
	protected ProcedimientosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.PROCEDIMIENTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != SimapaPackage.PROCEDIMIENTOS__REPOSITORIO) return null;
		return (Repositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectContainmentWithInverseEList(Procedimiento.class, this, SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__PROCEDIMIENTOS);
		}
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.PROCEDIMIENTOS__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.PROCEDIMIENTOS__REPOSITORIO, msgs);
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.PROCEDIMIENTOS__REPOSITORIO:
				return eBasicSetContainer(null, SimapaPackage.PROCEDIMIENTOS__REPOSITORIO, msgs);
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.PROCEDIMIENTOS__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.REPOSITORIO__PROCEDIMIENTOS, Repositorio.class, msgs);
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
			case SimapaPackage.PROCEDIMIENTOS__REPOSITORIO:
				return getRepositorio();
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
				return getProcedimientos();
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
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
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
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
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
			case SimapaPackage.PROCEDIMIENTOS__REPOSITORIO:
				return getRepositorio() != null;
			case SimapaPackage.PROCEDIMIENTOS__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedimientosImpl