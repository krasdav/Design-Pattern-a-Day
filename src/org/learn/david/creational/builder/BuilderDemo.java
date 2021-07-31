package org.learn.david.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Director director = new Director();

        // comes from client
        UserBuilder builder = new UserBuilder();

        director.buildGodUser(builder);

        User user = builder.getResult();
        System.out.println("User built with acces: " + user.getAccess());

        UserInfoBuilder infoBuilder = new UserInfoBuilder();

        director.buildSuperUser(infoBuilder);

        UserInfo userInfo = infoBuilder.getResult();

        System.out.println("User info built with access : " + userInfo.getAccess());

    }
}
