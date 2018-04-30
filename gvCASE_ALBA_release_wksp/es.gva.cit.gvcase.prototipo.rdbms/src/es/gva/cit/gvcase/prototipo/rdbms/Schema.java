/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getTables <em>Tables</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getViews <em>Views</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.Schema#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema_Etiqueta()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if name->isEmpty() or name.size() < 1 then \'?\' else name endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.Table}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema_Tables()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.Table#getSchema
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.Table" opposite="schema" containment="true" required="true"
	 * @generated
	 */
	EList getTables();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.DataType}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.DataType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema_DataTypes()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.DataType#getSchema
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.DataType" opposite="schema" containment="true"
	 * @generated
	 */
	EList getDataTypes();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link es.gva.cit.gvcase.prototipo.rdbms.View}.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvcase.prototipo.rdbms.View#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema_Views()
	 * @see es.gva.cit.gvcase.prototipo.rdbms.View#getSchema
	 * @model type="es.gva.cit.gvcase.prototipo.rdbms.View" opposite="schema" containment="true"
	 * @generated
	 */
	EList getViews();

	/**
	 * Returns the value of the '<em><b>Model Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Package</em>' reference.
	 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage#getSchema_ModelPackage()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EPackage getModelPackage();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='tables->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)'"
	 * @generated
	 */
	boolean validateUniqueTableNames(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='dataTypes->forAll(t1, t2 | t1 <> t2 implies t1.name <> t2.name)'"
	 * @generated
	 */
	boolean validateUniqueDataTypeNames(DiagnosticChain diagnostics, Map context);

} // Schema