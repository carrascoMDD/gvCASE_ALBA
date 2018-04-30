
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.PerfilParticipante;
import es.gva.cit.gvmetrica.proinso.PerfilesParticipantes;
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
 * An implementation of the model object '<em><b>Perfiles Participantes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilesParticipantesImpl#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerfilesParticipantesImpl extends ProinsoCollectionImpl implements PerfilesParticipantes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getPerfilesParticipantes() <em>Perfiles Participantes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfilesParticipantes()
	 * @generated
	 * @ordered
	 */
	protected EList perfilesParticipantes = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfilesParticipantesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PERFILES_PARTICIPANTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPerfilesParticipantes() {
		if (perfilesParticipantes == null) {
			perfilesParticipantes = new EObjectContainmentWithInverseEList(PerfilParticipante.class, this, ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES, ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES);
		}
		return perfilesParticipantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodologia getMetodologia() {
		if (eContainerFeatureID != ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA) return null;
		return (Metodologia)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				return ((InternalEList)getPerfilesParticipantes()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA, msgs);
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				return ((InternalEList)getPerfilesParticipantes()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA:
				return eBasicSetContainer(null, ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA, msgs);
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES, Metodologia.class, msgs);
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				return getPerfilesParticipantes();
			case ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA:
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				getPerfilesParticipantes().clear();
				getPerfilesParticipantes().addAll((Collection)newValue);
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				getPerfilesParticipantes().clear();
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
			case ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES:
				return perfilesParticipantes != null && !perfilesParticipantes.isEmpty();
			case ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA:
				return getMetodologia() != null;
		}
		return super.eIsSet(featureID);
	}

} //PerfilesParticipantesImpl