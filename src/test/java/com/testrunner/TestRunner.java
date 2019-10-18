package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		
		
		features="FeatureFiles",
		glue="com.stepdef",
		dryRun=false,
		
		 plugin = { "pretty",
					"html:target/cucumber-htmlreport", "json:target/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true


		
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

}
