
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.UsoServicio;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uso Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoServicioImpl#getServicio <em>Servicio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsoServicioImpl extends AccionImpl implements UsoServicio {
	/**
	 * The cached value of the '{@link #getServicio() <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicio()
	 * @generated
	 * @ordered
	 */
	protected CServicioUsadoPorSucesos servicio = null;


	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsoServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.USO_SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicioUsadoPorSucesos getServicio() {
		if (servicio != null && servicio.eIsProxy()) {
			InternalEObject oldServicio = (InternalEObject)servicio;
			servicio = (CServicioUsadoPorSucesos)eResolveProxy(oldServicio);
			if (servicio != oldServicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.USO_SERVICIO__SERVICIO, oldServicio, servicio));
			}
		}
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CServicioUsadoPorSucesos basicGetServicio() {
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicio(CServicioUsadoPorSucesos newServicio, NotificationChain msgs) {
		CServicioUsadoPorSucesos oldServicio = servicio;
		servicio = newServicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SERVICIO__SERVICIO, oldServicio, newServicio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicio(CServicioUsadoPorSucesos newServicio) {
		if (newServicio != servicio) {
			NotificationChain msgs = null;
			if (servicio != null)
				msgs = ((InternalEObject)servicio).eInverseRemove(this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO, CServicioUsadoPorSucesos.class, msgs);
			if (newServicio != null)
				msgs = ((InternalEObject)newServicio).eInverseAdd(this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO, CServicioUsadoPorSucesos.class, msgs);
			msgs = basicSetServicio(newServicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SERVICIO__SERVICIO, newServicio, newServicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				if (servicio != null)
					msgs = ((InternalEObject)servicio).eInverseRemove(this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO, CServicioUsadoPorSucesos.class, msgs);
				return basicSetServicio((CServicioUsadoPorSucesos)otherEnd, msgs);
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
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				return basicSetServicio(null, msgs);
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
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				if (resolve) return getServicio();
				return basicGetServicio();
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
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				setServicio((CServicioUsadoPorSucesos)newValue);
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
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				setServicio((CServicioUsadoPorSucesos)null);
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
			case OrgcasiPackage.USO_SERVICIO__SERVICIO:
				return servicio != null;
		}
		return super.eIsSet(featureID);
	}

} //UsoServicioImpl