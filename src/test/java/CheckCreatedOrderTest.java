import com.codeborne.selenide.WebDriverRunner;
import com.example.web.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.example.constants.ConstWrongData.WRONG_ORDER_ID;

public class CheckCreatedOrderTest extends BaseTest
{
    MainPage mainPage = new MainPage();
    OrderPage orderPage = new OrderPage();
    Generator generator = new Generator();

    @Override
    @AfterMethod
    public void closeWebDriver()
    {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void checkWrongIDOrderTest()
    {
        mainPage
                .openMainPage()
                .clickOrderStatusButton()
                .enterNumberOrder(WRONG_ORDER_ID)
                .clickButtonGo();
        orderPage
                .checkWrongOderMessage();
    }

    /*@DataProvider(name = "DataForCreateOrder")
    public Object[][] data()
    {
        return new Object[][]
                {
                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Спортивная",
                                generator.getPhoneNumber(), generator.getDate(), "семеро суток", BLACK, GRAY, "1"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Таганская",
                                generator.getPhoneNumber(), generator.getDate(), "сутки", GRAY, BLACK, "2"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Черкизовская",
                                generator.getPhoneNumber(), generator.getDate(), "двое суток", BLACK, "", "3"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Полежаевская",
                                generator.getPhoneNumber(), generator.getDate(), "трое суток", GRAY, "", "4"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Цветной бульвар",
                                generator.getPhoneNumber(), generator.getDate(), "четверо суток", "", BLACK, "5"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Менделеевская",
                                generator.getPhoneNumber(), generator.getDate(), "пятеро суток", "", GRAY, "6"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Кузнецкий Мост",
                                generator.getPhoneNumber(), generator.getDate(), "шестеро суток", BLACK, BLACK, "7"},

                        {generator.getFirstName(), generator.getLastName(), generator.getAddress(), "Кузнецкий Мост",
                                generator.getPhoneNumber(), generator.getDate(), "семеро суток", GRAY, GRAY, "8"}
                };
    }

    @Test(dataProvider = "DataForCreateOrder")
    public void createOrder(String firstName, String secondName, String address, String metroStation, String phoneNumber,
                            String date, String rentalPeriod, String firstColor, String secondColor, String comment)
    {
        CreateOrderFirstPage createOrderFirstPage = new CreateOrderFirstPage();
        createOrderFirstPage
                .openOrderPage()
                .enterFirstName(firstName)
                .enterSecondName(secondName)
                .enterAddressField(address)
                .chooseMetroStation(metroStation)
                .enterPhoneNumber(phoneNumber)
                //.clickAcceptCookies()
                .clickNextButton();
        CreateOrderSecondPage createOrderSecondPage = new CreateOrderSecondPage();
        createOrderSecondPage
                .checkOrderSecondPage()
                .enterDeliveryDate(date)
                .chooseRentalPeriod(rentalPeriod)
                .chooseFirstColor(firstColor)
                .chooseSecondColor(secondColor)
                .checkEmptyColorBox(firstColor, secondColor)
                .checkAddBlackColorBox(firstColor, secondColor)
                .checkAddGrayColorBox(firstColor, secondColor)
                .enterComment(comment)
                .clickOrderButton()
                .checkConfirmOrderWindow()
                .clickYesButtonToConfirmOrder()
                .checkTextOrderCreated();

        orderID = createOrderSecondPage.getNumberOfOrder();


    }*/
}
