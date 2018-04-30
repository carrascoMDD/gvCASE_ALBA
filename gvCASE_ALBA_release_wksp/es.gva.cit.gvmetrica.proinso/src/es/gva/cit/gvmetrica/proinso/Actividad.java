
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Actividad#getProceso <em>Proceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends ActividadAbstracta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Proceso</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Proceso#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proceso</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividad_Proceso()
	 * @see es.gva.cit.gvmetrica.proinso.Proceso#getActividades
	 * @model opposite="actividades" required="true" changeable="false"
	 * @generated
	 */
	Proceso getProceso();

} // Actividad