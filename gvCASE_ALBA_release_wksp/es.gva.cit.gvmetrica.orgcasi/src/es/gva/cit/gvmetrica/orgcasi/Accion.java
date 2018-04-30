
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
 * A representation of the model object '<em><b>Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getComentario <em>Comentario</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#isEsColaborativa <em>Es Colaborativa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion()
 * @model
 * @generated
 */
public interface Accion extends OrgcasiObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsTypeOf(UsoSuceso) \r\nthen \r\n  (if self.oclAsType(UsoSuceso).sucesoUsado->isEmpty() then \'?\' else self.oclAsType(UsoSuceso).sucesoUsado.etiqueta endif).concat( \' por Suceso  \').concat(\r\n   acciones.suceso.etiqueta\r\n  )\r\nelse\r\nif self.oclIsTypeOf(UsoServicio) \r\nthen \r\n  (if self.oclAsType(UsoServicio).servicio->isEmpty() then \'?\' else self.oclAsType(UsoServicio).servicio.etiqueta endif).concat( \' por Suceso  \').concat(\r\n   acciones.suceso.etiqueta\r\n  )\r\nelse\r\n(if operaciones->isEmpty() then \'?\' else operaciones->first().etiqueta endif).concat(\r\nif operaciones->size() > 1 then \' ...\' else \'\' endif\r\n)\r\nendif\r\nendif\r\n\r\n'"
	 * @generated
	 */
	String getEtiqueta();

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
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Comentario()
	 * @model
	 * @generated
	 */
	String getComentario();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getComentario <em>Comentario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comentario</em>' attribute.
	 * @see #getComentario()
	 * @generated
	 */
	void setComentario(String value);

	/**
	 * Returns the value of the '<em><b>Es Colaborativa</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Colaborativa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Colaborativa</em>' attribute.
	 * @see #setEsColaborativa(boolean)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_EsColaborativa()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsColaborativa();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Accion#isEsColaborativa <em>Es Colaborativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Colaborativa</em>' attribute.
	 * @see #isEsColaborativa()
	 * @generated
	 */
	void setEsColaborativa(boolean value);

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.Actor}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Actor#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Actores()
	 * @see es.gva.cit.gvmetrica.orgcasi.Actor#getAcciones
	 * @model type="es.gva.cit.gvmetrica.orgcasi.Actor" opposite="acciones"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='acciones.suceso.actores.actores'"
	 * @generated
	 */
	EList getActores();

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.orgcasi.AOperacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.AOperacion#getAccionesSuceso <em>Acciones Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' reference list.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Operaciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.AOperacion#getAccionesSuceso
	 * @model type="es.gva.cit.gvmetrica.orgcasi.AOperacion" opposite="accionesSuceso"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='acciones.suceso.procedimiento.operaciones.operaciones'"
	 * @generated
	 */
	EList getOperaciones();

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference.
	 * @see #setEntradas(CEntradasAccion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasAccion#getAccion
	 * @model opposite="accion" containment="true" required="true"
	 * @generated
	 */
	CEntradasAccion getEntradas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getEntradas <em>Entradas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entradas</em>' containment reference.
	 * @see #getEntradas()
	 * @generated
	 */
	void setEntradas(CEntradasAccion value);

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference.
	 * @see #setSalidas(CSalidasAccion)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasAccion#getAccion
	 * @model opposite="accion" containment="true" required="true"
	 * @generated
	 */
	CSalidasAccion getSalidas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getSalidas <em>Salidas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salidas</em>' containment reference.
	 * @see #getSalidas()
	 * @generated
	 */
	void setSalidas(CSalidasAccion value);

	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' container reference.
	 * @see #setAcciones(CAccionesSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_Acciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getAcciones
	 * @model opposite="acciones" required="true"
	 * @generated
	 */
	CAccionesSuceso getAcciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Accion#getAcciones <em>Acciones</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acciones</em>' container reference.
	 * @see #getAcciones()
	 * @generated
	 */
	void setAcciones(CAccionesSuceso value);

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getAccion_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsTypeOf(UsoSuceso) \r\nthen \r\n    acciones.suceso.etiqueta\r\n\r\nelse\r\nif self.oclIsTypeOf(UsoServicio) \r\nthen \r\n   acciones.suceso.etiqueta\r\n\r\nelse\r\n(if operaciones->isEmpty() then \'?\' else operaciones->first().etiqueta endif).concat(\r\nif operaciones->size() > 1 then \' ...\' else \'\' endif\r\n)\r\nendif\r\nendif\r\n\r\n'"
	 * @generated
	 */
	String getEtiquetaSimple();

} // Accion