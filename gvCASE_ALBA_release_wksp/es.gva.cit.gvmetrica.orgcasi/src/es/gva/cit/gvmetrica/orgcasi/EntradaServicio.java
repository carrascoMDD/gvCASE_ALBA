
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrada Servicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio <em>Servicio</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaServicio()
 * @model
 * @generated
 */
public interface EntradaServicio extends Entrada {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaServicio_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n\' desde \'.concat( if fuentes->isEmpty() then \'?\' else fuentes->first().oclAsType( SalidaServicio).etiquetaSimple endif)).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Servicio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.Servicio#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicio</em>' container reference.
	 * @see #setServicio(Servicio)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaServicio_Servicio()
	 * @see es.gva.cit.gvmetrica.orgcasi.Servicio#getEntradas
	 * @model opposite="entradas" required="true"
	 * @generated
	 */
	Servicio getServicio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.EntradaServicio#getServicio <em>Servicio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' container reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(Servicio value);

	/**
	 * Returns the value of the '<em><b>Etiqueta Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta Simple</em>' attribute.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getEntradaServicio_EtiquetaSimple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if nombre->isEmpty() or nombre.size() < 1 then \'?\' else  nombre endif).concat( \' en Servicio \').concat(\r\nservicio.etiqueta).concat(\r\n  if estructurasDatos->notEmpty() then \' de estructurasDatos \'.concat( estructurasDatos->first().etiqueta) else \'\' endif\r\n).concat(\' \').concat( \r\n  if documentos->notEmpty() then \' de documentos \'.concat( documentos->first().etiqueta) else \'\' endif\r\n\r\n)'"
	 * @generated
	 */
	String getEtiquetaSimple();

} // EntradaServicio