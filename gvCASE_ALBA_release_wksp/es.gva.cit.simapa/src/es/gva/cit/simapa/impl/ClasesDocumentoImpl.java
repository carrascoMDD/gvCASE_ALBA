
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ClaseDocumento;
import es.gva.cit.simapa.ClasesDocumento;
import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaPackage;

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
 * An implementation of the model object '<em><b>Clases Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.ClasesDocumentoImpl#getClasesDocumento <em>Clases Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.ClasesDocumentoImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClasesDocumentoImpl extends SimapaCollectionImpl implements ClasesDocumento {
	/**
	 * The cached value of the '{@link #getClasesDocumento() <em>Clases Documento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasesDocumento()
	 * @generated
	 * @ordered
	 */
	protected EList clasesDocumento = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasesDocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.CLASES_DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClasesDocumento() {
		if (clasesDocumento == null) {
			clasesDocumento = new EObjectContainmentWithInverseEList(ClaseDocumento.class, this, SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO, SimapaPackage.CLASE_DOCUMENTO__CLASES_DOCUMENTO);
		}
		return clasesDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO) return null;
		return (Repositorio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				return ((InternalEList)getClasesDocumento()).basicAdd(otherEnd, msgs);
			case SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO, msgs);
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
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				return ((InternalEList)getClasesDocumento()).basicRemove(otherEnd, msgs);
			case SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO:
				return eBasicSetContainer(null, SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO, msgs);
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
			case SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO, Repositorio.class, msgs);
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
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				return getClasesDocumento();
			case SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO:
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
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				getClasesDocumento().clear();
				getClasesDocumento().addAll((Collection)newValue);
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
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				getClasesDocumento().clear();
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
			case SimapaPackage.CLASES_DOCUMENTO__CLASES_DOCUMENTO:
				return clasesDocumento != null && !clasesDocumento.isEmpty();
			case SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO:
				return getRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClasesDocumentoImpl