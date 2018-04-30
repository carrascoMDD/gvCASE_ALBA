
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.NormativaYLegislacion;
import es.gva.cit.simapa.NormativasYLegislaciones;
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
 * An implementation of the model object '<em><b>Normativas YLegislaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.NormativasYLegislacionesImpl#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativasYLegislacionesImpl#getNormativas <em>Normativas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormativasYLegislacionesImpl extends SimapaCollectionImpl implements NormativasYLegislaciones {
	/**
	 * The cached value of the '{@link #getNormativas() <em>Normativas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativas()
	 * @generated
	 * @ordered
	 */
	protected EList normativas = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormativasYLegislacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.NORMATIVAS_YLEGISLACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO) return null;
		return (Repositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNormativas() {
		if (normativas == null) {
			normativas = new EObjectContainmentWithInverseEList(NormativaYLegislacion.class, this, SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS, SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS);
		}
		return normativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO, msgs);
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO:
				return eBasicSetContainer(null, SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO, msgs);
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return ((InternalEList)getNormativas()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.REPOSITORIO__NORMATIVAS, Repositorio.class, msgs);
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO:
				return getRepositorio();
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return getNormativas();
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				getNormativas().clear();
				getNormativas().addAll((Collection)newValue);
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				getNormativas().clear();
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
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO:
				return getRepositorio() != null;
			case SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS:
				return normativas != null && !normativas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormativasYLegislacionesImpl