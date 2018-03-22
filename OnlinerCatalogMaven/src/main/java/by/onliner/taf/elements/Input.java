package by.onliner.taf.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Input extends Element
{
	
	public Input(String locator)
	{
		super(locator);
	}
	

	public void setValue (String value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	
	public Input waitToBeClickable ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		return this;
	}
	
	public Input clear () 
	{
		driver.findElement(By.xpath(locator)).clear();
		return this;
	}
	

	
}
