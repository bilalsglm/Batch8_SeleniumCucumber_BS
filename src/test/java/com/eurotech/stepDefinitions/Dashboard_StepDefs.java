package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    @Then("Verify taht username {string} is displayed on dashboard page")
    public void verify_taht_username_is_displayed_on_dashboard_page(String username) {
        String expectedUsername=username;
        String actualUsername=dashboardPage.getusernameText();
        Assert.assertEquals(expectedUsername,actualUsername);
//        dashboardPage.userNameAtRigt.getText();
//        dashboardPage.userName.getText();

    }

}
