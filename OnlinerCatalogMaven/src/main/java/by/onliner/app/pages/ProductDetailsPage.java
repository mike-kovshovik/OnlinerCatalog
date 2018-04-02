package by.onliner.app.pages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

import by.onliner.app.ui.ProductDetailsPageUi;

public class ProductDetailsPage
{
	WebDriver driver;
	WebDriverWait wait;

	ProductDetailsPageUi ui = new ProductDetailsPageUi();
	private static final Logger log = Logger.getLogger(ProductDetailsPageUi.class);
	
	public ProductDetailsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public ProductDetailsPage verifyInitiallySelectedParametersAreCorrect(String[] listOfExpectedValues) {
		log.info("[Step] verify initially selected parameters are correct");
		ui.quadroTypeValue.waitToBePresent();
		Set<String> setOfExpectedValues = new HashSet<String>(Arrays.asList(listOfExpectedValues));

		Assert.assertTrue(setOfExpectedValues.contains(ui.quadroTypeValue.getText()));
		Assert.assertTrue(setOfExpectedValues.contains(ui.materialTypeValue.getText()));
		Assert.assertTrue(setOfExpectedValues.contains(ui.engineTypeValue.getText()));
		return this;
	}

	public ProductDetailsPage addToCart() 
	{
		log.info("[Step] add the item into the cart");
		ui.cartLink.waitToBeClickable().click();
		//wait.until(ExpectedConditions.elementToBeClickable(ui.cartLink)).click();
		return this;
	}

	public ProductDetailsPage verifyNumerOfItemsInTheCartIsCorrect() 
	{
		log.info("[Step] verify number items in the cart is correct");
		ui.itemInCartLink.waitTextToBePresentInElement("1 товар");
		Assert.assertEquals("1 товар", ui.itemInCartLink.getText());
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(ui.itemInCartLink, "1 товар"));
		//Assert.assertEquals("1 товар", driver.findElement(ui.itemInCartLink).getText());
		return this;
	}

	public OnlinerCartPage clickNumberOfItemsInCartLink()
	{
		log.info("[Step] click number of items in the cart link");
		ui.itemInCartLink.waitToBeClickable().click();
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(ui.itemInCartLink, "1 товар"));
		//driver.findElement(ui.itemInCartLink).click();
		return new OnlinerCartPage(driver, wait);
	}
}
