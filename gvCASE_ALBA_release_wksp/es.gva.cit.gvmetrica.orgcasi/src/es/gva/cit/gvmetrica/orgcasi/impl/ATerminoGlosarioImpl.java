/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario;
import es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.TerminoGlosario;

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

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATermino Glosario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl#getTerminoGlosario <em>Termino Glosario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ATerminoGlosarioImpl#getTerminosGlosario <em>Terminos Glosario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATerminoGlosarioImpl extends AnotacionImpl implements ATerminoGlosario {
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
	 * The cached value of the '{@link #getTerminoGlosario() <em>Termino Glosario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminoGlosario()
	 * @generated
	 * @ordered
	 */
	protected TerminoGlosario terminoGlosario = null;

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
	protected ATerminoGlosarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.ATERMINO_GLOSARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getATerminoGlosario().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ATerminoGlosario");
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
System.out.println("ATerminoGlosario");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ATerminoGlosario");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ATerminoGlosario etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminoGlosario getTerminoGlosario() {
		if (terminoGlosario != null && terminoGlosario.eIsProxy()) {
			InternalEObject oldTerminoGlosario = (InternalEObject)terminoGlosario;
			terminoGlosario = (TerminoGlosario)eResolveProxy(oldTerminoGlosario);
			if (terminoGlosario != oldTerminoGlosario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO, oldTerminoGlosario, terminoGlosario));
			}
		}
		return terminoGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminoGlosario basicGetTerminoGlosario() {
		return terminoGlosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminoGlosario(TerminoGlosario newTerminoGlosario) {
		TerminoGlosario oldTerminoGlosario = terminoGlosario;
		terminoGlosario = newTerminoGlosario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO, oldTerminoGlosario, terminoGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminosGlosario getTerminosGlosario() {
		if (eContainerFeatureID != OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO) return null;
		return (CTerminosGlosario)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminosGlosario(CTerminosGlosario newTerminosGlosario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTerminosGlosario, OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminosGlosario(CTerminosGlosario newTerminosGlosario) {
		if (newTerminosGlosario != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO && newTerminosGlosario != null)) {
			if (EcoreUtil.isAncestor(this, newTerminosGlosario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTerminosGlosario != null)
				msgs = ((InternalEObject)newTerminosGlosario).eInverseAdd(this, OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO, CTerminosGlosario.class, msgs);
			msgs = basicSetTerminosGlosario(newTerminosGlosario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO, newTerminosGlosario, newTerminosGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTerminosGlosario((CTerminosGlosario)otherEnd, msgs);
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				return basicSetTerminosGlosario(null, msgs);
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CTERMINOS_GLOSARIO__TERMINOS_GLOSARIO, CTerminosGlosario.class, msgs);
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO:
				if (resolve) return getTerminoGlosario();
				return basicGetTerminoGlosario();
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				return getTerminosGlosario();
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO:
				setTerminoGlosario((TerminoGlosario)newValue);
				return;
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				setTerminosGlosario((CTerminosGlosario)newValue);
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO:
				setTerminoGlosario((TerminoGlosario)null);
				return;
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				setTerminosGlosario((CTerminosGlosario)null);
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
			case OrgcasiPackage.ATERMINO_GLOSARIO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINO_GLOSARIO:
				return terminoGlosario != null;
			case OrgcasiPackage.ATERMINO_GLOSARIO__TERMINOS_GLOSARIO:
				return getTerminosGlosario() != null;
		}
		return super.eIsSet(featureID);
	}

} //ATerminoGlosarioImpl