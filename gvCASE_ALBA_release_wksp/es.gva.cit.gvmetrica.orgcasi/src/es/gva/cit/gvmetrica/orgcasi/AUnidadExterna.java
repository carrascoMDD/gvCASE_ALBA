
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.UnidadExterna;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUnidad Externa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidades <em>Unidades</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadExterna()
 * @model
 * @generated
 */
public interface AUnidadExterna extends AUnidad {
	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' reference.
	 * @see #setUnidad(UnidadExterna)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadExterna_Unidad()
	 * @model required="true"
	 * @generated
	 */
	UnidadExterna getUnidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidad <em>Unidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad</em>' reference.
	 * @see #getUnidad()
	 * @generated
	 */
	void setUnidad(UnidadExterna value);

	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' container reference.
	 * @see #setUnidades(CUnidadesExternas)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAUnidadExterna_Unidades()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas#getUnidades
	 * @model opposite="unidades" required="true"
	 * @generated
	 */
	CUnidadesExternas getUnidades();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.AUnidadExterna#getUnidades <em>Unidades</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidades</em>' container reference.
	 * @see #getUnidades()
	 * @generated
	 */
	void setUnidades(CUnidadesExternas value);

} // AUnidadExterna