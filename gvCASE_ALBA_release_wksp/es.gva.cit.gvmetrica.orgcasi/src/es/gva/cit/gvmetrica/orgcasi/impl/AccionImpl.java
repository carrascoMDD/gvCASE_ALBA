/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AOperacion;
import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.Actor;
import es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEntradasAccion;
import es.gva.cit.gvmetrica.orgcasi.CSalidasAccion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
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
 * An implementation of the model object '<em><b>Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#isEsColaborativa <em>Es Colaborativa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AccionImpl#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccionImpl extends OrgcasiObjectImpl implements Accion {
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
	 * The default value of the '{@link #isEsColaborativa() <em>Es Colaborativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsColaborativa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_COLABORATIVA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsColaborativa() <em>Es Colaborativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsColaborativa()
	 * @generated
	 * @ordered
	 */
	protected boolean esColaborativa = ES_COLABORATIVA_EDEFAULT;

	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiquetaSimple <em>Etiqueta Simple</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaSimple
	 * @generated
	 */
	private static OCLExpression etiquetaSimpleDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones = null;

	/**
	 * The cached value of the '{@link #getActores() <em>Actores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActores()
	 * @generated
	 * @ordered
	 */
	protected EList actores = null;

	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected CEntradasAccion entradas = null;

	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected CSalidasAccion salidas = null;

	/**
	 * The default value of the '{@link #getEtiquetaSimple() <em>Etiqueta Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaSimple()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_SIMPLE_EDEFAULT = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected AccionImpl() {
		super();
		setEntradas( OrgcasiFactory.eINSTANCE.createCEntradasAccion());
		setSalidas( OrgcasiFactory.eINSTANCE.createCSalidasAccion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAccion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Accion");
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
System.out.println("Accion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Accion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Accion etiqueta", anException);
		}
	
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsColaborativa() {
		return esColaborativa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsColaborativa(boolean newEsColaborativa) {
		boolean oldEsColaborativa = esColaborativa;
		esColaborativa = newEsColaborativa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__ES_COLABORATIVA, oldEsColaborativa, esColaborativa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEntradasAccion getEntradas() {
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntradas(CEntradasAccion newEntradas, NotificationChain msgs) {
		CEntradasAccion oldEntradas = entradas;
		entradas = newEntradas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__ENTRADAS, oldEntradas, newEntradas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntradas(CEntradasAccion newEntradas) {
		if (newEntradas != entradas) {
			NotificationChain msgs = null;
			if (entradas != null)
				msgs = ((InternalEObject)entradas).eInverseRemove(this, OrgcasiPackage.CENTRADAS_ACCION__ACCION, CEntradasAccion.class, msgs);
			if (newEntradas != null)
				msgs = ((InternalEObject)newEntradas).eInverseAdd(this, OrgcasiPackage.CENTRADAS_ACCION__ACCION, CEntradasAccion.class, msgs);
			msgs = basicSetEntradas(newEntradas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__ENTRADAS, newEntradas, newEntradas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSalidasAccion getSalidas() {
		return salidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalidas(CSalidasAccion newSalidas, NotificationChain msgs) {
		CSalidasAccion oldSalidas = salidas;
		salidas = newSalidas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__SALIDAS, oldSalidas, newSalidas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalidas(CSalidasAccion newSalidas) {
		if (newSalidas != salidas) {
			NotificationChain msgs = null;
			if (salidas != null)
				msgs = ((InternalEObject)salidas).eInverseRemove(this, OrgcasiPackage.CSALIDAS_ACCION__ACCION, CSalidasAccion.class, msgs);
			if (newSalidas != null)
				msgs = ((InternalEObject)newSalidas).eInverseAdd(this, OrgcasiPackage.CSALIDAS_ACCION__ACCION, CSalidasAccion.class, msgs);
			msgs = basicSetSalidas(newSalidas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__SALIDAS, newSalidas, newSalidas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAccionesSuceso getAcciones() {
		if (eContainerFeatureID != OrgcasiPackage.ACCION__ACCIONES) return null;
		return (CAccionesSuceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcciones(CAccionesSuceso newAcciones, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAcciones, OrgcasiPackage.ACCION__ACCIONES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcciones(CAccionesSuceso newAcciones) {
		if (newAcciones != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ACCION__ACCIONES && newAcciones != null)) {
			if (EcoreUtil.isAncestor(this, newAcciones))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAcciones != null)
				msgs = ((InternalEObject)newAcciones).eInverseAdd(this, OrgcasiPackage.CACCIONES_SUCESO__ACCIONES, CAccionesSuceso.class, msgs);
			msgs = basicSetAcciones(newAcciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ACCION__ACCIONES, newAcciones, newAcciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiquetaSimple() {
//		if (etiquetaSimpleDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAccion().getEAllStructuralFeatures().get(9);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaSimpleDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Accion");
System.out.println("etiquetaSimple");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaSimpleDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Accion");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Accion");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Accion etiquetaSimple", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectWithInverseResolvingEList.ManyInverse(AOperacion.class, this, OrgcasiPackage.ACCION__OPERACIONES, OrgcasiPackage.AOPERACION__ACCIONES_SUCESO);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActores() {
		if (actores == null) {
			actores = new EObjectWithInverseResolvingEList.ManyInverse(Actor.class, this, OrgcasiPackage.ACCION__ACTORES, OrgcasiPackage.ACTOR__ACCIONES);
		}
		return actores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ACCION__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ACCION__ACTORES:
				return ((InternalEList)getActores()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.ACCION__ENTRADAS:
				if (entradas != null)
					msgs = ((InternalEObject)entradas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.ACCION__ENTRADAS, null, msgs);
				return basicSetEntradas((CEntradasAccion)otherEnd, msgs);
			case OrgcasiPackage.ACCION__SALIDAS:
				if (salidas != null)
					msgs = ((InternalEObject)salidas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.ACCION__SALIDAS, null, msgs);
				return basicSetSalidas((CSalidasAccion)otherEnd, msgs);
			case OrgcasiPackage.ACCION__ACCIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAcciones((CAccionesSuceso)otherEnd, msgs);
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
			case OrgcasiPackage.ACCION__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ACCION__ACTORES:
				return ((InternalEList)getActores()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.ACCION__ENTRADAS:
				return basicSetEntradas(null, msgs);
			case OrgcasiPackage.ACCION__SALIDAS:
				return basicSetSalidas(null, msgs);
			case OrgcasiPackage.ACCION__ACCIONES:
				return basicSetAcciones(null, msgs);
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
			case OrgcasiPackage.ACCION__ACCIONES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CACCIONES_SUCESO__ACCIONES, CAccionesSuceso.class, msgs);
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
			case OrgcasiPackage.ACCION__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ACCION__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.ACCION__ES_COLABORATIVA:
				return isEsColaborativa() ? Boolean.TRUE : Boolean.FALSE;
			case OrgcasiPackage.ACCION__OPERACIONES:
				return getOperaciones();
			case OrgcasiPackage.ACCION__ACTORES:
				return getActores();
			case OrgcasiPackage.ACCION__ENTRADAS:
				return getEntradas();
			case OrgcasiPackage.ACCION__SALIDAS:
				return getSalidas();
			case OrgcasiPackage.ACCION__ACCIONES:
				return getAcciones();
			case OrgcasiPackage.ACCION__ETIQUETA_SIMPLE:
				return getEtiquetaSimple();
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
			case OrgcasiPackage.ACCION__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.ACCION__ES_COLABORATIVA:
				setEsColaborativa(((Boolean)newValue).booleanValue());
				return;
			case OrgcasiPackage.ACCION__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ACCION__ACTORES:
				getActores().clear();
				getActores().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.ACCION__ENTRADAS:
				setEntradas((CEntradasAccion)newValue);
				return;
			case OrgcasiPackage.ACCION__SALIDAS:
				setSalidas((CSalidasAccion)newValue);
				return;
			case OrgcasiPackage.ACCION__ACCIONES:
				setAcciones((CAccionesSuceso)newValue);
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
			case OrgcasiPackage.ACCION__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.ACCION__ES_COLABORATIVA:
				setEsColaborativa(ES_COLABORATIVA_EDEFAULT);
				return;
			case OrgcasiPackage.ACCION__OPERACIONES:
				getOperaciones().clear();
				return;
			case OrgcasiPackage.ACCION__ACTORES:
				getActores().clear();
				return;
			case OrgcasiPackage.ACCION__ENTRADAS:
				setEntradas((CEntradasAccion)null);
				return;
			case OrgcasiPackage.ACCION__SALIDAS:
				setSalidas((CSalidasAccion)null);
				return;
			case OrgcasiPackage.ACCION__ACCIONES:
				setAcciones((CAccionesSuceso)null);
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
			case OrgcasiPackage.ACCION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ACCION__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.ACCION__ES_COLABORATIVA:
				return esColaborativa != ES_COLABORATIVA_EDEFAULT;
			case OrgcasiPackage.ACCION__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
			case OrgcasiPackage.ACCION__ACTORES:
				return actores != null && !actores.isEmpty();
			case OrgcasiPackage.ACCION__ENTRADAS:
				return entradas != null;
			case OrgcasiPackage.ACCION__SALIDAS:
				return salidas != null;
			case OrgcasiPackage.ACCION__ACCIONES:
				return getAcciones() != null;
			case OrgcasiPackage.ACCION__ETIQUETA_SIMPLE:
				return ETIQUETA_SIMPLE_EDEFAULT == null ? getEtiquetaSimple() != null : !ETIQUETA_SIMPLE_EDEFAULT.equals(getEtiquetaSimple());
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
		result.append(", esColaborativa: ");
		result.append(esColaborativa);
		result.append(')');
		return result.toString();
	}

} //AccionImpl