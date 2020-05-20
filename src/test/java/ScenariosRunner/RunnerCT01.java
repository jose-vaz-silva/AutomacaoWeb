package ScenariosRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/cucumber-html-report"}, 
				features = "src/test/resources/features/CT01.feature", 
				glue = "steps",
				monochrome = true)
public class RunnerCT01{
}
