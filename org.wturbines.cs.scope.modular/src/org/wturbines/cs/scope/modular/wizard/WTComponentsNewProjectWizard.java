
package org.wturbines.cs.scope.modular.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.service.prefs.BackingStoreException;
import java.io.IOException;
import org.wturbines.cs.scope.modular.Modular_Diagram;
import org.mondo.modular.sirius.ext.EvaluateSiriusProjectCreation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;

public class WTComponentsNewProjectWizard extends Wizard implements INewWizard {

	private WTComponentsNewProjectCreationPage mainpage;
	private WTComponentsNewProjectInfo projectInfo;
	 
	
	/**
     * Use this method to add pages to the wizard.
     * The one-time generated version of this class will add a default new project page to the wizard.
     */
	public void addPages() {
		
		mainpage = new  WTComponentsNewProjectCreationPage("basicNewProjectPage");
		mainpage.setTitle("WTComponents Project");
		mainpage.setDescription("Create a new WTComponents project");
		addPage(mainpage);
	}	
	
	public WTComponentsNewProjectWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle("New WTComponents Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

	public IWizardPage getNextPage(IWizardPage page) {
		return mainpage;		
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub

		projectInfo = new WTComponentsNewProjectInfo(mainpage.Get_Features());
		String addr = mainpage.getDiagram_address();
		if(addr!=null)
		{
			URI addrURI = URI.createFileURI(addr);
			if(addrURI.isFile()){
				Modular_Diagram create_project = new Modular_Diagram();
				try {
					create_project.Reverse_Engineering(addrURI);

				} catch (IOException | CoreException | BackingStoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				MessageDialog.openInformation(
						getShell(),
						"org.eclipse.modular.wt",
						"The file address is not valid.");
			}	
			
		}
		else{
		
			try {
				projectInfo.Create_Project();				
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		new EvaluateSiriusProjectCreation().executeProject(Platform.getExtensionRegistry(),"WTComponents.odesign");
		return true;
	}	

}

