/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.impl;

import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios;
import es.gva.cit.gvmetrica.orgcasi.CProcedimientos;
import es.gva.cit.gvmetrica.orgcasi.CProveedoresServicios;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

import es.gva.cit.simapa.Repositorio;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARepositorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl#getAnotacionesProcedimiento <em>Anotaciones Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl#getModelPackage <em>Model Package</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.impl.ARepositorioImpl#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ARepositorioImpl extends AnotacionImpl implements ARepositorio {
	/**
	 * The cached value of the '{@link #getAnotacionesProcedimiento() <em>Anotaciones Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotacionesProcedimiento()
	 * @generated
	 * @ordered
	 */
	protected CProcedimientos anotacionesProcedimiento = null;

	/**
	 * The cached value of the '{@link #getRepositorio() <em>Repositorio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorio()
	 * @generated
	 * @ordered
	 */
	protected Repositorio repositorio = null;

	/**
	 * The cached value of the '{@link #getLibreriasServicios() <em>Librerias Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreriasServicios()
	 * @generated
	 * @ordered
	 */
	protected CLibreriasServicios libreriasServicios = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	protected ARepositorioImpl() {
		super();
		
		setAnotacionesProcedimiento( OrgcasiFactory.eINSTANCE.createCProcedimientos());
		setLibreriasServicios( OrgcasiFactory.eINSTANCE.createCLibreriasServicios());	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrgcasiPackage.Literals.AREPOSITORIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CProcedimientos getAnotacionesProcedimiento() {
		return anotacionesProcedimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnotacionesProcedimiento(CProcedimientos newAnotacionesProcedimiento, NotificationChain msgs) {
		CProcedimientos oldAnotacionesProcedimiento = anotacionesProcedimiento;
		anotacionesProcedimiento = newAnotacionesProcedimiento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO, oldAnotacionesProcedimiento, newAnotacionesProcedimiento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotacionesProcedimiento(CProcedimientos newAnotacionesProcedimiento) {
		if (newAnotacionesProcedimiento != anotacionesProcedimiento) {
			NotificationChain msgs = null;
			if (anotacionesProcedimiento != null)
				msgs = ((InternalEObject)anotacionesProcedimiento).eInverseRemove(this, OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO, CProcedimientos.class, msgs);
			if (newAnotacionesProcedimiento != null)
				msgs = ((InternalEObject)newAnotacionesProcedimiento).eInverseAdd(this, OrgcasiPackage.CPROCEDIMIENTOS__REPOSITORIO, CProcedimientos.class, msgs);
			msgs = basicSetAnotacionesProcedimiento(newAnotacionesProcedimiento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO, newAnotacionesProcedimiento, newAnotacionesProcedimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio getRepositorio() {
		if (repositorio != null && repositorio.eIsProxy()) {
			InternalEObject oldRepositorio = (InternalEObject)repositorio;
			repositorio = (Repositorio)eResolveProxy(oldRepositorio);
			if (repositorio != oldRepositorio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgcasiPackage.AREPOSITORIO__REPOSITORIO, oldRepositorio, repositorio));
			}
		}
		return repositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repositorio basicGetRepositorio() {
		return repositorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositorio(Repositorio newRepositorio) {
		Repositorio oldRepositorio = repositorio;
		repositorio = newRepositorio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AREPOSITORIO__REPOSITORIO, oldRepositorio, repositorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getModelPackage() {
		EPackage modelPackage = basicGetModelPackage();
		return modelPackage != null && modelPackage.eIsProxy() ? (EPackage)eResolveProxy((InternalEObject)modelPackage) : modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public EPackage basicGetModelPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return this.eClass().getEPackage();
		
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLibreriasServicios getLibreriasServicios() {
		return libreriasServicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreriasServicios(CLibreriasServicios newLibreriasServicios, NotificationChain msgs) {
		CLibreriasServicios oldLibreriasServicios = libreriasServicios;
		libreriasServicios = newLibreriasServicios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS, oldLibreriasServicios, newLibreriasServicios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreriasServicios(CLibreriasServicios newLibreriasServicios) {
		if (newLibreriasServicios != libreriasServicios) {
			NotificationChain msgs = null;
			if (libreriasServicios != null)
				msgs = ((InternalEObject)libreriasServicios).eInverseRemove(this, OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO, CLibreriasServicios.class, msgs);
			if (newLibreriasServicios != null)
				msgs = ((InternalEObject)newLibreriasServicios).eInverseAdd(this, OrgcasiPackage.CLIBRERIAS_SERVICIOS__REPOSITORIO, CLibreriasServicios.class, msgs);
			msgs = basicSetLibreriasServicios(newLibreriasServicios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS, newLibreriasServicios, newLibreriasServicios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				if (anotacionesProcedimiento != null)
					msgs = ((InternalEObject)anotacionesProcedimiento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO, null, msgs);
				return basicSetAnotacionesProcedimiento((CProcedimientos)otherEnd, msgs);
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				if (libreriasServicios != null)
					msgs = ((InternalEObject)libreriasServicios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS, null, msgs);
				return basicSetLibreriasServicios((CLibreriasServicios)otherEnd, msgs);
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
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				return basicSetAnotacionesProcedimiento(null, msgs);
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				return basicSetLibreriasServicios(null, msgs);
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
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				return getAnotacionesProcedimiento();
			case OrgcasiPackage.AREPOSITORIO__REPOSITORIO:
				if (resolve) return getRepositorio();
				return basicGetRepositorio();
			case OrgcasiPackage.AREPOSITORIO__MODEL_PACKAGE:
				if (resolve) return getModelPackage();
				return basicGetModelPackage();
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				return getLibreriasServicios();
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
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				setAnotacionesProcedimiento((CProcedimientos)newValue);
				return;
			case OrgcasiPackage.AREPOSITORIO__REPOSITORIO:
				setRepositorio((Repositorio)newValue);
				return;
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				setLibreriasServicios((CLibreriasServicios)newValue);
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
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				setAnotacionesProcedimiento((CProcedimientos)null);
				return;
			case OrgcasiPackage.AREPOSITORIO__REPOSITORIO:
				setRepositorio((Repositorio)null);
				return;
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				setLibreriasServicios((CLibreriasServicios)null);
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
			case OrgcasiPackage.AREPOSITORIO__ANOTACIONES_PROCEDIMIENTO:
				return anotacionesProcedimiento != null;
			case OrgcasiPackage.AREPOSITORIO__REPOSITORIO:
				return repositorio != null;
			case OrgcasiPackage.AREPOSITORIO__MODEL_PACKAGE:
				return basicGetModelPackage() != null;
			case OrgcasiPackage.AREPOSITORIO__LIBRERIAS_SERVICIOS:
				return libreriasServicios != null;
		}
		return super.eIsSet(featureID);
	}

} //ARepositorioImpl