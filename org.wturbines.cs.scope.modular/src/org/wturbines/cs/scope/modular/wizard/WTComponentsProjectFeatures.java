
package org.wturbines.cs.scope.modular.wizard;


public class WTComponentsProjectFeatures {
	
	
	//Attributes
	private java.lang.String atr_name;
	
	
	//Constructor with Attributes
	public WTComponentsProjectFeatures(
		 java.lang.String atr_name ){
		this.atr_name = atr_name;
	
	}											

	//Constructor
	public WTComponentsProjectFeatures() {
		atr_name = "org.eclipse.modular.example"; 
	}

	//Get Methods
	public java.lang.String Get_name()
	{
		return atr_name;
	}
	
	//Set Methods
	public void Set_name(java.lang.String arg)
	{
		this.atr_name = arg;
	}

}

