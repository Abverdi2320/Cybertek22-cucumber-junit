package com.cybertek.step_definitions;

import com.cybertek.pages.AppleSearchPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Apple_StepDefinitions {

    AppleSearchPage appleSearchPage = new AppleSearchPage();

    @Given("User is on Apple home page")
    public void user_is_on_apple_home_page() {
        String url = "appleUrl";
        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User types {string} in the apple search box and click enter")
    public void user_types_in_the_apple_search_box_and_click_enter(String string) {
        appleSearchPage.searchButton.click();
        BrowserUtils.sleep(1);
        appleSearchPage.searchBar.sendKeys(string+ Keys.ENTER);



    }
    @When("User choose {string} from the list")
    public void user_choose_from_the_list(String string) {
        appleSearchPage.selectIphone.click();

    }
    @Then("User sees {string} is in the apple title")
    public void user_sees_is_in_the_apple_title(String string) {
        BrowserUtils.sleep(2);

        String expectedTitle = string;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(string,actualTitle);



    }


}
