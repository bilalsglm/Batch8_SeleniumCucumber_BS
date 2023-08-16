package com.eurotech.stepDefinitions;

import com.eurotech.pages.AddEducationPage;
import com.eurotech.utilities.BrowserUtils;
import com.google.common.collect.Table;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AddEducation_Stepdefs {

    AddEducationPage addEducationPage=new AddEducationPage();
    @Then("The user should be able to see following form labels")
    public void the_user_scould_be_able_to_see_following_form_labels(List<String> expectedLabes) {
        BrowserUtils.waitForVisibility(addEducationPage.formLabels.get(0),3);
        List<String> actualLabes= BrowserUtils.getElementsText(addEducationPage.formLabels);
        Assert.assertEquals(expectedLabes,actualLabes);

    }

    @And("The user fills the form with: {string},{string},{string},{string},{string} and {string}")
    public void theUserFillsTheFormWithAnd(String school, String degree, String study, String fromDate, String toDate, String description) {

        addEducationPage.fillingAddEducationForm(school,degree,study,fromDate,toDate,description);


    }

}
