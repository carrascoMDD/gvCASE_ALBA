
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.NormativaYLegislacion;
import es.gva.cit.simapa.NormativasYLegislaciones;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;

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
 * An implementation of the model object '<em><b>Normativa YLegislacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.NormativaYLegislacionImpl#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormativaYLegislacionImpl extends SimapaObjectImpl implements NormativaYLegislacion {
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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcedimientos() <em>Procedimientos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected EList procedimientos = null;


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
	protected NormativaYLegislacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.NORMATIVA_YLEGISLACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getNormativaYLegislacion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("NormativaYLegislacion");
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
System.out.println("NormativaYLegislacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("NormativaYLegislacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "NormativaYLegislacion etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.NORMATIVA_YLEGISLACION__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.NORMATIVA_YLEGISLACION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.NORMATIVA_YLEGISLACION__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativasYLegislaciones getNormativas() {
		if (eContainerFeatureID != SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS) return null;
		return (NormativasYLegislaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectWithInverseResolvingEList.ManyInverse(Procedimiento.class, this, SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__NORMATIVAS);
		}
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS, msgs);
			case SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS:
				return eBasicSetContainer(null, SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS, msgs);
			case SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.NORMATIVAS_YLEGISLACIONES__NORMATIVAS, NormativasYLegislaciones.class, msgs);
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.NORMATIVA_YLEGISLACION__NOMBRE:
				return getNombre();
			case SimapaPackage.NORMATIVA_YLEGISLACION__DESCRIPCION:
				return getDescripcion();
			case SimapaPackage.NORMATIVA_YLEGISLACION__CODIGO:
				return getCodigo();
			case SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS:
				return getNormativas();
			case SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS:
				return getProcedimientos();
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimapaPackage.NORMATIVA_YLEGISLACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SimapaPackage.NORMATIVA_YLEGISLACION__CODIGO:
				setCodigo((String)newValue);
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimapaPackage.NORMATIVA_YLEGISLACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SimapaPackage.NORMATIVA_YLEGISLACION__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
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
			case SimapaPackage.NORMATIVA_YLEGISLACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.NORMATIVA_YLEGISLACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimapaPackage.NORMATIVA_YLEGISLACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SimapaPackage.NORMATIVA_YLEGISLACION__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.NORMATIVA_YLEGISLACION__NORMATIVAS:
				return getNormativas() != null;
			case SimapaPackage.NORMATIVA_YLEGISLACION__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(')');
		return result.toString();
	}

} //NormativaYLegislacionImpl