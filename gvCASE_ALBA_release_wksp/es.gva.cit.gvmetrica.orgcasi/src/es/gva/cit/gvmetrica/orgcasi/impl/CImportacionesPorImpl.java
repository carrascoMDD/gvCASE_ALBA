
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CImportacionesPor;
import es.gva.cit.gvmetrica.orgcasi.ImportacionServicios;
import es.gva.cit.gvmetrica.orgcasi.LibreriaServicios;
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
 * An implementation of the model object '<em><b>CImportaciones Por</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.CImportacionesPorImpl#getImportadoPor <em>Importado Por</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImportacionesPorImpl extends OrgcasiCollectionImpl implements CImportacionesPor {
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
	 * The cached value of the '{@link #getImportadoPor() <em>Importado Por</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportadoPor()
	 * @generated
	 * @ordered
	 */
	protected EList importadoPor = null;


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
	protected CImportacionesPorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.CIMPORTACIONES_POR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getCImportacionesPor().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("CImportacionesPor");
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
System.out.println("CImportacionesPor");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("CImportacionesPor");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "CImportacionesPor etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibreriaServicios getLibreriaServicios() {
		if (eContainerFeatureID != OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS) return null;
		return (LibreriaServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreriaServicios(LibreriaServicios newLibreriaServicios, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibreriaServicios, OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreriaServicios(LibreriaServicios newLibreriaServicios) {
		if (newLibreriaServicios != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS && newLibreriaServicios != null)) {
			if (EcoreUtil.isAncestor(this, newLibreriaServicios))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibreriaServicios != null)
				msgs = ((InternalEObject)newLibreriaServicios).eInverseAdd(this, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR, LibreriaServicios.class, msgs);
			msgs = basicSetLibreriaServicios(newLibreriaServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS, newLibreriaServicios, newLibreriaServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImportadoPor() {
		if (importadoPor == null) {
			importadoPor = new EObjectWithInverseResolvingEList(ImportacionServicios.class, this, OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR, OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS);
		}
		return importadoPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibreriaServicios((LibreriaServicios)otherEnd, msgs);
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				return ((InternalEList)getImportadoPor()).basicAdd(otherEnd, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				return basicSetLibreriaServicios(null, msgs);
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				return ((InternalEList)getImportadoPor()).basicRemove(otherEnd, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR, LibreriaServicios.class, msgs);
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
			case OrgcasiPackage.CIMPORTACIONES_POR__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				return getLibreriaServicios();
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				return getImportadoPor();
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
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				setLibreriaServicios((LibreriaServicios)newValue);
				return;
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				getImportadoPor().clear();
				getImportadoPor().addAll((Collection)newValue);
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
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				setLibreriaServicios((LibreriaServicios)null);
				return;
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				getImportadoPor().clear();
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
			case OrgcasiPackage.CIMPORTACIONES_POR__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS:
				return getLibreriaServicios() != null;
			case OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR:
				return importadoPor != null && !importadoPor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CImportacionesPorImpl