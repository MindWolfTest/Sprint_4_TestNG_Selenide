package com.example;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Generator
{
    Faker faker = new Faker(Locale.forLanguageTag("ru"));

    public String getFirstName()
    {
        return faker.name().firstName();
    }

    public String getLastName()
    {
        return faker.name().lastName();
    }

    public String getAddress()
    {
        return faker.address().streetAddress();
    }

    public String getPhoneNumber()
    {
        return faker.bothify("+7#########");
    }

    public String getDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(faker.date().birthday());
    }
}
