package tests;

import com.amazon.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testComponents.BrowserTest;

public class LandingPageTest extends BrowserTest {

    LandingPage lp;


    //This testcase verify that user is able to open Amazon page successfully and user is able to search

    @Test(groups = {"SmokeTest"})
    public void homePageTest()throws InterruptedException {
         lp = new LandingPage(driver);
        lp.searchitem("computer");
        Thread.sleep(2000);
        lp.verifySearchResult();
        Assert.assertEquals(lp.verifySearchResult(),"\"computer\"");
        Thread.sleep(2000);
        System.out.println("Search result is displaying"+lp.verifySearchResult());

    }

    @Test
    public void goToSignInPage(){
        lp = new LandingPage(driver);
        lp.hoverToSignIn();
    }
    @Test
    public void goToSignInPage2(){
        lp = new LandingPage(driver);
        lp.hoverToSignIn();
    }


}
