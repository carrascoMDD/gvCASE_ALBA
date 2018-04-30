
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
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigoYNombre <em>Codigo YNombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getActividad <em>Actividad</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getFlujos <em>Flujos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getParticipaciones <em>Participaciones</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoPracticas <em>Uso Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Tarea#getUsoTecnicas <em>Uso Tecnicas</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea()
 * @model
 * @generated
 */
public interface Tarea extends ConDocumentacion, Referenciable {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_CodigoYNombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='codigoCompleto.concat(\' \').concat( if nombre->isEmpty() or nombre.size() = 0  then \'~\' else nombre endif)'"
	 * @generated
	 */
	String getCodigoYNombre();

	/**
	 * Returns the value of the '<em><b>Codigo Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Completo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Completo</em>' attribute.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_CodigoCompleto()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='(if actividad->isEmpty() then \'?\' else actividad.codigoCompleto endif).concat(\'.\').concat( if codigo->isEmpty() or codigo.size() = 0 then \'?\' else codigo endif)'"
	 * @generated
	 */
	String getCodigoCompleto();

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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_Codigo()
	 * @model required="true"
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Tarea#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Tarea#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Actividad</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividad</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividad</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_Actividad()
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getTareas
	 * @model opposite="tareas" required="true" changeable="false"
	 * @generated
	 */
	ActividadAbstracta getActividad();

	/**
	 * Returns the value of the '<em><b>Flujos</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoFlujo}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoFlujo#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujos</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_Flujos()
	 * @see es.gva.cit.gvmetrica.proinso.UsoFlujo#getTarea
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoFlujo" opposite="tarea" containment="true"
	 * @generated
	 */
	EList getFlujos();

	/**
	 * Returns the value of the '<em><b>Participaciones</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Participacion}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Participacion#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participaciones</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_Participaciones()
	 * @see es.gva.cit.gvmetrica.proinso.Participacion#getTarea
	 * @model type="es.gva.cit.gvmetrica.proinso.Participacion" opposite="tarea" containment="true"
	 * @generated
	 */
	EList getParticipaciones();

	/**
	 * Returns the value of the '<em><b>Uso Practicas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoPractica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoPractica#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uso Practicas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uso Practicas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_UsoPracticas()
	 * @see es.gva.cit.gvmetrica.proinso.UsoPractica#getTarea
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoPractica" opposite="tarea" containment="true"
	 * @generated
	 */
	EList getUsoPracticas();

	/**
	 * Returns the value of the '<em><b>Uso Tecnicas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.UsoTecnica}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.UsoTecnica#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uso Tecnicas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uso Tecnicas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getTarea_UsoTecnicas()
	 * @see es.gva.cit.gvmetrica.proinso.UsoTecnica#getTarea
	 * @model type="es.gva.cit.gvmetrica.proinso.UsoTecnica" opposite="tarea" containment="true"
	 * @generated
	 */
	EList getUsoTecnicas();


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

} // Tarea