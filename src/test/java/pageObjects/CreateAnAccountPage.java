package pageObjects;

import elementMapper.CreateAnAccountPageElementMaper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAnAccountPage extends CreateAnAccountPageElementMaper {
    public CreateAnAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Selecionou o gênero")
    public void clickGender() {
        id_gender2.click();
    }
    @Step("Preencheu o primeiro nome")
    public void firstName(){

        customer_firstname.sendKeys("Cíndia");
    }
    @Step("Preencheu o sobrenome")
    public void lastName(){

        customer_lastname.sendKeys("Moraes");
    }
    @Step("Preencheu a senha")
    public void password() {

        passwd.sendKeys("abc123");
    }
    @Step("Preencheu o endereço")
    public void adress(){

        address1.sendKeys("Rua Feliz");
    }
    @Step("Preencheu a cidade")
    public void city(){

        city.sendKeys("Scranton");
    }
    @Step("Preencheu o estado")
    public void state(){
        
        id_state.sendKeys("Pennsylvania");
    }
    @Step("Preencheu o CEP")
    public void postalCode(){

        postcode.sendKeys("18508");
    }
    @Step("Preencheu o telefone celular")
    public void mobilePhone(){

        phone_mobile.sendKeys("555555555");
    }
    @Step("Preencheu o endereço")
    public void adressAlias(){

        alias.sendKeys("Rua Feliz");
    }
    @Step("Clicou em Register")
    public void clickBtnSubmitAccount(){

        submitAccount.click();
    }
}
