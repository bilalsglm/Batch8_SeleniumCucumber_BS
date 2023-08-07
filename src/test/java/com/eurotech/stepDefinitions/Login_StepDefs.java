package com.eurotech.stepDefinitions;

import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters bilal`s creadentials")
    public void the_user_enters_bilal_s_creadentials() {
       loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @When("The user enters mike`s creadentials")
    public void the_user_enters_mike_s_creadentials() {
        loginPage.login("mike@gmail.com","mike1234");

    }
    @When("The user enters Rosa`s creadentials")
    public void the_user_enters_rosa_s_creadentials() {
        loginPage.login("rosa@test.com","Test123456");
    }

    @When("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        System.out.println("Clicks on login button");
    }
    @When("The user enters John`s creadentials")
    public void the_user_enters_john_s_creadentials() {
        loginPage.login("john@gmail.com","John1234.");

    }
    @When("The user logs in with using creadentials {string} and {string}")
    public void the_user_logs_in_with_using_creadentials_and(String userEmail, String password) {
       loginPage.login(userEmail,password);
    }



}
