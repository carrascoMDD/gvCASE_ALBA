/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.DataType;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Schema;
import es.gva.cit.gvcase.prototipo.rdbms.Table;
import es.gva.cit.gvcase.prototipo.rdbms.View;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl#getViews <em>Views</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.SchemaImpl#getModelPackage <em>Model Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends NamedElementImpl implements Schema {
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
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList tables = null;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList dataTypes = null;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList views = null;

	/**
	 * The parsed OCL expression for the definition of the '{@link #validateUniqueTableNames <em>Validate Unique Table Names</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUniqueTableNames
	 * @generated
	 */
	private static OCLExpression validateUniqueTableNamesInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #validateUniqueDataTypeNames <em>Validate Unique Data Type Names</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUniqueDataTypeNames
	 * @generated
	 */
	private static OCLExpression validateUniqueDataTypeNamesInvOCL;
	
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
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getSchema().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Schema");
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
System.out.println("Schema");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Schema");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Schema etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTables() {
		if (tables == null) {
			tables = new EObjectContainmentWithInverseEList(Table.class, this, RdbmsPackage.SCHEMA__TABLES, RdbmsPackage.TABLE__SCHEMA);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentWithInverseEList(DataType.class, this, RdbmsPackage.SCHEMA__DATA_TYPES, RdbmsPackage.DATA_TYPE__SCHEMA);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList(View.class, this, RdbmsPackage.SCHEMA__VIEWS, RdbmsPackage.VIEW__SCHEMA);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getModelPackage() {
		EPackage modelPackage = basicGetModelPackage();
		return modelPackage != null && modelPackage.eIsProxy() ? (EPackage)eResolveProxy((InternalEObject)modelPackage) : modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public EPackage basicGetModelPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return this.eClass().getEPackage();
		
		// throw new UnsupportedOperationException();
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueTableNames(DiagnosticChain diagnostics, Map context) {
		if (validateUniqueTableNamesInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateUniqueTableNamesInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateUniqueTableNamesInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.SCHEMA__VALIDATE_UNIQUE_TABLE_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUniqueTableNames", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateUniqueDataTypeNames(DiagnosticChain diagnostics, Map context) {
		if (validateUniqueDataTypeNamesInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(2);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateUniqueDataTypeNamesInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateUniqueDataTypeNamesInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.SCHEMA__VALIDATE_UNIQUE_DATA_TYPE_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUniqueDataTypeNames", EObjectValidator.getObjectLabel(this, context) }),
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
			case RdbmsPackage.SCHEMA__TABLES:
				return ((InternalEList)getTables()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				return ((InternalEList)getDataTypes()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.SCHEMA__VIEWS:
				return ((InternalEList)getViews()).basicAdd(otherEnd, msgs);
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
			case RdbmsPackage.SCHEMA__TABLES:
				return ((InternalEList)getTables()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				return ((InternalEList)getDataTypes()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.SCHEMA__VIEWS:
				return ((InternalEList)getViews()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.SCHEMA__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.SCHEMA__TABLES:
				return getTables();
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				return getDataTypes();
			case RdbmsPackage.SCHEMA__VIEWS:
				return getViews();
			case RdbmsPackage.SCHEMA__MODEL_PACKAGE:
				if (resolve) return getModelPackage();
				return basicGetModelPackage();
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
			case RdbmsPackage.SCHEMA__TABLES:
				getTables().clear();
				getTables().addAll((Collection)newValue);
				return;
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection)newValue);
				return;
			case RdbmsPackage.SCHEMA__VIEWS:
				getViews().clear();
				getViews().addAll((Collection)newValue);
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
			case RdbmsPackage.SCHEMA__TABLES:
				getTables().clear();
				return;
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				getDataTypes().clear();
				return;
			case RdbmsPackage.SCHEMA__VIEWS:
				getViews().clear();
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
			case RdbmsPackage.SCHEMA__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.SCHEMA__TABLES:
				return tables != null && !tables.isEmpty();
			case RdbmsPackage.SCHEMA__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case RdbmsPackage.SCHEMA__VIEWS:
				return views != null && !views.isEmpty();
			case RdbmsPackage.SCHEMA__MODEL_PACKAGE:
				return basicGetModelPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl