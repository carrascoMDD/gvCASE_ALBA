/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage
 * @generated
 */
public interface ProinsoFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProinsoFactory eINSTANCE = es.gva.cit.gvmetrica.proinso.impl.ProinsoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad</em>'.
	 * @generated
	 */
	Actividad createActividad();

	/**
	 * Returns a new object of class '<em>Actividad Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Abstracta</em>'.
	 * @generated
	 */
	ActividadAbstracta createActividadAbstracta();

	/**
	 * Returns a new object of class '<em>Actividad Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Interfaz</em>'.
	 * @generated
	 */
	ActividadInterfaz createActividadInterfaz();

	/**
	 * Returns a new object of class '<em>Cargo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cargo</em>'.
	 * @generated
	 */
	Cargo createCargo();

	/**
	 * Returns a new object of class '<em>Comite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comite</em>'.
	 * @generated
	 */
	Comite createComite();

	/**
	 * Returns a new object of class '<em>Documentacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentacion</em>'.
	 * @generated
	 */
	Documentacion createDocumentacion();

	/**
	 * Returns a new object of class '<em>Entrada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrada</em>'.
	 * @generated
	 */
	Entrada createEntrada();

	/**
	 * Returns a new object of class '<em>Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaces</em>'.
	 * @generated
	 */
	Interfaces createInterfaces();

	/**
	 * Returns a new object of class '<em>Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaz</em>'.
	 * @generated
	 */
	Interfaz createInterfaz();

	/**
	 * Returns a new object of class '<em>Metodologia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metodologia</em>'.
	 * @generated
	 */
	Metodologia createMetodologia();

	/**
	 * Returns a new object of class '<em>Parrafo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parrafo</em>'.
	 * @generated
	 */
	Parrafo createParrafo();

	/**
	 * Returns a new object of class '<em>Participacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participacion</em>'.
	 * @generated
	 */
	Participacion createParticipacion();

	/**
	 * Returns a new object of class '<em>Perfiles Participantes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perfiles Participantes</em>'.
	 * @generated
	 */
	PerfilesParticipantes createPerfilesParticipantes();

	/**
	 * Returns a new object of class '<em>Perfil Participante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perfil Participante</em>'.
	 * @generated
	 */
	PerfilParticipante createPerfilParticipante();

	/**
	 * Returns a new object of class '<em>Practica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practica</em>'.
	 * @generated
	 */
	Practica createPractica();

	/**
	 * Returns a new object of class '<em>Practicas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practicas</em>'.
	 * @generated
	 */
	Practicas createPracticas();

	/**
	 * Returns a new object of class '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceso</em>'.
	 * @generated
	 */
	Proceso createProceso();

	/**
	 * Returns a new object of class '<em>Proceso Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceso Interfaz</em>'.
	 * @generated
	 */
	ProcesoInterfaz createProcesoInterfaz();

	/**
	 * Returns a new object of class '<em>Procesos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procesos</em>'.
	 * @generated
	 */
	Procesos createProcesos();

	/**
	 * Returns a new object of class '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto</em>'.
	 * @generated
	 */
	Producto createProducto();

	/**
	 * Returns a new object of class '<em>Productos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Productos</em>'.
	 * @generated
	 */
	Productos createProductos();

	/**
	 * Returns a new object of class '<em>Reference Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Run</em>'.
	 * @generated
	 */
	ReferenceRun createReferenceRun();

	/**
	 * Returns a new object of class '<em>Repositorio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repositorio</em>'.
	 * @generated
	 */
	Repositorio createRepositorio();

	/**
	 * Returns a new object of class '<em>Salida</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salida</em>'.
	 * @generated
	 */
	Salida createSalida();

	/**
	 * Returns a new object of class '<em>Seccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seccion</em>'.
	 * @generated
	 */
	Seccion createSeccion();

	/**
	 * Returns a new object of class '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea</em>'.
	 * @generated
	 */
	Tarea createTarea();

	/**
	 * Returns a new object of class '<em>Tecnica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tecnica</em>'.
	 * @generated
	 */
	Tecnica createTecnica();

	/**
	 * Returns a new object of class '<em>Tecnicas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tecnicas</em>'.
	 * @generated
	 */
	Tecnicas createTecnicas();

	/**
	 * Returns a new object of class '<em>Text Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Run</em>'.
	 * @generated
	 */
	TextRun createTextRun();

	/**
	 * Returns a new object of class '<em>Uso Practica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uso Practica</em>'.
	 * @generated
	 */
	UsoPractica createUsoPractica();

	/**
	 * Returns a new object of class '<em>Uso Tecnica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uso Tecnica</em>'.
	 * @generated
	 */
	UsoTecnica createUsoTecnica();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProinsoPackage getProinsoPackage();

} //ProinsoFactory
