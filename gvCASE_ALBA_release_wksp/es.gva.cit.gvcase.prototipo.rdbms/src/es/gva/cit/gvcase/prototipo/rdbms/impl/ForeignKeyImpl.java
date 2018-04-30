/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.ForeignKey;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn;
import es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Table;

import es.gva.cit.gvcase.prototipo.rdbms.util.RdbmsValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends NamedElementImpl implements ForeignKey {
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
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected EList keyColumns = null;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey = null;

	/**
	 * The parsed OCL expression for the definition of the '{@link #validatePrimaryKeyTable <em>Validate Primary Key Table</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimaryKeyTable
	 * @generated
	 */
	private static OCLExpression validatePrimaryKeyTableInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #validateKeyColumnsSize <em>Validate Key Columns Size</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateKeyColumnsSize
	 * @generated
	 */
	private static OCLExpression validateKeyColumnsSizeInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #validateKeyColumnsSequence <em>Validate Key Columns Sequence</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateKeyColumnsSequence
	 * @generated
	 */
	private static OCLExpression validateKeyColumnsSequenceInvOCL;
	
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
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getForeignKey().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ForeignKey");
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
System.out.println("ForeignKey");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ForeignKey");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ForeignKey etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKeyColumns() {
		if (keyColumns == null) {
			keyColumns = new EObjectContainmentWithInverseEList(ForeignKeyColumn.class, this, RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS, RdbmsPackage.FOREIGN_KEY_COLUMN__KEY);
		}
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID != RdbmsPackage.FOREIGN_KEY__TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		if (primaryKey != null && primaryKey.eIsProxy()) {
			InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
			primaryKey = (PrimaryKey)eResolveProxy(oldPrimaryKey);
			if (primaryKey != oldPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY, oldPrimaryKey, primaryKey));
			}
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS, PrimaryKey.class, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS, PrimaryKey.class, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKeyTable(DiagnosticChain diagnostics, Map context) {
		if (validatePrimaryKeyTableInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validatePrimaryKeyTableInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validatePrimaryKeyTableInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY__VALIDATE_PRIMARY_KEY_TABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrimaryKeyTable", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateKeyColumnsSize(DiagnosticChain diagnostics, Map context) {
		if (validateKeyColumnsSizeInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(2);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateKeyColumnsSizeInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateKeyColumnsSizeInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY__VALIDATE_KEY_COLUMNS_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateKeyColumnsSize", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateKeyColumnsSequence(DiagnosticChain diagnostics, Map context) {
		if (validateKeyColumnsSequenceInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(3);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateKeyColumnsSequenceInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateKeyColumnsSequenceInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY__VALIDATE_KEY_COLUMNS_SEQUENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateKeyColumnsSequence", EObjectValidator.getObjectLabel(this, context) }),
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
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				return ((InternalEList)getKeyColumns()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.FOREIGN_KEY__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbmsPackage.FOREIGN_KEY__TABLE, msgs);
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				if (primaryKey != null)
					msgs = ((InternalEObject)primaryKey).eInverseRemove(this, RdbmsPackage.PRIMARY_KEY__PRIMARY_KEY_OF_FOREIGN_KEYS, PrimaryKey.class, msgs);
				return basicSetPrimaryKey((PrimaryKey)otherEnd, msgs);
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
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				return ((InternalEList)getKeyColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.FOREIGN_KEY__TABLE:
				return eBasicSetContainer(null, RdbmsPackage.FOREIGN_KEY__TABLE, msgs);
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
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
			case RdbmsPackage.FOREIGN_KEY__TABLE:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.TABLE__FOREIGN_KEYS, Table.class, msgs);
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
			case RdbmsPackage.FOREIGN_KEY__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				return getKeyColumns();
			case RdbmsPackage.FOREIGN_KEY__TABLE:
				return getTable();
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
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
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				getKeyColumns().clear();
				getKeyColumns().addAll((Collection)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
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
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				getKeyColumns().clear();
				return;
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
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
			case RdbmsPackage.FOREIGN_KEY__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS:
				return keyColumns != null && !keyColumns.isEmpty();
			case RdbmsPackage.FOREIGN_KEY__TABLE:
				return getTable() != null;
			case RdbmsPackage.FOREIGN_KEY__PRIMARY_KEY:
				return primaryKey != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl