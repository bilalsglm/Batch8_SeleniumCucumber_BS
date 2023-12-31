package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify that username {string} is displayed on dashboard page")
    public void verify_that_username_is_displayed_on_dashboard_page(String username) {
        String expectedUsername = username;
        String actualUsername = dashboardPage.getusernameText();
        Assert.assertEquals(expectedUsername, actualUsername);
//        dashboardPage.userNameAtRigt.getText();
//        dashboardPage.userName.getText();

    }

    @And("The user should be able to see following menu")
    public void theUserShouldBeAbleToSeeFollowingMenu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);


//        List<String> actualList=new ArrayList<>();
//        for (WebElement element:dashboardPage.tabMenu){
//            actualList.add(element.getText());


        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.tabMenu);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);
    }


    @And("The user navigation to {string} and {string}")
    public void theUserNavigationToAnd(String menu, String submenu) {
        dashboardPage.navigateToTabsAndModule(menu,submenu);
        BrowserUtils.waitFor(3);
    }

    @Then("The user verifies success login with {string} using excel file:{string},{string} and {int}")
    public void the_user_verifies_success_login_with_using_excel_file_and(String nameColumnHeaders, String path, String sheetName, Integer row) {
       List<Map<String, String>> dataList= dashboardPage.getExcelData(path, sheetName);
        String expectedName = dataList.get(row).get(nameColumnHeaders);
        String actualName= dashboardPage.getusernameText();

        Assert.assertEquals(expectedName,actualName);

    }
}


