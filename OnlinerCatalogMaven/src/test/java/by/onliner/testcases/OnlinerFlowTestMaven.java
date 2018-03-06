package by.onliner.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.onliner.app.pages.OnlinerHomePage;
import by.onliner.taf.elements.Element;
import by.onliner.test.data.TestData;

public class OnlinerFlowTestMaven {

	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		Element.driver = driver;
		Element.wait = wait;
		driver.manage().window().fullscreen();
		driver.navigate().to("http://onliner.by");
	}

	@Test
	public void e2eOnlinerCatalogTest() throws InterruptedException {
		// 2. Navigate to catalog
		OnlinerHomePage onlinerLandingPage = new OnlinerHomePage(driver, wait);
		onlinerLandingPage.selectMainMenuItem(TestData.catalog).selectCatalogTopMenuItem(TestData.beauty).selectLeftMenuItem(TestData.hobby)
				.selectCategoryFromGrid(TestData.radioModels)
				.verifyIsPageHeaderEqualTo(TestData.radioModels).setParameter(TestData.quadrocopter)
				.setParameter(TestData.plastic).setParameter(TestData.metal).specifyRangeOfAction(TestData.rangeOfAction100).clickAdditionalParameters()
				.setParameter(TestData.beskollectornyi).verifyNumberOfFoundItemsIsCorrect(String.format(TestData.numberOfFoundItems, 28))
				.changeSortOrderCheapGoFirst().verifyIsPriceSortedDesc()
				.selectItemsToCompare(TestData.indexesOfCheckboxes).checkNumberOfItemsToCompare("4 товара в сравнении")
				.clickOnNumberOfItemsToCompare().clickSelectedItemInComparisonTable("3")
				.verifyInitiallySelectedParametersAreCorrect(TestData.initiallySelectedParameters).addToCart()
				.verifyNumerOfItemsInTheCartIsCorrect().clickNumberOfItemsInCartLink().addPlusOneItem()
				.verifyTotalNumberOfItemsAndPrice().placeOrder().assertLoginToSitePopupAppeared();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
