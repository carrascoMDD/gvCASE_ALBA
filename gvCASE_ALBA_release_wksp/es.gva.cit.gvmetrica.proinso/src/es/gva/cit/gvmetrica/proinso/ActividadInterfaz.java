
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad Interfaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadInterfaz#getProceso <em>Proceso</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadInterfaz()
 * @model
 * @generated
 */
public interface ActividadInterfaz extends ActividadAbstracta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Proceso</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proceso</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proceso</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadInterfaz_Proceso()
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getActividades
	 * @model opposite="actividades" required="true" changeable="false"
	 * @generated
	 */
	ProcesoInterfaz getProceso();

} // ActividadInterfaz