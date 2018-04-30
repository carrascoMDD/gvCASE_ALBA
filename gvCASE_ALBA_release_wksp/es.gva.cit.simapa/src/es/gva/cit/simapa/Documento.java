
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
 * A representation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Documento#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getFicheroModeloFomulario <em>Fichero Modelo Fomulario</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getTipoAlmacenamiento <em>Tipo Almacenamiento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getTipoMedio <em>Tipo Medio</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getTipoAmbito <em>Tipo Ambito</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getClaseDocumento <em>Clase Documento</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getProcedimientos <em>Procedimientos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getDocumentosFinales <em>Documentos Finales</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Documento#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getDocumento()
 * @model
 * @generated
 */
public interface Documento extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo->notEmpty() and codigo.size() > 0 then \'(\'.concat( codigo).concat(\') \') else \'\' endif).concat(\r\n  if titulo->notEmpty() and titulo.size() > 0 then titulo else \'?\' endif\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Fichero Modelo Fomulario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichero Modelo Fomulario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichero Modelo Fomulario</em>' attribute.
	 * @see #setFicheroModeloFomulario(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_FicheroModeloFomulario()
	 * @model
	 * @generated
	 */
	String getFicheroModeloFomulario();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getFicheroModeloFomulario <em>Fichero Modelo Fomulario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fichero Modelo Fomulario</em>' attribute.
	 * @see #getFicheroModeloFomulario()
	 * @generated
	 */
	void setFicheroModeloFomulario(String value);

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
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Almacenamiento</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoAlmacenamientoDocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Almacenamiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Almacenamiento</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAlmacenamientoDocumento
	 * @see #setTipoAlmacenamiento(TipoAlmacenamientoDocumento)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_TipoAlmacenamiento()
	 * @model
	 * @generated
	 */
	TipoAlmacenamientoDocumento getTipoAlmacenamiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getTipoAlmacenamiento <em>Tipo Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Almacenamiento</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAlmacenamientoDocumento
	 * @see #getTipoAlmacenamiento()
	 * @generated
	 */
	void setTipoAlmacenamiento(TipoAlmacenamientoDocumento value);

	/**
	 * Returns the value of the '<em><b>Tipo Medio</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoMedioDocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Medio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Medio</em>' attribute.
	 * @see es.gva.cit.simapa.TipoMedioDocumento
	 * @see #setTipoMedio(TipoMedioDocumento)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_TipoMedio()
	 * @model
	 * @generated
	 */
	TipoMedioDocumento getTipoMedio();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getTipoMedio <em>Tipo Medio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Medio</em>' attribute.
	 * @see es.gva.cit.simapa.TipoMedioDocumento
	 * @see #getTipoMedio()
	 * @generated
	 */
	void setTipoMedio(TipoMedioDocumento value);

	/**
	 * Returns the value of the '<em><b>Tipo Ambito</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoAmbitoDocumento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Ambito</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Ambito</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAmbitoDocumento
	 * @see #setTipoAmbito(TipoAmbitoDocumento)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_TipoAmbito()
	 * @model
	 * @generated
	 */
	TipoAmbitoDocumento getTipoAmbito();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getTipoAmbito <em>Tipo Ambito</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Ambito</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAmbitoDocumento
	 * @see #getTipoAmbito()
	 * @generated
	 */
	void setTipoAmbito(TipoAmbitoDocumento value);

	/**
	 * Returns the value of the '<em><b>Clase Documento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.ClaseDocumento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clase Documento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clase Documento</em>' reference.
	 * @see #setClaseDocumento(ClaseDocumento)
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_ClaseDocumento()
	 * @see es.gva.cit.simapa.ClaseDocumento#getDocumentos
	 * @model opposite="documentos" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='documentos.repositorio.clasesDocumento.clasesDocumento'"
	 * @generated
	 */
	ClaseDocumento getClaseDocumento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Documento#getClaseDocumento <em>Clase Documento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clase Documento</em>' reference.
	 * @see #getClaseDocumento()
	 * @generated
	 */
	void setClaseDocumento(ClaseDocumento value);

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getDocumentos
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="documentos" changeable="false"
	 * @generated
	 */
	EList getProcedimientos();

	/**
	 * Returns the value of the '<em><b>Documentos Finales</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.DocumentoFinal}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.DocumentoFinal#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos Finales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos Finales</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_DocumentosFinales()
	 * @see es.gva.cit.simapa.DocumentoFinal#getDocumento
	 * @model type="es.gva.cit.simapa.DocumentoFinal" opposite="documento" changeable="false"
	 * @generated
	 */
	EList getDocumentosFinales();

	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Flujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Flujo#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Flujos()
	 * @see es.gva.cit.simapa.Flujo#getDocumentos
	 * @model type="es.gva.cit.simapa.Flujo" opposite="documentos" changeable="false"
	 * @generated
	 */
	EList getFlujos();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documentos#getDocumentos <em>Documentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getDocumento_Documentos()
	 * @see es.gva.cit.simapa.Documentos#getDocumentos
	 * @model opposite="documentos" required="true" changeable="false"
	 * @generated
	 */
	Documentos getDocumentos();

} // Documento