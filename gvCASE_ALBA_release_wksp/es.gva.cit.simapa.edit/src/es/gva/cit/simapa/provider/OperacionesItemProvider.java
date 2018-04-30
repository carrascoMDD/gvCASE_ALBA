/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.SimapaFactory;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.Operaciones} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperacionesItemProvider
	extends SimapaCollectionItemProvider
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
	public OperacionesItemProvider(AdapterFactory adapterFactory) {
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

			addProcedimientoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Operaciones_procedimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operaciones_procedimiento_feature", "_UI_Operaciones_type"),
				 SimapaPackage.Literals.OPERACIONES__PROCEDIMIENTO,
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
			childrenFeatures.add(SimapaPackage.Literals.OPERACIONES__OPERACIONES);
		}
		return childrenFeatures;
	}

	/**
	 * This returns Operaciones.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operaciones"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Operaciones_type");
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

		switch (notification.getFeatureID(Operaciones.class)) {
			case SimapaPackage.OPERACIONES__OPERACIONES:
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
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createOperacion()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createDocumentoFinalInterno()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createEntradaDocumentoFinal()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createFinProceso()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createSalidaDocumentoFinal()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.OPERACIONES__OPERACIONES,
				 SimapaFactory.eINSTANCE.createSubprocedimiento()));
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
