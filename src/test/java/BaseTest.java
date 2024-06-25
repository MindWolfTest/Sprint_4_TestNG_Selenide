import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.web.OrderStatusPage;
import com.example.web.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Browsers.FIREFOX;


public class BaseTest
{
    protected String orderID;

    @BeforeMethod
    public static void start()
    {
        Configuration.browser = FIREFOX;
    }

    @AfterMethod
    public void closeWebDriver()
    {
        if (orderID != null)
        {
            OrderStatusPage orderStatusPage = new OrderStatusPage();
            orderStatusPage
                    .openCreatedOrderPage()
                    .checkOpenCreatedOrderPage()
                    .clickCancelOrderButton()
                    .clickCancelButton()
                    .checkTextOrderCancel()
                    .clickButtonOk();

            MainPage mainPage = new MainPage();
            mainPage.checkOpenMainPage();
        }
        WebDriverRunner.closeWebDriver();
    }
}
