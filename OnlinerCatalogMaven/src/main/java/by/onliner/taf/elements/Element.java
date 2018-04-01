package by.onliner.taf.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.pages.CompareItemsPage;
import by.onliner.taf.BaseTest;

public class Element extends BaseTest
{
	//public static WebDriver driver = BaseTest.driver;
	//public static WebDriverWait wait = BaseTest.wait;
	protected String locator;
	
	public Element(String locator)
	{
		this.setLocator(locator);
	}
	
/*	public Element(String localorPrototype, String parameter)
	{
		this.setLocator(String.format(localorPrototype, parameter));
	}*/
	

	public String getLocator()
	{
		return locator;
	}

	public void setLocator(String locator)
	{
		this.locator = locator;
	}
	
	
	public Element waitToBeClickable ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		return this;
	}
	
	
	public Element waitToBeVisible() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		return this;
	}
	
	
	public Element waitToBePresent()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		return this;
	}
	
	
	public void click ()
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	public String getText() 
	{
		return driver.findElement(By.xpath(locator)).getText();
	}
	
	
	public WebElement getWebElement()
	{
		return driver.findElement(By.xpath(locator));
	}
	
	public Element setLocatorVariable (Object variable) 
	{
		return new Element(String.format(locator, variable));
	}
	
	public static void scrollToElement(Element element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + element.getWebElement().getLocation().y + ")");
	}
	
	public static void moveToElement(WebElement element, int xOffSet, int yOffSet) 
	{
		Actions clicker = new Actions(driver);
		clicker.moveToElement(element, xOffSet, yOffSet).click().perform();
	}
	
	
}
