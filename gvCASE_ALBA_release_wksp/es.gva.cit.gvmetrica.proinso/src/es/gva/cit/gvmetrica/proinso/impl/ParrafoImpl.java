
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.Parrafo;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Run;

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
 * An implementation of the model object '<em><b>Parrafo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParrafoImpl#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParrafoImpl extends ProinsoObjectImpl implements Parrafo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected EList runs = null;

	/**
	 * The default value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTILO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected String estilo = ESTILO_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParrafoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PARRAFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.PARRAFO__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentacion getDocumentacion() {
		if (eContainerFeatureID != ProinsoPackage.PARRAFO__DOCUMENTACION) return null;
		return (Documentacion)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRuns() {
		if (runs == null) {
			runs = new EObjectContainmentWithInverseEList(Run.class, this, ProinsoPackage.PARRAFO__RUNS, ProinsoPackage.RUN__PARRAFO);
		}
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstilo(String newEstilo) {
		String oldEstilo = estilo;
		estilo = newEstilo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.PARRAFO__ESTILO, oldEstilo, estilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PARRAFO__DOCUMENTACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PARRAFO__DOCUMENTACION, msgs);
			case ProinsoPackage.PARRAFO__RUNS:
				return ((InternalEList)getRuns()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.PARRAFO__DOCUMENTACION:
				return eBasicSetContainer(null, ProinsoPackage.PARRAFO__DOCUMENTACION, msgs);
			case ProinsoPackage.PARRAFO__RUNS:
				return ((InternalEList)getRuns()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.PARRAFO__DOCUMENTACION:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.DOCUMENTACION__PARRAFOS, Documentacion.class, msgs);
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
			case ProinsoPackage.PARRAFO__TEXTO:
				return getTexto();
			case ProinsoPackage.PARRAFO__DOCUMENTACION:
				return getDocumentacion();
			case ProinsoPackage.PARRAFO__RUNS:
				return getRuns();
			case ProinsoPackage.PARRAFO__ESTILO:
				return getEstilo();
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
			case ProinsoPackage.PARRAFO__TEXTO:
				setTexto((String)newValue);
				return;
			case ProinsoPackage.PARRAFO__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection)newValue);
				return;
			case ProinsoPackage.PARRAFO__ESTILO:
				setEstilo((String)newValue);
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
			case ProinsoPackage.PARRAFO__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case ProinsoPackage.PARRAFO__RUNS:
				getRuns().clear();
				return;
			case ProinsoPackage.PARRAFO__ESTILO:
				setEstilo(ESTILO_EDEFAULT);
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
			case ProinsoPackage.PARRAFO__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case ProinsoPackage.PARRAFO__DOCUMENTACION:
				return getDocumentacion() != null;
			case ProinsoPackage.PARRAFO__RUNS:
				return runs != null && !runs.isEmpty();
			case ProinsoPackage.PARRAFO__ESTILO:
				return ESTILO_EDEFAULT == null ? estilo != null : !ESTILO_EDEFAULT.equals(estilo);
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
		result.append(" (texto: ");
		result.append(texto);
		result.append(", estilo: ");
		result.append(estilo);
		result.append(')');
		return result.toString();
	}

} //ParrafoImpl