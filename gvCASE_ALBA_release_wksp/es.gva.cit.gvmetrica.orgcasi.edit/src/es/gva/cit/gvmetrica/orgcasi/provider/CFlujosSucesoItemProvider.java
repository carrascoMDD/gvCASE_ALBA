/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

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






/**
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CFlujosSucesoItemProvider
	extends OrgcasiCollectionItemProvider
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
	public CFlujosSucesoItemProvider(AdapterFactory adapterFactory) {
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

			addFlujosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Flujos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlujosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CFlujosSuceso_flujos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CFlujosSuceso_flujos_feature", "_UI_CFlujosSuceso_type"),
				 OrgcasiPackage.Literals.CFLUJOS_SUCESO__FLUJOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CFlujosSuceso.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CFlujosSuceso"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_CFlujosSuceso_type");
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
		return OrgcasiEditPlugin.INSTANCE;
	}

}