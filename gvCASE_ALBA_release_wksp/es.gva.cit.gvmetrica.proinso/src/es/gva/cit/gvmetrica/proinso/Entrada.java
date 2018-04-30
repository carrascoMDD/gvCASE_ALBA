
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
 * A representation of the model object '<em><b>Entrada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Entrada#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Entrada#getModoUso <em>Modo Uso</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Entrada#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Entrada#getPrecondiciones <em>Precondiciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Entrada#getSalidas <em>Salidas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada()
 * @model
 * @generated
 */
public interface Entrada extends UsoFlujo {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada_Nombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if guarda.size() < 1 then \'\' else \' condicional\' endif).concat((\' de \'.concat(if producto->isEmpty() then \'?\' else (if producto.oclIsTypeOf( Producto) then (if producto.oclAsType( Producto).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else (if producto.oclIsTypeOf( Seccion) then (if producto.oclAsType( Seccion).nombre.size() > 0 then producto.oclAsType( Producto).nombre else \'~\' endif) else \'?\' endif) endif) endif)).concat( \' en \').concat( tarea.codigoYNombre )).concat(if guarda.size() < 1  then \'\' else \' si \'.concat(guarda) endif)'"
	 * @generated
	 */
	String getNombre();

	/**
	 * Returns the value of the '<em><b>Modo Uso</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modo Uso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modo Uso</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind
	 * @see #setModoUso(ModoUsoEntradaKind)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada_ModoUso()
	 * @model default=""
	 * @generated
	 */
	ModoUsoEntradaKind getModoUso();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Entrada#getModoUso <em>Modo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modo Uso</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ModoUsoEntradaKind
	 * @see #getModoUso()
	 * @generated
	 */
	void setModoUso(ModoUsoEntradaKind value);

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada_Guarda()
	 * @model default=""
	 * @generated
	 */
	String getGuarda();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Entrada#getGuarda <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarda</em>' attribute.
	 * @see #getGuarda()
	 * @generated
	 */
	void setGuarda(String value);

	/**
	 * Returns the value of the '<em><b>Precondiciones</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondiciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondiciones</em>' attribute.
	 * @see #setPrecondiciones(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada_Precondiciones()
	 * @model default=""
	 * @generated
	 */
	String getPrecondiciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Entrada#getPrecondiciones <em>Precondiciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondiciones</em>' attribute.
	 * @see #getPrecondiciones()
	 * @generated
	 */
	void setPrecondiciones(String value);

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Salida}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Salida#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getEntrada_Salidas()
	 * @see es.gva.cit.gvmetrica.proinso.Salida#getEntradas
	 * @model type="es.gva.cit.gvmetrica.proinso.Salida" opposite="entradas"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='(if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.procesos.procesos.actividades.tareas.flujos else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.procesos.procesos.actividades.tareas.flujos) endif)->select( aFlujo | aFlujo.oclIsTypeOf( Salida))'"
	 * @generated
	 */
	EList getSalidas();

} // Entrada