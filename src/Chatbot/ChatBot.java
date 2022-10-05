package Chatbot;
import java.util.Scanner;

public class ChatBot {
    static void start(){
        System.out.println("Hello! My name is Mister Bomabass Dombass.");
        System.out.println("I was created in 2022.");
        Scanner var = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, "+  var.nextLine());
    }

    private static void calculating() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int w = a.nextInt();
        int age = (x * 70 + y * 21 + w * 15) % 105;
        System.out.println("Your age is, " + age + " that is a good time to start programming!");
    }

    public static void main(String[] args) {
        start();
        calculating();
    }
}
