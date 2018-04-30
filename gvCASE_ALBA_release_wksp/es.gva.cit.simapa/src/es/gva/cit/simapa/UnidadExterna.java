
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidad Externa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.UnidadExterna#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadExterna#getDescompone <em>Descompone</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getUnidadExterna()
 * @model
 * @generated
 */
public interface UnidadExterna extends Unidad, ContenedorUnidadExterna {
	/**
	 * Returns the value of the '<em><b>Tipo Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Entidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Entidad</em>' attribute.
	 * @see #setTipoEntidad(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadExterna_TipoEntidad()
	 * @model
	 * @generated
	 */
	String getTipoEntidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.UnidadExterna#getTipoEntidad <em>Tipo Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Entidad</em>' attribute.
	 * @see #getTipoEntidad()
	 * @generated
	 */
	void setTipoEntidad(String value);

	/**
	 * Returns the value of the '<em><b>Descompone</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ContenedorUnidadExterna#getDescomposicion <em>Descomposicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descompone</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descompone</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadExterna_Descompone()
	 * @see es.gva.cit.simapa.ContenedorUnidadExterna#getDescomposicion
	 * @model opposite="descomposicion" required="true" changeable="false"
	 * @generated
	 */
	ContenedorUnidadExterna getDescompone();

} // UnidadExterna