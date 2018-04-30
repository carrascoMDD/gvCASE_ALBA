/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.simapa.provider;

import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.SimapaFactory;
import es.gva.cit.simapa.SimapaPackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;






/**
 * This is the item provider adapter for a {@link es.gva.cit.simapa.Repositorio} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositorioItemProvider
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
	public RepositorioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the preference to show in the tree the metamodel package child node.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public boolean fGetPrefShowMetamodelPackageChildNode() {
		Boolean aValue = null;
		Map aMap;
		
    	aMap = SimapaEditPlugin.getPlugin().getPreferencesMap();
    	if (aMap == null) { return false;}
    	try {
    		aValue = (Boolean) aMap.get( cShowMetamodelPackageChildNode);
    	} catch( ClassCastException anException) {}
    	if( aValue == null) { return false;}
    	
    	return aValue.booleanValue();
	}

	
	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * OJO ACV
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			if (fGetPrefShowMetamodelPackageChildNode()) {
				addModelPackagePropertyDescriptor(object);
			}
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
			createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repositorio_modelPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repositorio_modelPackage_feature", "_UI_Repositorio_type"),
				 SimapaPackage.Literals.REPOSITORIO__MODEL_PACKAGE,
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
	 * @generated NOT
	 * OJO ACV
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__PROCEDIMIENTOS);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__DOCUMENTOS);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__ESTRUCTURAS_FUNCIONALES);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__GLOSARIO);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__NORMATIVAS);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__UNIDADES_ORGANICAS);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__UNIDADES_EXTERNAS);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__CLASES_DOCUMENTO);
			childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__APLICACIONES);
			if (fGetPrefShowMetamodelPackageChildNode()) {
				childrenFeatures.add(SimapaPackage.Literals.REPOSITORIO__MODEL_PACKAGE);
			}
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
	 * This returns Repositorio.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repositorio"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_Repositorio_type");
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

		switch (notification.getFeatureID(Repositorio.class)) {
			case SimapaPackage.REPOSITORIO__PROCEDIMIENTOS:
			case SimapaPackage.REPOSITORIO__DOCUMENTOS:
			case SimapaPackage.REPOSITORIO__ESTRUCTURAS_FUNCIONALES:
			case SimapaPackage.REPOSITORIO__GLOSARIO:
			case SimapaPackage.REPOSITORIO__NORMATIVAS:
			case SimapaPackage.REPOSITORIO__UNIDADES_ORGANICAS:
			case SimapaPackage.REPOSITORIO__UNIDADES_EXTERNAS:
			case SimapaPackage.REPOSITORIO__CLASES_DOCUMENTO:
			case SimapaPackage.REPOSITORIO__APLICACIONES:
			case SimapaPackage.REPOSITORIO__MODEL_PACKAGE:
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
				(SimapaPackage.Literals.REPOSITORIO__PROCEDIMIENTOS,
				 SimapaFactory.eINSTANCE.createProcedimientos()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__DOCUMENTOS,
				 SimapaFactory.eINSTANCE.createDocumentos()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__ESTRUCTURAS_FUNCIONALES,
				 SimapaFactory.eINSTANCE.createEstructurasFuncionales()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__GLOSARIO,
				 SimapaFactory.eINSTANCE.createGlosario()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__NORMATIVAS,
				 SimapaFactory.eINSTANCE.createNormativasYLegislaciones()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__UNIDADES_ORGANICAS,
				 SimapaFactory.eINSTANCE.createUnidadesOrganicas()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__UNIDADES_EXTERNAS,
				 SimapaFactory.eINSTANCE.createUnidadesExternas()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__CLASES_DOCUMENTO,
				 SimapaFactory.eINSTANCE.createClasesDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(SimapaPackage.Literals.REPOSITORIO__APLICACIONES,
				 SimapaFactory.eINSTANCE.createAplicaciones()));
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
