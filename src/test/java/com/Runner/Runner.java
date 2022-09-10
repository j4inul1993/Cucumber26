package com.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="./login.feature",
		glue="com.stepdef",
		plugin= {"json:target/cucumber.json"},
		tags= {"@Smoke"}
		
	
	
		)



public class Runner extends AbstractTestNGCucumberTests{

}
