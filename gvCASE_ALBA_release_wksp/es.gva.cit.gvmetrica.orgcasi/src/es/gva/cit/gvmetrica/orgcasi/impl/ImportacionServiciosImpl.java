
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.CImportacionesPor;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.ImportacionServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Importacion Servicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ImportacionServiciosImpl#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportacionServiciosImpl extends OrgcasiObjectImpl implements ImportacionServicios {
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
	 * The cached value of the '{@link #getLibreriaServicios() <em>Libreria Servicios</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreriaServicios()
	 * @generated
	 * @ordered
	 */
	protected CImportacionesPor libreriaServicios = null;


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
	protected ImportacionServiciosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.IMPORTACION_SERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getImportacionServicios().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ImportacionServicios");
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
System.out.println("ImportacionServicios");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ImportacionServicios");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ImportacionServicios etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesServicios getImportacionesServicios() {
		if (eContainerFeatureID != OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS) return null;
		return (CImportacionesServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportacionesServicios(CImportacionesServicios newImportacionesServicios, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportacionesServicios, OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportacionesServicios(CImportacionesServicios newImportacionesServicios) {
		if (newImportacionesServicios != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS && newImportacionesServicios != null)) {
			if (EcoreUtil.isAncestor(this, newImportacionesServicios))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportacionesServicios != null)
				msgs = ((InternalEObject)newImportacionesServicios).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS, CImportacionesServicios.class, msgs);
			msgs = basicSetImportacionesServicios(newImportacionesServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS, newImportacionesServicios, newImportacionesServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesPor getLibreriaServicios() {
		if (libreriaServicios != null && libreriaServicios.eIsProxy()) {
			InternalEObject oldLibreriaServicios = (InternalEObject)libreriaServicios;
			libreriaServicios = (CImportacionesPor)eResolveProxy(oldLibreriaServicios);
			if (libreriaServicios != oldLibreriaServicios) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS, oldLibreriaServicios, libreriaServicios));
			}
		}
		return libreriaServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesPor basicGetLibreriaServicios() {
		return libreriaServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreriaServicios(CImportacionesPor newLibreriaServicios, NotificationChain msgs) {
		CImportacionesPor oldLibreriaServicios = libreriaServicios;
		libreriaServicios = newLibreriaServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS, oldLibreriaServicios, newLibreriaServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreriaServicios(CImportacionesPor newLibreriaServicios) {
		if (newLibreriaServicios != libreriaServicios) {
			NotificationChain msgs = null;
			if (libreriaServicios != null)
				msgs = ((InternalEObject)libreriaServicios).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR, CImportacionesPor.class, msgs);
			if (newLibreriaServicios != null)
				msgs = ((InternalEObject)newLibreriaServicios).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR, CImportacionesPor.class, msgs);
			msgs = basicSetLibreriaServicios(newLibreriaServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS, newLibreriaServicios, newLibreriaServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportacionesServicios((CImportacionesServicios)otherEnd, msgs);
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				if (libreriaServicios != null)
					msgs = ((InternalEObject)libreriaServicios).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_POR__IMPORTADO_POR, CImportacionesPor.class, msgs);
				return basicSetLibreriaServicios((CImportacionesPor)otherEnd, msgs);
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return basicSetImportacionesServicios(null, msgs);
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				return basicSetLibreriaServicios(null, msgs);
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTACIONES_SERVICIOS, CImportacionesServicios.class, msgs);
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return getImportacionesServicios();
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				if (resolve) return getLibreriaServicios();
				return basicGetLibreriaServicios();
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)newValue);
				return;
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				setLibreriaServicios((CImportacionesPor)newValue);
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)null);
				return;
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				setLibreriaServicios((CImportacionesPor)null);
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
			case OrgcasiPackage.IMPORTACION_SERVICIOS__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.IMPORTACION_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return getImportacionesServicios() != null;
			case OrgcasiPackage.IMPORTACION_SERVICIOS__LIBRERIA_SERVICIOS:
				return libreriaServicios != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportacionServiciosImpl