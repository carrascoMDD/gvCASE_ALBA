
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
 * A representation of the model object '<em><b>Productos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Productos#getProductos <em>Productos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Productos#getMetodologia <em>Metodologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProductos()
 * @model
 * @generated
 */
public interface Productos extends ProinsoCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Productos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Producto}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Producto#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProductos_Productos()
	 * @see es.gva.cit.gvmetrica.proinso.Producto#getMetodologia
	 * @model type="es.gva.cit.gvmetrica.proinso.Producto" opposite="metodologia" containment="true"
	 * @generated
	 */
	EList getProductos();

	/**
	 * Returns the value of the '<em><b>Metodologia</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologia</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologia</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProductos_Metodologia()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getProductos
	 * @model opposite="productos" required="true" changeable="false"
	 * @generated
	 */
	Metodologia getMetodologia();

} // Productos