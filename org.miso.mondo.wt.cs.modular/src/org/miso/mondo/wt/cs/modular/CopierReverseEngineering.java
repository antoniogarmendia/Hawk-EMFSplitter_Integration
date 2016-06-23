package org.miso.mondo.wt.cs.modular;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class CopierReverseEngineering extends Copier{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CopierReverseEngineering(boolean resolveProxies, boolean useOriginalReferences) {
		super(resolveProxies, useOriginalReferences);
		// TODO Auto-generated constructor stub
	}

	public EObject copyFolder(EObject eObject)
	{
		if (eObject == null)
	      {
	        return null;
	      }
	      else
	      {
	        EObject copyEObject = createCopy(eObject);
	        if (copyEObject != null)
	        {
	          put(eObject, copyEObject);
	          Iterator<EAttribute> itEAttributes = eObject.eClass().getEAllAttributes().iterator();
	          while (itEAttributes.hasNext())
	        	  copyAttribute((EAttribute)itEAttributes.next(), eObject, copyEObject);				
			}
	        return copyEObject;
	      } 
	}

}

