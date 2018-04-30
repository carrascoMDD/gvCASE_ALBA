
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrada OSalida</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#isEsDocumentoPapel <em>Es Documento Papel</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida()
 * @model abstract="true"
 * @generated
 */
public interface EntradaOSalida extends OrgcasiObject {
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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Es Documento Papel</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Documento Papel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Documento Papel</em>' attribute.
	 * @see #setEsDocumentoPapel(boolean)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_EsDocumentoPapel()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsDocumentoPapel();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#isEsDocumentoPapel <em>Es Documento Papel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Documento Papel</em>' attribute.
	 * @see #isEsDocumentoPapel()
	 * @generated
	 */
	void setEsDocumentoPapel(boolean value);

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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Comentario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comentario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comentario</em>' attribute.
	 * @see #setComentario(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaOSalida#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEntradasOSalidas <em>Entradas OSalidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.EstructuraDatos#getEntradasOSalidas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.EstructuraDatos" opposite="entradasOSalidas"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if self.oclIsTypeOf(EntradaSuceso) \r\nthen self.oclAsType(EntradaSuceso).entradas.suceso.procedimiento.todasEstructurasDatos \r\nelse  (\r\n  if self.oclIsTypeOf(SalidaSuceso) \r\n  then self.oclAsType(SalidaSuceso).salidas.suceso.procedimiento.todasEstructurasDatos \r\n  else (\r\n    if self.oclIsTypeOf(EntradaAccion) \r\n    then self.oclAsType(EntradaAccion).entradas.accion.acciones.suceso.procedimiento.todasEstructurasDatos\r\n    else (\r\n      if self.oclIsTypeOf(SalidaAccion) \r\n      then self.oclAsType(SalidaAccion).salidas.accion.acciones.suceso.procedimiento.todasEstructurasDatos\r\n      else (\r\n      if self.oclIsTypeOf(EntradaServicio) \r\n      then self.oclAsType(EntradaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todasEstructurasDatos\r\n      else (\r\n        self.oclAsType(SalidaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todasEstructurasDatos\r\n      )\r\n      endif\r\n      )\r\n      endif\r\n      )\r\n    endif\r\n  )\r\n endif\r\n)\r\nendif\r\n'"
	 * @generated
	 */
	EList getEstructurasDatos();

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.ADocumento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.ADocumento#getEntradasOSalidas <em>Entradas OSalidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaOSalida_Documentos()
	 * @see es.gva.cit.gvmetrica.orgcasi.ADocumento#getEntradasOSalidas
	 * @model type="es.gva.cit.gvmetrica.orgcasi.ADocumento" opposite="entradasOSalidas"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='if self.oclIsTypeOf(EntradaSuceso) \r\nthen self.oclAsType(EntradaSuceso).entradas.suceso.procedimiento.todosDocumentos\r\nelse  (\r\n  if self.oclIsTypeOf(SalidaSuceso) \r\n  then self.oclAsType(SalidaSuceso).salidas.suceso.procedimiento.todosDocumentos \r\n  else (\r\n    if self.oclIsTypeOf(EntradaAccion) \r\n    then self.oclAsType(EntradaAccion).entradas.accion.acciones.suceso.procedimiento.todosDocumentos\r\n    else (\r\n      if self.oclIsTypeOf(SalidaAccion) \r\n      then self.oclAsType(SalidaAccion).salidas.accion.acciones.suceso.procedimiento.todosDocumentos\r\n      else (\r\n      if self.oclIsTypeOf(EntradaServicio) \r\n      then self.oclAsType(EntradaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todosDocumentos\r\n      else (\r\n        self.oclAsType(SalidaServicio).servicio.servicios.interfaz.interfaces.libreriaServicios.todosDocumentos\r\n      )\r\n      endif\r\n      )\r\n      endif\r\n      )\r\n    endif\r\n  )\r\n endif\r\n)\r\nendif\r\n'"
	 * @generated
	 */
	EList getDocumentos();

} // EntradaOSalida