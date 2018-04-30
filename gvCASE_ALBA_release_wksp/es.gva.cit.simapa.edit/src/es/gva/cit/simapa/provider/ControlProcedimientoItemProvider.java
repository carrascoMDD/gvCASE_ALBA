/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.ControlProcedimiento;
import es.gva.cit.simapa.SimapaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.ControlProcedimiento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlProcedimientoItemProvider
	extends SimapaObjectItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlProcedimientoItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEtiquetaPropertyDescriptor(object);
			addUsuarioPropertyDescriptor(object);
			addSituacionPropertyDescriptor(object);
			addFechaHoraModificacionPropertyDescriptor(object);
			addFechaInicioVigenciaPropertyDescriptor(object);
			addFechaFinVigenciaPropertyDescriptor(object);
			addComentarioVersionPropertyDescriptor(object);
			addFechaElaboradoPropertyDescriptor(object);
			addNombrePersonaElaboradoPropertyDescriptor(object);
			addPuestoPersonaElaboradoPropertyDescriptor(object);
			addFechaRevisadoPropertyDescriptor(object);
			addNombrePersonaRevisadoPropertyDescriptor(object);
			addPuestoPersonaRevisadoPropertyDescriptor(object);
			addFechaAprobadoPropertyDescriptor(object);
			addNombrePersonaAprobadoPropertyDescriptor(object);
			addPuestoPersonaAprobadoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Etiqueta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtiquetaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_etiqueta_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__ETIQUETA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usuario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsuarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_usuario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_usuario_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__USUARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Situacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSituacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_situacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_situacion_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__SITUACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Hora Modificacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaHoraModificacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaHoraModificacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaHoraModificacion_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Inicio Vigencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaInicioVigenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaInicioVigencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaInicioVigencia_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Fin Vigencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaFinVigenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaFinVigencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaFinVigencia_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comentario Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComentarioVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_comentarioVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_comentarioVersion_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Elaborado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaElaboradoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaElaborado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaElaborado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre Persona Elaborado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePersonaElaboradoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_nombrePersonaElaborado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_nombrePersonaElaborado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Puesto Persona Elaborado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPuestoPersonaElaboradoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_puestoPersonaElaborado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_puestoPersonaElaborado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Revisado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaRevisadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaRevisado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaRevisado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_REVISADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre Persona Revisado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePersonaRevisadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_nombrePersonaRevisado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_nombrePersonaRevisado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Puesto Persona Revisado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPuestoPersonaRevisadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_puestoPersonaRevisado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_puestoPersonaRevisado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Aprobado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaAprobadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_fechaAprobado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_fechaAprobado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__FECHA_APROBADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre Persona Aprobado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePersonaAprobadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_nombrePersonaAprobado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_nombrePersonaAprobado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Puesto Persona Aprobado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPuestoPersonaAprobadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlProcedimiento_puestoPersonaAprobado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlProcedimiento_puestoPersonaAprobado_feature", "_UI_ControlProcedimiento_type"),
				 SimapaPackage.Literals.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ControlProcedimiento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlProcedimiento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ControlProcedimiento)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_ControlProcedimiento_type") :
			getString("_UI_ControlProcedimiento_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ControlProcedimiento.class)) {
			case SimapaPackage.CONTROL_PROCEDIMIENTO__ETIQUETA:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__USUARIO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__SITUACION:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_HORA_MODIFICACION:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_INICIO_VIGENCIA:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_FIN_VIGENCIA:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__COMENTARIO_VERSION:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_ELABORADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_ELABORADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_ELABORADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_REVISADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_REVISADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_REVISADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__FECHA_APROBADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__NOMBRE_PERSONA_APROBADO:
			case SimapaPackage.CONTROL_PROCEDIMIENTO__PUESTO_PERSONA_APROBADO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return SimapaEditPlugin.INSTANCE;
	}

}
