package by.onliner.app.ui;

import org.openqa.selenium.By;

public class ProductDetailsPageUi {
	public final String xpathVerifyInitialParametersAreCorrectPrototype = "//table[@class='product-specs__table']//tr[%s]/td[2]/span";
	public final By quadroTypeValue = By.xpath(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "2"));
	public final By materialTypeValue = By.xpath(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "3"));
	public final By engineTypeValue = By.xpath(String.format(xpathVerifyInitialParametersAreCorrectPrototype, "5"));
	public final By cartLink = By.xpath("//a[contains(text(), 'В корзину')]");
	public final By itemInCartLink = By.xpath("//ul[@id='b-top-navigation-cart']//span");
}
