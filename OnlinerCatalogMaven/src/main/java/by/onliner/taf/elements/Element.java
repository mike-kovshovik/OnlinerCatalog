package by.onliner.taf.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.pages.CompareItemsPage;

public class Element
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	protected String locator;
	
	public Element(String locator)
	{
		this.setLocator(locator);
	}


	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
	
	public void click () {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public Element waitToBeClickable()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		return this;
	}
	
	public void waitAndClick () {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator)))).click();
	}
	
	
}
