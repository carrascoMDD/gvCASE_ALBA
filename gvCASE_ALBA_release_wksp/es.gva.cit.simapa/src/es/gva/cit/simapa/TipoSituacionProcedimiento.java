/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Situacion Procedimiento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoSituacionProcedimiento()
 * @model
 * @generated
 */
public final class TipoSituacionProcedimiento extends AbstractEnumerator {
	/**
	 * The '<em><b>Definitivo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Definitivo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFINITIVO_LITERAL
	 * @model name="Definitivo"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITIVO = 0;

	/**
	 * The '<em><b>Borrador</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Borrador</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORRADOR_LITERAL
	 * @model name="Borrador"
	 * @generated
	 * @ordered
	 */
	public static final int BORRADOR = 1;

	/**
	 * The '<em><b>Definitivo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINITIVO
	 * @generated
	 * @ordered
	 */
	public static final TipoSituacionProcedimiento DEFINITIVO_LITERAL = new TipoSituacionProcedimiento(DEFINITIVO, "Definitivo", "Definitivo");

	/**
	 * The '<em><b>Borrador</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORRADOR
	 * @generated
	 * @ordered
	 */
	public static final TipoSituacionProcedimiento BORRADOR_LITERAL = new TipoSituacionProcedimiento(BORRADOR, "Borrador", "Borrador");

	/**
	 * An array of all the '<em><b>Tipo Situacion Procedimiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoSituacionProcedimiento[] VALUES_ARRAY =
		new TipoSituacionProcedimiento[] {
			DEFINITIVO_LITERAL,
			BORRADOR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Situacion Procedimiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Situacion Procedimiento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSituacionProcedimiento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSituacionProcedimiento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Situacion Procedimiento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSituacionProcedimiento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSituacionProcedimiento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Situacion Procedimiento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSituacionProcedimiento get(int value) {
		switch (value) {
			case DEFINITIVO: return DEFINITIVO_LITERAL;
			case BORRADOR: return BORRADOR_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoSituacionProcedimiento(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoSituacionProcedimiento
