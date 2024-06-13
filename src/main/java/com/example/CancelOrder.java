package com.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CancelOrder
{
    private final SelenideElement buttonViewStatus = $(byXpath(".//button[text() = 'Посмотреть статус']"));
    private final SelenideElement name = $(byClassName("Track_Title__1XfhB"));
    private final SelenideElement buttonCancelOrder =
            $(byXpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']"));

    public CancelOrder openCreatedOrderPage()
    {
        buttonViewStatus.click();
        return this;
    }

    public CancelOrder checkOpenCreatedOrderPage()
    {
        name.shouldHave(exactText("Имя"));
        return this;
    }

    public CancelOrder clickCancelOrderButton()
    {
        buttonCancelOrder
                .scrollIntoView(true)
                .click();
        return this;
    }
}
