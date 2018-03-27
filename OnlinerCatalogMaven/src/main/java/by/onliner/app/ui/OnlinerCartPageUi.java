package by.onliner.app.ui;

import org.openqa.selenium.By;

import by.onliner.taf.elements.Element;

public class OnlinerCartPageUi
{

	public final By plusIcon = By.cssSelector(
			".button-style.button-style_auxiliary.button-style_small.cart-product-add-box__button.cart-product-add-box__button_add");
	
	public final By priceForOneItem = By
			.cssSelector(".cart-product__price-value.cart-product__price-value_primary>span");
	
	
	public final Element totalPrice = new Element("//div[@id='cart-main-container']//span/span[3]");
	public final Element totalNumberOfItemsLabel = new Element("//div[@id='cart-main-container']/div[3]//span/span");
	public final Element placeOrderLink = new Element("//a[contains(text(),'Оформить весь заказ')]");
	public final Element enterSitePopup = new Element("//div[@class='cart-popup__title' and contains(text(),'Войдите')]");
	
	/*public final By totalPrice = By.xpath("//div[@id='cart-main-container']//span/span[3]");
	public final By totalNumberOfItemsLabel = By.xpath("//div[@id='cart-main-container']/div[3]//span/span");
	public final By placeOrderLink = By.xpath("//a[contains(text(),'Оформить весь заказ')]");
	public final By enterSitePopup = By.xpath("//div[@class='cart-popup__title' and contains(text(),'Войдите')]");*/
	
	
	
	
}
