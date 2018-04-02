package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.CompareItemsPageUi;
import by.onliner.taf.BaseTest;
import by.onliner.taf.elements.Element;

public class CompareItemsPage extends BaseTest
{
	private static final Logger log = Logger.getLogger(CompareItemsPage.class);
	private final CompareItemsPageUi ui = new CompareItemsPageUi();

	public ProductDetailsPage openProductDetails(int productIndex) {
		log.info("[Step] Select an item in the comparison table");
		ui.comparisonTableItemPrototype.setLocatorVariable(productIndex).moveToElement().click();
		return new ProductDetailsPage(driver, wait);
	}


	
	
	
}
