package core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.runtime.ScenarioImpl;
import gherkin.formatter.model.Result;
import page.BasePage;

public class Hook extends BasePage {
	@After
	public void fechar(Scenario scenario) throws IOException {
		GenerateReports.saveLoggersReport();
		logError(scenario);
		quitBrowser();

	}

	private static String logError(Scenario scenario) {
		Field field = FieldUtils.getField(((ScenarioImpl) scenario).getClass(), "stepResults", true);
		field.setAccessible(true);
		String error = null;
		try {
			@SuppressWarnings("unchecked")
			ArrayList<Result> results = (ArrayList<Result>) field.get(scenario);
			for (Result result : results) {
				if (result.getError() != null) {
					System.out.printf("Error Scenario: {}", scenario.getId(), result.getError().getMessage());
					String[] resultErrorMessage =  result.getError().getMessage().split("Build info:");
					error = resultErrorMessage[0].replaceFirst("([A-Z,a-z,0-9]+\\.?)+\\:\\s", "");
				}
			}
		} catch (Exception e) {
			System.out.printf("\nError while logging error", e);
		}
		return error;
	}

}
