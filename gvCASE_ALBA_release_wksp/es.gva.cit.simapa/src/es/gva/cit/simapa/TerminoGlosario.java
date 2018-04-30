
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
 * A representation of the model object '<em><b>Termino Glosario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.TerminoGlosario#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TerminoGlosario#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TerminoGlosario#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TerminoGlosario#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.TerminoGlosario#getGlosario <em>Glosario</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario()
 * @model
 * @generated
 */
public interface TerminoGlosario extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->notEmpty() and nombre.size() > 0 then \'(\'.concat( nombre).concat(\') \') else \'\' endif).concat(\r\n  if descripcion->notEmpty() and descripcion.size() > 0 then descripcion else \'?\' endif\r\n)'"
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
	 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TerminoGlosario#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.TerminoGlosario#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getTerminos <em>Terminos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getTerminos
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="terminos" changeable="false"
	 * @generated
	 */
	EList getProcedimientos();

	/**
	 * Returns the value of the '<em><b>Glosario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Glosario#getTerminos <em>Terminos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glosario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glosario</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getTerminoGlosario_Glosario()
	 * @see es.gva.cit.simapa.Glosario#getTerminos
	 * @model opposite="terminos" required="true" changeable="false"
	 * @generated
	 */
	Glosario getGlosario();

} // TerminoGlosario