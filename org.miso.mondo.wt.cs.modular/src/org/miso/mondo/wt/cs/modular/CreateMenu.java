package org.miso.mondo.wt.cs.modular;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import org.miso.mondo.wt.cs.modular.wizard.WTComponentsNewProjectNature;
import WT.Subsystem;
import WT.ControlSubsystem;

public class CreateMenu extends ExtensionContributionFactory {

	public CreateMenu() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createContributionItems(IServiceLocator serviceLocator,
			IContributionRoot additions) {
		// TODO Auto-generated method stub
		
		ISelectionService serv = (ISelectionService) serviceLocator.getService(ISelectionService.class);
		ISelection selection = serv.getSelection();
		TreeSelection treeselection = (TreeSelection)selection;
		Object firstelement = treeselection.getFirstElement();
			
		if(firstelement instanceof IProject || firstelement instanceof IFolder){
			IProject pro = null;
			if(firstelement instanceof IProject)
				pro = (IProject)firstelement;	
			if(firstelement instanceof IFolder)
				pro = ((IFolder)firstelement).getProject();			
			try {
				IProjectNature nature = pro.getNature(WTComponentsNewProjectNature.ID);
				if(nature==null)
					return;
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			MenuManager menu = new MenuManager();
			menu.setMenuText("New WTComponents");			
			if(firstelement instanceof IProject)
			{
				CommandContributionItemParameter pcommand = new CommandContributionItemParameter(serviceLocator,
			"", "org.eclipse.ui.newWizard", CommandContributionItem.STYLE_PUSH);
				pcommand.parameters = new HashMap<String,String>();
			

				pcommand.parameters.put("newWizardId", "org.miso.mondo.wt.cs.subsystem.subsystemNewPackage");
				CommandContributionItem itemsubsystems = new CommandContributionItem(pcommand);
				menu.add(itemsubsystems);
					
			}
			else if(firstelement instanceof IFolder)
			{
				IFolder fol = (IFolder)firstelement;
				IPath filePath = fol.getFullPath().append("/"+fol.getName().concat(".xmi"));
				XMI_File file = new XMI_File(URI.createPlatformResourceURI(filePath.toString(), true), true);
				EObject root = null;
				try {
					root = file.Get_Root();
				} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
				
				if(root!=null)
				{					
					if(root instanceof Subsystem)
					{
						CommandContributionItemParameter pcommand = new CommandContributionItemParameter(serviceLocator,
						"", "org.eclipse.ui.newWizard", CommandContributionItem.STYLE_PUSH);
						pcommand.parameters = new HashMap<String,String>();
						
						pcommand.parameters.put("newWizardId", "org.miso.mondo.wt.cs.subsystem.subsystemNewPackage");
						CommandContributionItem itemsubsystems = new CommandContributionItem(pcommand);
						menu.add(itemsubsystems);
						
						pcommand.parameters.put("newWizardId", "org.miso.mondo.wt.cs.architecture.architectureNewFile");
						CommandContributionItem itemensembles = new CommandContributionItem(pcommand);
						menu.add(itemensembles);
						
						pcommand.parameters.put("newWizardId", "org.miso.mondo.wt.cs.controlsubsystem.controlsubsystemNewPackage");
						CommandContributionItem itembeh = new CommandContributionItem(pcommand);
						menu.add(itembeh);
						
					}
					if(root instanceof ControlSubsystem)
					{
						CommandContributionItemParameter pcommand = new CommandContributionItemParameter(serviceLocator,
						"", "org.eclipse.ui.newWizard", CommandContributionItem.STYLE_PUSH);
						pcommand.parameters = new HashMap<String,String>();
						
						pcommand.parameters.put("newWizardId", "org.miso.mondo.wt.cs.statemachine.statemachineNewFile");
						CommandContributionItem itemstates = new CommandContributionItem(pcommand);
						menu.add(itemstates);
						
					}
				}				
			}
			additions.addContributionItem(menu, null);
		}
	}

				
}

