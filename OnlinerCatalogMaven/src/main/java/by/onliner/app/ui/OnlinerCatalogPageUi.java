package by.onliner.app.ui;

import by.onliner.taf.elements.Element;

public class OnlinerCatalogPageUi
{	
	//public final String topMenuItemPrototype = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]";
	//public final String subMenuItemPrototype = "//div[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
	//public final String gridItemPrototype = "//span[@class='catalog-navigation-list__dropdown-title' and contains(text(), '%s')]";
	
	public final Element topMenuItemPrototype = new Element("//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(), '%s')]");
	public final Element subMenuItemPrototype = new Element("//div[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]");
	public final Element gridItemPrototype = new Element("//span[@class='catalog-navigation-list__dropdown-title' and contains(text(), '%s')]");
	
	
}