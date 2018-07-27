package steps.impl;

import bo.LoginResultEnum;
import com.thoughtworks.gauge.Step;
import core.selenium.factory.api.ElementFactory;
import org.junit.Assert;
import pages.LoginPage;
import steps.AbstractStep;

public class LoginStepImpl extends AbstractStep {

    @Step("Perform login with username = <usr> and password <pwd> ")
    public void performLoginWithCredentials(String usr, String pwd) {
        if(!loginPage().isAt()){
            getDriver().get("http://testing-ground.scraping.pro/login");
        }
        loginPage().performLogin(usr, pwd);
    }

    @Step("Verify if login result is equals to <expectedResult>")
    public void defaultActiveTabShouldBeKoop(LoginResultEnum expectedResult) {
        LoginResultEnum actualResult = loginPage().getResultMessage();
        Assert.assertTrue(String.format("Result message should be '%s' but actually is '%s'.'", expectedResult.getValue(), actualResult),
                actualResult == expectedResult);
    }

    @Step("Given user is at the login page")
    public void givenUserIsAtLoginPage() {
        Assert.assertTrue("Should be at login page", loginPage().isAt());
    }

    private LoginPage loginPage() {
        return ElementFactory.initElements(getDriver(), LoginPage.class);
    }
}
