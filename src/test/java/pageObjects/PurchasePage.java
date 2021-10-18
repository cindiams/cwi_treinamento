package pageObjects;

import elementMapper.PurchasePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PurchasePage extends PurchasePageElementMapper {
    public PurchasePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    public void clickProceedToCheckoutButtonAddress() {
        proceedToCheckoutButtonAddress.click();
    }

    public void clickAgreeToTheTermsService() {
        agreeToTheTerms.click();
    }

    public void clickProceedToCheckoutButton2() {
        proceedToCheckoutButton2.click();
    }

    public void clickPayByBankWirePaymentOption() {
        payByBankWirePaymentOption.click();
    }

    public void clickIConfirmMyOrderButton() {
        confirmOrder.click();
    }
}
