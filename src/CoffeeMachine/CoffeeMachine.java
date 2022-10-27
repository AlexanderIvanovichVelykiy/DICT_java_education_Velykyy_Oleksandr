package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public int milk, water, beans, cups, money;
    public  CoffeeMachine(){
        milk = 500;
        water = 2000;
        beans = 300;
        cups =  20;
        money = 0;
    }
    public void buy(){
       System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
       Scanner coffee = new Scanner(System.in);
       int choice = coffee.nextInt();
        switch (choice) {
            case 1 -> espresso();
            case 2 -> latte();
            case 3 -> capuccino();
        }
    }

    public void espresso(){
      Scanner espresso = new Scanner(System.in);
      System.out.println("How many cups you want?");
      int cup = espresso.nextInt();
        water = water - (250*cup);
        beans = beans - (16*cup);
        cups = cups - cup;
        money = (money + 4)*cup;
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Beans: "+ beans);
        System.out.println("Cups: "+ cups);
        System.out.println("Money: "+ money);

    }
    public  void capuccino(){
        Scanner espresso = new Scanner(System.in);
        System.out.println("How many cups you want?");
        int cup = espresso.nextInt();
        milk = milk - (100*cup);
        water = water - (200*cup);
        beans = beans - (12*cup);
        cups = cups - cup;
        money = (money + 6)*cup;
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Beans: "+ beans);
        System.out.println("Cups: "+ cups);
        System.out.println("Money: "+ money);
    }
    public  void latte(){
        Scanner espresso = new Scanner(System.in);
        System.out.println("How many cups you want?");
        int cup = espresso.nextInt();
        milk = milk - (75*cup);
        water = water - (360*cup);
        beans = beans - (20*cup);
        cups = cups - cup;
        money = (money + 7)*cup;
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Beans: "+ beans);
        System.out.println("Cups: "+ cups);
        System.out.println("Money: "+ money);
    }



    public static void main(String[] args) {
        CoffeeMachine cof = new CoffeeMachine();
        System.out.println("The coffee machine has:\n"+ cof.milk +" milk \n"+ cof.water+ " water\n"+ cof.beans+" beans\n"+ cof.cups+ " cups\n"+ cof.money+" money");
        while (true){
        Scanner action = new Scanner(System.in);
        System.out.println("Write action (1.buy, 2.fill, 3.take, 4.exit):");
        int act = action.nextInt();
            switch (act) {
                case 1 -> cof.buy();
                case 2 -> {
                    Scanner add = new Scanner(System.in);
                    System.out.println("How many milk you want?");
                    int add_milk = add.nextInt();
                    cof.milk = cof.milk + add_milk;
                    System.out.println("How many water you want?");
                    int add_water = add.nextInt();
                    cof.milk = cof.milk + add_water;
                    System.out.println("How many beans you want?");
                    int add_beans = add.nextInt();
                    cof.milk = cof.milk + add_beans;
                    System.out.println("How many cups you want?");
                    int add_cups = add.nextInt();
                    cof.milk = cof.milk + add_cups;
                }
                case 3 -> {
                    System.out.println(cof.money);
                    cof.money = 0;
                }
            }
        if(act == 4){
            break;
        }
        }
    }
}
