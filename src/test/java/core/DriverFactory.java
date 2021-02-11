package core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	private DriverFactory() {
	};

//	private static RemoteWebDriver driver;
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null || driver.toString().toLowerCase().contains("null")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver"
					+ File.separator + "chromedriver_87.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("disable-gpu");
			driver = new ChromeDriver(options);
//			DesiredCapabilities cap = DesiredCapabilities.chrome();
//			try {
//				driver  = new RemoteWebDriver(new URL("http://192.168.0.19:4444/wd/hub"), cap);
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}