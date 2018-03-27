package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.CompareItemsPageUi;
import by.onliner.taf.BaseTest;

public class CompareItemsPage extends BaseTest
{

	private static final Logger log = Logger.getLogger(CompareItemsPage.class);

	private final CompareItemsPageUi ui = new CompareItemsPageUi();


	public ProductDetailsPage openProductDetails(int productIndex) {
		log.info("[Step] Select an item in the comparison table");
		Actions clicker = new Actions(driver);
//		WebElement gridItem = wait.until(ExpectedConditions.elementToBeClickable(
//				driver.findElement(By.xpath(String.format(ui.comparisonTableItemPrototype, elementPosition)))));
		WebElement gridItem = ui.getComparisonTableItemXpath(productIndex).waitToBeClickable().getWebElement(); //TODO to create method MoveToElement
		clicker.moveToElement(gridItem, 30, 30).click().perform();
		return new ProductDetailsPage(driver, wait);
	}



}
