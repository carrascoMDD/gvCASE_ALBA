/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.impl;

import es.gva.cit.gvcase.prototipo.rdbms.Column;
import es.gva.cit.gvcase.prototipo.rdbms.DataType;
import es.gva.cit.gvcase.prototipo.rdbms.ForeignKeyColumn;
import es.gva.cit.gvcase.prototipo.rdbms.Join;
import es.gva.cit.gvcase.prototipo.rdbms.PrimaryKey;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getEtiquetaMedia <em>Etiqueta Media</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getEtiquetaSimple <em>Etiqueta Simple</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getForeignOfKeyColumns <em>Foreign Of Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getOwnOfKeyColumns <em>Own Of Key Columns</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link es.gva.cit.gvcase.prototipo.rdbms.impl.ColumnImpl#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends NamedElementImpl implements Column {
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
	 * The default value of the '{@link #getEtiquetaMedia() <em>Etiqueta Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaMedia()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_MEDIA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEtiquetaSimple() <em>Etiqueta Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaSimple()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_SIMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignOfKeyColumns() <em>Foreign Of Key Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignOfKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected EList foreignOfKeyColumns = null;

	/**
	 * The cached value of the '{@link #getOwnOfKeyColumns() <em>Own Of Key Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnOfKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected EList ownOfKeyColumns = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = null;

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
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' reference list.
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
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiquetaMedia <em>Etiqueta Media</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaMedia
	 * @generated
	 */
	private static OCLExpression etiquetaMediaDeriveOCL;
	
	/**
	 * The parsed OCL expression for the derivation of '{@link #getEtiquetaSimple <em>Etiqueta Simple</em>}' property.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquetaSimple
	 * @generated
	 */
	private static OCLExpression etiquetaSimpleDeriveOCL;
	
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
//		if (etiquetaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getColumn().getEAllStructuralFeatures().get(2);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Column");
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
System.out.println("Column");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Column");
System.out.println("etiqueta");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Column etiqueta", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiquetaMedia() {
//		if (etiquetaMediaDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getColumn().getEAllStructuralFeatures().get(3);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaMediaDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Column");
System.out.println("etiquetaMedia");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaMediaDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Column");
System.out.println("etiquetaMedia");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Column");
System.out.println("etiquetaMedia");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Column etiquetaMedia", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiquetaSimple() {
//		if (etiquetaSimpleDeriveOCL == null) { 
			EStructuralFeature eFeature = (EStructuralFeature) RdbmsPackage.eINSTANCE.getColumn().getEAllStructuralFeatures().get(4);
			
			Environment env = ExpressionsUtil.createPropertyContext(eClass(), eFeature);
			EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String derive = (String) ocl.getDetails().get("derive");
			
			try {
				etiquetaSimpleDeriveOCL = ExpressionsUtil.createQuery(env, derive, true);
			} catch (ParserException e) {
System.out.println("Column");
System.out.println("etiquetaSimple");
System.out.print("OCL exception ");
System.out.println(e.getLocalizedMessage());
System.out.println(e.getStackTrace());

				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
//		}
		
		Query query = QueryFactory.eINSTANCE.createQuery(etiquetaSimpleDeriveOCL);
		EvalEnvironment evalEnv = new EvalEnvironment();
		query.setEvaluationEnvironment(evalEnv);
	
		if( query.evaluate(this).toString().equals( "OclInvalid")  /* == org.eclipse.emf.ocl.types.util.Types.OCL_INVALID */) {
System.out.println("Column");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
		}
		try {
			return (String) query.evaluate(this);
		} catch(Exception anException  ) {
System.out.println("Column");
System.out.println("etiquetaSimple");
System.out.print("OCL EVALUATION exception ");
System.out.println(anException.getLocalizedMessage());
System.out.println(anException.getStackTrace());
			throw new RuntimeException( "Column etiquetaSimple", anException);
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID != RdbmsPackage.COLUMN__TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getForeignOfKeyColumns() {
		if (foreignOfKeyColumns == null) {
			foreignOfKeyColumns = new EObjectWithInverseResolvingEList(ForeignKeyColumn.class, this, RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS, RdbmsPackage.FOREIGN_KEY_COLUMN__FOREIGN_COLUMN);
		}
		return foreignOfKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnOfKeyColumns() {
		if (ownOfKeyColumns == null) {
			ownOfKeyColumns = new EObjectWithInverseResolvingEList(ForeignKeyColumn.class, this, RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS, RdbmsPackage.FOREIGN_KEY_COLUMN__OWN_COLUMN);
		}
		return ownOfKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.COLUMN__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, RdbmsPackage.DATA_TYPE__COLUMNS, DataType.class, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, RdbmsPackage.DATA_TYPE__COLUMNS, DataType.class, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__DATA_TYPE, newDataType, newDataType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.COLUMN__PRIMARY_KEY, oldPrimaryKey, primaryKey));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
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
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, RdbmsPackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, RdbmsPackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJoins() {
		if (joins == null) {
			joins = new EObjectWithInverseResolvingEList.ManyInverse(Join.class, this, RdbmsPackage.COLUMN__JOINS, RdbmsPackage.JOIN__COLUMNS);
		}
		return joins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.COLUMN__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbmsPackage.COLUMN__TABLE, msgs);
			case RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS:
				return ((InternalEList)getForeignOfKeyColumns()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS:
				return ((InternalEList)getOwnOfKeyColumns()).basicAdd(otherEnd, msgs);
			case RdbmsPackage.COLUMN__DATA_TYPE:
				if (dataType != null)
					msgs = ((InternalEObject)dataType).eInverseRemove(this, RdbmsPackage.DATA_TYPE__COLUMNS, DataType.class, msgs);
				return basicSetDataType((DataType)otherEnd, msgs);
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
				if (primaryKey != null)
					msgs = ((InternalEObject)primaryKey).eInverseRemove(this, RdbmsPackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
				return basicSetPrimaryKey((PrimaryKey)otherEnd, msgs);
			case RdbmsPackage.COLUMN__JOINS:
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
			case RdbmsPackage.COLUMN__TABLE:
				return eBasicSetContainer(null, RdbmsPackage.COLUMN__TABLE, msgs);
			case RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS:
				return ((InternalEList)getForeignOfKeyColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS:
				return ((InternalEList)getOwnOfKeyColumns()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.COLUMN__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case RdbmsPackage.COLUMN__JOINS:
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
			case RdbmsPackage.COLUMN__TABLE:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.TABLE__COLUMNS, Table.class, msgs);
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
			case RdbmsPackage.COLUMN__ETIQUETA:
				return getEtiqueta();
			case RdbmsPackage.COLUMN__ETIQUETA_MEDIA:
				return getEtiquetaMedia();
			case RdbmsPackage.COLUMN__ETIQUETA_SIMPLE:
				return getEtiquetaSimple();
			case RdbmsPackage.COLUMN__TABLE:
				return getTable();
			case RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS:
				return getForeignOfKeyColumns();
			case RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS:
				return getOwnOfKeyColumns();
			case RdbmsPackage.COLUMN__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
			case RdbmsPackage.COLUMN__JOINS:
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
			case RdbmsPackage.COLUMN__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
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
			case RdbmsPackage.COLUMN__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
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
			case RdbmsPackage.COLUMN__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? getEtiqueta() != null : !ETIQUETA_EDEFAULT.equals(getEtiqueta());
			case RdbmsPackage.COLUMN__ETIQUETA_MEDIA:
				return ETIQUETA_MEDIA_EDEFAULT == null ? getEtiquetaMedia() != null : !ETIQUETA_MEDIA_EDEFAULT.equals(getEtiquetaMedia());
			case RdbmsPackage.COLUMN__ETIQUETA_SIMPLE:
				return ETIQUETA_SIMPLE_EDEFAULT == null ? getEtiquetaSimple() != null : !ETIQUETA_SIMPLE_EDEFAULT.equals(getEtiquetaSimple());
			case RdbmsPackage.COLUMN__TABLE:
				return getTable() != null;
			case RdbmsPackage.COLUMN__FOREIGN_OF_KEY_COLUMNS:
				return foreignOfKeyColumns != null && !foreignOfKeyColumns.isEmpty();
			case RdbmsPackage.COLUMN__OWN_OF_KEY_COLUMNS:
				return ownOfKeyColumns != null && !ownOfKeyColumns.isEmpty();
			case RdbmsPackage.COLUMN__DATA_TYPE:
				return dataType != null;
			case RdbmsPackage.COLUMN__PRIMARY_KEY:
				return primaryKey != null;
			case RdbmsPackage.COLUMN__JOINS:
				return joins != null && !joins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColumnImpl