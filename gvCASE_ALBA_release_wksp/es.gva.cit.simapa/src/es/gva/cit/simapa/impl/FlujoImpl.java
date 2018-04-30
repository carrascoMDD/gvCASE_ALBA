
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.Flujo;
import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.SimapaPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Flujo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#isEsConector <em>Es Conector</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FlujoImpl#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlujoImpl extends SimapaObjectImpl implements Flujo {
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
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsConector() <em>Es Conector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsConector()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_CONECTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsConector() <em>Es Conector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsConector()
	 * @generated
	 * @ordered
	 */
	protected boolean esConector = ES_CONECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuarda() <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuarda()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARDA_EDEFAULT = null;

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
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Operacion destino = null;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected EList documentos = null;


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
	protected FlujoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.FLUJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getFlujo().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Flujo");
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
System.out.println("Flujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Flujo");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Flujo etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FLUJO__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsConector() {
		return esConector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsConector(boolean newEsConector) {
		boolean oldEsConector = esConector;
		esConector = newEsConector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FLUJO__ES_CONECTOR, oldEsConector, esConector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FLUJO__GUARDA, oldGuarda, guarda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getOrigen() {
		if (eContainerFeatureID != SimapaPackage.FLUJO__ORIGEN) return null;
		return (Operacion)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Operacion)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.FLUJO__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestino(Operacion newDestino, NotificationChain msgs) {
		Operacion oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.FLUJO__DESTINO, oldDestino, newDestino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Operacion newDestino) {
		if (newDestino != destino) {
			NotificationChain msgs = null;
			if (destino != null)
				msgs = ((InternalEObject)destino).eInverseRemove(this, SimapaPackage.OPERACION__FLUJOS_ENTRANTES, Operacion.class, msgs);
			if (newDestino != null)
				msgs = ((InternalEObject)newDestino).eInverseAdd(this, SimapaPackage.OPERACION__FLUJOS_ENTRANTES, Operacion.class, msgs);
			msgs = basicSetDestino(newDestino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FLUJO__DESTINO, newDestino, newDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentos() {
		if (documentos == null) {
			documentos = new EObjectWithInverseResolvingEList.ManyInverse(Documento.class, this, SimapaPackage.FLUJO__DOCUMENTOS, SimapaPackage.DOCUMENTO__FLUJOS);
		}
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.FLUJO__ORIGEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.FLUJO__ORIGEN, msgs);
			case SimapaPackage.FLUJO__DESTINO:
				if (destino != null)
					msgs = ((InternalEObject)destino).eInverseRemove(this, SimapaPackage.OPERACION__FLUJOS_ENTRANTES, Operacion.class, msgs);
				return basicSetDestino((Operacion)otherEnd, msgs);
			case SimapaPackage.FLUJO__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.FLUJO__ORIGEN:
				return eBasicSetContainer(null, SimapaPackage.FLUJO__ORIGEN, msgs);
			case SimapaPackage.FLUJO__DESTINO:
				return basicSetDestino(null, msgs);
			case SimapaPackage.FLUJO__DOCUMENTOS:
				return ((InternalEList)getDocumentos()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.FLUJO__ORIGEN:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.OPERACION__FLUJOS_SALIENTES, Operacion.class, msgs);
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
			case SimapaPackage.FLUJO__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.FLUJO__TEXTO:
				return getTexto();
			case SimapaPackage.FLUJO__ES_CONECTOR:
				return isEsConector() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.FLUJO__GUARDA:
				return getGuarda();
			case SimapaPackage.FLUJO__ORIGEN:
				return getOrigen();
			case SimapaPackage.FLUJO__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case SimapaPackage.FLUJO__DOCUMENTOS:
				return getDocumentos();
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
			case SimapaPackage.FLUJO__TEXTO:
				setTexto((String)newValue);
				return;
			case SimapaPackage.FLUJO__ES_CONECTOR:
				setEsConector(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.FLUJO__GUARDA:
				setGuarda((String)newValue);
				return;
			case SimapaPackage.FLUJO__DESTINO:
				setDestino((Operacion)newValue);
				return;
			case SimapaPackage.FLUJO__DOCUMENTOS:
				getDocumentos().clear();
				getDocumentos().addAll((Collection)newValue);
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
			case SimapaPackage.FLUJO__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case SimapaPackage.FLUJO__ES_CONECTOR:
				setEsConector(ES_CONECTOR_EDEFAULT);
				return;
			case SimapaPackage.FLUJO__GUARDA:
				setGuarda(GUARDA_EDEFAULT);
				return;
			case SimapaPackage.FLUJO__DESTINO:
				setDestino((Operacion)null);
				return;
			case SimapaPackage.FLUJO__DOCUMENTOS:
				getDocumentos().clear();
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
			case SimapaPackage.FLUJO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.FLUJO__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case SimapaPackage.FLUJO__ES_CONECTOR:
				return esConector != ES_CONECTOR_EDEFAULT;
			case SimapaPackage.FLUJO__GUARDA:
				return GUARDA_EDEFAULT == null ? guarda != null : !GUARDA_EDEFAULT.equals(guarda);
			case SimapaPackage.FLUJO__ORIGEN:
				return getOrigen() != null;
			case SimapaPackage.FLUJO__DESTINO:
				return destino != null;
			case SimapaPackage.FLUJO__DOCUMENTOS:
				return documentos != null && !documentos.isEmpty();
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
		result.append(" (texto: ");
		result.append(texto);
		result.append(", esConector: ");
		result.append(esConector);
		result.append(", guarda: ");
		result.append(guarda);
		result.append(')');
		return result.toString();
	}

} //FlujoImpl