
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.Interfaces;
import es.gva.cit.gvmetrica.proinso.Interfaz;
import es.gva.cit.gvmetrica.proinso.ProcesoInterfaz;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
 * An implementation of the model object '<em><b>Interfaz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.InterfazImpl#getCodigoCompleto <em>Codigo Completo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfazImpl extends ProinsoObjectImpl implements Interfaz {
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
	 * The cached value of the '{@link #getProcesos() <em>Procesos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesos()
	 * @generated
	 * @ordered
	 */
	protected EList procesos = null;

	/**
	 * The default value of the '{@link #getCodigoCompleto() <em>Codigo Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoCompleto()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_COMPLETO_EDEFAULT = null;


	/**
	 * The parsed OCL expression for the definition of the '{@link #nombre_validar <em>Nombre validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nombre_validar
	 * @generated
	 */
	private static OCLExpression nombre_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #codigo_validar <em>Codigo validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #codigo_validar
	 * @generated
	 */
	private static OCLExpression codigo_validarInvOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getCodigoCompleto <em>Codigo Completo</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoCompleto
	 * @generated
	 */
	private static OCLExpression codigoCompletoDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfazImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.INTERFAZ;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.INTERFAZ__DOCUMENTACION, oldDocumentacion, newDocumentacion);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.INTERFAZ__DOCUMENTACION, newDocumentacion, newDocumentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.INTERFAZ__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
		}
		return referencias;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.INTERFAZ__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.INTERFAZ__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaces getInterfaces() {
		if (eContainerFeatureID != ProinsoPackage.INTERFAZ__INTERFACES) return null;
		return (Interfaces)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcesos() {
		if (procesos == null) {
			procesos = new EObjectContainmentWithInverseEList(ProcesoInterfaz.class, this, ProinsoPackage.INTERFAZ__PROCESOS, ProinsoPackage.PROCESO_INTERFAZ__INTERFAZ);
		}
		return procesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoCompleto() {
//		if (codigoCompletoDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getInterfaz().getEAllStructuralFeatures().get(7);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				codigoCompletoDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Interfaz");
System.out.println("codigoCompleto");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(codigoCompletoDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Interfaz");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Interfaz");
System.out.println("codigoCompleto");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Interfaz codigoCompleto", anException);
		}
	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (nombre_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(0);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				nombre_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(nombre_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.INTERFAZ__NOMBRE_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nombre_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean codigo_validar(DiagnosticChain theDiagnostics, Map theContext) {
		if (codigo_validarInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				codigo_validarInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(codigo_validarInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (theDiagnostics != null) {
				theDiagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProinsoValidator.DIAGNOSTIC_SOURCE,
						 ProinsoValidator.INTERFAZ__CODIGO_VALIDAR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "codigo_validar", EObjectValidator.getObjectLabel(this, theContext) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				if (documentacion != null)
					msgs = ((InternalEObject)documentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.INTERFAZ__DOCUMENTACION, null, msgs);
				return basicSetDocumentacion((Documentacion)otherEnd, msgs);
			case ProinsoPackage.INTERFAZ__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.INTERFAZ__INTERFACES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.INTERFAZ__INTERFACES, msgs);
			case ProinsoPackage.INTERFAZ__PROCESOS:
				return ((InternalEList)getProcesos()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				return basicSetDocumentacion(null, msgs);
			case ProinsoPackage.INTERFAZ__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.INTERFAZ__INTERFACES:
				return eBasicSetContainer(null, ProinsoPackage.INTERFAZ__INTERFACES, msgs);
			case ProinsoPackage.INTERFAZ__PROCESOS:
				return ((InternalEList)getProcesos()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.INTERFAZ__INTERFACES:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.INTERFACES__INTERFACES, Interfaces.class, msgs);
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
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				return getDocumentacion();
			case ProinsoPackage.INTERFAZ__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.INTERFAZ__CODIGO:
				return getCodigo();
			case ProinsoPackage.INTERFAZ__NOMBRE:
				return getNombre();
			case ProinsoPackage.INTERFAZ__INTERFACES:
				return getInterfaces();
			case ProinsoPackage.INTERFAZ__PROCESOS:
				return getProcesos();
			case ProinsoPackage.INTERFAZ__CODIGO_COMPLETO:
				return getCodigoCompleto();
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
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				setDocumentacion((Documentacion)newValue);
				return;
			case ProinsoPackage.INTERFAZ__CODIGO:
				setCodigo((String)newValue);
				return;
			case ProinsoPackage.INTERFAZ__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProinsoPackage.INTERFAZ__PROCESOS:
				getProcesos().clear();
				getProcesos().addAll((Collection)newValue);
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
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				setDocumentacion((Documentacion)null);
				return;
			case ProinsoPackage.INTERFAZ__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ProinsoPackage.INTERFAZ__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProinsoPackage.INTERFAZ__PROCESOS:
				getProcesos().clear();
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
			case ProinsoPackage.INTERFAZ__DOCUMENTACION:
				return documentacion != null;
			case ProinsoPackage.INTERFAZ__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.INTERFAZ__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case ProinsoPackage.INTERFAZ__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.INTERFAZ__INTERFACES:
				return getInterfaces() != null;
			case ProinsoPackage.INTERFAZ__PROCESOS:
				return procesos != null && !procesos.isEmpty();
			case ProinsoPackage.INTERFAZ__CODIGO_COMPLETO:
				return CODIGO_COMPLETO_EDEFAULT == null ? getCodigoCompleto() != null : !CODIGO_COMPLETO_EDEFAULT.equals(getCodigoCompleto());
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
				case ProinsoPackage.INTERFAZ__DOCUMENTACION: return ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.INTERFAZ__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
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
				case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION: return ProinsoPackage.INTERFAZ__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.INTERFAZ__REFERENCIAS;
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //InterfazImpl