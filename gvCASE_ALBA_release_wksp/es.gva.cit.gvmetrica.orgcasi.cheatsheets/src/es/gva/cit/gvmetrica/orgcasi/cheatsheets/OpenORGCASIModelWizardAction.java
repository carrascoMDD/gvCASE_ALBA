/**
 * 
 */
package es.gva.cit.gvmetrica.orgcasi.cheatsheets;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cheatsheets.actions.AbstractOpenWizardAction;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;

import es.gva.cit.gvmetrica.orgcasi.presentation.OrgcasiModelWizard;

/**
 * @author ACV
 *
 */
public class OpenORGCASIModelWizardAction extends AbstractOpenWizardAction implements ICheatSheetAction {

	  protected String vDefaultProjectName;
	  protected String vDefaultModelName;
	  protected String vDefaultRootObjectClassName;  
	
	
	/**
	 * 
	 */
	public OpenORGCASIModelWizardAction() {
		// TODO Auto-generated constructor stub
	}

	
    public void run(String params[], ICheatSheetManager manager)
    {
        if(params.length > 0 && params[0] != null)
        {
        	vDefaultProjectName = params[0];
            
            if(params.length > 1 && params[1] != null)
            {
            	vDefaultModelName = params[1];
            	
                if(params.length > 2 && params[2] != null)
                {
                	vDefaultRootObjectClassName = params[2];
                }
            }
        }
        run();
    }

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.cheatsheets.actions.AbstractOpenWizardAction#createWizard()
	 */
	protected final INewWizard createWizard() throws CoreException {
		// TODO Auto-generated method stub
		OrgcasiModelWizard wizard = createOrgcasiModelWizard();
        if(vDefaultProjectName != null) {
            wizard.setDefaultProjectName(vDefaultProjectName);
        }
        if(vDefaultModelName != null) {
            wizard.setDefaultModelName(vDefaultModelName);
        }
        if(vDefaultRootObjectClassName != null) {
            wizard.setDefaultRootObjectClassName(vDefaultRootObjectClassName);
        }
 	    return wizard;
	}

	

   protected OrgcasiModelWizard createOrgcasiModelWizard()
   {
       return new OrgcasiModelWizard();
   }
	
	
}
