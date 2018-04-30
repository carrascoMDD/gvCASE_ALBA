/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso;
import es.gva.cit.gvmetrica.orgcasi.EntradaSuceso;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.SalidaSuceso;

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
 * An implementation of the model object '<em><b>Salida Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl#isEsDistribucion <em>Es Distribucion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.SalidaSucesoImpl#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalidaSucesoImpl extends SalidaImpl implements SalidaSuceso {
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
	 * The default value of the '{@link #isEsDistribucion() <em>Es Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsDistribucion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_DISTRIBUCION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsDistribucion() <em>Es Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsDistribucion()
	 * @generated
	 * @ordered
	 */
	protected boolean esDistribucion = ES_DISTRIBUCION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalidaSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.SALIDA_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSalidasSuceso getSalidas() {
		if (eContainerFeatureID != OrgcasiPackage.SALIDA_SUCESO__SALIDAS) return null;
		return (CSalidasSuceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalidas(CSalidasSuceso newSalidas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSalidas, OrgcasiPackage.SALIDA_SUCESO__SALIDAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalidas(CSalidasSuceso newSalidas) {
		if (newSalidas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.SALIDA_SUCESO__SALIDAS && newSalidas != null)) {
			if (EcoreUtil.isAncestor(this, newSalidas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSalidas != null)
				msgs = ((InternalEObject)newSalidas).eInverseAdd(this, OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS, CSalidasSuceso.class, msgs);
			msgs = basicSetSalidas(newSalidas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SALIDA_SUCESO__SALIDAS, newSalidas, newSalidas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiquetaSimple() {
//		if (etiquetaSimpleDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSalidaSuceso().getEAllStructuralFeatures().get(11);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaSimpleDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("SalidaSuceso");
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
System.out.println("SalidaSuceso");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("SalidaSuceso");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "SalidaSuceso etiquetaSimple", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getSalidaSuceso().getEAllStructuralFeatures().get(8);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("SalidaSuceso");
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
System.out.println("SalidaSuceso");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("SalidaSuceso");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "SalidaSuceso etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsDistribucion() {
		return esDistribucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsDistribucion(boolean newEsDistribucion) {
		boolean oldEsDistribucion = esDistribucion;
		esDistribucion = newEsDistribucion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.SALIDA_SUCESO__ES_DISTRIBUCION, oldEsDistribucion, esDistribucion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSalidas((CSalidasSuceso)otherEnd, msgs);
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
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				return basicSetSalidas(null, msgs);
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
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CSALIDAS_SUCESO__SALIDAS, CSalidasSuceso.class, msgs);
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
			case OrgcasiPackage.SALIDA_SUCESO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.SALIDA_SUCESO__ES_DISTRIBUCION:
				return isEsDistribucion() ? Boolean.TRUE : Boolean.FALSE;
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				return getSalidas();
			case OrgcasiPackage.SALIDA_SUCESO__ETIQUETA_SIMPLE:
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
			case OrgcasiPackage.SALIDA_SUCESO__ES_DISTRIBUCION:
				setEsDistribucion(((Boolean)newValue).booleanValue());
				return;
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				setSalidas((CSalidasSuceso)newValue);
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
			case OrgcasiPackage.SALIDA_SUCESO__ES_DISTRIBUCION:
				setEsDistribucion(ES_DISTRIBUCION_EDEFAULT);
				return;
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				setSalidas((CSalidasSuceso)null);
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
			case OrgcasiPackage.SALIDA_SUCESO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.SALIDA_SUCESO__ES_DISTRIBUCION:
				return esDistribucion != ES_DISTRIBUCION_EDEFAULT;
			case OrgcasiPackage.SALIDA_SUCESO__SALIDAS:
				return getSalidas() != null;
			case OrgcasiPackage.SALIDA_SUCESO__ETIQUETA_SIMPLE:
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
		result.append(" (esDistribucion: ");
		result.append(esDistribucion);
		result.append(')');
		return result.toString();
	}

} //SalidaSucesoImpl