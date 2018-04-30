/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import com.mddltd.eclipse.emf.edit.provider.OCLCandidatesItemPropertyDescriptor;

import es.gva.cit.simapa.Documento;
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
 * This is the item provider adapter for a {@link es.gva.cit.simapa.Documento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentoItemProvider
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
	public DocumentoItemProvider(AdapterFactory adapterFactory) {
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
			addTituloPropertyDescriptor(object);
			addCodigoPropertyDescriptor(object);
			addFicheroModeloFomularioPropertyDescriptor(object);
			addObservacionesPropertyDescriptor(object);
			addTipoAlmacenamientoPropertyDescriptor(object);
			addTipoMedioPropertyDescriptor(object);
			addTipoAmbitoPropertyDescriptor(object);
			addClaseDocumentoPropertyDescriptor(object);
			addProcedimientosPropertyDescriptor(object);
			addDocumentosFinalesPropertyDescriptor(object);
			addFlujosPropertyDescriptor(object);
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
				 getString("_UI_Documento_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_etiqueta_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__ETIQUETA,
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
				 getString("_UI_Documento_titulo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_titulo_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__TITULO,
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
				 getString("_UI_Documento_codigo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_codigo_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__CODIGO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fichero Modelo Fomulario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFicheroModeloFomularioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_ficheroModeloFomulario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_ficheroModeloFomulario_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__FICHERO_MODELO_FOMULARIO,
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
				 getString("_UI_Documento_observaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_observaciones_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__OBSERVACIONES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Almacenamiento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoAlmacenamientoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_tipoAlmacenamiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_tipoAlmacenamiento_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__TIPO_ALMACENAMIENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Medio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoMedioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_tipoMedio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_tipoMedio_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__TIPO_MEDIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Ambito feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoAmbitoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_tipoAmbito_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_tipoAmbito_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__TIPO_AMBITO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clase Documento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClaseDocumentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			// OJOJET ACV BEGIN
			new OCLCandidatesItemPropertyDescriptor			
			// OJOJET ACV END
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_claseDocumento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_claseDocumento_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__CLASE_DOCUMENTO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Procedimientos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcedimientosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_procedimientos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_procedimientos_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__PROCEDIMIENTOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentos Finales feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentosFinalesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_documentosFinales_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_documentosFinales_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__DOCUMENTOS_FINALES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_Documento_flujos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_flujos_feature", "_UI_Documento_type"),
				 SimapaPackage.Literals.DOCUMENTO__FLUJOS,
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
			childrenFeatures.add(SimapaPackage.Literals.DOCUMENTO__PROCEDIMIENTOS);
			childrenFeatures.add(SimapaPackage.Literals.DOCUMENTO__DOCUMENTOS_FINALES);
			childrenFeatures.add(SimapaPackage.Literals.DOCUMENTO__FLUJOS);
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
	 * This returns Documento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Documento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Documento)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_Documento_type") :
			getString("_UI_Documento_type") + " " + label;
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

		switch (notification.getFeatureID(Documento.class)) {
			case SimapaPackage.DOCUMENTO__ETIQUETA:
			case SimapaPackage.DOCUMENTO__TITULO:
			case SimapaPackage.DOCUMENTO__CODIGO:
			case SimapaPackage.DOCUMENTO__FICHERO_MODELO_FOMULARIO:
			case SimapaPackage.DOCUMENTO__OBSERVACIONES:
			case SimapaPackage.DOCUMENTO__TIPO_ALMACENAMIENTO:
			case SimapaPackage.DOCUMENTO__TIPO_MEDIO:
			case SimapaPackage.DOCUMENTO__TIPO_AMBITO:
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
		return SimapaEditPlugin.INSTANCE;
	}

}
