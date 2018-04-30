
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.Unidad;

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
 * An implementation of the model object '<em><b>Unidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getNotas <em>Notas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.UnidadImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnidadImpl extends SimapaObjectImpl implements Unidad {
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
	 * The default value of the '{@link #getPersona() <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected String persona = PERSONA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotas() <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotas()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotas() <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotas()
	 * @generated
	 * @ordered
	 */
	protected String notas = NOTAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected String observaciones = OBSERVACIONES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones = null;


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
	protected UnidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.UNIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getUnidad().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Unidad");
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
System.out.println("Unidad");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Unidad");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Unidad etiqueta", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersona() {
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(String newPersona) {
		String oldPersona = persona;
		persona = newPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotas() {
		return notas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotas(String newNotas) {
		String oldNotas = notas;
		notas = newNotas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__NOTAS, oldNotas, notas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservaciones(String newObservaciones) {
		String oldObservaciones = observaciones;
		observaciones = newObservaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.UNIDAD__OBSERVACIONES, oldObservaciones, observaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectWithInverseResolvingEList.ManyInverse(Operacion.class, this, SimapaPackage.UNIDAD__OPERACIONES, SimapaPackage.OPERACION__UNIDAD);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.UNIDAD__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.UNIDAD__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.UNIDAD__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.UNIDAD__NOMBRE:
				return getNombre();
			case SimapaPackage.UNIDAD__PERSONA:
				return getPersona();
			case SimapaPackage.UNIDAD__TELEFONO:
				return getTelefono();
			case SimapaPackage.UNIDAD__FAX:
				return getFax();
			case SimapaPackage.UNIDAD__DIRECCION:
				return getDireccion();
			case SimapaPackage.UNIDAD__NOTAS:
				return getNotas();
			case SimapaPackage.UNIDAD__OBSERVACIONES:
				return getObservaciones();
			case SimapaPackage.UNIDAD__OPERACIONES:
				return getOperaciones();
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
			case SimapaPackage.UNIDAD__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimapaPackage.UNIDAD__PERSONA:
				setPersona((String)newValue);
				return;
			case SimapaPackage.UNIDAD__TELEFONO:
				setTelefono((String)newValue);
				return;
			case SimapaPackage.UNIDAD__FAX:
				setFax((String)newValue);
				return;
			case SimapaPackage.UNIDAD__DIRECCION:
				setDireccion((String)newValue);
				return;
			case SimapaPackage.UNIDAD__NOTAS:
				setNotas((String)newValue);
				return;
			case SimapaPackage.UNIDAD__OBSERVACIONES:
				setObservaciones((String)newValue);
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
			case SimapaPackage.UNIDAD__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__PERSONA:
				setPersona(PERSONA_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__NOTAS:
				setNotas(NOTAS_EDEFAULT);
				return;
			case SimapaPackage.UNIDAD__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
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
			case SimapaPackage.UNIDAD__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.UNIDAD__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimapaPackage.UNIDAD__PERSONA:
				return PERSONA_EDEFAULT == null ? persona != null : !PERSONA_EDEFAULT.equals(persona);
			case SimapaPackage.UNIDAD__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case SimapaPackage.UNIDAD__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case SimapaPackage.UNIDAD__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case SimapaPackage.UNIDAD__NOTAS:
				return NOTAS_EDEFAULT == null ? notas != null : !NOTAS_EDEFAULT.equals(notas);
			case SimapaPackage.UNIDAD__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case SimapaPackage.UNIDAD__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
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
		result.append(", persona: ");
		result.append(persona);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", fax: ");
		result.append(fax);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(", notas: ");
		result.append(notas);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(')');
		return result.toString();
	}

} //UnidadImpl