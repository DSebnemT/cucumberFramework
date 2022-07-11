package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions" ,
        dryRun = false,
        tags = "@smoke" //it will run all @smoke tags scenarios
)
public class CukesRunner {

}
