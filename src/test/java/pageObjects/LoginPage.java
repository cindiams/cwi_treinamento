package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {


    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencheu o e-mail")
    public void fillEmail(){
        email.sendKeys("csm@gmail.com");
    }

    @Step("Preencheu a senha")
    public void fillPasswd() {
        passwd.sendKeys("RoLu@2629");
    }

    @Step("Clicou em Sign In")
    public void clickBtnSubmitLogin(){
       SubmitLogin.click();
    }




}
