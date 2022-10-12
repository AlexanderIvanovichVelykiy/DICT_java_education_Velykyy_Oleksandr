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
        var.add("C#");
        Random random = new Random();
        int randomIndex = random.nextInt(var.size());
        String answer = var.get(randomIndex);
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
