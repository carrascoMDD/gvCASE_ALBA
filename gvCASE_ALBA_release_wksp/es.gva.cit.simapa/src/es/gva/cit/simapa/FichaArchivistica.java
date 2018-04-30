
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ficha Archivistica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorLegal <em>Tiene Valor Legal</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorAdministrativo <em>Tiene Valor Administrativo</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorInformativoHistorico <em>Tiene Valor Informativo Historico</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getTipoAcceso <em>Tipo Acceso</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getReglasEliminacion <em>Reglas Eliminacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getReglasConservacion <em>Reglas Conservacion</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link es.gva.cit.simapa.FichaArchivistica#getProcedimiento <em>Procedimiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica()
 * @model
 * @generated
 */
public interface FichaArchivistica extends SimapaObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_Etiqueta()
	 * @model transient="true" volatile="true"
	 *        annotation="http://www.eclipse.org/OCL/examples/ocl derive='if procedimiento->isEmpty() then \'?\' else procedimiento.etiqueta endif'"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Tiene Valor Legal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Valor Legal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Valor Legal</em>' attribute.
	 * @see #setTieneValorLegal(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_TieneValorLegal()
	 * @model default="false"
	 * @generated
	 */
	boolean isTieneValorLegal();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorLegal <em>Tiene Valor Legal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Valor Legal</em>' attribute.
	 * @see #isTieneValorLegal()
	 * @generated
	 */
	void setTieneValorLegal(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiene Valor Administrativo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Valor Administrativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Valor Administrativo</em>' attribute.
	 * @see #setTieneValorAdministrativo(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_TieneValorAdministrativo()
	 * @model default="false"
	 * @generated
	 */
	boolean isTieneValorAdministrativo();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorAdministrativo <em>Tiene Valor Administrativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Valor Administrativo</em>' attribute.
	 * @see #isTieneValorAdministrativo()
	 * @generated
	 */
	void setTieneValorAdministrativo(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiene Valor Informativo Historico</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Valor Informativo Historico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Valor Informativo Historico</em>' attribute.
	 * @see #setTieneValorInformativoHistorico(boolean)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_TieneValorInformativoHistorico()
	 * @model default="false"
	 * @generated
	 */
	boolean isTieneValorInformativoHistorico();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#isTieneValorInformativoHistorico <em>Tiene Valor Informativo Historico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Valor Informativo Historico</em>' attribute.
	 * @see #isTieneValorInformativoHistorico()
	 * @generated
	 */
	void setTieneValorInformativoHistorico(boolean value);

	/**
	 * Returns the value of the '<em><b>Tipo Acceso</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gva.cit.simapa.TipoAccesoArchivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Acceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Acceso</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAccesoArchivo
	 * @see #setTipoAcceso(TipoAccesoArchivo)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_TipoAcceso()
	 * @model
	 * @generated
	 */
	TipoAccesoArchivo getTipoAcceso();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#getTipoAcceso <em>Tipo Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Acceso</em>' attribute.
	 * @see es.gva.cit.simapa.TipoAccesoArchivo
	 * @see #getTipoAcceso()
	 * @generated
	 */
	void setTipoAcceso(TipoAccesoArchivo value);

	/**
	 * Returns the value of the '<em><b>Reglas Eliminacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reglas Eliminacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Eliminacion</em>' attribute.
	 * @see #setReglasEliminacion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_ReglasEliminacion()
	 * @model
	 * @generated
	 */
	String getReglasEliminacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#getReglasEliminacion <em>Reglas Eliminacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reglas Eliminacion</em>' attribute.
	 * @see #getReglasEliminacion()
	 * @generated
	 */
	void setReglasEliminacion(String value);

	/**
	 * Returns the value of the '<em><b>Reglas Conservacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reglas Conservacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Conservacion</em>' attribute.
	 * @see #setReglasConservacion(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_ReglasConservacion()
	 * @model
	 * @generated
	 */
	String getReglasConservacion();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#getReglasConservacion <em>Reglas Conservacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reglas Conservacion</em>' attribute.
	 * @see #getReglasConservacion()
	 * @generated
	 */
	void setReglasConservacion(String value);

	/**
	 * Returns the value of the '<em><b>Observaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observaciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observaciones</em>' attribute.
	 * @see #setObservaciones(String)
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_Observaciones()
	 * @model
	 * @generated
	 */
	String getObservaciones();

	/**
	 * Sets the value of the '{@link es.gva.cit.simapa.FichaArchivistica#getObservaciones <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observaciones</em>' attribute.
	 * @see #getObservaciones()
	 * @generated
	 */
	void setObservaciones(String value);

	/**
	 * Returns the value of the '<em><b>Procedimiento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.simapa.Procedimiento#getFichaArchivistica <em>Ficha Archivistica</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedimiento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedimiento</em>' container reference.
	 * @see es.gva.cit.simapa.SimapaPackage#getFichaArchivistica_Procedimiento()
	 * @see es.gva.cit.simapa.Procedimiento#getFichaArchivistica
	 * @model opposite="fichaArchivistica" required="true" changeable="false"
	 * @generated
	 */
	Procedimiento getProcedimiento();

} // FichaArchivistica