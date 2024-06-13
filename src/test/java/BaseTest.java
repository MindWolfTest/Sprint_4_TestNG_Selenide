import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;


public class BaseTest
{
    @BeforeMethod
    public static void start()
    {
        Configuration.browser = FIREFOX;
    }

    @AfterMethod
    public void closeWebDriver()
    {
        WebDriverRunner.closeWebDriver();
    }
}
