
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.Producto;
import es.gva.cit.gvmetrica.proinso.Productos;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Productos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ProductosImpl#getProductos <em>Productos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ProductosImpl#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductosImpl extends ProinsoCollectionImpl implements Productos {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductos()
	 * @generated
	 * @ordered
	 */
	protected EList productos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PRODUCTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProductos() {
		if (productos == null) {
			productos = new EObjectContainmentWithInverseEList(Producto.class, this, ProinsoPackage.PRODUCTOS__PRODUCTOS, ProinsoPackage.PRODUCTO__METODOLOGIA);
		}
		return productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodologia getMetodologia() {
		if (eContainerFeatureID != ProinsoPackage.PRODUCTOS__METODOLOGIA) return null;
		return (Metodologia)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				return ((InternalEList)getProductos()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PRODUCTOS__METODOLOGIA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PRODUCTOS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				return ((InternalEList)getProductos()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PRODUCTOS__METODOLOGIA:
				return eBasicSetContainer(null, ProinsoPackage.PRODUCTOS__METODOLOGIA, msgs);
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
			case ProinsoPackage.PRODUCTOS__METODOLOGIA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.METODOLOGIA__PRODUCTOS, Metodologia.class, msgs);
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
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				return getProductos();
			case ProinsoPackage.PRODUCTOS__METODOLOGIA:
				return getMetodologia();
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
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				getProductos().clear();
				getProductos().addAll((Collection)newValue);
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
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				getProductos().clear();
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
			case ProinsoPackage.PRODUCTOS__PRODUCTOS:
				return productos != null && !productos.isEmpty();
			case ProinsoPackage.PRODUCTOS__METODOLOGIA:
				return getMetodologia() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductosImpl