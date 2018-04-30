
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uso Suceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado <em>Suceso Usado</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSuceso()
 * @model
 * @generated
 */
public interface UsoSuceso extends Accion {
	/**
	 * Returns the value of the '<em><b>Suceso Usado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getUsosSuceso <em>Usos Suceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suceso Usado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suceso Usado</em>' reference.
	 * @see #setSucesoUsado(CUsadoPorSucesos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getUsoSuceso_SucesoUsado()
	 * @see es.gva.cit.gvmetrica.orgcasi.CUsadoPorSucesos#getUsosSuceso
	 * @model opposite="usosSuceso" required="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='acciones.suceso.sucesos.procedimiento.todosSucesos.usadoPorSucesos'"
	 * @generated
	 */
	CUsadoPorSucesos getSucesoUsado();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.UsoSuceso#getSucesoUsado <em>Suceso Usado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suceso Usado</em>' reference.
	 * @see #getSucesoUsado()
	 * @generated
	 */
	void setSucesoUsado(CUsadoPorSucesos value);

} // UsoSuceso