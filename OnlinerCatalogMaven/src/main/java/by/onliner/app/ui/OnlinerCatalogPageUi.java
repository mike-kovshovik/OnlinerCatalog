package by.onliner.app.ui;

import by.onliner.taf.elements.Element;

public class OnlinerCatalogPageUi
{
	// locator prototypes
	
	public final String topMenuItemPrototype = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]";
	public final String subMenuItemPrototype = "//div[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
	public final String gridItemPrototype = "//span[@class='catalog-navigation-list__dropdown-title' and contains(text(), '%s')]";
	
	
	// public methods to creating final xpaths to the elements
	
	public final Element getTopMenuXpath (String topMenuElement)
	{
		return new Element (topMenuItemPrototype, topMenuElement);
	}
	
	public final Element getSubMenuXpath (String subMenuElement)
	{
		return new Element (subMenuItemPrototype, subMenuElement);
	}
	
	public final Element getGridItemXpath (String gridItemElement)
	{
		return new Element (gridItemPrototype, gridItemElement);
	}
	
	
	
}