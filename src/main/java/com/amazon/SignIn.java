package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

    public WebDriver driver;
    public SignIn(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //This testcase verify that user is able to view Signin page
    @FindBy(xpath = "//h1[normalize-space()='Sign in']") WebElement signin;
    public String verifySignIn(){
       return signin.getText();

    }


}
