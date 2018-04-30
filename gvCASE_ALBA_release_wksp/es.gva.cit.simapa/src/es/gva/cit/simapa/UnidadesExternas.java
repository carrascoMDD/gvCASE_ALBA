
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidades Externas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.UnidadesExternas#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getUnidadesExternas()
 * @model
 * @generated
 */
public interface UnidadesExternas extends ContenedorUnidadExterna {
	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Repositorio#getUnidadesExternas <em>Unidades Externas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadesExternas_Repositorio()
	 * @see es.gva.cit.simapa.Repositorio#getUnidadesExternas
	 * @model opposite="unidadesExternas" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();

} // UnidadesExternas