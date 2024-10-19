package tests;

import com.amazon.LandingPage;
import com.amazon.SignIn;
import com.amazon.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testComponents.BrowserTest;

public class SignUpPageTest extends BrowserTest {

    @Test(groups = {"Regression"})
    public void verifySignUpPageTest() throws InterruptedException{
        LandingPage lp = new LandingPage(driver);
        lp.hoverToSignIn();
        Thread.sleep(3000);
        SignIn si = new SignIn(driver);
        //Assert.assertEquals(si.verifySignIn(), "Sign in");
        SignUpPage sup = new SignUpPage(driver);
        Assert.assertEquals(sup.verifyContinueButton(), ("Continue"));
      //  sup.verifyContinueButton();
       // sup.verifymessage();



    }
}
