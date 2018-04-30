
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ActividadInterfaz;
import es.gva.cit.gvmetrica.proinso.ProcesoInterfaz;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Interfaz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ActividadInterfazImpl#getProceso <em>Proceso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadInterfazImpl extends ActividadAbstractaImpl implements ActividadInterfaz {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadInterfazImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.ACTIVIDAD_INTERFAZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesoInterfaz getProceso() {
		if (eContainerFeatureID != ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO) return null;
		return (ProcesoInterfaz)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO, msgs);
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
			case ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO:
				return eBasicSetContainer(null, ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO, msgs);
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
			case ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.PROCESO_INTERFAZ__ACTIVIDADES, ProcesoInterfaz.class, msgs);
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
			case ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO:
				return getProceso();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProinsoPackage.ACTIVIDAD_INTERFAZ__PROCESO:
				return getProceso() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActividadInterfazImpl