
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
 * A representation of the model object '<em><b>CUsado Por Sucesos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso <em>Suceso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getUsosSuceso <em>Usos Suceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSucesos()
 * @model
 * @generated
 */
public interface CUsadoPorSucesos extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSucesos_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if suceso->isEmpty()  then \'?\' else  suceso.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Suceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos <em>Usado Por Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso</em>' container reference.
	 * @see #setSuceso(Suceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSucesos_Suceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos
	 * @model opposite="usadoPorSucesos" required="true"
	 * @generated
	 */
	Suceso getSuceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso <em>Suceso</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso</em>' container reference.
	 * @see #getSuceso()
	 * @generated
	 */
	void setSuceso(Suceso value);

	/**
	 * Returns the value of the '<em><b>Usos Suceso</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado <em>Suceso Usado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Suceso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Suceso</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUsadoPorSucesos_UsosSuceso()
	 * @see es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado
	 * @model type="es.gva.cit.gvmetrica.orgcasi.UsoSuceso" opposite="sucesoUsado"
	 * @generated
	 */
	EList getUsosSuceso();

} // CUsadoPorSucesos