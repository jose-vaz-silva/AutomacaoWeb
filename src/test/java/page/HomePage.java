package page;

import static constants.TimeOut.*;

import org.openqa.selenium.Keys;

import maps.HomeMaps;

public class HomePage extends BasePage{
	private HomeMaps homeMaps = new HomeMaps();
	
	public void access_portal(String url) {
	 navigate(url);
	}
	
	public void searchProduct(String product) {
		waitElement(homeMaps.searchProduct, MIN_SECONDS);
		sendKeys(getWebElement(homeMaps.searchProduct), product);
		sendKey(getWebElement(homeMaps.searchProduct), Keys.ENTER);
		waitElement(homeMaps.searchProduct, MIN_SECONDS);
	}
	
	public String getProductSearched() {
		return getTextElement(homeMaps.productSearched);
	}
	
	
	public void accessProduct(String product) throws Throwable {
		waitElement(homeMaps.productInSearchList(product), MIN_SECONDS);
		click(getWebElement(homeMaps.productInSearchList(product)));
		
	}
}
