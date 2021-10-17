package pageObjects;

import elementMapper.CreateAnAccountPageElementMaper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAnAccountPage extends CreateAnAccountPageElementMaper {
    public CreateAnAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickGender() {

        id_gender2.click();
    }
    public void firstName(String name){

        customer_firstname.getText();
    }
    public void lastName(String lastName){

        customer_lastname.getText();
    }
}
