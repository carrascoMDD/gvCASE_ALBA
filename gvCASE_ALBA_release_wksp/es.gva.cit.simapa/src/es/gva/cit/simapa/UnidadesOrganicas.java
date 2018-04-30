
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidades Organicas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.UnidadesOrganicas#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getUnidadesOrganicas()
 * @model
 * @generated
 */
public interface UnidadesOrganicas extends ContenedorUnidadOrganica {
	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadesOrganicas_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getUnidadesOrganicas
	 * @model opposite="unidadesOrganicas" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // UnidadesOrganicas