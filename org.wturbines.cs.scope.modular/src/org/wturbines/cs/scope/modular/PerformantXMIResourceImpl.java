
package org.wturbines.cs.scope.modular;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class PerformantXMIResourceImpl extends XMIResourceImpl{
	
	private boolean modelUUIDs;	

	public PerformantXMIResourceImpl() {
		super();
		modelUUIDs = false;
		// TODO Auto-generated constructor stub
	}

	public PerformantXMIResourceImpl(URI uri) {
		super(uri);
		// TODO Auto-generated constructor stub
		modelUUIDs = false;
	}	
	
	@Override
	protected boolean useUUIDs() {
		// TODO Auto-generated method stub
		return modelUUIDs;
	}

	public EObject Get_Root(){
		return getAllContents().next();
	}

	public boolean isModelUUIDs() {
		return modelUUIDs;
	}

	public void setModelUUIDs(boolean modelUUIDs) {
		this.modelUUIDs = modelUUIDs;
	}	
}

