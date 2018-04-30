
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Flujo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto <em>Producto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getTarea <em>Tarea</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoFlujo()
 * @model abstract="true"
 * @generated
 */
public interface UsoFlujo extends ProinsoObject {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoFlujo_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if producto->isEmpty() then \'?\' else producto.etiqueta endif).concat( \' en tarea \').concat(\r\nif tarea->isEmpty() then \'?\' else tarea.codigoYNombre endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Usable#getUsos <em>Usos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' reference.
	 * @see #setProducto(Usable)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoFlujo_Producto()
	 * @see es.gva.cit.gvmetrica.proinso.Usable#getUsos
	 * @model opposite="usos" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.productos.productos else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.productos.productos) endif'"
	 * @generated
	 */
	Usable getProducto();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getProducto <em>Producto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producto</em>' reference.
	 * @see #getProducto()
	 * @generated
	 */
	void setProducto(Usable value);

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tarea#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoFlujo_Tarea()
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getFlujos
	 * @model opposite="flujos" required="true" changeable="false"
	 * @generated
	 */
	Tarea getTarea();

} // UsoFlujo