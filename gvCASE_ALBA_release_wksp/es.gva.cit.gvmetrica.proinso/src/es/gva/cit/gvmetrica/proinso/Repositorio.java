
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repositorio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Repositorio#getMetodologias <em>Metodologias</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Repositorio#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getRepositorio()
 * @model
 * @generated
 */
public interface Repositorio extends ProinsoObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Metodologias</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Metodologia}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getRepositorio <em>Repositorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodologias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodologias</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getRepositorio_Metodologias()
	 * @see es.gva.cit.gvmetrica.proinso.Metodologia#getRepositorio
	 * @model type="es.gva.cit.gvmetrica.proinso.Metodologia" opposite="repositorio" containment="true"
	 * @generated
	 */
	EList getMetodologias();

	/**
	 * Returns the value of the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Package</em>' reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getRepositorio_ModelPackage()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EPackage getModelPackage();

} // Repositorio