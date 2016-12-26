package Tests;


import Pages.SearchPage;
import Preparations.BeforeClass;
import MainPage.MainPage;
import Utils.Scroll;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by spirit on 05.12.16.
 */
public class FirstTest extends BeforeClass{

MainPage search = new MainPage();
SearchPage searchPage = new SearchPage();
Scroll scroll = new Scroll();

@Test

    public void test() throws InterruptedException {
    search.fillSearchRequest(anyData("checkWord"));
    search.clickOnSearchButton();
    scroll.pageDown();
    searchPage.assertSearch(anyData("checkWord"));
}
}
