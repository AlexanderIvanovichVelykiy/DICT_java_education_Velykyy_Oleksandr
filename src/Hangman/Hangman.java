package Hangman;
import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    static void anonce(){
        Scanner answer = new Scanner(System.in);
        String enter = answer.nextLine();
        if (Objects.equals(enter, "Java")){
            System.out.println("You survive!");
        }
        else {
            System.out.println("You lost!");
        }
    }
    public static void main(String[] args) {
        anonce();
    }
}
