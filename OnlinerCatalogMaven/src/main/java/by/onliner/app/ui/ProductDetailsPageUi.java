package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Link;

public class ProductDetailsPageUi
{
	public final String xpathVerifyInitialParametersAreCorrectPrototype = "//table[@class='product-specs__table']//tr[%s]/td[2]/span";
	public final Element quadroTypeValue = new Element(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "2"));
	public final Element materialTypeValue = new Element(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "3"));
	public final Element engineTypeValue = new Element(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "5"));
		// TODO to create parametersLocatorPrototype for the above 3 fields
	 
	
	public final Link cartLink = new Link("//a[contains(text(), 'В корзину')]");
	public final Link itemInCartLink = new Link("//ul[@id='b-top-navigation-cart']//span");
}
