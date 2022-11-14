package CoffeeMachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine(20, 2000, 1500, 150, 0);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String act = input.nextLine();
        while (!act.equals("exit")) {
            machine.output(act);
            act = input.nextLine();
        }
    }
}