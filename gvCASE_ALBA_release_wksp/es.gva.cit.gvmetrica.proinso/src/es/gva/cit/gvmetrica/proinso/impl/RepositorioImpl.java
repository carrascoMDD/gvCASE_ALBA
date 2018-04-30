
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Repositorio;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repositorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl#getMetodologias <em>Metodologias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.RepositorioImpl#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositorioImpl extends ProinsoObjectImpl implements Repositorio {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getMetodologias() <em>Metodologias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodologias()
	 * @generated
	 * @ordered
	 */
	protected EList metodologias = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositorioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.REPOSITORIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetodologias() {
		if (metodologias == null) {
			metodologias = new EObjectContainmentWithInverseEList(Metodologia.class, this, ProinsoPackage.REPOSITORIO__METODOLOGIAS, ProinsoPackage.METODOLOGIA__REPOSITORIO);
		}
		return metodologias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getModelPackage() {
		EPackage modelPackage = basicGetModelPackage();
		return modelPackage != null && modelPackage.eIsProxy() ? (EPackage)eResolveProxy((InternalEObject)modelPackage) : modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public EPackage basicGetModelPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return this.eClass().getEPackage();
		
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				return ((InternalEList)getMetodologias()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				return ((InternalEList)getMetodologias()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				return getMetodologias();
			case ProinsoPackage.REPOSITORIO__MODEL_PACKAGE:
				if (resolve) return getModelPackage();
				return basicGetModelPackage();
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
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				getMetodologias().clear();
				getMetodologias().addAll((Collection)newValue);
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
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				getMetodologias().clear();
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
			case ProinsoPackage.REPOSITORIO__METODOLOGIAS:
				return metodologias != null && !metodologias.isEmpty();
			case ProinsoPackage.REPOSITORIO__MODEL_PACKAGE:
				return basicGetModelPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositorioImpl