package org.learn.david.creational.singleton;

public class SingletonThreadSafeDemo {

    public static void main(String[] args) {
        Thread threadMySQL = new Thread( new ThreadMySQL());
        Thread threadPostgres = new Thread( new ThreadPostgres());
        threadMySQL.start();
        threadPostgres.start();
    }


    static class ThreadMySQL implements Runnable{

        @Override
        public void run() {
            Database database = Database.getInstance("MySQL");
            System.out.println(database.name);
        }
    }

    static class ThreadPostgres implements Runnable{

        @Override
        public void run() {
            Database database = Database.getInstance("Postgres");
            System.out.println(database.name);
        }
    }

}
