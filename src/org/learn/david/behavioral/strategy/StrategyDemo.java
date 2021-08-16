package org.learn.david.behavioral.strategy;

import java.util.Scanner;

public class StrategyDemo {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("---For exit type: 'exit'--");
            System.out.println("Message to send:");
            String message = in.nextLine();
            if( message.equals("exit")){
                break;
            }
            System.out.println("1.Email");
            System.out.println("2.SMS");
            int choice = in.nextInt();
            if(choice == 1){
                new Message(new Email()).send(message);
            }else{
                new Message(new Sms()).send(message);
            }
        }
    }

}
