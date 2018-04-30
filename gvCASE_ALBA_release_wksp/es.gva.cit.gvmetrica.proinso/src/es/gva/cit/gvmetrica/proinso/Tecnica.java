
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tecnica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tecnica#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tecnica#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tecnica#getUsosTecnica <em>Usos Tecnica</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnica()
 * @model
 * @generated
 */
public interface Tecnica extends ConDocumentacion, Referenciable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnica_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Tecnica#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tecnicas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getTecnicas <em>Tecnicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnicas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnicas</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnica_Tecnicas()
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas#getTecnicas
	 * @model opposite="tecnicas" required="true" changeable="false"
	 * @generated
	 */
	Tecnicas getTecnicas();

	/**
	 * Returns the value of the '<em><b>Usos Tecnica</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoTecnica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica <em>Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Tecnica</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Tecnica</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTecnica_UsosTecnica()
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getTecnica
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoTecnica" opposite="tecnica" changeable="false"
	 * @generated
	 */
	EList getUsosTecnica();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='nombre.size() > 0 '"
	 * @generated
	 */
	boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext);

} // Tecnica