
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convocatoria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Convocatoria#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Convocatoria#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Convocatoria#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Convocatoria#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Convocatoria#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria()
 * @model
 * @generated
 */
public interface Convocatoria extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria_Etiqueta()
	 * @model transient="true" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Convocatoria#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Convocatoria#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Convocatoria#getDescripcion <em>Descripcion</em>}' attribute.
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
	 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Convocatoria#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getConvocatorias <em>Convocatorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getConvocatoria_Procedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getConvocatorias
	 * @model opposite="convocatorias" required="true" changeable="false"
	 * @generated
	 */
	Procedimiento getProcedimiento();

} // Convocatoria