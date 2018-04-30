
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
 * A representation of the model object '<em><b>Flujo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Flujo#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#getTexto <em>Texto</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#isEsConector <em>Es Conector</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#getGuarda <em>Guarda</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#getOrigen <em>Origen</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#getDestino <em>Destino</em>}</li>
 *   <li>{@link es.gva.cit.simapa.Flujo#getDocumentos <em>Documentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getFlujo()
 * @model
 * @generated
 */
public interface Flujo extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='\'de \'.concat( if origen->isEmpty() then \'?\' else origen.etiqueta endif).concat( \' a \').concat(if destino->isEmpty() then \'?\' else destino.etiqueta endif) '"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Flujo#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>Es Conector</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Conector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Conector</em>' attribute.
	 * @see #setEsConector(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_EsConector()
	 * @model default="false"
	 * @generated
	 */
	boolean isEsConector();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Flujo#isEsConector <em>Es Conector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Conector</em>' attribute.
	 * @see #isEsConector()
	 * @generated
	 */
	void setEsConector(boolean value);

	/**
	 * Returns the value of the '<em><b>Guarda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarda</em>' attribute.
	 * @see #setGuarda(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Guarda()
	 * @model
	 * @generated
	 */
	String getGuarda();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Flujo#getGuarda <em>Guarda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarda</em>' attribute.
	 * @see #getGuarda()
	 * @generated
	 */
	void setGuarda(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operacion#getFlujosSalientes <em>Flujos Salientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Origen()
	 * @see es.gva.cit.simapa.Operacion#getFlujosSalientes
	 * @model opposite="flujosSalientes" required="true" changeable="false"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='origen.operaciones.procedimiento.operaciones.operaciones'"
	 * @generated
	 */
	Operacion getOrigen();

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Operacion#getFlujosEntrantes <em>Flujos Entrantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Operacion)
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Destino()
	 * @see es.gva.cit.simapa.Operacion#getFlujosEntrantes
	 * @model opposite="flujosEntrantes" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='origen.operaciones.procedimiento.operaciones.operaciones'"
	 * @generated
	 */
	Operacion getDestino();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Flujo#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Operacion value);

	/**
	 * Returns the value of the '<em><b>Documentos</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.simapa.Documento}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Documento#getFlujos <em>Flujos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentos</em>' reference list.
	 * @see es.gva.cit.simapa.SimapaPackage#getFlujo_Documentos()
	 * @see es.gva.cit.simapa.Documento#getFlujos
	 * @model type="es.gva.cit.simapa.Documento" opposite="flujos"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='origen.operaciones.procedimiento.documentos'"
	 * @generated
	 */
	EList getDocumentos();

} // Flujo