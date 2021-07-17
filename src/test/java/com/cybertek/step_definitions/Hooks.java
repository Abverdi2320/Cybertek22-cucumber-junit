package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java not from Junit
    @Before
    public void setupScenario(){
        System.out.println("Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){
        scenario.isFailed();

//        System.out.println();
        if(scenario.isFailed()){
            byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }



        System.out.println("--- TearDown steps are being applied...---");
      //  Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----Setup Applying For Each Step----");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("----Teardown Applying For Each Step----");
    }
}
