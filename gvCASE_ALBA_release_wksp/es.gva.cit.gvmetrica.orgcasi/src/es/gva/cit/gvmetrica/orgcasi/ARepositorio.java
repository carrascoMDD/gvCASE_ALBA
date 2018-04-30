
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import es.gva.cit.simapa.Repositorio;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARepositorio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento <em>Anotaciones Procedimiento</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getRepositorio <em>Repositorio</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getModelPackage <em>Model Package</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios <em>Librerias Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getARepositorio()
 * @model
 * @generated
 */
public interface ARepositorio extends Anotacion {
	/**
	 * Returns the value of the '<em><b>Anotaciones Procedimiento</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anotaciones Procedimiento</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotaciones Procedimiento</em>' containment reference.
	 * @see #setAnotacionesProcedimiento(CProcedimientos)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getARepositorio_AnotacionesProcedimiento()
	 * @see es.gva.cit.gvmetrica.orgcasi.CProcedimientos#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	CProcedimientos getAnotacionesProcedimiento();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getAnotacionesProcedimiento <em>Anotaciones Procedimiento</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotaciones Procedimiento</em>' containment reference.
	 * @see #getAnotacionesProcedimiento()
	 * @generated
	 */
	void setAnotacionesProcedimiento(CProcedimientos value);

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' reference.
	 * @see #setRepositorio(Repositorio)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getARepositorio_Repositorio()
	 * @model required="true"
	 * @generated
	 */
	Repositorio getRepositorio();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getRepositorio <em>Repositorio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositorio</em>' reference.
	 * @see #getRepositorio()
	 * @generated
	 */
	void setRepositorio(Repositorio value);

	/**
	 * Returns the value of the '<em><b>Model Package</b></em>' reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Package</em>' reference.
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getARepositorio_ModelPackage()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EPackage getModelPackage();

	/**
	 * Returns the value of the '<em><b>Librerias Servicios</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librerias Servicios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librerias Servicios</em>' containment reference.
	 * @see #setLibreriasServicios(CLibreriasServicios)
	 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getARepositorio_LibreriasServicios()
	 * @see es.gva.cit.gvmetrica.orgcasi.CLibreriasServicios#getRepositorio
	 * @model opposite="repositorio" containment="true" required="true"
	 * @generated
	 */
	CLibreriasServicios getLibreriasServicios();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.orgcasi.ARepositorio#getLibreriasServicios <em>Librerias Servicios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Librerias Servicios</em>' containment reference.
	 * @see #getLibreriasServicios()
	 * @generated
	 */
	void setLibreriasServicios(CLibreriasServicios value);

} // ARepositorio