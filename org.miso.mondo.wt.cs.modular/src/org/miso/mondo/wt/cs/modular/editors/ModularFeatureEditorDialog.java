package org.miso.mondo.wt.cs.modular.editors;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PatternFilter;
import org.mondo.generate.scope.project.ext.EvaluateScopeCrossReferences;
import org.mondo.generate.visibility.project.ext.EvaluateVisibilityEClass;
import org.mondo.modular.references.ext.EvaluateCrossReferencesContributor;

import org.miso.mondo.wt.cs.modular.wizard.WTComponentsNewProjectNature;

import ScopeDefinition.ScopeDefinitionEnum;

public class ModularFeatureEditorDialog extends Dialog{

	protected EObject eObject;
	protected EStructuralFeature feature;
	protected String IdExtension;
	protected ILabelProvider labelprovider;
	protected List<?> choicesOfValues;
	protected EList<?> result;
	protected IContentProvider contentProvider;
	protected ItemProvider values;
	protected boolean unique;
	
	//Scope
	protected Group scopeGroupComposite;
	protected ScopeDefinitionEnum current_scope;
	protected Button browseProject;
	protected Button browseWorkspace;
	protected Button browsePackage;
	protected Button browseUnit;
	protected Resource res;

	protected ModularFeatureEditorDialog(Shell parent, EObject parameObject, EStructuralFeature paramfeature, String paramIdExtension,
			ILabelProvider paramLabelProvider) {
		// TODO Auto-generated constructor stub
		super(parent);
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);	
		this.eObject = parameObject;
		this.feature = paramfeature;
		this.IdExtension = paramIdExtension;	
		this.labelprovider = paramLabelProvider;
		this.current_scope = null;
		this.browseWorkspace = null;
		this.browseProject = null;
		this.browsePackage = null;
		this.browseUnit = null;
		this.choicesOfValues = null;
		this.unique = feature.isUnique() || feature instanceof EReference;
					
			AdapterFactory adapterFactory = new ComposedAdapterFactory(Collections.<AdapterFactory>emptyList());
			values = new ItemProvider(adapterFactory, (EList<?>) eObject.eGet(feature, false));
			contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub
		Composite contents = (Composite)super.createDialogArea(parent);
		
		GridLayout contentsGridLayout = (GridLayout)contents.getLayout();
	    contentsGridLayout.numColumns = 3;
		
	    GridData contentsGridData = (GridData)contents.getLayoutData();
	    contentsGridData.horizontalAlignment = SWT.FILL;
	    contentsGridData.verticalAlignment = SWT.FILL;
	    
	    Group filterGroupComposite = new Group(contents, SWT.NONE);
	    filterGroupComposite.setText("Filter Available Choices");
	    filterGroupComposite.setLayout(new GridLayout(2, false));
	    filterGroupComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 3, 1));
	    
	    Label label = new Label(filterGroupComposite, SWT.NONE);
	    label.setText("Choice Pattern (* or ?)");
	    
	    Text patternText = new Text(filterGroupComposite, SWT.BORDER);
	    patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    scopeGroupComposite = new Group(contents, SWT.NONE);
		scopeGroupComposite.setText("Choose Scope");
		scopeGroupComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 3, 1));
		scopeGroupComposite.setLayout(new GridLayout(getCurrentScope().getValue() + 1, false));	    
	    
	    if(getCurrentScope().getValue() == 3)
	    {
	    	browseWorkspace = new Button(scopeGroupComposite, SWT.RADIO);
	    	browseWorkspace.setText("Browse Workspace");
	    	browseWorkspace.setSelection(true);
	    	ScopeResourceWS();
	    }
	    
	    if(getCurrentScope().getValue() >= 2)
	    {
		    browseProject = new Button(scopeGroupComposite, SWT.RADIO);
		    browseProject.setText("Browse Current Project");		    
		    boolean selection = getCurrentScope().getValue() == 2?true:false;
		    browseProject.setSelection(selection);
		    if(selection==true)
		    	ScopeResourceProject();
	    }
	    
	    if(getCurrentScope().getValue() >= 1)
	    {
	    	browsePackage = new Button(scopeGroupComposite, SWT.RADIO);
	    	browsePackage.setText("Browse Package");
		    boolean selection = getCurrentScope().getValue() == 1 ? true : false;
		    browsePackage.setSelection(selection);
		    if(selection==true)
		    	ScopeResourcePackage();
	    }
	    
	    if(getCurrentScope().getValue() >= 0)
	    {
	    	browseUnit = new Button(scopeGroupComposite, SWT.RADIO);
	    	browseUnit.setText("Browse Unit");
	    	boolean selection = getCurrentScope().getValue() == 0 ? true : false;
	    	browseUnit.setSelection(selection);
	    	if(selection == true)
	    		ScopeResourceUnit();
	    }	
	    
	    //this.choicesOfValues = getChoicesofValues();
	    
	    //Composite of Choices
	    Composite choiceComposite = new Composite(contents, SWT.NONE);
	    {
	      GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
	      data.horizontalAlignment = SWT.END;
	      choiceComposite.setLayoutData(data);

	      GridLayout layout = new GridLayout();
	      data.horizontalAlignment = SWT.FILL;
	      layout.marginHeight = 0;
	      layout.marginWidth = 0;
	      layout.numColumns = 1;
	      choiceComposite.setLayout(layout);
	    }
	    
	    Label choiceLabel = new Label(choiceComposite, SWT.NONE);
	    choiceLabel.setText("Choices");
	    GridData choiceLabelGridData = new GridData();
	    choiceLabelGridData.verticalAlignment = SWT.FILL;
	    choiceLabelGridData.horizontalAlignment = SWT.FILL;
	    choiceLabel.setLayoutData(choiceLabelGridData);
	    
	    //Table of Choices
	    final Table choiceTable = new Table(choiceComposite, SWT.MULTI | SWT.BORDER);
	    
	    GridData choiceTableGridData = new GridData();
		choiceTableGridData.widthHint = Display.getCurrent().getBounds().width / 5;
		choiceTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
		choiceTableGridData.verticalAlignment = SWT.FILL;
		choiceTableGridData.horizontalAlignment = SWT.FILL;
		choiceTableGridData.grabExcessHorizontalSpace= true;
		choiceTableGridData.grabExcessVerticalSpace= true;
		choiceTable.setLayoutData(choiceTableGridData);
	    
	    
	    final TableViewer choiceTableViewer = new TableViewer(choiceTable);
	    if (choiceTableViewer != null)
	    {
	    	choiceTableViewer.setContentProvider(new AdapterFactoryContentProvider(new AdapterFactoryImpl()));
		    choiceTableViewer.setLabelProvider(labelprovider);
		    final PatternFilter filter =
		          new PatternFilter()
		          {
		            @Override
		            protected boolean isParentMatch(Viewer viewer, Object element)
		            {
		              return viewer instanceof AbstractTreeViewer && super.isParentMatch(viewer, element);
		            }
		          };
		        choiceTableViewer.addFilter(filter);
		        if (patternText != null)
		        {
		          patternText.addModifyListener
		            (new ModifyListener()
		             {
		               public void modifyText(ModifyEvent e)
		               {
		                 filter.setPattern(((Text)e.widget).getText());
		                 choiceTableViewer.refresh();
		               }
		       });
		    }		    
		    //Filter to avoid repeating elements
		    if (unique)
		    {
			    choiceTableViewer.addFilter
		          (new ViewerFilter()
		           {
		             
		             @Override
		             public boolean select(Viewer viewer, Object parentElement, Object element)
		             {
		            	 EList<Object> listOfChildren = values.getChildren();
		            	 int count = listOfChildren.size();
		            	 EObject child = null;
		            	 EObject EObjectelement = (EObject)element;
		            	 for (int i = 0; i < count; i++) {
							child = (EObject)listOfChildren.get(i);
							if(EcoreUtil.equals(EObjectelement, child))
								return false;								
		            	 }		            	 
		            	 return true;
		             }
		           });
		    }

			if(choicesOfValues!=null)
		    	choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
	    }	    
	    
	    Composite controlButtons = new Composite(contents, SWT.NONE);
	    GridData controlButtonsGridData = new GridData();
	    controlButtonsGridData.verticalAlignment = SWT.FILL;
	    controlButtonsGridData.horizontalAlignment = SWT.FILL;
	    controlButtons.setLayoutData(controlButtonsGridData);
	    
	    GridLayout controlsButtonGridLayout = new GridLayout();
	    controlButtons.setLayout(controlsButtonGridLayout);
	    
	    final Button addButton = new Button(controlButtons, SWT.PUSH);
	    addButton.setText("Add");
	    GridData addButtonGridData = new GridData();
	    addButtonGridData.verticalAlignment = SWT.FILL;
	    addButtonGridData.horizontalAlignment = SWT.FILL;
	    addButton.setLayoutData(addButtonGridData);	  
	    	    
	    final Button removeButton = new Button(controlButtons, SWT.PUSH);
	    removeButton.setText("Remove");
	    GridData removeButtonGridData = new GridData();
	    removeButtonGridData.verticalAlignment = SWT.FILL;
	    removeButtonGridData.horizontalAlignment = SWT.FILL;
	    removeButton.setLayoutData(removeButtonGridData);
	    
	    Label spaceLabel = new Label(controlButtons, SWT.NONE);
	    GridData spaceLabelGridData = new GridData();
	    spaceLabelGridData.verticalSpan = 2;
	    spaceLabel.setLayoutData(spaceLabelGridData);
	    
	    final Button upButton = new Button(controlButtons, SWT.PUSH);
	    upButton.setText("Up");
	    GridData upButtonGridData = new GridData();
	    upButtonGridData.verticalAlignment = SWT.FILL;
	    upButtonGridData.horizontalAlignment = SWT.FILL;
	    upButton.setLayoutData(upButtonGridData);

	    final Button downButton = new Button(controlButtons, SWT.PUSH);
	    downButton.setText("Down");
	    GridData downButtonGridData = new GridData();
	    downButtonGridData.verticalAlignment = SWT.FILL;
	    downButtonGridData.horizontalAlignment = SWT.FILL;
	    downButton.setLayoutData(downButtonGridData);
	    
	    //Table Feature	    
	    Composite featureComposite = new Composite(contents, SWT.NONE);
	    {
	      GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
	      data.horizontalAlignment = SWT.END;
	      featureComposite.setLayoutData(data);

	      GridLayout layout = new GridLayout();
	      data.horizontalAlignment = SWT.FILL;
	      layout.marginHeight = 0;
	      layout.marginWidth = 0;
	      layout.numColumns = 1;
	      featureComposite.setLayout(layout);
	    }
	    
	    Label featureLabel = new Label(featureComposite, SWT.NONE);
	    featureLabel.setText("Feature");
	    GridData featureLabelGridData = new GridData();
	    featureLabelGridData.horizontalSpan = 2;
	    featureLabelGridData.horizontalAlignment = SWT.FILL;
	    featureLabelGridData.verticalAlignment = SWT.FILL;
	    featureLabel.setLayoutData(featureLabelGridData);
	    
	    final Table featureTable = new Table(featureComposite, SWT.MULTI | SWT.BORDER);
	    GridData featureTableGridData = new GridData();
	    featureTableGridData.widthHint = Display.getCurrent().getBounds().width / 5;
	    featureTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
	    featureTableGridData.verticalAlignment = SWT.FILL;
	    featureTableGridData.horizontalAlignment = SWT.FILL;
	    featureTableGridData.grabExcessHorizontalSpace= true;
	    featureTableGridData.grabExcessVerticalSpace= true;
	    featureTable.setLayoutData(featureTableGridData);	    
	    
	    final TableViewer featureTableViewer = new TableViewer(featureTable);
	    featureTableViewer.setContentProvider(contentProvider);
	    featureTableViewer.setLabelProvider(labelprovider);
	    featureTableViewer.setInput(values);
	    final EList<Object> children = values.getChildren();
	    if (!children.isEmpty())
	    {
	      featureTableViewer.setSelection(new StructuredSelection(children.get(0)));
	    }
	    
	    if (choiceTableViewer != null)
	    {
	      choiceTableViewer.addDoubleClickListener(new IDoubleClickListener()
	        {
	          public void doubleClick(DoubleClickEvent event)
	          {
	            if (addButton.isEnabled())
	            {
	              addButton.notifyListeners(SWT.Selection, null);
	            }
	          }
	        });

	      featureTableViewer.addDoubleClickListener(new IDoubleClickListener()
	      {
	        public void doubleClick(DoubleClickEvent event)
	        {
	          if (removeButton.isEnabled())
	          {
	            removeButton.notifyListeners(SWT.Selection, null);
	          }
	        }
	      });
	    }
	    
		//Add Button Listener
	    addButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				if (choiceTableViewer != null)
				{
		            IStructuredSelection selection = (IStructuredSelection)choiceTableViewer.getSelection();
		            for (Iterator<?> i = selection.iterator(); i.hasNext();)
		            {
		              Object value = i.next();
		              if (!unique || !children.contains(value))
		              {
		                children.add(value);
		              }
		            }
		            featureTableViewer.refresh();
		            featureTableViewer.setSelection(selection);
		            choiceTableViewer.refresh();
		        }
			}
	    	
		});
	    
	    //Remove Button Listener
	    removeButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
		        Object firstValue = null;
		        for (Iterator<?> i = selection.iterator(); i.hasNext();)
		        {
		            Object value = i.next();
		            if (firstValue == null)
		            {
		              firstValue = value;
		            }
		            children.remove(value);
		        }
		        
		        if (!children.isEmpty())
		        {
		            featureTableViewer.setSelection(new StructuredSelection(children.get(0)));
		        }
		        
		        if (choiceTableViewer != null)
		        {
		        	choiceTableViewer.refresh();	
		        	choiceTableViewer.setSelection(selection);		        	  	            
		        }		        
			}   	
	    	
		});
	    
	    //Up Button Listener
	    upButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
		        int minIndex = 0;
		        for (Iterator<?> i = selection.iterator(); i.hasNext();)
		        {
		            Object value = i.next();
		            int index = children.indexOf(value);
		            children.move(Math.max(index - 1, minIndex++), value);
		        }
			}  	
	    	
		});	    
	    
	    //Down Button Listener
	    downButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				IStructuredSelection selection = (IStructuredSelection)featureTableViewer.getSelection();
		        int maxIndex = children.size() - 1;
		        List<?> objects = selection.toList();
		        for (ListIterator<?> i = objects.listIterator(objects.size()); i.hasPrevious();)
		        {
		            Object value = i.previous();
		            int index = children.indexOf(value);
		            children.move(Math.min(index + 1, maxIndex--), value);
		        }
			}  	
	    	
		});
	    
	    //Browse Workspace
	    if(browseWorkspace != null)
	    browseWorkspace.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
				if(browseWorkspace.getSelection())
				{
					ScopeResourceWS();
					choicesOfValues = getChoicesofValues();
					if(choicesOfValues!=null)
					{
						choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
						choiceTableViewer.refresh();
					}					
				}
			}
		});	    
	    
	    //Browse Project
	    if(browseProject !=	null)
	    browseProject.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
				if(browseProject.getSelection())
				{
					ScopeResourceProject();
					choicesOfValues = getChoicesofValues();
					if(choicesOfValues!=null)
					{
						choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
						choiceTableViewer.refresh();
					}
				}
			}
		});
	    
	   	//Browse Package
	    if(browsePackage !=	null)
	    browsePackage.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
				if(browsePackage.getSelection())
				{
					ScopeResourcePackage();
					choicesOfValues = getChoicesofValues();
					if(choicesOfValues!=null)
					{
						choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
						choiceTableViewer.refresh();
					}
				}
			}
		});
	    
	    //Browse Unit
	    if(browseUnit != null)
	    browseUnit.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
				if(browseUnit.getSelection())
				{
					ScopeResourceUnit();
					choicesOfValues = getChoicesofValues();
					if(choicesOfValues!=null)
					{
						choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
						choiceTableViewer.refresh();
					}
				}
			}
		});	    
	    
	    this.choicesOfValues = getChoicesofValues();
	    if(choicesOfValues!=null)
		{
			choiceTableViewer.setInput(new ItemProvider(choicesOfValues));
			choiceTableViewer.refresh();
		}
	    
	    return contents;
	}

	private List <  ?  > getChoicesofValues() {

		EvaluateCrossReferencesContributor eval = new EvaluateCrossReferencesContributor();
		
		//Visibility EClass
		EvaluateVisibilityEClass evalEClass = new EvaluateVisibilityEClass();
		ScopeDefinitionEnum scEClass = evalEClass.executeEClass(Platform.getExtensionRegistry(), (EClass)feature.getEType());
		//End EClass
		String eolExpression = evalEClass.executeEOL(Platform.getExtensionRegistry(), (EClass)feature.getEType());
		//String eolExpression = null;
		
		if (res == null)
			eval.execute(Platform.getExtensionRegistry(), this.IdExtension, WTComponentsNewProjectNature.ID, eObject.eResource(), true, (EClass)feature.getEType(),eolExpression);
		else
			eval.execute(Platform.getExtensionRegistry(), this.IdExtension, WTComponentsNewProjectNature.ID, res, false, (EClass)feature.getEType(),eolExpression);
		
		return eval.getChoicesofValues();
	}
	
	@Override
	protected void okPressed()
	{
	    result = new BasicEList<Object>(values.getChildren());
	    super.okPressed();
	}
	
	@Override
	public boolean close()
	{
	    contentProvider.dispose();
	    return super.close();
	}
	
	public EList<?> getResult() {
		return result;
	}
	
	public ScopeDefinitionEnum getCurrentScope()
	{
		if(current_scope == null)
		{
			EvaluateScopeCrossReferences eval = new EvaluateScopeCrossReferences();
			current_scope = eval.execute(Platform.getExtensionRegistry(), (EReference)feature);		
			if(current_scope == null)
				current_scope = ScopeDefinitionEnum.RSAME_WORK_SPACE;
		}	
		return current_scope;
	}
	
	public void ScopeResourceWS() {
		res = null;
	};
	
	public void ScopeResourceProject() {
		URI uri = eObject.eResource().getURI();
		IProject current_pro = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getProject();
		IFile fil = current_pro.getFile(new Path(current_pro.getName() + ".xmi"));
		ResourceSet set = new ResourceSetImpl();
		res = set.createResource(URI.createPlatformResourceURI(fil.getFullPath().toString(), true));
	};

	public void ScopeResourcePackage() {
		URI uri = eObject.eResource().getURI();
		IPath ipath = new Path(uri.path()).removeLastSegments(1);
		ipath = ipath.append(ipath.lastSegment().concat(".xmi"));
		ResourceSet set = new ResourceSetImpl();
		res = set.createResource(URI.createURI("platform:" + ipath.toString()));
	};

	public void ScopeResourceUnit() {

		URI uri = eObject.eResource().getURI();
		ResourceSet set = new ResourceSetImpl();
		res = set.createResource(uri);
	};
	
}

