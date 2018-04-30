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
 * A representation of the literals of the enumeration '<em><b>Tipo Ambito Documento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoAmbitoDocumento()
 * @model
 * @generated
 */
public final class TipoAmbitoDocumento extends AbstractEnumerator {
	/**
	 * The '<em><b>Entrada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entrada</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRADA_LITERAL
	 * @model name="Entrada"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRADA = 0;

	/**
	 * The '<em><b>Salida</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Salida</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SALIDA_LITERAL
	 * @model name="Salida"
	 * @generated
	 * @ordered
	 */
	public static final int SALIDA = 1;

	/**
	 * The '<em><b>Interno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNO_LITERAL
	 * @model name="Interno"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNO = 2;

	/**
	 * The '<em><b>Entrada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRADA
	 * @generated
	 * @ordered
	 */
	public static final TipoAmbitoDocumento ENTRADA_LITERAL = new TipoAmbitoDocumento(ENTRADA, "Entrada", "Entrada");

	/**
	 * The '<em><b>Salida</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALIDA
	 * @generated
	 * @ordered
	 */
	public static final TipoAmbitoDocumento SALIDA_LITERAL = new TipoAmbitoDocumento(SALIDA, "Salida", "Salida");

	/**
	 * The '<em><b>Interno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNO
	 * @generated
	 * @ordered
	 */
	public static final TipoAmbitoDocumento INTERNO_LITERAL = new TipoAmbitoDocumento(INTERNO, "Interno", "Interno");

	/**
	 * An array of all the '<em><b>Tipo Ambito Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAmbitoDocumento[] VALUES_ARRAY =
		new TipoAmbitoDocumento[] {
			ENTRADA_LITERAL,
			SALIDA_LITERAL,
			INTERNO_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Ambito Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Ambito Documento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAmbitoDocumento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAmbitoDocumento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Ambito Documento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAmbitoDocumento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAmbitoDocumento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Ambito Documento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAmbitoDocumento get(int value) {
		switch (value) {
			case ENTRADA: return ENTRADA_LITERAL;
			case SALIDA: return SALIDA_LITERAL;
			case INTERNO: return INTERNO_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAmbitoDocumento(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoAmbitoDocumento
