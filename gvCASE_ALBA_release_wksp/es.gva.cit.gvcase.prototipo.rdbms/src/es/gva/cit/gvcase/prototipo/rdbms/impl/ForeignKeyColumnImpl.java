/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.Column;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKey;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;

import es.gva.cit.gvcase.prototipo.rdbms.util.RdbmsValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl#getKey <em>Key</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl#getForeignColumn <em>Foreign Column</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ForeignKeyColumnImpl#getOwnColumn <em>Own Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyColumnImpl extends ElementImpl implements ForeignKeyColumn {
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
	 * The cached value of the '{@link #getForeignColumn() <em>Foreign Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignColumn()
	 * @generated
	 * @ordered
	 */
	protected Column foreignColumn = null;

	/**
	 * The cached value of the '{@link #getOwnColumn() <em>Own Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnColumn()
	 * @generated
	 * @ordered
	 */
	protected Column ownColumn = null;

	/**
	 * The parsed OCL expression for the definition of the '{@link #validateOwnColumn <em>Validate Own Column</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOwnColumn
	 * @generated
	 */
	private static OCLExpression validateOwnColumnInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #validateForeignColumn <em>Validate Foreign Column</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateForeignColumn
	 * @generated
	 */
	private static OCLExpression validateForeignColumnInvOCL;
	
	/**
	 * The parsed OCL expression for the definition of the '{@link #validateColumnDataTypes <em>Validate Column Data Types</em>}' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateColumnDataTypes
	 * @generated
	 */
	private static OCLExpression validateColumnDataTypesInvOCL;
	
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
	protected ForeignKeyColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.FOREIGN_KEY_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getForeignKeyColumn().getEAllStructuralFeatures().get(1);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("ForeignKeyColumn");
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
System.out.println("ForeignKeyColumn");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("ForeignKeyColumn");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "ForeignKeyColumn etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey getKey() {
		if (eContainerFeatureID != RdbmsPackage.FOREIGN_KEY_COLUMN__KEY) return null;
		return (ForeignKey)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getForeignColumn() {
		if (foreignColumn != null && foreignColumn.eIsProxy()) {
			InternalEObject oldForeignColumn = (InternalEObject)foreignColumn;
			foreignColumn = (Column)eResolveProxy(oldForeignColumn);
			if (foreignColumn != oldForeignColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN, oldForeignColumn, foreignColumn));
			}
		}
		return foreignColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetForeignColumn() {
		return foreignColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignColumn(Column newForeignColumn, NotificationChain msgs) {
		Column oldForeignColumn = foreignColumn;
		foreignColumn = newForeignColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN, oldForeignColumn, newForeignColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignColumn(Column newForeignColumn) {
		if (newForeignColumn != foreignColumn) {
			NotificationChain msgs = null;
			if (foreignColumn != null)
				msgs = ((InternalEObject)foreignColumn).eInverseRemove(this, RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS, Column.class, msgs);
			if (newForeignColumn != null)
				msgs = ((InternalEObject)newForeignColumn).eInverseAdd(this, RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS, Column.class, msgs);
			msgs = basicSetForeignColumn(newForeignColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN, newForeignColumn, newForeignColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getOwnColumn() {
		if (ownColumn != null && ownColumn.eIsProxy()) {
			InternalEObject oldOwnColumn = (InternalEObject)ownColumn;
			ownColumn = (Column)eResolveProxy(oldOwnColumn);
			if (ownColumn != oldOwnColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN, oldOwnColumn, ownColumn));
			}
		}
		return ownColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetOwnColumn() {
		return ownColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnColumn(Column newOwnColumn, NotificationChain msgs) {
		Column oldOwnColumn = ownColumn;
		ownColumn = newOwnColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN, oldOwnColumn, newOwnColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnColumn(Column newOwnColumn) {
		if (newOwnColumn != ownColumn) {
			NotificationChain msgs = null;
			if (ownColumn != null)
				msgs = ((InternalEObject)ownColumn).eInverseRemove(this, RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS, Column.class, msgs);
			if (newOwnColumn != null)
				msgs = ((InternalEObject)newOwnColumn).eInverseAdd(this, RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS, Column.class, msgs);
			msgs = basicSetOwnColumn(newOwnColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN, newOwnColumn, newOwnColumn));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnColumn(DiagnosticChain diagnostics, Map context) {
		if (validateOwnColumnInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(0);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateOwnColumnInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateOwnColumnInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY_COLUMN__VALIDATE_OWN_COLUMN,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOwnColumn", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateForeignColumn(DiagnosticChain diagnostics, Map context) {
		if (validateForeignColumnInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(1);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateForeignColumnInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateForeignColumnInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY_COLUMN__VALIDATE_FOREIGN_COLUMN,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateForeignColumn", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateColumnDataTypes(DiagnosticChain diagnostics, Map context) {
		if (validateColumnDataTypesInvOCL == null) {
			EOperation eOperation = (EOperation) eClass().getEAllOperations().get(2);
			Environment env = ExpressionsUtil.createClassifierContext(eClass());
			EAnnotation ocl = eOperation.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String body = (String) ocl.getDetails().get("invariant");
			
			try {
				validateColumnDataTypesInvOCL = ExpressionsUtil.createInvariant(env, body, true);
			} catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(validateColumnDataTypesInvOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
		
		if (!query.check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RdbmsValidator.DIAGNOSTIC_SOURCE,
						 RdbmsValidator.FOREIGN_KEY_COLUMN__VALIDATE_COLUMN_DATA_TYPES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateColumnDataTypes", EObjectValidator.getObjectLabel(this, context) }),
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__KEY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbmsPackage.FOREIGN_KEY_COLUMN__KEY, msgs);
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				if (foreignColumn != null)
					msgs = ((InternalEObject)foreignColumn).eInverseRemove(this, RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS, Column.class, msgs);
				return basicSetForeignColumn((Column)otherEnd, msgs);
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				if (ownColumn != null)
					msgs = ((InternalEObject)ownColumn).eInverseRemove(this, RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS, Column.class, msgs);
				return basicSetOwnColumn((Column)otherEnd, msgs);
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__KEY:
				return eBasicSetContainer(null, RdbmsPackage.FOREIGN_KEY_COLUMN__KEY, msgs);
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				return basicSetForeignColumn(null, msgs);
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				return basicSetOwnColumn(null, msgs);
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__KEY:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.FOREIGN_KEY__KEY_COLUMNS, ForeignKey.class, msgs);
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.FOREIGN_KEY_COLUMN__KEY:
				return getKey();
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				if (resolve) return getForeignColumn();
				return basicGetForeignColumn();
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				if (resolve) return getOwnColumn();
				return basicGetOwnColumn();
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				setForeignColumn((Column)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				setOwnColumn((Column)newValue);
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				setForeignColumn((Column)null);
				return;
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				setOwnColumn((Column)null);
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
			case RdbmsPackage.FOREIGN_KEY_COLUMN__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.FOREIGN_KEY_COLUMN__KEY:
				return getKey() != null;
			case RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN:
				return foreignColumn != null;
			case RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN:
				return ownColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyColumnImpl