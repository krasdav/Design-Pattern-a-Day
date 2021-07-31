package org.learn.david.creational.singleton;

public final class Database {

    private static volatile Database instance;
    public String name;

    private Database(String name){
        this.name = name;
    }

    public static Database getInstance(String name){
        Database result = instance;
        if( result != null){
            return result;
        }
        synchronized (Database.class){
            if( instance == null){
                instance = new Database(name);
            }
            return instance;
        }
    }
}
