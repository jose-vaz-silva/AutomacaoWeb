package scenariosRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import page.BasePage;

public class testeSeleniumGrid extends BasePage{
	
	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		System.out.println("http://"+getLocalhost()+":4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
		driver.get("https://www.google.com.br/");
		System.out.println("Título da página: "+driver.getTitle());
		driver.quit();
	}

}
