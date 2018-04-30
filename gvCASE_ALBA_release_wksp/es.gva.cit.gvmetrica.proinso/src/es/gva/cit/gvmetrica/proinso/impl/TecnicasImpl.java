
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Tecnica;
import es.gva.cit.gvmetrica.proinso.Tecnicas;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tecnicas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicasImpl#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TecnicasImpl extends ProinsoCollectionImpl implements Tecnicas {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getTecnicas() <em>Tecnicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnicas()
	 * @generated
	 * @ordered
	 */
	protected EList tecnicas = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TecnicasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.TECNICAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTecnicas() {
		if (tecnicas == null) {
			tecnicas = new EObjectContainmentWithInverseEList(Tecnica.class, this, ProinsoPackage.TECNICAS__TECNICAS, ProinsoPackage.TECNICA__TECNICAS);
		}
		return tecnicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodologia getMetodologia() {
		if (eContainerFeatureID != ProinsoPackage.TECNICAS__METODOLOGIA) return null;
		return (Metodologia)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.TECNICAS__TECNICAS:
				return ((InternalEList)getTecnicas()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TECNICAS__METODOLOGIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.TECNICAS__METODOLOGIA, msgs);
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
			case ProinsoPackage.TECNICAS__TECNICAS:
				return ((InternalEList)getTecnicas()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TECNICAS__METODOLOGIA:
				return eBasicSetContainer(null, ProinsoPackage.TECNICAS__METODOLOGIA, msgs);
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
			case ProinsoPackage.TECNICAS__METODOLOGIA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.METODOLOGIA__TECNICAS, Metodologia.class, msgs);
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
			case ProinsoPackage.TECNICAS__TECNICAS:
				return getTecnicas();
			case ProinsoPackage.TECNICAS__METODOLOGIA:
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
			case ProinsoPackage.TECNICAS__TECNICAS:
				getTecnicas().clear();
				getTecnicas().addAll((Collection)newValue);
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
			case ProinsoPackage.TECNICAS__TECNICAS:
				getTecnicas().clear();
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
			case ProinsoPackage.TECNICAS__TECNICAS:
				return tecnicas != null && !tecnicas.isEmpty();
			case ProinsoPackage.TECNICAS__METODOLOGIA:
				return getMetodologia() != null;
		}
		return super.eIsSet(featureID);
	}

} //TecnicasImpl