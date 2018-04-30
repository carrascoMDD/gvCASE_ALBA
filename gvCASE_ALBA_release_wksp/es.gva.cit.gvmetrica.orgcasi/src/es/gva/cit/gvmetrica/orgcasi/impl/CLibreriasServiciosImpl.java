
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios;
import es.gva.cit.gvmetrica.orgcasi.LibreriaServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLibrerias Servicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CLibreriasServiciosImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLibreriasServiciosImpl extends OrgcasiCollectionImpl implements CLibreriasServicios {
	/**
	 * The cached value of the '{@link #getLibreriasServicios() <em>Librerias Servicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreriasServicios()
	 * @generated
	 * @ordered
	 */
	protected EList libreriasServicios = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLibreriasServiciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CLIBRERIAS_SERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLibreriasServicios() {
		if (libreriasServicios == null) {
			libreriasServicios = new EObjectContainmentWithInverseEList(LibreriaServicios.class, this, OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS, OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS);
		}
		return libreriasServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio getRepositorio() {
		if (eContainerFeatureID != OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO) return null;
		return (ARepositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositorio(ARepositorio newRepositorio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepositorio, OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositorio(ARepositorio newRepositorio) {
		if (newRepositorio != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO && newRepositorio != null)) {
			if (EcoreUtil.isAncestor(this, newRepositorio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepositorio != null)
				msgs = ((InternalEObject)newRepositorio).eInverseAdd(this, OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS, ARepositorio.class, msgs);
			msgs = basicSetRepositorio(newRepositorio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO, newRepositorio, newRepositorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				return ((InternalEList)getLibreriasServicios()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepositorio((ARepositorio)otherEnd, msgs);
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				return ((InternalEList)getLibreriasServicios()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				return basicSetRepositorio(null, msgs);
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS, ARepositorio.class, msgs);
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				return getLibreriasServicios();
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				getLibreriasServicios().clear();
				getLibreriasServicios().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				setRepositorio((ARepositorio)newValue);
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				getLibreriasServicios().clear();
				return;
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				setRepositorio((ARepositorio)null);
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
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS:
				return libreriasServicios != null && !libreriasServicios.isEmpty();
			case OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO:
				return getRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

} //CLibreriasServiciosImpl