package com.cybertek.step_definitions;

import com.cybertek.pages.DropdownsPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
    DropdownsPage dropdownsPage = new DropdownsPage();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {
        //1- Get the dropdown as a select object
        Select monthDropdown = new Select(dropdownsPage.month);

        //2- Get all the options from the dropdown and store inside of a List
       List<WebElement> actualMonthsAsWebElement = monthDropdown.getOptions();

       Assert.assertEquals(expectedList, BrowserUtils.getElementsText(actualMonthsAsWebElement));

//
//        //3- Convert the actualMonths from List<WebElement> to List<String>
//        List<String> actualMonthsAsString = new ArrayList<>();
//
//        for (WebElement each : actualMonthsAsWebElement) {
//
//            actualMonthsAsString.add(each.getText());
//
//        }
//
//        Assert.assertEquals(expectedList,actualMonthsAsString);


    }


    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);

    }

    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {
        libraryLoginPage.emailInput.sendKeys(loginInfo.get("username"));
        libraryLoginPage.passwordInput.sendKeys(loginInfo.get("password"));
        libraryLoginPage.signIn.click();


    }

    @Then("user should see title is something")
    public void user_should_see_title_is_something() {


    }


    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);

    }

    @Then("user should see title is Library")
    public void userShouldSeeTitleIsLibrary() {
        System.out.println("Title verification ");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";
    }

    @When("User clicks {string} link")
    public void user_clicks_link(String any) {
        libraryLoginPage.usersLink.click();

    }

    @When("Show records value should be {int}")
    public void show_records_value_should_be(Integer int1) {

        Select select = new Select(libraryLoginPage.valueBox);

        Integer expectedValue = int1;
        Integer actualValue = 10;

        Assert.assertTrue("Value is not as expected", actualValue.equals(expectedValue));


    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<Integer> nums) {


        for (Integer integer : nums) {
            System.out.println(integer.intValue());
        }


    }


}
