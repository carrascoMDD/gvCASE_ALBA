/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario;
import es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTerminos Glosario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CTerminosGlosarioImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTerminosGlosarioImpl extends OrgcasiCollectionImpl implements CTerminosGlosario {
	/**
	 * The cached value of the '{@link #getTerminosGlosario() <em>Terminos Glosario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminosGlosario()
	 * @generated
	 * @ordered
	 */
	protected EList terminosGlosario = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTerminosGlosarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CTERMINOS_GLOSARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		if (eContainerFeatureID != OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO) return null;
		return (AProcedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTerminosGlosario() {
		if (terminosGlosario == null) {
			terminosGlosario = new EObjectContainmentWithInverseEList(ATerminoGlosario.class, this, OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO, OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO);
		}
		return terminosGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				return ((InternalEList)getTerminosGlosario()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				return ((InternalEList)getTerminosGlosario()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO:
				return eBasicSetContainer(null, OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO, msgs);
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO, AProcedimiento.class, msgs);
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				return getTerminosGlosario();
			case OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO:
				return getProcedimiento();
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				getTerminosGlosario().clear();
				getTerminosGlosario().addAll((Collection)newValue);
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				getTerminosGlosario().clear();
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
			case OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO:
				return terminosGlosario != null && !terminosGlosario.isEmpty();
			case OrgcasiPackage.CTERMINOS_GLOSARIO__PROCEDIMIENTO:
				return getProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CTerminosGlosarioImpl