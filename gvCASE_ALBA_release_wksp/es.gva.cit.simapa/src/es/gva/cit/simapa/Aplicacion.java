
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
 * A representation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getHerramienta <em>Herramienta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getBaseDeDatos <em>Base De Datos</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getNumeroUsuarios <em>Numero Usuarios</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getEstadoAplicacion <em>Estado Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getNivelSeguridad <em>Nivel Seguridad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getDesarrollador <em>Desarrollador</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getTipoDesarrollo <em>Tipo Desarrollo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getTipoAplicacion <em>Tipo Aplicacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getComplejidad <em>Complejidad</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getImportancia <em>Importancia</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getAplicaciones <em>Aplicaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Aplicacion#getProcedimientos <em>Procedimientos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion()
 * @model
 * @generated
 */
public interface Aplicacion extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Etiqueta()
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
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getNombre <em>Nombre</em>}' attribute.
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
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getDescripcion <em>Descripcion</em>}' attribute.
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
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Herramienta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herramienta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herramienta</em>' attribute.
	 * @see #setHerramienta(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Herramienta()
	 * @model
	 * @generated
	 */
	String getHerramienta();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getHerramienta <em>Herramienta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herramienta</em>' attribute.
	 * @see #getHerramienta()
	 * @generated
	 */
	void setHerramienta(String value);

	/**
	 * Returns the value of the '<em><b>Base De Datos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base De Datos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base De Datos</em>' attribute.
	 * @see #setBaseDeDatos(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_BaseDeDatos()
	 * @model
	 * @generated
	 */
	String getBaseDeDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getBaseDeDatos <em>Base De Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base De Datos</em>' attribute.
	 * @see #getBaseDeDatos()
	 * @generated
	 */
	void setBaseDeDatos(String value);

	/**
	 * Returns the value of the '<em><b>Numero Usuarios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Usuarios</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Usuarios</em>' attribute.
	 * @see #setNumeroUsuarios(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_NumeroUsuarios()
	 * @model
	 * @generated
	 */
	String getNumeroUsuarios();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getNumeroUsuarios <em>Numero Usuarios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Usuarios</em>' attribute.
	 * @see #getNumeroUsuarios()
	 * @generated
	 */
	void setNumeroUsuarios(String value);

	/**
	 * Returns the value of the '<em><b>Estado Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado Aplicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Aplicacion</em>' attribute.
	 * @see #setEstadoAplicacion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_EstadoAplicacion()
	 * @model
	 * @generated
	 */
	String getEstadoAplicacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getEstadoAplicacion <em>Estado Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado Aplicacion</em>' attribute.
	 * @see #getEstadoAplicacion()
	 * @generated
	 */
	void setEstadoAplicacion(String value);

	/**
	 * Returns the value of the '<em><b>Nivel Seguridad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nivel Seguridad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nivel Seguridad</em>' attribute.
	 * @see #setNivelSeguridad(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_NivelSeguridad()
	 * @model
	 * @generated
	 */
	String getNivelSeguridad();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getNivelSeguridad <em>Nivel Seguridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nivel Seguridad</em>' attribute.
	 * @see #getNivelSeguridad()
	 * @generated
	 */
	void setNivelSeguridad(String value);

	/**
	 * Returns the value of the '<em><b>Desarrollador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desarrollador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desarrollador</em>' attribute.
	 * @see #setDesarrollador(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Desarrollador()
	 * @model
	 * @generated
	 */
	String getDesarrollador();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getDesarrollador <em>Desarrollador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desarrollador</em>' attribute.
	 * @see #getDesarrollador()
	 * @generated
	 */
	void setDesarrollador(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Desarrollo</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoDesarrollo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Desarrollo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Desarrollo</em>' attribute.
	 * @see es.gva.cit.simapa.TipoDesarrollo
	 * @see #setTipoDesarrollo(TipoDesarrollo)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_TipoDesarrollo()
	 * @model
	 * @generated
	 */
	TipoDesarrollo getTipoDesarrollo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getTipoDesarrollo <em>Tipo Desarrollo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Desarrollo</em>' attribute.
	 * @see es.gva.cit.simapa.TipoDesarrollo
	 * @see #getTipoDesarrollo()
	 * @generated
	 */
	void setTipoDesarrollo(TipoDesarrollo value);

	/**
	 * Returns the value of the '<em><b>Tipo Aplicacion</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoAplicacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Aplicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Aplicacion</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAplicacion
	 * @see #setTipoAplicacion(TipoAplicacion)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_TipoAplicacion()
	 * @model
	 * @generated
	 */
	TipoAplicacion getTipoAplicacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getTipoAplicacion <em>Tipo Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Aplicacion</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAplicacion
	 * @see #getTipoAplicacion()
	 * @generated
	 */
	void setTipoAplicacion(TipoAplicacion value);

	/**
	 * Returns the value of the '<em><b>Complejidad</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.Rango1_10}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complejidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complejidad</em>' attribute.
	 * @see es.gva.cit.simapa.Rango1_10
	 * @see #setComplejidad(Rango1_10)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Complejidad()
	 * @model
	 * @generated
	 */
	Rango1_10 getComplejidad();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getComplejidad <em>Complejidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complejidad</em>' attribute.
	 * @see es.gva.cit.simapa.Rango1_10
	 * @see #getComplejidad()
	 * @generated
	 */
	void setComplejidad(Rango1_10 value);

	/**
	 * Returns the value of the '<em><b>Importancia</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.Rango1_10}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importancia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importancia</em>' attribute.
	 * @see es.gva.cit.simapa.Rango1_10
	 * @see #setImportancia(Rango1_10)
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Importancia()
	 * @model
	 * @generated
	 */
	Rango1_10 getImportancia();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Aplicacion#getImportancia <em>Importancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importancia</em>' attribute.
	 * @see es.gva.cit.simapa.Rango1_10
	 * @see #getImportancia()
	 * @generated
	 */
	void setImportancia(Rango1_10 value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Operacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operacion#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Operaciones()
	 * @see es.gva.cit.simapa.Operacion#getAplicaciones
	 * @model type="es.gva.cit.simapa.Operacion" opposite="aplicaciones" changeable="false"
	 * @generated
	 */
	EList getOperaciones();

	/**
	 * Returns the value of the '<em><b>Aplicaciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Aplicaciones#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aplicaciones</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aplicaciones</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Aplicaciones()
	 * @see es.gva.cit.simapa.Aplicaciones#getAplicaciones
	 * @model opposite="aplicaciones" required="true" changeable="false"
	 * @generated
	 */
	Aplicaciones getAplicaciones();

	/**
	 * Returns the value of the '<em><b>Procedimientos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Procedimiento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getAplicaciones <em>Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimientos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimientos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getAplicacion_Procedimientos()
	 * @see es.gva.cit.simapa.Procedimiento#getAplicaciones
	 * @model type="es.gva.cit.simapa.Procedimiento" opposite="aplicaciones" changeable="false"
	 * @generated
	 */
	EList getProcedimientos();

} // Aplicacion