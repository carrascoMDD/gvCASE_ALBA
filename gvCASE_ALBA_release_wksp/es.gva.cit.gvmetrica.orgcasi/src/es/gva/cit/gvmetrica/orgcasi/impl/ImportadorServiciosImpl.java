
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.ImportadorServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Importador Servicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportadorServiciosImpl#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ImportadorServiciosImpl extends EObjectImpl implements ImportadorServicios {
	/**
	 * The cached value of the '{@link #getImportacionesServicios() <em>Importaciones Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportacionesServicios()
	 * @generated
	 * @ordered
	 */
	protected CImportacionesServicios importacionesServicios = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportadorServiciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.IMPORTADOR_SERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesServicios getImportacionesServicios() {
		return importacionesServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportacionesServicios(CImportacionesServicios newImportacionesServicios, NotificationChain msgs) {
		CImportacionesServicios oldImportacionesServicios = importacionesServicios;
		importacionesServicios = newImportacionesServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS, oldImportacionesServicios, newImportacionesServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportacionesServicios(CImportacionesServicios newImportacionesServicios) {
		if (newImportacionesServicios != importacionesServicios) {
			NotificationChain msgs = null;
			if (importacionesServicios != null)
				msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			if (newImportacionesServicios != null)
				msgs = ((InternalEObject)newImportacionesServicios).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			msgs = basicSetImportacionesServicios(newImportacionesServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS, newImportacionesServicios, newImportacionesServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				if (importacionesServicios != null)
					msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS, null, msgs);
				return basicSetImportacionesServicios((CImportacionesServicios)otherEnd, msgs);
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
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return basicSetImportacionesServicios(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return getImportacionesServicios();
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
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)newValue);
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
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)null);
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
			case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return importacionesServicios != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportadorServiciosImpl