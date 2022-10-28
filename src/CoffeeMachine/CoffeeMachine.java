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
      while (true) {
          Scanner espresso = new Scanner(System.in);
          System.out.println("You want latte? (press 'back' if not or press any button if you want)");
          String yon = espresso.nextLine();
          if (yon.equals("back")) {
             break;
          }
          System.out.println("How many cups you want?");
          int cup = espresso.nextInt();
          water = water - (250 * cup);
          if(water < 0){
              System.out.println("Enough water");
              water = water + (250 * cup);
              break;
          }
          beans = beans - (16 * cup);
          if(beans < 0){
              System.out.println("Enough beans");
              beans = beans + (16 * cup);
              break;
          }
          cups = cups - cup;
          if(cups < 0){
              System.out.println("Enough cups");
              cups = cups + cup;
              break;
          }
          money = (money + 4) * cup;
          System.out.println("Milk: " + milk);
          System.out.println("Water: " + water);
          System.out.println("Beans: " + beans);
          System.out.println("Cups: " + cups);
          System.out.println("Money: " + money);
          break;
      }
    }
    public  void capuccino(){
        while (true){
        Scanner capuccino = new Scanner(System.in);
        System.out.println("You want cappuccino? (press 'back' if not or press any button if you want)");
        String yon = capuccino.nextLine();
        if(yon.equals("back")){
            break;
        }
        System.out.println("How many cups you want?");
        int cup = capuccino.nextInt();
        milk = milk - (100*cup);
            if(milk < 0){
                System.out.println("Enough milk");
                milk = milk + (100*cup);
                break;
            }
        water = water - (200*cup);
            if(water < 0){
                System.out.println("Enough water");
                water = water + (200*cup);
                break;
            }
        beans = beans - (12*cup);
            if(beans < 0){
                System.out.println("Enough beans");
                beans = beans + (12*cup);
                break;
            }
        cups = cups - cup;
            if(cups < 0){
                System.out.println("Enough cups");
                cups = cups + cup;
                break;
            }
        money = (money + 6)*cup;
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Beans: "+ beans);
        System.out.println("Cups: "+ cups);
        System.out.println("Money: "+ money);
        break;
    }
    }
    public  void latte(){
        while (true){
        Scanner latte = new Scanner(System.in);
        System.out.println("You want latte? (press 'back' if not or press any button if you want)");
        String yon = latte.nextLine();
        if (yon.equals("back")){
            break;
        }
        System.out.println("How many cups you want?");
        int cup = latte.nextInt();
        milk = milk - (75*cup);
            if(milk < 0){
                System.out.println("Enough milk");
                milk = milk + (75*cup);
                break;
            }
        water = water - (360*cup);
            if(water < 0){
                System.out.println("Enough water");
                water = water + (360*cup);
                break;
            }
        beans = beans - (20*cup);
            if(beans < 0){
                System.out.println("Enough beans");
                beans = beans + (20*cup);
                break;
            }
        cups = cups - cup;
            if(cups < 0){
                System.out.println("Enough cups");
                cups = cups + cup;
                break;
            }
        money = (money + 7)*cup;
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Beans: "+ beans);
        System.out.println("Cups: "+ cups);
        System.out.println("Money: "+ money);
        break;
    }
    }
    public static void main(String[] args) {
        CoffeeMachine cof = new CoffeeMachine();
        System.out.println("The coffee machine has:\n"+ cof.milk +" milk \n"+ cof.water+ " water\n"+ cof.beans+" beans\n"+ cof.cups+ " cups\n"+ cof.money+" money");
        while (true){
        Scanner action = new Scanner(System.in);
        System.out.println("Write action (1.buy, 2.fill, 3.take, 4.remaining , 5.exit):");
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
                    cof.water = cof.water + add_water;
                    System.out.println("How many beans you want?");
                    int add_beans = add.nextInt();
                    cof.beans = cof.beans + add_beans;
                    System.out.println("How many cups you want?");
                    int add_cups = add.nextInt();
                    cof.cups = cof.cups + add_cups;
                }
                case 3 -> {
                    System.out.println(cof.money);
                    cof.money = 0;
                }
                case 4 -> {
                    System.out.println("milk:");
                    System.out.println(cof.milk);
                    System.out.println("water:");
                    System.out.println(cof.water);
                    System.out.println("beans:");
                    System.out.println(cof.beans);
                    System.out.println("cups:");
                    System.out.println(cof.cups);
                    System.out.println("money:");
                    System.out.println(cof.money);
                }
            }
        if(act == 5){
            break;
        }
        }
    }
}
