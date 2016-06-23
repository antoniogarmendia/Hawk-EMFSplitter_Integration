package org.miso.mondo.wt.cs.visibility.definition;

import org.eclipse.emf.ecore.EClass;
import org.mondo.generate.visibility.project.ext.IVisibilityClass;

import ScopeDefinition.ScopeDefinitionEnum;
import WT.impl.WTFactoryImpl;

public class VisibilityEClassConfiguration implements IVisibilityClass {

	public VisibilityEClassConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getEOLexpressionByEClass(EClass eClass) {
		// TODO Auto-generated method stub
		
		if(WTFactoryImpl.init().getWTPackage().getStateMachine().equals(eClass))
			return "self.name.startsWith('n')";
		return null;
	}

	@Override
	public ScopeDefinitionEnum getVisibilitybyEClass(EClass eClass) {
		
		// TODO Auto-generated method stub
		if(WTFactoryImpl.init().getWTPackage().getStateMachine().equals(eClass))
			return ScopeDefinitionEnum.RSAME_PACKAGE;	
		
		return ScopeDefinitionEnum.RSAME_WORK_SPACE;
	}

}
