
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesPor;
import es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios;
import es.gva.cit.gvmetrica.orgcasi.CInterfaces;
import es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorDocumentos;
import es.gva.cit.gvmetrica.orgcasi.ImportadorServicios;
import es.gva.cit.gvmetrica.orgcasi.LibreriaServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libreria Servicios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getRelacionesDatos <em>Relaciones Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getImportadoPor <em>Importado Por</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getTodosDocumentos <em>Todos Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.LibreriaServiciosImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibreriaServiciosImpl extends AgrupacionImpl implements LibreriaServicios {
	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected CDocumentos documentos = null;

	/**
	 * The cached value of the '{@link #getEstructurasDatos() <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasDatos()
	 * @generated
	 * @ordered
	 */
	protected CEstructurasDatos estructurasDatos = null;

	/**
	 * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampos()
	 * @generated
	 * @ordered
	 */
	protected CCamposDatos campos = null;

	/**
	 * The cached value of the '{@link #getRelacionesDatos() <em>Relaciones Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesDatos()
	 * @generated
	 * @ordered
	 */
	protected CRelacionesDatos relacionesDatos = null;

	/**
	 * The cached value of the '{@link #getImportacionesServicios() <em>Importaciones Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportacionesServicios()
	 * @generated
	 * @ordered
	 */
	protected CImportacionesServicios importacionesServicios = null;

	/**
	 * The cached value of the '{@link #getImportadoPor() <em>Importado Por</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportadoPor()
	 * @generated
	 * @ordered
	 */
	protected CImportacionesPor importadoPor = null;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected CInterfaces interfaces = null;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodosDocumentos <em>Todos Documentos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodosDocumentos
	 * @generated
	 */
	private static OCLExpression todosDocumentosDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodasEstructurasDatos
	 * @generated
	 */
	private static OCLExpression todasEstructurasDatosDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getRepositorio <em>Repositorio</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorio
	 * @generated
	 */
	private static OCLExpression repositorioDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected LibreriaServiciosImpl() {
		super();
		setInterfaces( OrgcasiFactory.eINSTANCE.createCInterfaces());
		setDocumentos( OrgcasiFactory.eINSTANCE.createCDocumentos());
		setEstructurasDatos( OrgcasiFactory.eINSTANCE.createCEstructurasDatos());
		setRelacionesDatos( OrgcasiFactory.eINSTANCE.createCRelacionesDatos());
		setCampos( OrgcasiFactory.eINSTANCE.createCCamposDatos());
		setImportacionesServicios( OrgcasiFactory.eINSTANCE.createCImportacionesServicios());
		setImportadoPor( OrgcasiFactory.eINSTANCE.createCImportacionesPor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.LIBRERIA_SERVICIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDocumentos getDocumentos() {
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentos(CDocumentos newDocumentos, NotificationChain msgs) {
		CDocumentos oldDocumentos = documentos;
		documentos = newDocumentos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS, oldDocumentos, newDocumentos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentos(CDocumentos newDocumentos) {
		if (newDocumentos != documentos) {
			NotificationChain msgs = null;
			if (documentos != null)
				msgs = ((InternalEObject)documentos).eInverseRemove(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			if (newDocumentos != null)
				msgs = ((InternalEObject)newDocumentos).eInverseAdd(this, OrgcasiPackage.CDOCUMENTOS__CONTENEDOR, CDocumentos.class, msgs);
			msgs = basicSetDocumentos(newDocumentos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS, newDocumentos, newDocumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEstructurasDatos getEstructurasDatos() {
		return estructurasDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasDatos(CEstructurasDatos newEstructurasDatos, NotificationChain msgs) {
		CEstructurasDatos oldEstructurasDatos = estructurasDatos;
		estructurasDatos = newEstructurasDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS, oldEstructurasDatos, newEstructurasDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasDatos(CEstructurasDatos newEstructurasDatos) {
		if (newEstructurasDatos != estructurasDatos) {
			NotificationChain msgs = null;
			if (estructurasDatos != null)
				msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			if (newEstructurasDatos != null)
				msgs = ((InternalEObject)newEstructurasDatos).eInverseAdd(this, OrgcasiPackage.CESTRUCTURAS_DATOS__CONTENEDOR, CEstructurasDatos.class, msgs);
			msgs = basicSetEstructurasDatos(newEstructurasDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS, newEstructurasDatos, newEstructurasDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCamposDatos getCampos() {
		return campos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampos(CCamposDatos newCampos, NotificationChain msgs) {
		CCamposDatos oldCampos = campos;
		campos = newCampos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS, oldCampos, newCampos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCampos(CCamposDatos newCampos) {
		if (newCampos != campos) {
			NotificationChain msgs = null;
			if (campos != null)
				msgs = ((InternalEObject)campos).eInverseRemove(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			if (newCampos != null)
				msgs = ((InternalEObject)newCampos).eInverseAdd(this, OrgcasiPackage.CCAMPOS_DATOS__CONTENEDOR, CCamposDatos.class, msgs);
			msgs = basicSetCampos(newCampos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS, newCampos, newCampos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelacionesDatos getRelacionesDatos() {
		return relacionesDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelacionesDatos(CRelacionesDatos newRelacionesDatos, NotificationChain msgs) {
		CRelacionesDatos oldRelacionesDatos = relacionesDatos;
		relacionesDatos = newRelacionesDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS, oldRelacionesDatos, newRelacionesDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionesDatos(CRelacionesDatos newRelacionesDatos) {
		if (newRelacionesDatos != relacionesDatos) {
			NotificationChain msgs = null;
			if (relacionesDatos != null)
				msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			if (newRelacionesDatos != null)
				msgs = ((InternalEObject)newRelacionesDatos).eInverseAdd(this, OrgcasiPackage.CRELACIONES_DATOS__CONTENEDOR, CRelacionesDatos.class, msgs);
			msgs = basicSetRelacionesDatos(newRelacionesDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS, newRelacionesDatos, newRelacionesDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesServicios getImportacionesServicios() {
		return importacionesServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportacionesServicios(CImportacionesServicios newImportacionesServicios, NotificationChain msgs) {
		CImportacionesServicios oldImportacionesServicios = importacionesServicios;
		importacionesServicios = newImportacionesServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS, oldImportacionesServicios, newImportacionesServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportacionesServicios(CImportacionesServicios newImportacionesServicios) {
		if (newImportacionesServicios != importacionesServicios) {
			NotificationChain msgs = null;
			if (importacionesServicios != null)
				msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			if (newImportacionesServicios != null)
				msgs = ((InternalEObject)newImportacionesServicios).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_SERVICIOS__IMPORTADOR, CImportacionesServicios.class, msgs);
			msgs = basicSetImportacionesServicios(newImportacionesServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS, newImportacionesServicios, newImportacionesServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImportacionesPor getImportadoPor() {
		return importadoPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportadoPor(CImportacionesPor newImportadoPor, NotificationChain msgs) {
		CImportacionesPor oldImportadoPor = importadoPor;
		importadoPor = newImportadoPor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR, oldImportadoPor, newImportadoPor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportadoPor(CImportacionesPor newImportadoPor) {
		if (newImportadoPor != importadoPor) {
			NotificationChain msgs = null;
			if (importadoPor != null)
				msgs = ((InternalEObject)importadoPor).eInverseRemove(this, OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS, CImportacionesPor.class, msgs);
			if (newImportadoPor != null)
				msgs = ((InternalEObject)newImportadoPor).eInverseAdd(this, OrgcasiPackage.CIMPORTACIONES_POR__LIBRERIA_SERVICIOS, CImportacionesPor.class, msgs);
			msgs = basicSetImportadoPor(newImportadoPor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR, newImportadoPor, newImportadoPor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLibreriasServicios getLibreriasServicios() {
		if (eContainerFeatureID != OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS) return null;
		return (CLibreriasServicios)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreriasServicios(CLibreriasServicios newLibreriasServicios, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibreriasServicios, OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreriasServicios(CLibreriasServicios newLibreriasServicios) {
		if (newLibreriasServicios != eInternalContainer() || (eContainerFeatureID != OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS && newLibreriasServicios != null)) {
			if (EcoreUtil.isAncestor(this, newLibreriasServicios))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibreriasServicios != null)
				msgs = ((InternalEObject)newLibreriasServicios).eInverseAdd(this, OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS, CLibreriasServicios.class, msgs);
			msgs = basicSetLibreriasServicios(newLibreriasServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS, newLibreriasServicios, newLibreriasServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CInterfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(CInterfaces newInterfaces, NotificationChain msgs) {
		CInterfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(CInterfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS, CInterfaces.class, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, OrgcasiPackage.CINTERFACES__LIBRERIA_SERVICIOS, CInterfaces.class, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodosDocumentos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getLibreriaServicios().getEAllStructuralFeatures().get(14);
	
//		if (todosDocumentosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todosDocumentosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("LibreriaServicios");
System.out.println("todosDocumentos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todosDocumentosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("LibreriaServicios");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("LibreriaServicios");
System.out.println("todosDocumentos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "LibreriaServicios todosDocumentos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTodasEstructurasDatos() {
		EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getLibreriaServicios().getEAllStructuralFeatures().get(15);
	
//		if (todasEstructurasDatosDeriveOCL == null) { 
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				todasEstructurasDatosDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("LibreriaServicios");
System.out.println("todasEstructurasDatos");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(todasEstructurasDatosDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("LibreriaServicios");
System.out.println("todasEstructurasDatos");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			Collection result = (Collection) query.evaluate(this);
			return new EcoreEList.UnmodifiableEList(this, eFeature, result.size(), result.toArray());
		} catch(Exception anException  ) {
System.out.println("LibreriaServicios");
System.out.println("todasEstructurasDatos");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "LibreriaServicios todasEstructurasDatos", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio getRepositorio() {
		ARepositorio repositorio = basicGetRepositorio();
		return repositorio != null && repositorio.eIsProxy() ? (ARepositorio)eResolveProxy((InternalEObject)repositorio) : repositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARepositorio basicGetRepositorio() {
//		if (repositorioDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) OrgcasiPackage.eINSTANCE.getLibreriaServicios().getEAllStructuralFeatures().get(16);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				repositorioDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("LibreriaServicios");
System.out.println("repositorio");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(repositorioDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("LibreriaServicios");
System.out.println("repositorio");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (ARepositorio) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("LibreriaServicios");
System.out.println("repositorio");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "LibreriaServicios repositorio", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				if (documentos != null)
					msgs = ((InternalEObject)documentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS, null, msgs);
				return basicSetDocumentos((CDocumentos)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				if (estructurasDatos != null)
					msgs = ((InternalEObject)estructurasDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS, null, msgs);
				return basicSetEstructurasDatos((CEstructurasDatos)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				if (campos != null)
					msgs = ((InternalEObject)campos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS, null, msgs);
				return basicSetCampos((CCamposDatos)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				if (relacionesDatos != null)
					msgs = ((InternalEObject)relacionesDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS, null, msgs);
				return basicSetRelacionesDatos((CRelacionesDatos)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				if (importacionesServicios != null)
					msgs = ((InternalEObject)importacionesServicios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS, null, msgs);
				return basicSetImportacionesServicios((CImportacionesServicios)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				if (importadoPor != null)
					msgs = ((InternalEObject)importadoPor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR, null, msgs);
				return basicSetImportadoPor((CImportacionesPor)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibreriasServicios((CLibreriasServicios)otherEnd, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				if (interfaces != null)
					msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES, null, msgs);
				return basicSetInterfaces((CInterfaces)otherEnd, msgs);
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				return basicSetDocumentos(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				return basicSetEstructurasDatos(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				return basicSetCampos(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				return basicSetRelacionesDatos(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return basicSetImportacionesServicios(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				return basicSetImportadoPor(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				return basicSetLibreriasServicios(null, msgs);
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				return basicSetInterfaces(null, msgs);
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				return eInternalContainer().eInverseRemove(this, OrgcasiPackage.CLIBRERIAS_SERVICIOS__LIBRERIAS_SERVICIOS, CLibreriasServicios.class, msgs);
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				return getDocumentos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				return getEstructurasDatos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				return getCampos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				return getRelacionesDatos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return getImportacionesServicios();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				return getImportadoPor();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				return getLibreriasServicios();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				return getInterfaces();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__TODOS_DOCUMENTOS:
				return getTodosDocumentos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__TODAS_ESTRUCTURAS_DATOS:
				return getTodasEstructurasDatos();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__REPOSITORIO:
				if (resolve) return getRepositorio();
				return basicGetRepositorio();
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				setDocumentos((CDocumentos)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				setCampos((CCamposDatos)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				setImportadoPor((CImportacionesPor)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				setLibreriasServicios((CLibreriasServicios)newValue);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				setInterfaces((CInterfaces)newValue);
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				setDocumentos((CDocumentos)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				setEstructurasDatos((CEstructurasDatos)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				setCampos((CCamposDatos)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				setRelacionesDatos((CRelacionesDatos)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				setImportacionesServicios((CImportacionesServicios)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				setImportadoPor((CImportacionesPor)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				setLibreriasServicios((CLibreriasServicios)null);
				return;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				setInterfaces((CInterfaces)null);
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
			case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS:
				return documentos != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS:
				return estructurasDatos != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS:
				return campos != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS:
				return relacionesDatos != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS:
				return importacionesServicios != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTADO_POR:
				return importadoPor != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__LIBRERIAS_SERVICIOS:
				return getLibreriasServicios() != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__INTERFACES:
				return interfaces != null;
			case OrgcasiPackage.LIBRERIA_SERVICIOS__TODOS_DOCUMENTOS:
				return !getTodosDocumentos().isEmpty();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__TODAS_ESTRUCTURAS_DATOS:
				return !getTodasEstructurasDatos().isEmpty();
			case OrgcasiPackage.LIBRERIA_SERVICIOS__REPOSITORIO:
				return basicGetRepositorio() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ContenedorDocumentos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS: return OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDatos.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS: return OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS;
				case OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS: return OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS;
				case OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS: return OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS;
				default: return -1;
			}
		}
		if (baseClass == ImportadorServicios.class) {
			switch (derivedFeatureID) {
				case OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS: return OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS;
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
		if (baseClass == ContenedorDocumentos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_DOCUMENTOS__DOCUMENTOS: return OrgcasiPackage.LIBRERIA_SERVICIOS__DOCUMENTOS;
				default: return -1;
			}
		}
		if (baseClass == ContenedorDatos.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS: return OrgcasiPackage.LIBRERIA_SERVICIOS__ESTRUCTURAS_DATOS;
				case OrgcasiPackage.CONTENEDOR_DATOS__CAMPOS: return OrgcasiPackage.LIBRERIA_SERVICIOS__CAMPOS;
				case OrgcasiPackage.CONTENEDOR_DATOS__RELACIONES_DATOS: return OrgcasiPackage.LIBRERIA_SERVICIOS__RELACIONES_DATOS;
				default: return -1;
			}
		}
		if (baseClass == ImportadorServicios.class) {
			switch (baseFeatureID) {
				case OrgcasiPackage.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS: return OrgcasiPackage.LIBRERIA_SERVICIOS__IMPORTACIONES_SERVICIOS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LibreriaServiciosImpl