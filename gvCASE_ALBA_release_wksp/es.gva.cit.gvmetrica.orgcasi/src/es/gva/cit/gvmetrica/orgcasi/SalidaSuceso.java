
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
 * A representation of the model object '<em><b>Salida Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#isEsDistribucion <em>Es Distribucion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas <em>Salidas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaSuceso()
 * @model
 * @generated
 */
public interface SalidaSuceso extends Salida {
	/**
	 * Returns the value of the '<em><b>Salidas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSalidas <em>Salidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salidas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salidas</em>' container reference.
	 * @see #setSalidas(CSalidasSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaSuceso_Salidas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso#getSalidas
	 * @model opposite="salidas" required="true"
	 * @generated
	 */
	CSalidasSuceso getSalidas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#getSalidas <em>Salidas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salidas</em>' container reference.
	 * @see #getSalidas()
	 * @generated
	 */
	void setSalidas(CSalidasSuceso value);

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaSuceso_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nsalidas.suceso.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n)'"
	 * @generated
	 */
	String getEtiquetaSimple();

	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaSuceso_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nsalidas.suceso.etiqueta).concat(\r\n\' hacia \'.concat( if destinos->isEmpty() then \'?\' else destinos->first().oclAsType( EntradaSuceso).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Es Distribucion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Distribucion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Distribucion</em>' attribute.
	 * @see #setEsDistribucion(boolean)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getSalidaSuceso_EsDistribucion()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsDistribucion();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.SalidaSuceso#isEsDistribucion <em>Es Distribucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Distribucion</em>' attribute.
	 * @see #isEsDistribucion()
	 * @generated
	 */
	void setEsDistribucion(boolean value);

} // SalidaSuceso