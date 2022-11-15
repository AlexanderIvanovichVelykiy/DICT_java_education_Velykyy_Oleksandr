package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public int milk, water, beans, cups, money;
    public void output(String act){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        switch (act) {
            case "buy" -> buy();
            case "fill" -> {
                Scanner add = new Scanner(System.in);
                System.out.println("How many milk you want?");
                int add_milk = add.nextInt();
                milk = milk + add_milk;
                System.out.println("How many water you want?");
                int add_water = add.nextInt();
                water = water + add_water;
                System.out.println("How many beans you want?");
                int add_beans = add.nextInt();
                beans = beans + add_beans;
                System.out.println("How many cups you want?");
                int add_cups = add.nextInt();
                cups = cups + add_cups;
            }
            case "take" -> take();
            case "remaining" -> {System.out.println("milk:");
                System.out.println(milk);
                System.out.println("water:");
                System.out.println(water);
                System.out.println("beans:");
                System.out.println(beans);
                System.out.println("cups:");
                System.out.println(cups);
                System.out.println("money:");
                System.out.println(money);}
            default -> System.out.println("ERROR");
        }
    }

    private void buy(){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        String answer = input.nextLine();
        switch (answer) {
            case "1" -> espresso();
            case "2" -> latte();
            case "3" -> cappuccino();
            case "back" -> System.out.println(" ");
            default -> System.out.println("ERROR");
        }
    }

    public CoffeeMachine(int cups, int water, int milk, int coffee, int money){
        this.cups = cups;
        this.water = water;
        this.milk = milk;
        this.beans = coffee;
        this.money = money;
    }

    private void espresso(){
        Scanner esspresso = new Scanner(System.in);
        System.out.println("How many cups you want?");
        int cup = esspresso.nextInt();
        if (make_coffee(250, 0, 16).equals("has")){
            cups -= cup*1;
            water -= cup*250;
            beans -= cup*16;
            money += cup*4;
            System.out.println("I have enough resources, making you a espresso!");
        }else
            System.out.printf("%s\n", make_coffee(250, 0, 16));
    }

    private void latte(){
        Scanner latte = new Scanner(System.in);
        System.out.println("How many cups you want?");
        int cup = latte.nextInt();
        if (make_coffee(350, 75, 20).equals("has")) {
            cups -= cup*1;
            water -= cup*350;
            milk -= cup*75;
            beans -= cup*20;
            money += cup*7;
            System.out.println("I have enough resources, making you a latte!");
        }else
            System.out.printf("%s\n", make_coffee(350, 75, 20));
    }

    private void cappuccino(){
        Scanner cappuccino = new Scanner(System.in);
        System.out.println("How many cups you want?");
        int cup = cappuccino.nextInt();
        if (make_coffee(200, 100, 12).equals("has")) {
            cups -= cup*1;
            water -= cup*200;
            milk -= cup*100;
            beans -= cup*12;
            money += cup*6;
            System.out.println("I have enough resources, making you a cappuccino!");
        }else
            System.out.printf("%s\n", make_coffee(200, 100, 12));
    }

    private void take(){
        System.out.println(money);
        money = 0;
    }

    private String make_coffee(int wt, int mlk, int cfe){
        String isHasSours = "has";
        if (water < wt)
            isHasSours = "Sorry, not enough water!";
        else if (milk < mlk) {
            isHasSours = "Sorry, not enough milk!";
        } else if (beans < cfe) {
            isHasSours = "Sorry, not enough coffee beans!";
        } else if (cups - 1 < 0) {
            isHasSours = "Sorry, not enough disposable cups!";
        } return isHasSours;
    }
}