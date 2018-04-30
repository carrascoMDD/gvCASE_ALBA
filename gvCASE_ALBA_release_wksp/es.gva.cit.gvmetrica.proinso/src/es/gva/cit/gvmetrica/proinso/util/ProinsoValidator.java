/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.util;

import es.gva.cit.gvmetrica.proinso.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage
 * @generated
 */
public class ProinsoValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProinsoValidator INSTANCE = new ProinsoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.gva.cit.gvmetrica.proinso";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Actividad Abstracta'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVIDAD_ABSTRACTA__NOMBRE_VALIDAR = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Codigo validar' of 'Actividad Abstracta'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVIDAD_ABSTRACTA__CODIGO_VALIDAR = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Predecesores validar' of 'Actividad Abstracta'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVIDAD_ABSTRACTA__PREDECESORES_VALIDAR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sucesores validar' of 'Actividad Abstracta'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVIDAD_ABSTRACTA__SUCESORES_VALIDAR = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Interfaz'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFAZ__NOMBRE_VALIDAR = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Codigo validar' of 'Interfaz'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFAZ__CODIGO_VALIDAR = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Metodologia'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METODOLOGIA__NOMBRE_VALIDAR = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Participante'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANTE__NOMBRE_VALIDAR = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Perfil Participante'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERFIL_PARTICIPANTE__NOMBRE_VALIDAR = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Practica'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRACTICA__NOMBRE_VALIDAR = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Proceso'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO__NOMBRE_VALIDAR = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Codigo validar' of 'Proceso'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO__CODIGO_VALIDAR = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Proceso Interfaz'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO_INTERFAZ__NOMBRE_VALIDAR = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Codigo validar' of 'Proceso Interfaz'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO_INTERFAZ__CODIGO_VALIDAR = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Producto'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCTO__NOMBRE_VALIDAR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Seccion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECCION__NOMBRE_VALIDAR = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__NOMBRE_VALIDAR = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Codigo validar' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__CODIGO_VALIDAR = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre validar' of 'Tecnica'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TECNICA__NOMBRE_VALIDAR = 19;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 19;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return ProinsoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case ProinsoPackage.ACTIVIDAD:
				return validateActividad((Actividad)value, diagnostics, context);
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA:
				return validateActividadAbstracta((ActividadAbstracta)value, diagnostics, context);
			case ProinsoPackage.ACTIVIDAD_INTERFAZ:
				return validateActividadInterfaz((ActividadInterfaz)value, diagnostics, context);
			case ProinsoPackage.CARGO:
				return validateCargo((Cargo)value, diagnostics, context);
			case ProinsoPackage.CON_DOCUMENTACION:
				return validateConDocumentacion((ConDocumentacion)value, diagnostics, context);
			case ProinsoPackage.COMITE:
				return validateComite((Comite)value, diagnostics, context);
			case ProinsoPackage.CON_MODEL_CLASS:
				return validateConModelClass((ConModelClass)value, diagnostics, context);
			case ProinsoPackage.DOCUMENTACION:
				return validateDocumentacion((Documentacion)value, diagnostics, context);
			case ProinsoPackage.ENTRADA:
				return validateEntrada((Entrada)value, diagnostics, context);
			case ProinsoPackage.INTERFACES:
				return validateInterfaces((Interfaces)value, diagnostics, context);
			case ProinsoPackage.INTERFAZ:
				return validateInterfaz((Interfaz)value, diagnostics, context);
			case ProinsoPackage.METODOLOGIA:
				return validateMetodologia((Metodologia)value, diagnostics, context);
			case ProinsoPackage.PARRAFO:
				return validateParrafo((Parrafo)value, diagnostics, context);
			case ProinsoPackage.PARTICIPACION:
				return validateParticipacion((Participacion)value, diagnostics, context);
			case ProinsoPackage.PARTICIPANTE:
				return validateParticipante((Participante)value, diagnostics, context);
			case ProinsoPackage.PERFILES_PARTICIPANTES:
				return validatePerfilesParticipantes((PerfilesParticipantes)value, diagnostics, context);
			case ProinsoPackage.PERFIL_PARTICIPANTE:
				return validatePerfilParticipante((PerfilParticipante)value, diagnostics, context);
			case ProinsoPackage.PRACTICA:
				return validatePractica((Practica)value, diagnostics, context);
			case ProinsoPackage.PRACTICAS:
				return validatePracticas((Practicas)value, diagnostics, context);
			case ProinsoPackage.PROCESO:
				return validateProceso((Proceso)value, diagnostics, context);
			case ProinsoPackage.PROCESO_INTERFAZ:
				return validateProcesoInterfaz((ProcesoInterfaz)value, diagnostics, context);
			case ProinsoPackage.PROCESOS:
				return validateProcesos((Procesos)value, diagnostics, context);
			case ProinsoPackage.PROINSO_COLLECTION:
				return validateProinsoCollection((ProinsoCollection)value, diagnostics, context);
			case ProinsoPackage.PROINSO_OBJECT:
				return validateProinsoObject((ProinsoObject)value, diagnostics, context);
			case ProinsoPackage.PRODUCTO:
				return validateProducto((Producto)value, diagnostics, context);
			case ProinsoPackage.PRODUCTOS:
				return validateProductos((Productos)value, diagnostics, context);
			case ProinsoPackage.REFERENCE_RUN:
				return validateReferenceRun((ReferenceRun)value, diagnostics, context);
			case ProinsoPackage.REFERENCIABLE:
				return validateReferenciable((Referenciable)value, diagnostics, context);
			case ProinsoPackage.REPOSITORIO:
				return validateRepositorio((Repositorio)value, diagnostics, context);
			case ProinsoPackage.RUN:
				return validateRun((Run)value, diagnostics, context);
			case ProinsoPackage.SALIDA:
				return validateSalida((Salida)value, diagnostics, context);
			case ProinsoPackage.SECCION:
				return validateSeccion((Seccion)value, diagnostics, context);
			case ProinsoPackage.TAREA:
				return validateTarea((Tarea)value, diagnostics, context);
			case ProinsoPackage.TECNICA:
				return validateTecnica((Tecnica)value, diagnostics, context);
			case ProinsoPackage.TECNICAS:
				return validateTecnicas((Tecnicas)value, diagnostics, context);
			case ProinsoPackage.TEXT_RUN:
				return validateTextRun((TextRun)value, diagnostics, context);
			case ProinsoPackage.USABLE:
				return validateUsable((Usable)value, diagnostics, context);
			case ProinsoPackage.USO_FLUJO:
				return validateUsoFlujo((UsoFlujo)value, diagnostics, context);
			case ProinsoPackage.USO_PRACTICA:
				return validateUsoPractica((UsoPractica)value, diagnostics, context);
			case ProinsoPackage.USO_TECNICA:
				return validateUsoTecnica((UsoTecnica)value, diagnostics, context);
			case ProinsoPackage.MODO_USO_ENTRADA_KIND:
				return validateModoUsoEntradaKind((ModoUsoEntradaKind)value, diagnostics, context);
			case ProinsoPackage.MODO_USO_SALIDA_KIND:
				return validateModoUsoSalidaKind((ModoUsoSalidaKind)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividad(Actividad actividad, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_nombre_validar(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_codigo_validar(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_predecesores_validar(actividad, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_sucesores_validar(actividad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadAbstracta(ActividadAbstracta actividadAbstracta, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_nombre_validar(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_codigo_validar(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_predecesores_validar(actividadAbstracta, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_sucesores_validar(actividadAbstracta, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadAbstracta_nombre_validar(ActividadAbstracta actividadAbstracta, DiagnosticChain diagnostics, Map context) {
		return actividadAbstracta.nombre_validar(diagnostics, context);
	}

	/**
	 * Validates the codigo_validar constraint of '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadAbstracta_codigo_validar(ActividadAbstracta actividadAbstracta, DiagnosticChain diagnostics, Map context) {
		return actividadAbstracta.codigo_validar(diagnostics, context);
	}

	/**
	 * Validates the predecesores_validar constraint of '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadAbstracta_predecesores_validar(ActividadAbstracta actividadAbstracta, DiagnosticChain diagnostics, Map context) {
		return actividadAbstracta.predecesores_validar(diagnostics, context);
	}

	/**
	 * Validates the sucesores_validar constraint of '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadAbstracta_sucesores_validar(ActividadAbstracta actividadAbstracta, DiagnosticChain diagnostics, Map context) {
		return actividadAbstracta.sucesores_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadInterfaz(ActividadInterfaz actividadInterfaz, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_nombre_validar(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_codigo_validar(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_predecesores_validar(actividadInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateActividadAbstracta_sucesores_validar(actividadInterfaz, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargo(Cargo cargo, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(cargo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cargo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cargo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cargo, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipante_nombre_validar(cargo, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConDocumentacion(ConDocumentacion conDocumentacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(conDocumentacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComite(Comite comite, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(comite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comite, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipante_nombre_validar(comite, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentacion(Documentacion documentacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntrada(Entrada entrada, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(entrada, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaces(Interfaces interfaces, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(interfaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaz(Interfaz interfaz, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaz_nombre_validar(interfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaz_codigo_validar(interfaz, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaz_nombre_validar(Interfaz interfaz, DiagnosticChain diagnostics, Map context) {
		return interfaz.nombre_validar(diagnostics, context);
	}

	/**
	 * Validates the codigo_validar constraint of '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaz_codigo_validar(Interfaz interfaz, DiagnosticChain diagnostics, Map context) {
		return interfaz.codigo_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetodologia(Metodologia metodologia, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(metodologia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metodologia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metodologia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metodologia, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetodologia_nombre_validar(metodologia, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Metodologia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetodologia_nombre_validar(Metodologia metodologia, DiagnosticChain diagnostics, Map context) {
		return metodologia.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParrafo(Parrafo parrafo, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(parrafo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipacion(Participacion participacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(participacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipante(Participante participante, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(participante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participante, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipante_nombre_validar(participante, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Participante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipante_nombre_validar(Participante participante, DiagnosticChain diagnostics, Map context) {
		return participante.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerfilesParticipantes(PerfilesParticipantes perfilesParticipantes, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(perfilesParticipantes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerfilParticipante(PerfilParticipante perfilParticipante, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(perfilParticipante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(perfilParticipante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(perfilParticipante, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(perfilParticipante, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerfilParticipante_nombre_validar(perfilParticipante, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Perfil Participante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerfilParticipante_nombre_validar(PerfilParticipante perfilParticipante, DiagnosticChain diagnostics, Map context) {
		return perfilParticipante.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractica(Practica practica, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(practica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(practica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(practica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(practica, diagnostics, context);
		if (result || diagnostics != null) result &= validatePractica_nombre_validar(practica, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Practica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractica_nombre_validar(Practica practica, DiagnosticChain diagnostics, Map context) {
		return practica.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePracticas(Practicas practicas, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(practicas, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceso(Proceso proceso, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(proceso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proceso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proceso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proceso, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceso_nombre_validar(proceso, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceso_codigo_validar(proceso, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceso_nombre_validar(Proceso proceso, DiagnosticChain diagnostics, Map context) {
		return proceso.nombre_validar(diagnostics, context);
	}

	/**
	 * Validates the codigo_validar constraint of '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceso_codigo_validar(Proceso proceso, DiagnosticChain diagnostics, Map context) {
		return proceso.codigo_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoInterfaz(ProcesoInterfaz procesoInterfaz, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(procesoInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procesoInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procesoInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procesoInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcesoInterfaz_nombre_validar(procesoInterfaz, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcesoInterfaz_codigo_validar(procesoInterfaz, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Proceso Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoInterfaz_nombre_validar(ProcesoInterfaz procesoInterfaz, DiagnosticChain diagnostics, Map context) {
		return procesoInterfaz.nombre_validar(diagnostics, context);
	}

	/**
	 * Validates the codigo_validar constraint of '<em>Proceso Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoInterfaz_codigo_validar(ProcesoInterfaz procesoInterfaz, DiagnosticChain diagnostics, Map context) {
		return procesoInterfaz.codigo_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesos(Procesos procesos, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(procesos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProinsoCollection(ProinsoCollection proinsoCollection, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(proinsoCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProinsoObject(ProinsoObject proinsoObject, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(proinsoObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducto(Producto producto, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(producto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(producto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(producto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(producto, diagnostics, context);
		if (result || diagnostics != null) result &= validateProducto_nombre_validar(producto, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducto_nombre_validar(Producto producto, DiagnosticChain diagnostics, Map context) {
		return producto.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductos(Productos productos, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(productos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceRun(ReferenceRun referenceRun, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(referenceRun, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenciable(Referenciable referenciable, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(referenciable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositorio(Repositorio repositorio, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(repositorio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRun(Run run, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(run, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalida(Salida salida, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(salida, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeccion(Seccion seccion, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(seccion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(seccion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(seccion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(seccion, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeccion_nombre_validar(seccion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Seccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeccion_nombre_validar(Seccion seccion, DiagnosticChain diagnostics, Map context) {
		return seccion.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea(Tarea tarea, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_nombre_validar(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_codigo_validar(tarea, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_nombre_validar(Tarea tarea, DiagnosticChain diagnostics, Map context) {
		return tarea.nombre_validar(diagnostics, context);
	}

	/**
	 * Validates the codigo_validar constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_codigo_validar(Tarea tarea, DiagnosticChain diagnostics, Map context) {
		return tarea.codigo_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTecnica(Tecnica tecnica, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(tecnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tecnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tecnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tecnica, diagnostics, context);
		if (result || diagnostics != null) result &= validateTecnica_nombre_validar(tecnica, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombre_validar constraint of '<em>Tecnica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTecnica_nombre_validar(Tecnica tecnica, DiagnosticChain diagnostics, Map context) {
		return tecnica.nombre_validar(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTecnicas(Tecnicas tecnicas, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(tecnicas, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextRun(TextRun textRun, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(textRun, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsable(Usable usable, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(usable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsoFlujo(UsoFlujo usoFlujo, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(usoFlujo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsoPractica(UsoPractica usoPractica, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(usoPractica, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsoTecnica(UsoTecnica usoTecnica, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(usoTecnica, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConModelClass(ConModelClass conModelClass, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(conModelClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModoUsoEntradaKind(ModoUsoEntradaKind modoUsoEntradaKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModoUsoSalidaKind(ModoUsoSalidaKind modoUsoSalidaKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //ProinsoValidator
