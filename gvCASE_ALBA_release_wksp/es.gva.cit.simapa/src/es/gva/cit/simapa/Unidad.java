
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
 * A representation of the model object '<em><b>Unidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Unidad#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getPersona <em>Persona</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getFax <em>Fax</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getNotas <em>Notas</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Unidad#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getUnidad()
 * @model abstract="true"
 * @generated
 */
public interface Unidad extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsTypeOf( UnidadOrganica) then\r\n(if self.oclAsType( UnidadOrganica).codigo->notEmpty() and self.oclAsType( UnidadOrganica).codigo.size() > 0 then \'(\'.concat( self.oclAsType( UnidadOrganica).codigo).concat(\') \') else \'\' endif).concat(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)\r\nelse\r\nif self.oclIsTypeOf( UnidadExterna) then\r\n(\r\n  if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\n)\r\nelse\r\n   if nombre->notEmpty() and nombre.size() > 0 then nombre else \'?\' endif\r\nendif\r\n\r\nendif\r\n'"
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
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' attribute.
	 * @see #setPersona(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Persona()
	 * @model
	 * @generated
	 */
	String getPersona();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getPersona <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' attribute.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Telefono()
	 * @model
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Fax()
	 * @model
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Direccion()
	 * @model
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Notas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notas</em>' attribute.
	 * @see #setNotas(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Notas()
	 * @model
	 * @generated
	 */
	String getNotas();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getNotas <em>Notas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notas</em>' attribute.
	 * @see #getNotas()
	 * @generated
	 */
	void setNotas(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Unidad#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Operacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operacion#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getUnidad_Operaciones()
	 * @see es.gva.cit.simapa.Operacion#getUnidad
	 * @model type="es.gva.cit.simapa.Operacion" opposite="unidad" changeable="false"
	 * @generated
	 */
	EList getOperaciones();

} // Unidad