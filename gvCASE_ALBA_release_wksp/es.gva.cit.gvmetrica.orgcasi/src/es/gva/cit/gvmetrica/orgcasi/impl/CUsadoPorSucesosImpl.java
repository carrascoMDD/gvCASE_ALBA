
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
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
 * An implementation of the model object '<em><b>CUsado Por Sucesos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl#getSuceso <em>Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSucesosImpl#getUsosSuceso <em>Usos Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUsadoPorSucesosImpl extends OrgcasiCollectionImpl implements CUsadoPorSucesos {
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
	 * The cached value of the '{@link #getUsosSuceso() <em>Usos Suceso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosSuceso()
	 * @generated
	 * @ordered
	 */
	protected EList usosSuceso = null;


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
	protected CUsadoPorSucesosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CUSADO_POR_SUCESOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCUsadoPorSucesos().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CUsadoPorSucesos");
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
System.out.println("CUsadoPorSucesos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CUsadoPorSucesos");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CUsadoPorSucesos etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suceso getSuceso() {
		if (eContainerFeatureID != OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO) return null;
		return (Suceso)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuceso(Suceso newSuceso, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuceso, OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuceso(Suceso newSuceso) {
		if (newSuceso != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO && newSuceso != null)) {
			if (EcoreUtil.isAncestor(this, newSuceso))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuceso != null)
				msgs = ((InternalEObject)newSuceso).eInverseAdd(this, OrgcasiPackage.SUCESO__USADO_POR_SUCESOS, Suceso.class, msgs);
			msgs = basicSetSuceso(newSuceso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO, newSuceso, newSuceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsosSuceso() {
		if (usosSuceso == null) {
			usosSuceso = new EObjectWithInverseResolvingEList(UsoSuceso.class, this, OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO, OrgcasiPackage.USO_SUCESO__SUCESO_USADO);
		}
		return usosSuceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuceso((Suceso)otherEnd, msgs);
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				return ((InternalEList)getUsosSuceso()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				return basicSetSuceso(null, msgs);
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				return ((InternalEList)getUsosSuceso()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUCESO__USADO_POR_SUCESOS, Suceso.class, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				return getSuceso();
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				return getUsosSuceso();
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				setSuceso((Suceso)newValue);
				return;
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				getUsosSuceso().clear();
				getUsosSuceso().addAll((Collection)newValue);
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				setSuceso((Suceso)null);
				return;
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				getUsosSuceso().clear();
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
			case OrgcasiPackage.CUSADO_POR_SUCESOS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.CUSADO_POR_SUCESOS__SUCESO:
				return getSuceso() != null;
			case OrgcasiPackage.CUSADO_POR_SUCESOS__USOS_SUCESO:
				return usosSuceso != null && !usosSuceso.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CUsadoPorSucesosImpl