/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>rdbms</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RdbmsTests("rdbms Tests");
		suite.addTestSuite(ColumnTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(ForeignKeyTest.class);
		suite.addTestSuite(ForeignKeyColumnTest.class);
		suite.addTestSuite(PrimaryKeyTest.class);
		suite.addTestSuite(SchemaTest.class);
		suite.addTestSuite(TableTest.class);
		suite.addTestSuite(ViewTest.class);
		suite.addTestSuite(ViewColumnTest.class);
		suite.addTestSuite(JoinTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsTests(String name) {
		super(name);
	}

} //RdbmsTests
