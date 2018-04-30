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
 * A representation of the literals of the enumeration '<em><b>Tipo Acceso Archivo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.gva.cit.simapa.SimapaPackage#getTipoAccesoArchivo()
 * @model
 * @generated
 */
public final class TipoAccesoArchivo extends AbstractEnumerator {
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
	 * The '<em><b>Restringido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Restringido</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRINGIDO_LITERAL
	 * @model name="Restringido"
	 * @generated
	 * @ordered
	 */
	public static final int RESTRINGIDO = 1;

	/**
	 * The '<em><b>Libre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Libre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIBRE_LITERAL
	 * @model name="Libre"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRE = 2;

	/**
	 * The '<em><b>No Establecido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ESTABLECIDO
	 * @generated
	 * @ordered
	 */
	public static final TipoAccesoArchivo NO_ESTABLECIDO_LITERAL = new TipoAccesoArchivo(NO_ESTABLECIDO, "NoEstablecido", "NoEstablecido");

	/**
	 * The '<em><b>Restringido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRINGIDO
	 * @generated
	 * @ordered
	 */
	public static final TipoAccesoArchivo RESTRINGIDO_LITERAL = new TipoAccesoArchivo(RESTRINGIDO, "Restringido", "Restringido");

	/**
	 * The '<em><b>Libre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRE
	 * @generated
	 * @ordered
	 */
	public static final TipoAccesoArchivo LIBRE_LITERAL = new TipoAccesoArchivo(LIBRE, "Libre", "Libre");

	/**
	 * An array of all the '<em><b>Tipo Acceso Archivo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoAccesoArchivo[] VALUES_ARRAY =
		new TipoAccesoArchivo[] {
			NO_ESTABLECIDO_LITERAL,
			RESTRINGIDO_LITERAL,
			LIBRE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Acceso Archivo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Acceso Archivo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAccesoArchivo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAccesoArchivo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Acceso Archivo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAccesoArchivo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoAccesoArchivo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Acceso Archivo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoAccesoArchivo get(int value) {
		switch (value) {
			case NO_ESTABLECIDO: return NO_ESTABLECIDO_LITERAL;
			case RESTRINGIDO: return RESTRINGIDO_LITERAL;
			case LIBRE: return LIBRE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoAccesoArchivo(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TipoAccesoArchivo
