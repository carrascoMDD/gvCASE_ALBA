/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.proinso.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.gvmetrica.proinso.ActividadAbstracta;
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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.proinso.ActividadAbstracta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActividadAbstractaItemProvider
	extends ProinsoObjectItemProvider
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
	public ActividadAbstractaItemProvider(AdapterFactory adapterFactory) {
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

			addReferenciasPropertyDescriptor(object);
			addCodigoYNombrePropertyDescriptor(object);
			addCodigoCompletoPropertyDescriptor(object);
			addCodigoPropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
			addPredecesoresPropertyDescriptor(object);
			addSucesoresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referencias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenciasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referenciable_referencias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referenciable_referencias_feature", "_UI_Referenciable_type"),
				 ProinsoPackage.Literals.REFERENCIABLE__REFERENCIAS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codigo YNombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoYNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActividadAbstracta_codigoYNombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_codigoYNombre_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codigo Completo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodigoCompletoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActividadAbstracta_codigoCompleto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_codigoCompleto_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO,
				 false,
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
				 getString("_UI_ActividadAbstracta_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_codigo_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__CODIGO,
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
				 getString("_UI_ActividadAbstracta_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_nombre_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predecesores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredecesoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActividadAbstracta_predecesores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_predecesores_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__PREDECESORES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sucesores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSucesoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActividadAbstracta_sucesores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActividadAbstracta_sucesores_feature", "_UI_ActividadAbstracta_type"),
				 ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__SUCESORES,
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
			childrenFeatures.add(ProinsoPackage.Literals.CON_DOCUMENTACION__DOCUMENTACION);
			childrenFeatures.add(ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__TAREAS);
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
	 * This returns ActividadAbstracta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActividadAbstracta"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ActividadAbstracta)object).getCodigoYNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_ActividadAbstracta_type") :
			getString("_UI_ActividadAbstracta_type") + " " + label;
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

		switch (notification.getFeatureID(ActividadAbstracta.class)) {
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_YNOMBRE:
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO_COMPLETO:
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__CODIGO:
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__DOCUMENTACION:
			case ProinsoPackage.ACTIVIDAD_ABSTRACTA__TAREAS:
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
				(ProinsoPackage.Literals.CON_DOCUMENTACION__DOCUMENTACION,
				 ProinsoFactory.eINSTANCE.createDocumentacion()));

		newChildDescriptors.add
			(createChildParameter
				(ProinsoPackage.Literals.ACTIVIDAD_ABSTRACTA__TAREAS,
				 ProinsoFactory.eINSTANCE.createTarea()));
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
