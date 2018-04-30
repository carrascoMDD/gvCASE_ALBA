/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.gva.cit.gvcase.prototipo.rdbms.presentation;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.resources.IWorkspaceRoot;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import es.gva.cit.gvcase.prototipo.rdbms.RdbmsFactory;
import es.gva.cit.gvcase.prototipo.rdbms.RdbmsPackage;
import es.gva.cit.gvcase.prototipo.rdbms.provider.RdbmsEditPlugin;


import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsModelWizard extends Wizard implements INewWizard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Conselleria d'Infraestructures i Transport - Generalitat Valenciana 2006";

// OJOJET ACV BEGIN

	  /**
	   * Storage to hold the name of the new RDBMS Project
	   * @generated 
	   * OJOJET ACV
	   */
	  protected String vDefaultProjectName;

	  /**
	   * Storage to hold the name of the new Model a
	   * @generated 
	   * OJOJET ACV
	   */
	  protected String vDefaultModelName;
	  /**
	   * Storage to hold the name of the new Root Object Class Name
       * WARNING: duplicate fields in this class and an inner class
       * TODO: chech whether to keep it is this slot, or the one of same name in the inital object page
	   * @generated 
	   * OJOJET ACV
	   */
	  protected String vDefaultRootObjectClassName;  
	  
	  /**
	   * Sets the name of Project to contain the new RDBMS model when this wizard
	   * is presented to the user.  This method has to be invoke before the wizard
	   * pages are added.
	   * @param path The <b>absolute</b> path of the genmodel.
	   * @generated 
	   * OJOJET ACV
	   */
	  public void setDefaultProjectName(String theProjectName) {
		  vDefaultProjectName = theProjectName;
	  }
	  
	  /**
	   * Gets the name of Project  containing the new RDBMS model when this wizard
	   * is presented to the user.  This method has to be invoke before the wizard
	   * pages are added.
	   * @param path The <b>absolute</b> path of the genmodel.
	   * @generated 
	   * OJOJET ACV
	   */
	  public String getDefaultProjectName() {
	    return vDefaultProjectName;
	  }
	
	/**
	   * Sets the file name for the new RDBMS model that
	   * is presented to the user.  This method has to be invoke before the wizard
	   * pages are added.
	   * @param id
	   * @generated 
	   * OJOJET ACV
	   */
	  public void setDefaultModelName(String theModelName) {
		  vDefaultModelName = theModelName;
	  }
	  
	/**
	   * Gets the file name for the new RDBMS model that
	   * is presented to the user. 
	   * @param id
	   * @generated 
	   * OJOJET ACV
	   */
	  public String getDefaultModelName() {
	    return vDefaultModelName;
	  }
	  

	 /**
	   * Sets the class name of the Root Object class shown when this wizard
	   * is presented to the user.  This method has to be invoke before the wizard
	   * pages are added.
	   * @param id
  	   * @generated 
   	   * OJOJET ACV 
	   */
	  public void setDefaultRootObjectClassName(String theClassName) {
		  vDefaultRootObjectClassName = theClassName;
	  }
	  
	 /**
	   * Gets the class name of the Root Object class shown when this wizard
	   * is presented to the user.  This method has to be invoke before the wizard
	   * pages are added.
	   * @param id
  	   * @generated 
   	   * OJOJET ACV 
	   */
	  public String getDefaultRootObjectClassName() {
	    return vDefaultRootObjectClassName;
	  }
	

/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsPackage rdbmsPackage = RdbmsPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsFactory rdbmsFactory = rdbmsPackage.getRdbmsFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List initialObjectNames;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(RdbmsEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(RdbmsEditorPlugin.INSTANCE.getImage("full/wizban/NewRdbms")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList();
			for (Iterator classifiers = rdbmsPackage.getEClassifiers().iterator(); classifiers.hasNext(); ) {
				EClassifier eClassifier = (EClassifier)classifiers.next();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, java.text.Collator.getInstance());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)rdbmsPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = rdbmsFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString());

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}

							// Save the contents of the resource to the file system.
							//
							Map options = new HashMap();
							options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							RdbmsEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), RdbmsEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			RdbmsEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class RdbmsModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public RdbmsModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			if (super.validatePage()) {
				// Make sure the file ends in ".rdbms".
				//
				String requiredExt = RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameExtension");
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || !enteredExt.equals(requiredExt)) {
					setErrorMessage(RdbmsEditorPlugin.INSTANCE.getString("_WARN_FilenameExtension", new Object [] { requiredExt }));
					return false;
				}
				else {
					return true;
				}
			}
			else {
				return false;
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class RdbmsModelWizardInitialObjectCreationPage extends WizardPage {
// OJOJET ACV BEGIN

		  /* Storage for the new Root Object Class Name
		   * @generated 
		   * OJOJET ACV
		   */
		  protected String vDefaultRootObjectClassName;  

		  
		   /* Sets the class name of the Root Object class shown when this wizard
		   * is presented to the user.  This method has to be invoke before the wizard
		   * pages are added.
		   * @param id
		   * @generated 
		   * OJOJET ACV
		   */
		  public void setDefaultRootObjectClassName(String theClassName) {
			  vDefaultRootObjectClassName = theClassName;
		  }
		  
		   /* Gets the class name of the Root Object class shown when this wizard
		   * is presented to the user.  This method has to be invoke before the wizard
		   * pages are added.
		   * @param id
		   * @generated 
		   * OJOJET ACV
		   */
		  public String getDefaultRootObjectClassName() {
		    return vDefaultRootObjectClassName;
		  }

/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public RdbmsModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 * OJOJET ACV
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(RdbmsEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (Iterator i = getInitialObjectNames().iterator(); i.hasNext(); ) {
				initialObjectField.add(getLabel((String)i.next()));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(RdbmsEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (Iterator i = getEncodings().iterator(); i.hasNext(); ) {
				encodingField.add((String)i.next());
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
			
			
// OJOJET ACV BEGIN
			if( initialObjectField != null ) {
				String anObjectClassName = getDefaultRootObjectClassName();
				if ( anObjectClassName != null) {

					String someItems[] = initialObjectField.getItems();
					int aNumItems = someItems.length;
					boolean aDone = false;
					for (int anIndex = 0; !aDone && anIndex < aNumItems; ) {
						if( anObjectClassName.equals( someItems[anIndex])) { 
							initialObjectField.select(anIndex);
							aDone = true;
						}
						anIndex += 1;
					}
				}
			}
// OJOJET ACV END
			
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (Iterator i = getInitialObjectNames().iterator(); i.hasNext(); ) {
				String name = (String)i.next();
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return RdbmsEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				RdbmsEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList();
				for (StringTokenizer stringTokenizer = new StringTokenizer(RdbmsEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     * OJOJET ACV
	 */
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new RdbmsModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsModelWizard_label"));
		newFileCreationPage.setDescription(RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsModelWizard_description"));
		newFileCreationPage.setFileName(RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameDefaultBase") + "." + RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameExtension"));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameExtension");
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new RdbmsModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsModelWizard_label"));
		initialObjectCreationPage.setDescription(RdbmsEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);

// OJOJET ACV BEGIN		
		
		if( newFileCreationPage != null) {
			String aProjectName = getDefaultProjectName();
			if( aProjectName != null) {


				IPath aPath = (new Path(aProjectName)).makeAbsolute();
				newFileCreationPage.setContainerFullPath ( aPath);

				String aModelName = getDefaultModelName();
				if( aModelName != null) {


					newFileCreationPage.setFileName(aModelName);

					IWorkspaceRoot aWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
					IProject aProject = aWorkspaceRoot.getProject(aProjectName);
					if(aProject.exists()) {

						// Make up a unique new name here.
						//
						String aDefaultModelFilenameExtension = RdbmsEditorPlugin.INSTANCE.getString("_UI_RdbmsEditorFilenameExtension");
						String aModelFilename = aModelName + "." + aDefaultModelFilenameExtension;
						for (int i = 1; aProject.findMember(aModelFilename) != null; ++i) {
							aModelFilename = aModelName + "_" + i + "." + aDefaultModelFilenameExtension;
						}
						newFileCreationPage.setFileName(aModelFilename);	
					}
				}
			}



		}

		if( initialObjectCreationPage != null) {
			String anObjectClassName = getDefaultRootObjectClassName();
			if( anObjectClassName != null) {
				initialObjectCreationPage.setDefaultRootObjectClassName( anObjectClassName);
			}
		}
// OJOJET ACV END		
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
