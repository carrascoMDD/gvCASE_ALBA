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
 * A representation of the literals of the enumeration '<em><b>Tipo Agrupacion Predefinida</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage#getTipoAgrupacionPredefinida()
 * @model
 * @generated
 */
public final class TipoAgrupacionPredefinida extends AbstractEnumerator {
	/**
	 * The '<em><b>Sistema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sistema</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SISTEMA_LITERAL
	 * @model name="Sistema"
	 * @generated
	 * @ordered
	 */
	public static final int SISTEMA = 0;

	/**
	 * The '<em><b>Subsistema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subsistema</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSISTEMA_LITERAL
	 * @model name="Subsistema"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSISTEMA = 1;

	/**
	 * The '<em><b>Suceso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suceso</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCESO_LITERAL
	 * @model name="Suceso"
	 * @generated
	 * @ordered
	 */
	public static final int SUCESO = 2;

	/**
	 * The '<em><b>Coreografia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coreografia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COREOGRAFIA_LITERAL
	 * @model name="Coreografia"
	 * @generated
	 * @ordered
	 */
	public static final int COREOGRAFIA = 3;

	/**
	 * The '<em><b>Modelo Informacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modelo Informacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODELO_INFORMACION_LITERAL
	 * @model name="ModeloInformacion"
	 * @generated
	 * @ordered
	 */
	public static final int MODELO_INFORMACION = 4;

	/**
	 * The '<em><b>Sistema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTEMA
	 * @generated
	 * @ordered
	 */
	public static final TipoAgrupacionPredefinida SISTEMA_LITERAL = new TipoAgrupacionPredefinida(SISTEMA, "Sistema", "Sistema");

	/**
	 * The '<em><b>Subsistema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSISTEMA
	 * @generated
	 * @ordered
	 */
	public static final TipoAgrupacionPredefinida SUBSISTEMA_LITERAL = new TipoAgrupacionPredefinida(SUBSISTEMA, "Subsistema", "Subsistema");

	/**
	 * The '<em><b>Suceso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCESO
	 * @generated
	 * @ordered
	 */
	public static final TipoAgrupacionPredefinida SUCESO_LITERAL = new TipoAgrupacionPredefinida(SUCESO, "Suceso", "Suceso");

	/**
	 * The '<em><b>Coreografia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREOGRAFIA
	 * @generated
	 * @ordered
	 */
	public static final TipoAgrupacionPredefinida COREOGRAFIA_LITERAL = new TipoAgrupacionPredefinida(COREOGRAFIA, "Coreografia", "Coreografia");

	/**
	 * The '<em><b>Modelo Informacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELO_INFORMACION
	 * @generated
	 * @ordered
	 */
	public static final TipoAgrupacionPredefinida MODELO_INFORMACION_LITERAL = new TipoAgrupacionPredefinida(MODELO_INFORMACION, "ModeloInformacion", "ModeloInformacion");

	/**
	 * An array of all the '<em><b>Tipo Agrupacion Predefinida</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAgrupacionPredefinida[] VALUES_ARRAY =
		new TipoAgrupacionPredefinida[] {
			SISTEMA_LITERAL,
			SUBSISTEMA_LITERAL,
			SUCESO_LITERAL,
			COREOGRAFIA_LITERAL,
			MODELO_INFORMACION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Agrupacion Predefinida</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Agrupacion Predefinida</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAgrupacionPredefinida get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAgrupacionPredefinida result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Agrupacion Predefinida</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAgrupacionPredefinida getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAgrupacionPredefinida result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Agrupacion Predefinida</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAgrupacionPredefinida get(int value) {
		switch (value) {
			case SISTEMA: return SISTEMA_LITERAL;
			case SUBSISTEMA: return SUBSISTEMA_LITERAL;
			case SUCESO: return SUCESO_LITERAL;
			case COREOGRAFIA: return COREOGRAFIA_LITERAL;
			case MODELO_INFORMACION: return MODELO_INFORMACION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAgrupacionPredefinida(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoAgrupacionPredefinida
