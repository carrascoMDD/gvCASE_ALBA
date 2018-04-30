
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
 * A representation of the model object '<em><b>CImportaciones Por</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios <em>Libreria Servicios</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getImportadoPor <em>Importado Por</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesPor()
 * @model
 * @generated
 */
public interface CImportacionesPor extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesPor_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\'de LibreriaServicios \'.concat(\r\n  if libreriaServicios->isEmpty()  then \'?\' else  libreriaServicios.etiqueta endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Libreria Servicios</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor <em>Importado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria Servicios</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria Servicios</em>' container reference.
	 * @see #setLibreriaServicios(LibreriaServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesPor_LibreriaServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.LibreriaServicios#getImportadoPor
	 * @model opposite="importadoPor" required="true"
	 * @generated
	 */
	LibreriaServicios getLibreriaServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CImportacionesPor#getLibreriaServicios <em>Libreria Servicios</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libreria Servicios</em>' container reference.
	 * @see #getLibreriaServicios()
	 * @generated
	 */
	void setLibreriaServicios(LibreriaServicios value);

	/**
	 * Returns the value of the '<em><b>Importado Por</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios <em>Libreria Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importado Por</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importado Por</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCImportacionesPor_ImportadoPor()
	 * @see es.gva.cit.gvmetrica.orgcasi.ImportacionServicios#getLibreriaServicios
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ImportacionServicios" opposite="libreriaServicios"
	 * @generated
	 */
	EList getImportadoPor();

} // CImportacionesPor