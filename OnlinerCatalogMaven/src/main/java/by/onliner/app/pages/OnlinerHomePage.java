package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import by.onliner.app.ui.OnlinerHomePageUi;


public class OnlinerHomePage
{
	private static final Logger log = Logger.getLogger(OnlinerHomePage.class);
	private final OnlinerHomePageUi ui = new OnlinerHomePageUi();
		

	public OnlinerCatalogPage selectMainMenuItem(String menuItem)
	{
		log.info("[Step] select Main Menu Item");
		ui.mainMenuNavigationPrototype.setLocatorVariable(menuItem).waitToBeClickable().click();
		return new OnlinerCatalogPage();
	}

}
