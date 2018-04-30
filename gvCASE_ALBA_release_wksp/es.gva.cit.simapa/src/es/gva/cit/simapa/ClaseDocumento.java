
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
 * A representation of the model object '<em><b>Clase Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getClasesDocumento <em>Clases Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.ClaseDocumento#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento()
 * @model
 * @generated
 */
public interface ClaseDocumento extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

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
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ClaseDocumento#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ClaseDocumento#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observaciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observaciones</em>' attribute.
	 * @see #setObservaciones(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.ClaseDocumento#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Clases Documento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ClasesDocumento#getClasesDocumento <em>Clases Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases Documento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases Documento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_ClasesDocumento()
	 * @see es.gva.cit.simapa.ClasesDocumento#getClasesDocumento
	 * @model opposite="clasesDocumento" required="true" changeable="false"
	 * @generated
	 */
	ClasesDocumento getClasesDocumento();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Documento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documento#getClaseDocumento <em>Clase Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getClaseDocumento_Documentos()
	 * @see es.gva.cit.simapa.Documento#getClaseDocumento
	 * @model type="es.gva.cit.simapa.Documento" opposite="claseDocumento" changeable="false"
	 * @generated
	 */
	EList getDocumentos();

} // ClaseDocumento