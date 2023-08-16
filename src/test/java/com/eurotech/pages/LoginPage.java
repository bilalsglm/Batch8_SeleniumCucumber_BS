package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage{

//    public LoginPage(){
//        PageFactory.initElements(Driver.get(),this);
//    }

    @FindBy(id = "email")
    public WebElement emailBox;

    // WebElement emailBox=driver.findElement(By.id("email"));  //findby bu işlemi yapar
    //Seleniumdan gelir. Page Object Model ile ilgili herşey selenium kaynaklıdır.

    @FindBy(id = "yourPassword")
    public WebElement passowordBox;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginBtn;

    //AND logic ile calisir .. iki findBy'ın da doğru olması gerekir
    @FindBys({
            @FindBy(css = "#email"),
            @FindBy(xpath = "//input[@name='email']")
    })
    public WebElement emailBoxWithFindBys;
    //OR logic ile calisir...iki findBy'dan birinin doğru olması gerekir
    @FindAll({
            @FindBy(css = "#yourPassword"),
            @FindBy(css = ".bilal")
    })
    public WebElement passwordBoxWithFindAll;

    @FindBy(xpath = "//div[contains(text(),'Password is incorrect.')]")
    public WebElement wrongPasswordWarningMessage;


    @FindBy(xpath = "//div[contains(text(),'Email address is incorrect.')]")
    public WebElement wrongEmailWarningMessage;

    @FindBy(css = ".form-control,button")
    public List<WebElement> loginInputs;

    public void login(String userEmail,String password){
        emailBox.sendKeys(userEmail);
        passowordBox.sendKeys(password);
        loginBtn.click();
    }

    public void login(){

        emailBox.sendKeys(ConfigurationReader.get("userEmail"));
        passowordBox.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }

    public String getWarningMessageTesxt(String message){
        return Driver.get().findElement(By.xpath
                ("//div[contains(text(),'"+message+"')]")).getText();
    }
}
