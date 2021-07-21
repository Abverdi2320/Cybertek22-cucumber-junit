package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class WikipediaSearchPage {
    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchBar;

    @FindBy(xpath = "//i[.='Search']")
    public WebElement searchButton;


    @FindBy(id = "firstHeading")
    public WebElement mainHeader;

}
