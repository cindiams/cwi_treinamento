package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    @Step("Preencheu o e-mail do usuário")
    public void fillEmailAdress(){
        email_create.sendKeys("csm@hotmail.com");
    }
    @Step("Preencheu a senha do usuário")
    public void clickBtnSubmitCreate(){
        SubmitCreate.click();
    }
}
