package Tests;


import Pages.SearchPage;
import Preparations.BeforeClass;
import MainPage.MainPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by spirit on 05.12.16.
 */
public class FirstTest extends BeforeClass{

MainPage search = new MainPage();
SearchPage searchPage = new SearchPage();

@Test

    public void test(){
    search.fillSearchRequest(anyData("checkWord"));
    search.clickOnSearchButton();
    searchPage.assertSearch(anyData("checkWord"));
}
}
