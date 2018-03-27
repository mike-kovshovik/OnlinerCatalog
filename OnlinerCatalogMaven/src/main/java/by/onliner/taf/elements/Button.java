package by.onliner.taf.elements;

public class Button extends Element
{
	public Button(String locator) {
		super(locator);
	}

	
	public Button setLocatorVariable (Object variable) 
	{
		return new Button(String.format(locator, variable));
	}

	
}
