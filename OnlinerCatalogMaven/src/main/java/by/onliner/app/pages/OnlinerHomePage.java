package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import by.onliner.app.ui.OnlinerHomePageUi;


public class OnlinerHomePage
{
	private static final Logger log = Logger.getLogger(OnlinerHomePage.class);
	private final OnlinerHomePageUi ui = new OnlinerHomePageUi();
		
	private WebDriver driver;
	private WebDriverWait wait;

	public OnlinerHomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	

	public OnlinerCatalogPage selectMainMenuItem(String menuItem)
	{
		log.info("[Step] select Main Menu Item");
		ui.mainMenuNavigationPrototype.setLocatorVariable(menuItem).waitToBeClickable().click();
		return new OnlinerCatalogPage(driver, wait);
	}

}
