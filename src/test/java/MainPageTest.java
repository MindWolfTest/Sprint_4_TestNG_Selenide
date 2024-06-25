import com.codeborne.selenide.SelenideElement;
import com.example.web.MainPage;
import com.example.web.CreateOrderFirstPage;
import com.example.web.OrderPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.example.constants.ContsImportantQuestions.*;

public class MainPageTest extends BaseTest
{
    MainPage mainPage = new MainPage();
    CreateOrderFirstPage createOrderFirstPage = new CreateOrderFirstPage();
    OrderPage orderPage = new OrderPage();

    @Test
    public void openMainPage()
    {
        //MainPage mainPage = new MainPage();
        mainPage
                .openMainPage()
                .checkOpenMainPage();
    }

    @Test
    public void clickOrderFromHeaderButton()
    {
        mainPage
                .openMainPage()
                .clickOrderFromHeaderButton();
        createOrderFirstPage
                .checkOpenOrderFirstPage();
    }

    @Test
    public void clickOrderFromFooterButton()
    {
        mainPage
                .openMainPage()
                .clickAcceptCookieButton()
                .clickOrderFromFooterButton();
        createOrderFirstPage
                .checkOpenOrderFirstPage();
    }

    @Test
    public void clickLogoYandex()
    {
        mainPage
                .openMainPage()
                //.checkOpenMainPage()
                .clickAtLogoYandex()
                .checkOpenDzen();

    }

    @Test
    public void clickLogoSamokatTest()
    {
        mainPage
                .openMainPage()
                .clickLogoSamokat()
                .checkOpenMainPage();
    }

    @Test
    public void checkWrongIDOrderTest()
    {
        mainPage
                .openMainPage()
                .clickOrderStatusButton()
                .enterNumberOrder()
                .clickButtonGo();
        orderPage
                .checkWrongOderMessage();
    }

    @DataProvider(name = "Questions")
    public Object[][] data()
    {
        return new Object[][]
                {
                        {ELEMENT_QUESTION_HOW_MUCH_IT_COST, TEXT_QUESTION_HOW_MUCH_IT_COST,
                                ELEMENT_ANSWER_HOW_MUCH_IT_COST, TEXT_ANSWER_HOW_MUCH_IT_COST},

                        {ELEMENT_QUESTION_I_WANNA_SEVERAL_SAMOKAT, TEXT_QUESTION_I_WANNA_SEVERAL_SAMOKAT,
                        ELEMENT_ANSWER_I_WANNA_SEVERAL_SAMOKAT, TEXT_ANSWER_I_WANNA_SEVERAL_SAMOKAT},

                        {ELEMENT_QUESTION_HOW_RENTAL_PERIOD_CALCULATED, TEXT_QUESTION_HOW_RENTAL_PERIOD_CALCULATED,
                                ELEMENT_ANSWER_HOW_RENTAL_PERIOD_CALCULATED, TEXT_ANSWER_HOW_RENTAL_PERIOD_CALCULATED},

                        {ELEMENT_QUESTION_CAN_I_ORDER_SCOOTER_TODAY, TEXT_QUESTION_CAN_I_ORDER_SCOOTER_TODAY,
                                ELEMENT_ANSWER_CAN_I_ORDER_SCOOTER_TODAY, TEXT_ANSWER_CAN_I_ORDER_SCOOTER_TODAY},

                        {ELEMENT_QUESTION_CAN_I_EXTEND_ORDER, TEXT_QUESTION_CAN_I_EXTEND_ORDER,
                                ELEMENT_ANSWER_CAN_I_EXTEND_ORDER, TEXT_ANSWER_CAN_I_EXTEND_ORDER},

                        {ELEMENT_QUESTION_DELIVERY_CHARGING, TEXT_QUESTION_DELIVERY_CHARGING,
                                ELEMENT_ANSWER_DELIVERY_CHARGING, TEXT_ANSWER_DELIVERY_CHARGING},

                        {ELEMENT_QUESTION_CAN_I_CANCEL_ORDER, TEXT_QUESTION_CAN_I_CANCEL_ORDER,
                                ELEMENT_ANSWER_CAN_I_CANCEL_ORDER, TEXT_ANSWER_CAN_I_CANCEL_ORDER},

                        {ELEMENT_QUESTION_I_LIVE_OUT_MKAD, TEXT_QUESTION_I_LIVE_OUT_MKAD,
                                ELEMENT_ANSWER_I_LIVE_OUT_MKAD, TEXT__ANSWER_I_LIVE_OUT_MKAD}
                };
    }

    @Test(dataProvider = "Questions")
    public void importantQuestions(SelenideElement elementQuestion, String textQuestion,
                                   SelenideElement elementAnswer, String textAnswer)
    {
        mainPage
                .openMainPage()
                .checkQuestion(elementQuestion, textQuestion)
                .clickQuestion(elementQuestion)
                .checkAnswer(elementAnswer, textAnswer);
    }
}
