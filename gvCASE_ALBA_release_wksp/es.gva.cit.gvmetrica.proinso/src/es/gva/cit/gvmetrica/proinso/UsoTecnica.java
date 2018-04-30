
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Tecnica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTarea <em>Tarea</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica <em>Tecnica</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoTecnica()
 * @model
 * @generated
 */
public interface UsoTecnica extends ProinsoObject {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoTecnica_Nombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='( if tecnica->isEmpty() then \'~\' else (if tecnica.nombre.size() = 0 then \'~\' else tecnica.nombre endif)endif).concat( \' por \').concat(tarea.codigoYNombre)'"
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoTecnica_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoTecnicas <em>Uso Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoTecnica_Tarea()
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getUsoTecnicas
	 * @model opposite="usoTecnicas" required="true" changeable="false"
	 * @generated
	 */
	Tarea getTarea();

	/**
	 * Returns the value of the '<em><b>Tecnica</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getUsosTecnica <em>Usos Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnica</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnica</em>' reference.
	 * @see #setTecnica(Tecnica)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getUsoTecnica_Tecnica()
	 * @see es.gva.cit.gvmetrica.proinso.Tecnica#getUsosTecnica
	 * @model opposite="usosTecnica" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.tecnicas.tecnicas else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.tecnicas.tecnicas) endif'"
	 * @generated
	 */
	Tecnica getTecnica();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica <em>Tecnica</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnica</em>' reference.
	 * @see #getTecnica()
	 * @generated
	 */
	void setTecnica(Tecnica value);

} // UsoTecnica