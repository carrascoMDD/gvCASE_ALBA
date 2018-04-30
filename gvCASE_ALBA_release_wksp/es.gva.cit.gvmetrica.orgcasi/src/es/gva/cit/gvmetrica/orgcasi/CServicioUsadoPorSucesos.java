
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
 * A representation of the model object '<em><b>CServicio Usado Por Sucesos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio <em>Servicio</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getUsosServicio <em>Usos Servicio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicioUsadoPorSucesos()
 * @model
 * @generated
 */
public interface CServicioUsadoPorSucesos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicioUsadoPorSucesos_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\'Servicio \'.concat(   if servicio->isEmpty()  then \'?\' else  servicio.etiqueta endif).concat(\r\n \' Usado por sucesos \').concat(\r\nif usosServicio->isEmpty() then \'\' else usosServicio->first().etiquetaSimple endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Servicio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos <em>Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicio</em>' container reference.
	 * @see #setServicio(Servicio)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicioUsadoPorSucesos_Servicio()
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getUsadoPorSucesos
	 * @model opposite="usadoPorSucesos" required="true"
	 * @generated
	 */
	Servicio getServicio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CServicioUsadoPorSucesos#getServicio <em>Servicio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' container reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(Servicio value);

	/**
	 * Returns the value of the '<em><b>Usos Servicio</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.UsoServicio}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Servicio</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Servicio</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCServicioUsadoPorSucesos_UsosServicio()
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoServicio#getServicio
	 * @model type="es.gva.cit.gvmetrica.orgcasi.UsoServicio" opposite="servicio"
	 * @generated
	 */
	EList getUsosServicio();

} // CServicioUsadoPorSucesos