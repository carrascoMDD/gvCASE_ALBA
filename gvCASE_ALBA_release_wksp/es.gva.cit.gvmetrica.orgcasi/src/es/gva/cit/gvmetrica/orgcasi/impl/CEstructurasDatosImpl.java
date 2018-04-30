/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
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
 * An implementation of the model object '<em><b>CEstructuras Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CEstructurasDatosImpl#getContenedor <em>Contenedor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEstructurasDatosImpl extends OrgcasiCollectionImpl implements CEstructurasDatos {
	/**
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected EList estructurasDatos = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEstructurasDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CESTRUCTURAS_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasDatos() {
		if (estructurasDatos == null) {
			estructurasDatos = new EObjectContainmentWithInverseEList(EstructuraDatos.class, this, OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS, OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS);
		}
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatos getContenedor() {
		if (eContainerFeatureID != OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR) return null;
		return (ContenedorDatos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedor(ContenedorDatos newContenedor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedor, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedor(ContenedorDatos newContenedor) {
		if (newContenedor != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR && newContenedor != null)) {
			if (EcoreUtil.isAncestor(this, newContenedor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedor != null)
				msgs = ((InternalEObject)newContenedor).eInverseAdd(this, OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS, ContenedorDatos.class, msgs);
			msgs = basicSetContenedor(newContenedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, newContenedor, newContenedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS, ContenedorDatos.class, msgs);
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				getEstructurasDatos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				return;
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
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
			case OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS:
				return estructurasDatos != null && !estructurasDatos.isEmpty();
			case OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR:
				return getContenedor() != null;
		}
		return super.eIsSet(featureID);
	}

} //CEstructurasDatosImpl