package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Link;

public class ProductDetailsPageUi
{
	public final Element initialParametersPrototypeXpath = new Element("//table[@class='product-specs__table']//tr[%s]/td[2]/span");
	public final Link cartLink = new Link("//a[contains(text(), 'В корзину')]");
	public final Link itemInCartLink = new Link("//ul[@id='b-top-navigation-cart']//span");
		// TODO to create parametersLocatorPrototype for the above 3 fields - DONE
	 
	
}
