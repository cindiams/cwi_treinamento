package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

@Feature("Testes site de e-commerce http://automationpractice.com/")
public class SetupTest extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage() {

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));

    }

    @Test
    @Story("Realizar o login")
    public void testLogin() {
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();

        login.fillPasswd();

        login.clickBtnSubmitLogin();

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));

    }

    @Test
    @Story("Realizar uma busca no site")
    public void testSearch() {

        String quest = "DRESS";
        String questResultQtd = "7";

        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        home.doSearch(quest);

        assertTrue(search.isSearchPage());
        assertEquals(quest, search.getTextLighter().replace("\"", ""));
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));

    }

    @Test
    @Story("Acessar categoria")
    public void testAcessCategoryTShirt(){
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        home.clickCategoryTShirts();

        assertTrue(category.isPageTshirts());

    }

    @Test
    @Story("Acessar página de produto")
    public void testAddProductToProductPage(){
        testAcessCategoryTShirt();

        CategoryPage category = new CategoryPage();

        ProductPage pdp = new ProductPage();

        String nameProductCategory = category.getProductNameCategory();

        category.clickProductAddToProductPage();

        assertEquals(pdp.getProductNamePDP(), nameProductCategory);

    }

    @Test
    @Story("Adicionar um produto no carrinho")
    public void testAddProductToCartPage(){

        testAddProductToProductPage();

        ProductPage pdp = new ProductPage();

        CartPage cart = new CartPage();

        String nameProductPDP = pdp.getProductNamePDP();

        pdp.clickButtonAddToCart();

        pdp.clickButtonModalProceedToCheckout();

        assertEquals(cart.getNameProductCart(), nameProductPDP);

    }

    @Test
    @Story("Finalizar uma compra")
    public void testPurchasePage(){
        testLogin();

        testAddProductToCartPage();

        PurchasePage purchase = new PurchasePage();

        purchase.clickProceedToCheckoutButton();

        purchase.clickProceedToCheckoutButtonAddress();

        purchase.clickAgreeToTheTermsService();

        purchase.clickProceedToCheckoutButton2();

        purchase.clickPayByBankWirePaymentOption();

        purchase.clickIConfirmMyOrderButton();

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("ORDER CONFIRMATION"));

    }

    @Test
    @Story("Criar uma conta no site")
    public void testCreateAnAccount(){
        HomePage home = new HomePage();
        MyAccountPage create = new MyAccountPage();
        CreateAnAccountPage authentication = new CreateAnAccountPage();

        home.clickBtnLogin();

        create.fillEmailAdress();

        create.clickBtnSubmitCreate();

        authentication.clickGender();

        authentication.firstName();

        authentication.lastName();

        authentication.password();

        authentication.adress();

        authentication.city();

        authentication.state();

        authentication.postalCode();

        authentication.mobilePhone();

        authentication.adressAlias();

        authentication.clickBtnSubmitAccount();
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));

    }

}
