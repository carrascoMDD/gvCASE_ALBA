/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Subsistema</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoSubsistema()
 * @model
 * @generated
 */
public final class TipoSubsistema extends AbstractEnumerator {
	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I = 0;

	/**
	 * The '<em><b>EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EC = 1;

	/**
	 * The '<em><b>EX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EX_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EX = 2;

	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I
	 * @generated
	 * @ordered
	 */
	public static final TipoSubsistema I_LITERAL = new TipoSubsistema(I, "I", "I");

	/**
	 * The '<em><b>EC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EC
	 * @generated
	 * @ordered
	 */
	public static final TipoSubsistema EC_LITERAL = new TipoSubsistema(EC, "EC", "EC");

	/**
	 * The '<em><b>EX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EX
	 * @generated
	 * @ordered
	 */
	public static final TipoSubsistema EX_LITERAL = new TipoSubsistema(EX, "EX", "EX");

	/**
	 * An array of all the '<em><b>Tipo Subsistema</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoSubsistema[] VALUES_ARRAY =
		new TipoSubsistema[] {
			I_LITERAL,
			EC_LITERAL,
			EX_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Subsistema</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Subsistema</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSubsistema get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSubsistema result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Subsistema</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSubsistema getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSubsistema result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Subsistema</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSubsistema get(int value) {
		switch (value) {
			case I: return I_LITERAL;
			case EC: return EC_LITERAL;
			case EX: return EX_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoSubsistema(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoSubsistema
