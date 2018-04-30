/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvmetrica.orgcasi.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
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
 * This is the item provider adapter for a {@link es.gva.cit.gvmetrica.orgcasi.AProcedimiento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AProcedimientoItemProvider
	extends AnotacionItemProvider
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
	public AProcedimientoItemProvider(AdapterFactory adapterFactory) {
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
			addProcedimientoPropertyDescriptor(object);
			addTodosSucesosPropertyDescriptor(object);
			addTodosSubsistemasPropertyDescriptor(object);
			addTodasEstructurasDatosPropertyDescriptor(object);
			addTodosDocumentosPropertyDescriptor(object);
			addRepositorioPropertyDescriptor(object);
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
				 getString("_UI_AProcedimiento_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_etiqueta_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__ETIQUETA,
				 false,
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
			new OCLCandidatesItemPropertyDescriptor			
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AProcedimiento_procedimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_procedimiento_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__PROCEDIMIENTO,
				 true,
				 false,
				 true,
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
				 getString("_UI_AProcedimiento_todosSucesos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_todosSucesos_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__TODOS_SUCESOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Todos Subsistemas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTodosSubsistemasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AProcedimiento_todosSubsistemas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_todosSubsistemas_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__TODOS_SUBSISTEMAS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Todas Estructuras Datos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTodasEstructurasDatosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AProcedimiento_todasEstructurasDatos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_todasEstructurasDatos_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__TODAS_ESTRUCTURAS_DATOS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Todos Documentos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTodosDocumentosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AProcedimiento_todosDocumentos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_todosDocumentos_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__TODOS_DOCUMENTOS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repositorio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositorioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AProcedimiento_repositorio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AProcedimiento_repositorio_feature", "_UI_AProcedimiento_type"),
				 OrgcasiPackage.Literals.APROCEDIMIENTO__REPOSITORIO,
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
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS);
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_SUCESOS__SUCESOS);
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_DOCUMENTOS__DOCUMENTOS);
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS);
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_DATOS__CAMPOS);
			childrenFeatures.add(OrgcasiPackage.Literals.CONTENEDOR_DATOS__RELACIONES_DATOS);
			childrenFeatures.add(OrgcasiPackage.Literals.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__PROCEDIMIENTO);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__NORMATIVAS);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__TERMINOS_GLOSARIO);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES_ORGANICAS);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES_EXTERNAS);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__APLICACIONES);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__OPERACIONES);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__FLUJOS);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__ACTORES);
			childrenFeatures.add(OrgcasiPackage.Literals.APROCEDIMIENTO__SISTEMAS);
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
	 * This returns AProcedimiento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AProcedimiento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((AProcedimiento)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_AProcedimiento_type") :
			getString("_UI_AProcedimiento_type") + " " + label;
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

		switch (notification.getFeatureID(AProcedimiento.class)) {
			case OrgcasiPackage.APROCEDIMIENTO__ETIQUETA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrgcasiPackage.APROCEDIMIENTO__SUBSISTEMAS:
			case OrgcasiPackage.APROCEDIMIENTO__SUCESOS:
			case OrgcasiPackage.APROCEDIMIENTO__DOCUMENTOS:
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_DATOS:
			case OrgcasiPackage.APROCEDIMIENTO__CAMPOS:
			case OrgcasiPackage.APROCEDIMIENTO__RELACIONES_DATOS:
			case OrgcasiPackage.APROCEDIMIENTO__IMPORTACIONES_SERVICIOS:
			case OrgcasiPackage.APROCEDIMIENTO__NORMATIVAS:
			case OrgcasiPackage.APROCEDIMIENTO__TERMINOS_GLOSARIO:
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_ORGANICAS:
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES_EXTERNAS:
			case OrgcasiPackage.APROCEDIMIENTO__UNIDADES:
			case OrgcasiPackage.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES:
			case OrgcasiPackage.APROCEDIMIENTO__APLICACIONES:
			case OrgcasiPackage.APROCEDIMIENTO__OPERACIONES:
			case OrgcasiPackage.APROCEDIMIENTO__FLUJOS:
			case OrgcasiPackage.APROCEDIMIENTO__ACTORES:
			case OrgcasiPackage.APROCEDIMIENTO__SISTEMAS:
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
				(OrgcasiPackage.Literals.CONTENEDOR_SUBSISTEMAS__SUBSISTEMAS,
				 OrgcasiFactory.eINSTANCE.createCSubsistemas()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.CONTENEDOR_SUCESOS__SUCESOS,
				 OrgcasiFactory.eINSTANCE.createCSucesos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.CONTENEDOR_DOCUMENTOS__DOCUMENTOS,
				 OrgcasiFactory.eINSTANCE.createCDocumentos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.CONTENEDOR_DATOS__ESTRUCTURAS_DATOS,
				 OrgcasiFactory.eINSTANCE.createCEstructurasDatos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.CONTENEDOR_DATOS__CAMPOS,
				 OrgcasiFactory.eINSTANCE.createCCamposDatos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.CONTENEDOR_DATOS__RELACIONES_DATOS,
				 OrgcasiFactory.eINSTANCE.createCRelacionesDatos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.IMPORTADOR_SERVICIOS__IMPORTACIONES_SERVICIOS,
				 OrgcasiFactory.eINSTANCE.createCImportacionesServicios()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__NORMATIVAS,
				 OrgcasiFactory.eINSTANCE.createCNormativasYLegislaciones()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__TERMINOS_GLOSARIO,
				 OrgcasiFactory.eINSTANCE.createCTerminosGlosario()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES_ORGANICAS,
				 OrgcasiFactory.eINSTANCE.createCUnidadesOrganicas()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES_EXTERNAS,
				 OrgcasiFactory.eINSTANCE.createCUnidadesExternas()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__UNIDADES,
				 OrgcasiFactory.eINSTANCE.createCUnidades()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__ESTRUCTURAS_FUNCIONALES,
				 OrgcasiFactory.eINSTANCE.createCEstructurasFuncionales()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__APLICACIONES,
				 OrgcasiFactory.eINSTANCE.createCAplicaciones()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__OPERACIONES,
				 OrgcasiFactory.eINSTANCE.createCOperaciones()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__FLUJOS,
				 OrgcasiFactory.eINSTANCE.createCFlujos()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__ACTORES,
				 OrgcasiFactory.eINSTANCE.createCActores()));

		newChildDescriptors.add
			(createChildParameter
				(OrgcasiPackage.Literals.APROCEDIMIENTO__SISTEMAS,
				 OrgcasiFactory.eINSTANCE.createCSistemas()));
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
