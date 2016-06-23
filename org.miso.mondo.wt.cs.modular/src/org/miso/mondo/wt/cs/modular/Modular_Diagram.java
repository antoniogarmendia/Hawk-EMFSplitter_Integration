
package org.miso.mondo.wt.cs.modular;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.miso.mondo.wt.cs.modular.wizard.WTComponentsNewProjectInfo;
import org.miso.mondo.wt.cs.modular.wizard.WTComponentsProjectFeatures;
import org.osgi.service.prefs.BackingStoreException;


import WT.WTComponents;
import WT.impl.WTFactoryImpl;
import WT.impl.SubsystemImpl;
import WT.impl.ControlSubsystemImpl;
import WT.impl.ArchitectureImpl;
import WT.impl.StateMachineImpl;

public class Modular_Diagram {
	
	public Modular_Diagram(){}

	private String projectName;	
	
	public void Create_Modular_Diagram(IProject pro, org.eclipse.emf.common.util.URI uri_diagram) throws CoreException, IOException
	{
		//Create Resource and ResourceSet
		ResourceSet reset = new ResourceSetImpl();
		ResourceSet newreset = new ResourceSetImpl();
		
		//Search the root
		IFile file = pro.getFile(pro.getName().concat(".xmi"));
		PerformantXMIResourceImpl file_xmi = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
										createResource(URI.createFileURI(file.getFullPath().toString()));
		
		reset.getResources().add(file_xmi);
		Copier copier = new Copier();
		
		PerformantXMIResourceImpl diagram = (PerformantXMIResourceImpl)new PerformantXMIResourceFactoryImpl().
												createResource(uri_diagram);	
		newreset.getResources().add(diagram);
		
		file_xmi.load(null);		
		diagram.getContents().addAll(copier.copyAll(file_xmi.getContents()));
		copier.copyReferences();
		
		diagram.save(null);			
	}
	
	public void Reverse_Engineering(URI fileURI) throws IOException, CoreException, BackingStoreException
	{
		//Create Performant Resource
		PerformantXMIResourceImpl filemodel = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
													createResource(fileURI);
		filemodel.load(null); 

		//The first element(Root)
		WTComponents root = (WTComponents) filemodel.Get_Root();
		WTComponentsProjectFeatures feat = new WTComponentsProjectFeatures(
		root.getName()
		);

		if(root instanceof WTComponents){
			
			WTComponentsNewProjectInfo project = new WTComponentsNewProjectInfo(feat,filemodel);
			project.Create_Project();
			System.out.println("Reverse_Engineering_Create_Project_Complete");
		}

	}	
}


