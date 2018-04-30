/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.Anotacion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anotacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getIdAnotada <em>Id Anotada</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getVersionAnotada <em>Version Anotada</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getFechaAnotacion <em>Fecha Anotacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getRealizadorAnotacion <em>Realizador Anotacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AnotacionImpl#getResponsableAnotacion <em>Responsable Anotacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnotacionImpl extends OrgcasiObjectImpl implements Anotacion {
	/**
	 * The default value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentario()
	 * @generated
	 * @ordered
	 */
	protected static final String COMENTARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentario()
	 * @generated
	 * @ordered
	 */
	protected String comentario = COMENTARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdAnotada() <em>Id Anotada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAnotada()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ANOTADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdAnotada() <em>Id Anotada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAnotada()
	 * @generated
	 * @ordered
	 */
	protected String idAnotada = ID_ANOTADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionAnotada() <em>Version Anotada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAnotada()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_ANOTADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionAnotada() <em>Version Anotada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAnotada()
	 * @generated
	 * @ordered
	 */
	protected String versionAnotada = VERSION_ANOTADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaAnotacion() <em>Fecha Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAnotacion()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ANOTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaAnotacion() <em>Fecha Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAnotacion()
	 * @generated
	 * @ordered
	 */
	protected String fechaAnotacion = FECHA_ANOTACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealizadorAnotacion() <em>Realizador Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizadorAnotacion()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZADOR_ANOTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizadorAnotacion() <em>Realizador Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizadorAnotacion()
	 * @generated
	 * @ordered
	 */
	protected String realizadorAnotacion = REALIZADOR_ANOTACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsableAnotacion() <em>Responsable Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAnotacion()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSABLE_ANOTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsableAnotacion() <em>Responsable Anotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableAnotacion()
	 * @generated
	 * @ordered
	 */
	protected String responsableAnotacion = RESPONSABLE_ANOTACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnotacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ANOTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComentario(String newComentario) {
		String oldComentario = comentario;
		comentario = newComentario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdAnotada() {
		return idAnotada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAnotada(String newIdAnotada) {
		String oldIdAnotada = idAnotada;
		idAnotada = newIdAnotada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__ID_ANOTADA, oldIdAnotada, idAnotada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionAnotada() {
		return versionAnotada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionAnotada(String newVersionAnotada) {
		String oldVersionAnotada = versionAnotada;
		versionAnotada = newVersionAnotada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__VERSION_ANOTADA, oldVersionAnotada, versionAnotada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaAnotacion() {
		return fechaAnotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaAnotacion(String newFechaAnotacion) {
		String oldFechaAnotacion = fechaAnotacion;
		fechaAnotacion = newFechaAnotacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__FECHA_ANOTACION, oldFechaAnotacion, fechaAnotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealizadorAnotacion() {
		return realizadorAnotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizadorAnotacion(String newRealizadorAnotacion) {
		String oldRealizadorAnotacion = realizadorAnotacion;
		realizadorAnotacion = newRealizadorAnotacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__REALIZADOR_ANOTACION, oldRealizadorAnotacion, realizadorAnotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsableAnotacion() {
		return responsableAnotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableAnotacion(String newResponsableAnotacion) {
		String oldResponsableAnotacion = responsableAnotacion;
		responsableAnotacion = newResponsableAnotacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ANOTACION__RESPONSABLE_ANOTACION, oldResponsableAnotacion, responsableAnotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgcasiPackage.ANOTACION__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.ANOTACION__ID_ANOTADA:
				return getIdAnotada();
			case OrgcasiPackage.ANOTACION__VERSION_ANOTADA:
				return getVersionAnotada();
			case OrgcasiPackage.ANOTACION__FECHA_ANOTACION:
				return getFechaAnotacion();
			case OrgcasiPackage.ANOTACION__REALIZADOR_ANOTACION:
				return getRealizadorAnotacion();
			case OrgcasiPackage.ANOTACION__RESPONSABLE_ANOTACION:
				return getResponsableAnotacion();
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
			case OrgcasiPackage.ANOTACION__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.ANOTACION__ID_ANOTADA:
				setIdAnotada((String)newValue);
				return;
			case OrgcasiPackage.ANOTACION__VERSION_ANOTADA:
				setVersionAnotada((String)newValue);
				return;
			case OrgcasiPackage.ANOTACION__FECHA_ANOTACION:
				setFechaAnotacion((String)newValue);
				return;
			case OrgcasiPackage.ANOTACION__REALIZADOR_ANOTACION:
				setRealizadorAnotacion((String)newValue);
				return;
			case OrgcasiPackage.ANOTACION__RESPONSABLE_ANOTACION:
				setResponsableAnotacion((String)newValue);
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
			case OrgcasiPackage.ANOTACION__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.ANOTACION__ID_ANOTADA:
				setIdAnotada(ID_ANOTADA_EDEFAULT);
				return;
			case OrgcasiPackage.ANOTACION__VERSION_ANOTADA:
				setVersionAnotada(VERSION_ANOTADA_EDEFAULT);
				return;
			case OrgcasiPackage.ANOTACION__FECHA_ANOTACION:
				setFechaAnotacion(FECHA_ANOTACION_EDEFAULT);
				return;
			case OrgcasiPackage.ANOTACION__REALIZADOR_ANOTACION:
				setRealizadorAnotacion(REALIZADOR_ANOTACION_EDEFAULT);
				return;
			case OrgcasiPackage.ANOTACION__RESPONSABLE_ANOTACION:
				setResponsableAnotacion(RESPONSABLE_ANOTACION_EDEFAULT);
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
			case OrgcasiPackage.ANOTACION__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.ANOTACION__ID_ANOTADA:
				return ID_ANOTADA_EDEFAULT == null ? idAnotada != null : !ID_ANOTADA_EDEFAULT.equals(idAnotada);
			case OrgcasiPackage.ANOTACION__VERSION_ANOTADA:
				return VERSION_ANOTADA_EDEFAULT == null ? versionAnotada != null : !VERSION_ANOTADA_EDEFAULT.equals(versionAnotada);
			case OrgcasiPackage.ANOTACION__FECHA_ANOTACION:
				return FECHA_ANOTACION_EDEFAULT == null ? fechaAnotacion != null : !FECHA_ANOTACION_EDEFAULT.equals(fechaAnotacion);
			case OrgcasiPackage.ANOTACION__REALIZADOR_ANOTACION:
				return REALIZADOR_ANOTACION_EDEFAULT == null ? realizadorAnotacion != null : !REALIZADOR_ANOTACION_EDEFAULT.equals(realizadorAnotacion);
			case OrgcasiPackage.ANOTACION__RESPONSABLE_ANOTACION:
				return RESPONSABLE_ANOTACION_EDEFAULT == null ? responsableAnotacion != null : !RESPONSABLE_ANOTACION_EDEFAULT.equals(responsableAnotacion);
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
		result.append(" (comentario: ");
		result.append(comentario);
		result.append(", idAnotada: ");
		result.append(idAnotada);
		result.append(", versionAnotada: ");
		result.append(versionAnotada);
		result.append(", fechaAnotacion: ");
		result.append(fechaAnotacion);
		result.append(", realizadorAnotacion: ");
		result.append(realizadorAnotacion);
		result.append(", responsableAnotacion: ");
		result.append(responsableAnotacion);
		result.append(')');
		return result.toString();
	}

} //AnotacionImpl