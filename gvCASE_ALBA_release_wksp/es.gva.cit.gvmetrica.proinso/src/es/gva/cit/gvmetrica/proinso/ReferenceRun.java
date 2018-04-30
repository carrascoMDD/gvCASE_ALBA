
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado <em>Referenciado</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getReferenceRun()
 * @model
 * @generated
 */
public interface ReferenceRun extends TextRun {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Referenciado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Referenciable#getReferencias <em>Referencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenciado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenciado</em>' reference.
	 * @see #setReferenciado(Referenciable)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getReferenceRun_Referenciado()
	 * @see es.gva.cit.gvmetrica.proinso.Referenciable#getReferencias
	 * @model opposite="referencias"
	 * @generated
	 */
	Referenciable getReferenciado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.ReferenceRun#getReferenciado <em>Referenciado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenciado</em>' reference.
	 * @see #getReferenciado()
	 * @generated
	 */
	void setReferenciado(Referenciable value);

} // ReferenceRun