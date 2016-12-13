package Pages;

import MainPage.MainPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by spirit on 13.12.16.
 */
public class SearchPage extends MainPage{
    SelenideElement moreResultsButton = $("#more_results");
    ElementsCollection itemName = $$(".prod_name");


    public void assertSearch(String key) {


        for ( int i = 0; i < itemName.size(); i++ ){
            String productName = this.itemName.get(i).getText();
            System.out.println(productName);
            Assert.assertEquals(true, productName.toLowerCase().contains(key));
            System.out.println("yes");
        }
    }
}
