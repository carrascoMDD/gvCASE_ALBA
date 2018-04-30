
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ContenedorUnidadOrganica;
import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.UnidadOrganica;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidad Organica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getDescomposicion <em>Descomposicion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getTipoUnidad <em>Tipo Unidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getCodigoOrganico <em>Codigo Organico</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getUnidadDeProcedimientos <em>Unidad De Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getDescompone <em>Descompone</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadOrganicaImpl#getResponsableDeProcedimientos <em>Responsable De Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnidadOrganicaImpl extends UnidadImpl implements UnidadOrganica {
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
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoUnidad() <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUnidad()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_UNIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoUnidad() <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUnidad()
	 * @generated
	 * @ordered
	 */
	protected String tipoUnidad = TIPO_UNIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoOrganico() <em>Codigo Organico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoOrganico()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_ORGANICO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoOrganico() <em>Codigo Organico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoOrganico()
	 * @generated
	 * @ordered
	 */
	protected String codigoOrganico = CODIGO_ORGANICO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnidadDeProcedimientos() <em>Unidad De Procedimientos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadDeProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected EList unidadDeProcedimientos = null;

	/**
	 * The cached value of the '{@link #getEstructurasFuncionales() <em>Estructuras Funcionales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasFuncionales()
	 * @generated
	 * @ordered
	 */
	protected EList estructurasFuncionales = null;

	/**
	 * The cached value of the '{@link #getResponsableDeProcedimientos() <em>Responsable De Procedimientos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableDeProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected EList responsableDeProcedimientos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnidadOrganicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.UNIDAD_ORGANICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDescomposicion() {
		if (descomposicion == null) {
			descomposicion = new EObjectContainmentWithInverseEList(UnidadOrganica.class, this, SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION, SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE);
		}
		return descomposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD_ORGANICA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoUnidad() {
		return tipoUnidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoUnidad(String newTipoUnidad) {
		String oldTipoUnidad = tipoUnidad;
		tipoUnidad = newTipoUnidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD, oldTipoUnidad, tipoUnidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoOrganico() {
		return codigoOrganico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoOrganico(String newCodigoOrganico) {
		String oldCodigoOrganico = codigoOrganico;
		codigoOrganico = newCodigoOrganico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO, oldCodigoOrganico, codigoOrganico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnidadDeProcedimientos() {
		if (unidadDeProcedimientos == null) {
			unidadDeProcedimientos = new EObjectWithInverseResolvingEList.ManyInverse(Procedimiento.class, this, SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__UNIDADES);
		}
		return unidadDeProcedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUnidadOrganica getDescompone() {
		if (eContainerFeatureID != SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE) return null;
		return (ContenedorUnidadOrganica)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasFuncionales() {
		if (estructurasFuncionales == null) {
			estructurasFuncionales = new EObjectWithInverseResolvingEList.ManyInverse(EstructuraFuncional.class, this, SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES, SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS);
		}
		return estructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResponsableDeProcedimientos() {
		if (responsableDeProcedimientos == null) {
			responsableDeProcedimientos = new EObjectWithInverseResolvingEList(Procedimiento.class, this, SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__RESPONSABLE);
		}
		return responsableDeProcedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicAdd(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				return ((InternalEList)getUnidadDeProcedimientos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				return ((InternalEList)getEstructurasFuncionales()).basicAdd(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS:
				return ((InternalEList)getResponsableDeProcedimientos()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicRemove(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				return ((InternalEList)getUnidadDeProcedimientos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE:
				return eBasicSetContainer(null, SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				return ((InternalEList)getEstructurasFuncionales()).basicRemove(otherEnd, msgs);
			case SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS:
				return ((InternalEList)getResponsableDeProcedimientos()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION, ContenedorUnidadOrganica.class, msgs);
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				return getDescomposicion();
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO:
				return getCodigo();
			case SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION:
				return getDescripcion();
			case SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD:
				return getTipoUnidad();
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO:
				return getCodigoOrganico();
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				return getUnidadDeProcedimientos();
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE:
				return getDescompone();
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales();
			case SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS:
				return getResponsableDeProcedimientos();
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				getDescomposicion().clear();
				getDescomposicion().addAll((Collection)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO:
				setCodigo((String)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD:
				setTipoUnidad((String)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO:
				setCodigoOrganico((String)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				getUnidadDeProcedimientos().clear();
				getUnidadDeProcedimientos().addAll((Collection)newValue);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				getEstructurasFuncionales().clear();
				getEstructurasFuncionales().addAll((Collection)newValue);
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				getDescomposicion().clear();
				return;
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD:
				setTipoUnidad(TIPO_UNIDAD_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO:
				setCodigoOrganico(CODIGO_ORGANICO_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				getUnidadDeProcedimientos().clear();
				return;
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				getEstructurasFuncionales().clear();
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
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				return descomposicion != null && !descomposicion.isEmpty();
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD:
				return TIPO_UNIDAD_EDEFAULT == null ? tipoUnidad != null : !TIPO_UNIDAD_EDEFAULT.equals(tipoUnidad);
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO:
				return CODIGO_ORGANICO_EDEFAULT == null ? codigoOrganico != null : !CODIGO_ORGANICO_EDEFAULT.equals(codigoOrganico);
			case SimapaPackage.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS:
				return unidadDeProcedimientos != null && !unidadDeProcedimientos.isEmpty();
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPONE:
				return getDescompone() != null;
			case SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES:
				return estructurasFuncionales != null && !estructurasFuncionales.isEmpty();
			case SimapaPackage.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS:
				return responsableDeProcedimientos != null && !responsableDeProcedimientos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorUnidadOrganica.class) {
			switch (derivedFeatureID) {
				case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION: return SimapaPackage.CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION;
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
		if (baseClass == ContenedorUnidadOrganica.class) {
			switch (baseFeatureID) {
				case SimapaPackage.CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION: return SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", tipoUnidad: ");
		result.append(tipoUnidad);
		result.append(", codigoOrganico: ");
		result.append(codigoOrganico);
		result.append(')');
		return result.toString();
	}

} //UnidadOrganicaImpl