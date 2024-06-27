package com.example.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.example.constants.ConstMainPageText.TEXT_SAMOKAT;
import static com.example.constants.ConstUrl.URL_DZEN;
import static com.example.constants.ConstUrl.URL_MAIN_PAGE;
import static com.example.constants.ConstWrongData.WRONG_ORDER_ID;

public class MainPage
{
//    @FindBy(how = How.NAME,using = "Home_Header__iJKdX")
//    private SelenideElement textInHomePageSamokat;
//
//    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
//    private SelenideElement testMy;

    private final SelenideElement textInHomePageSamokatNew = $(byClassName("Home_Header__iJKdX"));
    private final SelenideElement orderButtonInHeader = $(byClassName("Button_Button__ra12g"));
    private final SelenideElement acceptCookeiButton = $(byId("rcc-confirm-button"));
    private final SelenideElement orderButtonInFooter = $(byXpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
    private final SelenideElement logoYandex = $(byClassName("Header_LogoYandex__3TSOI"));
    private final SelenideElement logoSamokat = $(byClassName("Header_LogoScooter__3lsAR"));
    private final SelenideElement orderStatusButton = $(byClassName("Header_Link__1TAG7"));
    private final SelenideElement orderNumberField = $(byXpath(".//input[@placeHolder = 'Введите номер заказа']"));
    private final SelenideElement buttonGo = $(byXpath(".//button[text() = 'Go!']"));

    @Step("Открыть главную стр.")
    public MainPage openMainPage()
    {
        open(URL_MAIN_PAGE);
        return this;
    }

    @Step("Проверка что открылась главная стр.")
    public MainPage checkOpenMainPage()
    {
        textInHomePageSamokatNew.shouldHave(text(TEXT_SAMOKAT));
        return this;
    }

    @Step("Клик по кнопке Заказать в хедере")
    public MainPage clickOrderFromHeaderButton()
    {
        orderButtonInHeader.click();
        return this;
    }

    @Step("Клик по кнопке принять куки")
    public MainPage clickAcceptCookieButton()
    {
        acceptCookeiButton.click();
        return this;
    }

    @Step("Клик по кнопке Заказать в футере")
    public MainPage clickOrderFromFooterButton()
    {
        orderButtonInFooter.scrollIntoView(true).click();
        return this;
    }

    @Step("Клик по логотипу Яндекс")
    public MainPage clickAtLogoYandex()
    {
        logoYandex.click();
        return this;
    }

    @Step("Проверить URL редиректа корректный")
    public MainPage checkOpenDzen()
    {
        Selenide.switchTo().window(1);
        webdriver().shouldHave(url(URL_DZEN));
        return this;
    }

    @Step("Клик по логотипу Самокат")
    public MainPage clickLogoSamokat()
    {
        logoSamokat.click();
        return this;
    }

    @Step("Клик по кнопке Статус заказа")
    public MainPage clickOrderStatusButton()
    {
        orderStatusButton.click();
        return this;
    }

    @Step("Ввод номера заказа {orderNumber}")
    public MainPage enterNumberOrder(String orderNumber)
    {
        orderNumberField.setValue(orderNumber);
        return this;
    }

    @Step("Клик по кнопке Go!")
    public MainPage clickButtonGo()
    {
        buttonGo.click();
        return this;
    }

    @Step("Проверка что на главной стр есть вопрос\n{textQuestion}")
    public MainPage checkQuestion(SelenideElement elementQuestion, String textQuestion)
    {
        elementQuestion
                .scrollIntoView(true)
                .shouldHave(exactText(textQuestion));
        return this;
    }

    @Step("Клик по кнопе с вопросом")
    public MainPage clickQuestion(SelenideElement elementQuestion)
    {
        elementQuestion.click();
        return this;
    }

    @Step("Проверка что есть ответ на вопрос\n{textAnswer}")
    public MainPage checkAnswer(SelenideElement elementAnswer, String textAnswer)
    {
        elementAnswer
                .scrollIntoView(true)
                .shouldHave(exactText(textAnswer));
        return this;
    }
}
