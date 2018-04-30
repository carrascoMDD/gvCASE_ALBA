/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.SimapaPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.Procedimiento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcedimientoItemProvider
	extends SimapaObjectItemProvider
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
	public ProcedimientoItemProvider(AdapterFactory adapterFactory) {
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
			addCodigoPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addCodigoCompletoPropertyDescriptor(object);
			addPropPropertyDescriptor(object);
			addTituloPropertyDescriptor(object);
			addObjetoPropertyDescriptor(object);
			addObservacionesPropertyDescriptor(object);
			addPersonaPropertyDescriptor(object);
			addTipoProcedimientoPropertyDescriptor(object);
			addNotasPropertyDescriptor(object);
			addPeriodicidadPropertyDescriptor(object);
			addTituloUltimaConvocatoriaPropertyDescriptor(object);
			addDocumentosPropertyDescriptor(object);
			addTerminosPropertyDescriptor(object);
			addUnidadesPropertyDescriptor(object);
			addUsosComoSubProcedimientosPropertyDescriptor(object);
			addResponsablePropertyDescriptor(object);
			addNormativasPropertyDescriptor(object);
			addServicioPropertyDescriptor(object);
			addAplicacionesPropertyDescriptor(object);
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
				 getString("_UI_Procedimiento_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_etiqueta_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__ETIQUETA,
				 true,
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
				 getString("_UI_Procedimiento_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_codigo_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__CODIGO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_version_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__VERSION,
				 true,
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
				 getString("_UI_Procedimiento_codigoCompleto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_codigoCompleto_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__CODIGO_COMPLETO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_prop_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__PROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Titulo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTituloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_titulo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_titulo_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__TITULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objeto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjetoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_objeto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_objeto_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__OBJETO,
				 true,
				 true,
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
				 getString("_UI_Procedimiento_observaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_observaciones_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__OBSERVACIONES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persona feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersonaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_persona_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_persona_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__PERSONA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Procedimiento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoProcedimientoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_tipoProcedimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_tipoProcedimiento_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__TIPO_PROCEDIMIENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_notas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_notas_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__NOTAS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Periodicidad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodicidadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_periodicidad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_periodicidad_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__PERIODICIDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Titulo Ultima Convocatoria feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTituloUltimaConvocatoriaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_tituloUltimaConvocatoria_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_tituloUltimaConvocatoria_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_documentos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_documentos_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__DOCUMENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_terminos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_terminos_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__TERMINOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unidades feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnidadesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_unidades_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_unidades_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__UNIDADES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usos Como Sub Procedimientos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsosComoSubProcedimientosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_usosComoSubProcedimientos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_usosComoSubProcedimientos_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_responsable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_responsable_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__RESPONSABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Normativas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormativasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_normativas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_normativas_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__NORMATIVAS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Servicio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_servicio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_servicio_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__SERVICIO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aplicaciones feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAplicacionesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Procedimiento_aplicaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Procedimiento_aplicaciones_feature", "_UI_Procedimiento_type"),
				 SimapaPackage.Literals.PROCEDIMIENTO__APLICACIONES,
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
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__OPERACIONES);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__DOCUMENTOS);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__TERMINOS);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__FICHA_ARCHIVISTICA);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__UNIDADES);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__USOS_COMO_SUB_PROCEDIMIENTOS);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__CONVOCATORIAS);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__RESPONSABLE);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__NORMATIVAS);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__SERVICIO);
			childrenFeatures.add(SimapaPackage.Literals.PROCEDIMIENTO__APLICACIONES);
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
	 * This returns Procedimiento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Procedimiento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Procedimiento)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_Procedimiento_type") :
			getString("_UI_Procedimiento_type") + " " + label;
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

		switch (notification.getFeatureID(Procedimiento.class)) {
			case SimapaPackage.PROCEDIMIENTO__ETIQUETA:
			case SimapaPackage.PROCEDIMIENTO__CODIGO:
			case SimapaPackage.PROCEDIMIENTO__VERSION:
			case SimapaPackage.PROCEDIMIENTO__CODIGO_COMPLETO:
			case SimapaPackage.PROCEDIMIENTO__PROP:
			case SimapaPackage.PROCEDIMIENTO__TITULO:
			case SimapaPackage.PROCEDIMIENTO__OBJETO:
			case SimapaPackage.PROCEDIMIENTO__OBSERVACIONES:
			case SimapaPackage.PROCEDIMIENTO__PERSONA:
			case SimapaPackage.PROCEDIMIENTO__TIPO_PROCEDIMIENTO:
			case SimapaPackage.PROCEDIMIENTO__NOTAS:
			case SimapaPackage.PROCEDIMIENTO__PERIODICIDAD:
			case SimapaPackage.PROCEDIMIENTO__TITULO_ULTIMA_CONVOCATORIA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimapaPackage.PROCEDIMIENTO__OPERACIONES:
			case SimapaPackage.PROCEDIMIENTO__FICHA_ARCHIVISTICA:
			case SimapaPackage.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO:
			case SimapaPackage.PROCEDIMIENTO__CONVOCATORIAS:
			case SimapaPackage.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO:
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
				(SimapaPackage.Literals.PROCEDIMIENTO__OPERACIONES,
				 SimapaFactory.eINSTANCE.createOperaciones()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.PROCEDIMIENTO__FICHA_ARCHIVISTICA,
				 SimapaFactory.eINSTANCE.createFichaArchivistica()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.PROCEDIMIENTO__TRAMITACION_PROCEDIMIENTO,
				 SimapaFactory.eINSTANCE.createTramitacionProcedimiento()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.PROCEDIMIENTO__CONVOCATORIAS,
				 SimapaFactory.eINSTANCE.createConvocatoria()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.PROCEDIMIENTO__CONTROL_PROCEDIMIENTO,
				 SimapaFactory.eINSTANCE.createControlProcedimiento()));
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
