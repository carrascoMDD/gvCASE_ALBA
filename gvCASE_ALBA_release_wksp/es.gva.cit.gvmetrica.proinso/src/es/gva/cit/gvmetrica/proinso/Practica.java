
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
 * A representation of the model object '<em><b>Practica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Practica#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Practica#getPracticas <em>Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Practica#getUsosPractica <em>Usos Practica</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPractica()
 * @model
 * @generated
 */
public interface Practica extends ProinsoObject, ConDocumentacion, Referenciable {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPractica_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Practica#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Practicas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Practicas#getPracticas <em>Practicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practicas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practicas</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPractica_Practicas()
	 * @see es.gva.cit.gvmetrica.proinso.Practicas#getPracticas
	 * @model opposite="practicas" required="true" changeable="false"
	 * @generated
	 */
	Practicas getPracticas();

	/**
	 * Returns the value of the '<em><b>Usos Practica</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoPractica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica <em>Practica</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usos Practica</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usos Practica</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getPractica_UsosPractica()
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getPractica
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoPractica" opposite="practica" changeable="false"
	 * @generated
	 */
	EList getUsosPractica();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='nombre.size() > 0 '"
	 * @generated
	 */
	boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext);

} // Practica