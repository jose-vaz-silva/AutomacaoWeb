package maps;

import org.openqa.selenium.By;

import page.BasePage;

public class HomeMaps extends BasePage{
	
	public By searchProduct = By.xpath("//form[contains(@action,'busca')]//input");
	public By productSearched =  By.xpath("//div[@data-tracker=\"searchquery-main\"]//h1");
	public By productInSearchList(String product) {
	return  By.xpath("(//h2[contains(text(),'"+product+"')]/../../../../..//a)[1]");
	}
	
}
