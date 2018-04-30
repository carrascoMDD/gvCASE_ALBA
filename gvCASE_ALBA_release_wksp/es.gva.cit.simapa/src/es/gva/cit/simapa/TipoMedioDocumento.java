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
 * A representation of the literals of the enumeration '<em><b>Tipo Medio Documento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoMedioDocumento()
 * @model
 * @generated
 */
public final class TipoMedioDocumento extends AbstractEnumerator {
	/**
	 * The '<em><b>Electronico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electronico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICO_LITERAL
	 * @model name="Electronico"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONICO = 0;

	/**
	 * The '<em><b>Papel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Papel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAPEL_LITERAL
	 * @model name="Papel"
	 * @generated
	 * @ordered
	 */
	public static final int PAPEL = 1;

	/**
	 * The '<em><b>Electronico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICO
	 * @generated
	 * @ordered
	 */
	public static final TipoMedioDocumento ELECTRONICO_LITERAL = new TipoMedioDocumento(ELECTRONICO, "Electronico", "Electronico");

	/**
	 * The '<em><b>Papel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAPEL
	 * @generated
	 * @ordered
	 */
	public static final TipoMedioDocumento PAPEL_LITERAL = new TipoMedioDocumento(PAPEL, "Papel", "Papel");

	/**
	 * An array of all the '<em><b>Tipo Medio Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoMedioDocumento[] VALUES_ARRAY =
		new TipoMedioDocumento[] {
			ELECTRONICO_LITERAL,
			PAPEL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Medio Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Medio Documento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMedioDocumento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoMedioDocumento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Medio Documento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMedioDocumento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoMedioDocumento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Medio Documento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMedioDocumento get(int value) {
		switch (value) {
			case ELECTRONICO: return ELECTRONICO_LITERAL;
			case PAPEL: return PAPEL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoMedioDocumento(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoMedioDocumento
