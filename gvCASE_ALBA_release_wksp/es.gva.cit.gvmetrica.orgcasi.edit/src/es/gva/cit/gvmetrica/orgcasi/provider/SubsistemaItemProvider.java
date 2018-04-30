/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;

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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.Subsistema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsistemaItemProvider
	extends AgrupacionItemProvider
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
	public SubsistemaItemProvider(AdapterFactory adapterFactory) {
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

			addTipoSubsistemaPropertyDescriptor(object);
			addProcedimientoPropertyDescriptor(object);
			addTodosSucesosPropertyDescriptor(object);
			addUsadoPorSubsistemasPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tipo Subsistema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoSubsistemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsistema_tipoSubsistema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsistema_tipoSubsistema_feature", "_UI_Subsistema_type"),
				 OrgcasiPackage.Literals.SUBSISTEMA__TIPO_SUBSISTEMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Procedimiento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcedimientoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsistema_procedimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsistema_procedimiento_feature", "_UI_Subsistema_type"),
				 OrgcasiPackage.Literals.SUBSISTEMA__PROCEDIMIENTO,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Todos Sucesos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTodosSucesosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsistema_todosSucesos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsistema_todosSucesos_feature", "_UI_Subsistema_type"),
				 OrgcasiPackage.Literals.SUBSISTEMA__TODOS_SUCESOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usado Por Subsistemas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsadoPorSubsistemasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsistema_usadoPorSubsistemas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsistema_usadoPorSubsistemas_feature", "_UI_Subsistema_type"),
				 OrgcasiPackage.Literals.SUBSISTEMA__USADO_POR_SUBSISTEMAS,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_SUCESOS__SUCESOS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUBSISTEMA__USOS_SUBSISTEMAS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUBSISTEMA__USADO_POR_SUBSISTEMAS);
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
	 * This returns Subsistema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subsistema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Subsistema)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_Subsistema_type") :
			getString("_UI_Subsistema_type") + " " + label;
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

		switch (notification.getFeatureID(Subsistema.class)) {
			case OrgcasiPackage.SUBSISTEMA__TIPO_SUBSISTEMA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrgcasiPackage.SUBSISTEMA__SUCESOS:
			case OrgcasiPackage.SUBSISTEMA__USOS_SUBSISTEMAS:
			case OrgcasiPackage.SUBSISTEMA__USADO_POR_SUBSISTEMAS:
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
				(OrgcasiPackage.Literals.CONTENEDOR_SUCESOS__SUCESOS,
				 OrgcasiFactory.eINSTANCE.createCSucesos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUBSISTEMA__USOS_SUBSISTEMAS,
				 OrgcasiFactory.eINSTANCE.createCUsosSubsistemas()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUBSISTEMA__USADO_POR_SUBSISTEMAS,
				 OrgcasiFactory.eINSTANCE.createCUsadoPorSubsistemas()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return OrgcasiEditPlugin.INSTANCE;
	}

}
