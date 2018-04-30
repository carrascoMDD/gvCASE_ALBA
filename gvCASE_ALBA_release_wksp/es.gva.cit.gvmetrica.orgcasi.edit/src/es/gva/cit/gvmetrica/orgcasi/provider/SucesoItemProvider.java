/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.Suceso;

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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.Suceso} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SucesoItemProvider
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
	public SucesoItemProvider(AdapterFactory adapterFactory) {
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

			addPrioridadPropertyDescriptor(object);
			addTipoPropertyDescriptor(object);
			addRendimientoPropertyDescriptor(object);
			addDisparoPropertyDescriptor(object);
			addDistribucionPropertyDescriptor(object);
			addPreCondicionPropertyDescriptor(object);
			addPostCondicionPropertyDescriptor(object);
			addEsColaborativoPropertyDescriptor(object);
			addProcedimientoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prioridad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrioridadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_prioridad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_prioridad_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__PRIORIDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_tipo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_tipo_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__TIPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rendimiento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRendimientoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_rendimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_rendimiento_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__RENDIMIENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disparo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisparoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_disparo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_disparo_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__DISPARO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribucion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribucionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_distribucion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_distribucion_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__DISTRIBUCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Condicion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreCondicionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_preCondicion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_preCondicion_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__PRE_CONDICION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post Condicion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostCondicionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_postCondicion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_postCondicion_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__POST_CONDICION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Es Colaborativo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsColaborativoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Suceso_esColaborativo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_esColaborativo_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__ES_COLABORATIVO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Suceso_procedimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Suceso_procedimiento_feature", "_UI_Suceso_type"),
				 OrgcasiPackage.Literals.SUCESO__PROCEDIMIENTO,
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
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__ACCIONES);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__ACTORES);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__ESTRUCTURAS_DATOS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__FLUJOS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__ENTRADAS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__SALIDAS);
			childrenFeatures.add(OrgcasiPackage.Literals.SUCESO__USADO_POR_SUCESOS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Suceso)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_Suceso_type") :
			getString("_UI_Suceso_type") + " " + label;
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

		switch (notification.getFeatureID(Suceso.class)) {
			case OrgcasiPackage.SUCESO__PRIORIDAD:
			case OrgcasiPackage.SUCESO__TIPO:
			case OrgcasiPackage.SUCESO__RENDIMIENTO:
			case OrgcasiPackage.SUCESO__DISPARO:
			case OrgcasiPackage.SUCESO__DISTRIBUCION:
			case OrgcasiPackage.SUCESO__PRE_CONDICION:
			case OrgcasiPackage.SUCESO__POST_CONDICION:
			case OrgcasiPackage.SUCESO__ES_COLABORATIVO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrgcasiPackage.SUCESO__ACCIONES:
			case OrgcasiPackage.SUCESO__ACTORES:
			case OrgcasiPackage.SUCESO__ESTRUCTURAS_DATOS:
			case OrgcasiPackage.SUCESO__FLUJOS:
			case OrgcasiPackage.SUCESO__ENTRADAS:
			case OrgcasiPackage.SUCESO__SALIDAS:
			case OrgcasiPackage.SUCESO__USADO_POR_SUCESOS:
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
				(OrgcasiPackage.Literals.SUCESO__ACCIONES,
				 OrgcasiFactory.eINSTANCE.createCAccionesSuceso()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUCESO__ACTORES,
				 OrgcasiFactory.eINSTANCE.createCActoresSuceso()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUCESO__ESTRUCTURAS_DATOS,
				 OrgcasiFactory.eINSTANCE.createCEstructurasDatosSuceso()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUCESO__FLUJOS,
				 OrgcasiFactory.eINSTANCE.createCFlujosSuceso()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUCESO__ENTRADAS,
				 OrgcasiFactory.eINSTANCE.createCEntradasSuceso()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.SUCESO__SALIDAS,
				 OrgcasiFactory.eINSTANCE.createCSalidasSuceso()));
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
