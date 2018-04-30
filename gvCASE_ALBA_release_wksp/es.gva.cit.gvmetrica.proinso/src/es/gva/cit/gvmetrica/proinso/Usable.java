
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Usable#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Usable#getContenido <em>Contenido</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Usable#getUsos <em>Usos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsable()
 * @model abstract="true"
 * @generated
 */
public interface Usable extends ProinsoObject, ConDocumentacion, Referenciable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsable_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsTypeOf( Producto) then \r\n( if self.oclAsType( Producto).nombre->isEmpty() or self.oclAsType( Producto).nombre.size() < 0 then \'?\' else self.oclAsType( Producto).nombre endif)\r\nelse\r\n( if self.oclAsType( Seccion).nombre->isEmpty() or self.oclAsType( Seccion).nombre.size() < 0 then \'?\' else self.oclAsType( Seccion).nombre endif).concat( \' en \').concat( \r\n if self.oclAsType( Seccion).contenedor->isEmpty() then \'?\' else self.oclAsType( Seccion).contenedor.etiqueta endif\r\n)\r\nendif\r\n'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Seccion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Seccion#getContenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenido</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsable_Contenido()
	 * @see es.gva.cit.gvmetrica.proinso.Seccion#getContenedor
	 * @model type="es.gva.cit.gvmetrica.proinso.Seccion" opposite="contenedor" containment="true"
	 * @generated
	 */
	EList getContenido();

	/**
	 * Returns the value of the '<em><b>Usos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoFlujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsable_Usos()
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoFlujo" opposite="producto" changeable="false"
	 * @generated
	 */
	EList getUsos();

} // Usable