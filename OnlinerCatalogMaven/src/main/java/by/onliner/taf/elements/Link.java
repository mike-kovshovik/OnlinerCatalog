package by.onliner.taf.elements;

import org.openqa.selenium.By;

public class Link extends Element
{
	public Link(String locator) 
	{
		super(locator);
	}
	
	public void click() 
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public Link waitToBeClickable()
	{
		driver.findElement(By.xpath(locator));
		return this;
	}
	
}
