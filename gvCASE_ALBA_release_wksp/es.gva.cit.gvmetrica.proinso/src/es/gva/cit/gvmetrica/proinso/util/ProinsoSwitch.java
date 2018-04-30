/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.util;

import es.gva.cit.gvmetrica.proinso.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage
 * @generated
 */
public class ProinsoSwitch {
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
	protected static ProinsoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProinsoSwitch() {
		if (modelPackage == null) {
			modelPackage = ProinsoPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProinsoPackage.ACTIVIDAD: {
				Actividad actividad = (Actividad)theEObject;
				Object result = caseActividad(actividad);
				if (result == null) result = caseActividadAbstracta(actividad);
				if (result == null) result = caseProinsoObject(actividad);
				if (result == null) result = caseConDocumentacion(actividad);
				if (result == null) result = caseReferenciable(actividad);
				if (result == null) result = caseConModelClass(actividad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA: {
				ActividadAbstracta actividadAbstracta = (ActividadAbstracta)theEObject;
				Object result = caseActividadAbstracta(actividadAbstracta);
				if (result == null) result = caseProinsoObject(actividadAbstracta);
				if (result == null) result = caseConDocumentacion(actividadAbstracta);
				if (result == null) result = caseReferenciable(actividadAbstracta);
				if (result == null) result = caseConModelClass(actividadAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.ACTIVIDAD_INTERFAZ: {
				ActividadInterfaz actividadInterfaz = (ActividadInterfaz)theEObject;
				Object result = caseActividadInterfaz(actividadInterfaz);
				if (result == null) result = caseActividadAbstracta(actividadInterfaz);
				if (result == null) result = caseProinsoObject(actividadInterfaz);
				if (result == null) result = caseConDocumentacion(actividadInterfaz);
				if (result == null) result = caseReferenciable(actividadInterfaz);
				if (result == null) result = caseConModelClass(actividadInterfaz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.CARGO: {
				Cargo cargo = (Cargo)theEObject;
				Object result = caseCargo(cargo);
				if (result == null) result = caseParticipante(cargo);
				if (result == null) result = caseProinsoObject(cargo);
				if (result == null) result = caseConDocumentacion(cargo);
				if (result == null) result = caseReferenciable(cargo);
				if (result == null) result = caseConModelClass(cargo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.CON_DOCUMENTACION: {
				ConDocumentacion conDocumentacion = (ConDocumentacion)theEObject;
				Object result = caseConDocumentacion(conDocumentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.COMITE: {
				Comite comite = (Comite)theEObject;
				Object result = caseComite(comite);
				if (result == null) result = caseParticipante(comite);
				if (result == null) result = caseProinsoObject(comite);
				if (result == null) result = caseConDocumentacion(comite);
				if (result == null) result = caseReferenciable(comite);
				if (result == null) result = caseConModelClass(comite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.CON_MODEL_CLASS: {
				ConModelClass conModelClass = (ConModelClass)theEObject;
				Object result = caseConModelClass(conModelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.DOCUMENTACION: {
				Documentacion documentacion = (Documentacion)theEObject;
				Object result = caseDocumentacion(documentacion);
				if (result == null) result = caseProinsoObject(documentacion);
				if (result == null) result = caseConModelClass(documentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.ENTRADA: {
				Entrada entrada = (Entrada)theEObject;
				Object result = caseEntrada(entrada);
				if (result == null) result = caseUsoFlujo(entrada);
				if (result == null) result = caseProinsoObject(entrada);
				if (result == null) result = caseConModelClass(entrada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.INTERFACES: {
				Interfaces interfaces = (Interfaces)theEObject;
				Object result = caseInterfaces(interfaces);
				if (result == null) result = caseProinsoCollection(interfaces);
				if (result == null) result = caseProinsoObject(interfaces);
				if (result == null) result = caseConModelClass(interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.INTERFAZ: {
				Interfaz interfaz = (Interfaz)theEObject;
				Object result = caseInterfaz(interfaz);
				if (result == null) result = caseProinsoObject(interfaz);
				if (result == null) result = caseConDocumentacion(interfaz);
				if (result == null) result = caseReferenciable(interfaz);
				if (result == null) result = caseConModelClass(interfaz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.METODOLOGIA: {
				Metodologia metodologia = (Metodologia)theEObject;
				Object result = caseMetodologia(metodologia);
				if (result == null) result = caseConDocumentacion(metodologia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PARRAFO: {
				Parrafo parrafo = (Parrafo)theEObject;
				Object result = caseParrafo(parrafo);
				if (result == null) result = caseProinsoObject(parrafo);
				if (result == null) result = caseConModelClass(parrafo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PARTICIPACION: {
				Participacion participacion = (Participacion)theEObject;
				Object result = caseParticipacion(participacion);
				if (result == null) result = caseProinsoObject(participacion);
				if (result == null) result = caseConModelClass(participacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PARTICIPANTE: {
				Participante participante = (Participante)theEObject;
				Object result = caseParticipante(participante);
				if (result == null) result = caseProinsoObject(participante);
				if (result == null) result = caseConDocumentacion(participante);
				if (result == null) result = caseReferenciable(participante);
				if (result == null) result = caseConModelClass(participante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PERFILES_PARTICIPANTES: {
				PerfilesParticipantes perfilesParticipantes = (PerfilesParticipantes)theEObject;
				Object result = casePerfilesParticipantes(perfilesParticipantes);
				if (result == null) result = caseProinsoCollection(perfilesParticipantes);
				if (result == null) result = caseProinsoObject(perfilesParticipantes);
				if (result == null) result = caseConModelClass(perfilesParticipantes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PERFIL_PARTICIPANTE: {
				PerfilParticipante perfilParticipante = (PerfilParticipante)theEObject;
				Object result = casePerfilParticipante(perfilParticipante);
				if (result == null) result = caseProinsoObject(perfilParticipante);
				if (result == null) result = caseConDocumentacion(perfilParticipante);
				if (result == null) result = caseReferenciable(perfilParticipante);
				if (result == null) result = caseConModelClass(perfilParticipante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PRACTICA: {
				Practica practica = (Practica)theEObject;
				Object result = casePractica(practica);
				if (result == null) result = caseProinsoObject(practica);
				if (result == null) result = caseConDocumentacion(practica);
				if (result == null) result = caseReferenciable(practica);
				if (result == null) result = caseConModelClass(practica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PRACTICAS: {
				Practicas practicas = (Practicas)theEObject;
				Object result = casePracticas(practicas);
				if (result == null) result = caseProinsoCollection(practicas);
				if (result == null) result = caseProinsoObject(practicas);
				if (result == null) result = caseConModelClass(practicas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PROCESO: {
				Proceso proceso = (Proceso)theEObject;
				Object result = caseProceso(proceso);
				if (result == null) result = caseProinsoObject(proceso);
				if (result == null) result = caseConDocumentacion(proceso);
				if (result == null) result = caseReferenciable(proceso);
				if (result == null) result = caseConModelClass(proceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PROCESO_INTERFAZ: {
				ProcesoInterfaz procesoInterfaz = (ProcesoInterfaz)theEObject;
				Object result = caseProcesoInterfaz(procesoInterfaz);
				if (result == null) result = caseProinsoObject(procesoInterfaz);
				if (result == null) result = caseConDocumentacion(procesoInterfaz);
				if (result == null) result = caseReferenciable(procesoInterfaz);
				if (result == null) result = caseConModelClass(procesoInterfaz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PROCESOS: {
				Procesos procesos = (Procesos)theEObject;
				Object result = caseProcesos(procesos);
				if (result == null) result = caseProinsoCollection(procesos);
				if (result == null) result = caseProinsoObject(procesos);
				if (result == null) result = caseConModelClass(procesos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PROINSO_COLLECTION: {
				ProinsoCollection proinsoCollection = (ProinsoCollection)theEObject;
				Object result = caseProinsoCollection(proinsoCollection);
				if (result == null) result = caseProinsoObject(proinsoCollection);
				if (result == null) result = caseConModelClass(proinsoCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PROINSO_OBJECT: {
				ProinsoObject proinsoObject = (ProinsoObject)theEObject;
				Object result = caseProinsoObject(proinsoObject);
				if (result == null) result = caseConModelClass(proinsoObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PRODUCTO: {
				Producto producto = (Producto)theEObject;
				Object result = caseProducto(producto);
				if (result == null) result = caseUsable(producto);
				if (result == null) result = caseProinsoObject(producto);
				if (result == null) result = caseConDocumentacion(producto);
				if (result == null) result = caseReferenciable(producto);
				if (result == null) result = caseConModelClass(producto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.PRODUCTOS: {
				Productos productos = (Productos)theEObject;
				Object result = caseProductos(productos);
				if (result == null) result = caseProinsoCollection(productos);
				if (result == null) result = caseProinsoObject(productos);
				if (result == null) result = caseConModelClass(productos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.REFERENCE_RUN: {
				ReferenceRun referenceRun = (ReferenceRun)theEObject;
				Object result = caseReferenceRun(referenceRun);
				if (result == null) result = caseTextRun(referenceRun);
				if (result == null) result = caseRun(referenceRun);
				if (result == null) result = caseProinsoObject(referenceRun);
				if (result == null) result = caseConModelClass(referenceRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.REFERENCIABLE: {
				Referenciable referenciable = (Referenciable)theEObject;
				Object result = caseReferenciable(referenciable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.REPOSITORIO: {
				Repositorio repositorio = (Repositorio)theEObject;
				Object result = caseRepositorio(repositorio);
				if (result == null) result = caseProinsoObject(repositorio);
				if (result == null) result = caseConModelClass(repositorio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.RUN: {
				Run run = (Run)theEObject;
				Object result = caseRun(run);
				if (result == null) result = caseProinsoObject(run);
				if (result == null) result = caseConModelClass(run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.SALIDA: {
				Salida salida = (Salida)theEObject;
				Object result = caseSalida(salida);
				if (result == null) result = caseUsoFlujo(salida);
				if (result == null) result = caseProinsoObject(salida);
				if (result == null) result = caseConModelClass(salida);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.SECCION: {
				Seccion seccion = (Seccion)theEObject;
				Object result = caseSeccion(seccion);
				if (result == null) result = caseUsable(seccion);
				if (result == null) result = caseProinsoObject(seccion);
				if (result == null) result = caseConDocumentacion(seccion);
				if (result == null) result = caseReferenciable(seccion);
				if (result == null) result = caseConModelClass(seccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.TAREA: {
				Tarea tarea = (Tarea)theEObject;
				Object result = caseTarea(tarea);
				if (result == null) result = caseConDocumentacion(tarea);
				if (result == null) result = caseReferenciable(tarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.TECNICA: {
				Tecnica tecnica = (Tecnica)theEObject;
				Object result = caseTecnica(tecnica);
				if (result == null) result = caseConDocumentacion(tecnica);
				if (result == null) result = caseReferenciable(tecnica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.TECNICAS: {
				Tecnicas tecnicas = (Tecnicas)theEObject;
				Object result = caseTecnicas(tecnicas);
				if (result == null) result = caseProinsoCollection(tecnicas);
				if (result == null) result = caseProinsoObject(tecnicas);
				if (result == null) result = caseConModelClass(tecnicas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.TEXT_RUN: {
				TextRun textRun = (TextRun)theEObject;
				Object result = caseTextRun(textRun);
				if (result == null) result = caseRun(textRun);
				if (result == null) result = caseProinsoObject(textRun);
				if (result == null) result = caseConModelClass(textRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.USABLE: {
				Usable usable = (Usable)theEObject;
				Object result = caseUsable(usable);
				if (result == null) result = caseProinsoObject(usable);
				if (result == null) result = caseConDocumentacion(usable);
				if (result == null) result = caseReferenciable(usable);
				if (result == null) result = caseConModelClass(usable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.USO_FLUJO: {
				UsoFlujo usoFlujo = (UsoFlujo)theEObject;
				Object result = caseUsoFlujo(usoFlujo);
				if (result == null) result = caseProinsoObject(usoFlujo);
				if (result == null) result = caseConModelClass(usoFlujo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.USO_PRACTICA: {
				UsoPractica usoPractica = (UsoPractica)theEObject;
				Object result = caseUsoPractica(usoPractica);
				if (result == null) result = caseProinsoObject(usoPractica);
				if (result == null) result = caseConModelClass(usoPractica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProinsoPackage.USO_TECNICA: {
				UsoTecnica usoTecnica = (UsoTecnica)theEObject;
				Object result = caseUsoTecnica(usoTecnica);
				if (result == null) result = caseProinsoObject(usoTecnica);
				if (result == null) result = caseConModelClass(usoTecnica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actividad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActividad(Actividad object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actividad Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActividadAbstracta(ActividadAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actividad Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actividad Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActividadInterfaz(ActividadInterfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Cargo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Cargo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCargo(Cargo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Con Documentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Con Documentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConDocumentacion(ConDocumentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Comite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Comite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComite(Comite object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Documentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Documentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentacion(Documentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entrada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntrada(Entrada object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterfaces(Interfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterfaz(Interfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Metodologia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Metodologia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMetodologia(Metodologia object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parrafo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parrafo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParrafo(Parrafo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Participacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Participacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParticipacion(Participacion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Participante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Participante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParticipante(Participante object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Perfiles Participantes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Perfiles Participantes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerfilesParticipantes(PerfilesParticipantes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Perfil Participante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Perfil Participante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerfilParticipante(PerfilParticipante object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Practica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Practica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePractica(Practica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Practicas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Practicas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePracticas(Practicas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Proceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProceso(Proceso object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Proceso Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Proceso Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcesoInterfaz(ProcesoInterfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Procesos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Procesos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcesos(Procesos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProinsoCollection(ProinsoCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProinsoObject(ProinsoObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Producto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProducto(Producto object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Productos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Productos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProductos(Productos object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Reference Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Reference Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferenceRun(ReferenceRun object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Referenciable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Referenciable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferenciable(Referenciable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repositorio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repositorio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepositorio(Repositorio object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Salida</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSalida(Salida object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Seccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Seccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSeccion(Seccion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tecnica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tecnica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTecnica(Tecnica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tecnicas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tecnicas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTecnicas(Tecnicas object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Text Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Text Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTextRun(TextRun object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Usable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Usable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsable(Usable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Flujo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Flujo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoFlujo(UsoFlujo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Practica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Practica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoPractica(UsoPractica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Uso Tecnica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Uso Tecnica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsoTecnica(UsoTecnica object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConModelClass(ConModelClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ProinsoSwitch
