package com.eurotech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        System.out.println("I open browser and navigate to kraft login page");
    }
    @When("The user enters bilal`s creadentials")
    public void the_user_enters_bilal_s_creadentials() {
        System.out.println("I enter Bilal`s createntials");
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I can login to the page");
    }
    @When("The user enters mike`s creadentials")
    public void the_user_enters_mike_s_creadentials() {
        System.out.println("I enter mike`s createntials");

    }
    @When("The user enters Rosa`s creadentials")
    public void the_user_enters_rosa_s_creadentials() {
        System.out.println("I enter Rosa`s createntials");
    }

    @When("The user enters Mansimmo`s email")
    public void the_user_enters_mansimmo_s_email() {
        System.out.println("Enters mansimmos email");
    }
    @When("The user enter Mansimmo`s password")
    public void the_user_enter_mansimmo_s_password() {
        System.out.println("Enters mansimmo password");
    }
    @When("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        System.out.println("Clicks on login button");
    }
    @Then("The user should be able to see own username")
    public void the_user_should_be_able_to_see_own_username() {
        System.out.println("Can be able to see own username");
    }
    @When("The user enters John`s creadentials")
    public void the_user_enters_john_s_creadentials() {
        System.out.println("I enter John`s createntials");
    }


}
