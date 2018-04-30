/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso;
import es.gva.cit.gvmetrica.orgcasi.CActoresSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
import es.gva.cit.gvmetrica.orgcasi.TipoPrioridad;
import es.gva.cit.gvmetrica.orgcasi.UsoSuceso;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * An implementation of the model object '<em><b>Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getPrioridad <em>Prioridad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getRendimiento <em>Rendimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getDisparo <em>Disparo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getDistribucion <em>Distribucion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getPreCondicion <em>Pre Condicion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getPostCondicion <em>Post Condicion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#isEsColaborativo <em>Es Colaborativo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getUsadoPorSucesos <em>Usado Por Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SucesoImpl#getSucesos <em>Sucesos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SucesoImpl extends AgrupacionImpl implements Suceso {
	/**
	 * The default value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPrioridad PRIORIDAD_EDEFAULT = TipoPrioridad.ALTA_LITERAL;

	/**
	 * The cached value of the '{@link #getPrioridad() <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioridad()
	 * @generated
	 * @ordered
	 */
	protected TipoPrioridad prioridad = PRIORIDAD_EDEFAULT;

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
	 * The default value of the '{@link #getRendimiento() <em>Rendimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRendimiento() <em>Rendimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendimiento()
	 * @generated
	 * @ordered
	 */
	protected String rendimiento = RENDIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisparo() <em>Disparo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisparo()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPARO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisparo() <em>Disparo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisparo()
	 * @generated
	 * @ordered
	 */
	protected String disparo = DISPARO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribucion() <em>Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribucion()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribucion() <em>Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribucion()
	 * @generated
	 * @ordered
	 */
	protected String distribucion = DISTRIBUCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreCondicion() <em>Pre Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondicion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDICION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondicion() <em>Pre Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondicion()
	 * @generated
	 * @ordered
	 */
	protected String preCondicion = PRE_CONDICION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCondicion() <em>Post Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondicion()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONDICION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCondicion() <em>Post Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondicion()
	 * @generated
	 * @ordered
	 */
	protected String postCondicion = POST_CONDICION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsColaborativo() <em>Es Colaborativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsColaborativo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_COLABORATIVO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsColaborativo() <em>Es Colaborativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsColaborativo()
	 * @generated
	 * @ordered
	 */
	protected boolean esColaborativo = ES_COLABORATIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcciones() <em>Acciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcciones()
	 * @generated
	 * @ordered
	 */
	protected CAccionesSuceso acciones = null;

	/**
	 * The cached value of the '{@link #getActores() <em>Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActores()
	 * @generated
	 * @ordered
	 */
	protected CActoresSuceso actores = null;

	/**
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected CEstructurasDatosSuceso estructurasDatos = null;

	/**
	 * The cached value of the '{@link #getFlujos() <em>Flujos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujos()
	 * @generated
	 * @ordered
	 */
	protected CFlujosSuceso flujos = null;

	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected CEntradasSuceso entradas = null;

	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected CSalidasSuceso salidas = null;

	/**
	 * The cached value of the '{@link #getUsadoPorSucesos() <em>Usado Por Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsadoPorSucesos()
	 * @generated
	 * @ordered
	 */
	protected CUsadoPorSucesos usadoPorSucesos = null;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getProcedimiento <em>Procedimiento</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimiento
	 * @generated
	 */
	private static OCLExpression procedimientoDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated NOT
		 * OJO ACV
		 */
	protected SucesoImpl() {
		super();
		setAcciones( OrgcasiFactory.eINSTANCE.createCAccionesSuceso());
		setActores( OrgcasiFactory.eINSTANCE.createCActoresSuceso());
		setEstructurasDatos( OrgcasiFactory.eINSTANCE.createCEstructurasDatosSuceso());
		setEntradas( OrgcasiFactory.eINSTANCE.createCEntradasSuceso());
		setSalidas( OrgcasiFactory.eINSTANCE.createCSalidasSuceso());
		setFlujos( OrgcasiFactory.eINSTANCE.createCFlujosSuceso());
		setUsadoPorSucesos( OrgcasiFactory.eINSTANCE.createCUsadoPorSucesos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPrioridad getPrioridad() {
		return prioridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioridad(TipoPrioridad newPrioridad) {
		TipoPrioridad oldPrioridad = prioridad;
		prioridad = newPrioridad == null ? PRIORIDAD_EDEFAULT : newPrioridad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__PRIORIDAD, oldPrioridad, prioridad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRendimiento() {
		return rendimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendimiento(String newRendimiento) {
		String oldRendimiento = rendimiento;
		rendimiento = newRendimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__RENDIMIENTO, oldRendimiento, rendimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisparo() {
		return disparo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisparo(String newDisparo) {
		String oldDisparo = disparo;
		disparo = newDisparo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__DISPARO, oldDisparo, disparo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribucion() {
		return distribucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribucion(String newDistribucion) {
		String oldDistribucion = distribucion;
		distribucion = newDistribucion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__DISTRIBUCION, oldDistribucion, distribucion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondicion() {
		return preCondicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondicion(String newPreCondicion) {
		String oldPreCondicion = preCondicion;
		preCondicion = newPreCondicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__PRE_CONDICION, oldPreCondicion, preCondicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostCondicion() {
		return postCondicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondicion(String newPostCondicion) {
		String oldPostCondicion = postCondicion;
		postCondicion = newPostCondicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__POST_CONDICION, oldPostCondicion, postCondicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsColaborativo() {
		return esColaborativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsColaborativo(boolean newEsColaborativo) {
		boolean oldEsColaborativo = esColaborativo;
		esColaborativo = newEsColaborativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ES_COLABORATIVO, oldEsColaborativo, esColaborativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAccionesSuceso getAcciones() {
		return acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcciones(CAccionesSuceso newAcciones, NotificationChain msgs) {
		CAccionesSuceso oldAcciones = acciones;
		acciones = newAcciones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ACCIONES, oldAcciones, newAcciones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcciones(CAccionesSuceso newAcciones) {
		if (newAcciones != acciones) {
			NotificationChain msgs = null;
			if (acciones != null)
				msgs = ((InternalEObject)acciones).eInverseRemove(this, OrgcasiPackage.CACCIONES_SUCESO__SUCESO, CAccionesSuceso.class, msgs);
			if (newAcciones != null)
				msgs = ((InternalEObject)newAcciones).eInverseAdd(this, OrgcasiPackage.CACCIONES_SUCESO__SUCESO, CAccionesSuceso.class, msgs);
			msgs = basicSetAcciones(newAcciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ACCIONES, newAcciones, newAcciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CActoresSuceso getActores() {
		return actores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActores(CActoresSuceso newActores, NotificationChain msgs) {
		CActoresSuceso oldActores = actores;
		actores = newActores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ACTORES, oldActores, newActores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActores(CActoresSuceso newActores) {
		if (newActores != actores) {
			NotificationChain msgs = null;
			if (actores != null)
				msgs = ((InternalEObject)actores).eInverseRemove(this, OrgcasiPackage.CACTORES_SUCESO__SUCESO, CActoresSuceso.class, msgs);
			if (newActores != null)
				msgs = ((InternalEObject)newActores).eInverseAdd(this, OrgcasiPackage.CACTORES_SUCESO__SUCESO, CActoresSuceso.class, msgs);
			msgs = basicSetActores(newActores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ACTORES, newActores, newActores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatosSuceso getEstructurasDatos() {
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasDatos(CEstructurasDatosSuceso newEstructurasDatos, NotificationChain msgs) {
		CEstructurasDatosSuceso oldEstructurasDatos = estructurasDatos;
		estructurasDatos = newEstructurasDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS, oldEstructurasDatos, newEstructurasDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasDatos(CEstructurasDatosSuceso newEstructurasDatos) {
		if (newEstructurasDatos != estructurasDatos) {
			NotificationChain msgs = null;
			if (estructurasDatos != null)
				msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO__SUCESO, CEstructurasDatosSuceso.class, msgs);
			if (newEstructurasDatos != null)
				msgs = ((InternalEObject)newEstructurasDatos).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO__SUCESO, CEstructurasDatosSuceso.class, msgs);
			msgs = basicSetEstructurasDatos(newEstructurasDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS, newEstructurasDatos, newEstructurasDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFlujosSuceso getFlujos() {
		return flujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlujos(CFlujosSuceso newFlujos, NotificationChain msgs) {
		CFlujosSuceso oldFlujos = flujos;
		flujos = newFlujos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__FLUJOS, oldFlujos, newFlujos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlujos(CFlujosSuceso newFlujos) {
		if (newFlujos != flujos) {
			NotificationChain msgs = null;
			if (flujos != null)
				msgs = ((InternalEObject)flujos).eInverseRemove(this, OrgcasiPackage.CFLUJOS_SUCESO__SUCESO, CFlujosSuceso.class, msgs);
			if (newFlujos != null)
				msgs = ((InternalEObject)newFlujos).eInverseAdd(this, OrgcasiPackage.CFLUJOS_SUCESO__SUCESO, CFlujosSuceso.class, msgs);
			msgs = basicSetFlujos(newFlujos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__FLUJOS, newFlujos, newFlujos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEntradasSuceso getEntradas() {
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntradas(CEntradasSuceso newEntradas, NotificationChain msgs) {
		CEntradasSuceso oldEntradas = entradas;
		entradas = newEntradas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ENTRADAS, oldEntradas, newEntradas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntradas(CEntradasSuceso newEntradas) {
		if (newEntradas != entradas) {
			NotificationChain msgs = null;
			if (entradas != null)
				msgs = ((InternalEObject)entradas).eInverseRemove(this, OrgcasiPackage.CENTRADAS_SUCESO__SUCESO, CEntradasSuceso.class, msgs);
			if (newEntradas != null)
				msgs = ((InternalEObject)newEntradas).eInverseAdd(this, OrgcasiPackage.CENTRADAS_SUCESO__SUCESO, CEntradasSuceso.class, msgs);
			msgs = basicSetEntradas(newEntradas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__ENTRADAS, newEntradas, newEntradas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSalidasSuceso getSalidas() {
		return salidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalidas(CSalidasSuceso newSalidas, NotificationChain msgs) {
		CSalidasSuceso oldSalidas = salidas;
		salidas = newSalidas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__SALIDAS, oldSalidas, newSalidas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalidas(CSalidasSuceso newSalidas) {
		if (newSalidas != salidas) {
			NotificationChain msgs = null;
			if (salidas != null)
				msgs = ((InternalEObject)salidas).eInverseRemove(this, OrgcasiPackage.CSALIDAS_SUCESO__SUCESO, CSalidasSuceso.class, msgs);
			if (newSalidas != null)
				msgs = ((InternalEObject)newSalidas).eInverseAdd(this, OrgcasiPackage.CSALIDAS_SUCESO__SUCESO, CSalidasSuceso.class, msgs);
			msgs = basicSetSalidas(newSalidas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__SALIDAS, newSalidas, newSalidas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUsadoPorSucesos getUsadoPorSucesos() {
		return usadoPorSucesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsadoPorSucesos(CUsadoPorSucesos newUsadoPorSucesos, NotificationChain msgs) {
		CUsadoPorSucesos oldUsadoPorSucesos = usadoPorSucesos;
		usadoPorSucesos = newUsadoPorSucesos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__USADO_POR_SUCESOS, oldUsadoPorSucesos, newUsadoPorSucesos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsadoPorSucesos(CUsadoPorSucesos newUsadoPorSucesos) {
		if (newUsadoPorSucesos != usadoPorSucesos) {
			NotificationChain msgs = null;
			if (usadoPorSucesos != null)
				msgs = ((InternalEObject)usadoPorSucesos).eInverseRemove(this, OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO, CUsadoPorSucesos.class, msgs);
			if (newUsadoPorSucesos != null)
				msgs = ((InternalEObject)newUsadoPorSucesos).eInverseAdd(this, OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO, CUsadoPorSucesos.class, msgs);
			msgs = basicSetUsadoPorSucesos(newUsadoPorSucesos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__USADO_POR_SUCESOS, newUsadoPorSucesos, newUsadoPorSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento getProcedimiento() {
		AProcedimiento procedimiento = basicGetProcedimiento();
		return procedimiento != null && procedimiento.eIsProxy() ? (AProcedimiento)eResolveProxy((InternalEObject)procedimiento) : procedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AProcedimiento basicGetProcedimiento() {
//		if (procedimientoDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSuceso().getEAllStructuralFeatures().get(21);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				procedimientoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Suceso");
System.out.println("procedimiento");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(procedimientoDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Suceso");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (AProcedimiento) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Suceso");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Suceso procedimiento", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSucesos getSucesos() {
		if (eContainerFeatureID != OrgcasiPackage.SUCESO__SUCESOS) return null;
		return (CSucesos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucesos(CSucesos newSucesos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSucesos, OrgcasiPackage.SUCESO__SUCESOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucesos(CSucesos newSucesos) {
		if (newSucesos != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.SUCESO__SUCESOS && newSucesos != null)) {
			if (EcoreUtil.isAncestor(this, newSucesos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSucesos != null)
				msgs = ((InternalEObject)newSucesos).eInverseAdd(this, OrgcasiPackage.CSUCESOS__SUCESOS, CSucesos.class, msgs);
			msgs = basicSetSucesos(newSucesos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SUCESO__SUCESOS, newSucesos, newSucesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.SUCESO__ACCIONES:
				if (acciones != null)
					msgs = ((InternalEObject)acciones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__ACCIONES, null, msgs);
				return basicSetAcciones((CAccionesSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__ACTORES:
				if (actores != null)
					msgs = ((InternalEObject)actores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__ACTORES, null, msgs);
				return basicSetActores((CActoresSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				if (estructurasDatos != null)
					msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS, null, msgs);
				return basicSetEstructurasDatos((CEstructurasDatosSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__FLUJOS:
				if (flujos != null)
					msgs = ((InternalEObject)flujos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__FLUJOS, null, msgs);
				return basicSetFlujos((CFlujosSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__ENTRADAS:
				if (entradas != null)
					msgs = ((InternalEObject)entradas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__ENTRADAS, null, msgs);
				return basicSetEntradas((CEntradasSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__SALIDAS:
				if (salidas != null)
					msgs = ((InternalEObject)salidas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__SALIDAS, null, msgs);
				return basicSetSalidas((CSalidasSuceso)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				if (usadoPorSucesos != null)
					msgs = ((InternalEObject)usadoPorSucesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.SUCESO__USADO_POR_SUCESOS, null, msgs);
				return basicSetUsadoPorSucesos((CUsadoPorSucesos)otherEnd, msgs);
			case OrgcasiPackage.SUCESO__SUCESOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSucesos((CSucesos)otherEnd, msgs);
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
			case OrgcasiPackage.SUCESO__ACCIONES:
				return basicSetAcciones(null, msgs);
			case OrgcasiPackage.SUCESO__ACTORES:
				return basicSetActores(null, msgs);
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				return basicSetEstructurasDatos(null, msgs);
			case OrgcasiPackage.SUCESO__FLUJOS:
				return basicSetFlujos(null, msgs);
			case OrgcasiPackage.SUCESO__ENTRADAS:
				return basicSetEntradas(null, msgs);
			case OrgcasiPackage.SUCESO__SALIDAS:
				return basicSetSalidas(null, msgs);
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				return basicSetUsadoPorSucesos(null, msgs);
			case OrgcasiPackage.SUCESO__SUCESOS:
				return basicSetSucesos(null, msgs);
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
			case OrgcasiPackage.SUCESO__SUCESOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CSUCESOS__SUCESOS, CSucesos.class, msgs);
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
			case OrgcasiPackage.SUCESO__PRIORIDAD:
				return getPrioridad();
			case OrgcasiPackage.SUCESO__TIPO:
				return getTipo();
			case OrgcasiPackage.SUCESO__RENDIMIENTO:
				return getRendimiento();
			case OrgcasiPackage.SUCESO__DISPARO:
				return getDisparo();
			case OrgcasiPackage.SUCESO__DISTRIBUCION:
				return getDistribucion();
			case OrgcasiPackage.SUCESO__PRE_CONDICION:
				return getPreCondicion();
			case OrgcasiPackage.SUCESO__POST_CONDICION:
				return getPostCondicion();
			case OrgcasiPackage.SUCESO__ES_COLABORATIVO:
				return isEsColaborativo() ? Boolean.TRUE : Boolean.FALSE;
			case OrgcasiPackage.SUCESO__ACCIONES:
				return getAcciones();
			case OrgcasiPackage.SUCESO__ACTORES:
				return getActores();
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.SUCESO__FLUJOS:
				return getFlujos();
			case OrgcasiPackage.SUCESO__ENTRADAS:
				return getEntradas();
			case OrgcasiPackage.SUCESO__SALIDAS:
				return getSalidas();
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				return getUsadoPorSucesos();
			case OrgcasiPackage.SUCESO__PROCEDIMIENTO:
				if (resolve) return getProcedimiento();
				return basicGetProcedimiento();
			case OrgcasiPackage.SUCESO__SUCESOS:
				return getSucesos();
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
			case OrgcasiPackage.SUCESO__PRIORIDAD:
				setPrioridad((TipoPrioridad)newValue);
				return;
			case OrgcasiPackage.SUCESO__TIPO:
				setTipo((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__RENDIMIENTO:
				setRendimiento((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__DISPARO:
				setDisparo((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__DISTRIBUCION:
				setDistribucion((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__PRE_CONDICION:
				setPreCondicion((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__POST_CONDICION:
				setPostCondicion((String)newValue);
				return;
			case OrgcasiPackage.SUCESO__ES_COLABORATIVO:
				setEsColaborativo(((Boolean)newValue).booleanValue());
				return;
			case OrgcasiPackage.SUCESO__ACCIONES:
				setAcciones((CAccionesSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__ACTORES:
				setActores((CActoresSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatosSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__FLUJOS:
				setFlujos((CFlujosSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__ENTRADAS:
				setEntradas((CEntradasSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__SALIDAS:
				setSalidas((CSalidasSuceso)newValue);
				return;
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				setUsadoPorSucesos((CUsadoPorSucesos)newValue);
				return;
			case OrgcasiPackage.SUCESO__SUCESOS:
				setSucesos((CSucesos)newValue);
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
			case OrgcasiPackage.SUCESO__PRIORIDAD:
				setPrioridad(PRIORIDAD_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__RENDIMIENTO:
				setRendimiento(RENDIMIENTO_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__DISPARO:
				setDisparo(DISPARO_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__DISTRIBUCION:
				setDistribucion(DISTRIBUCION_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__PRE_CONDICION:
				setPreCondicion(PRE_CONDICION_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__POST_CONDICION:
				setPostCondicion(POST_CONDICION_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__ES_COLABORATIVO:
				setEsColaborativo(ES_COLABORATIVO_EDEFAULT);
				return;
			case OrgcasiPackage.SUCESO__ACCIONES:
				setAcciones((CAccionesSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__ACTORES:
				setActores((CActoresSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatosSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__FLUJOS:
				setFlujos((CFlujosSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__ENTRADAS:
				setEntradas((CEntradasSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__SALIDAS:
				setSalidas((CSalidasSuceso)null);
				return;
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				setUsadoPorSucesos((CUsadoPorSucesos)null);
				return;
			case OrgcasiPackage.SUCESO__SUCESOS:
				setSucesos((CSucesos)null);
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
			case OrgcasiPackage.SUCESO__PRIORIDAD:
				return prioridad != PRIORIDAD_EDEFAULT;
			case OrgcasiPackage.SUCESO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case OrgcasiPackage.SUCESO__RENDIMIENTO:
				return RENDIMIENTO_EDEFAULT == null ? rendimiento != null : !RENDIMIENTO_EDEFAULT.equals(rendimiento);
			case OrgcasiPackage.SUCESO__DISPARO:
				return DISPARO_EDEFAULT == null ? disparo != null : !DISPARO_EDEFAULT.equals(disparo);
			case OrgcasiPackage.SUCESO__DISTRIBUCION:
				return DISTRIBUCION_EDEFAULT == null ? distribucion != null : !DISTRIBUCION_EDEFAULT.equals(distribucion);
			case OrgcasiPackage.SUCESO__PRE_CONDICION:
				return PRE_CONDICION_EDEFAULT == null ? preCondicion != null : !PRE_CONDICION_EDEFAULT.equals(preCondicion);
			case OrgcasiPackage.SUCESO__POST_CONDICION:
				return POST_CONDICION_EDEFAULT == null ? postCondicion != null : !POST_CONDICION_EDEFAULT.equals(postCondicion);
			case OrgcasiPackage.SUCESO__ES_COLABORATIVO:
				return esColaborativo != ES_COLABORATIVO_EDEFAULT;
			case OrgcasiPackage.SUCESO__ACCIONES:
				return acciones != null;
			case OrgcasiPackage.SUCESO__ACTORES:
				return actores != null;
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
				return estructurasDatos != null;
			case OrgcasiPackage.SUCESO__FLUJOS:
				return flujos != null;
			case OrgcasiPackage.SUCESO__ENTRADAS:
				return entradas != null;
			case OrgcasiPackage.SUCESO__SALIDAS:
				return salidas != null;
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
				return usadoPorSucesos != null;
			case OrgcasiPackage.SUCESO__PROCEDIMIENTO:
				return basicGetProcedimiento() != null;
			case OrgcasiPackage.SUCESO__SUCESOS:
				return getSucesos() != null;
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
		result.append(" (prioridad: ");
		result.append(prioridad);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", rendimiento: ");
		result.append(rendimiento);
		result.append(", disparo: ");
		result.append(disparo);
		result.append(", distribucion: ");
		result.append(distribucion);
		result.append(", preCondicion: ");
		result.append(preCondicion);
		result.append(", postCondicion: ");
		result.append(postCondicion);
		result.append(", esColaborativo: ");
		result.append(esColaborativo);
		result.append(')');
		return result.toString();
	}

} //SucesoImpl