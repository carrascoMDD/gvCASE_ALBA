
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
import es.gva.cit.gvmetrica.orgcasi.UsoSuceso;

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
 * An implementation of the model object '<em><b>Uso Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.UsoSucesoImpl#getSucesoUsado <em>Suceso Usado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsoSucesoImpl extends AccionImpl implements UsoSuceso {
	/**
	 * The cached value of the '{@link #getSucesoUsado() <em>Suceso Usado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucesoUsado()
	 * @generated
	 * @ordered
	 */
	protected CUsadoPorSucesos sucesoUsado = null;


	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsoSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.USO_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSucesos getSucesoUsado() {
		if (sucesoUsado != null && sucesoUsado.eIsProxy()) {
			InternalEObject oldSucesoUsado = (InternalEObject)sucesoUsado;
			sucesoUsado = (CUsadoPorSucesos)eResolveProxy(oldSucesoUsado);
			if (sucesoUsado != oldSucesoUsado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.USO_SUCESO__SUCESO_USADO, oldSucesoUsado, sucesoUsado));
			}
		}
		return sucesoUsado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSucesos basicGetSucesoUsado() {
		return sucesoUsado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucesoUsado(CUsadoPorSucesos newSucesoUsado, NotificationChain msgs) {
		CUsadoPorSucesos oldSucesoUsado = sucesoUsado;
		sucesoUsado = newSucesoUsado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SUCESO__SUCESO_USADO, oldSucesoUsado, newSucesoUsado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucesoUsado(CUsadoPorSucesos newSucesoUsado) {
		if (newSucesoUsado != sucesoUsado) {
			NotificationChain msgs = null;
			if (sucesoUsado != null)
				msgs = ((InternalEObject)sucesoUsado).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO, CUsadoPorSucesos.class, msgs);
			if (newSucesoUsado != null)
				msgs = ((InternalEObject)newSucesoUsado).eInverseAdd(this, OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO, CUsadoPorSucesos.class, msgs);
			msgs = basicSetSucesoUsado(newSucesoUsado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.USO_SUCESO__SUCESO_USADO, newSucesoUsado, newSucesoUsado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				if (sucesoUsado != null)
					msgs = ((InternalEObject)sucesoUsado).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO, CUsadoPorSucesos.class, msgs);
				return basicSetSucesoUsado((CUsadoPorSucesos)otherEnd, msgs);
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
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				return basicSetSucesoUsado(null, msgs);
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
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				if (resolve) return getSucesoUsado();
				return basicGetSucesoUsado();
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
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				setSucesoUsado((CUsadoPorSucesos)newValue);
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
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				setSucesoUsado((CUsadoPorSucesos)null);
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
			case OrgcasiPackage.USO_SUCESO__SUCESO_USADO:
				return sucesoUsado != null;
		}
		return super.eIsSet(featureID);
	}

} //UsoSucesoImpl