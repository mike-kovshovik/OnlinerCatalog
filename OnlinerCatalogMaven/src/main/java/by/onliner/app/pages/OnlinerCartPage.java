package by.onliner.app.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.OnlinerCartPageUi;

import org.apache.log4j.Logger;
import org.junit.Assert;

public class OnlinerCartPage {
	
	private static final Logger log = Logger.getLogger(OnlinerCartPage.class);
	
	private final OnlinerCartPageUi ui = new OnlinerCartPageUi();
	
	private WebDriver driver;
	private WebDriverWait wait;


	public OnlinerCartPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	

	public OnlinerCartPage addPlusOneItem() {
		log.info("[Step] add one more item (press '+' icon)");
		Actions act = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart-product-add-box")));
		WebElement cartDiv = driver.findElement(By.cssSelector(".cart-product-add-box"));
		act.moveToElement(cartDiv).perform();
		driver.findElement(ui.plusIcon).click();
		return this;
	}
	

	public OnlinerCartPage verifyTotalNumberOfItemsAndPrice()
	{
		log.info("[Step] verification of the total number of the items");
		String itemPrice[] = driver.findElement(ui.priceForOneItem).getText().split(" ");
		double itemPriceFormatted = Double.parseDouble(itemPrice[0].replace(",", "."));
		
		String totalPriceOfTwoItems[] = driver.findElement(ui.totalPrice).getText().split(" ");
		double totalPriceFormatted = Double.parseDouble(totalPriceOfTwoItems[0].replace(",", "."));
		
		double numberOfItems = Double.parseDouble(driver.findElement(ui.totalNumberOfItemsLabel).getText());

		Assert.assertTrue(totalPriceFormatted == itemPriceFormatted * numberOfItems);
		return this;
	}
	

	public OnlinerCartPage placeOrder() {
		log.info("[Step] press Place order");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ui.placeOrderLink));
		driver.findElement(ui.placeOrderLink).click();
		return this;
	}
	

	public void assertLoginToSitePopupAppeared() {
		log.info("[Step] verify whether the log in pop up shows up");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ui.enterSitePopup));
		Assert.assertTrue(driver.findElement(ui.enterSitePopup).getText().length() > 0);
	}

}
