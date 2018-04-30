/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AOperacion;
import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.COperaciones;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.Operacion;

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
 * An implementation of the model object '<em><b>AOperacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl#getOperacion <em>Operacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl#getAccionesSuceso <em>Acciones Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AOperacionImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AOperacionImpl extends AnotacionImpl implements AOperacion {
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
	 * The cached value of the '{@link #getOperacion() <em>Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperacion()
	 * @generated
	 * @ordered
	 */
	protected Operacion operacion = null;

	/**
	 * The cached value of the '{@link #getAccionesSuceso() <em>Acciones Suceso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccionesSuceso()
	 * @generated
	 * @ordered
	 */
	protected EList accionesSuceso = null;

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
	protected AOperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AOPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAOperacion().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AOperacion");
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
System.out.println("AOperacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AOperacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AOperacion etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getOperacion() {
		if (operacion != null && operacion.eIsProxy()) {
			InternalEObject oldOperacion = (InternalEObject)operacion;
			operacion = (Operacion)eResolveProxy(oldOperacion);
			if (operacion != oldOperacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AOPERACION__OPERACION, oldOperacion, operacion));
			}
		}
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion basicGetOperacion() {
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperacion(Operacion newOperacion) {
		Operacion oldOperacion = operacion;
		operacion = newOperacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AOPERACION__OPERACION, oldOperacion, operacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COperaciones getOperaciones() {
		if (eContainerFeatureID != OrgcasiPackage.AOPERACION__OPERACIONES) return null;
		return (COperaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperaciones(COperaciones newOperaciones, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperaciones, OrgcasiPackage.AOPERACION__OPERACIONES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperaciones(COperaciones newOperaciones) {
		if (newOperaciones != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AOPERACION__OPERACIONES && newOperaciones != null)) {
			if (EcoreUtil.isAncestor(this, newOperaciones))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperaciones != null)
				msgs = ((InternalEObject)newOperaciones).eInverseAdd(this, OrgcasiPackage.COPERACIONES__OPERACIONES, COperaciones.class, msgs);
			msgs = basicSetOperaciones(newOperaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AOPERACION__OPERACIONES, newOperaciones, newOperaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAccionesSuceso() {
		if (accionesSuceso == null) {
			accionesSuceso = new EObjectWithInverseResolvingEList.ManyInverse(Accion.class, this, OrgcasiPackage.AOPERACION__ACCIONES_SUCESO, OrgcasiPackage.ACCION__OPERACIONES);
		}
		return accionesSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AOPERACION__ACCIONES_SUCESO:
				return ((InternalEList)getAccionesSuceso()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperaciones((COperaciones)otherEnd, msgs);
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
			case OrgcasiPackage.AOPERACION__ACCIONES_SUCESO:
				return ((InternalEList)getAccionesSuceso()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				return basicSetOperaciones(null, msgs);
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
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.COPERACIONES__OPERACIONES, COperaciones.class, msgs);
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
			case OrgcasiPackage.AOPERACION__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.AOPERACION__OPERACION:
				if (resolve) return getOperacion();
				return basicGetOperacion();
			case OrgcasiPackage.AOPERACION__ACCIONES_SUCESO:
				return getAccionesSuceso();
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				return getOperaciones();
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
			case OrgcasiPackage.AOPERACION__OPERACION:
				setOperacion((Operacion)newValue);
				return;
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				setOperaciones((COperaciones)newValue);
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
			case OrgcasiPackage.AOPERACION__OPERACION:
				setOperacion((Operacion)null);
				return;
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				setOperaciones((COperaciones)null);
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
			case OrgcasiPackage.AOPERACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.AOPERACION__OPERACION:
				return operacion != null;
			case OrgcasiPackage.AOPERACION__ACCIONES_SUCESO:
				return accionesSuceso != null && !accionesSuceso.isEmpty();
			case OrgcasiPackage.AOPERACION__OPERACIONES:
				return getOperaciones() != null;
		}
		return super.eIsSet(featureID);
	}

} //AOperacionImpl