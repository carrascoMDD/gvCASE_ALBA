
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.ReferenceRun;
import es.gva.cit.gvmetrica.proinso.Referenciable;
import es.gva.cit.gvmetrica.proinso.Tecnica;
import es.gva.cit.gvmetrica.proinso.Tecnicas;
import es.gva.cit.gvmetrica.proinso.UsoTecnica;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

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
 * An implementation of the model object '<em><b>Tecnica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl#getReferencias <em>Referencias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.TecnicaImpl#getUsosTecnica <em>Usos Tecnica</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TecnicaImpl extends ConDocumentacionImpl implements Tecnica {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

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
	 * The cached value of the '{@link #getUsosTecnica() <em>Usos Tecnica</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsosTecnica()
	 * @generated
	 * @ordered
	 */
	protected EList usosTecnica = null;


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
	protected TecnicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.TECNICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencias() {
		if (referencias == null) {
			referencias = new EObjectWithInverseResolvingEList(ReferenceRun.class, this, ProinsoPackage.TECNICA__REFERENCIAS, ProinsoPackage.REFERENCE_RUN__REFERENCIADO);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.TECNICA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnicas getTecnicas() {
		if (eContainerFeatureID != ProinsoPackage.TECNICA__TECNICAS) return null;
		return (Tecnicas)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsosTecnica() {
		if (usosTecnica == null) {
			usosTecnica = new EObjectWithInverseResolvingEList(UsoTecnica.class, this, ProinsoPackage.TECNICA__USOS_TECNICA, ProinsoPackage.USO_TECNICA__TECNICA);
		}
		return usosTecnica;
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
						 ProinsoValidator.TECNICA__NOMBRE_VALIDAR,
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
			case ProinsoPackage.TECNICA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicAdd(otherEnd, msgs);
			case ProinsoPackage.TECNICA__TECNICAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.TECNICA__TECNICAS, msgs);
			case ProinsoPackage.TECNICA__USOS_TECNICA:
				return ((InternalEList)getUsosTecnica()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.TECNICA__REFERENCIAS:
				return ((InternalEList)getReferencias()).basicRemove(otherEnd, msgs);
			case ProinsoPackage.TECNICA__TECNICAS:
				return eBasicSetContainer(null, ProinsoPackage.TECNICA__TECNICAS, msgs);
			case ProinsoPackage.TECNICA__USOS_TECNICA:
				return ((InternalEList)getUsosTecnica()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.TECNICA__TECNICAS:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.TECNICAS__TECNICAS, Tecnicas.class, msgs);
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
			case ProinsoPackage.TECNICA__REFERENCIAS:
				return getReferencias();
			case ProinsoPackage.TECNICA__NOMBRE:
				return getNombre();
			case ProinsoPackage.TECNICA__TECNICAS:
				return getTecnicas();
			case ProinsoPackage.TECNICA__USOS_TECNICA:
				return getUsosTecnica();
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
			case ProinsoPackage.TECNICA__NOMBRE:
				setNombre((String)newValue);
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
			case ProinsoPackage.TECNICA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case ProinsoPackage.TECNICA__REFERENCIAS:
				return referencias != null && !referencias.isEmpty();
			case ProinsoPackage.TECNICA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.TECNICA__TECNICAS:
				return getTecnicas() != null;
			case ProinsoPackage.TECNICA__USOS_TECNICA:
				return usosTecnica != null && !usosTecnica.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Referenciable.class) {
			switch (derivedFeatureID) {
				case ProinsoPackage.TECNICA__REFERENCIAS: return ProinsoPackage.REFERENCIABLE__REFERENCIAS;
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
		if (baseClass == Referenciable.class) {
			switch (baseFeatureID) {
				case ProinsoPackage.REFERENCIABLE__REFERENCIAS: return ProinsoPackage.TECNICA__REFERENCIAS;
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

} //TecnicaImpl