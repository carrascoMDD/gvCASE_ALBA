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
 * A representation of the literals of the enumeration '<em><b>Tipo Prioridad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoPrioridad()
 * @model
 * @generated
 */
public final class TipoPrioridad extends AbstractEnumerator {
	/**
	 * The '<em><b>ALTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALTA = 0;

	/**
	 * The '<em><b>MEDIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA = 1;

	/**
	 * The '<em><b>BAJA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAJA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAJA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAJA = 2;

	/**
	 * The '<em><b>ALTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTA
	 * @generated
	 * @ordered
	 */
	public static final TipoPrioridad ALTA_LITERAL = new TipoPrioridad(ALTA, "ALTA", "ALTA");

	/**
	 * The '<em><b>MEDIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIA
	 * @generated
	 * @ordered
	 */
	public static final TipoPrioridad MEDIA_LITERAL = new TipoPrioridad(MEDIA, "MEDIA", "MEDIA");

	/**
	 * The '<em><b>BAJA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAJA
	 * @generated
	 * @ordered
	 */
	public static final TipoPrioridad BAJA_LITERAL = new TipoPrioridad(BAJA, "BAJA", "BAJA");

	/**
	 * An array of all the '<em><b>Tipo Prioridad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPrioridad[] VALUES_ARRAY =
		new TipoPrioridad[] {
			ALTA_LITERAL,
			MEDIA_LITERAL,
			BAJA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Prioridad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Prioridad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPrioridad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPrioridad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Prioridad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPrioridad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPrioridad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Prioridad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPrioridad get(int value) {
		switch (value) {
			case ALTA: return ALTA_LITERAL;
			case MEDIA: return MEDIA_LITERAL;
			case BAJA: return BAJA_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoPrioridad(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoPrioridad
