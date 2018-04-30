
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
 * A representation of the model object '<em><b>Actividad Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoYNombre <em>Codigo YNombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigoCompleto <em>Codigo Completo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getTareas <em>Tareas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getPredecesores <em>Predecesores</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getSucesores <em>Sucesores</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta()
 * @model
 * @generated
 */
public interface ActividadAbstracta extends ProinsoObject, ConDocumentacion, Referenciable {
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_CodigoYNombre()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='codigoCompleto.concat(\' \').concat( if nombre->isEmpty() then \'~\' else nombre endif)'"
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_CodigoCompleto()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.codigoCompleto.concat(\' \').concat( if codigo->isEmpty() then \'?\' else codigo endif) else self.oclAsType(ActividadInterfaz).proceso.codigoCompleto.concat(\' \').concat( if codigo->isEmpty() then \'?\' else codigo endif) endif'"
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_Codigo()
	 * @model required="true"
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tareas</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.Tarea}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tarea#getActividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tareas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tareas</em>' containment reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_Tareas()
	 * @see es.gva.cit.gvmetrica.proinso.Tarea#getActividad
	 * @model type="es.gva.cit.gvmetrica.proinso.Tarea" opposite="actividad" containment="true"
	 * @generated
	 */
	EList getTareas();

	/**
	 * Returns the value of the '<em><b>Predecesores</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getSucesores <em>Sucesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecesores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesores</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_Predecesores()
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getSucesores
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta" opposite="sucesores"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='predecesores_candidates()'"
	 * @generated
	 */
	EList getPredecesores();

	/**
	 * Returns the value of the '<em><b>Sucesores</b></em>' reference list.
	 * The list contents are of type {@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getPredecesores <em>Predecesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucesores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucesores</em>' reference list.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getActividadAbstracta_Sucesores()
	 * @see es.gva.cit.gvmetrica.proinso.ActividadAbstracta#getPredecesores
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta" opposite="predecesores"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl candidates='sucesores_candidates()'"
	 * @generated
	 */
	EList getSucesores();


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


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl body='(if predecesores->isEmpty() then predecesores else predecesores.todosPrecedesores() endif)->union(predecesores)'"
	 * @generated
	 */
	EList todosPredecesores();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl body='sucesores.todosSucesores->union(sucesores)'"
	 * @generated
	 */
	EList todosSucesores();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='predecesores_candidates()->includesAll( predecesores)'"
	 * @generated
	 */
	boolean predecesores_validar(DiagnosticChain theDiagnostics, Map theContext);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl body='if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.actividades else (self.oclAsType(ActividadInterfaz).proceso.actividades) endif - todosPredecesores()'"
	 * @generated
	 */
	EList predecesores_candidates();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='sucesores_candidates()->includesAll( sucesores)'"
	 * @generated
	 */
	boolean sucesores_validar(DiagnosticChain theDiagnostics, Map theContext);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="es.gva.cit.gvmetrica.proinso.ActividadAbstracta"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl body='if self.oclIsTypeOf(Actividad) then self.oclAsType(Actividad).proceso.actividades else (self.oclAsType(ActividadInterfaz).proceso.actividades) endif - todosSucesores()'"
	 * @generated
	 */
	EList sucesores_candidates();

} // ActividadAbstracta