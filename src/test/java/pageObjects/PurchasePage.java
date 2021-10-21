package pageObjects;

import elementMapper.PurchasePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PurchasePage extends PurchasePageElementMapper {
    public PurchasePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    @Step("Clicou em Proceed To Checkout")
    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    @Step("Clicou em Proceed To Checkout")
    public void clickProceedToCheckoutButtonAddress() {
        proceedToCheckoutButtonAddress.click();
    }

    @Step("Clicou em Concordo com os Termos de Serviço")
    public void clickAgreeToTheTermsService() {
        agreeToTheTerms.click();
    }

    @Step("Clicou em Proceed To Checkout")
    public void clickProceedToCheckoutButton2() {
        proceedToCheckoutButton2.click();
    }

    @Step("Selecionou a forma de pagamento")
    public void clickPayByBankWirePaymentOption() {
        payByBankWirePaymentOption.click();
    }

    @Step("Clicou I Confirm My Order")
    public void clickIConfirmMyOrderButton() {
        confirmOrder.click();
    }
}
