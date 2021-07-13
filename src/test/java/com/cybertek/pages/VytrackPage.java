package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {
    public VytrackPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']" )
        public WebElement username;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement password;


    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement submit;


}
