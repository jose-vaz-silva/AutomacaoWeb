package steps;

import org.junit.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.GenerateReports;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.ProductCartPage;
import page.ProductPage;

public class CT01 {
	private HomePage homePage = new HomePage();
	private ProductPage productPage = new ProductPage();
	private ProductCartPage productCartPage = new ProductCartPage();
	private GenerateReports reports = new GenerateReports("Comprar produto");

	@Test
	@Given("^que ao acessar o portal \"([^\"]*)\"$")
	public void que_ao_acessar_o_sistema(String url) throws Throwable {
		homePage.access_portal(url);
		GenerateReports.takeScreenshotReport(LogStatus.PASS, "Acessar portal");
	}

	@Test
	@When("^pesquisar o produto \"([^\"]*)\"$")
	public void pesquisar_o_produto(String produdct) throws Throwable {
		homePage.searchProduct(produdct);
		if(produdct.toLowerCase().equals(homePage.getProductSearched())) {
			GenerateReports.takeScreenshotReport(LogStatus.PASS, "Pesquisar produto");
		}else {
			GenerateReports.takeScreenshotReport(LogStatus.FAIL, "Pesquisar produto");
			throw new Exception("Produto diferente do esperado.");
		}
		
	}

	@Test
	@And("^acessar o produto \"([^\"]*)\"$")
	public void acessar_o_produto(String product) throws Throwable {
		homePage.accessProduct(product);
		GenerateReports.takeScreenshotReport(LogStatus.PASS, "Acessar produto");
	}

	@Test
	@And("^clicar em comprar$")
	public void clicar_em_comprar() throws Throwable {
		productPage.addProductToCart();
		GenerateReports.logger(LogStatus.PASS, "Comprar");
	}

	@Test
	@Then("^produto \"([^\\\"]*)\" adicionado ao carrinho$")
	public void produto_adicionado_ao_carrinho(String product) throws Throwable {
		int productQauntityInCart = Integer.parseInt(productCartPage.getProductInCart(product));
		if(productQauntityInCart > 0) {
			GenerateReports.takeScreenshotReport(LogStatus.PASS, "Verificar produto no carrinho");
		}else {
			GenerateReports.takeScreenshotReport(LogStatus.FAIL, "Verificar produto no carrinho");
			throw new Exception("Produto não foi adicionado no carrinho");
		}
		
	}

}
