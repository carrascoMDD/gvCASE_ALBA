
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Practica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getTarea <em>Tarea</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica <em>Practica</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoPractica()
 * @model
 * @generated
 */
public interface UsoPractica extends ProinsoObject {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoPractica_Nombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if practica->isEmpty() then \'~\' else (if practica.nombre.size() = 0 then \'~\' else practica.nombre endif) endif).concat( \' por \').concat(tarea.codigoYNombre)'"
	 * @generated
	 */
	String getNombre();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoPractica_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoPracticas <em>Uso Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoPractica_Tarea()
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getUsoPracticas
	 * @model opposite="usoPracticas" required="true" changeable="false"
	 * @generated
	 */
	Tarea getTarea();

	/**
	 * Returns the value of the '<em><b>Practica</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Practica#getUsosPractica <em>Usos Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practica</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practica</em>' reference.
	 * @see #setPractica(Practica)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoPractica_Practica()
	 * @see es.gva.cit.gvmetrica.proinso.Practica#getUsosPractica
	 * @model opposite="usosPractica" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.practicas.practicas else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.practicas.practicas) endif'"
	 * @generated
	 */
	Practica getPractica();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica <em>Practica</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practica</em>' reference.
	 * @see #getPractica()
	 * @generated
	 */
	void setPractica(Practica value);

} // UsoPractica