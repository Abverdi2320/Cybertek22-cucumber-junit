package com.cybertek.step_definitions;

import com.cybertek.pages.VytrackPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class VytrackLogin_StepDefinitions {
    @Given("user is on the Vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");

    }


    @When("user enters valid username")
    public void user_enters_valid_username() {

        VytrackPage vr = new VytrackPage();
        vr.username.sendKeys("User177");

    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        VytrackPage vr2 = new VytrackPage();
        vr2.password.sendKeys("UserUser123");
        vr2.submit.click();
    }
}
