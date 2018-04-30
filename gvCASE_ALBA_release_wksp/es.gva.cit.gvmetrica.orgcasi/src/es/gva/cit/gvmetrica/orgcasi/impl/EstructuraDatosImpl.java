/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CampoDatos;
import es.gva.cit.gvmetrica.orgcasi.EntradaOSalida;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.MiembroRelacion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 * An implementation of the model object '<em><b>Estructura Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getMiembroRelaciones <em>Miembro Relaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getEntradasOSalidas <em>Entradas OSalidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getEstructuraDatosDeSuceso <em>Estructura Datos De Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getColeccionEstructuraDatosDeSuceso <em>Coleccion Estructura Datos De Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EstructuraDatosImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstructuraDatosImpl extends OrgcasiObjectImpl implements EstructuraDatos {
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
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getEstructuraDatosDeSuceso <em>Estructura Datos De Suceso</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuraDatosDeSuceso
	 * @generated
	 */
	private static OCLExpression estructuraDatosDeSucesoDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * The cached value of the '{@link #getCampos() <em>Campos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampos()
	 * @generated
	 * @ordered
	 */
	protected EList campos = null;

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
	 * The cached value of the '{@link #getMiembroRelaciones() <em>Miembro Relaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiembroRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList miembroRelaciones = null;

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
	 * The cached value of the '{@link #getColeccionEstructuraDatosDeSuceso() <em>Coleccion Estructura Datos De Suceso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColeccionEstructuraDatosDeSuceso()
	 * @generated
	 * @ordered
	 */
	protected EList coleccionEstructuraDatosDeSuceso = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstructuraDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ESTRUCTURA_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getEstructuraDatos().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("EstructuraDatos");
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
System.out.println("EstructuraDatos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("EstructuraDatos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "EstructuraDatos etiqueta", anException);
		}
	
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectWithInverseResolvingEList.ManyInverse(ADocumento.class, this, OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS, OrgcasiPackage.ADOCUMENTO__ESTRUCTURAS_DATOS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntradasOSalidas() {
		if (entradasOSalidas == null) {
			entradasOSalidas = new EObjectWithInverseResolvingEList.ManyInverse(EntradaOSalida.class, this, OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS, OrgcasiPackage.ENTRADA_OSALIDA__ESTRUCTURAS_DATOS);
		}
		return entradasOSalidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCampos() {
		if (campos == null) {
			campos = new EObjectWithInverseResolvingEList.ManyInverse(CampoDatos.class, this, OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS, OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS);
		}
		return campos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructuraDatosDeSuceso() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getEstructuraDatos().getEAllStructuralFeatures().get(8);
	
//		if (estructuraDatosDeSucesoDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				estructuraDatosDeSucesoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("EstructuraDatos");
System.out.println("estructuraDatosDeSuceso");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(estructuraDatosDeSucesoDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("EstructuraDatos");
System.out.println("estructuraDatosDeSuceso");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("EstructuraDatos");
System.out.println("estructuraDatosDeSuceso");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "EstructuraDatos estructuraDatosDeSuceso", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColeccionEstructuraDatosDeSuceso() {
		if (coleccionEstructuraDatosDeSuceso == null) {
			coleccionEstructuraDatosDeSuceso = new EObjectWithInverseResolvingEList.ManyInverse(CEstructurasDatosSuceso.class, this, OrgcasiPackage.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO, OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS);
		}
		return coleccionEstructuraDatosDeSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatos getEstructurasDatos() {
		if (eContainerFeatureID != OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS) return null;
		return (CEstructurasDatos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasDatos(CEstructurasDatos newEstructurasDatos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEstructurasDatos, OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasDatos(CEstructurasDatos newEstructurasDatos) {
		if (newEstructurasDatos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS && newEstructurasDatos != null)) {
			if (EcoreUtil.isAncestor(this, newEstructurasDatos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEstructurasDatos != null)
				msgs = ((InternalEObject)newEstructurasDatos).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS, CEstructurasDatos.class, msgs);
			msgs = basicSetEstructurasDatos(newEstructurasDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS, newEstructurasDatos, newEstructurasDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMiembroRelaciones() {
		if (miembroRelaciones == null) {
			miembroRelaciones = new EObjectWithInverseResolvingEList(MiembroRelacion.class, this, OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES, OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS);
		}
		return miembroRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				return ((InternalEList)getCampos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES:
				return ((InternalEList)getMiembroRelaciones()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS:
				return ((InternalEList)getEntradasOSalidas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO:
				return ((InternalEList)getColeccionEstructuraDatosDeSuceso()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEstructurasDatos((CEstructurasDatos)otherEnd, msgs);
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				return ((InternalEList)getCampos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES:
				return ((InternalEList)getMiembroRelaciones()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS:
				return ((InternalEList)getEntradasOSalidas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO:
				return ((InternalEList)getColeccionEstructuraDatosDeSuceso()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				return basicSetEstructurasDatos(null, msgs);
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_DATOS__ESTRUCTURAS_DATOS, CEstructurasDatos.class, msgs);
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE:
				return getNombre();
			case OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				return getCampos();
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				return getDocumentos();
			case OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES:
				return getMiembroRelaciones();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS:
				return getEntradasOSalidas();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO:
				return getEstructuraDatosDeSuceso();
			case OrgcasiPackage.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO:
				return getColeccionEstructuraDatosDeSuceso();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE:
				setNombre((String)newValue);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				getCampos().clear();
				getCampos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)newValue);
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				getCampos().clear();
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				getDocumentos().clear();
				return;
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)null);
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
			case OrgcasiPackage.ESTRUCTURA_DATOS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS:
				return campos != null && !campos.isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES:
				return miembroRelaciones != null && !miembroRelaciones.isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS:
				return entradasOSalidas != null && !entradasOSalidas.isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO:
				return !getEstructuraDatosDeSuceso().isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO:
				return coleccionEstructuraDatosDeSuceso != null && !coleccionEstructuraDatosDeSuceso.isEmpty();
			case OrgcasiPackage.ESTRUCTURA_DATOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos() != null;
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
		result.append(", comentario: ");
		result.append(comentario);
		result.append(')');
		return result.toString();
	}

} //EstructuraDatosImpl