package org.learn.david.builder;

import java.time.LocalDateTime;
import java.util.Date;

public class UserBuilder implements Builder{
    private String name;
    private LocalDateTime registrationDate;
    private int coins;
    private String access;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public void setCoins(int coins) {
        this.coins = coins;
    }

    @Override
    public void setAccess(String access) {
        this.access = access;
    }

    public User getResult(){
        return new User(name,registrationDate,coins,access);
    }
}
