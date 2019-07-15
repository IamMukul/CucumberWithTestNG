package com.qa.TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/BasicCourse.feature",
                 glue={"com.qa.stepDefinitions"},
                 tags = {"@BasicCourseTest"}
                 )
public class TestRunner_BasicCourse extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
