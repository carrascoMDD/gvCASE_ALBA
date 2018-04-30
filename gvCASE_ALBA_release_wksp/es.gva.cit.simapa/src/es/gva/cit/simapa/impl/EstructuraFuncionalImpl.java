
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ContenedorEstructuraFuncional;
import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.UnidadOrganica;

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
 * An implementation of the model object '<em><b>Estructura Funcional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getDescomposicion <em>Descomposicion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getDescompone <em>Descompone</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getUnidadesOrganicas <em>Unidades Organicas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.EstructuraFuncionalImpl#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstructuraFuncionalImpl extends SimapaObjectImpl implements EstructuraFuncional {
	/**
	 * The cached value of the '{@link #getDescomposicion() <em>Descomposicion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescomposicion()
	 * @generated
	 * @ordered
	 */
	protected EList descomposicion = null;

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
	 * The cached value of the '{@link #getUnidadesOrganicas() <em>Unidades Organicas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadesOrganicas()
	 * @generated
	 * @ordered
	 */
	protected EList unidadesOrganicas = null;

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
	protected EstructuraFuncionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDescomposicion() {
		if (descomposicion == null) {
			descomposicion = new EObjectContainmentWithInverseEList(EstructuraFuncional.class, this, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE);
		}
		return descomposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getEstructuraFuncional().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("EstructuraFuncional");
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
System.out.println("EstructuraFuncional");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("EstructuraFuncional");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "EstructuraFuncional etiqueta", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEstructuraFuncional getDescompone() {
		if (eContainerFeatureID != SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE) return null;
		return (ContenedorEstructuraFuncional)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUnidadesOrganicas() {
		if (unidadesOrganicas == null) {
			unidadesOrganicas = new EObjectWithInverseResolvingEList.ManyInverse(UnidadOrganica.class, this, SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS, SimapaPackage.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES);
		}
		return unidadesOrganicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectWithInverseResolvingEList(Procedimiento.class, this, SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__SERVICIO);
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicAdd(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				return ((InternalEList)getUnidadesOrganicas()).basicAdd(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS:
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				return ((InternalEList)getDescomposicion()).basicRemove(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE:
				return eBasicSetContainer(null, SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				return ((InternalEList)getUnidadesOrganicas()).basicRemove(otherEnd, msgs);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS:
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION, ContenedorEstructuraFuncional.class, msgs);
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				return getDescomposicion();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE:
				return getNombre();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO:
				return getCodigo();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION:
				return getDescripcion();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE:
				return getDescompone();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				return getUnidadesOrganicas();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS:
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				getDescomposicion().clear();
				getDescomposicion().addAll((Collection)newValue);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO:
				setCodigo((String)newValue);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				getUnidadesOrganicas().clear();
				getUnidadesOrganicas().addAll((Collection)newValue);
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				getDescomposicion().clear();
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				getUnidadesOrganicas().clear();
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
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
				return descomposicion != null && !descomposicion.isEmpty();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPONE:
				return getDescompone() != null;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS:
				return unidadesOrganicas != null && !unidadesOrganicas.isEmpty();
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorEstructuraFuncional.class) {
			switch (derivedFeatureID) {
				case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION: return SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION;
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
		if (baseClass == ContenedorEstructuraFuncional.class) {
			switch (baseFeatureID) {
				case SimapaPackage.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION: return SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //EstructuraFuncionalImpl