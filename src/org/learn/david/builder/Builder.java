package org.learn.david.builder;

import java.time.LocalDateTime;
import java.util.Date;

public interface Builder {
    void setName(String name);
    void setRegistrationDate(LocalDateTime registrationDate);
    void setCoins(int coins);
    void setAccess(String access);
}
