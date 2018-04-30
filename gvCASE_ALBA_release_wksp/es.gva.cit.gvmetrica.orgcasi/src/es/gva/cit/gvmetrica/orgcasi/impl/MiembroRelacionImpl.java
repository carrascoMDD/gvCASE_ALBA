/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.MiembroRelacion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.RelacionDatos;
import es.gva.cit.gvmetrica.orgcasi.TipoRelacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 * An implementation of the model object '<em><b>Miembro Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getTipoRelacion <em>Tipo Relacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getMultiplicidadMinima <em>Multiplicidad Minima</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getMultiplicidadMaxima <em>Multiplicidad Maxima</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getEstructuraDatos <em>Estructura Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.MiembroRelacionImpl#getRelacion <em>Relacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiembroRelacionImpl extends OrgcasiObjectImpl implements MiembroRelacion {
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
	 * The default value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentario()
	 * @generated
	 * @ordered
	 */
	protected static final String COMENTARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComentario()
	 * @generated
	 * @ordered
	 */
	protected String comentario = COMENTARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoRelacion() <em>Tipo Relacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRelacion()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRelacion TIPO_RELACION_EDEFAULT = TipoRelacion.REFERENCIA_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoRelacion() <em>Tipo Relacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRelacion()
	 * @generated
	 * @ordered
	 */
	protected TipoRelacion tipoRelacion = TIPO_RELACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadMinima() <em>Multiplicidad Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadMinima()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTIPLICIDAD_MINIMA_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMultiplicidadMinima() <em>Multiplicidad Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadMinima()
	 * @generated
	 * @ordered
	 */
	protected Integer multiplicidadMinima = MULTIPLICIDAD_MINIMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadMaxima() <em>Multiplicidad Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadMaxima()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTIPLICIDAD_MAXIMA_EDEFAULT = new Integer(-1);

	/**
	 * The cached value of the '{@link #getMultiplicidadMaxima() <em>Multiplicidad Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadMaxima()
	 * @generated
	 * @ordered
	 */
	protected Integer multiplicidadMaxima = MULTIPLICIDAD_MAXIMA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstructuraDatos() <em>Estructura Datos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuraDatos()
	 * @generated
	 * @ordered
	 */
	protected EstructuraDatos estructuraDatos = null;

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
	protected MiembroRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.MIEMBRO_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getMiembroRelacion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("MiembroRelacion");
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
System.out.println("MiembroRelacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("MiembroRelacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "MiembroRelacion etiqueta", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComentario(String newComentario) {
		String oldComentario = comentario;
		comentario = newComentario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__COMENTARIO, oldComentario, comentario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRelacion getTipoRelacion() {
		return tipoRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoRelacion(TipoRelacion newTipoRelacion) {
		TipoRelacion oldTipoRelacion = tipoRelacion;
		tipoRelacion = newTipoRelacion == null ? TIPO_RELACION_EDEFAULT : newTipoRelacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__TIPO_RELACION, oldTipoRelacion, tipoRelacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMultiplicidadMinima() {
		return multiplicidadMinima;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadMinima(Integer newMultiplicidadMinima) {
		Integer oldMultiplicidadMinima = multiplicidadMinima;
		multiplicidadMinima = newMultiplicidadMinima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA, oldMultiplicidadMinima, multiplicidadMinima));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMultiplicidadMaxima() {
		return multiplicidadMaxima;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadMaxima(Integer newMultiplicidadMaxima) {
		Integer oldMultiplicidadMaxima = multiplicidadMaxima;
		multiplicidadMaxima = newMultiplicidadMaxima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA, oldMultiplicidadMaxima, multiplicidadMaxima));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionDatos getRelacion() {
		if (eContainerFeatureID != OrgcasiPackage.MIEMBRO_RELACION__RELACION) return null;
		return (RelacionDatos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelacion(RelacionDatos newRelacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRelacion, OrgcasiPackage.MIEMBRO_RELACION__RELACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacion(RelacionDatos newRelacion) {
		if (newRelacion != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.MIEMBRO_RELACION__RELACION && newRelacion != null)) {
			if (EcoreUtil.isAncestor(this, newRelacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRelacion != null)
				msgs = ((InternalEObject)newRelacion).eInverseAdd(this, OrgcasiPackage.RELACION_DATOS__MIEMBROS, RelacionDatos.class, msgs);
			msgs = basicSetRelacion(newRelacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__RELACION, newRelacion, newRelacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraDatos getEstructuraDatos() {
		if (estructuraDatos != null && estructuraDatos.eIsProxy()) {
			InternalEObject oldEstructuraDatos = (InternalEObject)estructuraDatos;
			estructuraDatos = (EstructuraDatos)eResolveProxy(oldEstructuraDatos);
			if (estructuraDatos != oldEstructuraDatos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS, oldEstructuraDatos, estructuraDatos));
			}
		}
		return estructuraDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructuraDatos basicGetEstructuraDatos() {
		return estructuraDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructuraDatos(EstructuraDatos newEstructuraDatos, NotificationChain msgs) {
		EstructuraDatos oldEstructuraDatos = estructuraDatos;
		estructuraDatos = newEstructuraDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS, oldEstructuraDatos, newEstructuraDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructuraDatos(EstructuraDatos newEstructuraDatos) {
		if (newEstructuraDatos != estructuraDatos) {
			NotificationChain msgs = null;
			if (estructuraDatos != null)
				msgs = ((InternalEObject)estructuraDatos).eInverseRemove(this, OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES, EstructuraDatos.class, msgs);
			if (newEstructuraDatos != null)
				msgs = ((InternalEObject)newEstructuraDatos).eInverseAdd(this, OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES, EstructuraDatos.class, msgs);
			msgs = basicSetEstructuraDatos(newEstructuraDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS, newEstructuraDatos, newEstructuraDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				if (estructuraDatos != null)
					msgs = ((InternalEObject)estructuraDatos).eInverseRemove(this, OrgcasiPackage.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES, EstructuraDatos.class, msgs);
				return basicSetEstructuraDatos((EstructuraDatos)otherEnd, msgs);
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRelacion((RelacionDatos)otherEnd, msgs);
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
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				return basicSetEstructuraDatos(null, msgs);
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				return basicSetRelacion(null, msgs);
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
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.RELACION_DATOS__MIEMBROS, RelacionDatos.class, msgs);
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
			case OrgcasiPackage.MIEMBRO_RELACION__ETIQUETA:
				return getEtiqueta();
			case OrgcasiPackage.MIEMBRO_RELACION__NOMBRE:
				return getNombre();
			case OrgcasiPackage.MIEMBRO_RELACION__COMENTARIO:
				return getComentario();
			case OrgcasiPackage.MIEMBRO_RELACION__TIPO_RELACION:
				return getTipoRelacion();
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA:
				return getMultiplicidadMinima();
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA:
				return getMultiplicidadMaxima();
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				if (resolve) return getEstructuraDatos();
				return basicGetEstructuraDatos();
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				return getRelacion();
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
			case OrgcasiPackage.MIEMBRO_RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__COMENTARIO:
				setComentario((String)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__TIPO_RELACION:
				setTipoRelacion((TipoRelacion)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA:
				setMultiplicidadMinima((Integer)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA:
				setMultiplicidadMaxima((Integer)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				setEstructuraDatos((EstructuraDatos)newValue);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				setRelacion((RelacionDatos)newValue);
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
			case OrgcasiPackage.MIEMBRO_RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__COMENTARIO:
				setComentario(COMENTARIO_EDEFAULT);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__TIPO_RELACION:
				setTipoRelacion(TIPO_RELACION_EDEFAULT);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA:
				setMultiplicidadMinima(MULTIPLICIDAD_MINIMA_EDEFAULT);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA:
				setMultiplicidadMaxima(MULTIPLICIDAD_MAXIMA_EDEFAULT);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				setEstructuraDatos((EstructuraDatos)null);
				return;
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				setRelacion((RelacionDatos)null);
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
			case OrgcasiPackage.MIEMBRO_RELACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case OrgcasiPackage.MIEMBRO_RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case OrgcasiPackage.MIEMBRO_RELACION__COMENTARIO:
				return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
			case OrgcasiPackage.MIEMBRO_RELACION__TIPO_RELACION:
				return tipoRelacion != TIPO_RELACION_EDEFAULT;
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MINIMA:
				return MULTIPLICIDAD_MINIMA_EDEFAULT == null ? multiplicidadMinima != null : !MULTIPLICIDAD_MINIMA_EDEFAULT.equals(multiplicidadMinima);
			case OrgcasiPackage.MIEMBRO_RELACION__MULTIPLICIDAD_MAXIMA:
				return MULTIPLICIDAD_MAXIMA_EDEFAULT == null ? multiplicidadMaxima != null : !MULTIPLICIDAD_MAXIMA_EDEFAULT.equals(multiplicidadMaxima);
			case OrgcasiPackage.MIEMBRO_RELACION__ESTRUCTURA_DATOS:
				return estructuraDatos != null;
			case OrgcasiPackage.MIEMBRO_RELACION__RELACION:
				return getRelacion() != null;
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
		result.append(", comentario: ");
		result.append(comentario);
		result.append(", tipoRelacion: ");
		result.append(tipoRelacion);
		result.append(", multiplicidadMinima: ");
		result.append(multiplicidadMinima);
		result.append(", multiplicidadMaxima: ");
		result.append(multiplicidadMaxima);
		result.append(')');
		return result.toString();
	}

} //MiembroRelacionImpl