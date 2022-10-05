package Chatbot;
import java.util.Scanner;

public class ChatBot {
    static void first(){
        System.out.println("Hello! My name is Mister Bomabass Dombass.");
        System.out.println("I was created in 2022.");
        Scanner var = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, "+  var.nextLine());
    }
    public static void main(String[] args) {
        first();
    }
}
