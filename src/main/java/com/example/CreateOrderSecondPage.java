package com.example;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.example.constants.ConstColor.BLACK;
import static com.example.constants.ConstColor.GRAY;
import static com.example.constants.ConstOrderText.TEXT_IN_ORDER_SECOND_PAGE;

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

    public CreateOrderSecondPage checkOrderSecondPage()
    {
        textInOrderSecondPage.shouldHave(text(TEXT_IN_ORDER_SECOND_PAGE));
        return this;
    }

    public CreateOrderSecondPage enterDeliveryDate(String deliveryDate)
    {
        deliveryDateField.setValue(deliveryDate);
        return this;
    }

    public CreateOrderSecondPage chooseRentalPeriod(String rentalPeriod)
    {
        textInOrderSecondPage.click();
        rentalPeriodField.click();
        $(byXpath(".//div[text () = '"+rentalPeriod+"']")).scrollIntoView(true).click();
        return this;
    }

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

    public CreateOrderSecondPage checkAddBlackColorBox(String firstColor, String secondColor)
    {
        if(!firstColor.equals(secondColor) && (firstColor.equals(BLACK) || secondColor.equals(BLACK)))
        {
            blackColorCheckBox.should(selected);
        }
        return this;
    }

    public CreateOrderSecondPage checkAddGrayColorBox(String firstColor, String secondColor)
    {
        if (!firstColor.equals(secondColor) && (firstColor.equals(GRAY) || secondColor.equals(GRAY)))
        {
            greyColorCheckBox.should(selected);
        }
        return this;
    }


    public CreateOrderSecondPage enterComment(String comment)
    {
        commentField.setValue(comment);
        return this;
    }

    public CreateOrderSecondPage clickOrderButton()
    {
        orderButton.click();
        return this;
    }

    public CreateOrderSecondPage checkConfirmOrderWindow()
    {
        textCheckCreateOrder.shouldHave(exactText("Хотите оформить заказ?"));
        return this;
    }

    public CreateOrderSecondPage clickYesButtonToConfirmOrder()
    {
        yesButtonForCreateOrder.click();
        return this;
    }

    public CreateOrderSecondPage checkTextOrderCreated()
    {
        textOrderCreated.shouldHave(text("Заказ оформлен"));
        return this;
    }

    public String getNumberOfOrder()
    {
        String text = textOrderCreated.getText();
        //System.out.println(test);
        return text.replaceAll("[^0-9]", "");
    }
}
