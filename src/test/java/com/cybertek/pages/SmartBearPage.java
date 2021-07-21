package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {
    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement submitButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement familyAlbum;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;


    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visa;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement orders;

    @FindBy(xpath = "//table/tbody/tr/td[.='John Wick']")
    public WebElement johnWick;


}
