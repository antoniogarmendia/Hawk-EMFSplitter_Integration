
package org.wturbines.cs.scope.modular.propertysource;

import java.io.File;
import java.io.IOException;

import org.wturbines.cs.scope.modular.XMI_File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.ui.IPackagesViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import WT.Architecture;

public class ArchitectureItemPropertiesSource implements IPropertySource { 
	
	private XMI_File property_file;

	public ArchitectureItemPropertiesSource(XMI_File property_file) throws IOException{
		this.property_file = property_file;		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		if(id.equals("name"))
			try {
				((Architecture)property_file.Get_Root()).
				eSet(((Architecture)property_file.Get_Root()).eClass().getEStructuralFeature("name"),
					value.toString());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}			
		try {
			property_file.Save_XMI();			
				//Rename the file
				if(id.equals("name")){
				Path xmiPath = new Path(CommonPlugin.resolve(property_file.getFileURI()).toFileString());
				IPath newxmiPath = xmiPath.removeLastSegments(1).append(value.toString()).addFileExtension(xmiPath.getFileExtension());
				File src = new File(xmiPath.toFile().getPath());	
				File trg = new File(newxmiPath.toFile().getPath());
				src.renameTo(trg);
				
				//Change File
				property_file = new XMI_File(URI.createPlatformResourceURI(newxmiPath.makeRelativeTo(ResourcesPlugin.getWorkspace().getRoot().getLocation()).toString(),true));
				property_file.setRoot(null);
				
				//Refresh folder
				IFolder fol = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(trg.getParent()));				
				try {
					fol.getProject().refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Refresh Package Explorer
				final IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.jdt.ui.PackageExplorer");
				if (activePart != null && activePart instanceof IPackagesViewPart) {
					
				    ((IPackagesViewPart) activePart).selectAndReveal(trg);
				    ((IPackagesViewPart) activePart).getTreeViewer().refresh();				   
				}
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		Object strObject = null;
		if(id.equals("name"))
			try {
				strObject = ((Architecture)property_file.Get_Root()).eGet(((Architecture)property_file.Get_Root()).eClass().getEStructuralFeature("name"));
				//getName().toString();				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
		
		if(strObject!=null)
			return strObject.toString();
		return "";
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		// TODO Auto-generated method stub

		TextPropertyDescriptor attr_name = new TextPropertyDescriptor("name", "name");
		attr_name.setCategory("Attributes");
		return new IPropertyDescriptor[]{
				attr_name
								
		};
	}
	
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

