
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.Parrafo;
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
 * An implementation of the model object '<em><b>Documentacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl#getDocumentado <em>Documentado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.DocumentacionImpl#getParrafos <em>Parrafos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentacionImpl extends ProinsoObjectImpl implements Documentacion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getParrafos() <em>Parrafos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParrafos()
	 * @generated
	 * @ordered
	 */
	protected EList parrafos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.DOCUMENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConDocumentacion getDocumentado() {
		if (eContainerFeatureID != ProinsoPackage.DOCUMENTACION__DOCUMENTADO) return null;
		return (ConDocumentacion)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParrafos() {
		if (parrafos == null) {
			parrafos = new EObjectContainmentWithInverseEList(Parrafo.class, this, ProinsoPackage.DOCUMENTACION__PARRAFOS, ProinsoPackage.PARRAFO__DOCUMENTACION);
		}
		return parrafos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.DOCUMENTACION__DOCUMENTADO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, msgs);
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				return ((InternalEList)getParrafos()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.DOCUMENTACION__DOCUMENTADO:
				return eBasicSetContainer(null, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, msgs);
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				return ((InternalEList)getParrafos()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.DOCUMENTACION__DOCUMENTADO:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION, ConDocumentacion.class, msgs);
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
			case ProinsoPackage.DOCUMENTACION__DOCUMENTADO:
				return getDocumentado();
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				return getParrafos();
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
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				getParrafos().clear();
				getParrafos().addAll((Collection)newValue);
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
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				getParrafos().clear();
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
			case ProinsoPackage.DOCUMENTACION__DOCUMENTADO:
				return getDocumentado() != null;
			case ProinsoPackage.DOCUMENTACION__PARRAFOS:
				return parrafos != null && !parrafos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentacionImpl