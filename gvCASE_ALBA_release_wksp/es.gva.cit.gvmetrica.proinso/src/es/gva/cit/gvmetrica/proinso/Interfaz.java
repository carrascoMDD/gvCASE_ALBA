
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
 * A representation of the model object '<em><b>Interfaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaz#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaz#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaz#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaz#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Interfaz#getCodigoCompleto <em>Codigo Completo</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz()
 * @model
 * @generated
 */
public interface Interfaz extends ProinsoObject, ConDocumentacion, Referenciable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz_Codigo()
	 * @model required="true"
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Interfaz#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Interfaces#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz_Interfaces()
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces#getInterfaces
	 * @model opposite="interfaces" required="true" changeable="false"
	 * @generated
	 */
	Interfaces getInterfaces();

	/**
	 * Returns the value of the '<em><b>Procesos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getInterfaz <em>Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procesos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procesos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz_Procesos()
	 * @see es.gva.cit.gvmetrica.proinso.ProcesoInterfaz#getInterfaz
	 * @model type="es.gva.cit.gvmetrica.proinso.ProcesoInterfaz" opposite="interfaz" containment="true"
	 * @generated
	 */
	EList getProcesos();

	/**
	 * Returns the value of the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Completo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Completo</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getInterfaz_CodigoCompleto()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive=' if codigo->isEmpty() then \'?\' else codigo endif'"
	 * @generated
	 */
	String getCodigoCompleto();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='nombre.size() > 0 '"
	 * @generated
	 */
	boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='codigo.size() > 0'"
	 * @generated
	 */
	boolean codigo_validar(DiagnosticChain theDiagnostics, Map theContext);

} // Interfaz