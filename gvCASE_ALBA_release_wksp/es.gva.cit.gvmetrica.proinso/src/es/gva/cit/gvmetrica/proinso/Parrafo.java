
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parrafo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Parrafo#getTexto <em>Texto</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Parrafo#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Parrafo#getRuns <em>Runs</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Parrafo#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParrafo()
 * @model
 * @generated
 */
public interface Parrafo extends ProinsoObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParrafo_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>Documentacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Documentacion#getParrafos <em>Parrafos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentacion</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParrafo_Documentacion()
	 * @see es.gva.cit.gvmetrica.proinso.Documentacion#getParrafos
	 * @model opposite="parrafos" changeable="false"
	 * @generated
	 */
	Documentacion getDocumentacion();

	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Run}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Run#getParrafo <em>Parrafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParrafo_Runs()
	 * @see es.gva.cit.gvmetrica.proinso.Run#getParrafo
	 * @model type="es.gva.cit.gvmetrica.proinso.Run" opposite="parrafo" containment="true"
	 * @generated
	 */
	EList getRuns();

	/**
	 * Returns the value of the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo</em>' attribute.
	 * @see #setEstilo(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getParrafo_Estilo()
	 * @model
	 * @generated
	 */
	String getEstilo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Parrafo#getEstilo <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' attribute.
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(String value);

} // Parrafo