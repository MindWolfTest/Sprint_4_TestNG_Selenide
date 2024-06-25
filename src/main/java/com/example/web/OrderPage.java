package com.example.web;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage
{
    private final SelenideElement orderNotFound = $(byXpath(".//img[@alt = 'Not found']"));

    public OrderPage checkWrongOderMessage()
    {
        orderNotFound.should(visible);
        return this;
    }
}
