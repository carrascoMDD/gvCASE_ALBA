
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ContenedorEstructuraFuncional;
import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.EstructurasFuncionales;
import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estructuras Funcionales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.EstructurasFuncionalesImpl#getDescomposicion <em>Descomposicion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructurasFuncionalesImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstructurasFuncionalesImpl extends SimapaCollectionImpl implements EstructurasFuncionales {
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
	protected EstructurasFuncionalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.ESTRUCTURAS_FUNCIONALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDescomposicion() {
		if (descomposicion == null) {
			descomposicion = new EObjectContainmentWithInverseEList(EstructuraFuncional.class, this, SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE);
		}
		return descomposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO) return null;
		return (Repositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicAdd(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO, msgs);
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicRemove(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO:
				return eBasicSetContainer(null, SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO, msgs);
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES, Repositorio.class, msgs);
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
				return getDescomposicion();
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO:
				return getRepositorio();
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
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
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION:
				return descomposicion != null && !descomposicion.isEmpty();
			case SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO:
				return getRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorEstructuraFuncional.class) {
			switch (derivedFeatureID) {
				case SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION: return SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION;
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
		if (baseClass == ContenedorEstructuraFuncional.class) {
			switch (baseFeatureID) {
				case SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION: return SimapaPackage.ESTRUCTURAS_FUNCIONALES__DESCOMPOSICION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EstructurasFuncionalesImpl