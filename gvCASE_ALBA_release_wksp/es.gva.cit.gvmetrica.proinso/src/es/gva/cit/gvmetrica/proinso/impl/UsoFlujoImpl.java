
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Tarea;
import es.gva.cit.gvmetrica.proinso.Usable;
import es.gva.cit.gvmetrica.proinso.UsoFlujo;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uso Flujo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoFlujoImpl#getTarea <em>Tarea</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UsoFlujoImpl extends ProinsoObjectImpl implements UsoFlujo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

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
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected Usable producto = null;


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
	protected UsoFlujoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.USO_FLUJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getUsoFlujo().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("UsoFlujo");
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
System.out.println("UsoFlujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("UsoFlujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "UsoFlujo etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usable getProducto() {
		if (producto != null && producto.eIsProxy()) {
			InternalEObject oldProducto = (InternalEObject)producto;
			producto = (Usable)eResolveProxy(oldProducto);
			if (producto != oldProducto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProinsoPackage.USO_FLUJO__PRODUCTO, oldProducto, producto));
			}
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usable basicGetProducto() {
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducto(Usable newProducto, NotificationChain msgs) {
		Usable oldProducto = producto;
		producto = newProducto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.USO_FLUJO__PRODUCTO, oldProducto, newProducto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducto(Usable newProducto) {
		if (newProducto != producto) {
			NotificationChain msgs = null;
			if (producto != null)
				msgs = ((InternalEObject)producto).eInverseRemove(this, ProinsoPackage.USABLE__USOS, Usable.class, msgs);
			if (newProducto != null)
				msgs = ((InternalEObject)newProducto).eInverseAdd(this, ProinsoPackage.USABLE__USOS, Usable.class, msgs);
			msgs = basicSetProducto(newProducto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.USO_FLUJO__PRODUCTO, newProducto, newProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getTarea() {
		if (eContainerFeatureID != ProinsoPackage.USO_FLUJO__TAREA) return null;
		return (Tarea)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				if (producto != null)
					msgs = ((InternalEObject)producto).eInverseRemove(this, ProinsoPackage.USABLE__USOS, Usable.class, msgs);
				return basicSetProducto((Usable)otherEnd, msgs);
			case ProinsoPackage.USO_FLUJO__TAREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.USO_FLUJO__TAREA, msgs);
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
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				return basicSetProducto(null, msgs);
			case ProinsoPackage.USO_FLUJO__TAREA:
				return eBasicSetContainer(null, ProinsoPackage.USO_FLUJO__TAREA, msgs);
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
			case ProinsoPackage.USO_FLUJO__TAREA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.TAREA__FLUJOS, Tarea.class, msgs);
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
			case ProinsoPackage.USO_FLUJO__ETIQUETA:
				return getEtiqueta();
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				if (resolve) return getProducto();
				return basicGetProducto();
			case ProinsoPackage.USO_FLUJO__TAREA:
				return getTarea();
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
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				setProducto((Usable)newValue);
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
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				setProducto((Usable)null);
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
			case ProinsoPackage.USO_FLUJO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case ProinsoPackage.USO_FLUJO__PRODUCTO:
				return producto != null;
			case ProinsoPackage.USO_FLUJO__TAREA:
				return getTarea() != null;
		}
		return super.eIsSet(featureID);
	}

} //UsoFlujoImpl