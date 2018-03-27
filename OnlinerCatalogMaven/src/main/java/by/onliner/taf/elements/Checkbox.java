package by.onliner.taf.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Checkbox extends Element
{
	public Checkbox(String locator)
	{
		super(locator);
	}
	
	
	public Checkbox(String locatorXpath, String parameter) 
	{
		super(String.format(locatorXpath, parameter));
	}
	
	
	public Checkbox(String locatorXpath, Integer parameter) 
	{
		super(String.format(locatorXpath, parameter));
	}
	
	
	public void tickCheckbox (String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	public Checkbox waitToBeClickable()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
		return this;
	}
	
	// 
	
	
}
