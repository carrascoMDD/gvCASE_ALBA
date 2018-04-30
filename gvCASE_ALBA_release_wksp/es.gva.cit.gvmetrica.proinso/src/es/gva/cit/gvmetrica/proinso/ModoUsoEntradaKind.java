/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modo Uso Entrada Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getModoUsoEntradaKind()
 * @model
 * @generated
 */
public final class ModoUsoEntradaKind extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * The '<em><b>Consulta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consulta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSULTA_LITERAL
	 * @model name="Consulta"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTA = 7;

	/**
	 * The '<em><b>Validacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Validacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALIDACION_LITERAL
	 * @model name="Validacion"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDACION = 5;

	/**
	 * The '<em><b>Sustitucion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sustitucion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSTITUCION_LITERAL
	 * @model name="Sustitucion"
	 * @generated
	 * @ordered
	 */
	public static final int SUSTITUCION = 2;

	/**
	 * The '<em><b>Eliminacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eliminacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIMINACION_LITERAL
	 * @model name="Eliminacion"
	 * @generated
	 * @ordered
	 */
	public static final int ELIMINACION = 3;

	/**
	 * The '<em><b>Consulta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTA
	 * @generated
	 * @ordered
	 */
	public static final ModoUsoEntradaKind CONSULTA_LITERAL = new ModoUsoEntradaKind(CONSULTA, "Consulta", "Consulta");

	/**
	 * The '<em><b>Validacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDACION
	 * @generated
	 * @ordered
	 */
	public static final ModoUsoEntradaKind VALIDACION_LITERAL = new ModoUsoEntradaKind(VALIDACION, "Validacion", "Validacion");

	/**
	 * The '<em><b>Sustitucion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSTITUCION
	 * @generated
	 * @ordered
	 */
	public static final ModoUsoEntradaKind SUSTITUCION_LITERAL = new ModoUsoEntradaKind(SUSTITUCION, "Sustitucion", "Sustitucion");

	/**
	 * The '<em><b>Eliminacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIMINACION
	 * @generated
	 * @ordered
	 */
	public static final ModoUsoEntradaKind ELIMINACION_LITERAL = new ModoUsoEntradaKind(ELIMINACION, "Eliminacion", "Eliminacion");

	/**
	 * An array of all the '<em><b>Modo Uso Entrada Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModoUsoEntradaKind[] VALUES_ARRAY =
		new ModoUsoEntradaKind[] {
			CONSULTA_LITERAL,
			VALIDACION_LITERAL,
			SUSTITUCION_LITERAL,
			ELIMINACION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Modo Uso Entrada Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modo Uso Entrada Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModoUsoEntradaKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModoUsoEntradaKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modo Uso Entrada Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModoUsoEntradaKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModoUsoEntradaKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modo Uso Entrada Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModoUsoEntradaKind get(int value) {
		switch (value) {
			case CONSULTA: return CONSULTA_LITERAL;
			case VALIDACION: return VALIDACION_LITERAL;
			case SUSTITUCION: return SUSTITUCION_LITERAL;
			case ELIMINACION: return ELIMINACION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModoUsoEntradaKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ModoUsoEntradaKind
