/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.SimapaPackage;
import es.gva.cit.simapa.UnidadOrganica;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.UnidadOrganica} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnidadOrganicaItemProvider
	extends UnidadItemProvider
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
	public UnidadOrganicaItemProvider(AdapterFactory adapterFactory) {
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

			addCodigoPropertyDescriptor(object);
			addDescripcionPropertyDescriptor(object);
			addTipoUnidadPropertyDescriptor(object);
			addCodigoOrganicoPropertyDescriptor(object);
			addUnidadDeProcedimientosPropertyDescriptor(object);
			addEstructurasFuncionalesPropertyDescriptor(object);
			addResponsableDeProcedimientosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Codigo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_codigo_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__CODIGO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Descripcion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescripcionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_descripcion_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Unidad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoUnidadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_tipoUnidad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_tipoUnidad_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__TIPO_UNIDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codigo Organico feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoOrganicoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_codigoOrganico_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_codigoOrganico_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__CODIGO_ORGANICO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unidad De Procedimientos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnidadDeProcedimientosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_unidadDeProcedimientos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_unidadDeProcedimientos_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estructuras Funcionales feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstructurasFuncionalesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_estructurasFuncionales_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_estructurasFuncionales_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsable De Procedimientos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsableDeProcedimientosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganica_responsableDeProcedimientos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganica_responsableDeProcedimientos_feature", "_UI_UnidadOrganica_type"),
				 SimapaPackage.Literals.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimapaPackage.Literals.CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION);
			childrenFeatures.add(SimapaPackage.Literals.UNIDAD_ORGANICA__UNIDAD_DE_PROCEDIMIENTOS);
			childrenFeatures.add(SimapaPackage.Literals.UNIDAD_ORGANICA__ESTRUCTURAS_FUNCIONALES);
			childrenFeatures.add(SimapaPackage.Literals.UNIDAD_ORGANICA__RESPONSABLE_DE_PROCEDIMIENTOS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UnidadOrganica.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnidadOrganica"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((UnidadOrganica)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_UnidadOrganica_type") :
			getString("_UI_UnidadOrganica_type") + " " + label;
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

		switch (notification.getFeatureID(UnidadOrganica.class)) {
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO:
			case SimapaPackage.UNIDAD_ORGANICA__DESCRIPCION:
			case SimapaPackage.UNIDAD_ORGANICA__TIPO_UNIDAD:
			case SimapaPackage.UNIDAD_ORGANICA__CODIGO_ORGANICO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimapaPackage.UNIDAD_ORGANICA__DESCOMPOSICION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.CONTENEDOR_UNIDAD_ORGANICA__DESCOMPOSICION,
				 SimapaFactory.eINSTANCE.createUnidadOrganica()));
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
