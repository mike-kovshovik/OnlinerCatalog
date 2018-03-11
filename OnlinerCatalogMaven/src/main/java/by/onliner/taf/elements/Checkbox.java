package by.onliner.taf.elements;

import org.openqa.selenium.By;

public class Checkbox extends Element
{
	public Checkbox(String locator)
	{
		super(locator);
	}
	
	public void tickCheckbox (String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	
}
