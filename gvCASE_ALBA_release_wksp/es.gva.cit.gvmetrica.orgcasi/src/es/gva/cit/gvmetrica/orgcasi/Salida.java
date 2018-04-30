
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
 * A representation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Salida#getDestinos <em>Destinos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalida()
 * @model
 * @generated
 */
public interface Salida extends EntradaOSalida {
	/**
	 * Returns the value of the '<em><b>Destinos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Entrada}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Entrada#getFuentes <em>Fuentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalida_Destinos()
	 * @see es.gva.cit.gvmetrica.orgcasi.Entrada#getFuentes
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Entrada" opposite="fuentes"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if self.oclIsTypeOf( SalidaSuceso)\r\nthen self.oclAsType( SalidaSuceso).salidas.suceso.procedimiento.todosSucesos.entradas.entradas \r\nelse\r\nif self.oclIsTypeOf( SalidaAccion)\r\nthen  self.oclAsType( SalidaAccion).salidas.accion.acciones.suceso.acciones.acciones.entradas.entradas \r\nelse\r\n  self.oclAsType(SalidaServicio).servicio.entradas\r\nendif\r\nendif\r\n'"
	 * @generated
	 */
	EList getDestinos();

} // Salida