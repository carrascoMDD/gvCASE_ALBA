
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidad Organica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getCodigoOrganico <em>Codigo Organico</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getUnidadDeProcedimientos <em>Unidad De Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getDescompone <em>Descompone</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getEstructurasFuncionales <em>Estructuras Funcionales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.UnidadOrganica#getResponsableDeProcedimientos <em>Responsable De Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica()
 * @model
 * @generated
 */
public interface UnidadOrganica extends Unidad, ContenedorUnidadOrganica {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.UnidadOrganica#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.UnidadOrganica#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Unidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Unidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Unidad</em>' attribute.
	 * @see #setTipoUnidad(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_TipoUnidad()
	 * @model
	 * @generated
	 */
	String getTipoUnidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.UnidadOrganica#getTipoUnidad <em>Tipo Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Unidad</em>' attribute.
	 * @see #getTipoUnidad()
	 * @generated
	 */
	void setTipoUnidad(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Organico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Organico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Organico</em>' attribute.
	 * @see #setCodigoOrganico(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_CodigoOrganico()
	 * @model
	 * @generated
	 */
	String getCodigoOrganico();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.UnidadOrganica#getCodigoOrganico <em>Codigo Organico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Organico</em>' attribute.
	 * @see #getCodigoOrganico()
	 * @generated
	 */
	void setCodigoOrganico(String value);

	/**
	 * Returns the value of the '<em><b>Unidad De Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getUnidades <em>Unidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad De Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad De Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_UnidadDeProcedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getUnidades
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="unidades"
	 * @generated
	 */
	EList getUnidadDeProcedimientos();

	/**
	 * Returns the value of the '<em><b>Descompone</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ContenedorUnidadOrganica#getDescomposicion <em>Descomposicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descompone</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descompone</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_Descompone()
	 * @see es.gva.cit.simapa.ContenedorUnidadOrganica#getDescomposicion
	 * @model opposite="descomposicion" required="true" changeable="false"
	 * @generated
	 */
	ContenedorUnidadOrganica getDescompone();

	/**
	 * Returns the value of the '<em><b>Estructuras Funcionales</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.EstructuraFuncional}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.EstructuraFuncional#getUnidadesOrganicas <em>Unidades Organicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Funcionales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Funcionales</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_EstructurasFuncionales()
	 * @see es.gva.cit.simapa.EstructuraFuncional#getUnidadesOrganicas
	 * @model type="es.gva.cit.simapa.EstructuraFuncional" opposite="unidadesOrganicas"
	 * @generated
	 */
	EList getEstructurasFuncionales();

	/**
	 * Returns the value of the '<em><b>Responsable De Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable De Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable De Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidadOrganica_ResponsableDeProcedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getResponsable
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="responsable" changeable="false"
	 * @generated
	 */
	EList getResponsableDeProcedimientos();

} // UnidadOrganica