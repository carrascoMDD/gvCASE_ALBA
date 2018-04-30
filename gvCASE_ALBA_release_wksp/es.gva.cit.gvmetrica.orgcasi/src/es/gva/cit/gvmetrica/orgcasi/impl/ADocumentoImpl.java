
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado;
import es.gva.cit.gvmetrica.orgcasi.EntradaOSalida;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.Documento;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADocumento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getEntradasOSalidas <em>Entradas OSalidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getEstados <em>Estados</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ADocumentoImpl#getTodosDocumentos <em>Todos Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADocumentoImpl extends AnotacionImpl implements ADocumento {
	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

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
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected Documento documento = null;

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
	 * The cached value of the '{@link #getEntradasOSalidas() <em>Entradas OSalidas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradasOSalidas()
	 * @generated
	 * @ordered
	 */
	protected EList entradasOSalidas = null;

	/**
	 * The cached value of the '{@link #getEstados() <em>Estados</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstados()
	 * @generated
	 * @ordered
	 */
	protected EList estados = null;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodosDocumentos <em>Todos Documentos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodosDocumentos
	 * @generated
	 */
	private static OCLExpression todosDocumentosDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ADOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getADocumento().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ADocumento");
System.out.println("etiqueta");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("ADocumento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ADocumento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ADocumento etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento getDocumento() {
		if (documento != null && documento.eIsProxy()) {
			InternalEObject oldDocumento = (InternalEObject)documento;
			documento = (Documento)eResolveProxy(oldDocumento);
			if (documento != oldDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.ADOCUMENTO__DOCUMENTO, oldDocumento, documento));
			}
		}
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documento basicGetDocumento() {
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumento(Documento newDocumento) {
		Documento oldDocumento = documento;
		documento = newDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ADOCUMENTO__DOCUMENTO, oldDocumento, documento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ADOCUMENTO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ADOCUMENTO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasDatos() {
		if (estructurasDatos == null) {
			estructurasDatos = new EObjectWithInverseResolvingEList.ManyInverse(EstructuraDatos.class, this, OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS, OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS);
		}
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntradasOSalidas() {
		if (entradasOSalidas == null) {
			entradasOSalidas = new EObjectWithInverseResolvingEList.ManyInverse(EntradaOSalida.class, this, OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS, OrgcasiPackage.ENTRADA_OSALIDA__DOCUMENTOS);
		}
		return entradasOSalidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstados() {
		if (estados == null) {
			estados = new EObjectContainmentWithInverseEList(DocumentoEnEstado.class, this, OrgcasiPackage.ADOCUMENTO__ESTADOS, OrgcasiPackage.DOCUMENTO_EN_ESTADO__DOCUMENTO_BASE);
		}
		return estados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDocumentos getDocumentos() {
		if (eContainerFeatureID != OrgcasiPackage.ADOCUMENTO__DOCUMENTOS) return null;
		return (CDocumentos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentos(CDocumentos newDocumentos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentos, OrgcasiPackage.ADOCUMENTO__DOCUMENTOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentos(CDocumentos newDocumentos) {
		if (newDocumentos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ADOCUMENTO__DOCUMENTOS && newDocumentos != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentos != null)
				msgs = ((InternalEObject)newDocumentos).eInverseAdd(this, OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS, CDocumentos.class, msgs);
			msgs = basicSetDocumentos(newDocumentos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ADOCUMENTO__DOCUMENTOS, newDocumentos, newDocumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosDocumentos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getADocumento().getEAllStructuralFeatures().get(15);
	
//		if (todosDocumentosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosDocumentosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ADocumento");
System.out.println("todosDocumentos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosDocumentosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("ADocumento");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("ADocumento");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ADocumento todosDocumentos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS:
				return ((InternalEList)getEntradasOSalidas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				return ((InternalEList)getEstados()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentos((CDocumentos)otherEnd, msgs);
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
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS:
				return ((InternalEList)getEntradasOSalidas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				return ((InternalEList)getEstados()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				return basicSetDocumentos(null, msgs);
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
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CDOCUMENTOS__DOCUMENTOS, CDocumentos.class, msgs);
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
			case OrgcasiPackage.ADOCUMENTO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ADOCUMENTO__NOMBRE:
				return getNombre();
			case OrgcasiPackage.ADOCUMENTO__DESCRIPCION:
				return getDescripcion();
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTO:
				if (resolve) return getDocumento();
				return basicGetDocumento();
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS:
				return getEntradasOSalidas();
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				return getEstados();
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				return getDocumentos();
			case OrgcasiPackage.ADOCUMENTO__TODOS_DOCUMENTOS:
				return getTodosDocumentos();
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
			case OrgcasiPackage.ADOCUMENTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case OrgcasiPackage.ADOCUMENTO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTO:
				setDocumento((Documento)newValue);
				return;
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				getEstructurasDatos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				getEstados().clear();
				getEstados().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				setDocumentos((CDocumentos)newValue);
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
			case OrgcasiPackage.ADOCUMENTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case OrgcasiPackage.ADOCUMENTO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTO:
				setDocumento((Documento)null);
				return;
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				getEstructurasDatos().clear();
				return;
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				getEstados().clear();
				return;
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				setDocumentos((CDocumentos)null);
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
			case OrgcasiPackage.ADOCUMENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ADOCUMENTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case OrgcasiPackage.ADOCUMENTO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTO:
				return documento != null;
			case OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS:
				return estructurasDatos != null && !estructurasDatos.isEmpty();
			case OrgcasiPackage.ADOCUMENTO__ENTRADAS_OSALIDAS:
				return entradasOSalidas != null && !entradasOSalidas.isEmpty();
			case OrgcasiPackage.ADOCUMENTO__ESTADOS:
				return estados != null && !estados.isEmpty();
			case OrgcasiPackage.ADOCUMENTO__DOCUMENTOS:
				return getDocumentos() != null;
			case OrgcasiPackage.ADOCUMENTO__TODOS_DOCUMENTOS:
				return !getTodosDocumentos().isEmpty();
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
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ADocumentoImpl