
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.impl;

import es.gva.cit.simapa.FichaArchivistica;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TipoAccesoArchivo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ficha Archivistica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#isTieneValorLegal <em>Tiene Valor Legal</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#isTieneValorAdministrativo <em>Tiene Valor Administrativo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#isTieneValorInformativoHistorico <em>Tiene Valor Informativo Historico</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getTipoAcceso <em>Tipo Acceso</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getReglasEliminacion <em>Reglas Eliminacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getReglasConservacion <em>Reglas Conservacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.impl.FichaArchivisticaImpl#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichaArchivisticaImpl extends SimapaObjectImpl implements FichaArchivistica {
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
	 * The default value of the '{@link #isTieneValorLegal() <em>Tiene Valor Legal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorLegal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_VALOR_LEGAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieneValorLegal() <em>Tiene Valor Legal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorLegal()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneValorLegal = TIENE_VALOR_LEGAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isTieneValorAdministrativo() <em>Tiene Valor Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorAdministrativo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_VALOR_ADMINISTRATIVO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieneValorAdministrativo() <em>Tiene Valor Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorAdministrativo()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneValorAdministrativo = TIENE_VALOR_ADMINISTRATIVO_EDEFAULT;

	/**
	 * The default value of the '{@link #isTieneValorInformativoHistorico() <em>Tiene Valor Informativo Historico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorInformativoHistorico()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_VALOR_INFORMATIVO_HISTORICO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieneValorInformativoHistorico() <em>Tiene Valor Informativo Historico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneValorInformativoHistorico()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneValorInformativoHistorico = TIENE_VALOR_INFORMATIVO_HISTORICO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoAcceso() <em>Tipo Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAcceso()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAccesoArchivo TIPO_ACCESO_EDEFAULT = TipoAccesoArchivo.NO_ESTABLECIDO_LITERAL;

	/**
	 * The cached value of the '{@link #getTipoAcceso() <em>Tipo Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAcceso()
	 * @generated
	 * @ordered
	 */
	protected TipoAccesoArchivo tipoAcceso = TIPO_ACCESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReglasEliminacion() <em>Reglas Eliminacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasEliminacion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGLAS_ELIMINACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReglasEliminacion() <em>Reglas Eliminacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasEliminacion()
	 * @generated
	 * @ordered
	 */
	protected String reglasEliminacion = REGLAS_ELIMINACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReglasConservacion() <em>Reglas Conservacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasConservacion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGLAS_CONSERVACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReglasConservacion() <em>Reglas Conservacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasConservacion()
	 * @generated
	 * @ordered
	 */
	protected String reglasConservacion = REGLAS_CONSERVACION_EDEFAULT;

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
	protected FichaArchivisticaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimapaPackage.Literals.FICHA_ARCHIVISTICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) SimapaPackage.eINSTANCE.getFichaArchivistica().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("FichaArchivistica");
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
System.out.println("FichaArchivistica");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("FichaArchivistica");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "FichaArchivistica etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtiqueta(String newEtiqueta) {
		// TODO: implement this method to set the 'Etiqueta' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneValorLegal() {
		return tieneValorLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneValorLegal(boolean newTieneValorLegal) {
		boolean oldTieneValorLegal = tieneValorLegal;
		tieneValorLegal = newTieneValorLegal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL, oldTieneValorLegal, tieneValorLegal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneValorAdministrativo() {
		return tieneValorAdministrativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneValorAdministrativo(boolean newTieneValorAdministrativo) {
		boolean oldTieneValorAdministrativo = tieneValorAdministrativo;
		tieneValorAdministrativo = newTieneValorAdministrativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO, oldTieneValorAdministrativo, tieneValorAdministrativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneValorInformativoHistorico() {
		return tieneValorInformativoHistorico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneValorInformativoHistorico(boolean newTieneValorInformativoHistorico) {
		boolean oldTieneValorInformativoHistorico = tieneValorInformativoHistorico;
		tieneValorInformativoHistorico = newTieneValorInformativoHistorico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO, oldTieneValorInformativoHistorico, tieneValorInformativoHistorico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAccesoArchivo getTipoAcceso() {
		return tipoAcceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoAcceso(TipoAccesoArchivo newTipoAcceso) {
		TipoAccesoArchivo oldTipoAcceso = tipoAcceso;
		tipoAcceso = newTipoAcceso == null ? TIPO_ACCESO_EDEFAULT : newTipoAcceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO, oldTipoAcceso, tipoAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReglasEliminacion() {
		return reglasEliminacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReglasEliminacion(String newReglasEliminacion) {
		String oldReglasEliminacion = reglasEliminacion;
		reglasEliminacion = newReglasEliminacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION, oldReglasEliminacion, reglasEliminacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReglasConservacion() {
		return reglasConservacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReglasConservacion(String newReglasConservacion) {
		String oldReglasConservacion = reglasConservacion;
		reglasConservacion = newReglasConservacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION, oldReglasConservacion, reglasConservacion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES, oldObservaciones, observaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedimiento getProcedimiento() {
		if (eContainerFeatureID != SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO) return null;
		return (Procedimiento)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO, msgs);
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
			case SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO:
				return eBasicSetContainer(null, SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO, msgs);
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
			case SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO:
				return eInternalContainer().eInverseRemove(this, SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA, Procedimiento.class, msgs);
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
			case SimapaPackage.FICHA_ARCHIVISTICA__ETIQUETA:
				return getEtiqueta();
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL:
				return isTieneValorLegal() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO:
				return isTieneValorAdministrativo() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO:
				return isTieneValorInformativoHistorico() ? Boolean.TRUE : Boolean.FALSE;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO:
				return getTipoAcceso();
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION:
				return getReglasEliminacion();
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION:
				return getReglasConservacion();
			case SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES:
				return getObservaciones();
			case SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO:
				return getProcedimiento();
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
			case SimapaPackage.FICHA_ARCHIVISTICA__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL:
				setTieneValorLegal(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO:
				setTieneValorAdministrativo(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO:
				setTieneValorInformativoHistorico(((Boolean)newValue).booleanValue());
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO:
				setTipoAcceso((TipoAccesoArchivo)newValue);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION:
				setReglasEliminacion((String)newValue);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION:
				setReglasConservacion((String)newValue);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES:
				setObservaciones((String)newValue);
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
			case SimapaPackage.FICHA_ARCHIVISTICA__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL:
				setTieneValorLegal(TIENE_VALOR_LEGAL_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO:
				setTieneValorAdministrativo(TIENE_VALOR_ADMINISTRATIVO_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO:
				setTieneValorInformativoHistorico(TIENE_VALOR_INFORMATIVO_HISTORICO_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO:
				setTipoAcceso(TIPO_ACCESO_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION:
				setReglasEliminacion(REGLAS_ELIMINACION_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION:
				setReglasConservacion(REGLAS_CONSERVACION_EDEFAULT);
				return;
			case SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
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
			case SimapaPackage.FICHA_ARCHIVISTICA__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL:
				return tieneValorLegal != TIENE_VALOR_LEGAL_EDEFAULT;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO:
				return tieneValorAdministrativo != TIENE_VALOR_ADMINISTRATIVO_EDEFAULT;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO:
				return tieneValorInformativoHistorico != TIENE_VALOR_INFORMATIVO_HISTORICO_EDEFAULT;
			case SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO:
				return tipoAcceso != TIPO_ACCESO_EDEFAULT;
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION:
				return REGLAS_ELIMINACION_EDEFAULT == null ? reglasEliminacion != null : !REGLAS_ELIMINACION_EDEFAULT.equals(reglasEliminacion);
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION:
				return REGLAS_CONSERVACION_EDEFAULT == null ? reglasConservacion != null : !REGLAS_CONSERVACION_EDEFAULT.equals(reglasConservacion);
			case SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case SimapaPackage.FICHA_ARCHIVISTICA__PROCEDIMIENTO:
				return getProcedimiento() != null;
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
		result.append(" (tieneValorLegal: ");
		result.append(tieneValorLegal);
		result.append(", tieneValorAdministrativo: ");
		result.append(tieneValorAdministrativo);
		result.append(", tieneValorInformativoHistorico: ");
		result.append(tieneValorInformativoHistorico);
		result.append(", tipoAcceso: ");
		result.append(tipoAcceso);
		result.append(", reglasEliminacion: ");
		result.append(reglasEliminacion);
		result.append(", reglasConservacion: ");
		result.append(reglasConservacion);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(')');
		return result.toString();
	}

} //FichaArchivisticaImpl