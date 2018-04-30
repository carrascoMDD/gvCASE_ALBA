
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libreria Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor <em>Importado Por</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodosDocumentos <em>Todos Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getTodasEstructurasDatos <em>Todas Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios()
 * @model
 * @generated
 */
public interface LibreriaServicios extends Agrupacion, ContenedorDocumentos, ContenedorDatos, ImportadorServicios {
	/**
	 * Returns the value of the '<em><b>Importado Por</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importado Por</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importado Por</em>' containment reference.
	 * @see #setImportadoPor(CImportacionesPor)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_ImportadoPor()
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios
	 * @model opposite="libreriaServicios" containment="true" required="true"
	 * @generated
	 */
	CImportacionesPor getImportadoPor();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor <em>Importado Por</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importado Por</em>' containment reference.
	 * @see #getImportadoPor()
	 * @generated
	 */
	void setImportadoPor(CImportacionesPor value);

	/**
	 * Returns the value of the '<em><b>Librerias Servicios</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getLibreriasServicios <em>Librerias Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librerias Servicios</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librerias Servicios</em>' container reference.
	 * @see #setLibreriasServicios(CLibreriasServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_LibreriasServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getLibreriasServicios
	 * @model opposite="libreriasServicios" required="true"
	 * @generated
	 */
	CLibreriasServicios getLibreriasServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getLibreriasServicios <em>Librerias Servicios</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Librerias Servicios</em>' container reference.
	 * @see #getLibreriasServicios()
	 * @generated
	 */
	void setLibreriasServicios(CLibreriasServicios value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(CInterfaces)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_Interfaces()
	 * @see es.gva.cit.gvmetrica.orgcasi.CInterfaces#getLibreriaServicios
	 * @model opposite="libreriaServicios" containment="true" required="true"
	 * @generated
	 */
	CInterfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(CInterfaces value);

	/**
	 * Returns the value of the '<em><b>Todos Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ADocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todos Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todos Documentos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_TodosDocumentos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ADocumento" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if importacionesServicios.importacionesServicios->isEmpty() or importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen documentos.documentos.todosDocumentos->asOrderedSet()\r\nelse\r\n  documentos.documentos.todosDocumentos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todosDocumentos.todosDocumentos->asOrderedSet()\r\n  )\r\nendif\r\n'"
	 * @generated
	 */
	EList getTodosDocumentos();

	/**
	 * Returns the value of the '<em><b>Todas Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todas Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todas Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_TodasEstructurasDatos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if  importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty())->size() < 1 \r\nthen estructurasDatos.estructurasDatos->asOrderedSet()\r\nelse\r\n  estructurasDatos.estructurasDatos->asOrderedSet()->union(\r\n     importacionesServicios.importacionesServicios.libreriaServicios->select(a | a->notEmpty()).libreriaServicios.todasEstructurasDatos->asOrderedSet()\r\n  )\r\nendif\r\n'"
	 * @generated
	 */
	EList getTodasEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getLibreriaServicios_Repositorio()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='libreriasServicios.repositorio'"
	 * @generated
	 */
	ARepositorio getRepositorio();

} // LibreriaServicios