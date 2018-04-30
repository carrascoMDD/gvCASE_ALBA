/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.provider;


		



import es.gva.cit.gvmetrica.proinso.Metodologia;
import es.gva.cit.gvmetrica.proinso.ProinsoFactory;
import es.gva.cit.gvmetrica.proinso.ProinsoPackage;

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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.proinso.Metodologia} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetodologiaItemProvider
	extends ConDocumentacionItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetodologiaItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Metodologia_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metodologia_nombre_feature", "_UI_Metodologia_type"),
				 ProinsoPackage.Literals.METODOLOGIA__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__PROCESOS);
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__INTERFACES);
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__PRODUCTOS);
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__PERFILES_PARTICIPANTES);
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__PRACTICAS);
			childrenFeatures.add(ProinsoPackage.Literals.METODOLOGIA__TECNICAS);
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
	 * This returns Metodologia.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Metodologia"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Metodologia)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Metodologia_type") :
			getString("_UI_Metodologia_type") + " " + label;
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

		switch (notification.getFeatureID(Metodologia.class)) {
			case ProinsoPackage.METODOLOGIA__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProinsoPackage.METODOLOGIA__PROCESOS:
			case ProinsoPackage.METODOLOGIA__INTERFACES:
			case ProinsoPackage.METODOLOGIA__PRODUCTOS:
			case ProinsoPackage.METODOLOGIA__PERFILES_PARTICIPANTES:
			case ProinsoPackage.METODOLOGIA__PRACTICAS:
			case ProinsoPackage.METODOLOGIA__TECNICAS:
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
				(ProinsoPackage.Literals.METODOLOGIA__PROCESOS,
				 ProinsoFactory.eINSTANCE.createProcesos()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.METODOLOGIA__INTERFACES,
				 ProinsoFactory.eINSTANCE.createInterfaces()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.METODOLOGIA__PRODUCTOS,
				 ProinsoFactory.eINSTANCE.createProductos()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.METODOLOGIA__PERFILES_PARTICIPANTES,
				 ProinsoFactory.eINSTANCE.createPerfilesParticipantes()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.METODOLOGIA__PRACTICAS,
				 ProinsoFactory.eINSTANCE.createPracticas()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.METODOLOGIA__TECNICAS,
				 ProinsoFactory.eINSTANCE.createTecnicas()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ProinsoEditPlugin.INSTANCE;
	}

}
