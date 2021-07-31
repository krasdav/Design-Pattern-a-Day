package org.learn.david.creational.builder;

import java.time.LocalDateTime;

public class UserInfo {
    private String name;
    private LocalDateTime registrationDate;
    private int coins;
    private String access;

    public UserInfo(String name, LocalDateTime registrationDate, int coins, String access) {
        this.name = name;
        this.registrationDate = registrationDate;
        this.coins = coins;
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public int getCoins() {
        return coins;
    }

    public String getAccess() {
        return access;
    }
}
