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
 * A representation of the literals of the enumeration '<em><b>Tipo Desarrollo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoDesarrollo()
 * @model
 * @generated
 */
public final class TipoDesarrollo extends AbstractEnumerator {
	/**
	 * The '<em><b>Externa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Externa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNA_LITERAL
	 * @model name="Externa"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNA = 0;

	/**
	 * The '<em><b>Servicio Informatica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Servicio Informatica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICIO_INFORMATICA_LITERAL
	 * @model name="ServicioInformatica"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICIO_INFORMATICA = 1;

	/**
	 * The '<em><b>Propia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Propia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPIA_LITERAL
	 * @model name="Propia"
	 * @generated
	 * @ordered
	 */
	public static final int PROPIA = 2;

	/**
	 * The '<em><b>Externa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNA
	 * @generated
	 * @ordered
	 */
	public static final TipoDesarrollo EXTERNA_LITERAL = new TipoDesarrollo(EXTERNA, "Externa", "Externa");

	/**
	 * The '<em><b>Servicio Informatica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICIO_INFORMATICA
	 * @generated
	 * @ordered
	 */
	public static final TipoDesarrollo SERVICIO_INFORMATICA_LITERAL = new TipoDesarrollo(SERVICIO_INFORMATICA, "ServicioInformatica", "ServicioInformatica");

	/**
	 * The '<em><b>Propia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPIA
	 * @generated
	 * @ordered
	 */
	public static final TipoDesarrollo PROPIA_LITERAL = new TipoDesarrollo(PROPIA, "Propia", "Propia");

	/**
	 * An array of all the '<em><b>Tipo Desarrollo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoDesarrollo[] VALUES_ARRAY =
		new TipoDesarrollo[] {
			EXTERNA_LITERAL,
			SERVICIO_INFORMATICA_LITERAL,
			PROPIA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Desarrollo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Desarrollo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDesarrollo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDesarrollo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Desarrollo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDesarrollo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDesarrollo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Desarrollo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoDesarrollo get(int value) {
		switch (value) {
			case EXTERNA: return EXTERNA_LITERAL;
			case SERVICIO_INFORMATICA: return SERVICIO_INFORMATICA_LITERAL;
			case PROPIA: return PROPIA_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoDesarrollo(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoDesarrollo
