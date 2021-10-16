package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage(){
       PageFactory.initElements(Browser.getCurrentDriver(), this);
   }

   public boolean isPageTshirts(){
        return getAuthenticationPageTSrhirts().contains("T-SHIRTS");
   }

   public String getAuthenticationPageTSrhirts(){
        return nameCategoryTShirts.getText();
   }

   public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
   }

   public String getProductNameCategory(){
        return productNameCategory.getText();
   }

}
