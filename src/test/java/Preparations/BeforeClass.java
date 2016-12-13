package Preparations;


import Data.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by spirit on 04.12.16.
 */
public class BeforeClass extends ReadPropertiesForTest{
    final String browserPropertyName = "webdriver.chrome.driver";
    final String browserPropertyPath = "/home/spirit/Programs/chromedriver";
    final int timeOut = 10000;
   // private final String baseURL = "https://www.jandh.com/signin";

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();
    LoginPage signInPage = new LoginPage();


    @Before
    public void before() {
        Configuration.browser = "chrome";
        Configuration.timeout = timeOut;
        makeScreenshotOnFailure.captureSuccessfulTests = false;
        System.setProperty(browserPropertyName, browserPropertyPath);
        open(anyData("login"));
       signInPage.loginToAccount(
                anyData("userName") ,
                anyData("password"));
    }
    @After
    public void after() throws IOException {
        close();
    }
}
