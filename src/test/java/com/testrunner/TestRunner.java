package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"com.stepdefinitions"},
		tags= {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
		monochrome=true
		
		)
public class TestRunner {

}
