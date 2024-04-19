package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty", 
				"html:reports/cucumber_results.html",
				"json:reports/cucumber_results.json",
				"rerun:reports/rerun.txt"
				},
		features="./src/test/resources/features",
		glue="step_definitions",
		tags="@regression"
		)




public class TestRunner {

}
