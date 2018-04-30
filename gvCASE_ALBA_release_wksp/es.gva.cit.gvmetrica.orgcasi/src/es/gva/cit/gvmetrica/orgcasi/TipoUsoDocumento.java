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
 * A representation of the literals of the enumeration '<em><b>Tipo Uso Documento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoUsoDocumento()
 * @model
 * @generated
 */
public final class TipoUsoDocumento extends AbstractEnumerator {
	/**
	 * The '<em><b>Entrada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entrada</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRADA_LITERAL
	 * @model name="entrada"
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
	 * @model name="salida"
	 * @generated
	 * @ordered
	 */
	public static final int SALIDA = 1;

	/**
	 * The '<em><b>Entrada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRADA
	 * @generated
	 * @ordered
	 */
	public static final TipoUsoDocumento ENTRADA_LITERAL = new TipoUsoDocumento(ENTRADA, "entrada", "entrada");

	/**
	 * The '<em><b>Salida</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALIDA
	 * @generated
	 * @ordered
	 */
	public static final TipoUsoDocumento SALIDA_LITERAL = new TipoUsoDocumento(SALIDA, "salida", "salida");

	/**
	 * An array of all the '<em><b>Tipo Uso Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoUsoDocumento[] VALUES_ARRAY =
		new TipoUsoDocumento[] {
			ENTRADA_LITERAL,
			SALIDA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Uso Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Uso Documento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUsoDocumento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoUsoDocumento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Uso Documento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUsoDocumento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoUsoDocumento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Uso Documento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoUsoDocumento get(int value) {
		switch (value) {
			case ENTRADA: return ENTRADA_LITERAL;
			case SALIDA: return SALIDA_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoUsoDocumento(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoUsoDocumento
