/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AUnidadExterna;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.UnidadExterna;

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

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AUnidad Externa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadExternaImpl#getUnidades <em>Unidades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AUnidadExternaImpl extends AUnidadImpl implements AUnidadExterna {
	/**
	 * The cached value of the '{@link #getUnidad() <em>Unidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected UnidadExterna unidad = null;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AUnidadExternaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AUNIDAD_EXTERNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesExternas getUnidades() {
		if (eContainerFeatureID != OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES) return null;
		return (CUnidadesExternas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidades(CUnidadesExternas newUnidades, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidades, OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidades(CUnidadesExternas newUnidades) {
		if (newUnidades != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES && newUnidades != null)) {
			if (EcoreUtil.isAncestor(this, newUnidades))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidades != null)
				msgs = ((InternalEObject)newUnidades).eInverseAdd(this, OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES, CUnidadesExternas.class, msgs);
			msgs = basicSetUnidades(newUnidades, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES, newUnidades, newUnidades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadExterna getUnidad() {
		if (unidad != null && unidad.eIsProxy()) {
			InternalEObject oldUnidad = (InternalEObject)unidad;
			unidad = (UnidadExterna)eResolveProxy(oldUnidad);
			if (unidad != oldUnidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD, oldUnidad, unidad));
			}
		}
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadExterna basicGetUnidad() {
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidad(UnidadExterna newUnidad) {
		UnidadExterna oldUnidad = unidad;
		unidad = newUnidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD, oldUnidad, unidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidades((CUnidadesExternas)otherEnd, msgs);
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				return basicSetUnidades(null, msgs);
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CUNIDADES_EXTERNAS__UNIDADES, CUnidadesExternas.class, msgs);
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD:
				if (resolve) return getUnidad();
				return basicGetUnidad();
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				return getUnidades();
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD:
				setUnidad((UnidadExterna)newValue);
				return;
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				setUnidades((CUnidadesExternas)newValue);
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD:
				setUnidad((UnidadExterna)null);
				return;
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				setUnidades((CUnidadesExternas)null);
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
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDAD:
				return unidad != null;
			case OrgcasiPackage.AUNIDAD_EXTERNA__UNIDADES:
				return getUnidades() != null;
		}
		return super.eIsSet(featureID);
	}

} //AUnidadExternaImpl