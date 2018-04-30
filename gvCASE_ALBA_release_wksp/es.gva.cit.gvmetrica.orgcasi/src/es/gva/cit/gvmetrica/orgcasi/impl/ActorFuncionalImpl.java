/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ActorFuncional;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Funcional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ActorFuncionalImpl#getNombreFuncional <em>Nombre Funcional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorFuncionalImpl extends ActorImpl implements ActorFuncional {
	/**
	 * The default value of the '{@link #getNombreFuncional() <em>Nombre Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFuncional()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_FUNCIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreFuncional() <em>Nombre Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFuncional()
	 * @generated
	 * @ordered
	 */
	protected String nombreFuncional = NOMBRE_FUNCIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorFuncionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ACTOR_FUNCIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreFuncional() {
		return nombreFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreFuncional(String newNombreFuncional) {
		String oldNombreFuncional = nombreFuncional;
		nombreFuncional = newNombreFuncional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL, oldNombreFuncional, nombreFuncional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgcasiPackage.ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL:
				return getNombreFuncional();
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
			case OrgcasiPackage.ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL:
				setNombreFuncional((String)newValue);
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
			case OrgcasiPackage.ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL:
				setNombreFuncional(NOMBRE_FUNCIONAL_EDEFAULT);
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
			case OrgcasiPackage.ACTOR_FUNCIONAL__NOMBRE_FUNCIONAL:
				return NOMBRE_FUNCIONAL_EDEFAULT == null ? nombreFuncional != null : !NOMBRE_FUNCIONAL_EDEFAULT.equals(nombreFuncional);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombreFuncional: ");
		result.append(nombreFuncional);
		result.append(')');
		return result.toString();
	}

} //ActorFuncionalImpl