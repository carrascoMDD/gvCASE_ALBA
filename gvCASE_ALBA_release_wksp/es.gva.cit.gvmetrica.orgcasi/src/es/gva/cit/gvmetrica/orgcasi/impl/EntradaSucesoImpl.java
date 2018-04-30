/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso;
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
 * An implementation of the model object '<em><b>Entrada Suceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl#isEsInformacionPrevia <em>Es Informacion Previa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.EntradaSucesoImpl#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntradaSucesoImpl extends EntradaImpl implements EntradaSuceso {
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
	 * The default value of the '{@link #isEsInformacionPrevia() <em>Es Informacion Previa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsInformacionPrevia()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_INFORMACION_PREVIA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEsInformacionPrevia() <em>Es Informacion Previa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsInformacionPrevia()
	 * @generated
	 * @ordered
	 */
	protected boolean esInformacionPrevia = ES_INFORMACION_PREVIA_EDEFAULT;

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
	protected EntradaSucesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ENTRADA_SUCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getEntradaSuceso().getEAllStructuralFeatures().get(8);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("EntradaSuceso");
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
System.out.println("EntradaSuceso");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("EntradaSuceso");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "EntradaSuceso etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsInformacionPrevia() {
		return esInformacionPrevia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsInformacionPrevia(boolean newEsInformacionPrevia) {
		boolean oldEsInformacionPrevia = esInformacionPrevia;
		esInformacionPrevia = newEsInformacionPrevia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_SUCESO__ES_INFORMACION_PREVIA, oldEsInformacionPrevia, esInformacionPrevia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEntradasSuceso getEntradas() {
		if (eContainerFeatureID != OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS) return null;
		return (CEntradasSuceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntradas(CEntradasSuceso newEntradas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntradas, OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntradas(CEntradasSuceso newEntradas) {
		if (newEntradas != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS && newEntradas != null)) {
			if (EcoreUtil.isAncestor(this, newEntradas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntradas != null)
				msgs = ((InternalEObject)newEntradas).eInverseAdd(this, OrgcasiPackage.CENTRADAS_SUCESO__ENTRADAS, CEntradasSuceso.class, msgs);
			msgs = basicSetEntradas(newEntradas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS, newEntradas, newEntradas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiquetaSimple() {
//		if (etiquetaSimpleDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getEntradaSuceso().getEAllStructuralFeatures().get(11);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaSimpleDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("EntradaSuceso");
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
System.out.println("EntradaSuceso");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("EntradaSuceso");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "EntradaSuceso etiquetaSimple", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntradas((CEntradasSuceso)otherEnd, msgs);
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
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				return basicSetEntradas(null, msgs);
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
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CENTRADAS_SUCESO__ENTRADAS, CEntradasSuceso.class, msgs);
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
			case OrgcasiPackage.ENTRADA_SUCESO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ENTRADA_SUCESO__ES_INFORMACION_PREVIA:
				return isEsInformacionPrevia() ? Boolean.TRUE : Boolean.FALSE;
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				return getEntradas();
			case OrgcasiPackage.ENTRADA_SUCESO__ETIQUETA_SIMPLE:
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
			case OrgcasiPackage.ENTRADA_SUCESO__ES_INFORMACION_PREVIA:
				setEsInformacionPrevia(((Boolean)newValue).booleanValue());
				return;
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				setEntradas((CEntradasSuceso)newValue);
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
			case OrgcasiPackage.ENTRADA_SUCESO__ES_INFORMACION_PREVIA:
				setEsInformacionPrevia(ES_INFORMACION_PREVIA_EDEFAULT);
				return;
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				setEntradas((CEntradasSuceso)null);
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
			case OrgcasiPackage.ENTRADA_SUCESO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ENTRADA_SUCESO__ES_INFORMACION_PREVIA:
				return esInformacionPrevia != ES_INFORMACION_PREVIA_EDEFAULT;
			case OrgcasiPackage.ENTRADA_SUCESO__ENTRADAS:
				return getEntradas() != null;
			case OrgcasiPackage.ENTRADA_SUCESO__ETIQUETA_SIMPLE:
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
		result.append(" (esInformacionPrevia: ");
		result.append(esInformacionPrevia);
		result.append(')');
		return result.toString();
	}

} //EntradaSucesoImpl