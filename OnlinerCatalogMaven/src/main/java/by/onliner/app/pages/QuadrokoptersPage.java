package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.QuadrokoptersPageUi;
import by.onliner.taf.utils.AdditionalConditions;

public class QuadrokoptersPage {

	private static final Logger log = Logger.getLogger(QuadrokoptersPage.class);

	private WebDriver driver;
	private WebDriverWait wait;

	QuadrokoptersPageUi ui = new QuadrokoptersPageUi();

	public QuadrokoptersPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public QuadrokoptersPage verifyIsPageHeaderEqualTo(String headerText) {
		log.info("[Step] verify page header");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(ui.radiocontrolAirModelHeader));
		//String actualHeader = driver.findElement(ui.radiocontrolAirModelHeader).getText();
		//Assert.assertEquals(actualHeader, headerText);
		Assert.assertEquals(ui.radiocontrolAirModelHeader.getText(), headerText);
		return this;
	}

	public QuadrokoptersPage setParameter(String parameterName) throws InterruptedException {
		log.info(String.format("[Step] set parameter: %s", parameterName));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.findElement(By.xpath(String.format(ui.xpathForQuadroParameters, parameterName)));
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0," + driver
				.findElement(By.xpath(String.format(ui.xpathForQuadroParameters, parameterName))).getLocation().y
				+ ")");
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath(String.format(ui.xpathForQuadroParameters, parameterName))))).click();
		Thread.sleep(2000);
		return this;
	}

	public QuadrokoptersPage specifyRangeOfAction(String range) throws InterruptedException {
		log.info("[Step] specify range of action");
		Thread.sleep(2000);
		ui.rangeOfAction.waitToBeClickable().setValue(range);
		return this;
	}

	public QuadrokoptersPage clickAdditionalParameters() {
		log.info("[Step] click additional parameters");
		ui.additionalParametersLink.waitToBeClickable().click();;
		//wait.until(ExpectedConditions.elementToBeClickable(ui.additionalParametersLink)).click();
		return this;
	}

	public QuadrokoptersPage verifyNumberOfFoundItemsIsCorrect(String numberOfTheFoundItems) {
		log.info("[Step] verify number of found items is correct");
		ui.numberOfItemsFound.waitPresenсeOfElement();
		String actualNumberOfFoundItems = ui.numberOfItemsFound.getText();
		Assert.assertEquals(actualNumberOfFoundItems, numberOfTheFoundItems);
		return this;
	}

	public QuadrokoptersPage changeSortOrderCheapGoFirst() {
		log.info("[Step] change sort order - cheap should go first");
		ui.sortOrderIcon.waitPresenсeOfElement().click();
		ui.sortOrderDropDowOptionCheap.waitToBeClickable().click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(ui.sortOrderIcon)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(ui.sortOrderDropDowOptionCheap)).click();
		return this;
	}

	public QuadrokoptersPage verifyIsPriceSortedDesc() {
		log.info("[Step] verify the price is sorted from high to low");
		ui.firstPrice.waitToBeClickable();
		//wait.until(ExpectedConditions.elementToBeClickable(ui.firstPrice));
		String arrayFirstProduct[] = ui.firstPrice.getText().split(" ");
		//String arrayFirstProduct[] = driver.findElement(ui.firstPrice).getText().split(" ");
		double value_min = Double.parseDouble(arrayFirstProduct[0].replace(",", "."));
		String arraySecondProduct[] = ui.secondPrice.getText().split(" ");
		//String arraySecondProduct[] = driver.findElement(ui.secondPrice).getText().split(" ");
		double value_max = Double.parseDouble(arraySecondProduct[0].replace(",", "."));

		Assert.assertTrue(value_min <= value_max);
		return this;
	}

	public QuadrokoptersPage selectItemsToCompare(int[] itemIndexes) throws InterruptedException {
		Thread.sleep(2000);
		for (int i = 0; i < itemIndexes.length; i++) {
			log.info(String.format("[Step] select items to compare. Index number: %s", itemIndexes[i]));
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath(String.format(ui.xpathListOfCheckboxesToCompare, itemIndexes[i]))))
					.click();
		}
		return this;
	}

	public QuadrokoptersPage checkNumberOfItemsToCompare(String expectedText) {
		log.info("[Step] verify Number of Items to Compare text");
		ui.numberOfItemsToCompare.waitToBeClickable();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(ui.numberOfItemsToCompare));
		//Assert.assertEquals(expectedText, driver.findElement(ui.numberOfItemsToCompare).getText());
		Assert.assertEquals(expectedText, ui.numberOfItemsToCompare.getText());
		return this;
	}

	public CompareItemsPage clickOnNumberOfItemsToCompare() {
		log.info("[Step] click on number of items to compare link");
		ui.numberOfItemsToCompare.waitToBeClickable().click();
		//wait.until(ExpectedConditions.elementToBeClickable(ui.numberOfItemsToCompare)).click();
		return new CompareItemsPage(driver, wait);
	}


}
