
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;
import es.gva.cit.gvmetrica.proinso.Seccion;
import es.gva.cit.gvmetrica.proinso.Usable;
import es.gva.cit.gvmetrica.proinso.UsoFlujo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * An implementation of the model object '<em><b>Usable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl#getContenido <em>Contenido</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsableImpl#getUsos <em>Usos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UsableImpl extends ProinsoObjectImpl implements Usable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached value of the '{@link #getDocumentacion() <em>Documentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected Documentacion documentacion = null;

	/**
	 * The cached value of the '{@link #getReferencias() <em>Referencias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencias()
	 * @generated
	 * @ordered
	 */
	protected EList referencias = null;

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
	 * The cached value of the '{@link #getContenido() <em>Contenido</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected EList contenido = null;

	/**
	 * The cached value of the '{@link #getUsos() <em>Usos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsos()
	 * @generated
	 * @ordered
	 */
	protected EList usos = null;


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
	protected UsableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.USABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentacion getDocumentacion() {
		return documentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentacion(Documentacion newDocumentacion, NotificationChain msgs) {
		Documentacion oldDocumentacion = documentacion;
		documentacion = newDocumentacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.USABLE__DOCUMENTACION, oldDocumentacion, newDocumentacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentacion(Documentacion newDocumentacion) {
		if (newDocumentacion != documentacion) {
			NotificationChain msgs = null;
			if (documentacion != null)
				msgs = ((InternalEObject)documentacion).eInverseRemove(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			if (newDocumentacion != null)
				msgs = ((InternalEObject)newDocumentacion).eInverseAdd(this, ProinsoPackage.DOCUMENTACION__DOCUMENTADO, Documentacion.class, msgs);
			msgs = basicSetDocumentacion(newDocumentacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.USABLE__DOCUMENTACION, newDocumentacion, newDocumentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.USABLE__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
		}
		return referencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getUsable().getEAllStructuralFeatures().get(3);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Usable");
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
System.out.println("Usable");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Usable");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Usable etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContenido() {
		if (contenido == null) {
			contenido = new EObjectContainmentWithInverseEList(Seccion.class, this, ProinsoPackage.USABLE__CONTENIDO, ProinsoPackage.SECCION__CONTENEDOR);
		}
		return contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsos() {
		if (usos == null) {
			usos = new EObjectWithInverseResolvingEList(UsoFlujo.class, this, ProinsoPackage.USABLE__USOS, ProinsoPackage.USO_FLUJO__PRODUCTO);
		}
		return usos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.USABLE__DOCUMENTACION:
				if (documentacion != null)
					msgs = ((InternalEObject)documentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.USABLE__DOCUMENTACION, null, msgs);
				return basicSetDocumentacion((Documentacion)otherEnd, msgs);
			case ProinsoPackage.USABLE__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.USABLE__CONTENIDO:
				return ((InternalEList)getContenido()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.USABLE__USOS:
				return ((InternalEList)getUsos()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.USABLE__DOCUMENTACION:
				return basicSetDocumentacion(null, msgs);
			case ProinsoPackage.USABLE__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.USABLE__CONTENIDO:
				return ((InternalEList)getContenido()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.USABLE__USOS:
				return ((InternalEList)getUsos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProinsoPackage.USABLE__DOCUMENTACION:
				return getDocumentacion();
			case ProinsoPackage.USABLE__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.USABLE__ETIQUETA:
				return getEtiqueta();
			case ProinsoPackage.USABLE__CONTENIDO:
				return getContenido();
			case ProinsoPackage.USABLE__USOS:
				return getUsos();
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
			case ProinsoPackage.USABLE__DOCUMENTACION:
				setDocumentacion((Documentacion)newValue);
				return;
			case ProinsoPackage.USABLE__CONTENIDO:
				getContenido().clear();
				getContenido().addAll((Collection)newValue);
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
			case ProinsoPackage.USABLE__DOCUMENTACION:
				setDocumentacion((Documentacion)null);
				return;
			case ProinsoPackage.USABLE__CONTENIDO:
				getContenido().clear();
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
			case ProinsoPackage.USABLE__DOCUMENTACION:
				return documentacion != null;
			case ProinsoPackage.USABLE__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.USABLE__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case ProinsoPackage.USABLE__CONTENIDO:
				return contenido != null && !contenido.isEmpty();
			case ProinsoPackage.USABLE__USOS:
				return usos != null && !usos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ConDocumentacion.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.USABLE__DOCUMENTACION: return ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.USABLE__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ConDocumentacion.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION: return ProinsoPackage.USABLE__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.USABLE__REFERENCIAS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UsableImpl