package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report3.html",
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = true,
        tags = "@TruckDriver  or @StoreManager or @SalesManager"
)
public class CukesRunner {
}
