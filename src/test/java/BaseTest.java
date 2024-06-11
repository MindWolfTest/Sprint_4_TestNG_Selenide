import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;


public class BaseTest
{
    @BeforeTest
    public static void start()
    {
        Configuration.browser = CHROME;
    }

    @AfterTest
    public void closeWebDriver()
    {
        WebDriverRunner.closeWebDriver();
    }
}
