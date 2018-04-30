/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.util;

import es.gva.cit.gvcase.prototipo.rdbms.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage
 * @generated
 */
public class RdbmsSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdbmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsSwitch() {
		if (modelPackage == null) {
			modelPackage = RdbmsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdbmsPackage.COLUMN: {
				Column column = (Column)theEObject;
				Object result = caseColumn(column);
				if (result == null) result = caseNamedElement(column);
				if (result == null) result = caseElement(column);
				if (result == null) result = caseConModelClass(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				Object result = caseDataType(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = caseConModelClass(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.ELEMENT: {
				Element element = (Element)theEObject;
				Object result = caseElement(element);
				if (result == null) result = caseConModelClass(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				Object result = caseForeignKey(foreignKey);
				if (result == null) result = caseNamedElement(foreignKey);
				if (result == null) result = caseElement(foreignKey);
				if (result == null) result = caseConModelClass(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.FOREIGN_KEY_COLUMN: {
				ForeignKeyColumn foreignKeyColumn = (ForeignKeyColumn)theEObject;
				Object result = caseForeignKeyColumn(foreignKeyColumn);
				if (result == null) result = caseElement(foreignKeyColumn);
				if (result == null) result = caseConModelClass(foreignKeyColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = caseConModelClass(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.PRIMARY_KEY: {
				PrimaryKey primaryKey = (PrimaryKey)theEObject;
				Object result = casePrimaryKey(primaryKey);
				if (result == null) result = caseNamedElement(primaryKey);
				if (result == null) result = caseElement(primaryKey);
				if (result == null) result = caseConModelClass(primaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				Object result = caseSchema(schema);
				if (result == null) result = caseNamedElement(schema);
				if (result == null) result = caseElement(schema);
				if (result == null) result = caseConModelClass(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.TABLE: {
				Table table = (Table)theEObject;
				Object result = caseTable(table);
				if (result == null) result = caseNamedElement(table);
				if (result == null) result = caseElement(table);
				if (result == null) result = caseConModelClass(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.VIEW: {
				View view = (View)theEObject;
				Object result = caseView(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = caseElement(view);
				if (result == null) result = caseConModelClass(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.VIEW_COLUMN: {
				ViewColumn viewColumn = (ViewColumn)theEObject;
				Object result = caseViewColumn(viewColumn);
				if (result == null) result = caseElement(viewColumn);
				if (result == null) result = caseConModelClass(viewColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.JOIN: {
				Join join = (Join)theEObject;
				Object result = caseJoin(join);
				if (result == null) result = caseElement(join);
				if (result == null) result = caseConModelClass(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.CON_MODEL_CLASS: {
				ConModelClass conModelClass = (ConModelClass)theEObject;
				Object result = caseConModelClass(conModelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimaryKey(PrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Foreign Key Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Foreign Key Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForeignKeyColumn(ForeignKeyColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>View Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>View Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewColumn(ViewColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Con Model Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConModelClass(ConModelClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //RdbmsSwitch
