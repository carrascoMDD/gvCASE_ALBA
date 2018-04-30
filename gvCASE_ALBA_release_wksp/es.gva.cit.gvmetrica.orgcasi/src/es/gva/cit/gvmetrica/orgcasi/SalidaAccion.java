
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
 * A representation of the model object '<em><b>Salida Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas <em>Salidas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaAccion()
 * @model
 * @generated
 */
public interface SalidaAccion extends Salida {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaAccion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nsalidas.accion.etiqueta).concat(\r\nif destinos->isEmpty() then \'?\' else \'hacia \'.concat( destinos->first().oclAsType(EntradaAccion).etiquetaSimple) endif).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documento \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaAccion_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Accion \').concat(\r\nsalidas.accion.etiqueta)'"
	 * @generated
	 */
	String getEtiquetaSimple();

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' container reference.
	 * @see #setSalidas(CSalidasAccion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaAccion_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getSalidas
	 * @model opposite="salidas" required="true"
	 * @generated
	 */
	CSalidasAccion getSalidas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.SalidaAccion#getSalidas <em>Salidas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salidas</em>' container reference.
	 * @see #getSalidas()
	 * @generated
	 */
	void setSalidas(CSalidasAccion value);

} // SalidaAccion