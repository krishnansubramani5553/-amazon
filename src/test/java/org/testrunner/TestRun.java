package org.testrunner;

import org.functional.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Amazon.feature" }, glue = { "org.stepdef" }, dryRun = false, monochrome = true, plugin = { "pretty","html:E:\\Test\\target\\Amazn.html","json:E:\\Test\\target\\Amazooon1.json"})

public class TestRun {

	@AfterClass
	public static void reportGeneration() {
		JVMReport.generateJVMReport("E:\\Test\\target\\Amazooon1.json");

	}
}
