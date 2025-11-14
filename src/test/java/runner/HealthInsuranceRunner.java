package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = {
		 "D:\\Nilam\\JavaPractice_Updated\\coverfox\\src\\test\\resources\\CoverfoxFeature\\CoverfoxHelthPlan.feature"
		//"D:\\Nilam\\JavaPractice_Updated\\coverfox\\src\\test\\resources\\CoverfoxFeature\\MultipleScenario.feature"
		//"D:\\Nilam\\JavaPractice_Updated\\coverfox\\src\\test\\resources\\CoverfoxFeature\\CoverfoxMultipleData.feature"
		//"D:\\Nilam\\JavaPractice_Updated\\coverfox\\src\\test\\resources\\CoverfoxFeature\\GmailLoginDataTable.feature" 
		},

		glue = { "stepDefinitions","hooks" }, 
		plugin = {"pretty","html:Cucumber-reports/reports.html",
				"json:Cucumber-reports/reports.json"}, 
		publish = true,
		dryRun=false)

public class HealthInsuranceRunner extends AbstractTestNGCucumberTests {

}
