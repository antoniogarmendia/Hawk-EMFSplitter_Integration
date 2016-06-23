package org.miso.mondo.wt.cs.scope.definition;

import org.eclipse.emf.ecore.EReference;
import org.mondo.generate.scope.project.ext.IScopeCrossReferences;

import ScopeDefinition.ScopeDefinitionEnum;

import WT.impl.WTFactoryImpl;

public class ScopeCrossReferencesConfiguration implements IScopeCrossReferences {

	public ScopeCrossReferencesConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ScopeDefinitionEnum getScopebyReference(EReference ref) {
		// TODO Auto-generated method stub
		

	if(ref.equals(WTFactoryImpl.init().getWTPackage().
		getComponent_States()))
		return ScopeDefinitionEnum.RSAME_PACKAGE;				
		
		return ScopeDefinitionEnum.RSAME_WORK_SPACE;
	}

}


