
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ConModelClass;
import es.gva.cit.simapa.SimapaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Con Model Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ConModelClassImpl#getModelClass <em>Model Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConModelClassImpl extends EObjectImpl implements ConModelClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConModelClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.CON_MODEL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelClass() {
		EClass modelClass = basicGetModelClass();
		return modelClass != null && modelClass.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)modelClass) : modelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public EClass basicGetModelClass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return this.eClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimapaPackage.CON_MODEL_CLASS__MODEL_CLASS:
				if (resolve) return getModelClass();
				return basicGetModelClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimapaPackage.CON_MODEL_CLASS__MODEL_CLASS:
				return basicGetModelClass() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConModelClassImpl