package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\eximt\\Downloads\\eclipse-jee-2022-12-R-win32-x86_64\\eclipse\\cucumber\\Cucumber_Day1\\src\\test\\java\\feature"
,glue= {"com.app.stepdefinition"},
dryRun=false,
monochrome=true,
publish=true)

public class Runner {

}
