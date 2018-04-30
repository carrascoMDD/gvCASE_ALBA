/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.RelacionDatos;

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
 * An implementation of the model object '<em><b>CRelaciones Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CRelacionesDatosImpl#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRelacionesDatosImpl extends OrgcasiCollectionImpl implements CRelacionesDatos {
	/**
	 * The cached value of the '{@link #getRelacionesDatos() <em>Relaciones Datos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesDatos()
	 * @generated
	 * @ordered
	 */
	protected EList relacionesDatos = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRelacionesDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CRELACIONES_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelacionesDatos() {
		if (relacionesDatos == null) {
			relacionesDatos = new EObjectContainmentWithInverseEList(RelacionDatos.class, this, OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS, OrgcasiPackage.RELACION_DATOS__RELACIONES_DATOS);
		}
		return relacionesDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatos getContenedor() {
		if (eContainerFeatureID != OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR) return null;
		return (ContenedorDatos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedor(ContenedorDatos newContenedor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedor, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedor(ContenedorDatos newContenedor) {
		if (newContenedor != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR && newContenedor != null)) {
			if (EcoreUtil.isAncestor(this, newContenedor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedor != null)
				msgs = ((InternalEObject)newContenedor).eInverseAdd(this, OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS, ContenedorDatos.class, msgs);
			msgs = basicSetContenedor(newContenedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, newContenedor, newContenedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				return ((InternalEList)getRelacionesDatos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedor((ContenedorDatos)otherEnd, msgs);
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
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				return ((InternalEList)getRelacionesDatos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				return basicSetContenedor(null, msgs);
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
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS, ContenedorDatos.class, msgs);
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
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				return getRelacionesDatos();
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				return getContenedor();
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
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				getRelacionesDatos().clear();
				getRelacionesDatos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				setContenedor((ContenedorDatos)newValue);
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
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				getRelacionesDatos().clear();
				return;
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				setContenedor((ContenedorDatos)null);
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
			case OrgcasiPackage.CRELACIONES_DATOS__RELACIONES_DATOS:
				return relacionesDatos != null && !relacionesDatos.isEmpty();
			case OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR:
				return getContenedor() != null;
		}
		return super.eIsSet(featureID);
	}

} //CRelacionesDatosImpl