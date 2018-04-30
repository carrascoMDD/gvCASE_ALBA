/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AAplicacion;
import es.gva.cit.gvmetrica.orgcasi.CAplicaciones;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.Aplicacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;
import org.eclipse.emf.ocl.types.util.Types;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AAplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl#getAplicacion <em>Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.AAplicacionImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AAplicacionImpl extends AnotacionImpl implements AAplicacion {
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
	 * The cached value of the '{@link #getAplicacion() <em>Aplicacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicacion()
	 * @generated
	 * @ordered
	 */
	protected Aplicacion aplicacion = null;

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
	protected AAplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AAPLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getAAplicacion().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("AAplicacion");
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
System.out.println("AAplicacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("AAplicacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "AAplicacion etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion getAplicacion() {
		if (aplicacion != null && aplicacion.eIsProxy()) {
			InternalEObject oldAplicacion = (InternalEObject)aplicacion;
			aplicacion = (Aplicacion)eResolveProxy(oldAplicacion);
			if (aplicacion != oldAplicacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AAPLICACION__APLICACION, oldAplicacion, aplicacion));
			}
		}
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion basicGetAplicacion() {
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAplicacion(Aplicacion newAplicacion) {
		Aplicacion oldAplicacion = aplicacion;
		aplicacion = newAplicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AAPLICACION__APLICACION, oldAplicacion, aplicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAplicaciones getAplicaciones() {
		if (eContainerFeatureID != OrgcasiPackage.AAPLICACION__APLICACIONES) return null;
		return (CAplicaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAplicaciones(CAplicaciones newAplicaciones, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAplicaciones, OrgcasiPackage.AAPLICACION__APLICACIONES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAplicaciones(CAplicaciones newAplicaciones) {
		if (newAplicaciones != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.AAPLICACION__APLICACIONES && newAplicaciones != null)) {
			if (EcoreUtil.isAncestor(this, newAplicaciones))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAplicaciones != null)
				msgs = ((InternalEObject)newAplicaciones).eInverseAdd(this, OrgcasiPackage.CAPLICACIONES__APLICACIONES, CAplicaciones.class, msgs);
			msgs = basicSetAplicaciones(newAplicaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AAPLICACION__APLICACIONES, newAplicaciones, newAplicaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAplicaciones((CAplicaciones)otherEnd, msgs);
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
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				return basicSetAplicaciones(null, msgs);
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
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CAPLICACIONES__APLICACIONES, CAplicaciones.class, msgs);
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
			case OrgcasiPackage.AAPLICACION__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.AAPLICACION__APLICACION:
				if (resolve) return getAplicacion();
				return basicGetAplicacion();
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				return getAplicaciones();
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
			case OrgcasiPackage.AAPLICACION__APLICACION:
				setAplicacion((Aplicacion)newValue);
				return;
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				setAplicaciones((CAplicaciones)newValue);
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
			case OrgcasiPackage.AAPLICACION__APLICACION:
				setAplicacion((Aplicacion)null);
				return;
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				setAplicaciones((CAplicaciones)null);
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
			case OrgcasiPackage.AAPLICACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.AAPLICACION__APLICACION:
				return aplicacion != null;
			case OrgcasiPackage.AAPLICACION__APLICACIONES:
				return getAplicaciones() != null;
		}
		return super.eIsSet(featureID);
	}

} //AAplicacionImpl