package steps;

import java.io.IOException;

import core.GenerateReports;
import cucumber.api.java.After;
import page.BasePage;

public class BaseTest extends BasePage {
	@After
	public void fechar() throws IOException {
		GenerateReports.saveLoggersReport();
		quitBrowser();
	}

}
