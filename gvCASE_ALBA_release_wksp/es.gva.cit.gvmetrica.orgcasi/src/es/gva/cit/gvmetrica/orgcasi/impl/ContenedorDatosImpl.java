
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ContenedorDatosImpl#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContenedorDatosImpl extends EObjectImpl implements ContenedorDatos {
	/**
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected CEstructurasDatos estructurasDatos = null;

	/**
	 * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampos()
	 * @generated
	 * @ordered
	 */
	protected CCamposDatos campos = null;

	/**
	 * The cached value of the '{@link #getRelacionesDatos() <em>Relaciones Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesDatos()
	 * @generated
	 * @ordered
	 */
	protected CRelacionesDatos relacionesDatos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CONTENEDOR_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatos getEstructurasDatos() {
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasDatos(CEstructurasDatos newEstructurasDatos, NotificationChain msgs) {
		CEstructurasDatos oldEstructurasDatos = estructurasDatos;
		estructurasDatos = newEstructurasDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS, oldEstructurasDatos, newEstructurasDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasDatos(CEstructurasDatos newEstructurasDatos) {
		if (newEstructurasDatos != estructurasDatos) {
			NotificationChain msgs = null;
			if (estructurasDatos != null)
				msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			if (newEstructurasDatos != null)
				msgs = ((InternalEObject)newEstructurasDatos).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			msgs = basicSetEstructurasDatos(newEstructurasDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS, newEstructurasDatos, newEstructurasDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCamposDatos getCampos() {
		return campos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampos(CCamposDatos newCampos, NotificationChain msgs) {
		CCamposDatos oldCampos = campos;
		campos = newCampos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS, oldCampos, newCampos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCampos(CCamposDatos newCampos) {
		if (newCampos != campos) {
			NotificationChain msgs = null;
			if (campos != null)
				msgs = ((InternalEObject)campos).eInverseRemove(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			if (newCampos != null)
				msgs = ((InternalEObject)newCampos).eInverseAdd(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			msgs = basicSetCampos(newCampos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS, newCampos, newCampos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelacionesDatos getRelacionesDatos() {
		return relacionesDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelacionesDatos(CRelacionesDatos newRelacionesDatos, NotificationChain msgs) {
		CRelacionesDatos oldRelacionesDatos = relacionesDatos;
		relacionesDatos = newRelacionesDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS, oldRelacionesDatos, newRelacionesDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionesDatos(CRelacionesDatos newRelacionesDatos) {
		if (newRelacionesDatos != relacionesDatos) {
			NotificationChain msgs = null;
			if (relacionesDatos != null)
				msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			if (newRelacionesDatos != null)
				msgs = ((InternalEObject)newRelacionesDatos).eInverseAdd(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			msgs = basicSetRelacionesDatos(newRelacionesDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS, newRelacionesDatos, newRelacionesDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				if (estructurasDatos != null)
					msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS, null, msgs);
				return basicSetEstructurasDatos((CEstructurasDatos)otherEnd, msgs);
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				if (campos != null)
					msgs = ((InternalEObject)campos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS, null, msgs);
				return basicSetCampos((CCamposDatos)otherEnd, msgs);
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				if (relacionesDatos != null)
					msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS, null, msgs);
				return basicSetRelacionesDatos((CRelacionesDatos)otherEnd, msgs);
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
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				return basicSetEstructurasDatos(null, msgs);
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				return basicSetCampos(null, msgs);
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				return basicSetRelacionesDatos(null, msgs);
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
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				return getCampos();
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				return getRelacionesDatos();
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
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)newValue);
				return;
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				setCampos((CCamposDatos)newValue);
				return;
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)newValue);
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
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)null);
				return;
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				setCampos((CCamposDatos)null);
				return;
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)null);
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
			case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS:
				return estructurasDatos != null;
			case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS:
				return campos != null;
			case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS:
				return relacionesDatos != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorDatosImpl