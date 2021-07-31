package org.learn.david.creational.builder;

import java.time.LocalDateTime;

public interface Builder {
    void setName(String name);
    void setRegistrationDate(LocalDateTime registrationDate);
    void setCoins(int coins);
    void setAccess(String access);
}
