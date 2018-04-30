/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import es.gva.cit.gvmetrica.orgcasi.CampoDatos;
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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.CampoDatos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CampoDatosItemProvider
	extends OrgcasiObjectItemProvider
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
	public CampoDatosItemProvider(AdapterFactory adapterFactory) {
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
			addDescripcionPropertyDescriptor(object);
			addTipoPropertyDescriptor(object);
			addFormatoPropertyDescriptor(object);
			addEjemploPropertyDescriptor(object);
			addRequeridoPropertyDescriptor(object);
			addValorPorDefectoPropertyDescriptor(object);
			addRangoPropertyDescriptor(object);
			addRangoRazonablePropertyDescriptor(object);
			addFuenteDatosPropertyDescriptor(object);
			addObservacionesPropertyDescriptor(object);
			addComentarioPropertyDescriptor(object);
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
				 getString("_UI_CampoDatos_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_etiqueta_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__ETIQUETA,
				 false,
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
				 getString("_UI_CampoDatos_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_nombre_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__NOMBRE,
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
				 getString("_UI_CampoDatos_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_descripcion_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__DESCRIPCION,
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
				 getString("_UI_CampoDatos_tipo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_tipo_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__TIPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formato feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_formato_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_formato_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__FORMATO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ejemplo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEjemploPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_ejemplo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_ejemplo_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__EJEMPLO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requerido feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequeridoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_requerido_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_requerido_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__REQUERIDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valor Por Defecto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValorPorDefectoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_valorPorDefecto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_valorPorDefecto_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__VALOR_POR_DEFECTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rango feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_rango_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_rango_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__RANGO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rango Razonable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangoRazonablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_rangoRazonable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_rangoRazonable_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__RANGO_RAZONABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fuente Datos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuenteDatosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_fuenteDatos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_fuenteDatos_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__FUENTE_DATOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observaciones feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservacionesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_observaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_observaciones_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__OBSERVACIONES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comentario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComentarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_comentario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_comentario_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__COMENTARIO,
				 true,
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
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CampoDatos_estructurasDatos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CampoDatos_estructurasDatos_feature", "_UI_CampoDatos_type"),
				 OrgcasiPackage.Literals.CAMPO_DATOS__ESTRUCTURAS_DATOS,
				 false,
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
			childrenFeatures.add(OrgcasiPackage.Literals.CAMPO_DATOS__ESTRUCTURAS_DATOS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns CampoDatos.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CampoDatos"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CampoDatos)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_CampoDatos_type") :
			getString("_UI_CampoDatos_type") + " " + label;
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

		switch (notification.getFeatureID(CampoDatos.class)) {
			case OrgcasiPackage.CAMPO_DATOS__ETIQUETA:
			case OrgcasiPackage.CAMPO_DATOS__NOMBRE:
			case OrgcasiPackage.CAMPO_DATOS__DESCRIPCION:
			case OrgcasiPackage.CAMPO_DATOS__TIPO:
			case OrgcasiPackage.CAMPO_DATOS__FORMATO:
			case OrgcasiPackage.CAMPO_DATOS__EJEMPLO:
			case OrgcasiPackage.CAMPO_DATOS__REQUERIDO:
			case OrgcasiPackage.CAMPO_DATOS__VALOR_POR_DEFECTO:
			case OrgcasiPackage.CAMPO_DATOS__RANGO:
			case OrgcasiPackage.CAMPO_DATOS__RANGO_RAZONABLE:
			case OrgcasiPackage.CAMPO_DATOS__FUENTE_DATOS:
			case OrgcasiPackage.CAMPO_DATOS__OBSERVACIONES:
			case OrgcasiPackage.CAMPO_DATOS__COMENTARIO:
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
