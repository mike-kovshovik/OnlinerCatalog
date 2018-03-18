package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.test.data.TestData;

public class OnlinerHomePageUi
{
	public static final String mainMenuNavigationXpathPrototype = "//span[@class='b-main-navigation__text' and contains(text(), '%s')]";
	//public final String mainMenuNavigationXpathPrototype = "//span[@class='b-main-navigation__text' and contains(text(), '%s')]";	
	//public final Element mainMenuNavigationXpathPrototype = new Element("//span[@class='b-main-navigation__text' and contains(text(), '%s')]", TestData.catalog);
	
	public final Element getMainMenuItemXpath(String menuItemIdentifier) 
	{
		return new Element(mainMenuNavigationXpathPrototype, menuItemIdentifier);
	}
	
	
	
	
	
	
}







/*	public final Element GetMenuNavigationItem(String menuItemIdentifier)
{
	return ElementFactory
}

public static class ElementProvider
{
	private static Element CreateElement(String path)
	{
		return new Element(xPath);
	}
	
	public static Element GetDynamicElement(String xPath, String argument)
	{
		String path = String.format(xPath, argument);
		
		return CreateElement(path);
	}
}
*/
