
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.CServicios;
import es.gva.cit.gvmetrica.orgcasi.EntradaServicio;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.SalidaServicio;
import es.gva.cit.gvmetrica.orgcasi.Servicio;

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
 * An implementation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl#getUsadoPorSucesos <em>Usado Por Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl#getServicios <em>Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ServicioImpl#getSalidas <em>Salidas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicioImpl extends AgrupacionImpl implements Servicio {
	/**
	 * The cached value of the '{@link #getUsadoPorSucesos() <em>Usado Por Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsadoPorSucesos()
	 * @generated
	 * @ordered
	 */
	protected CServicioUsadoPorSucesos usadoPorSucesos = null;

	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected EList entradas = null;

	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected EList salidas = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected ServicioImpl() {
		super();
		setUsadoPorSucesos( OrgcasiFactory.eINSTANCE.createCServicioUsadoPorSucesos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicioUsadoPorSucesos getUsadoPorSucesos() {
		return usadoPorSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsadoPorSucesos(CServicioUsadoPorSucesos newUsadoPorSucesos, NotificationChain msgs) {
		CServicioUsadoPorSucesos oldUsadoPorSucesos = usadoPorSucesos;
		usadoPorSucesos = newUsadoPorSucesos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS, oldUsadoPorSucesos, newUsadoPorSucesos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsadoPorSucesos(CServicioUsadoPorSucesos newUsadoPorSucesos) {
		if (newUsadoPorSucesos != usadoPorSucesos) {
			NotificationChain msgs = null;
			if (usadoPorSucesos != null)
				msgs = ((InternalEObject)usadoPorSucesos).eInverseRemove(this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO, CServicioUsadoPorSucesos.class, msgs);
			if (newUsadoPorSucesos != null)
				msgs = ((InternalEObject)newUsadoPorSucesos).eInverseAdd(this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO, CServicioUsadoPorSucesos.class, msgs);
			msgs = basicSetUsadoPorSucesos(newUsadoPorSucesos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS, newUsadoPorSucesos, newUsadoPorSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicios getServicios() {
		if (eContainerFeatureID != OrgcasiPackage.SERVICIO__SERVICIOS) return null;
		return (CServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicios(CServicios newServicios, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServicios, OrgcasiPackage.SERVICIO__SERVICIOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicios(CServicios newServicios) {
		if (newServicios != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.SERVICIO__SERVICIOS && newServicios != null)) {
			if (EcoreUtil.isAncestor(this, newServicios))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServicios != null)
				msgs = ((InternalEObject)newServicios).eInverseAdd(this, OrgcasiPackage.CSERVICIOS__SERVICIOS, CServicios.class, msgs);
			msgs = basicSetServicios(newServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SERVICIO__SERVICIOS, newServicios, newServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntradas() {
		if (entradas == null) {
			entradas = new EObjectContainmentWithInverseEList(EntradaServicio.class, this, OrgcasiPackage.SERVICIO__ENTRADAS, OrgcasiPackage.ENTRADA_SERVICIO__SERVICIO);
		}
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSalidas() {
		if (salidas == null) {
			salidas = new EObjectContainmentWithInverseEList(SalidaServicio.class, this, OrgcasiPackage.SERVICIO__SALIDAS, OrgcasiPackage.SALIDA_SERVICIO__SERVICIO);
		}
		return salidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				if (usadoPorSucesos != null)
					msgs = ((InternalEObject)usadoPorSucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS, null, msgs);
				return basicSetUsadoPorSucesos((CServicioUsadoPorSucesos)otherEnd, msgs);
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServicios((CServicios)otherEnd, msgs);
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				return ((InternalEList)getEntradas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.SERVICIO__SALIDAS:
				return ((InternalEList)getSalidas()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				return basicSetUsadoPorSucesos(null, msgs);
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				return basicSetServicios(null, msgs);
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				return ((InternalEList)getEntradas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.SERVICIO__SALIDAS:
				return ((InternalEList)getSalidas()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CSERVICIOS__SERVICIOS, CServicios.class, msgs);
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
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				return getUsadoPorSucesos();
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				return getServicios();
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				return getEntradas();
			case OrgcasiPackage.SERVICIO__SALIDAS:
				return getSalidas();
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
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				setUsadoPorSucesos((CServicioUsadoPorSucesos)newValue);
				return;
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				setServicios((CServicios)newValue);
				return;
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				getEntradas().clear();
				getEntradas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.SERVICIO__SALIDAS:
				getSalidas().clear();
				getSalidas().addAll((Collection)newValue);
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
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				setUsadoPorSucesos((CServicioUsadoPorSucesos)null);
				return;
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				setServicios((CServicios)null);
				return;
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				getEntradas().clear();
				return;
			case OrgcasiPackage.SERVICIO__SALIDAS:
				getSalidas().clear();
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
			case OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS:
				return usadoPorSucesos != null;
			case OrgcasiPackage.SERVICIO__SERVICIOS:
				return getServicios() != null;
			case OrgcasiPackage.SERVICIO__ENTRADAS:
				return entradas != null && !entradas.isEmpty();
			case OrgcasiPackage.SERVICIO__SALIDAS:
				return salidas != null && !salidas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServicioImpl