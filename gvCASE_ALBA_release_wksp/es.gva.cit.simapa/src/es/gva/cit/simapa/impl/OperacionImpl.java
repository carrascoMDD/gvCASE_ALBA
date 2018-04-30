
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.Flujo;
import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.Unidad;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getPlazoEjecucion <em>Plazo Ejecucion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#isEsWorkflow <em>Es Workflow</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getNumeroPagina <em>Numero Pagina</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getNumeroOrden <em>Numero Orden</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getFlujosEntrantes <em>Flujos Entrantes</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getFlujosSalientes <em>Flujos Salientes</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.OperacionImpl#getUnidad <em>Unidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperacionImpl extends SimapaObjectImpl implements Operacion {
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
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

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
	 * The default value of the '{@link #getPlazoEjecucion() <em>Plazo Ejecucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoEjecucion()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAZO_EJECUCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlazoEjecucion() <em>Plazo Ejecucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlazoEjecucion()
	 * @generated
	 * @ordered
	 */
	protected String plazoEjecucion = PLAZO_EJECUCION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsWorkflow() <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsWorkflow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_WORKFLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsWorkflow() <em>Es Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsWorkflow()
	 * @generated
	 * @ordered
	 */
	protected boolean esWorkflow = ES_WORKFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroPagina() <em>Numero Pagina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPagina()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_PAGINA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroPagina() <em>Numero Pagina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPagina()
	 * @generated
	 * @ordered
	 */
	protected Integer numeroPagina = NUMERO_PAGINA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroOrden() <em>Numero Orden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrden()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_ORDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroOrden() <em>Numero Orden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrden()
	 * @generated
	 * @ordered
	 */
	protected Integer numeroOrden = NUMERO_ORDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected EList aplicaciones = null;

	/**
	 * The cached value of the '{@link #getFlujosEntrantes() <em>Flujos Entrantes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujosEntrantes()
	 * @generated
	 * @ordered
	 */
	protected EList flujosEntrantes = null;

	/**
	 * The cached value of the '{@link #getFlujosSalientes() <em>Flujos Salientes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujosSalientes()
	 * @generated
	 * @ordered
	 */
	protected EList flujosSalientes = null;

	/**
	 * The cached value of the '{@link #getUnidad() <em>Unidad</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected EList unidad = null;


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
	protected OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.OPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getOperacion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Operacion");
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
System.out.println("Operacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Operacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Operacion etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__TITULO, oldTitulo, titulo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlazoEjecucion() {
		return plazoEjecucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlazoEjecucion(String newPlazoEjecucion) {
		String oldPlazoEjecucion = plazoEjecucion;
		plazoEjecucion = newPlazoEjecucion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__PLAZO_EJECUCION, oldPlazoEjecucion, plazoEjecucion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsWorkflow() {
		return esWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsWorkflow(boolean newEsWorkflow) {
		boolean oldEsWorkflow = esWorkflow;
		esWorkflow = newEsWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__ES_WORKFLOW, oldEsWorkflow, esWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumeroPagina() {
		return numeroPagina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPagina(Integer newNumeroPagina) {
		Integer oldNumeroPagina = numeroPagina;
		numeroPagina = newNumeroPagina;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__NUMERO_PAGINA, oldNumeroPagina, numeroPagina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumeroOrden() {
		return numeroOrden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOrden(Integer newNumeroOrden) {
		Integer oldNumeroOrden = numeroOrden;
		numeroOrden = newNumeroOrden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.OPERACION__NUMERO_ORDEN, oldNumeroOrden, numeroOrden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operaciones getOperaciones() {
		if (eContainerFeatureID != SimapaPackage.OPERACION__OPERACIONES) return null;
		return (Operaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAplicaciones() {
		if (aplicaciones == null) {
			aplicaciones = new EObjectWithInverseResolvingEList.ManyInverse(Aplicacion.class, this, SimapaPackage.OPERACION__APLICACIONES, SimapaPackage.APLICACION__OPERACIONES);
		}
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujosEntrantes() {
		if (flujosEntrantes == null) {
			flujosEntrantes = new EObjectWithInverseResolvingEList(Flujo.class, this, SimapaPackage.OPERACION__FLUJOS_ENTRANTES, SimapaPackage.FLUJO__DESTINO);
		}
		return flujosEntrantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujosSalientes() {
		if (flujosSalientes == null) {
			flujosSalientes = new EObjectContainmentWithInverseEList(Flujo.class, this, SimapaPackage.OPERACION__FLUJOS_SALIENTES, SimapaPackage.FLUJO__ORIGEN);
		}
		return flujosSalientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnidad() {
		if (unidad == null) {
			unidad = new EObjectWithInverseResolvingEList.ManyInverse(Unidad.class, this, SimapaPackage.OPERACION__UNIDAD, SimapaPackage.UNIDAD__OPERACIONES);
		}
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.OPERACION__OPERACIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.OPERACION__OPERACIONES, msgs);
			case SimapaPackage.OPERACION__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicAdd(otherEnd, msgs);
			case SimapaPackage.OPERACION__FLUJOS_ENTRANTES:
				return ((InternalEList)getFlujosEntrantes()).basicAdd(otherEnd, msgs);
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				return ((InternalEList)getFlujosSalientes()).basicAdd(otherEnd, msgs);
			case SimapaPackage.OPERACION__UNIDAD:
				return ((InternalEList)getUnidad()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.OPERACION__OPERACIONES:
				return eBasicSetContainer(null, SimapaPackage.OPERACION__OPERACIONES, msgs);
			case SimapaPackage.OPERACION__APLICACIONES:
				return ((InternalEList)getAplicaciones()).basicRemove(otherEnd, msgs);
			case SimapaPackage.OPERACION__FLUJOS_ENTRANTES:
				return ((InternalEList)getFlujosEntrantes()).basicRemove(otherEnd, msgs);
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				return ((InternalEList)getFlujosSalientes()).basicRemove(otherEnd, msgs);
			case SimapaPackage.OPERACION__UNIDAD:
				return ((InternalEList)getUnidad()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.OPERACION__OPERACIONES:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.OPERACIONES__OPERACIONES, Operaciones.class, msgs);
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
			case SimapaPackage.OPERACION__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.OPERACION__TITULO:
				return getTitulo();
			case SimapaPackage.OPERACION__DESCRIPCION:
				return getDescripcion();
			case SimapaPackage.OPERACION__PLAZO_EJECUCION:
				return getPlazoEjecucion();
			case SimapaPackage.OPERACION__ES_WORKFLOW:
				return isEsWorkflow() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.OPERACION__NUMERO_PAGINA:
				return getNumeroPagina();
			case SimapaPackage.OPERACION__NUMERO_ORDEN:
				return getNumeroOrden();
			case SimapaPackage.OPERACION__OPERACIONES:
				return getOperaciones();
			case SimapaPackage.OPERACION__APLICACIONES:
				return getAplicaciones();
			case SimapaPackage.OPERACION__FLUJOS_ENTRANTES:
				return getFlujosEntrantes();
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				return getFlujosSalientes();
			case SimapaPackage.OPERACION__UNIDAD:
				return getUnidad();
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
			case SimapaPackage.OPERACION__TITULO:
				setTitulo((String)newValue);
				return;
			case SimapaPackage.OPERACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SimapaPackage.OPERACION__PLAZO_EJECUCION:
				setPlazoEjecucion((String)newValue);
				return;
			case SimapaPackage.OPERACION__ES_WORKFLOW:
				setEsWorkflow(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.OPERACION__NUMERO_PAGINA:
				setNumeroPagina((Integer)newValue);
				return;
			case SimapaPackage.OPERACION__NUMERO_ORDEN:
				setNumeroOrden((Integer)newValue);
				return;
			case SimapaPackage.OPERACION__APLICACIONES:
				getAplicaciones().clear();
				getAplicaciones().addAll((Collection)newValue);
				return;
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				getFlujosSalientes().clear();
				getFlujosSalientes().addAll((Collection)newValue);
				return;
			case SimapaPackage.OPERACION__UNIDAD:
				getUnidad().clear();
				getUnidad().addAll((Collection)newValue);
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
			case SimapaPackage.OPERACION__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__PLAZO_EJECUCION:
				setPlazoEjecucion(PLAZO_EJECUCION_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__ES_WORKFLOW:
				setEsWorkflow(ES_WORKFLOW_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__NUMERO_PAGINA:
				setNumeroPagina(NUMERO_PAGINA_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__NUMERO_ORDEN:
				setNumeroOrden(NUMERO_ORDEN_EDEFAULT);
				return;
			case SimapaPackage.OPERACION__APLICACIONES:
				getAplicaciones().clear();
				return;
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				getFlujosSalientes().clear();
				return;
			case SimapaPackage.OPERACION__UNIDAD:
				getUnidad().clear();
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
			case SimapaPackage.OPERACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.OPERACION__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case SimapaPackage.OPERACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SimapaPackage.OPERACION__PLAZO_EJECUCION:
				return PLAZO_EJECUCION_EDEFAULT == null ? plazoEjecucion != null : !PLAZO_EJECUCION_EDEFAULT.equals(plazoEjecucion);
			case SimapaPackage.OPERACION__ES_WORKFLOW:
				return esWorkflow != ES_WORKFLOW_EDEFAULT;
			case SimapaPackage.OPERACION__NUMERO_PAGINA:
				return NUMERO_PAGINA_EDEFAULT == null ? numeroPagina != null : !NUMERO_PAGINA_EDEFAULT.equals(numeroPagina);
			case SimapaPackage.OPERACION__NUMERO_ORDEN:
				return NUMERO_ORDEN_EDEFAULT == null ? numeroOrden != null : !NUMERO_ORDEN_EDEFAULT.equals(numeroOrden);
			case SimapaPackage.OPERACION__OPERACIONES:
				return getOperaciones() != null;
			case SimapaPackage.OPERACION__APLICACIONES:
				return aplicaciones != null && !aplicaciones.isEmpty();
			case SimapaPackage.OPERACION__FLUJOS_ENTRANTES:
				return flujosEntrantes != null && !flujosEntrantes.isEmpty();
			case SimapaPackage.OPERACION__FLUJOS_SALIENTES:
				return flujosSalientes != null && !flujosSalientes.isEmpty();
			case SimapaPackage.OPERACION__UNIDAD:
				return unidad != null && !unidad.isEmpty();
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
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", plazoEjecucion: ");
		result.append(plazoEjecucion);
		result.append(", esWorkflow: ");
		result.append(esWorkflow);
		result.append(", numeroPagina: ");
		result.append(numeroPagina);
		result.append(", numeroOrden: ");
		result.append(numeroOrden);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl