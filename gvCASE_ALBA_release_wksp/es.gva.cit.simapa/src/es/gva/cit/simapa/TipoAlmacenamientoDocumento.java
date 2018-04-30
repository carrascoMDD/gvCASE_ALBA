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
 * A representation of the literals of the enumeration '<em><b>Tipo Almacenamiento Documento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoAlmacenamientoDocumento()
 * @model
 * @generated
 */
public final class TipoAlmacenamientoDocumento extends AbstractEnumerator {
	/**
	 * The '<em><b>No Establecido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Establecido</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ESTABLECIDO_LITERAL
	 * @model name="NoEstablecido"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ESTABLECIDO = 0;

	/**
	 * The '<em><b>Fichero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fichero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FICHERO_LITERAL
	 * @model name="Fichero"
	 * @generated
	 * @ordered
	 */
	public static final int FICHERO = 1;

	/**
	 * The '<em><b>Base Datos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Base Datos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASE_DATOS_LITERAL
	 * @model name="BaseDatos"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_DATOS = 2;

	/**
	 * The '<em><b>No Establecido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ESTABLECIDO
	 * @generated
	 * @ordered
	 */
	public static final TipoAlmacenamientoDocumento NO_ESTABLECIDO_LITERAL = new TipoAlmacenamientoDocumento(NO_ESTABLECIDO, "NoEstablecido", "NoEstablecido");

	/**
	 * The '<em><b>Fichero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FICHERO
	 * @generated
	 * @ordered
	 */
	public static final TipoAlmacenamientoDocumento FICHERO_LITERAL = new TipoAlmacenamientoDocumento(FICHERO, "Fichero", "Fichero");

	/**
	 * The '<em><b>Base Datos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_DATOS
	 * @generated
	 * @ordered
	 */
	public static final TipoAlmacenamientoDocumento BASE_DATOS_LITERAL = new TipoAlmacenamientoDocumento(BASE_DATOS, "BaseDatos", "BaseDatos");

	/**
	 * An array of all the '<em><b>Tipo Almacenamiento Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAlmacenamientoDocumento[] VALUES_ARRAY =
		new TipoAlmacenamientoDocumento[] {
			NO_ESTABLECIDO_LITERAL,
			FICHERO_LITERAL,
			BASE_DATOS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Almacenamiento Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Almacenamiento Documento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAlmacenamientoDocumento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAlmacenamientoDocumento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Almacenamiento Documento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAlmacenamientoDocumento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAlmacenamientoDocumento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Almacenamiento Documento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAlmacenamientoDocumento get(int value) {
		switch (value) {
			case NO_ESTABLECIDO: return NO_ESTABLECIDO_LITERAL;
			case FICHERO: return FICHERO_LITERAL;
			case BASE_DATOS: return BASE_DATOS_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAlmacenamientoDocumento(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoAlmacenamientoDocumento
