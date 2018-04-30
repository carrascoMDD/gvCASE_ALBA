
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CUsadoPorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;
import es.gva.cit.gvmetrica.orgcasi.UsoSubsistema;

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
 * An implementation of the model object '<em><b>CUsado Por Subsistemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl#getUsadoPorSubsistemas <em>Usado Por Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CUsadoPorSubsistemasImpl#getSubsistema <em>Subsistema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUsadoPorSubsistemasImpl extends OrgcasiCollectionImpl implements CUsadoPorSubsistemas {
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
	 * The cached value of the '{@link #getUsadoPorSubsistemas() <em>Usado Por Subsistemas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsadoPorSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected EList usadoPorSubsistemas = null;


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
	protected CUsadoPorSubsistemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CUSADO_POR_SUBSISTEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCUsadoPorSubsistemas().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CUsadoPorSubsistemas");
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
System.out.println("CUsadoPorSubsistemas");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CUsadoPorSubsistemas");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CUsadoPorSubsistemas etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsadoPorSubsistemas() {
		if (usadoPorSubsistemas == null) {
			usadoPorSubsistemas = new EObjectWithInverseResolvingEList(UsoSubsistema.class, this, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS, OrgcasiPackage.USO_SUBSISTEMA__SUBSISTEMA_USADO);
		}
		return usadoPorSubsistemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsistema getSubsistema() {
		if (eContainerFeatureID != OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA) return null;
		return (Subsistema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsistema(Subsistema newSubsistema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubsistema, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsistema(Subsistema newSubsistema) {
		if (newSubsistema != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA && newSubsistema != null)) {
			if (EcoreUtil.isAncestor(this, newSubsistema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubsistema != null)
				msgs = ((InternalEObject)newSubsistema).eInverseAdd(this, OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS, Subsistema.class, msgs);
			msgs = basicSetSubsistema(newSubsistema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA, newSubsistema, newSubsistema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				return ((InternalEList)getUsadoPorSubsistemas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubsistema((Subsistema)otherEnd, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				return ((InternalEList)getUsadoPorSubsistemas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				return basicSetSubsistema(null, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS, Subsistema.class, msgs);
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				return getUsadoPorSubsistemas();
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				return getSubsistema();
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				getUsadoPorSubsistemas().clear();
				getUsadoPorSubsistemas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				setSubsistema((Subsistema)newValue);
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				getUsadoPorSubsistemas().clear();
				return;
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				setSubsistema((Subsistema)null);
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
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__USADO_POR_SUBSISTEMAS:
				return usadoPorSubsistemas != null && !usadoPorSubsistemas.isEmpty();
			case OrgcasiPackage.CUSADO_POR_SUBSISTEMAS__SUBSISTEMA:
				return getSubsistema() != null;
		}
		return super.eIsSet(featureID);
	}

} //CUsadoPorSubsistemasImpl