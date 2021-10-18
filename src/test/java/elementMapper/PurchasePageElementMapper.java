package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PurchasePageElementMapper {

    @FindBy(css = ".cart_navigation a[title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(css = ".cart_navigation [type='submit']")
    public WebElement proceedToCheckoutButtonAddress;

    @FindBy(id = "uniform-cgv")
    public WebElement agreeToTheTerms;

    @FindBy(css = ".cart_navigation [name=processCarrier]")
    public WebElement proceedToCheckoutButton2;

    @FindBy(css = ".payment_module [title='Pay by bank wire']")
    public WebElement payByBankWirePaymentOption;

    @FindBy(css = ".cart_navigation [type='submit']")
    public WebElement confirmOrder;
}

