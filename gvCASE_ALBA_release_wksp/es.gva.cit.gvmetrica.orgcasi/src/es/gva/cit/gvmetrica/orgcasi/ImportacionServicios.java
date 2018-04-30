
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importacion Servicios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios <em>Importaciones Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportacionServicios()
 * @model
 * @generated
 */
public interface ImportacionServicios extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportacionServicios_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if importacionesServicios.importador.oclIsTypeOf( AProcedimiento) \r\nthen\r\n  \' por Procedimiento \'.concat(\r\n    importacionesServicios.importador.oclAsType( AProcedimiento).etiqueta.concat(\' de LibreriaServicios \').concat(\r\n      if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n    )\r\n  )\r\nelse\r\n  \' por LibreriaServicios \'.concat(\r\n    importacionesServicios.importador.oclAsType( LibreriaServicios).etiqueta.concat(\' de LibreriaServicios \').concat(\r\n      if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n    )\r\n  )\r\nendif\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Importaciones Servicios</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportacionesServicios <em>Importaciones Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importaciones Servicios</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importaciones Servicios</em>' container reference.
	 * @see #setImportacionesServicios(CImportacionesServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportacionServicios_ImportacionesServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesServicios#getImportacionesServicios
	 * @model opposite="importacionesServicios" required="true"
	 * @generated
	 */
	CImportacionesServicios getImportacionesServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getImportacionesServicios <em>Importaciones Servicios</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importaciones Servicios</em>' container reference.
	 * @see #getImportacionesServicios()
	 * @generated
	 */
	void setImportacionesServicios(CImportacionesServicios value);

	/**
	 * Returns the value of the '<em><b>Libreria Servicios</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getImportadoPor <em>Importado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria Servicios</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria Servicios</em>' reference.
	 * @see #setLibreriaServicios(CImportacionesPor)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getImportacionServicios_LibreriaServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getImportadoPor
	 * @model opposite="importadoPor"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if importacionesServicios.importador.oclIsTypeOf( AProcedimiento) \r\nthen\r\n  importacionesServicios.importador.oclAsType( AProcedimiento).repositorio.libreriasServicios.libreriasServicios.importadoPor\r\nelse\r\n  importacionesServicios.importador.oclAsType( LibreriaServicios).repositorio.libreriasServicios.libreriasServicios.importadoPor\r\nendif'"
	 * @generated
	 */
	CImportacionesPor getLibreriaServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios <em>Libreria Servicios</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libreria Servicios</em>' reference.
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	void setLibreriaServicios(CImportacionesPor value);

} // ImportacionServicios