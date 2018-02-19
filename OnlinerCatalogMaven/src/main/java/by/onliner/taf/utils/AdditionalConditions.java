package by.onliner.taf.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class AdditionalConditions {
	
		public ExpectedCondition<Boolean> jQueryAJAXCallsHaveCompleted() {
			return new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver driver) {
					return (Boolean) ((JavascriptExecutor) driver)
							.executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
				}
			};
		}
	
}
