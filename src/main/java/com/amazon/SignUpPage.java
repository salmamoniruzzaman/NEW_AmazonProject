package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //finding xpaths for signup the account


    @FindBy(css = "span[id='continue-announce']") WebElement verfiyContinueText;
    @FindBy(xpath = "//input[@id='continue']") WebElement clickContinue;
    @FindBy(xpath = "//div[contains(text(),'Enter your email or mobile phone number')]") WebElement verifyErrorMessage;


    public String verifyContinueButton(){
        return verfiyContinueText.getText();
    }

    public void clickContinueButton(){
        clickContinue.click();
    }

    public String verifymessage(){
        return verifyErrorMessage.getText();
    }

}
