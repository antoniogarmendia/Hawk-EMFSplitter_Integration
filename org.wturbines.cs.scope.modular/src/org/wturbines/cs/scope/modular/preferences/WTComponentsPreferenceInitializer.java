package org.wturbines.cs.scope.modular.preferences;


import java.util.List;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.wturbines.cs.scope.modular.Activator;

/**
 * Class used to initialize default preference values.
 */

public class WTComponentsPreferenceInitializer extends AbstractPreferenceInitializer {

/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		List<String> listvalues = PreferenceOptions.GetTreeEditorFeatureOptions();
		String defId = null;
		
		Integer num = listvalues.indexOf("Hawk");
		if(num.equals(-1))
		{
			num = listvalues.indexOf("WTComponentsModularCrossReferences");
			if(num.equals(-1))
				defId = PreferenceOptions.DefaultFeatureEditorDialog;
			else
				defId = "WTComponentsModularCrossReferences";
		}
		else
			defId = "Hawk";		
		
		store.setDefault(PreferenceOptions.FeatureEditor_CHOICE, defId);				
	}

}

