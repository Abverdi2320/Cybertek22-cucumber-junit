package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleSearchPage {
    public AppleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ac-gn-link-search")
    public WebElement searchButton;


    @FindBy(id = "ac-gn-searchform-input")
    public WebElement searchBar;

    @FindBy(xpath = "//h2[.='iPhone 12 Pro and iPhone 12 Pro Max']")
    public WebElement selectIphone;

}
