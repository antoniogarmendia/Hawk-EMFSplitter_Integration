
package org.miso.mondo.wt.cs.modular.wizard;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.service.prefs.BackingStoreException;
import org.miso.mondo.wt.cs.modular.CopierReverseEngineering;
import org.miso.mondo.wt.cs.modular.PerformantXMIResourceFactoryImpl;
import org.miso.mondo.wt.cs.modular.PerformantXMIResourceImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import WT.WTComponents;
import WT.impl.WTFactoryImpl;
import WT.impl.SubsystemImpl;
import WT.impl.ControlSubsystemImpl;
import WT.impl.ArchitectureImpl;
import WT.impl.StateMachineImpl;

public class WTComponentsNewProjectInfo {

	private WTComponentsProjectFeatures features; 
	private IProject project;
	private PerformantXMIResourceImpl reverseModel;
	
	public WTComponentsNewProjectInfo(WTComponentsProjectFeatures feat){
		this.features = feat;
		this.project = null;
	}
	
	public WTComponentsNewProjectInfo(WTComponentsProjectFeatures feat,PerformantXMIResourceImpl reverseModel)
	{
		this.features = feat;
		this.project = null;
		this.reverseModel = reverseModel;
	}

	public boolean Create_Project() throws CoreException, BackingStoreException, IOException
	{	
		final IWorkspaceRunnable create = new IWorkspaceRunnable(){
		
		@Override
		public void run(IProgressMonitor monitor) throws CoreException {
		
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
				
				try {
					Create_XMI_Associated(project);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		    }catch (CoreException e) {
		        // Something went wrong
				e.printStackTrace();
		    	}
			}	
		  }	
		};
		
		try {
			ResourcesPlugin.getWorkspace().run(create,null);
		}
		catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;				
	}

	public void Create_XMI_Associated(IProject project) throws IOException, CoreException
	{
		// Get the URI of the model file.
		URI fileURI = URI.createPlatformResourceURI(project.getFullPath().toString().concat("/").concat(project.getName()+".xmi"), true);
		if(reverseModel == null)
		{	
		//Add the root to the object
		WTComponents root = WTFactoryImpl.eINSTANCE.createWTComponents();
		//Set the Attributes
				root.setName(project.getName());
		new PerformantXMIResourceFactoryImpl().Get_Create_XMI(fileURI,root);		
		}
		else
		{
			TreeIterator<EObject> model_tree = reverseModel.getAllContents();				
			EObject anEObject = null;
			EObject result = null;
			ResourceSet reset = new ResourceSetImpl();
			reset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				      Resource.Factory.Registry.DEFAULT_EXTENSION,
				      new PerformantXMIResourceFactoryImpl());
			Resource resProject = new PerformantXMIResourceFactoryImpl().createResourceResourceSet(fileURI,reset);
			resProject.save(null);
			anEObject = model_tree.next();
			if(anEObject instanceof WTComponents)//Root of the model
			{
				CopierReverseEngineering copierModular = new CopierReverseEngineering(true,true);
				result = copierModular.copyFolder(anEObject);
				resProject.load(null);
				resProject.getContents().add(result);				
				//Some variables
				String name = null;//name(Folder || File)
				String path = null;//Path(Folder || File)
				URI path_uri = null;//URI(Folder || File)
				URI parent_uri = null;//URI Parent(Folder || File)
				IContainer fol = null;//Folder
				IContainer parent = null;//Parent of Folder
				boolean isFolderOrFile = false;
				PerformantXMIResourceImpl xmi_file = null;//XMI FILE
				PerformantXMIResourceImpl xmi_parent = null;//XMI parent FILE
				
				while (model_tree.hasNext()) {
					
					anEObject = model_tree.next();
					
					name = IsFolder(anEObject);
					path = GetObjectPath(anEObject);
					
					if(name != null)//Folder
					{
						//Create Folder
						fol = this.Create_Folder(path);
						parent = fol.getParent();
						//Path to Create XMI File
						path = path.concat(name.concat(".xmi"));
						//Obtain File URI
						path_uri = URI.createPlatformResourceURI(project.getProject().getFullPath().toString().concat(path),true);				
						result = copierModular.copyFolder(anEObject);
						name=null;	
						isFolderOrFile = true;
					}
					else//Files
					{
						name = IsFile(anEObject);
						
						if(name != null){	
							parent = this.Create_Folder(path);
							//Path to Create XMI File
							path = path.concat(name);
							//Obtain File URI
							path_uri = URI.createPlatformResourceURI(project.getProject().getFullPath().toString().concat(path),true);
							result = copierModular.copy(anEObject);
							model_tree.prune();							
							isFolderOrFile = true;
						}
						else{
							
							result = copierModular.copy(anEObject);
							parent = this.Create_Folder(path);
							path = path.concat(parent.getName() + ".xmi");  
							path_uri = URI.createPlatformResourceURI(project.getProject().getFullPath().toString().concat(path),true);
							//Get parent and copy the result EObject
							xmi_parent = (PerformantXMIResourceImpl) reset.getResource(path_uri, true);														
							xmi_parent.load(null);							
							EStructuralFeature feat = anEObject.eContainingFeature();
							if(feat == null)
								xmi_parent.getContents().add(result);
							else						
								((EList<EObject>)xmi_parent.Get_Root().eGet(feat)).add(result);						
							
							xmi_parent.save(null);									
							model_tree.prune();							
						}
					}
					
					if(isFolderOrFile == true)
					{
						//Create XMI File
						xmi_file = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().createResourceResourceSet(path_uri, reset);
						xmi_file.getContents().add(result);
											
						//Include Parent
						parent_uri = URI.createURI(parent.getFullPath().toString().concat("/"+parent.getName().concat(".xmi")),true);
						
						xmi_parent = (PerformantXMIResourceImpl) reset.getResource(parent_uri, true);								
						((EList<EObject>)xmi_parent.Get_Root().eGet(anEObject.eContainingFeature())).add(xmi_file.Get_Root());						
					}					
					//Reset variables	
					path = "";
					path_uri = null;
					fol = null;
					isFolderOrFile = false;					
				}	
				
				copierModular.copyReferences();
				copierModular.clear();
			}			
			
			Iterator<Resource> resources = reset.getResources().iterator();
			Resource itResource = null;
			while (resources.hasNext()) {
				itResource = (Resource) resources.next();
				itResource.save(null);
				itResource.unload();
			}
			
			return;		
		}			
	}

	public IContainer Create_Folder(String path) throws CoreException
	{
		if(path.equals("/") == true)
			return project;
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
	
	public String GetObjectPath(EObject obj){
		
		String cad = "/"; 
		EObject parent = obj;
		String name_folder = null;
		while(parent!=null){
			name_folder = IsFolder(parent);
			if(name_folder!=null)
				cad = "/".concat(name_folder).concat(cad);//Attribute annotated as name
			parent = parent.eContainer();						
		}						
		return cad;
	}
	
	public String IsFolder(EObject eObject){
		
		 if(eObject instanceof SubsystemImpl)
				return ((SubsystemImpl)eObject).getName().toString();	
		 if(eObject instanceof ControlSubsystemImpl)
				return ((ControlSubsystemImpl)eObject).getName().toString();	
		return null;
	}
	
	public static String IsFile(EObject eObject){
		
		if(eObject instanceof ArchitectureImpl)
			return ((ArchitectureImpl)eObject).getName().toString().concat(".arq");			
		if(eObject instanceof StateMachineImpl)
			return ((StateMachineImpl)eObject).getName().toString().concat(".state");			
		
		return null;
	}	 
	
}

