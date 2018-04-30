/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.EstructuraFuncional;
import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.SimapaPackage;

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
 * This is the item provider adapter for a {@link es.gva.cit.simapa.EstructuraFuncional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EstructuraFuncionalItemProvider
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
	public EstructuraFuncionalItemProvider(AdapterFactory adapterFactory) {
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
			addNombrePropertyDescriptor(object);
			addCodigoPropertyDescriptor(object);
			addDescripcionPropertyDescriptor(object);
			addUnidadesOrganicasPropertyDescriptor(object);
			addProcedimientosPropertyDescriptor(object);
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
				 getString("_UI_EstructuraFuncional_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_etiqueta_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__ETIQUETA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraFuncional_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_nombre_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_EstructuraFuncional_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_codigo_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__CODIGO,
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
				 getString("_UI_EstructuraFuncional_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_descripcion_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__DESCRIPCION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unidades Organicas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnidadesOrganicasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraFuncional_unidadesOrganicas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_unidadesOrganicas_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Procedimientos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcedimientosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraFuncional_procedimientos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraFuncional_procedimientos_feature", "_UI_EstructuraFuncional_type"),
				 SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS,
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
			childrenFeatures.add(SimapaPackage.Literals.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION);
			childrenFeatures.add(SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__UNIDADES_ORGANICAS);
			childrenFeatures.add(SimapaPackage.Literals.ESTRUCTURA_FUNCIONAL__PROCEDIMIENTOS);
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
	 * This returns EstructuraFuncional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EstructuraFuncional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EstructuraFuncional)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_EstructuraFuncional_type") :
			getString("_UI_EstructuraFuncional_type") + " " + label;
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

		switch (notification.getFeatureID(EstructuraFuncional.class)) {
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__ETIQUETA:
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__NOMBRE:
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__CODIGO:
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCRIPCION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimapaPackage.ESTRUCTURA_FUNCIONAL__DESCOMPOSICION:
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
				(SimapaPackage.Literals.CONTENEDOR_ESTRUCTURA_FUNCIONAL__DESCOMPOSICION,
				 SimapaFactory.eINSTANCE.createEstructuraFuncional()));
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
