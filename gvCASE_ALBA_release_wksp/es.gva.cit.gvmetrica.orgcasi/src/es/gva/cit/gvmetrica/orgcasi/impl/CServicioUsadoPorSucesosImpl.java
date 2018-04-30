
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Servicio;
import es.gva.cit.gvmetrica.orgcasi.UsoServicio;

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
 * An implementation of the model object '<em><b>CServicio Usado Por Sucesos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl#getServicio <em>Servicio</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CServicioUsadoPorSucesosImpl#getUsosServicio <em>Usos Servicio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CServicioUsadoPorSucesosImpl extends OrgcasiCollectionImpl implements CServicioUsadoPorSucesos {
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
	 * The cached value of the '{@link #getUsosServicio() <em>Usos Servicio</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosServicio()
	 * @generated
	 * @ordered
	 */
	protected EList usosServicio = null;


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
	protected CServicioUsadoPorSucesosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSERVICIO_USADO_POR_SUCESOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCServicioUsadoPorSucesos().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CServicioUsadoPorSucesos");
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
System.out.println("CServicioUsadoPorSucesos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CServicioUsadoPorSucesos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CServicioUsadoPorSucesos etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicio getServicio() {
		if (eContainerFeatureID != OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO) return null;
		return (Servicio)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicio(Servicio newServicio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServicio, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicio(Servicio newServicio) {
		if (newServicio != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO && newServicio != null)) {
			if (EcoreUtil.isAncestor(this, newServicio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServicio != null)
				msgs = ((InternalEObject)newServicio).eInverseAdd(this, OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS, Servicio.class, msgs);
			msgs = basicSetServicio(newServicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO, newServicio, newServicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsosServicio() {
		if (usosServicio == null) {
			usosServicio = new EObjectWithInverseResolvingEList(UsoServicio.class, this, OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO, OrgcasiPackage.USO_SERVICIO__SERVICIO);
		}
		return usosServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServicio((Servicio)otherEnd, msgs);
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				return ((InternalEList)getUsosServicio()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				return basicSetServicio(null, msgs);
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				return ((InternalEList)getUsosServicio()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SERVICIO__USADO_POR_SUCESOS, Servicio.class, msgs);
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				return getServicio();
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				return getUsosServicio();
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				setServicio((Servicio)newValue);
				return;
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				getUsosServicio().clear();
				getUsosServicio().addAll((Collection)newValue);
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				setServicio((Servicio)null);
				return;
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				getUsosServicio().clear();
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
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__SERVICIO:
				return getServicio() != null;
			case OrgcasiPackage.CSERVICIO_USADO_POR_SUCESOS__USOS_SERVICIO:
				return usosServicio != null && !usosServicio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CServicioUsadoPorSucesosImpl