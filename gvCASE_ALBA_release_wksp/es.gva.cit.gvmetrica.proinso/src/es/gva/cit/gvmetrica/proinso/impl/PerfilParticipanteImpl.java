
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ConDocumentacion;
import es.gva.cit.gvmetrica.proinso.Documentacion;
import es.gva.cit.gvmetrica.proinso.Participacion;
import es.gva.cit.gvmetrica.proinso.Participante;
import es.gva.cit.gvmetrica.proinso.PerfilParticipante;
import es.gva.cit.gvmetrica.proinso.PerfilesParticipantes;
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
 * An implementation of the model object '<em><b>Perfil Participante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getParticipaciones <em>Participaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getParticipantes <em>Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.PerfilParticipanteImpl#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerfilParticipanteImpl extends ProinsoObjectImpl implements PerfilParticipante {
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
	 * The cached value of the '{@link #getParticipaciones() <em>Participaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipaciones()
	 * @generated
	 * @ordered
	 */
	protected EList participaciones = null;

	/**
	 * The cached value of the '{@link #getParticipantes() <em>Participantes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantes()
	 * @generated
	 * @ordered
	 */
	protected EList participantes = null;


	/**
	 * The parsed OCL expression for the definition of the '{@link #nombre_validar <em>Nombre validar</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nombre_validar
	 * @generated
	 */
	private static OCLExpression nombre_validarInvOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfilParticipanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PERFIL_PARTICIPANTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION, oldDocumentacion, newDocumentacion);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION, newDocumentacion, newDocumentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
		}
		return referencias;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.PERFIL_PARTICIPANTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParticipaciones() {
		if (participaciones == null) {
			participaciones = new EObjectWithInverseResolvingEList(Participacion.class, this, ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES, ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE);
		}
		return participaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParticipantes() {
		if (participantes == null) {
			participantes = new EObjectContainmentWithInverseEList(Participante.class, this, ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES, ProinsoPackage.PARTICIPANTE__PERFIL_PARTICIPANTE);
		}
		return participantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilesParticipantes getPerfilesParticipantes() {
		if (eContainerFeatureID != ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES) return null;
		return (PerfilesParticipantes)eContainer();
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
						 ProinsoValidator.PERFIL_PARTICIPANTE__NOMBRE_VALIDAR,
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				if (documentacion != null)
					msgs = ((InternalEObject)documentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION, null, msgs);
				return basicSetDocumentacion((Documentacion)otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES:
				return ((InternalEList)getParticipaciones()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				return ((InternalEList)getParticipantes()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES, msgs);
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				return basicSetDocumentacion(null, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES:
				return ((InternalEList)getParticipaciones()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				return ((InternalEList)getParticipantes()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES:
				return eBasicSetContainer(null, ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES, msgs);
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.PERFILES_PARTICIPANTES__PERFILES_PARTICIPANTES, PerfilesParticipantes.class, msgs);
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				return getDocumentacion();
			case ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.PERFIL_PARTICIPANTE__NOMBRE:
				return getNombre();
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES:
				return getParticipaciones();
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				return getParticipantes();
			case ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES:
				return getPerfilesParticipantes();
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				setDocumentacion((Documentacion)newValue);
				return;
			case ProinsoPackage.PERFIL_PARTICIPANTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				getParticipantes().clear();
				getParticipantes().addAll((Collection)newValue);
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				setDocumentacion((Documentacion)null);
				return;
			case ProinsoPackage.PERFIL_PARTICIPANTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				getParticipantes().clear();
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
			case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION:
				return documentacion != null;
			case ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.PERFIL_PARTICIPANTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES:
				return participaciones != null && !participaciones.isEmpty();
			case ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPANTES:
				return participantes != null && !participantes.isEmpty();
			case ProinsoPackage.PERFIL_PARTICIPANTE__PERFILES_PARTICIPANTES:
				return getPerfilesParticipantes() != null;
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
				case ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION: return ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
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
				case ProinsoPackage.CON_DOCUMENTACION__DOCUMENTACION: return ProinsoPackage.PERFIL_PARTICIPANTE__DOCUMENTACION;
				default: return -1;
			}
		}
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.PERFIL_PARTICIPANTE__REFERENCIAS;
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
		result.append(')');
		return result.toString();
	}

} //PerfilParticipanteImpl