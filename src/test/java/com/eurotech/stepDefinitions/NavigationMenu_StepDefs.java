package com.eurotech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {

    @When("Login as Mike")
    public void login_as_mike() {
        System.out.println("Login as Mike");
    }
    @Then("Validate that Dashboard text is visible")
    public void validate_that_dashboard_text_is_visible() {
        System.out.println("Validate that Dashboard text is visible");
    }
    @When("Go to developers manu")
    public void go_to_developers_manu() {
        System.out.println("Go to developers manu");
    }
    @Then("Validate that Developers text is visible")
    public void validate_that_developers_text_is_visible() {
        System.out.println("Validate that Developers text is visible");
    }
    @When("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("Login as Sabastian");
    }
    @When("Go to forms-input menu")
    public void go_to_forms_input_menu() {
        System.out.println("Go to froms-input menu");
    }
    @Then("Validate that General From Elements-Input text is visible")
    public void validate_that_general_from_elements_input_text_is_visible() {
        System.out.println("Validate that General From Elements-Input text is visible");
    }


    @When("Login as MikeJohn")
    public void login_as_mike_john() {
        System.out.println("Login as MikeJohn");
    }
    @When("Go to My Profile menu")
    public void go_to_my_profile_menu() {
        System.out.println("Go to My Profile menu");
    }
    @Then("Validate that {string} text is visible")
    public void validate_that_text_is_visible(String string) {
        System.out.println("Validate that {string} text is visible");
    }

}
