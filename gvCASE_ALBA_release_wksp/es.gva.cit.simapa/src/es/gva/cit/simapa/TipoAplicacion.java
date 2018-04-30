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
 * A representation of the literals of the enumeration '<em><b>Tipo Aplicacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoAplicacion()
 * @model
 * @generated
 */
public final class TipoAplicacion extends AbstractEnumerator {
	/**
	 * The '<em><b>Corporativa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corporativa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORPORATIVA_LITERAL
	 * @model name="Corporativa"
	 * @generated
	 * @ordered
	 */
	public static final int CORPORATIVA = 0;

	/**
	 * The '<em><b>Usuario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usuario</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USUARIO_LITERAL
	 * @model name="Usuario"
	 * @generated
	 * @ordered
	 */
	public static final int USUARIO = 1;

	/**
	 * The '<em><b>Corporativa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORPORATIVA
	 * @generated
	 * @ordered
	 */
	public static final TipoAplicacion CORPORATIVA_LITERAL = new TipoAplicacion(CORPORATIVA, "Corporativa", "Corporativa");

	/**
	 * The '<em><b>Usuario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USUARIO
	 * @generated
	 * @ordered
	 */
	public static final TipoAplicacion USUARIO_LITERAL = new TipoAplicacion(USUARIO, "Usuario", "Usuario");

	/**
	 * An array of all the '<em><b>Tipo Aplicacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAplicacion[] VALUES_ARRAY =
		new TipoAplicacion[] {
			CORPORATIVA_LITERAL,
			USUARIO_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Aplicacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Aplicacion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAplicacion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAplicacion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Aplicacion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAplicacion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAplicacion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Aplicacion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAplicacion get(int value) {
		switch (value) {
			case CORPORATIVA: return CORPORATIVA_LITERAL;
			case USUARIO: return USUARIO_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAplicacion(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoAplicacion
