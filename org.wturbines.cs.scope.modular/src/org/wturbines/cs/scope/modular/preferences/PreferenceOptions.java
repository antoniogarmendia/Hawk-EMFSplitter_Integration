package org.wturbines.cs.scope.modular.preferences;

import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.mondo.modular.references.ext.EvaluateCrossReferencesContributor;
import org.wturbines.cs.scope.modular.wizard.WTComponentsNewProjectNature;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceOptions {

	public static final String FeatureEditor_CHOICE = "choiceFeatureEditor";
	public static final String DefaultFeatureEditorDialog = "DefaultFeatureEditorDialog";
	
	public static final List<String> GetTreeEditorFeatureOptions()
	{
		EvaluateCrossReferencesContributor eval = new EvaluateCrossReferencesContributor();
		List<String> listOfValues = eval.ListNames(Platform.getExtensionRegistry(),WTComponentsNewProjectNature.ID);
		listOfValues.add(DefaultFeatureEditorDialog);
		return listOfValues;
	}
	
}

