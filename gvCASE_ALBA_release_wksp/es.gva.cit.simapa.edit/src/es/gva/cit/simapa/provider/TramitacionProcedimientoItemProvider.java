/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.TramitacionProcedimiento;

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
 * This is the item provider adapter for a {@link es.gva.cit.simapa.TramitacionProcedimiento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TramitacionProcedimientoItemProvider
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
	public TramitacionProcedimientoItemProvider(AdapterFactory adapterFactory) {
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
			addInicioInstanciaDePartePropertyDescriptor(object);
			addInicioDeOficioPropertyDescriptor(object);
			addVolumenExpedientesEjercicioPropertyDescriptor(object);
			addPresupuestoAnualAproximadoPropertyDescriptor(object);
			addPlazoSolicitudPropertyDescriptor(object);
			addPlazoResolucionPropertyDescriptor(object);
			addSilencioAdministrativoPropertyDescriptor(object);
			addRecursoPropertyDescriptor(object);
			addEsWorkflowPropertyDescriptor(object);
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
				 getString("_UI_TramitacionProcedimiento_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_etiqueta_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__ETIQUETA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inicio Instancia De Parte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInicioInstanciaDePartePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_inicioInstanciaDeParte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_inicioInstanciaDeParte_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inicio De Oficio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInicioDeOficioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_inicioDeOficio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_inicioDeOficio_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volumen Expedientes Ejercicio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumenExpedientesEjercicioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_volumenExpedientesEjercicio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_volumenExpedientesEjercicio_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presupuesto Anual Aproximado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresupuestoAnualAproximadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_presupuestoAnualAproximado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_presupuestoAnualAproximado_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plazo Solicitud feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlazoSolicitudPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_plazoSolicitud_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_plazoSolicitud_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plazo Resolucion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlazoResolucionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_plazoResolucion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_plazoResolucion_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Silencio Administrativo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSilencioAdministrativoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_silencioAdministrativo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_silencioAdministrativo_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recurso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecursoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_recurso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_recurso_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__RECURSO,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Es Workflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsWorkflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TramitacionProcedimiento_esWorkflow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TramitacionProcedimiento_esWorkflow_feature", "_UI_TramitacionProcedimiento_type"),
				 SimapaPackage.Literals.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TramitacionProcedimiento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TramitacionProcedimiento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TramitacionProcedimiento)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_TramitacionProcedimiento_type") :
			getString("_UI_TramitacionProcedimiento_type") + " " + label;
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

		switch (notification.getFeatureID(TramitacionProcedimiento.class)) {
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ETIQUETA:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_INSTANCIA_DE_PARTE:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__INICIO_DE_OFICIO:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__VOLUMEN_EXPEDIENTES_EJERCICIO:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PRESUPUESTO_ANUAL_APROXIMADO:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_SOLICITUD:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__PLAZO_RESOLUCION:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__SILENCIO_ADMINISTRATIVO:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__RECURSO:
			case SimapaPackage.TRAMITACION_PROCEDIMIENTO__ES_WORKFLOW:
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
