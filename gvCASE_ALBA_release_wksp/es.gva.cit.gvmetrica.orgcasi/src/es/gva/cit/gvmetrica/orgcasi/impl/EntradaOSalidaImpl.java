/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ADocumento;

import es.gva.cit.gvmetrica.orgcasi.EntradaOSalida;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entrada OSalida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#isEsDocumentoPapel <em>Es Documento Papel</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaOSalidaImpl#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntradaOSalidaImpl extends OrgcasiObjectImpl implements EntradaOSalida {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsDocumentoPapel() <em>Es Documento Papel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsDocumentoPapel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_DOCUMENTO_PAPEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsDocumentoPapel() <em>Es Documento Papel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsDocumentoPapel()
	 * @generated
	 * @ordered
	 */
	protected boolean esDocumentoPapel = ES_DOCUMENTO_PAPEL_EDEFAULT;

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
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected EList estructurasDatos = null;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList documentos = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntradaOSalidaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ENTRADA_OSALIDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_OSALIDA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsDocumentoPapel() {
		return esDocumentoPapel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsDocumentoPapel(boolean newEsDocumentoPapel) {
		boolean oldEsDocumentoPapel = esDocumentoPapel;
		esDocumentoPapel = newEsDocumentoPapel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL, oldEsDocumentoPapel, esDocumentoPapel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_OSALIDA__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_OSALIDA__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasDatos() {
		if (estructurasDatos == null) {
			estructurasDatos = new EObjectWithInverseResolvingEList.ManyInverse(EstructuraDatos.class, this, OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS, OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS);
		}
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectWithInverseResolvingEList.ManyInverse(ADocumento.class, this, OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS, OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.ENTRADA_OSALIDA__NOMBRE:
				return getNombre();
			case OrgcasiPackage.ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL:
				return isEsDocumentoPapel() ? Boolean.TRUE : Boolean.FALSE;
			case OrgcasiPackage.ENTRADA_OSALIDA__DESCRIPCION:
				return getDescripcion();
			case OrgcasiPackage.ENTRADA_OSALIDA__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				return getDocumentos();
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
			case OrgcasiPackage.ENTRADA_OSALIDA__NOMBRE:
				setNombre((String)newValue);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL:
				setEsDocumentoPapel(((Boolean)newValue).booleanValue());
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				getEstructurasDatos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection)newValue);
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
			case OrgcasiPackage.ENTRADA_OSALIDA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL:
				setEsDocumentoPapel(ES_DOCUMENTO_PAPEL_EDEFAULT);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				return;
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				getDocumentos().clear();
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
			case OrgcasiPackage.ENTRADA_OSALIDA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case OrgcasiPackage.ENTRADA_OSALIDA__ES_DOCUMENTO_PAPEL:
				return esDocumentoPapel != ES_DOCUMENTO_PAPEL_EDEFAULT;
			case OrgcasiPackage.ENTRADA_OSALIDA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case OrgcasiPackage.ENTRADA_OSALIDA__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS:
				return estructurasDatos != null && !estructurasDatos.isEmpty();
			case OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", esDocumentoPapel: ");
		result.append(esDocumentoPapel);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", comentario: ");
		result.append(comentario);
		result.append(')');
		return result.toString();
	}

} //EntradaOSalidaImpl