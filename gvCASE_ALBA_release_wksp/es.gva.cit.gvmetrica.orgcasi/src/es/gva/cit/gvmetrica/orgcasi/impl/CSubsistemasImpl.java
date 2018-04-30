/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;

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
 * An implementation of the model object '<em><b>CSubsistemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl#getSubsistemas <em>Subsistemas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl#getContenedor <em>Contenedor</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CSubsistemasImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSubsistemasImpl extends OrgcasiCollectionImpl implements CSubsistemas {
	/**
	 * The cached value of the '{@link #getSubsistemas() <em>Subsistemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsistemas()
	 * @generated
	 * @ordered
	 */
	protected EList subsistemas = null;

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
	 * @generated
	 */
	protected CSubsistemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CSUBSISTEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSubsistemas getContenedor() {
		if (eContainerFeatureID != OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR) return null;
		return (ContenedorSubsistemas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenedor(ContenedorSubsistemas newContenedor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenedor, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenedor(ContenedorSubsistemas newContenedor) {
		if (newContenedor != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR && newContenedor != null)) {
			if (EcoreUtil.isAncestor(this, newContenedor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenedor != null)
				msgs = ((InternalEObject)newContenedor).eInverseAdd(this, OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS, ContenedorSubsistemas.class, msgs);
			msgs = basicSetContenedor(newContenedor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR, newContenedor, newContenedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubsistemas() {
		if (subsistemas == null) {
			subsistemas = new EObjectContainmentWithInverseEList(Subsistema.class, this, OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS, OrgcasiPackage.SUBSISTEMA__SUBSISTEMAS);
		}
		return subsistemas;
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
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCSubsistemas().getEAllStructuralFeatures().get(3);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				procedimientoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CSubsistemas");
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
System.out.println("CSubsistemas");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (AProcedimiento) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CSubsistemas");
System.out.println("procedimiento");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CSubsistemas procedimiento", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				return ((InternalEList)getSubsistemas()).basicAdd(otherEnd, msgs);
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenedor((ContenedorSubsistemas)otherEnd, msgs);
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
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				return ((InternalEList)getSubsistemas()).basicRemove(otherEnd, msgs);
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				return basicSetContenedor(null, msgs);
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
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS, ContenedorSubsistemas.class, msgs);
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
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				return getSubsistemas();
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				return getContenedor();
			case OrgcasiPackage.CSUBSISTEMAS__PROCEDIMIENTO:
				if (resolve) return getProcedimiento();
				return basicGetProcedimiento();
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
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				getSubsistemas().clear();
				getSubsistemas().addAll((Collection)newValue);
				return;
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				setContenedor((ContenedorSubsistemas)newValue);
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
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				getSubsistemas().clear();
				return;
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				setContenedor((ContenedorSubsistemas)null);
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
			case OrgcasiPackage.CSUBSISTEMAS__SUBSISTEMAS:
				return subsistemas != null && !subsistemas.isEmpty();
			case OrgcasiPackage.CSUBSISTEMAS__CONTENEDOR:
				return getContenedor() != null;
			case OrgcasiPackage.CSUBSISTEMAS__PROCEDIMIENTO:
				return basicGetProcedimiento() != null;
		}
		return super.eIsSet(featureID);
	}

} //CSubsistemasImpl