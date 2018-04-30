
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ContenedorUnidadExterna;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.UnidadExterna;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidad Externa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadExternaImpl#getDescomposicion <em>Descomposicion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadExternaImpl#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadExternaImpl#getDescompone <em>Descompone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnidadExternaImpl extends UnidadImpl implements UnidadExterna {
	/**
	 * The cached value of the '{@link #getDescomposicion() <em>Descomposicion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescomposicion()
	 * @generated
	 * @ordered
	 */
	protected EList descomposicion = null;

	/**
	 * The default value of the '{@link #getTipoEntidad() <em>Tipo Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEntidad()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_ENTIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoEntidad() <em>Tipo Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEntidad()
	 * @generated
	 * @ordered
	 */
	protected String tipoEntidad = TIPO_ENTIDAD_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnidadExternaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.UNIDAD_EXTERNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDescomposicion() {
		if (descomposicion == null) {
			descomposicion = new EObjectContainmentWithInverseEList(UnidadExterna.class, this, SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION, SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE);
		}
		return descomposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoEntidad() {
		return tipoEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoEntidad(String newTipoEntidad) {
		String oldTipoEntidad = tipoEntidad;
		tipoEntidad = newTipoEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD_EXTERNA__TIPO_ENTIDAD, oldTipoEntidad, tipoEntidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUnidadExterna getDescompone() {
		if (eContainerFeatureID != SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE) return null;
		return (ContenedorUnidadExterna)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicAdd(otherEnd, msgs);
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE, msgs);
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicRemove(otherEnd, msgs);
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE:
				return eBasicSetContainer(null, SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE, msgs);
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION, ContenedorUnidadExterna.class, msgs);
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				return getDescomposicion();
			case SimapaPackage.UNIDAD_EXTERNA__TIPO_ENTIDAD:
				return getTipoEntidad();
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE:
				return getDescompone();
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				getDescomposicion().clear();
				getDescomposicion().addAll((Collection)newValue);
				return;
			case SimapaPackage.UNIDAD_EXTERNA__TIPO_ENTIDAD:
				setTipoEntidad((String)newValue);
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				getDescomposicion().clear();
				return;
			case SimapaPackage.UNIDAD_EXTERNA__TIPO_ENTIDAD:
				setTipoEntidad(TIPO_ENTIDAD_EDEFAULT);
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
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION:
				return descomposicion != null && !descomposicion.isEmpty();
			case SimapaPackage.UNIDAD_EXTERNA__TIPO_ENTIDAD:
				return TIPO_ENTIDAD_EDEFAULT == null ? tipoEntidad != null : !TIPO_ENTIDAD_EDEFAULT.equals(tipoEntidad);
			case SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE:
				return getDescompone() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorUnidadExterna.class) {
			switch (derivedFeatureID) {
				case SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION: return SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ContenedorUnidadExterna.class) {
			switch (baseFeatureID) {
				case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION: return SimapaPackage.UNIDAD_EXTERNA__DESCOMPOSICION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipoEntidad: ");
		result.append(tipoEntidad);
		result.append(')');
		return result.toString();
	}

} //UnidadExternaImpl