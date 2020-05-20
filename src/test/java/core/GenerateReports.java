package core;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateReports {
	private static ExtentReports report;
	private static ExtentTest logger;

	public GenerateReports(String descriptionTest) {
		report = new ExtentReports(System.getProperty("user.dir") + "\\report\\testReports.html");
		logger = report.startTest(descriptionTest);
	}

	public static void logger(LogStatus status, String descriptionStep) {
		logger.log(status, descriptionStep);
	}

	public static void saveLoggersReport() {
		report.endTest(logger);
		report.flush();
	}

	public static ExtentTest getLogger() {
		return logger;
	}

	public static void takeScreenshotReport(LogStatus status,String screenshootName) throws IOException {
	ExtentTest logger = GenerateReports.getLogger();
	String screenshot_path = GenerateEvidences.getScreenshot(DriverFactory.getDriver(), "evidence");
	String image = logger.addScreenCapture(screenshot_path);
	logger.log(status, screenshootName, image);
	}
}
