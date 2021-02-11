package scenariosRunner;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testeHeadless {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver"
				+ File.separator + "chromedriver_84.exe");

				    ChromeOptions chromeOptions = new ChromeOptions();
				    chromeOptions.addArguments("--headless");
				    chromeOptions.addArguments("user-data-dir=" + System.getProperty("user.home")
					+ "\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
				    WebDriver driver = new ChromeDriver(chromeOptions);
				    driver.get("https://the-internet.herokuapp.com/login");
				    System.out.println(driver.getTitle());
	}

}
