
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.Proceso;
import es.gva.cit.gvmetrica.proinso.Procesos;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procesos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ProcesosImpl#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcesosImpl extends ProinsoCollectionImpl implements Procesos {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getProcesos() <em>Procesos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesos()
	 * @generated
	 * @ordered
	 */
	protected EList procesos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcesosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PROCESOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcesos() {
		if (procesos == null) {
			procesos = new EObjectContainmentWithInverseEList(Proceso.class, this, ProinsoPackage.PROCESOS__PROCESOS, ProinsoPackage.PROCESO__PROCESOS);
		}
		return procesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodologia getMetodologia() {
		if (eContainerFeatureID != ProinsoPackage.PROCESOS__METODOLOGIA) return null;
		return (Metodologia)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PROCESOS__PROCESOS:
				return ((InternalEList)getProcesos()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PROCESOS__METODOLOGIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PROCESOS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PROCESOS__PROCESOS:
				return ((InternalEList)getProcesos()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PROCESOS__METODOLOGIA:
				return eBasicSetContainer(null, ProinsoPackage.PROCESOS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PROCESOS__METODOLOGIA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.METODOLOGIA__PROCESOS, Metodologia.class, msgs);
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
			case ProinsoPackage.PROCESOS__PROCESOS:
				return getProcesos();
			case ProinsoPackage.PROCESOS__METODOLOGIA:
				return getMetodologia();
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
			case ProinsoPackage.PROCESOS__PROCESOS:
				getProcesos().clear();
				getProcesos().addAll((Collection)newValue);
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
			case ProinsoPackage.PROCESOS__PROCESOS:
				getProcesos().clear();
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
			case ProinsoPackage.PROCESOS__PROCESOS:
				return procesos != null && !procesos.isEmpty();
			case ProinsoPackage.PROCESOS__METODOLOGIA:
				return getMetodologia() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcesosImpl