
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
 * A representation of the model object '<em><b>Entrada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Entrada#getFuentes <em>Fuentes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntrada()
 * @model
 * @generated
 */
public interface Entrada extends EntradaOSalida {
	/**
	 * Returns the value of the '<em><b>Fuentes</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Salida}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Salida#getDestinos <em>Destinos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuentes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuentes</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntrada_Fuentes()
	 * @see es.gva.cit.gvmetrica.orgcasi.Salida#getDestinos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Salida" opposite="destinos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if self.oclIsTypeOf( EntradaSuceso)\r\nthen self.oclAsType( EntradaSuceso).entradas.suceso.procedimiento.todosSucesos.salidas.salidas \r\nelse\r\nif self.oclIsTypeOf( EntradaAccion)\r\nthen  self.oclAsType( EntradaAccion).entradas.accion.acciones.suceso.acciones.acciones.salidas.salidas \r\nelse\r\n  self.oclAsType( EntradaServicio).servicio.salidas\r\nendif\r\nendif\r\n'"
	 * @generated
	 */
	EList getFuentes();

} // Entrada