package by.onliner.app.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.onliner.app.ui.QuadrokoptersPageUi;
import by.onliner.taf.elements.Page;
import by.onliner.test.data.TestData;

public class QuadrokoptersPage
{
	private static final Logger log = Logger.getLogger(QuadrokoptersPage.class);
	QuadrokoptersPageUi ui = new QuadrokoptersPageUi();

	public QuadrokoptersPage verifyPageTitleEqualsTo(String pageTitle)
	{
		log.info("[Step] verify page title");
		Assert.assertEquals(Page.getPageTitle(), pageTitle);
		return this;
	}

	
	public QuadrokoptersPage selectFilterParameter(String parameterName)
	{
		log.info(String.format("[Step] set parameter: %s", parameterName));
		ui.xpathForQuadroParameters.setLocatorVariable(parameterName).scrollToElement().waitToBeClickable().click();
		return this;
	}

	public QuadrokoptersPage specifyRangeOfAction(String range)
	{
		log.info("[Step] specify range of action");
		ui.rangeOfAction.waitToBeClickable().setValue(range);
		return this;
	}

	public QuadrokoptersPage openAdditionalParameters()
	{
		log.info("[Step] click additional parameters");
		ui.additionalParametersLink.waitToBeClickable().click();
		return this;
	}

	public QuadrokoptersPage verifyNumberOfFoundItemsIsCorrect(int numberOfTheFoundItems) {
		log.info("[Step] verify number of found items is correct");
		String actualNumberOfFoundItems = ui.foundItemsCountRecordPrototype.setLocatorVariable(numberOfTheFoundItems).waitToBePresent().getText();
		Assert.assertEquals(actualNumberOfFoundItems, String.format(TestData.numberOfFoundItemsText, numberOfTheFoundItems));
		return this;
	}

	public QuadrokoptersPage changeSortOrder() {
		log.info("[Step] change sort order - cheap should go first");
		ui.sortOrderIcon.waitToBePresent().click();
		ui.sortOrderDropDowOptionCheap.waitToBeClickable().click();
		return this;
	}

	public QuadrokoptersPage verifyIsPriceSortedDesc() {
		log.info("[Step] verify the price is sorted from high to low");
		ui.firstPrice.waitToBeVisible();
		
		String arrayFirstProduct[] = ui.firstPrice.getText().split(" ");
		double value_min = Double.parseDouble(arrayFirstProduct[0].replace(",", "."));
		
		String arraySecondProduct[] = ui.secondPrice.getText().split(" ");
		double value_max = Double.parseDouble(arraySecondProduct[0].replace(",", "."));
		
		Assert.assertTrue(value_min <= value_max);
		return this;
	}

	public QuadrokoptersPage selectItemsToCompare(int[] itemIndexes) throws InterruptedException
	{

		for (int i = 0; i < itemIndexes.length; i++) {
			log.info(String.format("[Step] select items to compare. Index number: %s", itemIndexes[i]));
			Thread.sleep(2000);
			ui.xpathListOfCheckboxesToCompare.setLocatorVariable(itemIndexes[i]).waitToBeClickable().click();
		}
		return this;
	}

	public QuadrokoptersPage checkNumberOfItemsToCompare(int expectedNumberOfItems)
	{
		log.info("[Step] verify Number of Items to Compare text");
		ui.numberOfItemsToCompare.waitToBeClickable();
		Assert.assertEquals(String.format(TestData.goodsToCompareText, expectedNumberOfItems), ui.numberOfItemsToCompare.getText());
		return this;
	}

	public CompareItemsPage clickOnNumberOfItemsToCompare() {
		log.info("[Step] click on number of items to compare link");
		ui.numberOfItemsToCompare.waitToBeClickable().click();
		return new CompareItemsPage();
	}




}
