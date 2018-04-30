
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
 * A representation of the model object '<em><b>Entrada Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas <em>Entradas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaAccion()
 * @model
 * @generated
 */
public interface EntradaAccion extends Entrada {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaAccion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nentradas.accion.etiqueta).concat(\r\nif fuentes->isEmpty() then \'?\' else \'desde \'.concat( fuentes->first().oclAsType(SalidaAccion).etiquetaSimple) endif).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructursaDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaAccion_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nentradas.accion.etiqueta)'"
	 * @generated
	 */
	String getEtiquetaSimple();

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' container reference.
	 * @see #setEntradas(CEntradasAccion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaAccion_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getEntradas
	 * @model opposite="entradas" required="true"
	 * @generated
	 */
	CEntradasAccion getEntradas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaAccion#getEntradas <em>Entradas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entradas</em>' container reference.
	 * @see #getEntradas()
	 * @generated
	 */
	void setEntradas(CEntradasAccion value);

} // EntradaAccion