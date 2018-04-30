/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;


		



import es.gva.cit.simapa.FichaArchivistica;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.FichaArchivistica} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FichaArchivisticaItemProvider
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
	public FichaArchivisticaItemProvider(AdapterFactory adapterFactory) {
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
			addTieneValorLegalPropertyDescriptor(object);
			addTieneValorAdministrativoPropertyDescriptor(object);
			addTieneValorInformativoHistoricoPropertyDescriptor(object);
			addTipoAccesoPropertyDescriptor(object);
			addReglasEliminacionPropertyDescriptor(object);
			addReglasConservacionPropertyDescriptor(object);
			addObservacionesPropertyDescriptor(object);
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
				 getString("_UI_FichaArchivistica_etiqueta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_etiqueta_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__ETIQUETA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tiene Valor Legal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTieneValorLegalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_tieneValorLegal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_tieneValorLegal_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tiene Valor Administrativo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTieneValorAdministrativoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_tieneValorAdministrativo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_tieneValorAdministrativo_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tiene Valor Informativo Historico feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTieneValorInformativoHistoricoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_tieneValorInformativoHistorico_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_tieneValorInformativoHistorico_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Acceso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoAccesoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_tipoAcceso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_tipoAcceso_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__TIPO_ACCESO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reglas Eliminacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReglasEliminacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_reglasEliminacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_reglasEliminacion_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reglas Conservacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReglasConservacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FichaArchivistica_reglasConservacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_reglasConservacion_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION,
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
				 getString("_UI_FichaArchivistica_observaciones_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FichaArchivistica_observaciones_feature", "_UI_FichaArchivistica_type"),
				 SimapaPackage.Literals.FICHA_ARCHIVISTICA__OBSERVACIONES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FichaArchivistica.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FichaArchivistica"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((FichaArchivistica)object).getEtiqueta();
		return label == null || label.length() == 0 ?
			getString("_UI_FichaArchivistica_type") :
			getString("_UI_FichaArchivistica_type") + " " + label;
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

		switch (notification.getFeatureID(FichaArchivistica.class)) {
			case SimapaPackage.FICHA_ARCHIVISTICA__ETIQUETA:
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_LEGAL:
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_ADMINISTRATIVO:
			case SimapaPackage.FICHA_ARCHIVISTICA__TIENE_VALOR_INFORMATIVO_HISTORICO:
			case SimapaPackage.FICHA_ARCHIVISTICA__TIPO_ACCESO:
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_ELIMINACION:
			case SimapaPackage.FICHA_ARCHIVISTICA__REGLAS_CONSERVACION:
			case SimapaPackage.FICHA_ARCHIVISTICA__OBSERVACIONES:
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
