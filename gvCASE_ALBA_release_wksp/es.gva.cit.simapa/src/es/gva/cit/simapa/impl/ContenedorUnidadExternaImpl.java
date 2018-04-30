
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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Unidad Externa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ContenedorUnidadExternaImpl#getDescomposicion <em>Descomposicion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContenedorUnidadExternaImpl extends EObjectImpl implements ContenedorUnidadExterna {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorUnidadExternaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.CONTENEDOR_UNIDAD_EXTERNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDescomposicion() {
		if (descomposicion == null) {
			descomposicion = new EObjectContainmentWithInverseEList(UnidadExterna.class, this, SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION, SimapaPackage.UNIDAD_EXTERNA__DESCOMPONE);
		}
		return descomposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				return getDescomposicion();
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
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				getDescomposicion().clear();
				getDescomposicion().addAll((Collection)newValue);
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
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				getDescomposicion().clear();
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
			case SimapaPackage.CONTENEDOR_UNIDAD_EXTERNA__DESCOMPOSICION:
				return descomposicion != null && !descomposicion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorUnidadExternaImpl