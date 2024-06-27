package com.example.web;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.example.constants.ConstColor.BLACK;
import static com.example.constants.ConstColor.GRAY;
import static com.example.constants.ConstOrderText.*;

public class CreateOrderSecondPage
{
    private final SelenideElement textInOrderSecondPage = $(byClassName("Order_Header__BZXOb"));
    private final SelenideElement deliveryDateField = $(byXpath(".//input[@placeHolder = '* Когда привезти самокат']"));
    private final SelenideElement rentalPeriodField = $(byXpath(".//div[text() = '* Срок аренды']"));
    private final SelenideElement blackColorCheckBox = $(byId("black"));
    private final SelenideElement greyColorCheckBox = $(byId("grey"));
    private final SelenideElement commentField = $(byXpath(".//input[@placeHolder = 'Комментарий для курьера']"));
    private final SelenideElement orderButton = $(byXpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
    private final SelenideElement textCheckCreateOrder = $(byClassName("Order_ModalHeader__3FDaJ"));
    private final SelenideElement yesButtonForCreateOrder = $(byXpath(".//button[text()='Да']"));
    private final SelenideElement textOrderCreated = $(byClassName("Order_ModalHeader__3FDaJ"));

    @Step("Провека что открылась вторая стр. оформления заказа")
    public CreateOrderSecondPage checkOrderSecondPage()
    {
        textInOrderSecondPage.shouldHave(text(TEXT_IN_ORDER_SECOND_PAGE));
        return this;
    }

    @Step("Ввод даты доставки {deliveryDate}")
    public CreateOrderSecondPage enterDeliveryDate(String deliveryDate)
    {
        deliveryDateField.setValue(deliveryDate);
        return this;
    }

    @Step("Выбор периода аренды {rentalPeriod}")
    public CreateOrderSecondPage chooseRentalPeriod(String rentalPeriod)
    {
        textInOrderSecondPage.click();
        rentalPeriodField.click();
        $(byXpath(".//div[text () = '"+rentalPeriod+"']")).scrollIntoView(true).click();
        return this;
    }

    @Step("Выбор первого цвета {firstColor}")
    public CreateOrderSecondPage chooseFirstColor(String firstColor)
    {
        switch (firstColor)
        {
            case BLACK:
                blackColorCheckBox.click();
                break;
            case GRAY:
                greyColorCheckBox.click();
                break;

        }
        return this;
    }

    @Step("Выбор второго цвета {secondColor}")
    public CreateOrderSecondPage chooseSecondColor(String secondColor)
    {
        switch (secondColor)
        {
            case BLACK:
                blackColorCheckBox.click();
                break;
            case GRAY:
                greyColorCheckBox.click();
                break;

        }
        return this;
    }

    @Step("Метод проверки, что при указании 2ух одинаковых цветов в чекбокс с выбором цвета ставится и снимается галка.\n" +
            "Выбранные цвета: первый цвет: {firstColor}, второй цвет: {secondColor}")
    public CreateOrderSecondPage checkEmptyColorBox(String firstColor, String secondColor)
    {
        if (firstColor.equals(secondColor) && firstColor.equals(BLACK))
        {
            blackColorCheckBox.should(not(selected));
        } else if (firstColor.equals(secondColor) && firstColor.equals(GRAY))
        {
            greyColorCheckBox.should(not(selected));
        }
        return this;
    }

    @Step("Метод проверки, что черный цвет был выбран")
    public CreateOrderSecondPage checkAddBlackColorBox(String firstColor, String secondColor)
    {
        if(!firstColor.equals(secondColor) && (firstColor.equals(BLACK) || secondColor.equals(BLACK)))
        {
            blackColorCheckBox.should(selected);
        }
        return this;
    }

    @Step("Метод проверки, что серый цвет был выбран")
    public CreateOrderSecondPage checkAddGrayColorBox(String firstColor, String secondColor)
    {
        if (!firstColor.equals(secondColor) && (firstColor.equals(GRAY) || secondColor.equals(GRAY)))
        {
            greyColorCheckBox.should(selected);
        }
        return this;
    }


    @Step("Ввели комментарий {comment}")
    public CreateOrderSecondPage enterComment(String comment)
    {
        commentField.setValue(comment);
        return this;
    }

    @Step("Клик по кнопке заказать")
    public CreateOrderSecondPage clickOrderButton()
    {
        orderButton.click();
        return this;
    }

    @Step("Проверка что окно Хотите оформить заказ? открылось")
    public CreateOrderSecondPage checkConfirmOrderWindow()
    {
        textCheckCreateOrder.shouldHave(exactText(TEXT_WANNA_CONTINUE_ORDER));
        return this;
    }

    @Step("Клик по кнопке ok в окне Хотите оформить заказ?")
    public CreateOrderSecondPage clickYesButtonToConfirmOrder()
    {
        yesButtonForCreateOrder.click();
        return this;
    }

    @Step("Проверка что окно Заказ оформлен открылось")
    public CreateOrderSecondPage checkTextOrderCreated()
    {
        textOrderCreated.shouldHave(text(TEXT_ORDER_CREATED));
        return this;
    }

    @Step("Получение номера заказа")
    public String getNumberOfOrder()
    {
        String text = textOrderCreated.getText();
        /*String test = text.replaceAll("[^0-9]", "");
        System.out.println(test);*/
        return text.replaceAll("[^0-9]", "");
    }
}