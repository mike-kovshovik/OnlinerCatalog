package by.onliner.taf.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	public String getLocator()
	{
		return locator;
	}

	public void setLocator(String locator)
	{
		this.locator = locator;
	}
	
	
	public String getText() 
	{
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator)))).getText();
		
	}
	
	public Element clear () 
	{
		driver.findElement(By.xpath(locator)).clear();
		return this;
	}
	
	public Element waitToBeClickable ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		return this;
	}
	
	public void click ()
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public Element waitPresenсeOfElement()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		return this;
	}


	
}
