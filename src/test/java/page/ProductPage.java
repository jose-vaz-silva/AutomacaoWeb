package page;

import static constants.TimeOut.MIN_SECONDS;

import com.relevantcodes.extentreports.LogStatus;

import core.GenerateReports;
import maps.ProductsMaps;

public class ProductPage extends BasePage{
	private ProductsMaps productsMaps = new ProductsMaps();

	public void addProductToCart() throws Throwable {
	   waitElement(productsMaps.buy, MIN_SECONDS);
	   waitElementToBeClicable(productsMaps.buy, MIN_SECONDS);
	   scrollDynamic(productsMaps.buy);
	   GenerateReports.takeScreenshotReport(LogStatus.INFO, "Comprar o produto");
	   clickJs(productsMaps.buy);
	}
}
