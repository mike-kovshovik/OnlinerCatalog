package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.CompareItemsPageUi;

public class CompareItemsPage {

	private static final Logger log = Logger.getLogger(CompareItemsPage.class);

	private final CompareItemsPageUi ui = new CompareItemsPageUi();

	private WebDriver driver;
	private WebDriverWait wait;

	public CompareItemsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public ProductDetailsPage clickSelectedItemInComparisonTable(String elementPosition) {
		log.info("[Step] Select an item in the comparison table");
		Actions clicker = new Actions(driver);
		WebElement gridItem = wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath(String.format(ui.comparisonTableItemPrototype, elementPosition)))));
		clicker.moveToElement(gridItem, 30, 30).click().perform();
		return new ProductDetailsPage(driver, wait);
	}

	public void testSergei(String value) {
		// driver.findElement(ui.thirdItemInComparisonTable).click();
		// ui.thirdItemInComparisonTable.click();
		// ui.textField.click();
		// ui.textField.setValue(value);
		// ui.textField.waitToBeClickable().click();
	}

}
