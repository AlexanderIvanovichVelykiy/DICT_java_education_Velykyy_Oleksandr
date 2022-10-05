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

    static void calculating() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int w = a.nextInt();
        int age = (x * 70 + y * 21 + w * 15) % 105;
        System.out.println("Your age is, " + age + " that is a good time to start programming!");
    }

    static void numbers(){
        System.out.println("Now I will prove to you that I can count to any number you want.");
        Scanner v = new Scanner(System.in);
        int i = v.nextInt();
        int n = 0;
        while(n <= i){
            System.out.println(n + "!");
            n++;
        }

    }
    static void test() {
        System.out.println("How many programming languages exist at the time this bot was created?");
        System.out.println("1. 52 \n2. 87 \n3. 253 \n4. 1000+");
        Scanner ans = new Scanner(System.in);
        int answer = ans.nextInt();
        if (answer == 3){
            System.out.println("You god damn right!");
        }
        else {
            System.out.println("try again!");
            test();
        }
    }
    public static void main(String[] args) {
        start();
        calculating();
        numbers();
        test();
    }
}
