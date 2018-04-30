
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.ClaseDocumento;
import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.DocumentoFinal;
import es.gva.cit.simapa.Documentos;
import es.gva.cit.simapa.Flujo;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TipoAlmacenamientoDocumento;
import es.gva.cit.simapa.TipoAmbitoDocumento;
import es.gva.cit.simapa.TipoMedioDocumento;

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
 * An implementation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getFicheroModeloFomulario <em>Fichero Modelo Fomulario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getTipoAlmacenamiento <em>Tipo Almacenamiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getTipoMedio <em>Tipo Medio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getTipoAmbito <em>Tipo Ambito</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getClaseDocumento <em>Clase Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getDocumentosFinales <em>Documentos Finales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.DocumentoImpl#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentoImpl extends SimapaObjectImpl implements Documento {
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
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

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
	 * The default value of the '{@link #getFicheroModeloFomulario() <em>Fichero Modelo Fomulario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFicheroModeloFomulario()
	 * @generated
	 * @ordered
	 */
	protected static final String FICHERO_MODELO_FOMULARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFicheroModeloFomulario() <em>Fichero Modelo Fomulario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFicheroModeloFomulario()
	 * @generated
	 * @ordered
	 */
	protected String ficheroModeloFomulario = FICHERO_MODELO_FOMULARIO_EDEFAULT;

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
	 * The default value of the '{@link #getTipoAlmacenamiento() <em>Tipo Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAlmacenamientoDocumento TIPO_ALMACENAMIENTO_EDEFAULT = TipoAlmacenamientoDocumento.NO_ESTABLECIDO_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoAlmacenamiento() <em>Tipo Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected TipoAlmacenamientoDocumento tipoAlmacenamiento = TIPO_ALMACENAMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoMedio() <em>Tipo Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoMedio()
	 * @generated
	 * @ordered
	 */
	protected static final TipoMedioDocumento TIPO_MEDIO_EDEFAULT = TipoMedioDocumento.ELECTRONICO_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoMedio() <em>Tipo Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoMedio()
	 * @generated
	 * @ordered
	 */
	protected TipoMedioDocumento tipoMedio = TIPO_MEDIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoAmbito() <em>Tipo Ambito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAmbito()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAmbitoDocumento TIPO_AMBITO_EDEFAULT = TipoAmbitoDocumento.ENTRADA_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoAmbito() <em>Tipo Ambito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAmbito()
	 * @generated
	 * @ordered
	 */
	protected TipoAmbitoDocumento tipoAmbito = TIPO_AMBITO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClaseDocumento() <em>Clase Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaseDocumento()
	 * @generated
	 * @ordered
	 */
	protected ClaseDocumento claseDocumento = null;

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
	 * The cached value of the '{@link #getDocumentosFinales() <em>Documentos Finales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentosFinales()
	 * @generated
	 * @ordered
	 */
	protected EList documentosFinales = null;

	/**
	 * The cached value of the '{@link #getFlujos() <em>Flujos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlujos()
	 * @generated
	 * @ordered
	 */
	protected EList flujos = null;


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
	protected DocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getDocumento().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Documento");
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
System.out.println("Documento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Documento");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Documento etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__TITULO, oldTitulo, titulo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFicheroModeloFomulario() {
		return ficheroModeloFomulario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFicheroModeloFomulario(String newFicheroModeloFomulario) {
		String oldFicheroModeloFomulario = ficheroModeloFomulario;
		ficheroModeloFomulario = newFicheroModeloFomulario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO, oldFicheroModeloFomulario, ficheroModeloFomulario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__OBSERVACIONES, oldObservaciones, observaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAlmacenamientoDocumento getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoAlmacenamiento(TipoAlmacenamientoDocumento newTipoAlmacenamiento) {
		TipoAlmacenamientoDocumento oldTipoAlmacenamiento = tipoAlmacenamiento;
		tipoAlmacenamiento = newTipoAlmacenamiento == null ? TIPO_ALMACENAMIENTO_EDEFAULT : newTipoAlmacenamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO, oldTipoAlmacenamiento, tipoAlmacenamiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMedioDocumento getTipoMedio() {
		return tipoMedio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoMedio(TipoMedioDocumento newTipoMedio) {
		TipoMedioDocumento oldTipoMedio = tipoMedio;
		tipoMedio = newTipoMedio == null ? TIPO_MEDIO_EDEFAULT : newTipoMedio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__TIPO_MEDIO, oldTipoMedio, tipoMedio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAmbitoDocumento getTipoAmbito() {
		return tipoAmbito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoAmbito(TipoAmbitoDocumento newTipoAmbito) {
		TipoAmbitoDocumento oldTipoAmbito = tipoAmbito;
		tipoAmbito = newTipoAmbito == null ? TIPO_AMBITO_EDEFAULT : newTipoAmbito;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__TIPO_AMBITO, oldTipoAmbito, tipoAmbito));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseDocumento getClaseDocumento() {
		if (claseDocumento != null && claseDocumento.eIsProxy()) {
			InternalEObject oldClaseDocumento = (InternalEObject)claseDocumento;
			claseDocumento = (ClaseDocumento)eResolveProxy(oldClaseDocumento);
			if (claseDocumento != oldClaseDocumento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO, oldClaseDocumento, claseDocumento));
			}
		}
		return claseDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseDocumento basicGetClaseDocumento() {
		return claseDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaseDocumento(ClaseDocumento newClaseDocumento, NotificationChain msgs) {
		ClaseDocumento oldClaseDocumento = claseDocumento;
		claseDocumento = newClaseDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO, oldClaseDocumento, newClaseDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaseDocumento(ClaseDocumento newClaseDocumento) {
		if (newClaseDocumento != claseDocumento) {
			NotificationChain msgs = null;
			if (claseDocumento != null)
				msgs = ((InternalEObject)claseDocumento).eInverseRemove(this, SimapaPackage.CLASE_DOCUMENTO__DOCUMENTOS, ClaseDocumento.class, msgs);
			if (newClaseDocumento != null)
				msgs = ((InternalEObject)newClaseDocumento).eInverseAdd(this, SimapaPackage.CLASE_DOCUMENTO__DOCUMENTOS, ClaseDocumento.class, msgs);
			msgs = basicSetClaseDocumento(newClaseDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO, newClaseDocumento, newClaseDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectWithInverseResolvingEList.ManyInverse(Procedimiento.class, this, SimapaPackage.DOCUMENTO__PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__DOCUMENTOS);
		}
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentosFinales() {
		if (documentosFinales == null) {
			documentosFinales = new EObjectWithInverseResolvingEList(DocumentoFinal.class, this, SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES, SimapaPackage.DOCUMENTO_FINAL__DOCUMENTO);
		}
		return documentosFinales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlujos() {
		if (flujos == null) {
			flujos = new EObjectWithInverseResolvingEList.ManyInverse(Flujo.class, this, SimapaPackage.DOCUMENTO__FLUJOS, SimapaPackage.FLUJO__DOCUMENTOS);
		}
		return flujos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentos getDocumentos() {
		if (eContainerFeatureID != SimapaPackage.DOCUMENTO__DOCUMENTOS) return null;
		return (Documentos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				if (claseDocumento != null)
					msgs = ((InternalEObject)claseDocumento).eInverseRemove(this, SimapaPackage.CLASE_DOCUMENTO__DOCUMENTOS, ClaseDocumento.class, msgs);
				return basicSetClaseDocumento((ClaseDocumento)otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES:
				return ((InternalEList)getDocumentosFinales()).basicAdd(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__FLUJOS:
				return ((InternalEList)getFlujos()).basicAdd(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__DOCUMENTOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.DOCUMENTO__DOCUMENTOS, msgs);
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
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				return basicSetClaseDocumento(null, msgs);
			case SimapaPackage.DOCUMENTO__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES:
				return ((InternalEList)getDocumentosFinales()).basicRemove(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__FLUJOS:
				return ((InternalEList)getFlujos()).basicRemove(otherEnd, msgs);
			case SimapaPackage.DOCUMENTO__DOCUMENTOS:
				return eBasicSetContainer(null, SimapaPackage.DOCUMENTO__DOCUMENTOS, msgs);
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
			case SimapaPackage.DOCUMENTO__DOCUMENTOS:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.DOCUMENTOS__DOCUMENTOS, Documentos.class, msgs);
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
			case SimapaPackage.DOCUMENTO__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.DOCUMENTO__TITULO:
				return getTitulo();
			case SimapaPackage.DOCUMENTO__CODIGO:
				return getCodigo();
			case SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO:
				return getFicheroModeloFomulario();
			case SimapaPackage.DOCUMENTO__OBSERVACIONES:
				return getObservaciones();
			case SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO:
				return getTipoAlmacenamiento();
			case SimapaPackage.DOCUMENTO__TIPO_MEDIO:
				return getTipoMedio();
			case SimapaPackage.DOCUMENTO__TIPO_AMBITO:
				return getTipoAmbito();
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				if (resolve) return getClaseDocumento();
				return basicGetClaseDocumento();
			case SimapaPackage.DOCUMENTO__PROCEDIMIENTOS:
				return getProcedimientos();
			case SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES:
				return getDocumentosFinales();
			case SimapaPackage.DOCUMENTO__FLUJOS:
				return getFlujos();
			case SimapaPackage.DOCUMENTO__DOCUMENTOS:
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
			case SimapaPackage.DOCUMENTO__TITULO:
				setTitulo((String)newValue);
				return;
			case SimapaPackage.DOCUMENTO__CODIGO:
				setCodigo((String)newValue);
				return;
			case SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO:
				setFicheroModeloFomulario((String)newValue);
				return;
			case SimapaPackage.DOCUMENTO__OBSERVACIONES:
				setObservaciones((String)newValue);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO:
				setTipoAlmacenamiento((TipoAlmacenamientoDocumento)newValue);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_MEDIO:
				setTipoMedio((TipoMedioDocumento)newValue);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_AMBITO:
				setTipoAmbito((TipoAmbitoDocumento)newValue);
				return;
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				setClaseDocumento((ClaseDocumento)newValue);
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
			case SimapaPackage.DOCUMENTO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO:
				setFicheroModeloFomulario(FICHERO_MODELO_FOMULARIO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO:
				setTipoAlmacenamiento(TIPO_ALMACENAMIENTO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_MEDIO:
				setTipoMedio(TIPO_MEDIO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__TIPO_AMBITO:
				setTipoAmbito(TIPO_AMBITO_EDEFAULT);
				return;
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				setClaseDocumento((ClaseDocumento)null);
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
			case SimapaPackage.DOCUMENTO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.DOCUMENTO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case SimapaPackage.DOCUMENTO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO:
				return FICHERO_MODELO_FOMULARIO_EDEFAULT == null ? ficheroModeloFomulario != null : !FICHERO_MODELO_FOMULARIO_EDEFAULT.equals(ficheroModeloFomulario);
			case SimapaPackage.DOCUMENTO__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO:
				return tipoAlmacenamiento != TIPO_ALMACENAMIENTO_EDEFAULT;
			case SimapaPackage.DOCUMENTO__TIPO_MEDIO:
				return tipoMedio != TIPO_MEDIO_EDEFAULT;
			case SimapaPackage.DOCUMENTO__TIPO_AMBITO:
				return tipoAmbito != TIPO_AMBITO_EDEFAULT;
			case SimapaPackage.DOCUMENTO__CLASE_DOCUMENTO:
				return claseDocumento != null;
			case SimapaPackage.DOCUMENTO__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
			case SimapaPackage.DOCUMENTO__DOCUMENTOS_FINALES:
				return documentosFinales != null && !documentosFinales.isEmpty();
			case SimapaPackage.DOCUMENTO__FLUJOS:
				return flujos != null && !flujos.isEmpty();
			case SimapaPackage.DOCUMENTO__DOCUMENTOS:
				return getDocumentos() != null;
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
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", ficheroModeloFomulario: ");
		result.append(ficheroModeloFomulario);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(", tipoAlmacenamiento: ");
		result.append(tipoAlmacenamiento);
		result.append(", tipoMedio: ");
		result.append(tipoMedio);
		result.append(", tipoAmbito: ");
		result.append(tipoAmbito);
		result.append(')');
		return result.toString();
	}

} //DocumentoImpl