	
package org.wturbines.cs.scope.modular.wizard.folder;
	
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.URI;
import java.io.IOException;

import WT.Subsystem;
import WT.impl.WTFactoryImpl;
import org.wturbines.cs.scope.modular.XMI_File;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "figure". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class SubsystemCreateFolderWizard extends Wizard implements INewWizard {
	private SubsystemCreateFolderWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SubsystemCreateFolderWizard.
	 */
	public SubsystemCreateFolderWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new SubsystemCreateFolderWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName,
					monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 * @throws IOException 
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException, IOException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		IFolder folder = container.getFolder(new Path(fileName));
		if(!folder.exists()){
			folder.create(IResource.NONE, true, null);					
		}
		//Get the URI 
		URI fileURI = URI.createPlatformResourceURI(folder.getFullPath().toString().concat("/").concat(folder.getName()+".xmi"), true);
		//Create Root
		Subsystem root_obj = WTFactoryImpl.eINSTANCE.createSubsystem();
		
		//Set the Attributes
			root_obj.setName(folder.getName());

		XMI_File folder_xmi = new XMI_File();
		folder_xmi.Create_XMI_File(fileURI);//fileURI
		folder_xmi.getFile_res().getContents().add(root_obj);
		folder_xmi.Save_XMI();
		
		//Search the file
		IContainer fol_parent = folder.getParent();
		IFile file_parent = fol_parent.getFile(new Path(fol_parent.getName().concat(".xmi")));
		XMI_File file_xmi = new XMI_File(URI.createFileURI(file_parent.getFullPath().toString()),folder_xmi.getFile_reset());		
		
		((EList<EObject>)file_xmi.Get_Root().eGet(file_xmi.Get_Root().eClass().getEStructuralFeature("subsystems"), true)).add(folder_xmi.Get_Root());
		file_xmi.Save_XMI();				
		
		monitor.worked(1);
		
	}
	
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.eclipse.modular.project", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
	
