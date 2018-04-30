
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.Aplicaciones;
import es.gva.cit.simapa.ClasesDocumento;
import es.gva.cit.simapa.Documentos;
import es.gva.cit.simapa.EstructurasFuncionales;
import es.gva.cit.simapa.Glosario;
import es.gva.cit.simapa.NormativasYLegislaciones;
import es.gva.cit.simapa.Procedimientos;
import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.UnidadesExternas;
import es.gva.cit.simapa.UnidadesOrganicas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repositorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getUnidadesOrganicas <em>Unidades Organicas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getUnidadesExternas <em>Unidades Externas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getClasesDocumento <em>Clases Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.RepositorioImpl#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositorioImpl extends SimapaObjectImpl implements Repositorio {
	/**
	 * The cached value of the '{@link #getProcedimientos() <em>Procedimientos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedimientos()
	 * @generated
	 * @ordered
	 */
	protected Procedimientos procedimientos = null;

	/**
	 * The cached value of the '{@link #getDocumentos() <em>Documentos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentos()
	 * @generated
	 * @ordered
	 */
	protected Documentos documentos = null;

	/**
	 * The cached value of the '{@link #getEstructurasFuncionales() <em>Estructuras Funcionales</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructurasFuncionales()
	 * @generated
	 * @ordered
	 */
	protected EstructurasFuncionales estructurasFuncionales = null;

	/**
	 * The cached value of the '{@link #getGlosario() <em>Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlosario()
	 * @generated
	 * @ordered
	 */
	protected Glosario glosario = null;

	/**
	 * The cached value of the '{@link #getNormativas() <em>Normativas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormativas()
	 * @generated
	 * @ordered
	 */
	protected NormativasYLegislaciones normativas = null;

	/**
	 * The cached value of the '{@link #getUnidadesOrganicas() <em>Unidades Organicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadesOrganicas()
	 * @generated
	 * @ordered
	 */
	protected UnidadesOrganicas unidadesOrganicas = null;

	/**
	 * The cached value of the '{@link #getUnidadesExternas() <em>Unidades Externas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidadesExternas()
	 * @generated
	 * @ordered
	 */
	protected UnidadesExternas unidadesExternas = null;

	/**
	 * The cached value of the '{@link #getClasesDocumento() <em>Clases Documento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasesDocumento()
	 * @generated
	 * @ordered
	 */
	protected ClasesDocumento clasesDocumento = null;

	/**
	 * The cached value of the '{@link #getAplicaciones() <em>Aplicaciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAplicaciones()
	 * @generated
	 * @ordered
	 */
	protected Aplicaciones aplicaciones = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositorioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.REPOSITORIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimientos getProcedimientos() {
		return procedimientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedimientos(Procedimientos newProcedimientos, NotificationChain msgs) {
		Procedimientos oldProcedimientos = procedimientos;
		procedimientos = newProcedimientos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__PROCEDIMIENTOS, oldProcedimientos, newProcedimientos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedimientos(Procedimientos newProcedimientos) {
		if (newProcedimientos != procedimientos) {
			NotificationChain msgs = null;
			if (procedimientos != null)
				msgs = ((InternalEObject)procedimientos).eInverseRemove(this, SimapaPackage.PROCEDIMIENTOS__REPOSITORIO, Procedimientos.class, msgs);
			if (newProcedimientos != null)
				msgs = ((InternalEObject)newProcedimientos).eInverseAdd(this, SimapaPackage.PROCEDIMIENTOS__REPOSITORIO, Procedimientos.class, msgs);
			msgs = basicSetProcedimientos(newProcedimientos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__PROCEDIMIENTOS, newProcedimientos, newProcedimientos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentos getDocumentos() {
		return documentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentos(Documentos newDocumentos, NotificationChain msgs) {
		Documentos oldDocumentos = documentos;
		documentos = newDocumentos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__DOCUMENTOS, oldDocumentos, newDocumentos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentos(Documentos newDocumentos) {
		if (newDocumentos != documentos) {
			NotificationChain msgs = null;
			if (documentos != null)
				msgs = ((InternalEObject)documentos).eInverseRemove(this, SimapaPackage.DOCUMENTOS__REPOSITORIO, Documentos.class, msgs);
			if (newDocumentos != null)
				msgs = ((InternalEObject)newDocumentos).eInverseAdd(this, SimapaPackage.DOCUMENTOS__REPOSITORIO, Documentos.class, msgs);
			msgs = basicSetDocumentos(newDocumentos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__DOCUMENTOS, newDocumentos, newDocumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstructurasFuncionales getEstructurasFuncionales() {
		return estructurasFuncionales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstructurasFuncionales(EstructurasFuncionales newEstructurasFuncionales, NotificationChain msgs) {
		EstructurasFuncionales oldEstructurasFuncionales = estructurasFuncionales;
		estructurasFuncionales = newEstructurasFuncionales;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES, oldEstructurasFuncionales, newEstructurasFuncionales);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructurasFuncionales(EstructurasFuncionales newEstructurasFuncionales) {
		if (newEstructurasFuncionales != estructurasFuncionales) {
			NotificationChain msgs = null;
			if (estructurasFuncionales != null)
				msgs = ((InternalEObject)estructurasFuncionales).eInverseRemove(this, SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO, EstructurasFuncionales.class, msgs);
			if (newEstructurasFuncionales != null)
				msgs = ((InternalEObject)newEstructurasFuncionales).eInverseAdd(this, SimapaPackage.ESTRUCTURAS_FUNCIONALES__REPOSITORIO, EstructurasFuncionales.class, msgs);
			msgs = basicSetEstructurasFuncionales(newEstructurasFuncionales, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES, newEstructurasFuncionales, newEstructurasFuncionales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glosario getGlosario() {
		return glosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosario(Glosario newGlosario, NotificationChain msgs) {
		Glosario oldGlosario = glosario;
		glosario = newGlosario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__GLOSARIO, oldGlosario, newGlosario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlosario(Glosario newGlosario) {
		if (newGlosario != glosario) {
			NotificationChain msgs = null;
			if (glosario != null)
				msgs = ((InternalEObject)glosario).eInverseRemove(this, SimapaPackage.GLOSARIO__REPOSITORIO, Glosario.class, msgs);
			if (newGlosario != null)
				msgs = ((InternalEObject)newGlosario).eInverseAdd(this, SimapaPackage.GLOSARIO__REPOSITORIO, Glosario.class, msgs);
			msgs = basicSetGlosario(newGlosario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__GLOSARIO, newGlosario, newGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormativasYLegislaciones getNormativas() {
		return normativas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormativas(NormativasYLegislaciones newNormativas, NotificationChain msgs) {
		NormativasYLegislaciones oldNormativas = normativas;
		normativas = newNormativas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__NORMATIVAS, oldNormativas, newNormativas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormativas(NormativasYLegislaciones newNormativas) {
		if (newNormativas != normativas) {
			NotificationChain msgs = null;
			if (normativas != null)
				msgs = ((InternalEObject)normativas).eInverseRemove(this, SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO, NormativasYLegislaciones.class, msgs);
			if (newNormativas != null)
				msgs = ((InternalEObject)newNormativas).eInverseAdd(this, SimapaPackage.NORMATIVAS_YLEGISLACIONES__REPOSITORIO, NormativasYLegislaciones.class, msgs);
			msgs = basicSetNormativas(newNormativas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__NORMATIVAS, newNormativas, newNormativas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesOrganicas getUnidadesOrganicas() {
		return unidadesOrganicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadesOrganicas(UnidadesOrganicas newUnidadesOrganicas, NotificationChain msgs) {
		UnidadesOrganicas oldUnidadesOrganicas = unidadesOrganicas;
		unidadesOrganicas = newUnidadesOrganicas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS, oldUnidadesOrganicas, newUnidadesOrganicas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadesOrganicas(UnidadesOrganicas newUnidadesOrganicas) {
		if (newUnidadesOrganicas != unidadesOrganicas) {
			NotificationChain msgs = null;
			if (unidadesOrganicas != null)
				msgs = ((InternalEObject)unidadesOrganicas).eInverseRemove(this, SimapaPackage.UNIDADES_ORGANICAS__REPOSITORIO, UnidadesOrganicas.class, msgs);
			if (newUnidadesOrganicas != null)
				msgs = ((InternalEObject)newUnidadesOrganicas).eInverseAdd(this, SimapaPackage.UNIDADES_ORGANICAS__REPOSITORIO, UnidadesOrganicas.class, msgs);
			msgs = basicSetUnidadesOrganicas(newUnidadesOrganicas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS, newUnidadesOrganicas, newUnidadesOrganicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadesExternas getUnidadesExternas() {
		return unidadesExternas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnidadesExternas(UnidadesExternas newUnidadesExternas, NotificationChain msgs) {
		UnidadesExternas oldUnidadesExternas = unidadesExternas;
		unidadesExternas = newUnidadesExternas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS, oldUnidadesExternas, newUnidadesExternas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidadesExternas(UnidadesExternas newUnidadesExternas) {
		if (newUnidadesExternas != unidadesExternas) {
			NotificationChain msgs = null;
			if (unidadesExternas != null)
				msgs = ((InternalEObject)unidadesExternas).eInverseRemove(this, SimapaPackage.UNIDADES_EXTERNAS__REPOSITORIO, UnidadesExternas.class, msgs);
			if (newUnidadesExternas != null)
				msgs = ((InternalEObject)newUnidadesExternas).eInverseAdd(this, SimapaPackage.UNIDADES_EXTERNAS__REPOSITORIO, UnidadesExternas.class, msgs);
			msgs = basicSetUnidadesExternas(newUnidadesExternas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS, newUnidadesExternas, newUnidadesExternas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasesDocumento getClasesDocumento() {
		return clasesDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasesDocumento(ClasesDocumento newClasesDocumento, NotificationChain msgs) {
		ClasesDocumento oldClasesDocumento = clasesDocumento;
		clasesDocumento = newClasesDocumento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO, oldClasesDocumento, newClasesDocumento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasesDocumento(ClasesDocumento newClasesDocumento) {
		if (newClasesDocumento != clasesDocumento) {
			NotificationChain msgs = null;
			if (clasesDocumento != null)
				msgs = ((InternalEObject)clasesDocumento).eInverseRemove(this, SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO, ClasesDocumento.class, msgs);
			if (newClasesDocumento != null)
				msgs = ((InternalEObject)newClasesDocumento).eInverseAdd(this, SimapaPackage.CLASES_DOCUMENTO__REPOSITORIO, ClasesDocumento.class, msgs);
			msgs = basicSetClasesDocumento(newClasesDocumento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO, newClasesDocumento, newClasesDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicaciones getAplicaciones() {
		return aplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAplicaciones(Aplicaciones newAplicaciones, NotificationChain msgs) {
		Aplicaciones oldAplicaciones = aplicaciones;
		aplicaciones = newAplicaciones;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__APLICACIONES, oldAplicaciones, newAplicaciones);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAplicaciones(Aplicaciones newAplicaciones) {
		if (newAplicaciones != aplicaciones) {
			NotificationChain msgs = null;
			if (aplicaciones != null)
				msgs = ((InternalEObject)aplicaciones).eInverseRemove(this, SimapaPackage.APLICACIONES__REPOSITORIO, Aplicaciones.class, msgs);
			if (newAplicaciones != null)
				msgs = ((InternalEObject)newAplicaciones).eInverseAdd(this, SimapaPackage.APLICACIONES__REPOSITORIO, Aplicaciones.class, msgs);
			msgs = basicSetAplicaciones(newAplicaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.REPOSITORIO__APLICACIONES, newAplicaciones, newAplicaciones));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				if (procedimientos != null)
					msgs = ((InternalEObject)procedimientos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__PROCEDIMIENTOS, null, msgs);
				return basicSetProcedimientos((Procedimientos)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				if (documentos != null)
					msgs = ((InternalEObject)documentos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__DOCUMENTOS, null, msgs);
				return basicSetDocumentos((Documentos)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				if (estructurasFuncionales != null)
					msgs = ((InternalEObject)estructurasFuncionales).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES, null, msgs);
				return basicSetEstructurasFuncionales((EstructurasFuncionales)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				if (glosario != null)
					msgs = ((InternalEObject)glosario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__GLOSARIO, null, msgs);
				return basicSetGlosario((Glosario)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				if (normativas != null)
					msgs = ((InternalEObject)normativas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__NORMATIVAS, null, msgs);
				return basicSetNormativas((NormativasYLegislaciones)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				if (unidadesOrganicas != null)
					msgs = ((InternalEObject)unidadesOrganicas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS, null, msgs);
				return basicSetUnidadesOrganicas((UnidadesOrganicas)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				if (unidadesExternas != null)
					msgs = ((InternalEObject)unidadesExternas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS, null, msgs);
				return basicSetUnidadesExternas((UnidadesExternas)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				if (clasesDocumento != null)
					msgs = ((InternalEObject)clasesDocumento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO, null, msgs);
				return basicSetClasesDocumento((ClasesDocumento)otherEnd, msgs);
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				if (aplicaciones != null)
					msgs = ((InternalEObject)aplicaciones).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimapaPackage.REPOSITORIO__APLICACIONES, null, msgs);
				return basicSetAplicaciones((Aplicaciones)otherEnd, msgs);
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
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				return basicSetProcedimientos(null, msgs);
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				return basicSetDocumentos(null, msgs);
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				return basicSetEstructurasFuncionales(null, msgs);
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				return basicSetGlosario(null, msgs);
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				return basicSetNormativas(null, msgs);
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				return basicSetUnidadesOrganicas(null, msgs);
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				return basicSetUnidadesExternas(null, msgs);
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				return basicSetClasesDocumento(null, msgs);
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				return basicSetAplicaciones(null, msgs);
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
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				return getProcedimientos();
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				return getDocumentos();
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				return getEstructurasFuncionales();
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				return getGlosario();
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				return getNormativas();
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				return getUnidadesOrganicas();
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				return getUnidadesExternas();
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				return getClasesDocumento();
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				return getAplicaciones();
			case SimapaPackage.REPOSITORIO__MODEL_PACKAGE:
				if (resolve) return getModelPackage();
				return basicGetModelPackage();
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
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				setProcedimientos((Procedimientos)newValue);
				return;
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				setDocumentos((Documentos)newValue);
				return;
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((EstructurasFuncionales)newValue);
				return;
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				setGlosario((Glosario)newValue);
				return;
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				setNormativas((NormativasYLegislaciones)newValue);
				return;
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				setUnidadesOrganicas((UnidadesOrganicas)newValue);
				return;
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				setUnidadesExternas((UnidadesExternas)newValue);
				return;
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				setClasesDocumento((ClasesDocumento)newValue);
				return;
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				setAplicaciones((Aplicaciones)newValue);
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
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				setProcedimientos((Procedimientos)null);
				return;
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				setDocumentos((Documentos)null);
				return;
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				setEstructurasFuncionales((EstructurasFuncionales)null);
				return;
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				setGlosario((Glosario)null);
				return;
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				setNormativas((NormativasYLegislaciones)null);
				return;
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				setUnidadesOrganicas((UnidadesOrganicas)null);
				return;
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				setUnidadesExternas((UnidadesExternas)null);
				return;
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				setClasesDocumento((ClasesDocumento)null);
				return;
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				setAplicaciones((Aplicaciones)null);
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
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
				return procedimientos != null;
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
				return documentos != null;
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
				return estructurasFuncionales != null;
			case SimapaPackage.REPOSITORIO__GLOSARIO:
				return glosario != null;
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
				return normativas != null;
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
				return unidadesOrganicas != null;
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
				return unidadesExternas != null;
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
				return clasesDocumento != null;
			case SimapaPackage.REPOSITORIO__APLICACIONES:
				return aplicaciones != null;
			case SimapaPackage.REPOSITORIO__MODEL_PACKAGE:
				return basicGetModelPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositorioImpl