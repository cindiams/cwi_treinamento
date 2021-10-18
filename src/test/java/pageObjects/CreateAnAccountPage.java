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
    public void firstName(){

        customer_firstname.sendKeys("Cíndia");
    }
    public void lastName(){

        customer_lastname.sendKeys("Moraes");
    }
    public void password() {
        passwd.sendKeys("abc123");
    }
    public void adress(){
        address1.sendKeys("Rua Feliz");
    }
    public void city(){
        city.sendKeys("Scranton");
    }
    public void state(){
        id_state.sendKeys("Pennsylvania");
    }
    public void postalCode(){
        postcode.sendKeys("18508");
    }
    public void mobilePhone(){
        phone_mobile.sendKeys("555555555");
    }
    public void adressAlias(){
        alias.sendKeys("Rua Feliz");
    }
    public void clickBtnSubmitAccount(){
        submitAccount.click();
    }


}
