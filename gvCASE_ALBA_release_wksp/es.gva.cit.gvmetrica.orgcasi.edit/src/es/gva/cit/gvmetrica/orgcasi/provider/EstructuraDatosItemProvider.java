/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;

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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.EstructuraDatos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EstructuraDatosItemProvider
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
	public EstructuraDatosItemProvider(AdapterFactory adapterFactory) {
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
			addComentarioPropertyDescriptor(object);
			addCamposPropertyDescriptor(object);
			addDocumentosPropertyDescriptor(object);
			addMiembroRelacionesPropertyDescriptor(object);
			addEntradasOSalidasPropertyDescriptor(object);
			addEstructuraDatosDeSucesoPropertyDescriptor(object);
			addColeccionEstructuraDatosDeSucesoPropertyDescriptor(object);
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
				 getString("_UI_EstructuraDatos_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_etiqueta_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__ETIQUETA,
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
				 getString("_UI_EstructuraDatos_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_nombre_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__NOMBRE,
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
				 getString("_UI_EstructuraDatos_comentario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_comentario_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__COMENTARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Campos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCamposPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			new OCLCandidatesItemPropertyDescriptor			
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_campos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_campos_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__CAMPOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			new OCLCandidatesItemPropertyDescriptor			
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_documentos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_documentos_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__DOCUMENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Miembro Relaciones feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiembroRelacionesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_miembroRelaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_miembroRelaciones_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entradas OSalidas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntradasOSalidasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_entradasOSalidas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_entradasOSalidas_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estructura Datos De Suceso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstructuraDatosDeSucesoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_estructuraDatosDeSuceso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_estructuraDatosDeSuceso_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coleccion Estructura Datos De Suceso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColeccionEstructuraDatosDeSucesoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EstructuraDatos_coleccionEstructuraDatosDeSuceso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EstructuraDatos_coleccionEstructuraDatosDeSuceso_feature", "_UI_EstructuraDatos_type"),
				 OrgcasiPackage.Literals.ESTRUCTURA_DATOS__COLECCION_ESTRUCTURA_DATOS_DE_SUCESO,
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
			childrenFeatures.add(OrgcasiPackage.Literals.ESTRUCTURA_DATOS__CAMPOS);
			childrenFeatures.add(OrgcasiPackage.Literals.ESTRUCTURA_DATOS__DOCUMENTOS);
			childrenFeatures.add(OrgcasiPackage.Literals.ESTRUCTURA_DATOS__MIEMBRO_RELACIONES);
			childrenFeatures.add(OrgcasiPackage.Literals.ESTRUCTURA_DATOS__ENTRADAS_OSALIDAS);
			childrenFeatures.add(OrgcasiPackage.Literals.ESTRUCTURA_DATOS__ESTRUCTURA_DATOS_DE_SUCESO);
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
	 * This returns EstructuraDatos.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EstructuraDatos"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EstructuraDatos)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_EstructuraDatos_type") :
			getString("_UI_EstructuraDatos_type") + " " + label;
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

		switch (notification.getFeatureID(EstructuraDatos.class)) {
			case OrgcasiPackage.ESTRUCTURA_DATOS__ETIQUETA:
			case OrgcasiPackage.ESTRUCTURA_DATOS__NOMBRE:
			case OrgcasiPackage.ESTRUCTURA_DATOS__COMENTARIO:
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
