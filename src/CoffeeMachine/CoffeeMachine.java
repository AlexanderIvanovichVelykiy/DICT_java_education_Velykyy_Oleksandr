package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void calculating(){
        Scanner ingridients = new Scanner(System.in);
        Scanner coffee = new Scanner(System.in);
        System.out.println("Milk");
        int milk = ingridients.nextInt();
        System.out.println("Water");
        int water = ingridients.nextInt();
        System.out.println("Beans");
        int beans = ingridients.nextInt();
        int m = milk/50;
        int w = water/200;
        int b = beans/15;
        int cup = (m+w+b)/3;
        System.out.println("Cups of coffee");
        int cups = coffee.nextInt();
        int more  = cup - cups;
        if(cup == cups){
            System.out.println("Yes i can make coffee for you!");
        }
        if(cup > cups){
            System.out.println("Yes i can make coffee for you! (and even "+ more +" more than that)");
        }
        if(cup < cups){
            System.out.println("No, i can make only " + cup +"  cups of coffee");
        }
    }
    public static void main(String[] args) {
      calculating();
    }
}
