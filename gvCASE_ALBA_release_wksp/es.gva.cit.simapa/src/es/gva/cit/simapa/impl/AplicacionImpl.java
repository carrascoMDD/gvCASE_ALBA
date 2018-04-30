
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.Aplicaciones;
import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.Rango1_10;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TipoAplicacion;
import es.gva.cit.simapa.TipoDesarrollo;

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
 * An implementation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getHerramienta <em>Herramienta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getBaseDeDatos <em>Base De Datos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getNumeroUsuarios <em>Numero Usuarios</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getEstadoAplicacion <em>Estado Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getNivelSeguridad <em>Nivel Seguridad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getDesarrollador <em>Desarrollador</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getTipoDesarrollo <em>Tipo Desarrollo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getTipoAplicacion <em>Tipo Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getComplejidad <em>Complejidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getImportancia <em>Importancia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.AplicacionImpl#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AplicacionImpl extends SimapaObjectImpl implements Aplicacion {
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
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

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
	 * The default value of the '{@link #getHerramienta() <em>Herramienta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerramienta()
	 * @generated
	 * @ordered
	 */
	protected static final String HERRAMIENTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHerramienta() <em>Herramienta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerramienta()
	 * @generated
	 * @ordered
	 */
	protected String herramienta = HERRAMIENTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseDeDatos() <em>Base De Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDeDatos()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_DE_DATOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseDeDatos() <em>Base De Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDeDatos()
	 * @generated
	 * @ordered
	 */
	protected String baseDeDatos = BASE_DE_DATOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroUsuarios() <em>Numero Usuarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroUsuarios()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_USUARIOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroUsuarios() <em>Numero Usuarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroUsuarios()
	 * @generated
	 * @ordered
	 */
	protected String numeroUsuarios = NUMERO_USUARIOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstadoAplicacion() <em>Estado Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoAplicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_APLICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstadoAplicacion() <em>Estado Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoAplicacion()
	 * @generated
	 * @ordered
	 */
	protected String estadoAplicacion = ESTADO_APLICACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNivelSeguridad() <em>Nivel Seguridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNivelSeguridad()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEL_SEGURIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNivelSeguridad() <em>Nivel Seguridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNivelSeguridad()
	 * @generated
	 * @ordered
	 */
	protected String nivelSeguridad = NIVEL_SEGURIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesarrollador() <em>Desarrollador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesarrollador()
	 * @generated
	 * @ordered
	 */
	protected static final String DESARROLLADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesarrollador() <em>Desarrollador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesarrollador()
	 * @generated
	 * @ordered
	 */
	protected String desarrollador = DESARROLLADOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDesarrollo() <em>Tipo Desarrollo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDesarrollo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDesarrollo TIPO_DESARROLLO_EDEFAULT = TipoDesarrollo.EXTERNA_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoDesarrollo() <em>Tipo Desarrollo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDesarrollo()
	 * @generated
	 * @ordered
	 */
	protected TipoDesarrollo tipoDesarrollo = TIPO_DESARROLLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoAplicacion() <em>Tipo Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAplicacion()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAplicacion TIPO_APLICACION_EDEFAULT = TipoAplicacion.CORPORATIVA_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoAplicacion() <em>Tipo Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAplicacion()
	 * @generated
	 * @ordered
	 */
	protected TipoAplicacion tipoAplicacion = TIPO_APLICACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplejidad() <em>Complejidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplejidad()
	 * @generated
	 * @ordered
	 */
	protected static final Rango1_10 COMPLEJIDAD_EDEFAULT = Rango1_10.NO_ESTABLECIDO_LITERAL;

	/**
	 * The cached value of the '{@link #getComplejidad() <em>Complejidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplejidad()
	 * @generated
	 * @ordered
	 */
	protected Rango1_10 complejidad = COMPLEJIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportancia() <em>Importancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportancia()
	 * @generated
	 * @ordered
	 */
	protected static final Rango1_10 IMPORTANCIA_EDEFAULT = Rango1_10.NO_ESTABLECIDO_LITERAL;

	/**
	 * The cached value of the '{@link #getImportancia() <em>Importancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportancia()
	 * @generated
	 * @ordered
	 */
	protected Rango1_10 importancia = IMPORTANCIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones = null;

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
	protected AplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.APLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getAplicacion().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Aplicacion");
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
System.out.println("Aplicacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Aplicacion");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Aplicacion etiqueta", anException);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHerramienta() {
		return herramienta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerramienta(String newHerramienta) {
		String oldHerramienta = herramienta;
		herramienta = newHerramienta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__HERRAMIENTA, oldHerramienta, herramienta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseDeDatos() {
		return baseDeDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDeDatos(String newBaseDeDatos) {
		String oldBaseDeDatos = baseDeDatos;
		baseDeDatos = newBaseDeDatos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__BASE_DE_DATOS, oldBaseDeDatos, baseDeDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroUsuarios() {
		return numeroUsuarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroUsuarios(String newNumeroUsuarios) {
		String oldNumeroUsuarios = numeroUsuarios;
		numeroUsuarios = newNumeroUsuarios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__NUMERO_USUARIOS, oldNumeroUsuarios, numeroUsuarios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstadoAplicacion() {
		return estadoAplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstadoAplicacion(String newEstadoAplicacion) {
		String oldEstadoAplicacion = estadoAplicacion;
		estadoAplicacion = newEstadoAplicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__ESTADO_APLICACION, oldEstadoAplicacion, estadoAplicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNivelSeguridad() {
		return nivelSeguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNivelSeguridad(String newNivelSeguridad) {
		String oldNivelSeguridad = nivelSeguridad;
		nivelSeguridad = newNivelSeguridad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__NIVEL_SEGURIDAD, oldNivelSeguridad, nivelSeguridad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesarrollador(String newDesarrollador) {
		String oldDesarrollador = desarrollador;
		desarrollador = newDesarrollador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__DESARROLLADOR, oldDesarrollador, desarrollador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDesarrollo getTipoDesarrollo() {
		return tipoDesarrollo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDesarrollo(TipoDesarrollo newTipoDesarrollo) {
		TipoDesarrollo oldTipoDesarrollo = tipoDesarrollo;
		tipoDesarrollo = newTipoDesarrollo == null ? TIPO_DESARROLLO_EDEFAULT : newTipoDesarrollo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__TIPO_DESARROLLO, oldTipoDesarrollo, tipoDesarrollo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAplicacion getTipoAplicacion() {
		return tipoAplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoAplicacion(TipoAplicacion newTipoAplicacion) {
		TipoAplicacion oldTipoAplicacion = tipoAplicacion;
		tipoAplicacion = newTipoAplicacion == null ? TIPO_APLICACION_EDEFAULT : newTipoAplicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__TIPO_APLICACION, oldTipoAplicacion, tipoAplicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rango1_10 getComplejidad() {
		return complejidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplejidad(Rango1_10 newComplejidad) {
		Rango1_10 oldComplejidad = complejidad;
		complejidad = newComplejidad == null ? COMPLEJIDAD_EDEFAULT : newComplejidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__COMPLEJIDAD, oldComplejidad, complejidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rango1_10 getImportancia() {
		return importancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportancia(Rango1_10 newImportancia) {
		Rango1_10 oldImportancia = importancia;
		importancia = newImportancia == null ? IMPORTANCIA_EDEFAULT : newImportancia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.APLICACION__IMPORTANCIA, oldImportancia, importancia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectWithInverseResolvingEList.ManyInverse(Operacion.class, this, SimapaPackage.APLICACION__OPERACIONES, SimapaPackage.OPERACION__APLICACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicaciones getAplicaciones() {
		if (eContainerFeatureID != SimapaPackage.APLICACION__APLICACIONES) return null;
		return (Aplicaciones)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcedimientos() {
		if (procedimientos == null) {
			procedimientos = new EObjectWithInverseResolvingEList.ManyInverse(Procedimiento.class, this, SimapaPackage.APLICACION__PROCEDIMIENTOS, SimapaPackage.PROCEDIMIENTO__APLICACIONES);
		}
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.APLICACION__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicAdd(otherEnd, msgs);
			case SimapaPackage.APLICACION__APLICACIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.APLICACION__APLICACIONES, msgs);
			case SimapaPackage.APLICACION__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicAdd(otherEnd, msgs);
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
			case SimapaPackage.APLICACION__OPERACIONES:
				return ((InternalEList)getOperaciones()).basicRemove(otherEnd, msgs);
			case SimapaPackage.APLICACION__APLICACIONES:
				return eBasicSetContainer(null, SimapaPackage.APLICACION__APLICACIONES, msgs);
			case SimapaPackage.APLICACION__PROCEDIMIENTOS:
				return ((InternalEList)getProcedimientos()).basicRemove(otherEnd, msgs);
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
			case SimapaPackage.APLICACION__APLICACIONES:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.APLICACIONES__APLICACIONES, Aplicaciones.class, msgs);
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
			case SimapaPackage.APLICACION__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.APLICACION__NOMBRE:
				return getNombre();
			case SimapaPackage.APLICACION__DESCRIPCION:
				return getDescripcion();
			case SimapaPackage.APLICACION__CODIGO:
				return getCodigo();
			case SimapaPackage.APLICACION__HERRAMIENTA:
				return getHerramienta();
			case SimapaPackage.APLICACION__BASE_DE_DATOS:
				return getBaseDeDatos();
			case SimapaPackage.APLICACION__NUMERO_USUARIOS:
				return getNumeroUsuarios();
			case SimapaPackage.APLICACION__ESTADO_APLICACION:
				return getEstadoAplicacion();
			case SimapaPackage.APLICACION__NIVEL_SEGURIDAD:
				return getNivelSeguridad();
			case SimapaPackage.APLICACION__DESARROLLADOR:
				return getDesarrollador();
			case SimapaPackage.APLICACION__TIPO_DESARROLLO:
				return getTipoDesarrollo();
			case SimapaPackage.APLICACION__TIPO_APLICACION:
				return getTipoAplicacion();
			case SimapaPackage.APLICACION__COMPLEJIDAD:
				return getComplejidad();
			case SimapaPackage.APLICACION__IMPORTANCIA:
				return getImportancia();
			case SimapaPackage.APLICACION__OPERACIONES:
				return getOperaciones();
			case SimapaPackage.APLICACION__APLICACIONES:
				return getAplicaciones();
			case SimapaPackage.APLICACION__PROCEDIMIENTOS:
				return getProcedimientos();
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
			case SimapaPackage.APLICACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimapaPackage.APLICACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SimapaPackage.APLICACION__CODIGO:
				setCodigo((String)newValue);
				return;
			case SimapaPackage.APLICACION__HERRAMIENTA:
				setHerramienta((String)newValue);
				return;
			case SimapaPackage.APLICACION__BASE_DE_DATOS:
				setBaseDeDatos((String)newValue);
				return;
			case SimapaPackage.APLICACION__NUMERO_USUARIOS:
				setNumeroUsuarios((String)newValue);
				return;
			case SimapaPackage.APLICACION__ESTADO_APLICACION:
				setEstadoAplicacion((String)newValue);
				return;
			case SimapaPackage.APLICACION__NIVEL_SEGURIDAD:
				setNivelSeguridad((String)newValue);
				return;
			case SimapaPackage.APLICACION__DESARROLLADOR:
				setDesarrollador((String)newValue);
				return;
			case SimapaPackage.APLICACION__TIPO_DESARROLLO:
				setTipoDesarrollo((TipoDesarrollo)newValue);
				return;
			case SimapaPackage.APLICACION__TIPO_APLICACION:
				setTipoAplicacion((TipoAplicacion)newValue);
				return;
			case SimapaPackage.APLICACION__COMPLEJIDAD:
				setComplejidad((Rango1_10)newValue);
				return;
			case SimapaPackage.APLICACION__IMPORTANCIA:
				setImportancia((Rango1_10)newValue);
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
			case SimapaPackage.APLICACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__HERRAMIENTA:
				setHerramienta(HERRAMIENTA_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__BASE_DE_DATOS:
				setBaseDeDatos(BASE_DE_DATOS_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__NUMERO_USUARIOS:
				setNumeroUsuarios(NUMERO_USUARIOS_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__ESTADO_APLICACION:
				setEstadoAplicacion(ESTADO_APLICACION_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__NIVEL_SEGURIDAD:
				setNivelSeguridad(NIVEL_SEGURIDAD_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__DESARROLLADOR:
				setDesarrollador(DESARROLLADOR_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__TIPO_DESARROLLO:
				setTipoDesarrollo(TIPO_DESARROLLO_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__TIPO_APLICACION:
				setTipoAplicacion(TIPO_APLICACION_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__COMPLEJIDAD:
				setComplejidad(COMPLEJIDAD_EDEFAULT);
				return;
			case SimapaPackage.APLICACION__IMPORTANCIA:
				setImportancia(IMPORTANCIA_EDEFAULT);
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
			case SimapaPackage.APLICACION__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.APLICACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimapaPackage.APLICACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SimapaPackage.APLICACION__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SimapaPackage.APLICACION__HERRAMIENTA:
				return HERRAMIENTA_EDEFAULT == null ? herramienta != null : !HERRAMIENTA_EDEFAULT.equals(herramienta);
			case SimapaPackage.APLICACION__BASE_DE_DATOS:
				return BASE_DE_DATOS_EDEFAULT == null ? baseDeDatos != null : !BASE_DE_DATOS_EDEFAULT.equals(baseDeDatos);
			case SimapaPackage.APLICACION__NUMERO_USUARIOS:
				return NUMERO_USUARIOS_EDEFAULT == null ? numeroUsuarios != null : !NUMERO_USUARIOS_EDEFAULT.equals(numeroUsuarios);
			case SimapaPackage.APLICACION__ESTADO_APLICACION:
				return ESTADO_APLICACION_EDEFAULT == null ? estadoAplicacion != null : !ESTADO_APLICACION_EDEFAULT.equals(estadoAplicacion);
			case SimapaPackage.APLICACION__NIVEL_SEGURIDAD:
				return NIVEL_SEGURIDAD_EDEFAULT == null ? nivelSeguridad != null : !NIVEL_SEGURIDAD_EDEFAULT.equals(nivelSeguridad);
			case SimapaPackage.APLICACION__DESARROLLADOR:
				return DESARROLLADOR_EDEFAULT == null ? desarrollador != null : !DESARROLLADOR_EDEFAULT.equals(desarrollador);
			case SimapaPackage.APLICACION__TIPO_DESARROLLO:
				return tipoDesarrollo != TIPO_DESARROLLO_EDEFAULT;
			case SimapaPackage.APLICACION__TIPO_APLICACION:
				return tipoAplicacion != TIPO_APLICACION_EDEFAULT;
			case SimapaPackage.APLICACION__COMPLEJIDAD:
				return complejidad != COMPLEJIDAD_EDEFAULT;
			case SimapaPackage.APLICACION__IMPORTANCIA:
				return importancia != IMPORTANCIA_EDEFAULT;
			case SimapaPackage.APLICACION__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
			case SimapaPackage.APLICACION__APLICACIONES:
				return getAplicaciones() != null;
			case SimapaPackage.APLICACION__PROCEDIMIENTOS:
				return procedimientos != null && !procedimientos.isEmpty();
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
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", herramienta: ");
		result.append(herramienta);
		result.append(", baseDeDatos: ");
		result.append(baseDeDatos);
		result.append(", numeroUsuarios: ");
		result.append(numeroUsuarios);
		result.append(", estadoAplicacion: ");
		result.append(estadoAplicacion);
		result.append(", nivelSeguridad: ");
		result.append(nivelSeguridad);
		result.append(", desarrollador: ");
		result.append(desarrollador);
		result.append(", tipoDesarrollo: ");
		result.append(tipoDesarrollo);
		result.append(", tipoAplicacion: ");
		result.append(tipoAplicacion);
		result.append(", complejidad: ");
		result.append(complejidad);
		result.append(", importancia: ");
		result.append(importancia);
		result.append(')');
		return result.toString();
	}

} //AplicacionImpl