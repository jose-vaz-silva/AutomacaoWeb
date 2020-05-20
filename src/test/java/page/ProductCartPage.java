package page;

import maps.productCartMaps;
import static constants.TimeOut.*;

public class ProductCartPage extends BasePage{
	private productCartMaps productCartMaps = new productCartMaps();
	
	public String getProductInCart(String product) {
		waitElement(productCartMaps.productInCart(product), MIN_SECONDS);
		return getOptionSelected(productCartMaps.productInCart(product)).trim();
	}
}
