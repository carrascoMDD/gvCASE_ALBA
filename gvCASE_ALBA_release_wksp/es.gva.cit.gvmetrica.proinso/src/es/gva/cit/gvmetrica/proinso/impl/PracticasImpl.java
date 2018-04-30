
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.Practica;
import es.gva.cit.gvmetrica.proinso.Practicas;
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
 * An implementation of the model object '<em><b>Practicas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PracticasImpl#getPracticas <em>Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PracticasImpl#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PracticasImpl extends ProinsoCollectionImpl implements Practicas {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getPracticas() <em>Practicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticas()
	 * @generated
	 * @ordered
	 */
	protected EList practicas = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PracticasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PRACTICAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPracticas() {
		if (practicas == null) {
			practicas = new EObjectContainmentWithInverseEList(Practica.class, this, ProinsoPackage.PRACTICAS__PRACTICAS, ProinsoPackage.PRACTICA__PRACTICAS);
		}
		return practicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodologia getMetodologia() {
		if (eContainerFeatureID != ProinsoPackage.PRACTICAS__METODOLOGIA) return null;
		return (Metodologia)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				return ((InternalEList)getPracticas()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PRACTICAS__METODOLOGIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PRACTICAS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				return ((InternalEList)getPracticas()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PRACTICAS__METODOLOGIA:
				return eBasicSetContainer(null, ProinsoPackage.PRACTICAS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PRACTICAS__METODOLOGIA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.METODOLOGIA__PRACTICAS, Metodologia.class, msgs);
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
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				return getPracticas();
			case ProinsoPackage.PRACTICAS__METODOLOGIA:
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
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				getPracticas().clear();
				getPracticas().addAll((Collection)newValue);
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
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				getPracticas().clear();
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
			case ProinsoPackage.PRACTICAS__PRACTICAS:
				return practicas != null && !practicas.isEmpty();
			case ProinsoPackage.PRACTICAS__METODOLOGIA:
				return getMetodologia() != null;
		}
		return super.eIsSet(featureID);
	}

} //PracticasImpl