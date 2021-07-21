package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {
    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();


    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);

    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaSearchPage.wikiSearchBar.sendKeys("Steve Jobs");

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searchButton.click();

    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Steve Jobs - Wikipedia";

        Assert.assertTrue("Title is not as expected ", expectedTitle.equals(actualTitle));


    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikipediaSearchPage.wikiSearchBar.sendKeys(arg0);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0 + " - Wikipedia";

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {

        String expectedHeader = arg0;
        String actualHeader = wikipediaSearchPage.mainHeader.getText();

        Assert.assertEquals(expectedHeader,actualHeader);

    }
}
