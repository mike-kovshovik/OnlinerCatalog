package by.onliner.app.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import by.onliner.app.ui.OnlinerCatalogPageUi;


public class OnlinerCatalogPage
{
	private static final Logger log = Logger.getLogger(OnlinerCatalogPage.class);
	private WebDriver driver;
	private WebDriverWait wait;
	
	private final OnlinerCatalogPageUi ui = new OnlinerCatalogPageUi();
	
	public OnlinerCatalogPage(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	
	
	public OnlinerCatalogPage selectCatalogTopMenuItem(String topMenuItem)
	{
		log.info("[Step] select top menu item from Onliner Catalog");
		ui.topMenuItemPrototype.setLocatorVariable(topMenuItem).waitToBeClickable().click();
		return this;
	}
	
	
	public OnlinerCatalogPage selectLeftMenuItem(String leftMenuItem)
	{
		log.info("[Step] select left side menu item from Onliner Catalog");
		ui.subMenuItemPrototype.setLocatorVariable(leftMenuItem).waitToBeClickable().click();
		return this;
	}
	

	public QuadrokoptersPage selectCategoryFromGrid(String itemFromTheGrid)
	{
		log.info("[Step] select category from Onliner Catalog grid");
		ui.gridItemPrototype.setLocatorVariable(itemFromTheGrid).waitToBeClickable().click();
		return new QuadrokoptersPage(driver, wait);
	}


	
}