package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Yamini Jagadeesan\\eclipse-workspace\\Maven_Cucumber\\src\\test\\java\\com\\feature\\lime.feature",
                 glue = "com.step",
                 monochrome = true,
                 dryRun = false,
                 strict = true,
                 tags = "@Regression",
                 plugin = {"pretty",
                		 "html:Report/lime.html",
                		 "json:Rep/limeroad.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner_Class extends Base_Class {
	
	@BeforeClass
    public static void browser() {
	browserLaunch("chrome");
 }
	
}
