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
 * A representation of the literals of the enumeration '<em><b>Tipo Unidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoUnidad()
 * @model
 * @generated
 */
public final class TipoUnidad extends AbstractEnumerator {
	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A = 0;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #B_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B = 1;

	/**
	 * The '<em><b>Mas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAS_LITERAL
	 * @model name="mas"
	 * @generated
	 * @ordered
	 */
	public static final int MAS = 2;

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @generated
	 * @ordered
	 */
	public static final TipoUnidad A_LITERAL = new TipoUnidad(A, "A", "A");

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @generated
	 * @ordered
	 */
	public static final TipoUnidad B_LITERAL = new TipoUnidad(B, "B", "B");

	/**
	 * The '<em><b>Mas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAS
	 * @generated
	 * @ordered
	 */
	public static final TipoUnidad MAS_LITERAL = new TipoUnidad(MAS, "mas", "mas");

	/**
	 * An array of all the '<em><b>Tipo Unidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoUnidad[] VALUES_ARRAY =
		new TipoUnidad[] {
			A_LITERAL,
			B_LITERAL,
			MAS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Unidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Unidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUnidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoUnidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Unidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUnidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoUnidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Unidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUnidad get(int value) {
		switch (value) {
			case A: return A_LITERAL;
			case B: return B_LITERAL;
			case MAS: return MAS_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoUnidad(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoUnidad
