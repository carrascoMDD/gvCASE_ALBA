
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
 * A representation of the model object '<em><b>Proceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigoYNombre <em>Codigo YNombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getActividades <em>Actividades</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigoCompleto <em>Codigo Completo</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso()
 * @model
 * @generated
 */
public interface Proceso extends ProinsoObject, ConDocumentacion, Referenciable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Codigo YNombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo YNombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo YNombre</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_CodigoYNombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if codigo.size() = 0  then \'?\' else codigo endif).concat(\' \').concat( if nombre.size() = 0  then \'~\' else nombre endif)'"
	 * @generated
	 */
	String getCodigoYNombre();

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_Codigo()
	 * @model required="true"
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Proceso#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Proceso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Actividad}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Actividad#getProceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividades</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_Actividades()
	 * @see es.gva.cit.gvmetrica.proinso.Actividad#getProceso
	 * @model type="es.gva.cit.gvmetrica.proinso.Actividad" opposite="proceso" containment="true"
	 * @generated
	 */
	EList getActividades();

	/**
	 * Returns the value of the '<em><b>Procesos</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Procesos#getProcesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procesos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procesos</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_Procesos()
	 * @see es.gva.cit.gvmetrica.proinso.Procesos#getProcesos
	 * @model opposite="procesos" required="true" changeable="false"
	 * @generated
	 */
	Procesos getProcesos();

	/**
	 * Returns the value of the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Completo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Completo</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getProceso_CodigoCompleto()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if codigo->isEmpty() then \'?\' else codigo endif'"
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

} // Proceso