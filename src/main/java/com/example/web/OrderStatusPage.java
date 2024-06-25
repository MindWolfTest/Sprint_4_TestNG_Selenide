package com.example.web;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OrderStatusPage
{
    private final SelenideElement buttonViewStatus = $(byXpath(".//button[text() = 'Посмотреть статус']"));
    private final SelenideElement name = $(byClassName("Track_Title__1XfhB"));
    private final SelenideElement buttonCancelOrder =
            $(byXpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']"));
    private final SelenideElement buttonCancel =
            $(byXpath(".//button[text() = 'Отменить']"));

    private final SelenideElement textOrderCancel = $(byClassName("Order_ModalHeader__3FDaJ"));
    private final SelenideElement buttonOk = $(byXpath(".//button[text() = 'Хорошо']"));

    public OrderStatusPage openCreatedOrderPage()
    {
        buttonViewStatus.click();
        return this;
    }

    public OrderStatusPage checkOpenCreatedOrderPage()
    {
        name.shouldHave(exactText("Имя"));
        return this;
    }

    public OrderStatusPage clickCancelOrderButton()
    {
        buttonCancelOrder
                .scrollIntoView(true)
                .click();
        return this;
    }

    public OrderStatusPage clickCancelButton()
    {
        buttonCancel.click();
        return this;
    }

    public OrderStatusPage checkTextOrderCancel()
    {
        textOrderCancel.shouldHave(text("Заказ отменён"));
        return this;
    }

    public OrderStatusPage clickButtonOk()
    {
        buttonOk.click();
        return this;
    }

}
