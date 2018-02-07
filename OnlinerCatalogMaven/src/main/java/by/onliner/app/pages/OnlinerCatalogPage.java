package by.onliner.app.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import by.onliner.app.ui.OnlinerCatalogPageUi;


public class OnlinerCatalogPage
{
	private static final Logger log = Logger.getLogger(OnlinerCatalogPage.class);
	private WebDriver driver;
	private WebDriverWait wait;
	
	public static final By beautyAndSportLink = By.xpath("//*[@id='container']//span[contains(text(), 'Красота')]");
	public static final By hobbyMenuItemLink = By.xpath("//*[@id='container']//div[contains(text(), 'Хобби')]");
	public static final By radioControlAirModelsLink = By.xpath("//div[@id='container']//span[contains(text(), 'Радиоуправляемые авиамодели')]");
	
	
	private final OnlinerCatalogPageUi ui = new OnlinerCatalogPageUi();
	
	public OnlinerCatalogPage(WebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	
	public OnlinerCatalogPage selectCatalogTopMenuItem(String topMenuItem)
	{
		log.info("[Step] select top menu item from Onliner Catalog");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(String.format(ui.topMenuItemPrototype, topMenuItem))))).click();
		return this;
	}
	
	public OnlinerCatalogPage selectLeftMenuItem(String leftMenuItem)
	{
		log.info("[Step] select left side menu item from Onliner Catalog");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(String.format(ui.subMenuItemPrototype, leftMenuItem))))).click();
		return this;
	}
	
	public QuadrokoptersPage selectCategoryFromGrid(String itemFromTheGrid)
	{
		log.info("[Step] select category from Onliner Catalog grid");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(String.format(ui.gridItemPrototype, itemFromTheGrid))))).click();
		return new QuadrokoptersPage(driver, wait);
	}
	
	
}