
package org.wturbines.cs.scope.modular.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.wturbines.cs.scope.modular.PerformantXMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;

import WT.WTComponents;
import WT.impl.WTFactoryImpl;

public class WTComponentsNewProjectInfo {

	private WTComponentsProjectFeatures features; 
	private IProject project;
	private String idObjectroot = null;//Extrinsic ID

	public WTComponentsNewProjectInfo(WTComponentsProjectFeatures feat){
		this.features = feat;
		this.project = null;
	}
	
	public boolean Create_Project() throws CoreException, BackingStoreException, IOException
	{	
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(features.Get_name());
		if (!project.exists()) {
		    project.create(null);
		    project.open(null);
			try {
		    	IProjectDescription description = project.getDescription();
		    	String[] natures = description.getNatureIds();
		    	String[] newNatures = new String[natures.length + 1];
				newNatures[natures.length] = WTComponentsNewProjectNature.ID;
		    	System.arraycopy(natures, 0, newNatures, 0, natures.length);		    	
		    	description.setNatureIds(newNatures);
		    	project.setDescription(description, null);
				
				Create_XMI_Associated(project);
		
		    }catch (CoreException e) {
		        // Something went wrong
				e.printStackTrace();
		    }
		}		
		
		return true;				
	}

	public void Create_XMI_Associated(IProject project) throws IOException
	{
		// Get the URI of the model file.
		URI fileURI = URI.createPlatformResourceURI(project.getFullPath().toString().concat("/").concat(project.getName()+".xmi"), true);
		//Add the root to the object
		WTComponents root = WTFactoryImpl.eINSTANCE.createWTComponents();
		//Set the Attributes
				root.setName(project.getName());
		
		//Performant XMI
		if(idObjectroot!=null)
			new PerformantXMIResourceFactoryImpl().Create_XMI(fileURI,root,idObjectroot);	
		else
			new PerformantXMIResourceFactoryImpl().Get_Create_XMI(fileURI,root);	
	}

	public IFolder Create_Folder(String path) throws CoreException
	{
		IFolder fol = project.getFolder(path);
		if(!fol.exists()){
			fol.create(IResource.NONE, true, null);			
		}
		
		return fol;
	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}
	
	//Model use Extrinsic ID 
	public String getIdObjectroot() {
		return idObjectroot;
	}
	
	public void setIdObjectroot(String idObjectroot) {
		this.idObjectroot = idObjectroot;
	}
}

