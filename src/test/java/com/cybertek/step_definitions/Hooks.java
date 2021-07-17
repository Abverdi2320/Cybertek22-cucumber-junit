package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    //import from io.cucumber.java not from Junit
    @Before
    public void setupScenario(){
        System.out.println("Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(){
        System.out.println("--- TearDown steps are being applied...---");
        Driver.closeDriver();
        System.out.println();
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
