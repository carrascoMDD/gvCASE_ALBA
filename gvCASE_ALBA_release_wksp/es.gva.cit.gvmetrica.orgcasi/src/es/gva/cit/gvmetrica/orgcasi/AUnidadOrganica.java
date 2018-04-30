
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.UnidadOrganica;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUnidad Organica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades <em>Unidades</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadOrganica()
 * @model
 * @generated
 */
public interface AUnidadOrganica extends AUnidad {
	/**
	 * Returns the value of the '<em><b>Tipo Unidad</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.orgcasi.TipoUnidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Unidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Unidad</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUnidad
	 * @see #setTipoUnidad(TipoUnidad)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadOrganica_TipoUnidad()
	 * @model
	 * @generated
	 */
	TipoUnidad getTipoUnidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Unidad</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoUnidad
	 * @see #getTipoUnidad()
	 * @generated
	 */
	void setTipoUnidad(TipoUnidad value);

	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' reference.
	 * @see #setUnidad(UnidadOrganica)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadOrganica_Unidad()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='unidades.procedimiento.procedimiento.unidades->closure( descomposicion)'"
	 * @generated
	 */
	UnidadOrganica getUnidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidad <em>Unidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad</em>' reference.
	 * @see #getUnidad()
	 * @generated
	 */
	void setUnidad(UnidadOrganica value);

	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' container reference.
	 * @see #setUnidades(CUnidadesOrganicas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadOrganica_Unidades()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas#getUnidades
	 * @model opposite="unidades" required="true"
	 * @generated
	 */
	CUnidadesOrganicas getUnidades();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica#getUnidades <em>Unidades</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades</em>' container reference.
	 * @see #getUnidades()
	 * @generated
	 */
	void setUnidades(CUnidadesOrganicas value);

} // AUnidadOrganica