/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.TipoUnidad;

import es.gva.cit.simapa.UnidadOrganica;

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
 * An implementation of the model object '<em><b>AUnidad Organica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl#getTipoUnidad <em>Tipo Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AUnidadOrganicaImpl#getUnidades <em>Unidades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AUnidadOrganicaImpl extends AUnidadImpl implements AUnidadOrganica {
	/**
	 * The default value of the '{@link #getTipoUnidad() <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUnidad()
	 * @generated
	 * @ordered
	 */
	protected static final TipoUnidad TIPO_UNIDAD_EDEFAULT = TipoUnidad.A_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoUnidad() <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUnidad()
	 * @generated
	 * @ordered
	 */
	protected TipoUnidad tipoUnidad = TIPO_UNIDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnidad() <em>Unidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected UnidadOrganica unidad = null;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AUnidadOrganicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AUNIDAD_ORGANICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoUnidad getTipoUnidad() {
		return tipoUnidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoUnidad(TipoUnidad newTipoUnidad) {
		TipoUnidad oldTipoUnidad = tipoUnidad;
		tipoUnidad = newTipoUnidad == null ? TIPO_UNIDAD_EDEFAULT : newTipoUnidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AUNIDAD_ORGANICA__TIPO_UNIDAD, oldTipoUnidad, tipoUnidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUnidadesOrganicas getUnidades() {
		if (eContainerFeatureID != OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES) return null;
		return (CUnidadesOrganicas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidades(CUnidadesOrganicas newUnidades, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnidades, OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidades(CUnidadesOrganicas newUnidades) {
		if (newUnidades != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES && newUnidades != null)) {
			if (EcoreUtil.isAncestor(this, newUnidades))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnidades != null)
				msgs = ((InternalEObject)newUnidades).eInverseAdd(this, OrgcasiPackage.CUNIDADES_ORGANICAS__UNIDADES, CUnidadesOrganicas.class, msgs);
			msgs = basicSetUnidades(newUnidades, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES, newUnidades, newUnidades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganica getUnidad() {
		if (unidad != null && unidad.eIsProxy()) {
			InternalEObject oldUnidad = (InternalEObject)unidad;
			unidad = (UnidadOrganica)eResolveProxy(oldUnidad);
			if (unidad != oldUnidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD, oldUnidad, unidad));
			}
		}
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganica basicGetUnidad() {
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidad(UnidadOrganica newUnidad) {
		UnidadOrganica oldUnidad = unidad;
		unidad = newUnidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD, oldUnidad, unidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnidades((CUnidadesOrganicas)otherEnd, msgs);
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CUNIDADES_ORGANICAS__UNIDADES, CUnidadesOrganicas.class, msgs);
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__TIPO_UNIDAD:
				return getTipoUnidad();
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD:
				if (resolve) return getUnidad();
				return basicGetUnidad();
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__TIPO_UNIDAD:
				setTipoUnidad((TipoUnidad)newValue);
				return;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD:
				setUnidad((UnidadOrganica)newValue);
				return;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
				setUnidades((CUnidadesOrganicas)newValue);
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__TIPO_UNIDAD:
				setTipoUnidad(TIPO_UNIDAD_EDEFAULT);
				return;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD:
				setUnidad((UnidadOrganica)null);
				return;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
				setUnidades((CUnidadesOrganicas)null);
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
			case OrgcasiPackage.AUNIDAD_ORGANICA__TIPO_UNIDAD:
				return tipoUnidad != TIPO_UNIDAD_EDEFAULT;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDAD:
				return unidad != null;
			case OrgcasiPackage.AUNIDAD_ORGANICA__UNIDADES:
				return getUnidades() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipoUnidad: ");
		result.append(tipoUnidad);
		result.append(')');
		return result.toString();
	}

} //AUnidadOrganicaImpl