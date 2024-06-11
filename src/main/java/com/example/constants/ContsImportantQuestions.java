package com.example.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ContsImportantQuestions
{
    public static final SelenideElement ELEMENT_QUESTION_HOW_MUCH_IT_COST = $(byId("accordion__heading-0"));
    public static final String TEXT_QUESTION_HOW_MUCH_IT_COST = "Сколько это стоит? И как оплатить?";
    public static final SelenideElement ELEMENT_ANSWER_HOW_MUCH_IT_COST = $(byId("accordion__panel-0"));
    public static final String TEXT_ANSWER_HOW_MUCH_IT_COST = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    public static final SelenideElement ELEMENT_QUESTION_I_WANNA_SEVERAL_SAMOKAT = $(byId("accordion__heading-1"));
    public static final String TEXT_QUESTION_I_WANNA_SEVERAL_SAMOKAT = "Хочу сразу несколько самокатов! Так можно?";
    public static final SelenideElement ELEMENT_ANSWER_I_WANNA_SEVERAL_SAMOKAT = $(byId("accordion__panel-1"));
    public static final String TEXT_ANSWER_I_WANNA_SEVERAL_SAMOKAT = "Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    public static final SelenideElement ELEMENT_QUESTION_HOW_RENTAL_PERIOD_CALCULATED = $(byId("accordion__heading-2"));
    public static final String TEXT_QUESTION_HOW_RENTAL_PERIOD_CALCULATED = "Как рассчитывается время аренды?";
    public static final SelenideElement ELEMENT_ANSWER_HOW_RENTAL_PERIOD_CALCULATED = $(byId("accordion__panel-2"));
    public static final String TEXT_ANSWER_HOW_RENTAL_PERIOD_CALCULATED = "Допустим, вы оформляете заказ на 8 мая. " +
            "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, " +
            "когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, " +
            "суточная аренда закончится 9 мая в 20:30.";

    public static final SelenideElement ELEMENT_QUESTION_CAN_I_ORDER_SCOOTER_TODAY = $(byId("accordion__heading-3"));
    public static final String TEXT_QUESTION_CAN_I_ORDER_SCOOTER_TODAY = "Можно ли заказать самокат прямо на сегодня?";
    public static final SelenideElement ELEMENT_ANSWER_CAN_I_ORDER_SCOOTER_TODAY = $(byId("accordion__panel-3"));
    public static final String TEXT_ANSWER_CAN_I_ORDER_SCOOTER_TODAY = "Только начиная с завтрашнего дня. " +
            "Но скоро станем расторопнее.";

    public static final SelenideElement ELEMENT_QUESTION_CAN_I_EXTEND_ORDER = $(byId("accordion__heading-4"));
    public static final String TEXT_QUESTION_CAN_I_EXTEND_ORDER = "Можно ли продлить заказ или вернуть самокат раньше?";
    public static final SelenideElement ELEMENT_ANSWER_CAN_I_EXTEND_ORDER = $(byId("accordion__panel-4"));
    public static final String TEXT_ANSWER_CAN_I_EXTEND_ORDER = "Пока что нет! Но если что-то срочное — всегда можно " +
            "позвонить в поддержку по красивому номеру 1010.";

    public static final SelenideElement ELEMENT_QUESTION_DELIVERY_CHARGING = $(byId("accordion__heading-5"));
    public static final String TEXT_QUESTION_DELIVERY_CHARGING = "Вы привозите зарядку вместе с самокатом?";
    public static final SelenideElement ELEMENT_ANSWER_DELIVERY_CHARGING = $(byId("accordion__panel-5"));
    public static final String TEXT_ANSWER_DELIVERY_CHARGING = "Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    public static final SelenideElement ELEMENT_QUESTION_CAN_I_CANCEL_ORDER = $(byId("accordion__heading-6"));
    public static final String TEXT_QUESTION_CAN_I_CANCEL_ORDER = "Можно ли отменить заказ?";
    public static final SelenideElement ELEMENT_ANSWER_CAN_I_CANCEL_ORDER = $(byId("accordion__panel-6"));
    public static final String TEXT_ANSWER_CAN_I_CANCEL_ORDER = "Да, пока самокат не привезли. Штрафа не будет, " +
            "объяснительной записки тоже не попросим. Все же свои.";

    public static final SelenideElement ELEMENT_QUESTION_I_LIVE_OUT_MKAD = $(byId("accordion__heading-7"));
    public static final String TEXT_QUESTION_I_LIVE_OUT_MKAD = "Я жизу за МКАДом, привезёте?";
    public static final SelenideElement ELEMENT_ANSWER_I_LIVE_OUT_MKAD = $(byId("accordion__panel-7"));
    public static final String TEXT__ANSWER_I_LIVE_OUT_MKAD = "Да, обязательно. Всем самокатов! И Москве, " +
            "и Московской области.";
}
