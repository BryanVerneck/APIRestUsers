package com.example.restservice;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test01 {

    @When("I am on x page")
    public void onXpage() throws Throwable{
        System.out.println("Go to the page");
    }

    @Then("I see that element")
    public void iSeeElement(){
        System.out.println("See that element");
    }

}
