
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.ImportacionServicios;
import es.gva.cit.gvmetrica.orgcasi.ImportadorServicios;
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
 * An implementation of the model object '<em><b>CImportaciones Servicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl#getImportador <em>Importador</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesServiciosImpl#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImportacionesServiciosImpl extends OrgcasiCollectionImpl implements CImportacionesServicios {
	/**
	 * The cached value of the '{@link #getImportacionesServicios() <em>Importaciones Servicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportacionesServicios()
	 * @generated
	 * @ordered
	 */
	protected EList importacionesServicios = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CImportacionesServiciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CIMPORTACIONES_SERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportadorServicios getImportador() {
		if (eContainerFeatureID != OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR) return null;
		return (ImportadorServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportador(ImportadorServicios newImportador, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportador, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportador(ImportadorServicios newImportador) {
		if (newImportador != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR && newImportador != null)) {
			if (EcoreUtil.isAncestor(this, newImportador))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportador != null)
				msgs = ((InternalEObject)newImportador).eInverseAdd(this, OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS, ImportadorServicios.class, msgs);
			msgs = basicSetImportador(newImportador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, newImportador, newImportador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImportacionesServicios() {
		if (importacionesServicios == null) {
			importacionesServicios = new EObjectContainmentWithInverseEList(ImportacionServicios.class, this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS, OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS);
		}
		return importacionesServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportador((ImportadorServicios)otherEnd, msgs);
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return ((InternalEList)getImportacionesServicios()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				return basicSetImportador(null, msgs);
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return ((InternalEList)getImportacionesServicios()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS, ImportadorServicios.class, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				return getImportador();
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				setImportador((ImportadorServicios)newValue);
				return;
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
				getImportacionesServicios().clear();
				getImportacionesServicios().addAll((Collection)newValue);
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				setImportador((ImportadorServicios)null);
				return;
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
				getImportacionesServicios().clear();
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
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR:
				return getImportador() != null;
			case OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return importacionesServicios != null && !importacionesServicios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CImportacionesServiciosImpl