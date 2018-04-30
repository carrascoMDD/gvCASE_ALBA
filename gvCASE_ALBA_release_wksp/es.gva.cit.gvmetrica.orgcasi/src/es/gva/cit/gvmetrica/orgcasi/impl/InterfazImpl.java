
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CInterfaces;
import es.gva.cit.gvmetrica.orgcasi.CServicios;
import es.gva.cit.gvmetrica.orgcasi.Interfaz;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.gvmetrica.orgcasi.RolSolicitado;
import es.gva.cit.gvmetrica.orgcasi.RolSolicitante;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfaz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl#getServicios <em>Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl#getRolSolicitante <em>Rol Solicitante</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.InterfazImpl#getRolSolicitado <em>Rol Solicitado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfazImpl extends AgrupacionImpl implements Interfaz {
	/**
	 * The cached value of the '{@link #getServicios() <em>Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicios()
	 * @generated
	 * @ordered
	 */
	protected CServicios servicios = null;

		

	/**
	 * The cached value of the '{@link #getRolSolicitante() <em>Rol Solicitante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolSolicitante()
	 * @generated
	 * @ordered
	 */
	protected RolSolicitante rolSolicitante = null;

	/**
	 * The cached value of the '{@link #getRolSolicitado() <em>Rol Solicitado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolSolicitado()
	 * @generated
	 * @ordered
	 */
	protected RolSolicitado rolSolicitado = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected InterfazImpl() {
		super();
		setServicios( OrgcasiFactory.eINSTANCE.createCServicios());
		setRolSolicitante( OrgcasiFactory.eINSTANCE.createRolSolicitante());
		setRolSolicitado( OrgcasiFactory.eINSTANCE.createRolSolicitado());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.INTERFAZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicios getServicios() {
		return servicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicios(CServicios newServicios, NotificationChain msgs) {
		CServicios oldServicios = servicios;
		servicios = newServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__SERVICIOS, oldServicios, newServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicios(CServicios newServicios) {
		if (newServicios != servicios) {
			NotificationChain msgs = null;
			if (servicios != null)
				msgs = ((InternalEObject)servicios).eInverseRemove(this, OrgcasiPackage.CSERVICIOS__INTERFAZ, CServicios.class, msgs);
			if (newServicios != null)
				msgs = ((InternalEObject)newServicios).eInverseAdd(this, OrgcasiPackage.CSERVICIOS__INTERFAZ, CServicios.class, msgs);
			msgs = basicSetServicios(newServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__SERVICIOS, newServicios, newServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CInterfaces getInterfaces() {
		if (eContainerFeatureID != OrgcasiPackage.INTERFAZ__INTERFACES) return null;
		return (CInterfaces)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(CInterfaces newInterfaces, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterfaces, OrgcasiPackage.INTERFAZ__INTERFACES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(CInterfaces newInterfaces) {
		if (newInterfaces != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.INTERFAZ__INTERFACES && newInterfaces != null)) {
			if (EcoreUtil.isAncestor(this, newInterfaces))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, OrgcasiPackage.CINTERFACES__INTERFACES, CInterfaces.class, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolSolicitante getRolSolicitante() {
		return rolSolicitante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolSolicitante(RolSolicitante newRolSolicitante, NotificationChain msgs) {
		RolSolicitante oldRolSolicitante = rolSolicitante;
		rolSolicitante = newRolSolicitante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE, oldRolSolicitante, newRolSolicitante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolSolicitante(RolSolicitante newRolSolicitante) {
		if (newRolSolicitante != rolSolicitante) {
			NotificationChain msgs = null;
			if (rolSolicitante != null)
				msgs = ((InternalEObject)rolSolicitante).eInverseRemove(this, OrgcasiPackage.ROL_SOLICITANTE__INTERFAZ, RolSolicitante.class, msgs);
			if (newRolSolicitante != null)
				msgs = ((InternalEObject)newRolSolicitante).eInverseAdd(this, OrgcasiPackage.ROL_SOLICITANTE__INTERFAZ, RolSolicitante.class, msgs);
			msgs = basicSetRolSolicitante(newRolSolicitante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE, newRolSolicitante, newRolSolicitante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolSolicitado getRolSolicitado() {
		return rolSolicitado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolSolicitado(RolSolicitado newRolSolicitado, NotificationChain msgs) {
		RolSolicitado oldRolSolicitado = rolSolicitado;
		rolSolicitado = newRolSolicitado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__ROL_SOLICITADO, oldRolSolicitado, newRolSolicitado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolSolicitado(RolSolicitado newRolSolicitado) {
		if (newRolSolicitado != rolSolicitado) {
			NotificationChain msgs = null;
			if (rolSolicitado != null)
				msgs = ((InternalEObject)rolSolicitado).eInverseRemove(this, OrgcasiPackage.ROL_SOLICITADO__INTERFAZ, RolSolicitado.class, msgs);
			if (newRolSolicitado != null)
				msgs = ((InternalEObject)newRolSolicitado).eInverseAdd(this, OrgcasiPackage.ROL_SOLICITADO__INTERFAZ, RolSolicitado.class, msgs);
			msgs = basicSetRolSolicitado(newRolSolicitado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.INTERFAZ__ROL_SOLICITADO, newRolSolicitado, newRolSolicitado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				if (servicios != null)
					msgs = ((InternalEObject)servicios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.INTERFAZ__SERVICIOS, null, msgs);
				return basicSetServicios((CServicios)otherEnd, msgs);
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterfaces((CInterfaces)otherEnd, msgs);
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				if (rolSolicitante != null)
					msgs = ((InternalEObject)rolSolicitante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE, null, msgs);
				return basicSetRolSolicitante((RolSolicitante)otherEnd, msgs);
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				if (rolSolicitado != null)
					msgs = ((InternalEObject)rolSolicitado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.INTERFAZ__ROL_SOLICITADO, null, msgs);
				return basicSetRolSolicitado((RolSolicitado)otherEnd, msgs);
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
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				return basicSetServicios(null, msgs);
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				return basicSetRolSolicitante(null, msgs);
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				return basicSetRolSolicitado(null, msgs);
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
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CINTERFACES__INTERFACES, CInterfaces.class, msgs);
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
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				return getServicios();
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				return getInterfaces();
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				return getRolSolicitante();
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				return getRolSolicitado();
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
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				setServicios((CServicios)newValue);
				return;
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				setInterfaces((CInterfaces)newValue);
				return;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				setRolSolicitante((RolSolicitante)newValue);
				return;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				setRolSolicitado((RolSolicitado)newValue);
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
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				setServicios((CServicios)null);
				return;
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				setInterfaces((CInterfaces)null);
				return;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				setRolSolicitante((RolSolicitante)null);
				return;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				setRolSolicitado((RolSolicitado)null);
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
			case OrgcasiPackage.INTERFAZ__SERVICIOS:
				return servicios != null;
			case OrgcasiPackage.INTERFAZ__INTERFACES:
				return getInterfaces() != null;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITANTE:
				return rolSolicitante != null;
			case OrgcasiPackage.INTERFAZ__ROL_SOLICITADO:
				return rolSolicitado != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfazImpl