import com.amazon.LandingPage;
import com.amazon.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySignInPageTest extends BrowserTest{
    @Test(groups = {"Regression"})
    public void verifySigninPage() throws InterruptedException {
        LandingPage lp= new LandingPage(driver);
        lp.hoverToSignIn();
        Thread.sleep(3000L);
        SignIn si = new SignIn(driver);
        Assert.assertEquals(si.verifySignIn(), "Sign in");
    }


}
