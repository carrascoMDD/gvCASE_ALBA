
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Entrada;
import es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Salida;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * An implementation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#getModoUso <em>Modo Uso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#getPostcondiciones <em>Postcondiciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#isForzado <em>Forzado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.SalidaImpl#getEntradas <em>Entradas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalidaImpl extends UsoFlujoImpl implements Salida {
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
	 * The default value of the '{@link #getModoUso() <em>Modo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModoUso()
	 * @generated
	 * @ordered
	 */
	protected static final ModoUsoSalidaKind MODO_USO_EDEFAULT = ModoUsoSalidaKind.ACTUALIZACION_LITERAL;

	/**
	 * The cached value of the '{@link #getModoUso() <em>Modo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModoUso()
	 * @generated
	 * @ordered
	 */
	protected ModoUsoSalidaKind modoUso = MODO_USO_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuarda() <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuarda()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARDA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGuarda() <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuarda()
	 * @generated
	 * @ordered
	 */
	protected String guarda = GUARDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondiciones() <em>Postcondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondiciones()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDICIONES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPostcondiciones() <em>Postcondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondiciones()
	 * @generated
	 * @ordered
	 */
	protected String postcondiciones = POSTCONDICIONES_EDEFAULT;

	/**
	 * The default value of the '{@link #isForzado() <em>Forzado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForzado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORZADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForzado() <em>Forzado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForzado()
	 * @generated
	 * @ordered
	 */
	protected boolean forzado = FORZADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected EList entradas = null;


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
	protected SalidaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.SALIDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
//		if (nombreDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getSalida().getEAllStructuralFeatures().get(4);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				nombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Salida");
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
System.out.println("Salida");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Salida");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Salida nombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoUsoSalidaKind getModoUso() {
		return modoUso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModoUso(ModoUsoSalidaKind newModoUso) {
		ModoUsoSalidaKind oldModoUso = modoUso;
		modoUso = newModoUso == null ? MODO_USO_EDEFAULT : newModoUso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.SALIDA__MODO_USO, oldModoUso, modoUso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuarda() {
		return guarda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuarda(String newGuarda) {
		String oldGuarda = guarda;
		guarda = newGuarda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.SALIDA__GUARDA, oldGuarda, guarda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondiciones() {
		return postcondiciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondiciones(String newPostcondiciones) {
		String oldPostcondiciones = postcondiciones;
		postcondiciones = newPostcondiciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.SALIDA__POSTCONDICIONES, oldPostcondiciones, postcondiciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForzado() {
		return forzado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForzado(boolean newForzado) {
		boolean oldForzado = forzado;
		forzado = newForzado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.SALIDA__FORZADO, oldForzado, forzado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntradas() {
		if (entradas == null) {
			entradas = new EObjectWithInverseResolvingEList.ManyInverse(Entrada.class, this, ProinsoPackage.SALIDA__ENTRADAS, ProinsoPackage.ENTRADA__SALIDAS);
		}
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.SALIDA__ENTRADAS:
				return ((InternalEList)getEntradas()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.SALIDA__ENTRADAS:
				return ((InternalEList)getEntradas()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.SALIDA__NOMBRE:
				return getNombre();
			case ProinsoPackage.SALIDA__MODO_USO:
				return getModoUso();
			case ProinsoPackage.SALIDA__GUARDA:
				return getGuarda();
			case ProinsoPackage.SALIDA__POSTCONDICIONES:
				return getPostcondiciones();
			case ProinsoPackage.SALIDA__FORZADO:
				return isForzado() ? Boolean.TRUE : Boolean.FALSE;
			case ProinsoPackage.SALIDA__ENTRADAS:
				return getEntradas();
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
			case ProinsoPackage.SALIDA__MODO_USO:
				setModoUso((ModoUsoSalidaKind)newValue);
				return;
			case ProinsoPackage.SALIDA__GUARDA:
				setGuarda((String)newValue);
				return;
			case ProinsoPackage.SALIDA__POSTCONDICIONES:
				setPostcondiciones((String)newValue);
				return;
			case ProinsoPackage.SALIDA__FORZADO:
				setForzado(((Boolean)newValue).booleanValue());
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
			case ProinsoPackage.SALIDA__MODO_USO:
				setModoUso(MODO_USO_EDEFAULT);
				return;
			case ProinsoPackage.SALIDA__GUARDA:
				setGuarda(GUARDA_EDEFAULT);
				return;
			case ProinsoPackage.SALIDA__POSTCONDICIONES:
				setPostcondiciones(POSTCONDICIONES_EDEFAULT);
				return;
			case ProinsoPackage.SALIDA__FORZADO:
				setForzado(FORZADO_EDEFAULT);
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
			case ProinsoPackage.SALIDA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? getNombre() != null : !NOMBRE_EDEFAULT.equals(getNombre());
			case ProinsoPackage.SALIDA__MODO_USO:
				return modoUso != MODO_USO_EDEFAULT;
			case ProinsoPackage.SALIDA__GUARDA:
				return GUARDA_EDEFAULT == null ? guarda != null : !GUARDA_EDEFAULT.equals(guarda);
			case ProinsoPackage.SALIDA__POSTCONDICIONES:
				return POSTCONDICIONES_EDEFAULT == null ? postcondiciones != null : !POSTCONDICIONES_EDEFAULT.equals(postcondiciones);
			case ProinsoPackage.SALIDA__FORZADO:
				return forzado != FORZADO_EDEFAULT;
			case ProinsoPackage.SALIDA__ENTRADAS:
				return entradas != null && !entradas.isEmpty();
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
		result.append(" (modoUso: ");
		result.append(modoUso);
		result.append(", guarda: ");
		result.append(guarda);
		result.append(", postcondiciones: ");
		result.append(postcondiciones);
		result.append(", forzado: ");
		result.append(forzado);
		result.append(')');
		return result.toString();
	}

} //SalidaImpl