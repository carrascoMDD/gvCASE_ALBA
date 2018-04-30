
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normativa YLegislacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getNormativas <em>Normativas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.NormativaYLegislacion#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion()
 * @model
 * @generated
 */
public interface NormativaYLegislacion extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.NormativaYLegislacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.NormativaYLegislacion#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.NormativaYLegislacion#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Normativas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.NormativasYLegislaciones#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normativas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normativas</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Normativas()
	 * @see es.gva.cit.simapa.NormativasYLegislaciones#getNormativas
	 * @model opposite="normativas" required="true" changeable="false"
	 * @generated
	 */
	NormativasYLegislaciones getNormativas();

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getNormativas <em>Normativas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getNormativaYLegislacion_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getNormativas
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="normativas" changeable="false"
	 * @generated
	 */
	EList getProcedimientos();

} // NormativaYLegislacion