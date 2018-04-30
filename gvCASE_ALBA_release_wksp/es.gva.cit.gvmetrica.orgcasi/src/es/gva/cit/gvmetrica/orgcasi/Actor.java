
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getUnidades <em>Unidades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActorDeSucesos <em>Actor De Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActores <em>Actores</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \r\nif unidades->isEmpty() then \'\' else \' \'.concat( unidades->first().etiqueta) endif\r\n).concat(\r\nif unidades->size() > 1 then \'...\' else \'\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Nombre()
	 * @model default="" derived="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comentario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comentario</em>' attribute.
	 * @see #setComentario(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Unidades</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AUnidad}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AUnidad#getActoresSucesos <em>Actores Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidades</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidades</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Unidades()
	 * @see es.gva.cit.gvmetrica.orgcasi.AUnidad#getActoresSucesos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AUnidad" opposite="actoresSucesos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='actores.procedimiento.unidadesOrganicas.unidades->collect( aU | aU.oclAsType(AUnidad))->union(actores.procedimiento.unidadesExternas.unidades->collect( aU | aU.oclAsType(AUnidad)))'"
	 * @generated
	 */
	EList getUnidades();

	/**
	 * Returns the value of the '<em><b>Actor De Sucesos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor De Sucesos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor De Sucesos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_ActorDeSucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getActores
	 * @model type="es.gva.cit.gvmetrica.orgcasi.CActoresSuceso" opposite="actores" changeable="false"
	 * @generated
	 */
	EList getActorDeSucesos();

	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Accion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Acciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.Accion#getActores
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Accion" opposite="actores" changeable="false"
	 * @generated
	 */
	EList getAcciones();

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CActores#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' container reference.
	 * @see #setActores(CActores)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getActor_Actores()
	 * @see es.gva.cit.gvmetrica.orgcasi.CActores#getActores
	 * @model opposite="actores" required="true"
	 * @generated
	 */
	CActores getActores();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getActores <em>Actores</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actores</em>' container reference.
	 * @see #getActores()
	 * @generated
	 */
	void setActores(CActores value);

} // Actor