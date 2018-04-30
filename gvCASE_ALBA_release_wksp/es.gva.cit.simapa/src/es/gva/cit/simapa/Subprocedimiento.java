
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocedimiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento <em>Sub Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getSubprocedimiento()
 * @model
 * @generated
 */
public interface Subprocedimiento extends Operacion {
	/**
	 * Returns the value of the '<em><b>Sub Procedimiento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getUsosComoSubProcedimientos <em>Usos Como Sub Procedimientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Procedimiento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Procedimiento</em>' reference.
	 * @see #setSubProcedimiento(Procedimiento)
	 * @see es.gva.cit.simapa.SimapaPackage#getSubprocedimiento_SubProcedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getUsosComoSubProcedimientos
	 * @model opposite="usosComoSubProcedimientos" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='operaciones.procedimiento.procedimientos'"
	 * @generated
	 */
	Procedimiento getSubProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.Subprocedimiento#getSubProcedimiento <em>Sub Procedimiento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Procedimiento</em>' reference.
	 * @see #getSubProcedimiento()
	 * @generated
	 */
	void setSubProcedimiento(Procedimiento value);

} // Subprocedimiento