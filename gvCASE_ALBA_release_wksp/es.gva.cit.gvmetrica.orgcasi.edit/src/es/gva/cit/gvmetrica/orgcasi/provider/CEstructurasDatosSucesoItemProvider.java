/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CEstructurasDatosSucesoItemProvider
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
	public CEstructurasDatosSucesoItemProvider(AdapterFactory adapterFactory) {
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
			addEstructurasDatosPropertyDescriptor(object);
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
				 getString("_UI_CEstructurasDatosSuceso_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEstructurasDatosSuceso_etiqueta_feature", "_UI_CEstructurasDatosSuceso_type"),
				 OrgcasiPackage.Literals.CESTRUCTURAS_DATOS_SUCESO__ETIQUETA,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estructuras Datos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstructurasDatosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			new OCLCandidatesItemPropertyDescriptor			
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEstructurasDatosSuceso_estructurasDatos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEstructurasDatosSuceso_estructurasDatos_feature", "_UI_CEstructurasDatosSuceso_type"),
				 OrgcasiPackage.Literals.CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS,
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
			childrenFeatures.add(OrgcasiPackage.Literals.CESTRUCTURAS_DATOS_SUCESO__ESTRUCTURAS_DATOS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns CEstructurasDatosSuceso.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CEstructurasDatosSuceso"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CEstructurasDatosSuceso)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_CEstructurasDatosSuceso_type") :
			getString("_UI_CEstructurasDatosSuceso_type") + " " + label;
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

		switch (notification.getFeatureID(CEstructurasDatosSuceso.class)) {
			case OrgcasiPackage.CESTRUCTURAS_DATOS_SUCESO__ETIQUETA:
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
		return OrgcasiEditPlugin.INSTANCE;
	}

}