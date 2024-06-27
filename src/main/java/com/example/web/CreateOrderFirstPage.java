package com.example.web;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.example.constants.ConstOrderText.TEXT_IN_ORDER_FIRST_PAGE;
import static com.example.constants.ConstUrl.URL_ORDER_PAGE;

public class CreateOrderFirstPage
{
    private final SelenideElement textInFirstOrderPage = $(byClassName("Order_Header__BZXOb"));
    private final SelenideElement firstNameField = $(byXpath(".//input[@placeholder = '* Имя']"));
    private final SelenideElement secondNameField = $(byXpath(".//input[@placeHolder = '* Фамилия']"));
    private final SelenideElement addressField = $(byXpath(".//input[@placeHolder = '* Адрес: куда привезти заказ']"));
    private final SelenideElement metroStationField = $(byXpath(".//input[@placeHolder = '* Станция метро']"));
    private final SelenideElement phoneNumberField = $(byXpath(".//input[@placeHolder = '* Телефон: на него позвонит курьер']"));
    private final SelenideElement buttonNext = $(byXpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
    private final SelenideElement acceptCookiesButton = $(byId("rcc-confirm-button"));



    @Step("Открыть первую страницу создания заказа")
    public CreateOrderFirstPage openOrderPage()
    {
        open(URL_ORDER_PAGE);
        return this;
    }

    @Step("Проверка, что первая страница создания заказа открылась")
    public CreateOrderFirstPage checkOpenOrderFirstPage()
    {
        textInFirstOrderPage.shouldHave(exactText(TEXT_IN_ORDER_FIRST_PAGE));
        return this;
    }

    @Step("Ввод имени {firstName}")
    public CreateOrderFirstPage enterFirstName(String firstName)
    {
        firstNameField.setValue(firstName);
        return this;
    }

    @Step("Ввод фамилии {secondName}")
    public CreateOrderFirstPage enterSecondName(String secondName)
    {
        secondNameField.setValue(secondName);
        return this;
    }

    @Step("Ввод адреса {address}")
    public CreateOrderFirstPage enterAddressField(String address)
    {
        addressField.setValue(address);
        return this;
    }

    @Step("Ввод станции метро {metroStation}")
    public CreateOrderFirstPage chooseMetroStation(String metroStation)
    {
        metroStationField.click();
        $(byXpath(".//button/div[text()='"+metroStation+"']")).scrollIntoView(true).click();
        return this;
    }

    @Step("Ввод телефона {phoneNumber}")
    public CreateOrderFirstPage enterPhoneNumber(String phoneNumber)
    {
        phoneNumberField.setValue(phoneNumber);
        return this;
    }

    @Step("Клик по кнопке принять куки")
    public CreateOrderFirstPage clickAcceptCookies()
    {
        acceptCookiesButton.click();
        return this;
    }

    @Step("Клик по кнопке переход на следующую стр. оформления заказа")
    public CreateOrderFirstPage clickNextButton()
    {
        buttonNext.scrollIntoView(true).click();
        return this;
    }

}
