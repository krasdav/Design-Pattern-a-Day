package org.learn.david.creational.builder;

import java.time.LocalDateTime;

public class Director {

    public void buildUser(Builder builder){
        builder.setName("new_user");
        builder.setAccess("regular");
        builder.setCoins(0);
        builder.setRegistrationDate(LocalDateTime.now());
    }

    public void buildSuperUser(Builder builder){
        builder.setName("new_super_user");
        builder.setAccess("super");
        builder.setCoins(200);
        builder.setRegistrationDate(LocalDateTime.now());
    }

    public void buildGodUser(Builder builder){
        builder.setName("GOD");
        builder.setAccess("devine");
        builder.setCoins(999);
        builder.setRegistrationDate(LocalDateTime.now());
    }
}
