
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Entrada;
import es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Salida;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Entrada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl#getModoUso <em>Modo Uso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl#getPrecondiciones <em>Precondiciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.EntradaImpl#getSalidas <em>Salidas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntradaImpl extends UsoFlujoImpl implements Entrada {
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
	protected static final ModoUsoEntradaKind MODO_USO_EDEFAULT = ModoUsoEntradaKind.CONSULTA_LITERAL;

	/**
	 * The cached value of the '{@link #getModoUso() <em>Modo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModoUso()
	 * @generated
	 * @ordered
	 */
	protected ModoUsoEntradaKind modoUso = MODO_USO_EDEFAULT;

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
	 * The default value of the '{@link #getPrecondiciones() <em>Precondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondiciones()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDICIONES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPrecondiciones() <em>Precondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondiciones()
	 * @generated
	 * @ordered
	 */
	protected String precondiciones = PRECONDICIONES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalidas() <em>Salidas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalidas()
	 * @generated
	 * @ordered
	 */
	protected EList salidas = null;


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
	protected EntradaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.ENTRADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
//		if (nombreDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) ProinsoPackage.eINSTANCE.getEntrada().getEAllStructuralFeatures().get(4);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				nombreDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Entrada");
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
System.out.println("Entrada");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Entrada");
System.out.println("nombre");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Entrada nombre", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModoUsoEntradaKind getModoUso() {
		return modoUso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModoUso(ModoUsoEntradaKind newModoUso) {
		ModoUsoEntradaKind oldModoUso = modoUso;
		modoUso = newModoUso == null ? MODO_USO_EDEFAULT : newModoUso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ENTRADA__MODO_USO, oldModoUso, modoUso));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ENTRADA__GUARDA, oldGuarda, guarda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondiciones() {
		return precondiciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondiciones(String newPrecondiciones) {
		String oldPrecondiciones = precondiciones;
		precondiciones = newPrecondiciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.ENTRADA__PRECONDICIONES, oldPrecondiciones, precondiciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSalidas() {
		if (salidas == null) {
			salidas = new EObjectWithInverseResolvingEList.ManyInverse(Salida.class, this, ProinsoPackage.ENTRADA__SALIDAS, ProinsoPackage.SALIDA__ENTRADAS);
		}
		return salidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProinsoPackage.ENTRADA__SALIDAS:
				return ((InternalEList)getSalidas()).basicAdd(otherEnd, msgs);
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
			case ProinsoPackage.ENTRADA__SALIDAS:
				return ((InternalEList)getSalidas()).basicRemove(otherEnd, msgs);
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
			case ProinsoPackage.ENTRADA__NOMBRE:
				return getNombre();
			case ProinsoPackage.ENTRADA__MODO_USO:
				return getModoUso();
			case ProinsoPackage.ENTRADA__GUARDA:
				return getGuarda();
			case ProinsoPackage.ENTRADA__PRECONDICIONES:
				return getPrecondiciones();
			case ProinsoPackage.ENTRADA__SALIDAS:
				return getSalidas();
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
			case ProinsoPackage.ENTRADA__MODO_USO:
				setModoUso((ModoUsoEntradaKind)newValue);
				return;
			case ProinsoPackage.ENTRADA__GUARDA:
				setGuarda((String)newValue);
				return;
			case ProinsoPackage.ENTRADA__PRECONDICIONES:
				setPrecondiciones((String)newValue);
				return;
			case ProinsoPackage.ENTRADA__SALIDAS:
				getSalidas().clear();
				getSalidas().addAll((Collection)newValue);
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
			case ProinsoPackage.ENTRADA__MODO_USO:
				setModoUso(MODO_USO_EDEFAULT);
				return;
			case ProinsoPackage.ENTRADA__GUARDA:
				setGuarda(GUARDA_EDEFAULT);
				return;
			case ProinsoPackage.ENTRADA__PRECONDICIONES:
				setPrecondiciones(PRECONDICIONES_EDEFAULT);
				return;
			case ProinsoPackage.ENTRADA__SALIDAS:
				getSalidas().clear();
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
			case ProinsoPackage.ENTRADA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? getNombre() != null : !NOMBRE_EDEFAULT.equals(getNombre());
			case ProinsoPackage.ENTRADA__MODO_USO:
				return modoUso != MODO_USO_EDEFAULT;
			case ProinsoPackage.ENTRADA__GUARDA:
				return GUARDA_EDEFAULT == null ? guarda != null : !GUARDA_EDEFAULT.equals(guarda);
			case ProinsoPackage.ENTRADA__PRECONDICIONES:
				return PRECONDICIONES_EDEFAULT == null ? precondiciones != null : !PRECONDICIONES_EDEFAULT.equals(precondiciones);
			case ProinsoPackage.ENTRADA__SALIDAS:
				return salidas != null && !salidas.isEmpty();
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
		result.append(", precondiciones: ");
		result.append(precondiciones);
		result.append(')');
		return result.toString();
	}

} //EntradaImpl