package pages;

import bo.LoginResultEnum;
import core.selenium.base.Element;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage{

    @FindBy(id = "usr")
    private Element usernameInput;

    @FindBy(id = "pwd")
    private Element passwordInput;

    @FindBy(xpath = "//input[@type = 'submit'  and @value = 'Login']")
    private Element loginBtn;

    @FindBy(xpath = "//div[@id = 'case_login']/h3")
    private Element resultMsg;

    @FindBy(id = "content")
    private Element contentDiv;

    @FindBy(xpath = "//a[@href='login']")
    private Element goBackLink;

    public LoginPage performLogin(String usr, String pwd){
        usernameInput.type(usr);
        passwordInput.type(pwd);
        loginBtn.click();
        return this;
    }

    public LoginResultEnum getResultMessage(){
        return LoginResultEnum.findMessageByValue(resultMsg.getText());
    }

    public boolean isAt(){
        return contentDiv.isPresent() && usernameInput.isPresent();
    }

    public LoginPage goBackToLoginForm(){
        goBackLink.click();
        return this;
    }
}
