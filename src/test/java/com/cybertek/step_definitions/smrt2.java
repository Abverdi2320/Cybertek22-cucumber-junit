package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class smrt2 {

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        System.out.println("User is on the SmartBear page");

    }

    @When("User fills out the form as followed from the table below")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
        System.out.println("User fills out the form");

    }

    @When("User selects “MyMoney” from product dropdown")
    public void user_selects_my_money_from_product_dropdown() {
        System.out.println();

    }

    @When("User enters “{int}”to quantity")
    public void user_enters_to_quantity(Integer int1) {
        System.out.println("User enters " + int1 + " to quantity");

    }


    @When("User enters “Ken Adams” to costumer name")
    public void user_enters_ken_adams_to_costumer_name() {

    }

    @When("User enters “Kinzie st” to street")
    public void user_enters_kinzie_st_to_street() {

    }


}