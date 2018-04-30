
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.Aplicaciones;
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
 * An implementation of the model object '<em><b>Aplicaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionesImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionesImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AplicacionesImpl extends SimapaCollectionImpl implements Aplicaciones {
	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected EList aplicaciones = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.APLICACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAplicaciones() {
		if (aplicaciones == null) {
			aplicaciones = new EObjectContainmentWithInverseEList(Aplicacion.class, this, SimapaPackage.APLICACIONES__APLICACIONES, SimapaPackage.APLICACION__APLICACIONES);
		}
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != SimapaPackage.APLICACIONES__REPOSITORIO) return null;
		return (Repositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.APLICACIONES__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicAdd(otherEnd, msgs);
			case SimapaPackage.APLICACIONES__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.APLICACIONES__REPOSITORIO, msgs);
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
			case SimapaPackage.APLICACIONES__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicRemove(otherEnd, msgs);
			case SimapaPackage.APLICACIONES__REPOSITORIO:
				return eBasicSetContainer(null, SimapaPackage.APLICACIONES__REPOSITORIO, msgs);
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
			case SimapaPackage.APLICACIONES__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.REPOSITORIO__APLICACIONES, Repositorio.class, msgs);
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
			case SimapaPackage.APLICACIONES__APLICACIONES:
				return getAplicaciones();
			case SimapaPackage.APLICACIONES__REPOSITORIO:
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
			case SimapaPackage.APLICACIONES__APLICACIONES:
				getAplicaciones().clear();
				getAplicaciones().addAll((Collection)newValue);
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
			case SimapaPackage.APLICACIONES__APLICACIONES:
				getAplicaciones().clear();
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
			case SimapaPackage.APLICACIONES__APLICACIONES:
				return aplicaciones != null && !aplicaciones.isEmpty();
			case SimapaPackage.APLICACIONES__REPOSITORIO:
				return getRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

} //AplicacionesImpl