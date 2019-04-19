package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\a1wnv4uk\\eclipse\\java-2018-09\\eclipse\\cucumber\\src\\main\\java\\features\\login.feature",
		glue = {"stepDefinition"},
		monochrome = true,
		dryRun = false,
		strict = false,
		 format = {"pretty","html:test-output"}
		)


public class testRunnerClass {

}
