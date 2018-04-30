package es.gva.cit.gvmetrica.proinso.preferences;

import java.util.Map;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.framework.Bundle;

import es.gva.cit.gvmetrica.proinso.presentation.ProinsoEditorPlugin;
import es.gva.cit.gvmetrica.proinso.provider.ProinsoEditPlugin;

 	/*
 	 * @generated NOT
	 * OJO ACV
     */

public class ProinsoTreePreferences extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {


    public ProinsoTreePreferences()
    {
        super(1);
        vShowMetamodelPackageChildNode = null;
        vShowMetamodelClassChildNode = null;
        
        setPreferenceStore(ProinsoEditorPlugin.getPlugin().getPreferenceStore());
        setDescription("Proinso Tree Preferences Page");
        initializeDefaults();
    }

    private void initializeDefaults()
    {
        IPreferenceStore aStore = getPreferenceStore();
        aStore.setDefault(cShowMetamodelPackageChildNode, false);
        aStore.setDefault(cShowMetamodelClassChildNode, false);
   }

    public void createFieldEditors()
    {
    	vShowMetamodelPackageChildNode = new BooleanFieldEditor(cShowMetamodelPackageChildNode, "Show metamodel Package child nodes", getFieldEditorParent());
        addField(vShowMetamodelPackageChildNode);
        vShowMetamodelClassChildNode = new BooleanFieldEditor(cShowMetamodelClassChildNode, "Show metamodel Class child nodes", getFieldEditorParent());
        addField(vShowMetamodelClassChildNode);
    }

    public boolean performOk()
    {
        IPreferenceStore aStore = getPreferenceStore();
        aStore.setValue(cShowMetamodelPackageChildNode, vShowMetamodelPackageChildNode.getBooleanValue());
        aStore.setValue(cShowMetamodelClassChildNode, vShowMetamodelClassChildNode.getBooleanValue());
        updateEditPlugin( aStore);
        return true;
    }

    public void init(IWorkbench iworkbench)
    {
    }

    
    private void updateEditPlugin( IPreferenceStore theStore) {
    	Map aEditPluginMap = ProinsoEditPlugin.getPlugin().getPreferencesMap();
    	if ( aEditPluginMap == null) { return;}
    	
    	aEditPluginMap.put( cShowMetamodelPackageChildNode, theStore.getBoolean(cShowMetamodelPackageChildNode));
       	aEditPluginMap.put( cShowMetamodelClassChildNode, theStore.getBoolean(cShowMetamodelClassChildNode));
   }
    
    
    public static final String P_PATH = "pathPreference";
    public static final String P_BOOLEAN = "booleanPreference";
    public static final String P_CHOICE = "choicePreference";
    public static final String P_STRING = "stringPreference";
    public static final String cShowMetamodelPackageChildNode = "showmetamodelpackagechildnode";
    public static final String cShowMetamodelClassChildNode = "showmetamodelclasschildnode";
    private BooleanFieldEditor vShowMetamodelPackageChildNode;
    private BooleanFieldEditor vShowMetamodelClassChildNode;

}
