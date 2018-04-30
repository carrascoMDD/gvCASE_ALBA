
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
 * A representation of the model object '<em><b>CUnidades</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidades()
 * @model
 * @generated
 */
public interface CUnidades extends OrgcasiCollection {
	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AUnidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidades_Unidades()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AUnidad" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='procedimiento.unidadesOrganicas.unidades->collect( aU | aU.oclAsType(AUnidad))->union(procedimiento.unidadesExternas.unidades->collect( aU | aU.oclAsType(AUnidad)))'"
	 * @generated
	 */
	EList getUnidades();

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see #setProcedimiento(AProcedimiento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getCUnidades_Procedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.AProcedimiento#getUnidades
	 * @model opposite="unidades" required="true"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.CUnidades#getProcedimiento <em>Procedimiento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedimiento</em>' container reference.
	 * @see #getProcedimiento()
	 * @generated
	 */
	void setProcedimiento(AProcedimiento value);

} // CUnidades