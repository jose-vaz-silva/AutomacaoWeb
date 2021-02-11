package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenerateEvidences {

	public static String getScreenshot(String screeshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + File.separator + "output" + File.separator + "evidences" + File.separator
				+ screeshotName + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
}
