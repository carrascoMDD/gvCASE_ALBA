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
 * A representation of the literals of the enumeration '<em><b>Tipo Relacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoRelacion()
 * @model
 * @generated
 */
public final class TipoRelacion extends AbstractEnumerator {
	/**
	 * The '<em><b>Referencia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Referencia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCIA_LITERAL
	 * @model name="Referencia"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCIA = 0;

	/**
	 * The '<em><b>Agregacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agregacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGREGACION_LITERAL
	 * @model name="Agregacion"
	 * @generated
	 * @ordered
	 */
	public static final int AGREGACION = 1;

	/**
	 * The '<em><b>Agregado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agregado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGREGADO_LITERAL
	 * @model name="Agregado"
	 * @generated
	 * @ordered
	 */
	public static final int AGREGADO = 2;

	/**
	 * The '<em><b>Composicion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composicion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSICION_LITERAL
	 * @model name="Composicion"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSICION = 3;

	/**
	 * The '<em><b>Componente</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Componente</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENTE_LITERAL
	 * @model name="Componente"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENTE = 4;

	/**
	 * The '<em><b>Referencia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCIA
	 * @generated
	 * @ordered
	 */
	public static final TipoRelacion REFERENCIA_LITERAL = new TipoRelacion(REFERENCIA, "Referencia", "Referencia");

	/**
	 * The '<em><b>Agregacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREGACION
	 * @generated
	 * @ordered
	 */
	public static final TipoRelacion AGREGACION_LITERAL = new TipoRelacion(AGREGACION, "Agregacion", "Agregacion");

	/**
	 * The '<em><b>Agregado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREGADO
	 * @generated
	 * @ordered
	 */
	public static final TipoRelacion AGREGADO_LITERAL = new TipoRelacion(AGREGADO, "Agregado", "Agregado");

	/**
	 * The '<em><b>Composicion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSICION
	 * @generated
	 * @ordered
	 */
	public static final TipoRelacion COMPOSICION_LITERAL = new TipoRelacion(COMPOSICION, "Composicion", "Composicion");

	/**
	 * The '<em><b>Componente</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENTE
	 * @generated
	 * @ordered
	 */
	public static final TipoRelacion COMPONENTE_LITERAL = new TipoRelacion(COMPONENTE, "Componente", "Componente");

	/**
	 * An array of all the '<em><b>Tipo Relacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoRelacion[] VALUES_ARRAY =
		new TipoRelacion[] {
			REFERENCIA_LITERAL,
			AGREGACION_LITERAL,
			AGREGADO_LITERAL,
			COMPOSICION_LITERAL,
			COMPONENTE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Relacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoRelacion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoRelacion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoRelacion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoRelacion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Relacion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoRelacion get(int value) {
		switch (value) {
			case REFERENCIA: return REFERENCIA_LITERAL;
			case AGREGACION: return AGREGACION_LITERAL;
			case AGREGADO: return AGREGADO_LITERAL;
			case COMPOSICION: return COMPOSICION_LITERAL;
			case COMPONENTE: return COMPONENTE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoRelacion(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoRelacion
