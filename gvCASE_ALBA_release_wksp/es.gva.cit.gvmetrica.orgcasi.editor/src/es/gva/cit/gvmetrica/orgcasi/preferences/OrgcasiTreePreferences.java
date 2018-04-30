package es.gva.cit.gvmetrica.orgcasi.preferences;

import java.util.Map;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.framework.Bundle;

import es.gva.cit.gvmetrica.orgcasi.presentation.OrgcasiEditorPlugin;
import es.gva.cit.gvmetrica.orgcasi.provider.OrgcasiEditPlugin;

 	/*
 	 * @generated NOT
	 * OJO ACV
     */

public class OrgcasiTreePreferences extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {


    public OrgcasiTreePreferences()
    {
        super(1);
        vShowMetamodelPackageChildNode = null;
        vShowMetamodelClassChildNode = null;
        vAutoLoadDefaultSimapaResource = null;
        vDefaultSimapaResource = null;
        
        setPreferenceStore(OrgcasiEditorPlugin.getPlugin().getPreferenceStore());
        setDescription("Orgcasi Tree Preferences Page");
        initializeDefaults();
    }

    private void initializeDefaults()
    {
        IPreferenceStore aStore = getPreferenceStore();
        aStore.setDefault(cShowMetamodelPackageChildNode, false);
        aStore.setDefault(cShowMetamodelClassChildNode, false);
        aStore.setDefault(cAutoLoadDefaultSimapaResource, true);
        aStore.setDefault(cDefaultSimapaResource, "SerPre_RA_v01.simapa");
   }

    public void createFieldEditors()
    {
    	vShowMetamodelPackageChildNode = new BooleanFieldEditor(cShowMetamodelPackageChildNode, "Show metamodel Package child nodes", getFieldEditorParent());
        addField(vShowMetamodelPackageChildNode);
        vShowMetamodelClassChildNode = new BooleanFieldEditor(cShowMetamodelClassChildNode, "Show metamodel Class child nodes", getFieldEditorParent());
        addField(vShowMetamodelClassChildNode);
        vAutoLoadDefaultSimapaResource = new BooleanFieldEditor(cAutoLoadDefaultSimapaResource, "Load default Simapa resource", getFieldEditorParent());
        addField(vAutoLoadDefaultSimapaResource);
        vDefaultSimapaResource = new StringFieldEditor(cDefaultSimapaResource, "Path to default Simapa Resource", getFieldEditorParent());
        addField(vDefaultSimapaResource);
    }

    public boolean performOk()
    {
        IPreferenceStore aStore = getPreferenceStore();
        aStore.setValue(cShowMetamodelPackageChildNode, vShowMetamodelPackageChildNode.getBooleanValue());
        aStore.setValue(cShowMetamodelClassChildNode, vShowMetamodelClassChildNode.getBooleanValue());
        aStore.setValue(cAutoLoadDefaultSimapaResource, vAutoLoadDefaultSimapaResource.getBooleanValue());
        aStore.setValue(cDefaultSimapaResource, vDefaultSimapaResource.getStringValue());
        updateEditPlugin( aStore);
        return true;
    }

    public void init(IWorkbench iworkbench)
    {
    }

    
    private void updateEditPlugin( IPreferenceStore theStore) {
    	Map aEditPluginMap = OrgcasiEditPlugin.getPlugin().getPreferencesMap();
    	if ( aEditPluginMap == null) { return;}
    	
    	aEditPluginMap.put( cShowMetamodelPackageChildNode, theStore.getBoolean(cShowMetamodelPackageChildNode));
       	aEditPluginMap.put( cShowMetamodelClassChildNode, theStore.getBoolean(cShowMetamodelClassChildNode));
      	aEditPluginMap.put( cAutoLoadDefaultSimapaResource, theStore.getBoolean(cAutoLoadDefaultSimapaResource));
      	aEditPluginMap.put( cDefaultSimapaResource, theStore.getString(cDefaultSimapaResource));
  }
    
    
    public static final String P_PATH = "pathPreference";
    public static final String P_BOOLEAN = "booleanPreference";
    public static final String P_CHOICE = "choicePreference";
    public static final String P_STRING = "stringPreference";
    public static final String cShowMetamodelPackageChildNode = "showmetamodelpackagechildnode";
    public static final String cShowMetamodelClassChildNode = "showmetamodelclasschildnode";
    public static final String cAutoLoadDefaultSimapaResource = "autoloadshowmetamodelclasschildnode";
    public static final String cDefaultSimapaResource = "defaultsimaparesource";
    private BooleanFieldEditor vShowMetamodelPackageChildNode;
    private BooleanFieldEditor vShowMetamodelClassChildNode;
    private BooleanFieldEditor vAutoLoadDefaultSimapaResource;
    private StringFieldEditor  vDefaultSimapaResource;

}
