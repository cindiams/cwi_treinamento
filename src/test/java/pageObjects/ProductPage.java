package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNamePDP(){

        return productNamePDP.getText();
    }

    @Step("Clicou em Add to cart")

    public void clickButtonAddToCart(){

        buttonAddProductToCart.click();
    }

    @Step("Clicou em Proceed To Checkout")
    public void clickButtonModalProceedToCheckout() {

        buttonModalProceedToCheckout.click();
    }
}
