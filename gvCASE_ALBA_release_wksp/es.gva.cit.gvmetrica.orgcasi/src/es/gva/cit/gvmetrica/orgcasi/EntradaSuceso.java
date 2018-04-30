
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
 * A representation of the model object '<em><b>Entrada Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#isEsInformacionPrevia <em>Es Informacion Previa</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaSuceso()
 * @model
 * @generated
 */
public interface EntradaSuceso extends Entrada {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaSuceso_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nentradas.suceso.etiqueta).concat(\r\n\' desde \'.concat( if fuentes->isEmpty() then \'?\' else fuentes->first().oclAsType( SalidaSuceso).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documento \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Es Informacion Previa</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Informacion Previa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Informacion Previa</em>' attribute.
	 * @see #setEsInformacionPrevia(boolean)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaSuceso_EsInformacionPrevia()
	 * @model default="true"
	 * @generated
	 */
	boolean isEsInformacionPrevia();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#isEsInformacionPrevia <em>Es Informacion Previa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Informacion Previa</em>' attribute.
	 * @see #isEsInformacionPrevia()
	 * @generated
	 */
	void setEsInformacionPrevia(boolean value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' container reference.
	 * @see #setEntradas(CEntradasSuceso)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaSuceso_Entradas()
	 * @see es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso#getEntradas
	 * @model opposite="entradas" required="true"
	 * @generated
	 */
	CEntradasSuceso getEntradas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaSuceso#getEntradas <em>Entradas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entradas</em>' container reference.
	 * @see #getEntradas()
	 * @generated
	 */
	void setEntradas(CEntradasSuceso value);

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaSuceso_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Suceso \').concat(\r\nentradas.suceso.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiquetaSimple();

} // EntradaSuceso