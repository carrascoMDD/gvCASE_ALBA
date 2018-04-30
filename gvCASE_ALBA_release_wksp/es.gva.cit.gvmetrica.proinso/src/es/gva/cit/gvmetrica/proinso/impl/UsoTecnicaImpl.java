
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Tarea;
import es.gva.cit.gvmetrica.proinso.Tecnica;
import es.gva.cit.gvmetrica.proinso.UsoTecnica;

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
 * An implementation of the model object '<em><b>Uso Tecnica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl#getTarea <em>Tarea</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.UsoTecnicaImpl#getTecnica <em>Tecnica</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsoTecnicaImpl extends ProinsoObjectImpl implements UsoTecnica {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTecnica() <em>Tecnica</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnica()
	 * @generated
	 * @ordered
	 */
	protected Tecnica tecnica = null;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getNombre <em>Nombre</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre
	 * @generated
	 */
	private static OCLExpression nombreDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsoTecnicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.USO_TECNICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
//		if (nombreDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getUsoTecnica().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				nombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("UsoTecnica");
System.out.println("nombre");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(nombreDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("UsoTecnica");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("UsoTecnica");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "UsoTecnica nombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.USO_TECNICA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getTarea() {
		if (eContainerFeatureID != ProinsoPackage.USO_TECNICA__TAREA) return null;
		return (Tarea)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnica getTecnica() {
		if (tecnica != null && tecnica.eIsProxy()) {
			InternalEObject oldTecnica = (InternalEObject)tecnica;
			tecnica = (Tecnica)eResolveProxy(oldTecnica);
			if (tecnica != oldTecnica) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProinsoPackage.USO_TECNICA__TECNICA, oldTecnica, tecnica));
			}
		}
		return tecnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnica basicGetTecnica() {
		return tecnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTecnica(Tecnica newTecnica, NotificationChain msgs) {
		Tecnica oldTecnica = tecnica;
		tecnica = newTecnica;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.USO_TECNICA__TECNICA, oldTecnica, newTecnica);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTecnica(Tecnica newTecnica) {
		if (newTecnica != tecnica) {
			NotificationChain msgs = null;
			if (tecnica != null)
				msgs = ((InternalEObject)tecnica).eInverseRemove(this, ProinsoPackage.TECNICA__USOS_TECNICA, Tecnica.class, msgs);
			if (newTecnica != null)
				msgs = ((InternalEObject)newTecnica).eInverseAdd(this, ProinsoPackage.TECNICA__USOS_TECNICA, Tecnica.class, msgs);
			msgs = basicSetTecnica(newTecnica, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.USO_TECNICA__TECNICA, newTecnica, newTecnica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.USO_TECNICA__TAREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.USO_TECNICA__TAREA, msgs);
			case ProinsoPackage.USO_TECNICA__TECNICA:
				if (tecnica != null)
					msgs = ((InternalEObject)tecnica).eInverseRemove(this, ProinsoPackage.TECNICA__USOS_TECNICA, Tecnica.class, msgs);
				return basicSetTecnica((Tecnica)otherEnd, msgs);
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
			case ProinsoPackage.USO_TECNICA__TAREA:
				return eBasicSetContainer(null, ProinsoPackage.USO_TECNICA__TAREA, msgs);
			case ProinsoPackage.USO_TECNICA__TECNICA:
				return basicSetTecnica(null, msgs);
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
			case ProinsoPackage.USO_TECNICA__TAREA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.TAREA__USO_TECNICAS, Tarea.class, msgs);
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
			case ProinsoPackage.USO_TECNICA__NOMBRE:
				return getNombre();
			case ProinsoPackage.USO_TECNICA__DESCRIPCION:
				return getDescripcion();
			case ProinsoPackage.USO_TECNICA__TAREA:
				return getTarea();
			case ProinsoPackage.USO_TECNICA__TECNICA:
				if (resolve) return getTecnica();
				return basicGetTecnica();
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
			case ProinsoPackage.USO_TECNICA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case ProinsoPackage.USO_TECNICA__TECNICA:
				setTecnica((Tecnica)newValue);
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
			case ProinsoPackage.USO_TECNICA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case ProinsoPackage.USO_TECNICA__TECNICA:
				setTecnica((Tecnica)null);
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
			case ProinsoPackage.USO_TECNICA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? getNombre() != null : !NOMBRE_EDEFAULT.equals(getNombre());
			case ProinsoPackage.USO_TECNICA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ProinsoPackage.USO_TECNICA__TAREA:
				return getTarea() != null;
			case ProinsoPackage.USO_TECNICA__TECNICA:
				return tecnica != null;
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //UsoTecnicaImpl