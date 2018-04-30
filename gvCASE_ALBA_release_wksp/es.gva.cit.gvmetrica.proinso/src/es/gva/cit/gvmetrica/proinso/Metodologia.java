
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodologia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos <em>Procesos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProductos <em>Productos</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes <em>Perfiles Participantes</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas <em>Practicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas <em>Tecnicas</em>}</li>
 *   <li>{@link es.gva.cit.gvmetrica.proinso.Metodologia#getRepositorio <em>Repositorio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia()
 * @model
 * @generated
 */
public interface Metodologia extends ConDocumentacion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Procesos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Procesos#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procesos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procesos</em>' containment reference.
	 * @see #setProcesos(Procesos)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Procesos()
	 * @see es.gva.cit.gvmetrica.proinso.Procesos#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	Procesos getProcesos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProcesos <em>Procesos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procesos</em>' containment reference.
	 * @see #getProcesos()
	 * @generated
	 */
	void setProcesos(Procesos value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Interfaces#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(Interfaces)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Interfaces()
	 * @see es.gva.cit.gvmetrica.proinso.Interfaces#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	Interfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(Interfaces value);

	/**
	 * Returns the value of the '<em><b>Productos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Productos#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productos</em>' containment reference.
	 * @see #setProductos(Productos)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Productos()
	 * @see es.gva.cit.gvmetrica.proinso.Productos#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	Productos getProductos();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getProductos <em>Productos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productos</em>' containment reference.
	 * @see #getProductos()
	 * @generated
	 */
	void setProductos(Productos value);

	/**
	 * Returns the value of the '<em><b>Perfiles Participantes</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfiles Participantes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfiles Participantes</em>' containment reference.
	 * @see #setPerfilesParticipantes(PerfilesParticipantes)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_PerfilesParticipantes()
	 * @see es.gva.cit.gvmetrica.proinso.PerfilesParticipantes#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	PerfilesParticipantes getPerfilesParticipantes();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPerfilesParticipantes <em>Perfiles Participantes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perfiles Participantes</em>' containment reference.
	 * @see #getPerfilesParticipantes()
	 * @generated
	 */
	void setPerfilesParticipantes(PerfilesParticipantes value);

	/**
	 * Returns the value of the '<em><b>Practicas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Practicas#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practicas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practicas</em>' containment reference.
	 * @see #setPracticas(Practicas)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Practicas()
	 * @see es.gva.cit.gvmetrica.proinso.Practicas#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	Practicas getPracticas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getPracticas <em>Practicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practicas</em>' containment reference.
	 * @see #getPracticas()
	 * @generated
	 */
	void setPracticas(Practicas value);

	/**
	 * Returns the value of the '<em><b>Tecnicas</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Tecnicas#getMetodologia <em>Metodologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnicas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnicas</em>' containment reference.
	 * @see #setTecnicas(Tecnicas)
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Tecnicas()
	 * @see es.gva.cit.gvmetrica.proinso.Tecnicas#getMetodologia
	 * @model opposite="metodologia" containment="true"
	 * @generated
	 */
	Tecnicas getTecnicas();

	/**
	 * Sets the value of the '{@link es.gva.cit.gvmetrica.proinso.Metodologia#getTecnicas <em>Tecnicas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnicas</em>' containment reference.
	 * @see #getTecnicas()
	 * @generated
	 */
	void setTecnicas(Tecnicas value);

	/**
	 * Returns the value of the '<em><b>Repositorio</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link es.gva.cit.gvmetrica.proinso.Repositorio#getMetodologias <em>Metodologias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositorio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositorio</em>' container reference.
	 * @see es.gva.cit.gvmetrica.proinso.ProinsoPackage#getMetodologia_Repositorio()
	 * @see es.gva.cit.gvmetrica.proinso.Repositorio#getMetodologias
	 * @model opposite="metodologias" required="true" changeable="false"
	 * @generated
	 */
	Repositorio getRepositorio();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/OCL/examples/ocl invariant='nombre->notEmpty()'"
	 * @generated
	 */
	boolean nombre_validar(DiagnosticChain theDiagnostics, Map theContext);

} // Metodologia