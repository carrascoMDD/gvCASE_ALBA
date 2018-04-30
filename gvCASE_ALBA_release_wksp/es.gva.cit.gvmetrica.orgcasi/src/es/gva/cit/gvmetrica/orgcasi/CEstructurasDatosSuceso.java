
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEstructuras Datos Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso <em>Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatosSuceso()
 * @model
 * @generated
 */
public interface CEstructurasDatosSuceso extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatosSuceso_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\' de \'.concat(suceso.etiqueta)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos <em>Estructuras Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatosSuceso_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos
	 * @model opposite="estructurasDatos" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getColeccionEstructuraDatosDeSuceso <em>Coleccion Estructura Datos De Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCEstructurasDatosSuceso_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getColeccionEstructuraDatosDeSuceso
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" opposite="coleccionEstructuraDatosDeSuceso"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='suceso.sucesos.procedimiento.todasEstructurasDatos'"
	 * @generated
	 */
	EList getEstructurasDatos();

} // CEstructurasDatosSuceso