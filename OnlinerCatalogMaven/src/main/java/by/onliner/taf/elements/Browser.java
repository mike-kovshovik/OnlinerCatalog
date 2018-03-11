package by.onliner.taf.elements;

import by.onliner.taf.BaseTest;

public class Browser extends BaseTest
{
	public Browser maximizeWindow ()
	{
		driver.manage().window().fullscreen();
		return this;
	}
	
	
	public Browser goToUrl (String url)
	{
		driver.navigate().to(url);
		return this;
	}
	
	
	public Browser quit ()
	{
		driver.quit();
		return this;
	}

}
