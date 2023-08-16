package com.eurotech.stepDefinitions;

import com.eurotech.pages.EditProfilPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;

public class EditProfile_StepDefs {
    EditProfilPage editProfilPage=new EditProfilPage();
    @And("The user adds {string} {string}")
    public void theUserAdds(String profileBox, String userInfo) {

        editProfilPage.editProfileInfo(profileBox,userInfo);
    }

    @And("The user selects {string} from the menu")
    public void theUserSelectsFromTheMenu(String job) {

        editProfilPage.selectJob(job);
    }

    @And("The user clicks on save changes button")
    public void theUserClicksOnSaveChangesButton() {
        BrowserUtils.clickWithJS(editProfilPage.saveChangesBox);
    }
}
