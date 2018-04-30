
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
 * A representation of the model object '<em><b>Salida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#getModoUso <em>Modo Uso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#getPostcondiciones <em>Postcondiciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#isForzado <em>Forzado</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Salida#getEntradas <em>Entradas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida()
 * @model
 * @generated
 */
public interface Salida extends UsoFlujo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_Nombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if guarda.size() < 1 then \'\' else \' condicional\' endif).concat((\' de \'.concat(if producto->isEmpty() then \'?\' else (if producto.oclIsTypeOf( Producto) then (if producto.oclAsType( Producto).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else (if producto.oclIsTypeOf( Seccion) then (if producto.oclAsType( Seccion).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else \'?\' endif) endif) endif)).concat( \' en \').concat( tarea.codigoYNombre )).concat(if guarda.size() < 1  then \'\' else \' si \'.concat(guarda) endif)'"
	 * @generated
	 */
	String getNombre();

	/**
	 * Returns the value of the '<em><b>Modo Uso</b></em>' attribute.
	 * The default value is <code>"Actualizacion"</code>.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modo Uso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modo Uso</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind
	 * @see #setModoUso(ModoUsoSalidaKind)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_ModoUso()
	 * @model default="Actualizacion"
	 * @generated
	 */
	ModoUsoSalidaKind getModoUso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Salida#getModoUso <em>Modo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modo Uso</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoSalidaKind
	 * @see #getModoUso()
	 * @generated
	 */
	void setModoUso(ModoUsoSalidaKind value);

	/**
	 * Returns the value of the '<em><b>Guarda</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarda</em>' attribute.
	 * @see #setGuarda(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_Guarda()
	 * @model default=""
	 * @generated
	 */
	String getGuarda();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Salida#getGuarda <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarda</em>' attribute.
	 * @see #getGuarda()
	 * @generated
	 */
	void setGuarda(String value);

	/**
	 * Returns the value of the '<em><b>Postcondiciones</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondiciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondiciones</em>' attribute.
	 * @see #setPostcondiciones(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_Postcondiciones()
	 * @model default=""
	 * @generated
	 */
	String getPostcondiciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Salida#getPostcondiciones <em>Postcondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondiciones</em>' attribute.
	 * @see #getPostcondiciones()
	 * @generated
	 */
	void setPostcondiciones(String value);

	/**
	 * Returns the value of the '<em><b>Forzado</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forzado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forzado</em>' attribute.
	 * @see #setForzado(boolean)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_Forzado()
	 * @model default="false"
	 * @generated
	 */
	boolean isForzado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Salida#isForzado <em>Forzado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forzado</em>' attribute.
	 * @see #isForzado()
	 * @generated
	 */
	void setForzado(boolean value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Entrada}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Entrada#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getSalida_Entradas()
	 * @see es.gva.cit.gvmetrica.proinso.Entrada#getSalidas
	 * @model type="es.gva.cit.gvmetrica.proinso.Entrada" opposite="salidas" changeable="false"
	 * @generated
	 */
	EList getEntradas();

} // Salida