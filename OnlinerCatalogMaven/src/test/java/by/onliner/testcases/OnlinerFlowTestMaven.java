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
	
	Browser browser = new Browser();
	//public static WebDriver driver;
	//public static WebDriverWait wait;

	@BeforeTest
	public void beforeTest() {
		BaseTest.driver = new ChromeDriver();
		BaseTest.wait = new WebDriverWait(BaseTest.driver, 15);
		//driver = new ChromeDriver();
		//wait = new WebDriverWait(driver, 15);
		//Element.driver = driver;
		//Element.wait = wait;
		browser.goToUrl(TestData.onlinerHomePage).maximizeWindow();
		//BaseTest.driver.manage().window().fullscreen();
		//BaseTest.driver.navigate().to("http://onliner.by");
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
			.setParameter(TestData.quadrocopter)
			.setParameter(TestData.plastic)
			.setParameter(TestData.metal)
			.specifyRangeOfAction(TestData.rangeOfAction100)
			.clickAdditionalParameters()
			.setParameter(TestData.beskollectornyi)
			.verifyNumberOfFoundItemsIsCorrect(String.format(TestData.numberOfFoundItems, 28))
			.changeSortOrderCheapGoFirst()
			.verifyIsPriceSortedDesc()
			.selectItemsToCompare(TestData.indexesOfCheckboxes)
			.checkNumberOfItemsToCompare("4 товара в сравнении")
			.clickOnNumberOfItemsToCompare()
			.clickSelectedItemInComparisonTable("3")
			.verifyInitiallySelectedParametersAreCorrect(TestData.initiallySelectedParameters)
			.addToCart()
			.verifyNumerOfItemsInTheCartIsCorrect()
			.clickNumberOfItemsInCartLink()
			.addPlusOneItem()
			.verifyTotalNumberOfItemsAndPrice()
			.placeOrder()
			.assertLoginToSitePopupAppeared();
	}

	@AfterTest
	public void afterTest() {
		browser.quit();
		//BaseTest.driver.quit();
	}

}
