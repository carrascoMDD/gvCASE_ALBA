
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Participacion;
import es.gva.cit.gvmetrica.proinso.PerfilParticipante;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Tarea;

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
 * An implementation of the model object '<em><b>Participacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl#getTarea <em>Tarea</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.ParticipacionImpl#getPerfilParticipante <em>Perfil Participante</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipacionImpl extends ProinsoObjectImpl implements Participacion {
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
	 * The cached value of the '{@link #getPerfilParticipante() <em>Perfil Participante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfilParticipante()
	 * @generated
	 * @ordered
	 */
	protected PerfilParticipante perfilParticipante = null;


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
	protected ParticipacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.PARTICIPACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
//		if (nombreDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getParticipacion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				nombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Participacion");
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
System.out.println("Participacion");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Participacion");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Participacion nombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getTarea() {
		if (eContainerFeatureID != ProinsoPackage.PARTICIPACION__TAREA) return null;
		return (Tarea)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilParticipante getPerfilParticipante() {
		if (perfilParticipante != null && perfilParticipante.eIsProxy()) {
			InternalEObject oldPerfilParticipante = (InternalEObject)perfilParticipante;
			perfilParticipante = (PerfilParticipante)eResolveProxy(oldPerfilParticipante);
			if (perfilParticipante != oldPerfilParticipante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE, oldPerfilParticipante, perfilParticipante));
			}
		}
		return perfilParticipante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilParticipante basicGetPerfilParticipante() {
		return perfilParticipante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerfilParticipante(PerfilParticipante newPerfilParticipante, NotificationChain msgs) {
		PerfilParticipante oldPerfilParticipante = perfilParticipante;
		perfilParticipante = newPerfilParticipante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE, oldPerfilParticipante, newPerfilParticipante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerfilParticipante(PerfilParticipante newPerfilParticipante) {
		if (newPerfilParticipante != perfilParticipante) {
			NotificationChain msgs = null;
			if (perfilParticipante != null)
				msgs = ((InternalEObject)perfilParticipante).eInverseRemove(this, ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES, PerfilParticipante.class, msgs);
			if (newPerfilParticipante != null)
				msgs = ((InternalEObject)newPerfilParticipante).eInverseAdd(this, ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES, PerfilParticipante.class, msgs);
			msgs = basicSetPerfilParticipante(newPerfilParticipante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE, newPerfilParticipante, newPerfilParticipante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.PARTICIPACION__TAREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.PARTICIPACION__TAREA, msgs);
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				if (perfilParticipante != null)
					msgs = ((InternalEObject)perfilParticipante).eInverseRemove(this, ProinsoPackage.PERFIL_PARTICIPANTE__PARTICIPACIONES, PerfilParticipante.class, msgs);
				return basicSetPerfilParticipante((PerfilParticipante)otherEnd, msgs);
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
			case ProinsoPackage.PARTICIPACION__TAREA:
				return eBasicSetContainer(null, ProinsoPackage.PARTICIPACION__TAREA, msgs);
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				return basicSetPerfilParticipante(null, msgs);
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
			case ProinsoPackage.PARTICIPACION__TAREA:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.TAREA__PARTICIPACIONES, Tarea.class, msgs);
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
			case ProinsoPackage.PARTICIPACION__NOMBRE:
				return getNombre();
			case ProinsoPackage.PARTICIPACION__TAREA:
				return getTarea();
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				if (resolve) return getPerfilParticipante();
				return basicGetPerfilParticipante();
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
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				setPerfilParticipante((PerfilParticipante)newValue);
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
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				setPerfilParticipante((PerfilParticipante)null);
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
			case ProinsoPackage.PARTICIPACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? getNombre() != null : !NOMBRE_EDEFAULT.equals(getNombre());
			case ProinsoPackage.PARTICIPACION__TAREA:
				return getTarea() != null;
			case ProinsoPackage.PARTICIPACION__PERFIL_PARTICIPANTE:
				return perfilParticipante != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipacionImpl