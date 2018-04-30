
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Participacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Participacion#getTarea <em>Tarea</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante <em>Perfil Participante</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParticipacion()
 * @model
 * @generated
 */
public interface Participacion extends ProinsoObject {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParticipacion_Nombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(\'de \').concat(if perfilParticipante->isEmpty() then \'?\' else (if perfilParticipante.nombre.size() = 0 then \'~\' else perfilParticipante.nombre endif) endif).concat(\' en \').concat(tarea.codigoYNombre)'"
	 * @generated
	 */
	String getNombre();

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tarea#getParticipaciones <em>Participaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParticipacion_Tarea()
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getParticipaciones
	 * @model opposite="participaciones" required="true" changeable="false"
	 * @generated
	 */
	Tarea getTarea();

	/**
	 * Returns the value of the '<em><b>Perfil Participante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipaciones <em>Participaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfil Participante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfil Participante</em>' reference.
	 * @see #setPerfilParticipante(PerfilParticipante)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParticipacion_PerfilParticipante()
	 * @see es.gva.cit.gvmetrica.proinso.PerfilParticipante#getParticipaciones
	 * @model opposite="participaciones" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if tarea.actividad.oclIsTypeOf(Actividad) then tarea.actividad.oclAsType(Actividad).proceso.procesos.metodologia.perfilesParticipantes.perfilesParticipantes else (tarea.actividad.oclAsType(ActividadInterfaz).proceso.interfaz.interfaces.metodologia.perfilesParticipantes.perfilesParticipantes) endif'"
	 * @generated
	 */
	PerfilParticipante getPerfilParticipante();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Participacion#getPerfilParticipante <em>Perfil Participante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perfil Participante</em>' reference.
	 * @see #getPerfilParticipante()
	 * @generated
	 */
	void setPerfilParticipante(PerfilParticipante value);

} // Participacion