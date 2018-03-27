package by.onliner.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.onliner.app.pages.OnlinerHomePage;
import by.onliner.taf.BaseTest;
import by.onliner.taf.elements.Browser;
import by.onliner.test.data.TestData;

public class OnlinerFlowTestMaven {
	
	private Browser browser;
	
	@BeforeTest
	public void beforeTest()
	{
		BaseTest.driver = new ChromeDriver();
		BaseTest.wait = new WebDriverWait(BaseTest.driver, 15);
		Browser browser = new Browser();
		browser.goToUrl(TestData.onlinerHomePage).maximizeWindow();
	}

	@Test
	public void e2eOnlinerCatalogTest() throws InterruptedException {
		// 2. Navigate to catalog
		OnlinerHomePage onlinerHomePage = new OnlinerHomePage(BaseTest.driver, BaseTest.wait);
		onlinerHomePage
			.selectMainMenuItem(TestData.catalog)
			.selectCatalogTopMenuItem(TestData.beautyAndSport)
			.selectLeftMenuItem(TestData.hobby)
			.selectCategoryFromGrid(TestData.radioModels)
			.verifyPageTitleEqualsTo(TestData.pageTitle) // created a class for common page methods (e.g. verify page title)
			.selectFilterParameter(TestData.quadrocopter)
			.selectFilterParameter(TestData.plastic)
			.selectFilterParameter(TestData.metal)
			.specifyRangeOfAction(TestData.rangeOfAction100)
			.openAdditionalParameters()
			.selectFilterParameter(TestData.beskollectornyi)
			.verifyNumberOfFoundItemsIsCorrect(TestData.numberOfFoundItems)
			.changeSortOrder()
			.verifyIsPriceSortedDesc()
			.selectItemsToCompare(TestData.indexesOfCheckboxes)
			.checkNumberOfItemsToCompare("4 товара в сравнении") //TODO move to TestData (4 is int)
			.clickOnNumberOfItemsToCompare()
			.openProductDetails(3) //TODO move to TestData
			.verifyInitiallySelectedParametersAreCorrect(TestData.initiallySelectedParameters)
			.addToCart()
			.verifyNumerOfItemsInTheCartIsCorrect()
			.clickNumberOfItemsInCartLink()
			.addPlusOneItem()
			.verifyTotalNumberOfItemsAndPrice()
			.placeOrder()
			.verifyLoginPopupDisplayed();
	}

	@AfterTest
	public void afterTest() {
		browser.quit();
	}

}
