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
 * A representation of the literals of the enumeration '<em><b>Tipo Silencio Administrativo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoSilencioAdministrativo()
 * @model
 * @generated
 */
public final class TipoSilencioAdministrativo extends AbstractEnumerator {
	/**
	 * The '<em><b>Positivo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Positivo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVO_LITERAL
	 * @model name="Positivo"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVO = 0;

	/**
	 * The '<em><b>Negativo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negativo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATIVO_LITERAL
	 * @model name="Negativo"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVO = 1;

	/**
	 * The '<em><b>Positivo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVO
	 * @generated
	 * @ordered
	 */
	public static final TipoSilencioAdministrativo POSITIVO_LITERAL = new TipoSilencioAdministrativo(POSITIVO, "Positivo", "Positivo");

	/**
	 * The '<em><b>Negativo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVO
	 * @generated
	 * @ordered
	 */
	public static final TipoSilencioAdministrativo NEGATIVO_LITERAL = new TipoSilencioAdministrativo(NEGATIVO, "Negativo", "Negativo");

	/**
	 * An array of all the '<em><b>Tipo Silencio Administrativo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoSilencioAdministrativo[] VALUES_ARRAY =
		new TipoSilencioAdministrativo[] {
			POSITIVO_LITERAL,
			NEGATIVO_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Silencio Administrativo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Silencio Administrativo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSilencioAdministrativo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSilencioAdministrativo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Silencio Administrativo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSilencioAdministrativo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoSilencioAdministrativo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Silencio Administrativo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoSilencioAdministrativo get(int value) {
		switch (value) {
			case POSITIVO: return POSITIVO_LITERAL;
			case NEGATIVO: return NEGATIVO_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoSilencioAdministrativo(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoSilencioAdministrativo
