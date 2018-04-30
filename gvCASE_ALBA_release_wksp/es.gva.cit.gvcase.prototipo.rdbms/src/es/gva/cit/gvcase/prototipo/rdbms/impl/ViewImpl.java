/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.Join;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Schema;
import es.gva.cit.gvcase.prototipo.rdbms.Table;
import es.gva.cit.gvcase.prototipo.rdbms.View;
import es.gva.cit.gvcase.prototipo.rdbms.Column;
import es.gva.cit.gvcase.prototipo.rdbms.ViewColumn;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsFactory;



import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getViewColumns <em>View Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ViewImpl#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends NamedElementImpl implements View {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList tables = null;

	/**
	 * The default value of the '{@link #getWhereClause() <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected static final String WHERE_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected String whereClause = WHERE_CLAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewColumns() <em>View Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewColumns()
	 * @generated
	 * @ordered
	 */
	protected EList viewColumns = null;

	/**
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoins()
	 * @generated
	 * @ordered
	 */
	protected EList joins = null;


	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiqueta <em>Etiqueta</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta
	 * @generated
	 */
	private static OCLExpression etiquetaDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getView().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("View");
System.out.println("etiqueta");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("View");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("View");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "View etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID != RdbmsPackage.VIEW__SCHEMA) return null;
		return (Schema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTables() {
		if (tables == null) {
			tables = new EObjectResolvingEList(Table.class, this, RdbmsPackage.VIEW__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(String newWhereClause) {
		String oldWhereClause = whereClause;
		whereClause = newWhereClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.VIEW__WHERE_CLAUSE, oldWhereClause, whereClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViewColumns() {
		if (viewColumns == null) {
			viewColumns = new EObjectContainmentWithInverseEList(ViewColumn.class, this, RdbmsPackage.VIEW__VIEW_COLUMNS, RdbmsPackage.VIEW_COLUMN__VIEW);
		}
		return viewColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJoins() {
		if (joins == null) {
			joins = new EObjectContainmentWithInverseEList(Join.class, this, RdbmsPackage.VIEW__JOINS, RdbmsPackage.JOIN__VIEW);
		}
		return joins;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public int createViewColumns() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		int aNumCreatedViewColumns = 0;
		
		EList someTables = getTables();
		if( someTables == null) { return aNumCreatedViewColumns;}

		
		int aNumTables = someTables.size();
		if( aNumTables < 1)  { return aNumCreatedViewColumns;}
		
		for( int aTableIndex = 0; aTableIndex < aNumTables; aTableIndex++) {
			Table aTable = (Table) someTables.get(aTableIndex);
			if( aTable != null) {
				EList someColumns = aTable.getColumns();
				if( someColumns == null) { return aNumCreatedViewColumns;}
				
				int aNumColumns = someColumns.size();
				if( aNumColumns < 1)  { return 0;}
				
				for( int aColumnIndex = 0; aColumnIndex < aNumColumns; aColumnIndex++) {
					Column aColumn = (Column) someColumns.get(aColumnIndex);
					if( aColumn != null) {

						ViewColumn aFoundViewColumn = null;

						EList someViewColumns = getViewColumns();
						if( someViewColumns != null) { 
							int aNumViewColumns = someViewColumns.size();						
							for( int aViewColumnIndex = 0; aViewColumnIndex < aNumViewColumns; aViewColumnIndex++) {
								ViewColumn aViewColumn = (ViewColumn) someViewColumns.get(aViewColumnIndex);
								if( aViewColumn != null) {
									Column aViewColumnColumn = aViewColumn.getColumn();
									if( aViewColumnColumn != null && aViewColumnColumn == aColumn) {
										aFoundViewColumn = aViewColumn;
										break;
									}
								}
							}
						}
						
						if( aFoundViewColumn == null) {
							ViewColumn aNewViewColumn = RdbmsFactory.eINSTANCE.createViewColumn();
							getViewColumns().add( aNewViewColumn);
							aNewViewColumn.setColumn( aColumn);
							aNumCreatedViewColumns++;
						}
					}
				}
			}
		}
		return aNumCreatedViewColumns;
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.VIEW__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbmsPackage.VIEW__SCHEMA, msgs);
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				return ((InternalEList)getViewColumns()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.VIEW__JOINS:
				return ((InternalEList)getJoins()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.VIEW__SCHEMA:
				return eBasicSetContainer(null, RdbmsPackage.VIEW__SCHEMA, msgs);
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				return ((InternalEList)getViewColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.VIEW__JOINS:
				return ((InternalEList)getJoins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case RdbmsPackage.VIEW__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.SCHEMA__VIEWS, Schema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.VIEW__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.VIEW__SCHEMA:
				return getSchema();
			case RdbmsPackage.VIEW__TABLES:
				return getTables();
			case RdbmsPackage.VIEW__WHERE_CLAUSE:
				return getWhereClause();
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				return getViewColumns();
			case RdbmsPackage.VIEW__JOINS:
				return getJoins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdbmsPackage.VIEW__TABLES:
				getTables().clear();
				getTables().addAll((Collection)newValue);
				return;
			case RdbmsPackage.VIEW__WHERE_CLAUSE:
				setWhereClause((String)newValue);
				return;
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				getViewColumns().clear();
				getViewColumns().addAll((Collection)newValue);
				return;
			case RdbmsPackage.VIEW__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdbmsPackage.VIEW__TABLES:
				getTables().clear();
				return;
			case RdbmsPackage.VIEW__WHERE_CLAUSE:
				setWhereClause(WHERE_CLAUSE_EDEFAULT);
				return;
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				getViewColumns().clear();
				return;
			case RdbmsPackage.VIEW__JOINS:
				getJoins().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdbmsPackage.VIEW__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.VIEW__SCHEMA:
				return getSchema() != null;
			case RdbmsPackage.VIEW__TABLES:
				return tables != null && !tables.isEmpty();
			case RdbmsPackage.VIEW__WHERE_CLAUSE:
				return WHERE_CLAUSE_EDEFAULT == null ? whereClause != null : !WHERE_CLAUSE_EDEFAULT.equals(whereClause);
			case RdbmsPackage.VIEW__VIEW_COLUMNS:
				return viewColumns != null && !viewColumns.isEmpty();
			case RdbmsPackage.VIEW__JOINS:
				return joins != null && !joins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (whereClause: ");
		result.append(whereClause);
		result.append(')');
		return result.toString();
	}

} //ViewImpl