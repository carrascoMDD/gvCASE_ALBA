
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.impl;

import es.gva.cit.gvmetrica.proinso.Interfaces;
import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.PerfilesParticipantes;
import es.gva.cit.gvmetrica.proinso.Practicas;
import es.gva.cit.gvmetrica.proinso.Procesos;
import es.gva.cit.gvmetrica.proinso.Productos;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;
import es.gva.cit.gvmetrica.proinso.Repositorio;
import es.gva.cit.gvmetrica.proinso.Tecnicas;

import es.gva.cit.gvmetrica.proinso.util.ProinsoValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metodologia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getProductos <em>Productos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getPracticas <em>Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.impl.MetodologiaImpl#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetodologiaImpl extends ConDocumentacionImpl implements Metodologia {
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
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcesos() <em>Procesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesos()
	 * @generated
	 * @ordered
	 */
	protected Procesos procesos = null;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected Interfaces interfaces = null;

	/**
	 * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductos()
	 * @generated
	 * @ordered
	 */
	protected Productos productos = null;

	/**
	 * The cached value of the '{@link #getPerfilesParticipantes() <em>Perfiles Participantes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfilesParticipantes()
	 * @generated
	 * @ordered
	 */
	protected PerfilesParticipantes perfilesParticipantes = null;

	/**
	 * The cached value of the '{@link #getPracticas() <em>Practicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticas()
	 * @generated
	 * @ordered
	 */
	protected Practicas practicas = null;

	/**
	 * The cached value of the '{@link #getTecnicas() <em>Tecnicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnicas()
	 * @generated
	 * @ordered
	 */
	protected Tecnicas tecnicas = null;


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
	protected MetodologiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProinsoPackage.Literals.METODOLOGIA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procesos getProcesos() {
		return procesos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesos(Procesos newProcesos, NotificationChain msgs) {
		Procesos oldProcesos = procesos;
		procesos = newProcesos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PROCESOS, oldProcesos, newProcesos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesos(Procesos newProcesos) {
		if (newProcesos != procesos) {
			NotificationChain msgs = null;
			if (procesos != null)
				msgs = ((InternalEObject)procesos).eInverseRemove(this, ProinsoPackage.PROCESOS__METODOLOGIA, Procesos.class, msgs);
			if (newProcesos != null)
				msgs = ((InternalEObject)newProcesos).eInverseAdd(this, ProinsoPackage.PROCESOS__METODOLOGIA, Procesos.class, msgs);
			msgs = basicSetProcesos(newProcesos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PROCESOS, newProcesos, newProcesos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(Interfaces newInterfaces, NotificationChain msgs) {
		Interfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(Interfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, ProinsoPackage.INTERFACES__METODOLOGIA, Interfaces.class, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, ProinsoPackage.INTERFACES__METODOLOGIA, Interfaces.class, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productos getProductos() {
		return productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductos(Productos newProductos, NotificationChain msgs) {
		Productos oldProductos = productos;
		productos = newProductos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PRODUCTOS, oldProductos, newProductos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductos(Productos newProductos) {
		if (newProductos != productos) {
			NotificationChain msgs = null;
			if (productos != null)
				msgs = ((InternalEObject)productos).eInverseRemove(this, ProinsoPackage.PRODUCTOS__METODOLOGIA, Productos.class, msgs);
			if (newProductos != null)
				msgs = ((InternalEObject)newProductos).eInverseAdd(this, ProinsoPackage.PRODUCTOS__METODOLOGIA, Productos.class, msgs);
			msgs = basicSetProductos(newProductos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PRODUCTOS, newProductos, newProductos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfilesParticipantes getPerfilesParticipantes() {
		return perfilesParticipantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerfilesParticipantes(PerfilesParticipantes newPerfilesParticipantes, NotificationChain msgs) {
		PerfilesParticipantes oldPerfilesParticipantes = perfilesParticipantes;
		perfilesParticipantes = newPerfilesParticipantes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES, oldPerfilesParticipantes, newPerfilesParticipantes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerfilesParticipantes(PerfilesParticipantes newPerfilesParticipantes) {
		if (newPerfilesParticipantes != perfilesParticipantes) {
			NotificationChain msgs = null;
			if (perfilesParticipantes != null)
				msgs = ((InternalEObject)perfilesParticipantes).eInverseRemove(this, ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA, PerfilesParticipantes.class, msgs);
			if (newPerfilesParticipantes != null)
				msgs = ((InternalEObject)newPerfilesParticipantes).eInverseAdd(this, ProinsoPackage.PERFILES_PARTICIPANTES__METODOLOGIA, PerfilesParticipantes.class, msgs);
			msgs = basicSetPerfilesParticipantes(newPerfilesParticipantes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES, newPerfilesParticipantes, newPerfilesParticipantes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practicas getPracticas() {
		return practicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPracticas(Practicas newPracticas, NotificationChain msgs) {
		Practicas oldPracticas = practicas;
		practicas = newPracticas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PRACTICAS, oldPracticas, newPracticas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPracticas(Practicas newPracticas) {
		if (newPracticas != practicas) {
			NotificationChain msgs = null;
			if (practicas != null)
				msgs = ((InternalEObject)practicas).eInverseRemove(this, ProinsoPackage.PRACTICAS__METODOLOGIA, Practicas.class, msgs);
			if (newPracticas != null)
				msgs = ((InternalEObject)newPracticas).eInverseAdd(this, ProinsoPackage.PRACTICAS__METODOLOGIA, Practicas.class, msgs);
			msgs = basicSetPracticas(newPracticas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__PRACTICAS, newPracticas, newPracticas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnicas getTecnicas() {
		return tecnicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTecnicas(Tecnicas newTecnicas, NotificationChain msgs) {
		Tecnicas oldTecnicas = tecnicas;
		tecnicas = newTecnicas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__TECNICAS, oldTecnicas, newTecnicas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTecnicas(Tecnicas newTecnicas) {
		if (newTecnicas != tecnicas) {
			NotificationChain msgs = null;
			if (tecnicas != null)
				msgs = ((InternalEObject)tecnicas).eInverseRemove(this, ProinsoPackage.TECNICAS__METODOLOGIA, Tecnicas.class, msgs);
			if (newTecnicas != null)
				msgs = ((InternalEObject)newTecnicas).eInverseAdd(this, ProinsoPackage.TECNICAS__METODOLOGIA, Tecnicas.class, msgs);
			msgs = basicSetTecnicas(newTecnicas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProinsoPackage.METODOLOGIA__TECNICAS, newTecnicas, newTecnicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (eContainerFeatureID != ProinsoPackage.METODOLOGIA__REPOSITORIO) return null;
		return (Repositorio)eContainer();
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
						 ProinsoValidator.METODOLOGIA__NOMBRE_VALIDAR,
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
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				if (procesos != null)
					msgs = ((InternalEObject)procesos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__PROCESOS, null, msgs);
				return basicSetProcesos((Procesos)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				if (interfaces != null)
					msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__INTERFACES, null, msgs);
				return basicSetInterfaces((Interfaces)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				if (productos != null)
					msgs = ((InternalEObject)productos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__PRODUCTOS, null, msgs);
				return basicSetProductos((Productos)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				if (perfilesParticipantes != null)
					msgs = ((InternalEObject)perfilesParticipantes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES, null, msgs);
				return basicSetPerfilesParticipantes((PerfilesParticipantes)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				if (practicas != null)
					msgs = ((InternalEObject)practicas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__PRACTICAS, null, msgs);
				return basicSetPracticas((Practicas)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				if (tecnicas != null)
					msgs = ((InternalEObject)tecnicas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProinsoPackage.METODOLOGIA__TECNICAS, null, msgs);
				return basicSetTecnicas((Tecnicas)otherEnd, msgs);
			case ProinsoPackage.METODOLOGIA__REPOSITORIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ProinsoPackage.METODOLOGIA__REPOSITORIO, msgs);
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
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				return basicSetProcesos(null, msgs);
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				return basicSetProductos(null, msgs);
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				return basicSetPerfilesParticipantes(null, msgs);
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				return basicSetPracticas(null, msgs);
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				return basicSetTecnicas(null, msgs);
			case ProinsoPackage.METODOLOGIA__REPOSITORIO:
				return eBasicSetContainer(null, ProinsoPackage.METODOLOGIA__REPOSITORIO, msgs);
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
			case ProinsoPackage.METODOLOGIA__REPOSITORIO:
				return eInternalContainer().eInverseRemove(this, ProinsoPackage.REPOSITORIO__METODOLOGIAS, Repositorio.class, msgs);
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
			case ProinsoPackage.METODOLOGIA__NOMBRE:
				return getNombre();
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				return getProcesos();
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				return getInterfaces();
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				return getProductos();
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				return getPerfilesParticipantes();
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				return getPracticas();
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				return getTecnicas();
			case ProinsoPackage.METODOLOGIA__REPOSITORIO:
				return getRepositorio();
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
			case ProinsoPackage.METODOLOGIA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				setProcesos((Procesos)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				setInterfaces((Interfaces)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				setProductos((Productos)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				setPerfilesParticipantes((PerfilesParticipantes)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				setPracticas((Practicas)newValue);
				return;
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				setTecnicas((Tecnicas)newValue);
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
			case ProinsoPackage.METODOLOGIA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				setProcesos((Procesos)null);
				return;
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				setInterfaces((Interfaces)null);
				return;
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				setProductos((Productos)null);
				return;
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				setPerfilesParticipantes((PerfilesParticipantes)null);
				return;
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				setPracticas((Practicas)null);
				return;
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				setTecnicas((Tecnicas)null);
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
			case ProinsoPackage.METODOLOGIA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProinsoPackage.METODOLOGIA__PROCESOS:
				return procesos != null;
			case ProinsoPackage.METODOLOGIA__INTERFACES:
				return interfaces != null;
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
				return productos != null;
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
				return perfilesParticipantes != null;
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
				return practicas != null;
			case ProinsoPackage.METODOLOGIA__TECNICAS:
				return tecnicas != null;
			case ProinsoPackage.METODOLOGIA__REPOSITORIO:
				return getRepositorio() != null;
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
		result.append(')');
		return result.toString();
	}

} //MetodologiaImpl