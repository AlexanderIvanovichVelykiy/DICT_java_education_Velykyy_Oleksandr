package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void calculating(){
        Scanner cups = new Scanner(System.in);
        int chyslo = cups.nextInt();
        int milk = 50 * chyslo;
        int beans = 15 * chyslo;
        int water = 200 * chyslo;
        System.out.println("For " +chyslo+  " cups of coffee you will need:\n"+ milk + " ml of milk\n"+ water+ " ml of water\n"+beans+" g of coffee beans");

    }
    public static void main(String[] args) {
      calculating();
    }
}
