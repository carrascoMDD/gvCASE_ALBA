
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.TextRun#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTextRun()
 * @model
 * @generated
 */
public interface TextRun extends Run {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTextRun_Estilo()
	 * @model
	 * @generated
	 */
	String getEstilo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.TextRun#getEstilo <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' attribute.
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(String value);

} // TextRun