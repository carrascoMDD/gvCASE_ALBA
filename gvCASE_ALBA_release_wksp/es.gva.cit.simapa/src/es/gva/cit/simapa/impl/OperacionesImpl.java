
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.Procedimiento;
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
 * An implementation of the model object '<em><b>Operaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionesImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionesImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperacionesImpl extends SimapaCollectionImpl implements Operaciones {
	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.OPERACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getProcedimiento() {
		if (eContainerFeatureID != SimapaPackage.OPERACIONES__PROCEDIMIENTO) return null;
		return (Procedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentWithInverseEList(Operacion.class, this, SimapaPackage.OPERACIONES__OPERACIONES, SimapaPackage.OPERACION__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.OPERACIONES__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.OPERACIONES__PROCEDIMIENTO, msgs);
			case SimapaPackage.OPERACIONES__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.OPERACIONES__PROCEDIMIENTO:
				return eBasicSetContainer(null, SimapaPackage.OPERACIONES__PROCEDIMIENTO, msgs);
			case SimapaPackage.OPERACIONES__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.OPERACIONES__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__OPERACIONES, Procedimiento.class, msgs);
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
			case SimapaPackage.OPERACIONES__PROCEDIMIENTO:
				return getProcedimiento();
			case SimapaPackage.OPERACIONES__OPERACIONES:
				return getOperaciones();
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
			case SimapaPackage.OPERACIONES__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection)newValue);
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
			case SimapaPackage.OPERACIONES__OPERACIONES:
				getOperaciones().clear();
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
			case SimapaPackage.OPERACIONES__PROCEDIMIENTO:
				return getProcedimiento() != null;
			case SimapaPackage.OPERACIONES__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperacionesImpl