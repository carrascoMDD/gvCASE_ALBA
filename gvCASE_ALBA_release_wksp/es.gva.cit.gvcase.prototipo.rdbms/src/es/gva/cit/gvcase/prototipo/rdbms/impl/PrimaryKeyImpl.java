/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.Column;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKey;
import es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Table;

import es.gva.cit.gvcase.prototipo.rdbms.util.RdbmsValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.PrimaryKeyImpl#getPrimaryKeyOfForeignKeys <em>Primary Key Of Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyImpl extends NamedElementImpl implements PrimaryKey {
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList columns = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyOfForeignKeys() <em>Primary Key Of Foreign Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyOfForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList primaryKeyOfForeignKeys = null;

	/**
	 * The parsed OCL expression for the definition of the '{@link #validatePrimaryKeyColumnsTable <em>Validate Primary Key Columns Table</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryKeyColumnsTable
	 * @generated
	 */
	private static OCLExpression validatePrimaryKeyColumnsTableInvOCL;
	
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
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.PRIMARY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getPrimaryKey().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("PrimaryKey");
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
System.out.println("PrimaryKey");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("PrimaryKey");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "PrimaryKey etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID != RdbmsPackage.PRIMARY_KEY__TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColumns() {
		if (columns == null) {
			columns = new EObjectWithInverseResolvingEList(Column.class, this, RdbmsPackage.PRIMARY_KEY__COLUMNS, RdbmsPackage.COLUMN__PRIMARY_KEY);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrimaryKeyOfForeignKeys() {
		if (primaryKeyOfForeignKeys == null) {
			primaryKeyOfForeignKeys = new EObjectWithInverseResolvingEList(ForeignKey.class, this, RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS, RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY);
		}
		return primaryKeyOfForeignKeys;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKeyColumnsTable(DiagnosticChain diagnostics, Map context) {
		if (validatePrimaryKeyColumnsTableInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validatePrimaryKeyColumnsTableInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validatePrimaryKeyColumnsTableInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.PRIMARY_KEY__VALIDATE_PRIMARY_KEY_COLUMNS_TABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrimaryKeyColumnsTable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.PRIMARY_KEY__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbmsPackage.PRIMARY_KEY__TABLE, msgs);
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				return ((InternalEList)getColumns()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS:
				return ((InternalEList)getPrimaryKeyOfForeignKeys()).basicAdd(otherEnd, msgs);
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
			case RdbmsPackage.PRIMARY_KEY__TABLE:
				return eBasicSetContainer(null, RdbmsPackage.PRIMARY_KEY__TABLE, msgs);
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				return ((InternalEList)getColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS:
				return ((InternalEList)getPrimaryKeyOfForeignKeys()).basicRemove(otherEnd, msgs);
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
			case RdbmsPackage.PRIMARY_KEY__TABLE:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.TABLE__PRIMARY_KEY, Table.class, msgs);
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
			case RdbmsPackage.PRIMARY_KEY__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.PRIMARY_KEY__TABLE:
				return getTable();
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				return getColumns();
			case RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS:
				return getPrimaryKeyOfForeignKeys();
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
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection)newValue);
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
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				getColumns().clear();
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
			case RdbmsPackage.PRIMARY_KEY__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.PRIMARY_KEY__TABLE:
				return getTable() != null;
			case RdbmsPackage.PRIMARY_KEY__COLUMNS:
				return columns != null && !columns.isEmpty();
			case RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS:
				return primaryKeyOfForeignKeys != null && !primaryKeyOfForeignKeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl