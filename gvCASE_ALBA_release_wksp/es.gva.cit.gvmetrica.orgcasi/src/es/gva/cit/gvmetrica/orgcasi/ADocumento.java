
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Documento;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADocumento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumento <em>Documento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEntradasOSalidas <em>Entradas OSalidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEstados <em>Estados</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumentos <em>Documentos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getTodosDocumentos <em>Todos Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento()
 * @model
 * @generated
 */
public interface ADocumento extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else nombre endif).concat(\r\n  if self.oclIsTypeOf( DocumentoEnEstado) \r\n  then \' de \'.concat( self.oclAsType( DocumentoEnEstado).documentoBase.etiqueta)\r\n  else \'\'\r\n  endif\r\n).concat(\r\nif documento->isEmpty() then \'\' else  \' anotando \'.concat( documento.etiqueta) endif \r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Documento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' reference.
	 * @see #setDocumento(Documento)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Documento()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if( documentos.contenedor.oclIsTypeOf( AProcedimiento))\r\nthen documentos.contenedor.oclAsType( AProcedimiento).procedimiento.documentos\r\nelse documentos.contenedor.oclAsType( LibreriaServicios).libreriasServicios.repositorio.repositorio.documentos.documentos\r\r\nendif\r\n'"
	 * @generated
	 */
	Documento getDocumento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumento <em>Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' reference.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(Documento value);

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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getDocumentos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" opposite="documentos"
	 * @generated
	 */
	EList getEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Entradas OSalidas</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas OSalidas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas OSalidas</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_EntradasOSalidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDocumentos
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EntradaOSalida" opposite="documentos" changeable="false"
	 * @generated
	 */
	EList getEntradasOSalidas();

	/**
	 * Returns the value of the '<em><b>Estados</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase <em>Documento Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estados</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estados</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Estados()
	 * @see es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado#getDocumentoBase
	 * @model type="es.gva.cit.gvmetrica.orgcasi.DocumentoEnEstado" opposite="documentoBase" containment="true"
	 * @generated
	 */
	EList getEstados();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CDocumentos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' container reference.
	 * @see #setDocumentos(CDocumentos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_Documentos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CDocumentos#getDocumentos
	 * @model opposite="documentos" required="true"
	 * @generated
	 */
	CDocumentos getDocumentos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getDocumentos <em>Documentos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentos</em>' container reference.
	 * @see #getDocumentos()
	 * @generated
	 */
	void setDocumentos(CDocumentos value);

	/**
	 * Returns the value of the '<em><b>Todos Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ADocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Todos Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Todos Documentos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getADocumento_TodosDocumentos()
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ADocumento" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsKindOf( DocumentoEnEstado)\r\nthen self->asOrderedSet()\r\nelse self->asOrderedSet()->union(estados)\r\nendif\r\n'"
	 * @generated
	 */
	EList getTodosDocumentos();

} // ADocumento