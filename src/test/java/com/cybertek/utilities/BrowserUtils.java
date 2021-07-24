package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /**
     This method accepts String expected title
     @param expectedTitle
     */
    public static void assertTitle(String expectedTitle){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }


    /**
     * This method accepts a List<WebElements> and returns List <String>
     * Param - webElementList
     */


    public static List<String> getElementsText(List<WebElement> webElementList) {
        //Create placeholder List<String>
        List<String> actualAsString = new ArrayList<>();

        for (WebElement each : webElementList) {

            actualAsString.add(each.getText());

        }
        return actualAsString;
    }

    /*
       Method that will accept int  arg
       Wait for given second duration
       //1sec = 1000 milli seconds
       //1 * 1000 = 1000
           Thread.sleep(1000);
           Thread.sleep(2000);
           Thread.sleep(3000);
           BrowserUtils.sleep(1); --> 1 second
        */
    public static void sleep(int second) {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in the sleep method");
        }



    }
}

