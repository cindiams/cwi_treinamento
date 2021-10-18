package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {
    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmailAdress(){
        email_create.sendKeys("rcm@gmail.com");
    }
    public void clickBtnSubmitCreate(){
        SubmitCreate.click();
    }

}
