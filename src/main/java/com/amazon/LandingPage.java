package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Finding the locators
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement searchBox;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']") WebElement searchButton;
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']") WebElement computer;
    @FindBy(xpath = "//a[@id='nav-link-accountList']") WebElement hoveringToSignIn;
    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']") WebElement signIn;





    //This testcase verify that user is able to open Amazon page successfully and user is able to search any item
    public void searchitem(String item){
        searchBox.sendKeys(item);
        searchButton.click();

    }
    //This testcase verify that search results should be dispalyed and user should be able to see search results
    public String verifySearchResult(){
        return computer.getText();
    }
public void hoverToSignIn(){
        Actions ac= new Actions(driver);
        ac.moveToElement(hoveringToSignIn).build().perform();
        signIn.click();

}



}
