/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CampoDatos;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
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
 * An implementation of the model object '<em><b>Campo Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getFormato <em>Formato</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getEjemplo <em>Ejemplo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getRequerido <em>Requerido</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getValorPorDefecto <em>Valor Por Defecto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getRango <em>Rango</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getRangoRazonable <em>Rango Razonable</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getFuenteDatos <em>Fuente Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CampoDatosImpl#getCampos <em>Campos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CampoDatosImpl extends OrgcasiObjectImpl implements CampoDatos {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormato() <em>Formato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormato()
	 * @generated
	 * @ordered
	 */
	protected String formato = FORMATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEjemplo() <em>Ejemplo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjemplo()
	 * @generated
	 * @ordered
	 */
	protected static final String EJEMPLO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjemplo() <em>Ejemplo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjemplo()
	 * @generated
	 * @ordered
	 */
	protected String ejemplo = EJEMPLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequerido() <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequerido()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUERIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequerido() <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequerido()
	 * @generated
	 * @ordered
	 */
	protected String requerido = REQUERIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorPorDefecto() <em>Valor Por Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorPorDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_POR_DEFECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorPorDefecto() <em>Valor Por Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorPorDefecto()
	 * @generated
	 * @ordered
	 */
	protected String valorPorDefecto = VALOR_POR_DEFECTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRango() <em>Rango</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRango()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRango() <em>Rango</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRango()
	 * @generated
	 * @ordered
	 */
	protected String rango = RANGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangoRazonable() <em>Rango Razonable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangoRazonable()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGO_RAZONABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRangoRazonable() <em>Rango Razonable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangoRazonable()
	 * @generated
	 * @ordered
	 */
	protected String rangoRazonable = RANGO_RAZONABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuenteDatos() <em>Fuente Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuenteDatos()
	 * @generated
	 * @ordered
	 */
	protected static final String FUENTE_DATOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuenteDatos() <em>Fuente Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuenteDatos()
	 * @generated
	 * @ordered
	 */
	protected String fuenteDatos = FUENTE_DATOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected String observaciones = OBSERVACIONES_EDEFAULT;

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
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampoDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CAMPO_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCampoDatos().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CampoDatos");
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
System.out.println("CampoDatos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CampoDatos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CampoDatos etiqueta", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormato(String newFormato) {
		String oldFormato = formato;
		formato = newFormato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__FORMATO, oldFormato, formato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEjemplo() {
		return ejemplo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjemplo(String newEjemplo) {
		String oldEjemplo = ejemplo;
		ejemplo = newEjemplo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__EJEMPLO, oldEjemplo, ejemplo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequerido() {
		return requerido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequerido(String newRequerido) {
		String oldRequerido = requerido;
		requerido = newRequerido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__REQUERIDO, oldRequerido, requerido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorPorDefecto() {
		return valorPorDefecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorPorDefecto(String newValorPorDefecto) {
		String oldValorPorDefecto = valorPorDefecto;
		valorPorDefecto = newValorPorDefecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO, oldValorPorDefecto, valorPorDefecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRango() {
		return rango;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRango(String newRango) {
		String oldRango = rango;
		rango = newRango;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__RANGO, oldRango, rango));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRangoRazonable() {
		return rangoRazonable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangoRazonable(String newRangoRazonable) {
		String oldRangoRazonable = rangoRazonable;
		rangoRazonable = newRangoRazonable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE, oldRangoRazonable, rangoRazonable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuenteDatos() {
		return fuenteDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuenteDatos(String newFuenteDatos) {
		String oldFuenteDatos = fuenteDatos;
		fuenteDatos = newFuenteDatos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS, oldFuenteDatos, fuenteDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservaciones(String newObservaciones) {
		String oldObservaciones = observaciones;
		observaciones = newObservaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES, oldObservaciones, observaciones));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstructurasDatos() {
		if (estructurasDatos == null) {
			estructurasDatos = new EObjectWithInverseResolvingEList.ManyInverse(EstructuraDatos.class, this, OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS, OrgcasiPackage.ESTRUCTURA_DATOS__CAMPOS);
		}
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCamposDatos getCampos() {
		if (eContainerFeatureID != OrgcasiPackage.CAMPO_DATOS__CAMPOS) return null;
		return (CCamposDatos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampos(CCamposDatos newCampos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCampos, OrgcasiPackage.CAMPO_DATOS__CAMPOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCampos(CCamposDatos newCampos) {
		if (newCampos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CAMPO_DATOS__CAMPOS && newCampos != null)) {
			if (EcoreUtil.isAncestor(this, newCampos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCampos != null)
				msgs = ((InternalEObject)newCampos).eInverseAdd(this, OrgcasiPackage.CCAMPOS_DATOS__CAMPOS, CCamposDatos.class, msgs);
			msgs = basicSetCampos(newCampos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CAMPO_DATOS__CAMPOS, newCampos, newCampos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCampos((CCamposDatos)otherEnd, msgs);
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
			case OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS:
				return ((InternalEList)getEstructurasDatos()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				return basicSetCampos(null, msgs);
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
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CCAMPOS_DATOS__CAMPOS, CCamposDatos.class, msgs);
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
			case OrgcasiPackage.CAMPO_DATOS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.CAMPO_DATOS__NOMBRE:
				return getNombre();
			case OrgcasiPackage.CAMPO_DATOS__DESCRIPCION:
				return getDescripcion();
			case OrgcasiPackage.CAMPO_DATOS__TIPO:
				return getTipo();
			case OrgcasiPackage.CAMPO_DATOS__FORMATO:
				return getFormato();
			case OrgcasiPackage.CAMPO_DATOS__EJEMPLO:
				return getEjemplo();
			case OrgcasiPackage.CAMPO_DATOS__REQUERIDO:
				return getRequerido();
			case OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO:
				return getValorPorDefecto();
			case OrgcasiPackage.CAMPO_DATOS__RANGO:
				return getRango();
			case OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE:
				return getRangoRazonable();
			case OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS:
				return getFuenteDatos();
			case OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES:
				return getObservaciones();
			case OrgcasiPackage.CAMPO_DATOS__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				return getCampos();
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
			case OrgcasiPackage.CAMPO_DATOS__NOMBRE:
				setNombre((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__TIPO:
				setTipo((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__FORMATO:
				setFormato((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__EJEMPLO:
				setEjemplo((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__REQUERIDO:
				setRequerido((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO:
				setValorPorDefecto((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__RANGO:
				setRango((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE:
				setRangoRazonable((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS:
				setFuenteDatos((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES:
				setObservaciones((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				setCampos((CCamposDatos)newValue);
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
			case OrgcasiPackage.CAMPO_DATOS__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__FORMATO:
				setFormato(FORMATO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__EJEMPLO:
				setEjemplo(EJEMPLO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__REQUERIDO:
				setRequerido(REQUERIDO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO:
				setValorPorDefecto(VALOR_POR_DEFECTO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__RANGO:
				setRango(RANGO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE:
				setRangoRazonable(RANGO_RAZONABLE_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS:
				setFuenteDatos(FUENTE_DATOS_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				setCampos((CCamposDatos)null);
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
			case OrgcasiPackage.CAMPO_DATOS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.CAMPO_DATOS__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case OrgcasiPackage.CAMPO_DATOS__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case OrgcasiPackage.CAMPO_DATOS__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case OrgcasiPackage.CAMPO_DATOS__FORMATO:
				return FORMATO_EDEFAULT == null ? formato != null : !FORMATO_EDEFAULT.equals(formato);
			case OrgcasiPackage.CAMPO_DATOS__EJEMPLO:
				return EJEMPLO_EDEFAULT == null ? ejemplo != null : !EJEMPLO_EDEFAULT.equals(ejemplo);
			case OrgcasiPackage.CAMPO_DATOS__REQUERIDO:
				return REQUERIDO_EDEFAULT == null ? requerido != null : !REQUERIDO_EDEFAULT.equals(requerido);
			case OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO:
				return VALOR_POR_DEFECTO_EDEFAULT == null ? valorPorDefecto != null : !VALOR_POR_DEFECTO_EDEFAULT.equals(valorPorDefecto);
			case OrgcasiPackage.CAMPO_DATOS__RANGO:
				return RANGO_EDEFAULT == null ? rango != null : !RANGO_EDEFAULT.equals(rango);
			case OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE:
				return RANGO_RAZONABLE_EDEFAULT == null ? rangoRazonable != null : !RANGO_RAZONABLE_EDEFAULT.equals(rangoRazonable);
			case OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS:
				return FUENTE_DATOS_EDEFAULT == null ? fuenteDatos != null : !FUENTE_DATOS_EDEFAULT.equals(fuenteDatos);
			case OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case OrgcasiPackage.CAMPO_DATOS__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.CAMPO_DATOS__ESTRUCTURAS_DATOS:
				return estructurasDatos != null && !estructurasDatos.isEmpty();
			case OrgcasiPackage.CAMPO_DATOS__CAMPOS:
				return getCampos() != null;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", formato: ");
		result.append(formato);
		result.append(", ejemplo: ");
		result.append(ejemplo);
		result.append(", requerido: ");
		result.append(requerido);
		result.append(", valorPorDefecto: ");
		result.append(valorPorDefecto);
		result.append(", rango: ");
		result.append(rango);
		result.append(", rangoRazonable: ");
		result.append(rangoRazonable);
		result.append(", fuenteDatos: ");
		result.append(fuenteDatos);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(", comentario: ");
		result.append(comentario);
		result.append(')');
		return result.toString();
	}

} //CampoDatosImpl