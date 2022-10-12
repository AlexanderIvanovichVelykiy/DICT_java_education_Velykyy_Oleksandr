package Hangman;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Hangman {
    public static void game() {
        ArrayList<String> var = new ArrayList<>();
        var.add("java");
        var.add("python");
        var.add("kotlin");
        var.add("c++");
        Random random = new Random();
        int randomIndex = random.nextInt(var.size());
        String answer = var.get(randomIndex);
        int wl = answer.length();
        int a = wl - 2;
        System.out.println(answer.substring(0, 2) + " and "+ a + " symbols more");
        Scanner user = new Scanner(System.in);
        String enter = user.nextLine();
        if(Objects.equals(enter, answer)){
            System.out.println("You survive!");
        }
        else {
            System.out.println("You lost!");
        }
    }
    public static void main(String[] args) {
        game();
    }
}
