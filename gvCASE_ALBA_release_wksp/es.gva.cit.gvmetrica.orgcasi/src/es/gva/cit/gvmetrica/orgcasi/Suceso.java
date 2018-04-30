
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPrioridad <em>Prioridad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getTipo <em>Tipo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getRendimiento <em>Rendimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDisparo <em>Disparo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDistribucion <em>Distribucion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPreCondicion <em>Pre Condicion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPostCondicion <em>Post Condicion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#isEsColaborativo <em>Es Colaborativo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getActores <em>Actores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos <em>Estructuras Datos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos <em>Usado Por Sucesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getProcedimiento <em>Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos <em>Sucesos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso()
 * @model abstract="true"
 * @generated
 */
public interface Suceso extends Agrupacion {
	/**
	 * Returns the value of the '<em><b>Prioridad</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.gvmetrica.orgcasi.TipoPrioridad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prioridad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prioridad</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPrioridad
	 * @see #setPrioridad(TipoPrioridad)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Prioridad()
	 * @model
	 * @generated
	 */
	TipoPrioridad getPrioridad();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPrioridad <em>Prioridad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioridad</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.TipoPrioridad
	 * @see #getPrioridad()
	 * @generated
	 */
	void setPrioridad(TipoPrioridad value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Rendimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendimiento</em>' attribute.
	 * @see #setRendimiento(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Rendimiento()
	 * @model
	 * @generated
	 */
	String getRendimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getRendimiento <em>Rendimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendimiento</em>' attribute.
	 * @see #getRendimiento()
	 * @generated
	 */
	void setRendimiento(String value);

	/**
	 * Returns the value of the '<em><b>Disparo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disparo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disparo</em>' attribute.
	 * @see #setDisparo(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Disparo()
	 * @model
	 * @generated
	 */
	String getDisparo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDisparo <em>Disparo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disparo</em>' attribute.
	 * @see #getDisparo()
	 * @generated
	 */
	void setDisparo(String value);

	/**
	 * Returns the value of the '<em><b>Distribucion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribucion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribucion</em>' attribute.
	 * @see #setDistribucion(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Distribucion()
	 * @model
	 * @generated
	 */
	String getDistribucion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getDistribucion <em>Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribucion</em>' attribute.
	 * @see #getDistribucion()
	 * @generated
	 */
	void setDistribucion(String value);

	/**
	 * Returns the value of the '<em><b>Pre Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condicion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condicion</em>' attribute.
	 * @see #setPreCondicion(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_PreCondicion()
	 * @model
	 * @generated
	 */
	String getPreCondicion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPreCondicion <em>Pre Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condicion</em>' attribute.
	 * @see #getPreCondicion()
	 * @generated
	 */
	void setPreCondicion(String value);

	/**
	 * Returns the value of the '<em><b>Post Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condicion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condicion</em>' attribute.
	 * @see #setPostCondicion(String)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_PostCondicion()
	 * @model
	 * @generated
	 */
	String getPostCondicion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getPostCondicion <em>Post Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condicion</em>' attribute.
	 * @see #getPostCondicion()
	 * @generated
	 */
	void setPostCondicion(String value);

	/**
	 * Returns the value of the '<em><b>Es Colaborativo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Colaborativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Colaborativo</em>' attribute.
	 * @see #setEsColaborativo(boolean)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_EsColaborativo()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsColaborativo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#isEsColaborativo <em>Es Colaborativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Colaborativo</em>' attribute.
	 * @see #isEsColaborativo()
	 * @generated
	 */
	void setEsColaborativo(boolean value);

	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' containment reference.
	 * @see #setAcciones(CAccionesSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Acciones()
	 * @see es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CAccionesSuceso getAcciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getAcciones <em>Acciones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acciones</em>' containment reference.
	 * @see #getAcciones()
	 * @generated
	 */
	void setAcciones(CAccionesSuceso value);

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' containment reference.
	 * @see #setActores(CActoresSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Actores()
	 * @see es.gva.cit.gvmetrica.orgcasi.CActoresSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CActoresSuceso getActores();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getActores <em>Actores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actores</em>' containment reference.
	 * @see #getActores()
	 * @generated
	 */
	void setActores(CActoresSuceso value);

	/**
	 * Returns the value of the '<em><b>Estructuras Datos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estructuras Datos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estructuras Datos</em>' containment reference.
	 * @see #setEstructurasDatos(CEstructurasDatosSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_EstructurasDatos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CEstructurasDatosSuceso getEstructurasDatos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEstructurasDatos <em>Estructuras Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estructuras Datos</em>' containment reference.
	 * @see #getEstructurasDatos()
	 * @generated
	 */
	void setEstructurasDatos(CEstructurasDatosSuceso value);

	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' containment reference.
	 * @see #setFlujos(CFlujosSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Flujos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CFlujosSuceso getFlujos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getFlujos <em>Flujos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flujos</em>' containment reference.
	 * @see #getFlujos()
	 * @generated
	 */
	void setFlujos(CFlujosSuceso value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference.
	 * @see #setEntradas(CEntradasSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CEntradasSuceso getEntradas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getEntradas <em>Entradas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entradas</em>' containment reference.
	 * @see #getEntradas()
	 * @generated
	 */
	void setEntradas(CEntradasSuceso value);

	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' containment reference.
	 * @see #setSalidas(CSalidasSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CSalidasSuceso getSalidas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSalidas <em>Salidas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salidas</em>' containment reference.
	 * @see #getSalidas()
	 * @generated
	 */
	void setSalidas(CSalidasSuceso value);

	/**
	 * Returns the value of the '<em><b>Usado Por Sucesos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso <em>Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usado Por Sucesos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usado Por Sucesos</em>' containment reference.
	 * @see #setUsadoPorSucesos(CUsadoPorSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_UsadoPorSucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getSuceso
	 * @model opposite="suceso" containment="true" required="true"
	 * @generated
	 */
	CUsadoPorSucesos getUsadoPorSucesos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getUsadoPorSucesos <em>Usado Por Sucesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usado Por Sucesos</em>' containment reference.
	 * @see #getUsadoPorSucesos()
	 * @generated
	 */
	void setUsadoPorSucesos(CUsadoPorSucesos value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Procedimiento()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='sucesos.procedimiento'"
	 * @generated
	 */
	AProcedimiento getProcedimiento();

	/**
	 * Returns the value of the '<em><b>Sucesos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSucesos#getSucesos <em>Sucesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucesos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucesos</em>' container reference.
	 * @see #setSucesos(CSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSuceso_Sucesos()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSucesos#getSucesos
	 * @model opposite="sucesos" required="true"
	 * @generated
	 */
	CSucesos getSucesos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.Suceso#getSucesos <em>Sucesos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucesos</em>' container reference.
	 * @see #getSucesos()
	 * @generated
	 */
	void setSucesos(CSucesos value);

} // Suceso